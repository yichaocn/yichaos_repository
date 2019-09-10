package provide.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import services.UserService;

@Component
@Service(application = "hello")
public class UserServiceImpl implements UserService {
    @Override
    public void intro() {
        System.out.println("Hello I AM  DUBBO PROVIDE ^^");
    }
}
