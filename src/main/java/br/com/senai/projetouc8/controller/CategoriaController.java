package br.com.senai.projetouc8.controller;

import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.senai.projetouc8.orm.Categoria;
import br.com.senai.projetouc8.servico.CategoriaServico;

@Controller
public class CategoriaController 
{
	@Autowired
	private CategoriaServico servico;
	
	@GetMapping({"/categoria","/"})
	public String listarCategorias(Model modelo)
	{
		modelo.addAttribute("categoria", servico.listarCategorias());
		return "categoria";
	}
	
	@GetMapping({"/categoria/{id}"})
	public String apagarCategoria(@PathVariable Integer id)
	{
		servico.apagarCategoria(id);
		return "redirect:/categoria";
	}
	
	@GetMapping("/categoria/adicionar")
	public String adicionarCategoria(Model modelo)
	{
		Categoria categoria = new Categoria();
		modelo.addAttribute("categoria", categoria);
		return "formCategoria";
	}
	
	@PostMapping("/categoria")
	public String salvarCategoria(@ModelAttribute("categoria")Categoria categoria)
	{
		servico.salvarCategoria(categoria);
		return "redirect:/categoria";
	}
}