public class BmiService {
    public int calkulate(int mass, double height) {
        int bmi = (int) (mass / (height * height));
        return bmi;
    }
}
