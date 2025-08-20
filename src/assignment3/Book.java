package assignment3;

public  class Book extends Item {
    private String author;

    public Book(int id, String title, String author) {
        super(id, title);
        this.author = author;
    }

    @Override
    public void display() {
        System.out.println("Book: " + title + " by " + author + " [ID: " + id + "]");
    }

	@Override
	public void display1() {
		// TODO Auto-generated method stub
		
	}
}
