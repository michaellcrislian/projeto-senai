package br.com.senai.projetouc8.servico;


import java.util.List;
import br.com.senai.projetouc8.orm.Categoria;

public interface CategoriaServico 
{
	public List<Categoria> listarCategorias();
	
	public void apagarCategoria(Integer id);
	
	public Categoria salvarCategoria(Categoria categoria);
	
	public Categoria consultarCategoriaId(Integer id);
	
	public Categoria atualizarCategoria(Categoria categoria);
	
}
