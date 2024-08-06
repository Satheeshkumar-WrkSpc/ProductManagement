package com.snss.productManagement.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories(basePackages = "com.snss.productManagement.userRepo",
entityManagerFactoryRef = "userEntityManagerFactory",
transactionManagerRef = "userTransactionManager")
public class UserDataSourceConfig {

	   @Bean(name = "userDataSource")
	   @ConfigurationProperties(prefix = "spring.datasource.user")
	    public DataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	        dataSource.setUrl("jdbc:mysql://localhost:3306/user_management");
	        dataSource.setUsername("root");
	        dataSource.setPassword("@240423Ss");
	        return dataSource; 
	    }


	    @Bean(name = "userEntityManagerFactory")
	    public LocalContainerEntityManagerFactoryBean entityManagerFactory(
	        @Qualifier("userDataSource") DataSource dataSource) {
	        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
	        em.setDataSource(dataSource);
	        em.setPackagesToScan("com.snss.productManagement.entity.userDataSource");
	        em.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
	        em.setJpaProperties(additionalProperties());
	        return em;
	    } 

	    @Bean(name = "userTransactionManager")
	    public PlatformTransactionManager transactionManager(
	            @Qualifier("userEntityManagerFactory") EntityManagerFactory entityManagerFactory) {
	        JpaTransactionManager transactionManager = new JpaTransactionManager();
	        transactionManager.setEntityManagerFactory(entityManagerFactory);
	        return transactionManager;
	    } 
	    
	    private Properties additionalProperties() {
	        Properties properties = new Properties();
	        properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
	        properties.setProperty("hibernate.hbm2ddl.auto", "update");
	        properties.setProperty("hibernate.show_sql", "true");
	        return properties;
	    }
}
