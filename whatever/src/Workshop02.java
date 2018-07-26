
public class Workshop02 {

    public static void main(String[] args) {
        int start = 9;
        // line 1
        for(int i = 0; i < 9; i++) {
            if(i == start/2 || i == 0 || i == 3 || i == 5 || i == 8 ) {
                System.out.print(" ");
            }else {
                System.out.print("*");
            }
        }
        newLine();
        // line 2
        for(int i = 0; i < 9; i++) {
            if(i == start/2) {
                System.out.print(" ");
            }else {
                System.out.print("*");
            }
        }
        newLine();
        // line 3
        for(int round = 0; round < 5; round++) {
            generateSpace(round);
            generateStar(start);
            newLine();
            start = start - 2;
        }
        // line 4
        // line 5
        // line 6
        // line 7
    }

    private static void newLine() {
        System.out.println();
    }

    private static void generateStar(int start) {
        for(int i = 0; i < start; i++) {
            System.out.print("*");
        }
    }

    private static void generateSpace(int round) {
        for(int a = 0; a < round; a++) {
            System.out.print(" ");
        }
    }

}
