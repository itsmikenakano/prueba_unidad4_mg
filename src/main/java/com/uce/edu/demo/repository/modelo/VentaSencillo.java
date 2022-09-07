package com.uce.edu.demo.repository.modelo;

public class VentaSencillo {
	
	private String codigoBarras;
	
	private Integer cantidad;
	
	private String cedulaCliente;
	
	private String numero;

	public VentaSencillo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VentaSencillo(String codigoBarras, Integer cantidad, String cedulaCliente, String numero) {
		super();
		this.codigoBarras = codigoBarras;
		this.cantidad = cantidad;
		this.cedulaCliente = cedulaCliente;
		this.numero = numero;
	}
	
	//set y get
	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(String cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	

}
