package ifal.web.com.amazom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ifal.web.com.amazom.model.ItemCarrinho;

@Repository
public interface ItemCarrinhoRepository extends JpaRepository<ItemCarrinho, Integer>{

}
