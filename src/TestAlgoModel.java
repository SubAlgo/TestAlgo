
public class TestAlgoModel {

    private int x, y;
    private String str="";

    public void calsum(int n) {

        x = n;
        y = n;

        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                str += Integer.toString(j) + " ";
            }
            y = y - 1;
            str += System.lineSeparator();
        }
    }
    
    public String getsum(){
        return str;
    }
    
    public void clearvalue(){
        str ="";
    }

}
