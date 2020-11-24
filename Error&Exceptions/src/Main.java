import Exceptions.NoDisciplinesException;
import Exceptions.NoFacultiesException;
import Exceptions.NoGroupsException;
import Exceptions.NoStudentsException;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Faculty IT = new Faculty(1,"IT","Information Technology Faculty");

        Group firstGroup = new Group(IT,1);
        Group secondGroup = new Group(IT,2);
        Group thirdGroup = new Group(IT,3);

        Student IlyaKalosha = new Student("Ilya Kalosha", firstGroup, 1);
        Student VladIlinov = new Student("Vlad Ilinov", firstGroup, 2);
        Student DzenisBozhko = new Student("Dzenis Bozhko", secondGroup, 3);
        Student AndrewKozlovskiy = new Student("Andrew Kozlovskiy", secondGroup, 4);

        ArrayList<Faculty> university = new ArrayList<Faculty>();
        university.add(IT);

        ArrayList<Group> pulpit = new ArrayList<Group>();
        pulpit.add(firstGroup);
        pulpit.add(secondGroup);

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(IlyaKalosha);
        students.add(VladIlinov);
        students.add(DzenisBozhko);
        students.add(AndrewKozlovskiy);

        IlyaKalosha.getMarks().put("DataBases",new Integer[]{8,7,6,9,10});
        VladIlinov.getMarks().put("DataBases",new Integer[]{2,2,2,2,2});
        DzenisBozhko.getMarks().put("DataBases",new Integer[]{5,5,5,5,5});
        AndrewKozlovskiy.getMarks().put("DataBases",new Integer[]{9,9,9,9,9});

        System.out.println("Средний балл студента " + IlyaKalosha.avgMarks());

        double allStudentsAvg = 0;
        for (var student:
             students) {
            allStudentsAvg += student.avgMarks();
        }
        System.out.println("Средний балл всех студентов " + allStudentsAvg/students.size());

        if(university.size() == 0)
            try{
                throw new NoFacultiesException("В университете нет факультетов");
            } catch (NoFacultiesException e) {
                System.out.println(e.getMessage());
                return;
            }

        for (var student:
             students) {
            if(student.getMarks().entrySet().size() == 0)
                try {
                    throw new NoDisciplinesException("У студента нет предметов");
                } catch (NoDisciplinesException e) {
                    System.out.println(e.getMessage());
                    return;
                }
        }

        for (var student:
                students) {
            if(student.getGroup().getId() < 3 )
                break;
            else{
                try {
                    throw new NoStudentsException("В третьей группе нет студентов");
                } catch (NoStudentsException e) {
                    System.out.println(e.getMessage());
                    return;
                }
            }
        }

        for (var group:
                pulpit) {
            if(group.getFaculty() == IT )
                break;
            else{
                try {
                    throw new NoGroupsException("На факультете нет групп");
                } catch (NoGroupsException e) {
                    System.out.println(e.getMessage());
                    return;
                }
            }
        }

    }
}
