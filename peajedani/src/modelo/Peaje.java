package modelo;

import java.util.List;

public class Peaje {
private String nombre;
private String departamento;
private int valorTotal;

public Peaje(String nombre, String departamento) {
this.nombre = nombre;
this.departamento = departamento;
this.valorTotal = 0;
}

public int calcularPeaje(String tipoVehiculo, int numEjes) {
int valorPeaje = 0;
if (tipoVehiculo.equals("carro")) {
valorPeaje = 10000;
}
else if (tipoVehiculo.equals("moto")) {
valorPeaje = 5000;
}
else if (tipoVehiculo.equals("camion")) {
valorPeaje = 5000 * numEjes;
}
this.valorTotal += valorPeaje;
return valorPeaje;
}

public void imprimirListado(List<Vehiculo> vehiculos) {
System.out.println("Listado de vehículos en el peaje:");
for (Vehiculo vehiculo : vehiculos) {
int valorPeaje = calcularPeaje(vehiculo.getTipoVehiculo(), vehiculo.getNumEjes());
System.out.println("Placa: " + vehiculo.getPlaca() + ", Valor del peaje: $" + valorPeaje);
}
System.out.println("Valor total acumulado: $" + this.valorTotal);
}
}