public class App {
    public static void main(String[] args) throws Exception {
        String szoveg = "Még nyílnak a völgyben...";
        // System.out.println(szoveg.length());
        String szoveg2 = szoveg.replace("Még nyílnak a völgyben" , "Még kelnek a kocsmában");
        System.out.println(szoveg2);

        String nevek = "Lili Piri Eni";
        String[] tomb = nevek.split(" ");
        System.out.println(tomb[2]);

        String a = "alma";
        String b = "szilva";
        if (a.equals(b)) {
            System.out.println("Igen, alma");
        }
        else {
            System.out.println("Más");
        }

        StringBuilder sb  = new StringBuilder();
        sb.append("körte");
        String str = sb.toString();
        System.out.println(str);

        int kor = 35;
        String c = """
        alma
        körte
        barack %d
        szilva  
                """.formatted(kor);
        System.out.println(c);
        }
}
