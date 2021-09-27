package proyecto.auto;

public class Automovil {

	private String placa;
	private String modelo;
	private String marca;
	private String anioFabricacion;
	private String paisFabricacion;
	private String cilindraje;
	private String avaluo;
	private String numeroPuertas;
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getAnioFabricacion() {
		return anioFabricacion;
	}
	public void setAnioFabricacion(String anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}
	public String getPaisFabricacion() {
		return paisFabricacion;
	}
	public void setPaisFabricacion(String paisFabricacion) {
		this.paisFabricacion = paisFabricacion;
	}
	public String getCilindraje() {
		return cilindraje;
	}
	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}
	public String getAvaluo() {
		return avaluo;
	}
	public void setAvaluo(String avaluo) {
		this.avaluo = avaluo;
	}
	public String getNumeroPuertas() {
		return numeroPuertas;
	}
	public void setNumeroPuertas(String numeroPuertas) {
		this.numeroPuertas = numeroPuertas;
	}
	@Override
	public String toString() {
		return "Automovil [placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + ", anioFabricacion="
				+ anioFabricacion + ", paisFabricacion=" + paisFabricacion + ", cilindraje=" + cilindraje + ", avaluo="
				+ avaluo + ", numeroPuertas=" + numeroPuertas + "]";
	}
	
}
