import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.way2learnonline.repository.AccountRepository;
import com.way2learnonline.repository.JdbcAccountRepositoryImpl;
import com.way2learnonline.repository.JdbcRewardRepositoryImpl;
import com.way2learnonline.repository.RewardRepository;

@Configuration
public class BankAppConfiguration {
	
	@Bean
	public BasicDataSource createDataSource() {
		
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUsername("root");
		dataSource.setPassword("SuhRoot123");
		dataSource.setUrl("jdbc:mysql://localhost:3306/mydb");
		
		return dataSource;	
	}
	
	@Bean
	public AccountRepository createAccountRepository(BasicDataSource dataSource) {
		return new JdbcAccountRepositoryImpl(dataSource);
	}
	
	@Bean
	public RewardRepository createRewardRepository(BasicDataSource dataSource) {
		return new JdbcRewardRepositoryImpl(dataSource);
	}

}
