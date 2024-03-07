//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int result = main.determineGroup(77);
        System.out.println(result);
    }

    public int determineGroup(int age) {
        int group;
        if (age >= 7 && age <= 13) {
            group = 1;
        } else if (age >= 14 && age <= 17) {
            group = 2;
        } else if (age >= 18 && age <= 65) {
            group = 3;
        } else {
            group = -1;
        }
        return group;
    }
}