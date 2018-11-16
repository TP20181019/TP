package tp.p1.objects;

public abstract class Plants extends GameObject{
	private int cost;
	
	public Plants (int x, int y) {
		super(x,y);
		this.cost = getCost(cost);
	}
	
	
	

	
}

