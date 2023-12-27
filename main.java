import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 81 && a <= 100){
            System.out.println("отлично");
        }else if (a >= 69 && a <= 80) {
            System.out.println("хорошо");
        }else if (a >= 46 && a <= 68) {
            System.out.println("удовлетворительно");
        }else if (a >= 0 && a <= 45) {
            System.out.println("плохо");
        }
    }
}
