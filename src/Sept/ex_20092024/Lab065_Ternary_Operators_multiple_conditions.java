package Sept.ex_20092024;

public class Lab065_Ternary_Operators_multiple_conditions {
    public static void main(String[] args) {
        //✅ Ternary Operators to handle multiple conditions.
        // Input → int score = 85
        // String grade →
        //  score >= 90 → A
        //  score >= 80 → B
        //  score >= 70 → C

        int score = 70;
        String grade=(score >=90) ?  "A":(( score >=80)? "B" : "C");
        System.out.println("Score: " + score + ", Grade: " + grade);
    }
}
