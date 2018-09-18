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

import ifal.web.com.amazom.model.Departamento;
import ifal.web.com.amazom.repository.DepartamentoRepository;

@RestController
@RequestMapping("/api/departamento")

public class DepartamentoResource {


		@Autowired 
		DepartamentoRepository departamentoRepository;
		
		@GetMapping
		public List<Departamento> get(){
			return departamentoRepository.findAll();
		}
		
		@GetMapping("{id}")
		public Departamento get(@PathVariable("id") Integer id) {
			return departamentoRepository.getOne(id);
		}
		
		@PostMapping
		public void save(@RequestBody Departamento Departamento) {
			departamentoRepository.save(Departamento);
		}
		
		@DeleteMapping("{id}")
		public void delete(@PathVariable("id") Integer id) {
			departamentoRepository.deleteById(id);
		}
		

}
