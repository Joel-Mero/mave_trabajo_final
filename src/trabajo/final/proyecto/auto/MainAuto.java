package proyecto.auto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		Scanner teclado1 = new Scanner(System.in);
		
		Auto auto1 = new Auto();
		auto1.setPlaca("PCT-1434");
		auto1.setModelo("Prius");
		auto1.setMarca("Toyota");
		auto1.setAño("2015");
		auto1.setEstado("Disponible");
		auto1.setFechaEntrega("");
		
		Auto auto2 = new Auto();
		auto2.setPlaca("PRG-0423");
		auto2.setModelo("Sportage");
		auto2.setMarca("KIA");
		auto2.setAño("2017");
		auto2.setEstado("Reservado");
		auto2.setFechaEntrega("12/03/2021");
		
		Auto auto3 = new Auto();
		auto3.setPlaca("PFQ-0445");
		auto3.setModelo("Sportage");
		auto3.setMarca("KIA");
		auto3.setAño("2019");
		auto3.setEstado("Alquilado");
		auto3.setFechaEntrega("12/05/2021");
		
		List<Auto> listaAutos = new ArrayList<Auto>(); 
		listaAutos.add(auto1);
		listaAutos.add(auto2);
		listaAutos.add(auto3);
		

		
		int opcion;
		do {
			System.out.println("-----ES USTED-----");
			System.out.println("1. Cliente");
			System.out.println("2. Empleado");
			System.out.println("3. SALIR");
			opcion = teclado.nextInt();

			if (opcion == 1) {
				System.out.println("-----Eliga Opción-----");
				System.out.println("a. Consultar Autos");
				System.out.println("b. Reservar Autos");
				String cliente = teclado1.nextLine();

				if (cliente.equals("a")) {
					System.out.println("--Ingrese el modelo y/o marca del auto--");
					String auto = teclado1.nextLine();
					boolean comparacion = false;
					
					for (int i = 0; i < listaAutos.size(); i++) {
						Auto alquilarAuto = listaAutos.get(i);
						String autoExiste = alquilarAuto.getModelo();
						String autoExiste1 = alquilarAuto.getMarca();
						boolean comparacion1 = auto.equals(autoExiste);
						boolean comparacion2 = auto.equals(autoExiste1);
						
						if (comparacion1 == true || comparacion2 == true) {
							comparacion = true;
							System.out.println(listaAutos.get(i));
						}					}
					
				} else {
					if (cliente.equals("b")) {
						System.out.println("-Ingrese placa del Auto-");
						String placa = teclado1.nextLine();
						boolean comparacion = false;
						System.out.println("-Ingrese número de su cédula-");
						String cedula = teclado1.nextLine();
						
						
					}
				}

			} else {
				if (opcion == 2) {
					System.out.println("-----Eliga Opción-----");
					System.out.println("a. Ingresar un Auto");
					System.out.println("b. Alquilar un Auto");
					System.out.println("c. Aplazar fecha de Entrga");
					String empleado = teclado1.nextLine();

					if (empleado.equals("a")) {
						System.out.println("--Ingrese la siguiente información--");
						System.out.println("-Placa-");
						String placa = teclado1.nextLine();
						System.out.println("-Modelo-");
						String modelo = teclado1.nextLine();
						System.out.println("-Marca-");
						String marca = teclado1.nextLine();
						System.out.println("-Año de fabricación-");
						String añoFabricacion = teclado1.nextLine();
						System.out.println("-País faricación-");
						String paisFabricacion = teclado1.nextLine();
						System.out.println("-Cilindraje-");
						String cilindraje = teclado1.nextLine();
						System.out.println("-Evaluo-");
						String evaluo = teclado1.nextLine();

						System.out.println("--Eliga el tipo de Auto--");
						System.out.println("1. Automóvil");
						System.out.println("2. Camioneta");
						String tipoAuto = teclado1.nextLine();

						if (tipoAuto.equals("1")) {
							System.out.println("--Automóvil--");
							System.out.println("-Número de puertas-");
							String numeroPuerta = teclado1.nextLine();
						} else {
							if (tipoAuto.equals("2")) {
								System.out.println("--Camioneta--");
								System.out.println("-Peso que soporta-");
								String pesoSoporta = teclado1.nextLine();
							}
						}

					} else {
						if (empleado.equals("b")) {
							System.out.println("-Ingrese placa del Auto-");
							String placa = teclado1.nextLine();
						} else {
							if (empleado.equals("c")) {
								System.out.println("-Ingrese placa del Auto-");
								String placa = teclado1.nextLine();
								System.out.println("-Ingrese cédula del Cliente-");
								String cedula = teclado1.nextLine();
							}
						}

					}
				}
			}
		}while (opcion != 3);
	}

}
