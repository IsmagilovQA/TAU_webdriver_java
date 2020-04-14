package dropdown;

import base.BaseTests;
import com.sun.deploy.util.OrderedHashSet;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption() {
        DropdownPage dropdownPage = homePage.clickDropDown();

        String option = "Option 1";
        dropdownPage.selectFromDropDown(option);
        List<String> selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }


    @Test
    public void testAddMultipleAttributeToDropdown() {

        DropdownPage dropDownPage = homePage.clickDropDown();
        dropDownPage.addMultipleAttribute();

        List<String> optionsToSelect = Arrays.asList("Option 1", "Option 2");
        optionsToSelect.forEach(dropDownPage::selectFromDropDown);

        List<String> selectedOptions = dropDownPage.getSelectedOptions();
        assertTrue(selectedOptions.containsAll(optionsToSelect), "All options were not selected");
        assertEquals(selectedOptions.size(), optionsToSelect.size(), "Number of selected items");
    }
}
