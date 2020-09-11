public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int stepCount = 1;
        System.out.println("(" + x + ", " + y + ")");
        while (Math.abs(x) + Math.abs(y) != r) {
            int direction = (int) (Math.random() * 4);
            if (direction == 0) {y++;} 
            else if (direction == 1) {x++;} 
            else if (direction == 2) {y--;} 
            else if (direction == 3) {x--;}
            System.out.println("(" + x + ", " + y + ")");
            stepCount++;
        }
        System.out.println("steps = " + stepCount);
    }
}
