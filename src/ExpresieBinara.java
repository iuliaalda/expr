public abstract class ExpresieBinara extends Expresie {

    private Expresie operandSt, operandDr;

    public ExpresieBinara(Expresie operandSt, Expresie operandDr) {
        this.operandSt = operandSt;
        this.operandDr = operandDr;
    }

    public Expresie operandSt() {
        return operandSt;
    }

    public Expresie operandDr() {
        return operandDr;
    }

}