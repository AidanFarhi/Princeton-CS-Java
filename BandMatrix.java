
public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        for (int i = 0; i < n; i++) {
            String line = "";
            for (int j = 0; j < n; j++) {
                if (j >= i) {
                    if (j - width <= i) {
                        line += "*  ";
                    } else {
                        line += "0  ";
                    }
                } else {
                    if (j + width >= i) {
                        line += "*  ";
                    } else {
                        line += "0  ";
                    }
                }
            }
            System.out.println(line);
        }
    }
}
