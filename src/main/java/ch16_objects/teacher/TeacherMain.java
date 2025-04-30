package ch16_objects.teacher;

public class TeacherMain {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("김삼", "서면");
        Teacher teacher2 = new Teacher("김사", "전포");
        
        boolean result1 = teacher1.equals(teacher2);
        boolean result2 = teacher1 == teacher2;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println();

        String name = "김오";
        boolean result3 = name.equals("김오");
        boolean result4 = name == "김오";

        System.out.println(result3);
        System.out.println(result4);
        System.out.println();

        String name2 = new String("김오");
        boolean result5 = name.equals(name2);
        boolean result6 = name == name2;

        System.out.println(result5);
        System.out.println(result6);
        System.out.println();
    }
}
