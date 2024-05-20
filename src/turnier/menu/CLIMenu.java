/**
 * 
 */
package turnier.menu;

import java.util.Scanner;

import turnier.Menu;
import turnier.filehandler.FileHandler;

/**
 * 
 */
public class CLIMenu implements Menu {
	ProjectHandler fl;
	private String currentProject;
	
	public CLIMenu() {
		fl = new FileHandler();
	}

	@Override
	public void initializeMenu() {
		System.out.println("Welcome to the Tournament Management System");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Choose one of the following:");
			System.out.println("1 - Create a New Project");
			System.out.println("2 - Load a Project from file");
			System.out.println("3 - Save the Current Project to File");
			System.out.println("-1 - Exit Program");
			
			switch (sc.nextInt()) {
			case 1: {
				System.out.println("Creating a new Project!");
				System.out.println("Give the Project a name:");
				currentProject = sc.nextLine();
				createNewProject(currentProject);
				System.out.println("Created a the new project " + currentProject);
				System.out.println("Saved Procetfile " + currentProject + ".prj");
				break;
			}
			case 2: {
				System.out.println("Loading Project from File");
				break;
			}
			case 3: {
				System.out.println("Saving Project to File");
				break;
			}
			case -1:{
				System.out.println("Goodbye!");
				sc.close();
				System.exit(0);
			}
			default:
				System.out.println("That seems to be a wrong Input -Try Again");
				break;
			}
		}
	}

	@Override
	public void createNewProject(String projectFile) {
		fl.createProjectFile(projectFile);
	}

	@Override
	public void loadProject(String projectFile) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveProject() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean removeProject(String filename) {
		return fl.removeProjectFile(filename);
	}

}
