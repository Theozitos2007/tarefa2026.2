import java.util.Scanner;

public class Week4 {

    public static void main(String[] args) {
        ///////////////////////////////////////
        // first sstuff
        //////////////////////
        //create objs
        Scanner scanny = new Scanner(System.in);
        Global globalControl = new Global();
        PagCred pagCred = new PagCred();
        PagDeb pagDeb = new PagDeb();
        PagPix pagPix = new PagPix();
        /////////////////////////////////
        //set pass

        System.out.println("Olá! \nDefina sua senha de login");

        globalControl.setSenhaLogin(scanny.nextInt());
        scanny.nextLine();

        System.out.println("Agora defina a senha de transaçao");

        globalControl.setSenhaTransacao(scanny.nextInt());
        scanny.nextLine();

        boolean globalQuitTime = false;

        do {
            System.out.println("/////////////////////////\n" +
                            "SALDO: " + globalControl.getSaldo() +
                            "\nLIMITE DE CREDITO: " + globalControl.getCredLimit() +
                            "\n/////////////////////////\n" +
                            "o que quer fazer?\n 1.pagar credito\n 2.pagar debito\n 3.pagar pix\n 4.sair" +
                            "\n/////////////////////////\n"
                    );

            int switchControl = scanny.nextInt();
            scanny.nextLine();

            switch (switchControl){
                case 1:
                    //pag cred
                    System.out.println("Tipo de pagamento selecionado: " + pagCred.displayType());

                    System.out.println("Digite a senha de transacao");

                    boolean validateCred = globalControl.validatePass(scanny.nextInt());
                    scanny.nextLine();

                    if(validateCred){
                        System.out.println("Digite o valor a pagar");
                        pagCred.pagar(scanny.nextDouble(), globalControl);
                        scanny.nextLine();
                    }else{
                        System.out.println("Senha invalida");
                    }
                    break;
                case 2:
                    // pag deb
                    System.out.println("Tipo de pagamento selecionado: " + pagDeb.displayType());

                    System.out.println("Digite a senha de transacao");

                    boolean validateDeb = globalControl.validatePass(scanny.nextInt());
                    scanny.nextLine();

                    if(validateDeb){
                        System.out.println("Digite o valor a pagar");
                        pagDeb.pagar(scanny.nextDouble(), globalControl);
                        scanny.nextLine();
                    }else{
                        System.out.println("Senha invalida");
                    }
                    break;
                case 3:
                    //pag pix

                    System.out.println("Tipo de pagamento selecionado: " + pagPix.displayType());

                    System.out.println("digite o valor a pagar");
                    pagPix.pagar(scanny.nextDouble(), globalControl);
                    scanny.nextLine();

                    break;
                case 4:
                System.out.println("Saindo...");
                    globalQuitTime = true;
                    break;
                default:
                    System.out.println("Seleçao invalida, tente novamente");
                    break;
            }

        }while(!globalQuitTime);

    }

    /*
    Exercício 1 – Sistema de Pagamentos
Um banco contratou você para desenvolver o núcleo do sistema de pagamentos do aplicativo. Toda forma de pagamento tem um valor a ser cobrado, que não pode ser zero ou negativo.

Crie uma classe base para representar uma forma de pagamento, que não pode ser instanciada diretamente, e três tipos que herdam dela: Pix, Débito e Crédito.

Implemente um métodyo pagar() que cada tipo execute de forma diferente (por exemplo, o Débito verifica se há saldo suficiente antes de aprovar).

Antes de processar qualquer pagamento, o valor informado deve ser validado: se for zero ou negativo, o pagamento deve ser recusado, exibindo uma mensagem no console.

Implemente também um métodyo que exiba os detalhes do pagamento (tipo, valor e status) de forma diferente para cada tipo, refletindo suas características próprias.

Crie um objeto de cada tipo e chame pagar() em cada um, exibindo no console o resultado.
     */



}
