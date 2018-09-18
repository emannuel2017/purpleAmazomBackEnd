package ifal.web.com.amazom.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ifal.web.com.amazom.model.Produto;
import ifal.web.com.amazom.repository.ProdutoRepository;

@RestController
@RequestMapping("/api/produto")
public class ProdutoResource {
	@Autowired 
	ProdutoRepository produtoRepository;
	
	@GetMapping
	public List<Produto> get(){
		return produtoRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Produto get(@PathVariable("id") Integer id) {
		return produtoRepository.getOne(id);
	}
	
	@PostMapping
	public void save(@RequestBody Produto Produto) {
		produtoRepository.save(Produto);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		produtoRepository.deleteById(id);
	}
}
