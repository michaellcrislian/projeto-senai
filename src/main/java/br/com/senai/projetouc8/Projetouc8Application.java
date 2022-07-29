package br.com.senai.projetouc8;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.senai.projetouc8.orm.Grupo;
import br.com.senai.projetouc8.repository.GrupoRepository;

@SpringBootApplication
public class Projetouc8Application implements CommandLineRunner
{
	private final GrupoRepository repository;
	
	public Projetouc8Application(GrupoRepository repository)
	{
		this.repository = repository;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Projetouc8Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception 
	{
		Grupo grupo = new Grupo();
		grupo.setGrupo("TINTAS");
		repository.save(grupo);
	}
}
