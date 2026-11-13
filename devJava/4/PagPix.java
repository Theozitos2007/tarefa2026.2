import java.math.BigDecimal;

public class PagPix implements PagInt {

    //pix: sem senha
    @Override
    public String displayType(){
        return "Pix";
    }



    @Override
    public void pagar(double input, Global inGlobal) {

        if (!validateSaldo(input, inGlobal)){
            System.out.println("Saldo insuficiente");
        }else if(!validateZero(input)){
            System.out.println("numero invalido");
        }else{
            double newSaldo = inGlobal.getSaldo() - input;
            inGlobal.setSaldo(newSaldo);
        }

    }


}
