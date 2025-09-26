public class DatabaseRunner {

    public static void main(String[] args) {

        Database db = new Adapter();

        db.open();
        db.insert();
        db.update();
        db.delete();
        db.close();

    }

}