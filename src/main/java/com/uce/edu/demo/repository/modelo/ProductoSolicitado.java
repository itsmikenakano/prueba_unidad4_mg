package com.uce.edu.demo.repository.modelo;

public class ProductoSolicitado {

	private String codigoBarras;

	private Integer cantidad;

	public ProductoSolicitado() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductoSolicitado(String codigoBarras, Integer cantidad) {
		super();
		this.codigoBarras = codigoBarras;
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "ProductoSolicitado [codigoBarras=" + codigoBarras + ", cantidad=" + cantidad + "]";
	}

	// SET Y GET
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

}
