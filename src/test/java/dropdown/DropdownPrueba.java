package dropdown;

import base.baseprueba;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownPrueba extends baseprueba {
    @Test
    public void testSelectOption(){
        var dropDownPage = homePage.clickDropDown();
        String option="Option 1";
        dropDownPage.selectFromDropDown(option);
        var selectedOptions=dropDownPage.getSelectedOption();
        assertEquals(selectedOptions.size(), 1, "Incorrecto numero de seleccion");
        assertTrue(selectedOptions.contains(option), "Option not Selected");
    }

}
