package net.snascimento.springbootcleanarch.main;

import net.snascimento.springbootcleanarch.application.gateways.UserGateway;
import net.snascimento.springbootcleanarch.application.usecases.CreateUserInteractor;
import net.snascimento.springbootcleanarch.infrastructure.controllers.UserDTOMapper;
import net.snascimento.springbootcleanarch.infrastructure.gateways.UserEntityMapper;
import net.snascimento.springbootcleanarch.infrastructure.gateways.UserRepositoryGateway;
import net.snascimento.springbootcleanarch.infrastructure.persistence.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {
  @Bean
  CreateUserInteractor createUserCase(UserGateway userGateway) {
    return new CreateUserInteractor(userGateway);
  }

  @Bean
  UserGateway userGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
    return new UserRepositoryGateway(userRepository, userEntityMapper);
  }

  @Bean
  UserEntityMapper userEntityMapper() {
    return new UserEntityMapper();
  }

  @Bean
  UserDTOMapper userDTOMapper() {
    return new UserDTOMapper();
  }
}
