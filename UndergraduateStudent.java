import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

public class UndergraduateStudent extends Student {

	private String major;

	public UndergraduateStudent(String name, String id, String essay,
			ArrayList<String> errorList, String major) {
		super(name, id, essay, errorList);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void writeToFile() {
		
		try {

		File file = new File(this.getId() + "_graded.txt");

		FileWriter fw = new FileWriter(file.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("\nUndergraduate Student " + this.getName());
		bw.write("\nStudent ID: " + this.getId());
		bw.write("\nMajor: " + this.getMajor());
		bw.write("\n" + this.getPrintableErrorList());
		bw.close();
	}

	catch (Exception e) {

	}

	}

}
