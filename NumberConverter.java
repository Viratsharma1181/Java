public class NumberConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer number: ");
        int decimalNumber = sc.nextInt();
        System.out.println("Binary representation: " + convertDecimalToBinary(decimalNumber));

        System.out.print("Enter a binary number: ");
        String binaryNumber = sc.next();
        System.out.println("Decimal representation: " + convertBinaryToDecimal(binaryNumber));
        
        sc.close();
    }
    
    public static String convertDecimalToBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }

    public static int convertBinaryToDecimal(String binaryNumber) {
        return Integer.parseInt(binaryNumber, 2);
    }
}
