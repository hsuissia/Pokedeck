
public class Pokemon extends Card {
	private int hp;
	
	public Pokemon(String name, String description, String type, int hp){
		super(name, description,type);
		this.hp = hp;
	}
}
