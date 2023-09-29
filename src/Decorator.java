public class Decorator implements iComplexCalculator {

    private iComplexCalculator arg;
    private Logger logger;

    public Decorator (iComplexCalculator arg, Logger logger){
        this.arg = arg;
        this.logger = logger;
    }

    @Override
    public ComplexNumber SumComplexNumber(ComplexNumber a, ComplexNumber b) {
        logger.log("Ввели два комплексных числа. Выполняем сумму.");
        return arg.SumComplexNumber(a, b);
        
    }

    @Override
    public ComplexNumber DivComplexNumber(ComplexNumber a, ComplexNumber b) {
        logger.log("Ввели два комплексных числа. Выполняем деление.");
        return arg.DivComplexNumber(a, b);
    }

    @Override
    public ComplexNumber MultComplexNumber(ComplexNumber a, ComplexNumber b) {
        logger.log("Ввели два комплесных числа. Выполняем умножение.");
        return arg.MultComplexNumber(a, b);
    }

    
}
