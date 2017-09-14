package uneSurvie.entities.creatures;

public class CreatureState {

	public static final CreatureState DEFAULT = new CreatureState( 0);
	
	
	public final int index;
	
	private CreatureState( int index){
		this.index = index;
	}
}
