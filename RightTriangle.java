public class RightTriangle {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        boolean isPositive1 = num1 > 0;
        boolean isPositive2 = num2 > 0;
        boolean isPositive3 = num3 > 0;
        boolean allArePositive = isPositive1 == true && isPositive2 == true && isPositive3 == true;
        boolean case1 = (num1 * num1) + (num2 * num2) == (num3 * num3);
        boolean case2 = (num2 * num2) + (num3 * num3) == (num1 * num1);
        boolean case3 = (num3 * num3) + (num1 * num1) == (num2 * num2);
        boolean finalCheck = allArePositive && case1 == true 
                          || allArePositive && case2 == true 
                          || allArePositive && case3 == true; 
        System.out.println(finalCheck);
    }
}