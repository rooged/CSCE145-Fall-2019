//written by Timothy Gedney
import java.util.*;
import java.io.*;

public class Student {

	//attributes
	private double labSum, labCount, labRSum, labRCount, hwSum, hwCount, exam01, exam02, finalExam;
	
	//constructor
	public Student() {
		labSum = labCount = labRSum = labRCount = hwSum = hwCount = exam01 = exam02 = finalExam = 0;
	}
	
	//accessors
	public double getLabAverage() {
		return labSum / labCount;
	}
	
	public double getLabReportAverage() {
		return labRSum / labRCount;
	}
	
	public double getHomeworkAverage() {
		return hwSum / hwCount;
	}
	
	public double getExam01() {
		return exam01;
	}
	
	public double getExam02() {
		return exam02;
	}
	
	public double getFinal() {
		return finalExam;
	}
	
	//addGrade
	public void addGrade(String type, double grade) {
		if (type.equalsIgnoreCase("LABS")) {
			labSum += grade;
			labCount++;
		} else if (type.equalsIgnoreCase("LAB REPORTS")){
			labRSum += grade;
			labRCount++;
		} else if (type.equalsIgnoreCase("HOMEWORK")) {
			hwSum += grade;
			hwCount++;
		} else if (type.equalsIgnoreCase("EXAM 1")) {
			exam01 = grade;
		} else if (type.equalsIgnoreCase("EXAM 2")) {
			exam02 = grade;
		} else if (type.equalsIgnoreCase("FINAL")) {
			finalExam = grade;
		}
	}
	
	//calculate raw grade
	public double getGradeNumeric() {
		double first = exam01;
		double second = exam02;
		
		if (finalExam > exam01 && finalExam > exam02) {
			first = finalExam;
		} else if (exam01 > exam02) {
			second = exam01;
		}
		return (this.getLabAverage() * .1) + (this.getLabReportAverage() * .1) + (this.getHomeworkAverage() * .2) + (first * .3) + (second * .3);
	}
	
	public double getGradeRounded() {
		return Math.ceil(this.getGradeNumeric());
	}
	
	public String getGradeLetter() {
		double grade = this.getGradeRounded();
		if (grade >= 90) {
			return "A";
		} else if (grade >= 85) {
			return "B+";
		} else if (grade >= 80) {
			return "B";
		} else if (grade >= 75) {
			return "C+";
		} else if (grade >= 70) {
			return "C";
		} else if (grade >= 65) {
			return "D+";
		} else if (grade >= 60) {
			return "D";
		} else {
			return "F";
		}
	}
	
	public void readGradeFile(String filename) {
		try {
			Scanner fileScanner = new Scanner(new File(filename));
			String currentSec = "";
			while (fileScanner.hasNextLine()) {
				String currentLine = fileScanner.nextLine();
				if (currentLine.equalsIgnoreCase(SectionType.LABS)) {
					currentSec = SectionType.LABS;
				} else if (currentLine.equalsIgnoreCase(SectionType.LAB_REPORTS)) {
					currentSec = SectionType.LAB_REPORTS;
				} else if (currentLine.equalsIgnoreCase(SectionType.HOMEWORK)) {
					currentSec = SectionType.HOMEWORK;
				} else if (currentLine.equalsIgnoreCase(SectionType.EXAM01)) {
					currentSec = SectionType.EXAM01;
				} else if (currentLine.equalsIgnoreCase(SectionType.EXAM02)) {
					currentSec = SectionType.EXAM02;
				} else if (currentLine.equalsIgnoreCase(SectionType.FINAL)) {
					currentSec = SectionType.FINAL;
				} else {
					this.addGrade(currentSec, Double.parseDouble(currentLine));
				}
			}
			fileScanner.close();
		}
		catch (Exception e) {
			System.out.print(e);
		}
	}

	public String toString() {
		return "Lab Average: " + this.getLabAverage() + "\nLab Report Average: " + this.getLabReportAverage() + "\nHomework Average: " + this.getHomeworkAverage() + 
				"\nExam 01: " + this.getExam01() + "\nExam 02: " + this.getExam02() + "\nFinal Exam: " + this.getFinal() + "\nRaw Total: " + 
				this.getGradeNumeric() + "\nAdjusted: " + this.getGradeRounded() + "\nGrade: " + this.getGradeLetter();
	}
	
}
