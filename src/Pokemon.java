
public class Pokemon extends Card {
	private int hp;
	private String type;
	
	public Pokemon(String name, String description, String type, int hp){
		super(name, description);
		this.hp = hp;
		this.type = type;
	}
}
