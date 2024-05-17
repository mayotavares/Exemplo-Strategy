package Strategy

public class Geometrica implements ICalcMedia {
    @Override
    public double calcularMedia(double p1, double p2) {
        return Math.sqrt(p1 * p2);
    }

    @Override
    public String getSituacao(double media) {
        return media > 7.0 ? "Aprovado" : "Reprovado";
    }
}