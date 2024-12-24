package StudentDetails;
import java.util.*;

class Student {
    private int rollno;
    private String name;
    private double marks;

    Student(int rollno, String name, double marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public String toString() {
        return rollno + " " + name + " " + marks;
    }
}

public class StudentManage {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;
        do {
            System.out.println("1 INSERT");
            System.out.println("2 DISPLAY");
            System.out.println("3 SEARCH");
            System.out.println("4 DELETE");
            System.out.println("5 UPDATE");
            System.out.print("Enter your choice: ");
            ch = s.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Enter student roll no: ");
                    int rollno = s.nextInt();
                    System.out.print("Enter student name: ");
                    String name = s1.nextLine();
                    System.out.print("Enter student marks: ");
                    double marks = s.nextDouble();
                    studentList.add(new Student(rollno, name, marks));
                    System.out.println("-----------------------");
                    System.out.println("Student Inserted successfully");
                    System.out.println("-----------------------");
                    break;

                case 2:
                    System.out.println("-----------------------");
                    Iterator<Student> i = studentList.iterator();
                    while (i.hasNext()) {
                        Student student = i.next();
                        System.out.println(student);
                    }
                    System.out.println("-----------------------");
                    break;

                case 3:
                    boolean found = false;
                    System.out.print("Enter student roll no: ");
                    rollno = s.nextInt();
                    i = studentList.iterator();
                    while (i.hasNext()) {
                        Student student = i.next();
                        if (student.getRollno() == rollno) {
                            found = true;
                            System.out.println("-----------------------");
                            System.out.println(student);
                        }
                    }
                    if (!found) {
                        System.out.println("-----------------------");
                        System.out.println("Student not found");
                    }
                    System.out.println("-----------------------");
                    break;

                case 4:
                    found = false;
                    System.out.print("Enter student roll no to delete: ");
                    rollno = s.nextInt();
                    i = studentList.iterator();
                    while (i.hasNext()) {
                        Student student = i.next();
                        if (student.getRollno() == rollno) {
                            i.remove();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("-----------------------");
                        System.out.println("Student not found");
                    } else {
                        System.out.println("-----------------------");
                        System.out.println("Student Deleted successfully");
                    }
                    System.out.println("-----------------------");
                    break;

                case 5:
                    found = false;
                    System.out.print("Enter student roll no to update: ");
                    rollno = s.nextInt();
                    ListIterator<Student> li = studentList.listIterator();
                    while (li.hasNext()) {
                        Student student = li.next();
                        if (student.getRollno() == rollno) {
                            System.out.print("Enter student name: ");
                            name = s1.nextLine();
                            System.out.print("Enter student marks: ");
                            marks = s.nextDouble();
                            li.set(new Student(rollno, name, marks));
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("-----------------------");
                        System.out.println("Student not found");
                    } else {
                        System.out.println("Student Updated successfully");
                    }
                    System.out.println("-----------------------");
                    break;
            }
        } while (ch != 0);
    }

		// TODO Auto-generated method stub

	}


