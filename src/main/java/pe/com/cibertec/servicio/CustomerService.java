package pe.com.cibertec.servicio;

import java.util.List;
import pe.com.cibertec.domain.Customer;

/**
 *
 * @author melic
 */
public interface CustomerService {

    public List<Customer> listar();

    public void guardar(Customer customer);

    public void eliminar(Customer customer);

    public Customer buscar(Customer customer);

    public Customer actualizar(Customer customer);
}
