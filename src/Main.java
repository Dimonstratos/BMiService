import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 65;
        double height = 1.77;
        double mass = service.calculate(weight, height);
        String IndexMass = new DecimalFormat("#0").format(mass);
        System.out.println("Мой ИМТ = " + IndexMass);
    }
}