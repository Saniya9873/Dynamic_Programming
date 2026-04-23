
public class Toh {

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        
        int n = 3;
        tOH(n, 'S', 'H', 'D');
        System.out.println(count);
    }
    static int count = 0;

    static int tOH(int n, char Source, char Helper, char Dest) {
        if (n == 1) {
            count++;
            return count;
        }
        tOH(n - 1, Source, Dest, Helper);
        count++;
        tOH(n - 1, Helper, Source, Dest);
        return count;
    }
}
