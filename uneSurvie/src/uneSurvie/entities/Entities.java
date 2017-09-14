package uneSurvie.entities;

import java.awt.image.BufferedImage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import uneSurvie.utils.Direction;

public abstract class Entities {
	
	private static Map<Integer, Entities> entities = new HashMap<Integer, Entities>();
	
	public static Entities getEntities( int id){
		return entities.get( id);
	}
	
	private static void setEntities( int id, Entities e){
		entities.put( id, e);
	}
	
	
	
	private List<List<BufferedImage>> textures;
	private float defaultWidth;
	private float defaultHeight;
	
	protected Entities( int id, List<List<BufferedImage>> textures) throws Exception{
		if (textures.size() != 8)
			throw new Exception( "Invalide amount of textures");
		this.textures = textures;
		setEntities( id, this);
	}

	protected int getNbImages( Direction direction){
		return textures.get( direction.index).size();
	}
	
	protected BufferedImage getImage( Direction direction, int index){
		if (index >= 0 && index < getNbImages( direction))
			return textures.get( direction.index).get( index);
		return null;
	}
	
	protected float getDefaultWidth( ){
		return defaultWidth;
	}
	
	protected float getDefaultHeight( ){
		return defaultHeight;
	}
	
}
