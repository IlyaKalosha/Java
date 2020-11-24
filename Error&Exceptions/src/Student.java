import java.util.Arrays;
import java.util.HashMap;

public class Student {
    private int id;
    private String name;
    private Group group;
    private HashMap<String, Integer[]> marks;

    public Student(String name, Group group, int id) {
        this.name = name;
        this.group = group;
        this.id = id;
        marks = new HashMap<>();
    }

    public double avgMarks(){
        double avgResult = 0;
        int countOfGrades = 0;
        for (HashMap.Entry<String, Integer[]> entry : marks.entrySet()) {
            avgResult += Arrays.stream(entry.getValue()).mapToDouble(value ->value).average().orElse(Double.NaN);
            countOfGrades++;
        }
        avgResult = avgResult / countOfGrades;
        return avgResult;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Integer[]> getMarks() {
        return marks;
    }

    public void setMarks(HashMap<String, Integer[]> marks) {
        this.marks = marks;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
