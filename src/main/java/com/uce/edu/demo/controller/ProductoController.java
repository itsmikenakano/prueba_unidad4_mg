package com.uce.edu.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.demo.repository.modelo.Producto;
import com.uce.edu.demo.repository.modelo.ProductoConsulta;
import com.uce.edu.demo.service.IProductoService;

@Controller
@RequestMapping("/productos")
public class ProductoController {

	@Autowired
	private IProductoService iProductoService;

	@GetMapping("/nuevoProducto")
	public String paginaNuevoProducto(Producto producto) {
		return "vistaNuevoProducto";

	}

	@PostMapping("/ingresar")
	public String insertarProducto(Producto producto) {

		this.iProductoService.ingresarProducto(producto);
		return "redirect:/productos/nuevoProducto";

	}
	
	@GetMapping("/buscarProducto")
	public String paginaBuscarProducto(Producto producto) {
		return "vistaBuscarProducto";
	}

	// GET
	@GetMapping("/buscar/{codigoBarras}")
	public String buscarStockProducto(@PathVariable("codigoBarras") String codigo, Model modelo) {
		ProductoConsulta producto = this.iProductoService.buscarPorCodigo(codigo);
		modelo.addAttribute("producto", producto);
		return "vistaProducto";
	}

}
