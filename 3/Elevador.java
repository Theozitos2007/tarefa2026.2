public class Elevador {

    private float peso = 500;
    private int floor = 0;

    public float getPeso() {
        return peso;
    }

    public boolean isValidPeso(float peso) {
        return !(peso > this.peso);
    }

    public int getFloor() {
        return floor;
    }

    public boolean setFloor(int floor) {

        if(floor > 20 || floor < 0){
            return false;
        }else{
            this.floor = floor;
            return true;
        }

        
    }



}
