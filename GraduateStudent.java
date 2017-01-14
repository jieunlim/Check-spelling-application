import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GraduateStudent extends Student {

	private String major;
	private String advisor;
	
	
	public GraduateStudent(String name, String id, String essay,
			ArrayList<String> errorList, String major, String advisor) {
		super(name, id, essay, errorList);
		this.major = major;
		this.advisor = advisor;

	}

	

	public String getMajor() {
		return this.major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}

	public void writeToFile() {
		
		try {

			File file = new File(this.getId() + "_graded.txt");

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);

			bw.write("\nGraduate Student " + this.getName());
			bw.write("\nStudent ID: " + this.getId());
			bw.write("\nMajor: " + this.getMajor());
			bw.write("\nAdvisor: " + this.getAdvisor());
			bw.write("\n" + this.getPrintableErrorList());
			bw.close();
		}
		catch (IOException e){
			
		}
		catch (Exception e) {
			
		}
		
		
	}

}
