package todo_print;

public class TodoPrint {
    public static void main(String[]args){
        String todoText = " - Buy milk\n";

        String t1 = ("My todo: \n");
        String t2 = todoText.substring(0,12);
        String t3 = (" - Download games\n");
        String t4 = ("     - Diablo");

        StringBuilder todoFinal = new StringBuilder(t1 + t2 + t3 + t4);
        todoText = todoFinal.toString();
        System.out.println(todoText);
    }
}
