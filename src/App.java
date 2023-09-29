public class App {
    public static void main(String[] args) throws Exception {
        iComplexCalculator calculator = new ComplexNumberCalculator();
        ViewCalculator view = new ViewCalculator(calculator);
        view.run();
    }
}
