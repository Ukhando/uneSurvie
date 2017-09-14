package uneSurvie.utils;

import java.util.List;
import java.util.ArrayList;

public class Direction {
	
	public static final Direction UP = new Direction( 0);
	public static final Direction UPRIGHT = new Direction( 1);
	public static final Direction RIGHT = new Direction( 2);
	public static final Direction DOWNRIGHT = new Direction( 3);
	public static final Direction DOWN = new Direction( 4);
	public static final Direction DOWNLEFT = new Direction( 5);
	public static final Direction LEFT = new Direction( 6);
	public static final Direction UPLEFT = new Direction( 7);
	
	private static final Direction[] directions =  {UP, UPRIGHT, RIGHT, DOWNRIGHT, DOWN, DOWNLEFT, LEFT, UPLEFT};
	
	public static Direction getDirection( int index){
		if (index >= 0 && index < directions.length)
			return directions[index];
		return null;
	}
	
	public static List<Direction> getDirections( ){
		List<Direction> directionList = new ArrayList<Direction>();
		
		for (Direction d : directions)
			directionList.add( d);
		
		return directionList;
	}
	
	public final int index;
	
	private Direction( int index){
		this.index = index;
	}
	
}
