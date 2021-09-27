package proyecto.auto;

public class Auto {

	private String placa;
	private String modelo;
	private String marca;
	private String anio;
	private String estado;
	private String fechaEntrega;
	
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
	public String getAño() {
		return anio;
	}
	public void setAño(String anio) {
		this.anio = anio;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getFechaEntrega() {
		return fechaEntrega;
	}
	public void setFechaEntrega(String fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	@Override
	public String toString() {
		return "Auto [placa= " + placa + ", modelo= " + modelo + ", marca= " + marca + ", año= " + anio + ", estado= "
				+ estado + ", fechaEntrega= " + fechaEntrega + "]";
	}
	
	
}
