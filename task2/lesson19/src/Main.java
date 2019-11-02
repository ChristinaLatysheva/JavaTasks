public class Main {

    public static void main(String[] args) {
	    double a = 3;
	    double b = 0;
	    double result = 0;
	    char operator = '+';


	    switch(operator){
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': result = a / b; break;

        }

        System.out.println(result);
    }
}
