public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 79;
        double height = 1.81;
        int bmi = service.calkulate(80, 1.87);
        System.out.println(bmi);
    }
}
