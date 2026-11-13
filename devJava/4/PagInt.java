public interface PagInt {


    // validacao do pagamento. true = passou na validacao
    default boolean validateZero(double value){
        return (value > 0);
    }
    default boolean validateSaldo(double value, Global inGlobal){
        return (value <= inGlobal.getSaldo());
    }


    //pagamento metodo
    default void pagar(double input, Global inGLobal){
    }

    //display do tipo
    default String displayType(){
        return null;
    }

}
