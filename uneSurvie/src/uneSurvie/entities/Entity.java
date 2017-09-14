package uneSurvie.entities;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import uneSurvie.utils.Direction;
import uneSurvie.utils.Handler;

public class Entity {
	
	private static Map<Integer, Entity> entities = new HashMap<Integer, Entity>();
	
	public static Entity getEntity( int id){
		return entities.get( id);
	}
	
	public void setEntity( int id, Entity e){
		if (entities.get( id) == null)
			entities.put( id, e);
		else
			entities.replace( id, e);
	}
	
	public boolean deleteEntity( int id){
		return entities.remove( id) != null;
	}
	
	protected float width;
	protected float height;
	protected float x;
	protected float y;
	protected Direction direction;
	protected int entityTypeId;
	protected List<Integer> index;
	
	protected Entity( int entityTypeId, float x, float y, float width, float height, Direction direction){
		this.entityTypeId = entityTypeId;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.direction = direction;
		index = new ArrayList<Integer>();
		int nb = Direction.getDirections().size();
		for (int i = 0; i < nb; i++)
			index.add( 0);
	}
	
	protected Entity( int entityTypeId, float x, float y, float width, float height){
		this( entityTypeId, x, y, width, height, Direction.DOWN);
	}
	
	protected Entity( int entityTypeId, float x, float y){
		this( entityTypeId, x, y, Entities.getEntities( entityTypeId).getDefaultWidth(), Entities.getEntities( entityTypeId).getDefaultHeight());
	}
	
	public void render( Graphics g, Handler handler){
		g.drawImage( Entities.getEntities( entityTypeId).getImage( direction, index.get( direction.index)),
				(int) ((x - handler.getXOffset()) * handler.getZoom()),
				(int) ((y - handler.getYOffset()) * handler.getZoom()),
				(int) (width * handler.getZoom()),
				(int) (height * handler.getZoom()),
				null);
	}

}
