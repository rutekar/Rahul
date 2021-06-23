package com.example.demo;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Dao.UserRepository;
import com.example.demo.entity.User;

@SpringBootApplication
public class SpringMvcwithBoot3Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(SpringMvcwithBoot3Application.class, args);
		
		UserRepository userRepository=context.getBean(UserRepository.class);
		
//		User user=new User();
//		user.setName("Rahul");
//		user.setCity("mumbai");
//		user.setStatus("Java programmer");
//		
		//This is to add single user at a time
//		User user1=userRepository.save(user);
//		System.out.println(user1);
		
//		
//		User user1=new User();
//		user1.setName("Gigi");
//		user1.setCity("Standford");
//		user1.setStatus(" Python programmer");
//		
//		User user2=new User();
//		user2.setName("Zayn");
//		user2.setCity("London");
//		user2.setStatus("DBA");
//		
//		//This is to update mutliple user at same time.
//		List<User> users=List.of(user1,user2);
//		Iterable<User> result=userRepository.saveAll(users);
//		
//		result.forEach(user ->{
//			System.out.println(user);
//		});
//		
//		System.out.println("done");
		
//		//READ
//		Optional<User> optional = userRepository.findById(3);
//		User user = optional.get();
//		System.out.println(user);
//		
//		//UPDATE
//		user.setStatus("Software tester");
//		User result = userRepository.save(user);
//		System.out.println(result);
//		System.out.println("done");
		
		//To get all data using iterator
		Iterable<User> itr = userRepository.findAll();
		Iterator<User> iterator=itr.iterator();
		
		while(iterator.hasNext()) {
			User user = iterator.next();
			System.out.println(user);
		}
		
		System.out.println("using lamda ....");
		//To get all data using lamda
		itr.forEach(user->{
			System.out.println(user);
		});
		
		//To delet by id
//		userRepository.deleteById(3);
//		System.out.println("Deleted");
	}

}
