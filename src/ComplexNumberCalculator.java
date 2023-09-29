public class ComplexNumberCalculator implements iComplexCalculator {

    @Override
    public ComplexNumber SumComplexNumber(ComplexNumber a, ComplexNumber b){
        return a.sum(b);
    }

    @Override
    public ComplexNumber DivComplexNumber(ComplexNumber a, ComplexNumber b) {
        return a.div(b);
    }
    
    @Override
    public ComplexNumber MultComplexNumber(ComplexNumber a, ComplexNumber b) {
        return a.multi(b);
    }
}
