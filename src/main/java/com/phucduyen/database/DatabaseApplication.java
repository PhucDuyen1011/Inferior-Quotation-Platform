package com.phucduyen.database;

import com.phucduyen.database.enums.Role;
import com.phucduyen.database.models.entity_models.Account;
import com.phucduyen.database.models.entity_models.AccountStatus;
import com.phucduyen.database.repositories.AccountRepo;
import com.phucduyen.database.repositories.AccountStatusRepo;
import com.phucduyen.database.services.JWTService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@RequiredArgsConstructor
public class DatabaseApplication {

	private final AccountRepo accountRepo;
	private final AccountStatusRepo accountStatusRepo;
	private final JWTService jwtService;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(){
		return new CommandLineRunner() {
			@Override
			public void run(String... args) throws Exception {
				//init status
				AccountStatus available = AccountStatus.builder()
						.status("available")
						.build();
				AccountStatus unavailable = AccountStatus.builder()
						.status("unavailable")
						.build();

				available = accountStatusRepo.save(available);
				unavailable = accountStatusRepo.save(unavailable);

				//init account
				Account customer = Account.builder()
						.email("customer@gmail.com")
						.pass("123")
						.role(Role.CUSTOMER)
						.status(available)
						.build();

				Account staff = Account.builder()
						.email("staff@gmail.com")
						.pass("123")
						.role(Role.STAFF)
						.status(available)
						.build();

				Account manager = Account.builder()
						.email("manager@gmail.com")
						.pass("123")
						.role(Role.MANAGER)
						.status(available)
						.build();

				Account admin = Account.builder()
						.email("admin@gmail.com")
						.pass("123")
						.role(Role.ADMIN)
						.status(available)
						.build();

				accountRepo.save(customer);
				accountRepo.save(staff);
				accountRepo.save(manager);
				accountRepo.save(admin);

				//init token
				String customerToken = jwtService.generateToken(customer);
				String managerToken = jwtService.generateToken(manager);
				String staffToken = jwtService.generateToken(staff);
				String adminToken = jwtService.generateToken(admin);

				System.out.println("CUSTOMER: " + customerToken);
				System.out.println("STAFF: " + staffToken);
				System.out.println("MANAGER: " + managerToken);
				System.out.println("ADMIN: " + adminToken);
			}
		};
	}

}
