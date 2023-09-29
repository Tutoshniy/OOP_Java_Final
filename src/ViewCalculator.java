import java.util.Scanner;

public class ViewCalculator {

    private iComplexCalculator calculator;

    public ViewCalculator(iComplexCalculator calculator) {
        this.calculator = calculator;
    }

    public void run() {
            double realArg1 = promptInt("Введите действительную часть первого комплексного числа:");
            double imgArg1 = promptInt("Введите цифру мнимой части первого комплексного числа:");
            double realArg2 = promptInt("Введите действительную часть второго комплексного числа:");
            double imgArg2 = promptInt("Введите цифру мнимой части второго комплексного числа:");
            ComplexNumber comp1 = new ComplexNumber(realArg1, imgArg1);
            ComplexNumber comp2 = new ComplexNumber(realArg2, imgArg2);

            String cmd = prompt("Введите действие с двумя комплексными числами ('+', '*', '/')");
            if (cmd.equals("+")){
                ComplexNumber result = calculator.SumComplexNumber(comp1, comp2);
                System.out.println("Результат сложения:" + result);
            }
            if (cmd.equals("*")){
                ComplexNumber result = calculator.MultComplexNumber(comp1, comp2);
                System.out.println("Результат умножения:" + result);
            }
            if (cmd.equals("/")) {
                ComplexNumber result = calculator.DivComplexNumber(comp1, comp2);
                System.out.println("Результат деления: " + result);
            }

        }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}