package turnier;

public interface Menu {

	/**
	 * Initializes The Menu. This should be called, to ensure, that all dependent Objects are created, before the Menu is availible.
	 */
	public void initializeMenu();

	/**
	 * Creates a new Project
	 * 
	 * @author GregoryHammond
	 */
	public void createNewProject(String projectFile);
	
	
	/**
	 * Loads a Project from a file
	 * 
	 * @param projectFile - the filepath to the project
	 */
	public void loadProject(String projectFile);
	
	/**
	 * saves a Project to file.
	 * The user needs to input 
	 */
	public void saveProject();
	
	public boolean removeProject(String filename);
}
