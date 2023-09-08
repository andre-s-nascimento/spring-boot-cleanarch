package net.snascimento.springbootcleanarch.application.usecases;

import net.snascimento.springbootcleanarch.application.gateways.UserGateway;
import net.snascimento.springbootcleanarch.domain.entity.User;

// @Service
public class CreateUserInteractor {
  private final UserGateway userGateway;

  public CreateUserInteractor(UserGateway userGateway) {
    this.userGateway = userGateway;
  }

  public User createUser(User user) {
    return userGateway.createUser(user);
  }
}
