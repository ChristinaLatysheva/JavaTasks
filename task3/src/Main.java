public class Main {

    public static void main(String[] args) {
        Main resolve = new Main();
        resolve.solve(0,2,0);
    }

    private void solve(int _a, int _b, int _c){
        double a = (double) _a;
        double b = (double) _b;
        double c = (double) _c;
        if(a != 0) {
            double d = (b * b) - (4 * a * c);

            if (d < 0) {
                System.out.print("Вещественных решений нет");
            } else {
                if (d == 0) {
                    double x1 = -b / (2 * a);
                    System.out.println("x = " + x1);
                } else {
                    double x1 = (-b + Math.sqrt(d)) / (2 * a);
                    double x2 = (-b - Math.sqrt(d)) / (2 * a);
                    if (x1 == x2)
                        System.out.println("x1 = x2 " + x1);
                    else
                        System.out.println("x1 =  " + x1 + "  x2 = " + x2);
                }
            }
        } else if(b==0){
            System.out.println("Решений нет");
        } else {
            System.out.println("x = " + (double)(-c)/b);
        }
    }

}

