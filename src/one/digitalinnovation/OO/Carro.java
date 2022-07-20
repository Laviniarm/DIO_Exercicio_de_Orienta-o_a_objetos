package one.digitalinnovation.OO;

public class Carro {
    String cor;
    String modelo;
    int capacidadeTanque;
    public void setCapacidadeTanque(int i) {
    }

    Carro() {

    }
    Carro( String cor,String modelo, int capacidadeTanque ) {
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;
    }

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }
    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo() {
        return modelo;
    }
    void capacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }
    int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    double totalValorTanque (double valorCombustivel){
        return capacidadeTanque * valorCombustivel;
    }

}
