public class Second6 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        double c = Math.sqrt(a*a + b*b);
        double perimeter = a + b + c;
        double area = (a*b)/2;
        System.out.println("Периметр трикутника: " + perimeter);
        System.out.println("Площа трикутника: " + area);
    }
}
