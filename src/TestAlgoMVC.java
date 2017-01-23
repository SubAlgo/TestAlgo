
public class TestAlgoMVC {


    public static void main(String args[]) {
        TestAlgoView theView = new TestAlgoView();
        TestAlgoModel theModel = new TestAlgoModel();
        TestAlgoController theController = new TestAlgoController(theView, theModel);

        theView.setVisible(true);

    }

}
