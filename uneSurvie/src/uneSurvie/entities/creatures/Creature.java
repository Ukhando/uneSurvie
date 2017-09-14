package uneSurvie.entities.creatures;

import uneSurvie.entities.Entity;
import uneSurvie.utils.Direction;

public class Creature extends Entity{

	protected Creature( int entityTypeId, float x, float y, float width, float height, Direction direction) {
		super( entityTypeId, x, y, width, height, direction);
		
	}
	
	protected Creature( int entityTypeId, float x, float y, float width, float height) {
		super( entityTypeId, x, y, width, height);
		
	}
	
	protected Creature( int entityTypeId, float x, float y) {
		super( entityTypeId, x, y);
		
	}

}
