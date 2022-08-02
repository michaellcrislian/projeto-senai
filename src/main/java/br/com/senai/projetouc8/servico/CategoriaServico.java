package br.com.senai.projetouc8.servico;


import java.util.List;
import br.com.senai.projetouc8.orm.Categoria;

public interface CategoriaServico 
{
	public List<Categoria> listarCategorias();
	
	public void apagarCategoria(Integer id);
	
}
