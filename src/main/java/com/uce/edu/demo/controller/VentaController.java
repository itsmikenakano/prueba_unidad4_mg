package com.uce.edu.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.demo.repository.modelo.ProductoSolicitado;
import com.uce.edu.demo.repository.modelo.Venta;
import com.uce.edu.demo.repository.modelo.VentaSencillo;
import com.uce.edu.demo.service.IVentaService;

@Controller
@RequestMapping("/ventas")
public class VentaController {
	
	@Autowired
	private IVentaService iVentaService;
	
	@GetMapping("/nuevaVenta")
	public String paginaNuevaVenta(VentaSencillo venta) {
		return "vistaNuevaVenta";

	}

	@PostMapping("/vender")
	public String realizarVenta(VentaSencillo venta) {
		ProductoSolicitado producto = new ProductoSolicitado(venta.getCodigoBarras(),venta.getCantidad());
		List<ProductoSolicitado> canasta = new ArrayList<>();
		canasta.add(producto);
		System.out.println(producto.getCodigoBarras() + " " +producto.getCantidad());
		this.iVentaService.realizarVenta(canasta, venta.getCedulaCliente(), venta.getNumero());
		return "redirect:/ventas/nuevaVenta";

	}

}
