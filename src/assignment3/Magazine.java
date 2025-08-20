package assignment3;

public  class Magazine extends Item {
    private int issueNumber;

    public Magazine(int id, String title, int issueNumber) {
        super(id, title);  // call parent constructor
        this.issueNumber = issueNumber;
    }

    @Override
    public void display() {
        System.out.println("Magazine: " + title + " Issue " + issueNumber + " [ID: " + id + "]");
    }

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		
	}
}

