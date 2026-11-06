import java.util.Scanner;

public class Week3 {
    public static void main(String[] args) {

    Scanner scanny = new Scanner(System.in);
    Elevador elevadorObj = new Elevador();



    System.out.println("prédio de 20 andares. elevador no térreo (piso 0). capacidade maxima: " + elevadorObj.getPeso() + "kg.");

    System.out.println("para ir para um piso, digite o peso atual dentro do elevador:");

    boolean valid = elevadorObj.isValidPeso(scanny.nextFloat());
    scanny.nextLine();

    while(valid == false){
        System.out.println("peso maximo excedido. tente novamente");
        valid = elevadorObj.isValidPeso(scanny.nextFloat());
        scanny.nextLine();
    }

    System.out.println("Digite o piso");

    int setFloorNum = scanny.nextInt();
    valid = elevadorObj.setFloor(setFloorNum);
    scanny.nextLine();

    while(valid == false){
        System.out.println("piso invalido. tente novamente");
        setFloorNum = scanny.nextInt();
        valid = elevadorObj.setFloor(setFloorNum);
        scanny.nextLine();
    }

    elevadorObj.setFloor(setFloorNum);

    System.out.println("piso atual: " + elevadorObj.getFloor());

    }

}
