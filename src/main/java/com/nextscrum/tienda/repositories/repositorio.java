package repositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tienda.modelo.Empleado;

import java.util.ArrayList;

@Repository
public interface repositorio extends CrudRepository<Empleado, Long> {

    public abstract ArrayList<Empleado> findByPrioridad(Integer prioridad);

}
