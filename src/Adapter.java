public class Adapter extends Laptop implements Database {
    @Override
    public void open() {
        System.out.println("Opening Database...");
    }

    @Override
    public void insert() {
        insertLabtopData();
    }

    @Override
    public void update() {
        updateLabtopData();
    }

    @Override
    public void delete() {
        deleteLabtopData();
    }

    @Override
    public void close() {
        System.out.println("Closing Database...");
    }
}
