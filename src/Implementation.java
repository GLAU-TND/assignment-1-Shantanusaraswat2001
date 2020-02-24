public class Implementation {
    public static void main(String[] args) {
        Methods M = new Methods();
        int choice;
        while (true) {
            choice = M.menu();

            switch (choice) {
                case 1:
                    M.insert();
                    break;
                case 2:
                    M.displayAll();
                    break;
                case 3:
                    M.search();
                    break;
                case 4:
                    M.delete();
                    break;
                case 5:
                    M.exit();
                    break;
            }
        }
    }
}