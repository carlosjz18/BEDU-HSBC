package mx.com.cj.api.repository;

import mx.com.cj.api.entity.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IModuleRepository extends JpaRepository<Module, Long> {
}
