package pages;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class patient_Pages extends StartupPage {
	
// Write the required locators here


	String pageName = this.getClass().getSimpleName();
	public patient_Pages(WebDriver driver) {
		super(driver);
	}

	/**@Test1.1
	 * about this method loginTohealthAppByGivenValidCredetial() 
	 * @param : Map<String, String>
	 * @description : fill usernameTextbox & passwordTextbox and click on sign in button
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
		//write your logic here
		return false;
	}

	/**@Test1.2
	 * about this method verifyTitleOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the title of the current page.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyTitleOfThePage() throws Exception {
		//write your logic here
				return null;
	}

	/**@Test1.3
	 * about this method verifyURLOfThePage() 
	 * @param : null
	 * @description : it will navigate to the URL and validate the URL of the current page.
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyURLOfThePage() throws Exception {
		//write your logic here
		return null;
	}

	/**@Test2
	 * about this method verifyAllPresenceOfFieldIfPatientModuleIsPresent() 
	 * @param : null
	 * @description : Ensure the sub-modules "Search Patient" and "Register Patient" are available. 
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean verifyAllPresenceOfFieldIfPatientModuleIsPresent() throws Exception {
		//write your logic here
				return false;
	}

	/**@Test3
	 * about this method verifyPlaceholderNameOfTexbox() 
	 * @param : null
	 * @description : Ensure that the Search text box correctly displays its placeholder text
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyPlaceholderNameOfTexbox() throws Exception {
		//write your logic here
		return null;
	}

	/**@Test4
	 * about this method verifyButtonIsPresent() 
	 * @param : null
	 * @description : Ensure the presence of the "Take a Snapshot" button.
	 * @return : Boolean
	 * @author : YAKSHA
	 */
	public Boolean verifyTakeASnapshotButtonIsPresent() throws Exception {
		//write your logic here
				return false;
	}

	/**@Test5
	 * about this method verifyErrorMessage() 
	 * @param : null
	 * @description : Ensure the error message for the "Phone number" field is "Primary Phone is required",
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyErrorMessage() throws Exception {
		//write your logic here
		return null;
	}


	/**@Test6
	 * about this method verifyTexboxIsPresentAndValidateEnteredValue() 
	 * @param : null
	 * @description : verify text box , then send value to that text box and validate the entered value
	 * @return : String
	 * @author : YAKSHA
	 */
	public String verifyTextboxIsPresentAndValidateEnteredValue(Map<String, String> expectedData) throws Exception {

		//write your logic here
		return null;
	}
	
	/**
	 * @Test7
	 * @description Scrolls to the bottom of the page and verifies the presence of the blood group dropdown field.
	 * @param None
	 * @return Boolean - Returns true if the blood group dropdown is displayed; otherwise returns false.
	 * @throws Exception If an error occurs while scrolling or verifying the element's presence.
	 * @author YAKSHA
	 */
	public Boolean scrollToBottomAndVerifyFieldIsPresent() throws Exception {
//	Write the logic her
		return false;
	}
	
	/**
	 * @Test8
	 * @description Verifies the presence of the blood group dropdown field and highlights it on the page.
	 * @param None
	 * @return Boolean - Returns true if the blood group dropdown is displayed and successfully highlighted; otherwise returns false.
	 * @throws Exception If an error occurs during verification or highlighting of the element.
	 * @author YAKSHA
	 */
	public Boolean highlightTheElement() throws Exception {
//		Write the logic her
			return false;
	}
	
	/**
	 * @Test9
	 * @description Selects an option from the blood group dropdown based on the provided expected data from a Excel file, then verifies and returns the selected option.
	 * @param expectedData Map<String, String> - Data containing the expected blood group option to select.
	 * @return String - The option selected from the dropdown.
	 * @throws Exception If an error occurs during the dropdown selection or verification process.
	 * @author YAKSHA
	 */
	public String verifyOptionIsSelectedFromDropdown(Map<String, String> expectedData) throws Exception {

//		Write the logic her
			return null;

	}

}
