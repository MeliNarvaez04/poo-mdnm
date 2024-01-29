public class Main {
    public static void main(String[] args) {
        printSquare(10);
        System.out.println("---------------------");
        printSquare(20);
        System.out.println("--------------");
        printTriangle(5);
        System.out.println("-----------");
        printTriangle(7);



    }
    public static void printSquare(int length){
        for(int i = 1; i <= length; i++){
            for (int m = 1; m <= length; m++){
                System.out.print(" * ");
            }
            System.out.print("\n");//   es para separar \//
            //System.out.print();
        }


    }
    public static void printTriangle(int base){
        for (int i = 0; i <= base - 1; i++){
            for (int m = 1 ; m <= i +1 ; m++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}