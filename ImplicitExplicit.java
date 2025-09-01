//program8
class ImplicitExplicit {

    public static void main(String[] args) {
        int a = 100;
        double b = 100.99;
        // implicit typecasting
        double A1 = a;
        System.out.println("Impliciting value from int to double:-" + A1);
        // explicit typecasting
        int B1 = (int) b;
        System.out.println("Expliciting Value from Double to int:-" + B1);
    }
}