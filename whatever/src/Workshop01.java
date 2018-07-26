
public class Workshop01 {

    public static void main(String[] args) {
        int a, b, c =0;
        a = c++;
        System.out.print(a);
        System.out.println(c);
        
        b = ++a;
        System.out.print(a);
        System.out.print(b);
        System.out.println(c);
        
        c++;
        System.out.print(a);
        System.out.print(b);
        System.out.println(c);
        
        b = ++c + a++;
        System.out.print(a);
        System.out.print(b);
        System.out.println(c);
        
        b = ++c + a--;
        System.out.print(a);
        System.out.print(b);
        System.out.println(c);
        
        b = c-- + --a;
        System.out.print(a);
        System.out.print(b);
        System.out.println(c);
        
        a = --b + c++;
        System.out.print(a);
        System.out.print(b);
        System.out.println(c);
    }

}
