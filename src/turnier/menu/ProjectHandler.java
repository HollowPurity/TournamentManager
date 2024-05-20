package turnier.menu;

import java.io.File;

public interface ProjectHandler {

	/**
	 * Creates a Project File with the Filename and the .prj ending
	 * @param filename
	 * @return true, if Project could be created
	 */
	public boolean createProjectFile(String filename);
	
	/**
	 * Loads the Project File from Disk
	 * @param filename
	 * @return The Project File
	 */
	public File loadProjectFile(String filename);
	
	/**
	 * Saves Changes to the ProjectFile
	 * @param filename
	 * @return true if File could be saved
	 */
	public boolean saveToProjectFile(String filename);

	/**
	 * Deletes a Project File from Disk
	 * @param filename
	 * @return
	 */
	public boolean removeProjectFile(String filename);
}
