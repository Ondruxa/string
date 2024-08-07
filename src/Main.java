public class Main {
    public static void main(String[] args) {
        System.out.println("task1");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф.И.О. сотрудника — " + fullName);
        System.out.println("task2");
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        System.out.println("task3");
        fullName = "Иванов Семён Семёныч";
        System.out.println("Данные Ф.И.О. сотрудника — " + fullName.replace("ё", "е"));
    }
}