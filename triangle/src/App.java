public class App {

    private static void about() {
        System.out.println("Nagy János");
        System.out.println("Budapest");
    }

    public static double calcArea(double base, double height) {
        return base * height / 2;
    }
    public static void main(String[] args) throws Exception {
        double area = calcArea(30,35);
        System.out.println("Terület: "+area);
        about();
    }

   
}
