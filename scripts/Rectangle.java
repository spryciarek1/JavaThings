public class Rectangle {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        String o = "";
        while(a>0){
            o += "o";
            a--;
        }
        while(b>0){
            System.out.println(o);
            b--;
        }
    }
}

