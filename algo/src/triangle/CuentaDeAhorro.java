package triangle;

public class CuentaDeAhorro extends CuentaBancaria{
    public void depositar(int monto){
        if(monto < 200){
            System.out.println("No se puede realizar la acción, el monto minimo es de 200Bs");
        }
        this.montoDinero += monto;
    }

    public void retirar(int monto){
        if(monto < 200){
            System.out.println("No se puede realizar la acción, el monto minimo es de 200Bs");
        }
        this.montoDinero -= monto;
    }

    public void transferencia(int monto){
        if(monto < 200){
            System.out.println("No se puede realizar la acción, el monto minimo es de 200Bs");
        }
        this.montoDinero -= monto;
    }
}






/**prt2*/
public class CuentaDeAhorro extends CuentaBancaria{
    public void depositar(int monto){
        if(montoMinimo(monto)){
            mensajeAdvertencia(monto);
        }
        this.montoDinero += monto;
    }

    public void retirar(int monto){
        if(montoMinimo(monto)){
            mensajeAdvertencia(monto);
        }
        this.montoDinero -= monto;
    }

    public void transferncia(int monto){
        if(montoMinimo(monto)){
            mensajeAdvertencia(monto);
        }
        this.montoDinero += monto;
    }
    private void mensajeAdvertencia(int monto){
        System.out.println("No se puede realizar la acción, el monto minimo es de 200Bs ");
    }

    private boolean montoMinimo(int monto){
        return monto < 200;
    }
}






/**prt3*/
public class CuentaDeAhorro extends CuentaBancaria{
    public void depositar(int monto){
        if(monto < 200){
            System.out.println("No se puede realizar la acción, el monto minimo es de 200Bs");
        }
        this.montoDinero += monto;
    }

    public void retirar(int monto){
        if(monto < 200){
            System.out.println("No se puede realizar la acción, el monto minimo es de 200Bs");
        }
        this.montoDinero -= monto;
    }

    public void trasnferencia(CuentaDeAhorro destino,CuentaDeAhorro personal,int monto){
        if(personal.montoDinero < 200){
            System.out.println("No se puede realizar la acción, el monto minimo es de 200Bs");
        }
        destino.montoDinero += monto;
        personal.montoDinero -= monto;
    }
}











/**prt4*/
public class CuentaDeAhorro extends CuentaBancaria{
    public void depositar(int monto){
        if(montoMinimo(monto)){
            mensajeAdvertencia(monto);
        }
        this.montoDinero += monto;
    }

    public void retirar(int monto){
        if(montoMinimo(monto)){
            mensajeAdvertencia(monto);
        }
        this.montoDinero -= monto;
    }

    public void transferncia(CuentaDeAhorro personal,CuentaDeAhorro destino,int monto){
        if(montoMinimo(monto)){
            mensajeAdvertencia(monto);
        }
        destino.montoDinero += monto;
        personal.montoDinero -= monto;
    }
    private void mensajeAdvertencia(int monto){
        System.out.println("No se puede realizar la acción, el monto minimo es de 200Bs ");
    }

    private boolean montoMinimo(int monto){
        return monto < 200;
    }
}
