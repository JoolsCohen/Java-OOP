package S07.Viewer;

/**
 * @apiNote Interface for the user to interact with the GUI
 */
public interface UserGUI {

    Double inputFirstValue();
    Double inputSecondValue();

    void simpleCalculatorMenu();

    void complexCalculatorMenu();

    void selectionButton();

    Double inputRealPartFirstValue ();

    Double inputImaginaryPartFirstValue ();

    Double inputRealPartSecondValue ();

    Double inputImaginaryPartSecondValue ();

}