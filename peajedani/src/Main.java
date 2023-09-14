
import java.util.ArrayList;


import modelo.Peaje;
import modelo.Vehiculo;

public class Main {
public static void main(String[] args) {
Peaje peaje = new Peaje ("Peaje Norte", "Cali");
ArrayList<Vehiculo> Vehiculos = new ArrayList<Vehiculo>();


Vehiculos.add(new Vehiculo ("SAR138", "carro", 0));
Vehiculos.add(new Vehiculo ("LAR251", "moto", 0));
Vehiculos.add(new Vehiculo ("SAV257", "camion", 2));
Vehiculos.add(new Vehiculo ("DMA125", "camion", 3));



peaje.imprimirListado(Vehiculos);
}
}
