import java.util.Scanner;
public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        boolean close = false;
        double n = 10;
        double m = 3;
        int i=0;
        for(i=0;close==false;i++){
            if((Math.abs(x-(m*m)))<=0.00001){
                close=true;
            }else{
                m = (n+ x/n)/2;
                n=m;
            }
        }
        return n;
    }

    // Calculates the factorial of a number
    public static double factorial(double x) {
        int inp = (int) x;
        for(int i=(inp-1);i>0;i--){
            inp=inp*i;
        }
        if(inp==0){
            return 1.0;
        }else{
            return inp;
        }
           
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 (IT SAYS SONETHING DIFF IN README)
    // different from the value Math.E
    public static double calculateE() {
        double e=1;
        boolean close = false;
        for(int i=1;close==false;i++){
            if(2.718281828459045-e<0.00001){
                close=true;
            }else{
                e = e+(1/(factorial(i)));
                // Test Line --> System.out.println("i = "+i+". e right now = "+e);
            }
        }
        return e;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a positive number input...");
        double input = scan.nextDouble();
        System.out.println("The sqaureroot of " +input+" is roughly "+babylonian(input));
        System.out.println(input+" factorial is "+factorial(input));
        System.out.println("The constant E is roughly " +calculateE());   
        scan.close();
    }
}
