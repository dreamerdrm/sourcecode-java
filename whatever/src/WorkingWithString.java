
public class WorkingWithString {

    public static void main(String[] args) {
        String name = "Chalita";
        int age = 24;
        String result = name + " " + age;
        System.out.println(result);
        
        String result2 = String.format("%s %d", name, age);
        System.out.println(result2);
        
        StringBuffer buffer = new StringBuffer();
        buffer.append(name).append(" ").append(age);
        System.out.println(buffer.toString());
        
        StringBuilder builder = new StringBuilder();
        builder.append(name).append(" ").append(age);
        System.out.println(builder.toString());
        
        System.out.println(name.concat(" 24 -"));
        
    }

}
