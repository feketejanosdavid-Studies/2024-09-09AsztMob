public class App {
    public static void main(String[] args) throws Exception {
        

        triangle tri = new triangle();
        double area = tri.calcArea(30,35);

        System.out.printf("%f\n", area);
    }
}
