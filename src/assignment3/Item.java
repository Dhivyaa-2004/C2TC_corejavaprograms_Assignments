package assignment3;

public abstract class Item {
    protected int id;
    protected String title;

    public Item(int id, String title) {
        this.id = id;
        this.title = title;
    }

    // Abstract method to display item details
    public abstract void display1();

    // Common method to get title
    public String getTitle() {
        return title;
    }

	public void display() {
		// TODO Auto-generated method stub
		
	}
}
