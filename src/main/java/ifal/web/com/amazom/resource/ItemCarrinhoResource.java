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

import ifal.web.com.amazom.model.ItemCarrinho;
import ifal.web.com.amazom.repository.ItemCarrinhoRepository;

@RestController
@RequestMapping("/api/itemcarrinho")
public class ItemCarrinhoResource {
	@Autowired 
	ItemCarrinhoRepository itemCarrinhoRepository;
	
	@GetMapping
	public List<ItemCarrinho> get(){
		return itemCarrinhoRepository.findAll();
	}
	
	@GetMapping("{id}")
		public ItemCarrinho get(@PathVariable("id") Integer id) {
		return itemCarrinhoRepository.getOne(id);
	}
	
	@PostMapping
	public void save(@RequestBody ItemCarrinho itemCarrinho) {
		itemCarrinhoRepository.save(itemCarrinho);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable("id") Integer id) {
		itemCarrinhoRepository.deleteById(id);
	}
}
