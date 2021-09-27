package proyecto.auto;

import java.time.LocalDate;
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
		auto1.setFechaEntrega("10/06/2021");

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
		
		Cliente cliente1 = new Cliente();
		cliente1.setCedula("172934343");
		cliente1.setAuto(auto1);
		
		Cliente cliente2 = new Cliente();
		cliente2.setCedula("172934343");
		cliente2.setAuto(auto2);
		
		Cliente cliente3 = new Cliente();
		cliente3.setCedula("172934343");
		cliente3.setAuto(auto2);
		
		List<Cliente> listaCliente = new ArrayList<Cliente>();
		listaCliente.add(cliente1);
	
		int opcion;
		do {
			System.out.println("-----ES USTED-----");
			System.out.println("1. Cliente");
			System.out.println("2. Empleado");
			System.out.println("3. SALIR");
			opcion = teclado.nextInt();
			System.out.println();

			if (opcion == 1) {
				System.out.println("-----Eliga Opción-----");
				System.out.println("a. Consultar Autos");
				System.out.println("b. Reservar Autos");
				String cliente = teclado1.nextLine();
				System.out.println();

				if (cliente.equals("a")) {
					System.out.println("--Ingrese el modelo y/o marca del auto--");
					String auto = teclado1.nextLine();
					System.out.println();
					boolean comparacion = false;

					for (int i = 0; i < listaAutos.size(); i++) {
						Auto alquilarAuto = listaAutos.get(i);
						String modeloExiste = alquilarAuto.getModelo();
						String marcaExiste = alquilarAuto.getMarca();
						boolean comparacion1 = auto.equals(modeloExiste);
						boolean comparacion2 = auto.equals(marcaExiste);

						if (comparacion1 == true || comparacion2 == true) {
							comparacion = true;
							System.out.println(listaAutos.get(i));
						}
					}

				} else {
					if (cliente.equals("b")) {
						System.out.println("-Ingrese placa del Auto-");
						String placa = teclado1.nextLine();
						boolean comparacion = false;
						System.out.println("-Ingrese número de su cédula-");
						String cedula = teclado1.nextLine();
						System.out.println();

						for (int i = 0; i < listaAutos.size(); i++) {
							Auto auto = listaAutos.get(i);
							placa = auto.getPlaca();
							boolean comparacion1 = auto.getPlaca().contains(placa);

							if (comparacion1 == true) {
								if (auto.getEstado().equals("Disponible")) {
									auto.setEstado("Reservado");
								}
							}
//								else {
//								if (comparacion1 == false) {
//									if (auto.getEstado().equals("Reservado")) {
//										System.out.println("Auto no siponible");
//									}
//								}
//							}
							if (auto.getFechaEntrega().equals("10/06/2021")) {
								LocalDate fechaReserva = LocalDate.of(2021, 6, 10);
								LocalDate fechaEntrega = fechaReserva.plusDays(2);
								auto.setFechaEntrega("" + fechaEntrega);
								System.out.println(listaAutos.get(i) + ", Reservado= " + cedula);
								System.out.println("El auto ha sido correctamente reservado.");
								System.out.println("Pasar a retirarlo.");
								System.out.println();
							}
						}
					}
				}

			} else {
				if (opcion == 2) {
					System.out.println("-----Eliga Opción-----");
					System.out.println("a. Ingresar un Auto");
					System.out.println("b. Alquilar un Auto");
					System.out.println("c. Aplazar fecha de Entrga");
					String empleado = teclado1.nextLine();
					System.out.println();

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
						String avaluo = teclado1.nextLine();

						Automovil automovil = new Automovil();
						automovil.setPlaca(placa);
						automovil.setModelo(modelo);
						automovil.setMarca(marca);
						automovil.setAnioFabricacion(añoFabricacion);
						automovil.setPaisFabricacion(paisFabricacion);
						automovil.setCilindraje(cilindraje);
						automovil.setAvaluo(avaluo);

						Camioneta camioneta = new Camioneta();
						camioneta.setPlaca(placa);
						camioneta.setModelo(modelo);
						camioneta.setMarca(marca);
						camioneta.setAnioFabricacion(añoFabricacion);
						camioneta.setPaisFabricacion(paisFabricacion);
						camioneta.setCilindraje(cilindraje);
						camioneta.setAvaluo(avaluo);

						System.out.println("--Eliga el tipo de Auto--");
						System.out.println("1. Automóvil");
						System.out.println("2. Camioneta");
						String tipoAuto = teclado1.nextLine();
						
						Auto nuevoAuto = new Auto();

						if (tipoAuto.equals("1")) {
							System.out.println("--Automóvil--");
							System.out.println("-Número de puertas-");
							String numeroPuertas = teclado1.nextLine();
							automovil.setNumeroPuertas(numeroPuertas);

							List<Automovil> tipoAuto1 = new ArrayList<Automovil>();
							tipoAuto1.add(automovil);
//							tipoAuto1.forEach(System.out::println);
							System.out.println("-Ha sido guardado exitosamente-");
							System.out.println();

						} else {
							if (tipoAuto.equals("2")) {
								System.out.println("--Camioneta--");
								System.out.println("-Peso que soporta-");
								String pesoSoporta = teclado1.nextLine();
								camioneta.setPesoSoporta(pesoSoporta);
								
								List<Camioneta> tipoAuto1 = new ArrayList<Camioneta>();
								tipoAuto1.add(camioneta);
//								tipoAuto1.forEach(System.out::println);
								System.out.println("-Ha sido guardado exitosamente-");
								System.out.println();
							}

						}

					}

					if (empleado.equals("b")) {
						System.out.println("-Ingrese placa del Auto-");
						String placa = teclado1.nextLine();
						boolean comparacion = false;
						System.out.println();
						
						for (int i = 0; i < listaAutos.size(); i++) {
							Auto alquilarAuto = listaAutos.get(i);
							String placaExiste = alquilarAuto.getPlaca();
							boolean comparacion1 = placa.equals(placaExiste);
							
							if (comparacion1 == true ) {
								comparacion = true;
								String estado = alquilarAuto.getEstado();
								
								if (estado.equals("Reservado")) {
									
									System.out.println("--Auto Reservado--");
									System.out.println(listaAutos.get(i));
									System.out.println();
									System.out.println("-----Elija Opción-----");
									System.out.println("1. Alquilar");
									System.out.println("2. No alquilar");
									String alquilar = teclado1.nextLine();
									System.out.println();
									
									if (alquilar.equals("1")) {
										listaAutos.get(i).setEstado("Alquilado");
										System.out.println("Auto alquilado");
										System.out.println("Fecha de entrega del auto: "+ listaAutos.get(i).getFechaEntrega());
										System.out.println();
									}else {
										if (alquilar.equals("2")) {
											System.out.println("No alquilo ningún auto");
											System.out.println();
										}
									}
								}
								
							}
							
						}

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

		} while (opcion != 3);
	}

}
