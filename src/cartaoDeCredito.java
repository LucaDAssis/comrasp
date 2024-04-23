import java.util.ArrayList;
import java.util.List;

public class cartaoDeCredito {
    private double limite;
    private double saldo;
    private final List<Compras> compras;

    public cartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public boolean lancaCompras(Compras compras){
        if (this.saldo > compras.getValor()){
            this.saldo -= compras.getValor();
            this.compras.add(compras);
            return true;
        }
            return false;
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compras> getCompras() {
        return compras;
    }

}
