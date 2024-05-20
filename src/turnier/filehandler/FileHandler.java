package turnier.filehandler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import turnier.menu.ProjectHandler;

public class FileHandler implements ProjectHandler{

	@Override
	public boolean createProjectFile(String filename) {
		try {
			FileWriter outputStream = new FileWriter(filename + ".prj");
			outputStream.close();
			return true;
		} catch (IOException e) {
			System.err.println("File " + filename +" could not be Created!");
			return false;
		}
	}

	@Override
	public File loadProjectFile(String filename) {
		return new File(filename + ".prj");
	}

	@Override
	public boolean saveToProjectFile(String filename) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeProjectFile(String filename) {
		try {
            Files.delete(Paths.get(filename + ".prj"));
            return true;
        } catch (IOException e) {
        	System.err.println("File " + filename + " Could not be deleted!");
        	return false;
        }
		
	}

}
