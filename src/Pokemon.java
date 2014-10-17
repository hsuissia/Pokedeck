
public class Pokemon extends Carte {
	private int pv;
	private String type;
	
	public Pokemon(String nom, String description, String type, int pv){
		super(nom, description);
		this.pv = pv;
		this.type = type;
	}
}
