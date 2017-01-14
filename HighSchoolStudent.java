import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class HighSchoolStudent extends Student {

	private String nameOfSchool;

	HighSchoolStudent(String name, String id, String essay,
			ArrayList<String> errorList, String nameOfSchool) {
		super(name, id, essay, errorList);
		this.nameOfSchool = nameOfSchool;

	}

	public String getSchoolName() {
		return nameOfSchool;
	}

	public void setSchoolName(String schoolName) {
		this.nameOfSchool = schoolName;
	}

	public void writeToFile() {

		try {

			File file = new File(this.getId() + "_graded.txt");

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("\nHigh School Student " + this.getName());
			bw.write("\nStudent ID: " + this.getId());
			bw.write("\nSchool Name: " + this.getSchoolName());
			bw.write("\n" + this.getPrintableErrorList());
			bw.close();
		}

		catch (Exception e) {

		}
	}
}
