package bookpra.bookcon.service;

import bookpra.bookcon.dao.CustomerDAO;
import bookpra.bookcon.entity.Customer;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CustomerService {

    CustomerDAO dao;


    public List<Customer> findAll() {
        return dao.findAll();
    }

    public void save(Customer c) {
        dao.save(c);
    }

    public Optional<Customer> findById(int custid) {
        return dao.findById(custid);
    }

    public void deleteById(int custid) {
        dao.deleteById(custid);
    }
}
