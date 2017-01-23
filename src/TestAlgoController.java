import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TestAlgoController {
    private TestAlgoView theview ;
    private TestAlgoModel themodel ;
    
     
    //---Constructor Method สำหรับกำหนดค่าเริ่มต้น---
    public TestAlgoController(TestAlgoView theview,TestAlgoModel themodel){
        this.theview = theview;
        this.themodel = themodel;
        
        this.theview.btnEvent(new btnListener());
    }
    
    class btnListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String str;
            int num,sum;
            try{
                num = theview.getinput();
                themodel.calsum(num);
                str = themodel.getsum();
                themodel.clearvalue();
                
                theview.setshow(str);
                
            
                                
            }catch(NumberFormatException ex){
                System.out.println(ex);
               theview.displayErrorMessage("You need to enter 2 Integer");
            }
        }
        
    }
    
}
