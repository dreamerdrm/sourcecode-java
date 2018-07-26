
public class WorkingWithLoop {

    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=10 ;i++) {
            sum = sum+i;
            System.out.println(sum);
        }
        int i = 0;
        while (i<5) {
            System.out.println(i);
            i++;
        }
        i=0;
        do {
            System.out.println(i);
            i++;
        }while(i<5);
    }

}
