/**
 * 
 */
package turnier;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import turnier.menu.CLIMenu;

/**
 * 
 */
class MenuTest {

	private Menu myMenu;
	final String VALID_FILE_NAME = "MyProject";
	final String EMPTY_FILE_NAME = "";

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		myMenu = new CLIMenu();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
		myMenu.removeProject(VALID_FILE_NAME);
	}
	
	@Test
	void testCreateNewProject() {
		myMenu.createNewProject(VALID_FILE_NAME);
		File f = new File(VALID_FILE_NAME + ".prj");
		assertTrue(f.exists() && !f.isDirectory());
	}
	
	@Test
	void testLoadProject() {
		myMenu.createNewProject(VALID_FILE_NAME);
		File f = myMenu.loadProject(VALID_FILE_NAME);
		assertTrue(f.exists() && !f.isDirectory());
		assertTrue(f.getName().equals(VALID_FILE_NAME + ".prj"));
	}


}
