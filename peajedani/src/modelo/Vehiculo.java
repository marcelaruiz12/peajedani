package modelo;

public class Vehiculo {
public String placa;
public String tipoVehiculo;
public int numEjes;

public Vehiculo(String placa, String tipoVehiculo, int numEjes) {
this.placa = placa;
this.tipoVehiculo = tipoVehiculo;
this.numEjes = numEjes;
}

public int calcularPeaje(){
int valorPeaje=0;
switch(this.tipoVehiculo.toUpperCase()){
    case  "CARRO": valorPeaje = 10000;
    break;
    case "MOTO": valorPeaje = 5000;
    break;
    case "CAMION": valorPeaje = 5000*this.getNumEjes();
    break;
    default:
        System.out.println("tipo de vehiculo no valido");
        break;
}
return valorPeaje;
}

public String getPlaca() {
    return placa;
}

public void setPlaca(String placa) {
    this.placa = placa;
}

public String getTipoVehiculo() {
    return tipoVehiculo;
}

public void setTipoVehiculo(String tipoVehiculo) {
    this.tipoVehiculo = tipoVehiculo;
}

public int getNumEjes() {
    return numEjes;
}

public void setNumEjes(int numEjes) {
    this.numEjes = numEjes;
}





}