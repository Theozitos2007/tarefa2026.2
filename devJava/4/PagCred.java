public class PagCred implements PagInt {

    //deb: com senha
    @Override
    public String displayType(){
        return "Credito";
    }

    public boolean validateCreLimit(double value, Global inGlobal){
        return (value <= inGlobal.getCredLimit());
    }

    @Override
    public void pagar(double input, Global inGlobal) {

        if (!validateCreLimit(input, inGlobal)){
            System.out.println("Saldo insuficiente");
        }else if(!validateZero(input)){
            System.out.println("numero invalido");
        }else{
            double newSaldo = inGlobal.getCredLimit() - input;
            inGlobal.setCredLimit(newSaldo);
        }

    }

}
