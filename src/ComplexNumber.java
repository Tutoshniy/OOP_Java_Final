

public final class ComplexNumber implements iCalculable {

    private double realArg;
    private double imgArg;

    public ComplexNumber(double realArg, double imgArg) {
        this.realArg = realArg;
        this.imgArg = imgArg;
    }

    @Override
    public ComplexNumber sum(ComplexNumber other) {
        double realArg = this.realArg + other.realArg;
        double imgArg = this.imgArg + other.imgArg;
        return new ComplexNumber(realArg, imgArg);
    }

    @Override
    public ComplexNumber multi(ComplexNumber other) {
        double realArg = this.realArg * other.realArg - this.imgArg * other.imgArg;
        double imgArg = this.realArg * other.imgArg + this.imgArg * other.realArg;
        return new ComplexNumber(realArg, imgArg);
    }

    @Override
    public ComplexNumber div(ComplexNumber other) {
        double denominator = other.realArg * other.realArg + other.imgArg * other.imgArg;
        double realArg = (this.realArg * other.realArg + this.imgArg * other.imgArg) / denominator;
        double imgArg = (this.imgArg * other.realArg - this.realArg * other.imgArg) / denominator;
        return new ComplexNumber(realArg, imgArg);
    }

    

    @Override
    public String toString() {
        if (imgArg == 0) {
            return String.format("%.2f", realArg);
        } else if (realArg == 0) {
            return String.format("%.2fi", imgArg);
        } else {
            return String.format("%.2f %s %.2fi", realArg, (imgArg > 0 ? "+" : "-"), Math.abs(imgArg));
        }
    }
}