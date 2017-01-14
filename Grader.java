import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Grader {

	private boolean available;
	private Student student;
	private Dictionary dict;

	public Grader(Dictionary dict) {
		this.dict = dict;
	}

	public boolean gradeStudent(String fileName) {

		File file;
		Scanner fileIn;
		int stuType;
		ArrayList<String> errorList = new ArrayList<String>();

		String type = "";
		String name = "";
		String id = "";
		String major = "";
		String advisor = "";
		String essay = "";
		String nameOfSchool = "";

		try {

			file = new File(fileName + ".txt");
			fileIn = new Scanner(file);
		} catch (FileNotFoundException e) {
			reset();
			return false;
		}

		// read file split

		type = fileIn.nextLine();
		name = fileIn.nextLine();
		id = fileIn.nextLine();

		if (type.equals("Graduate Student")) {
			stuType = 1;
			major = fileIn.nextLine();
			advisor = fileIn.nextLine();
		} else if (type.equals("Undergraduate Student")) {
			stuType = 2;
			major = fileIn.nextLine();
		} else if (type.equals("HighSchool Student")) {
			stuType = 3;
			nameOfSchool = fileIn.nextLine();
		} else
			stuType = 0;

		while (fileIn.hasNextLine()) {
			essay += "\n" + fileIn.nextLine();
		}

		String[] splited = essay.trim().split("\\s+");

		for (int i = 0; i < splited.length; i++) {

			splited[i] = splited[i].toLowerCase();

			// if (splited[i].contentEquals("'") ||
			// splited[i].contentEquals("-") || splited[i].contentEquals("’")) {

			// } else {
			splited[i] = splited[i].replaceAll("[^a-zA-Z0-9\'’-]", "");

			// }

			if (!dict.isWord(splited[i].toLowerCase())) {
				errorList.add(splited[i]);
			}
		}

		if (stuType == 1) {
			student = new GraduateStudent(name, id, essay.toString(),
					errorList, major, advisor);
		} else if (stuType == 2) {
			student = new UndergraduateStudent(name, id, essay.toString(),
					errorList, major);
		} else if (stuType == 3) {
			student = new HighSchoolStudent(name, id, essay, errorList,
					nameOfSchool);
		} else {
			stuType = 55555;

		}

		fileIn.close();

		available = true;
		return true;
	}

	public boolean isAvailable() {
		if (student == null)
			return true;
		else
			return false;
	}

	public Student getStudent() {

		return student;
	}

	public void reset() {
		student = null;
		available = true;

	}

}
