package di;
import org.springframework.data.repository.CrudRepository;
import model.User;
public interface DI extends CrudRepository<User, String>{
	void save(org.apache.catalina.User object);
}
