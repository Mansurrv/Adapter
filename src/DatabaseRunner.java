public class Main {

    public static void main(String[] args) {

        Database db = null;

        db.open();
        db.insert();
        db.update();
        db.delete();
        db.close();

    }

}