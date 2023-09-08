package net.snascimento.springbootcleanarch.infrastructure.gateways;

import net.snascimento.springbootcleanarch.application.gateways.UserGateway;
import net.snascimento.springbootcleanarch.domain.entity.User;
import net.snascimento.springbootcleanarch.infrastructure.persistence.UserEntity;
import net.snascimento.springbootcleanarch.infrastructure.persistence.UserRepository;

public class UserRepositoryGateway implements UserGateway {
  private final UserRepository userRepository;
  private final UserEntityMapper userEntityMapper;

  public UserRepositoryGateway(UserRepository userRepository, UserEntityMapper userEntityMapper) {
    this.userRepository = userRepository;
    this.userEntityMapper = userEntityMapper;
  }

  @Override
  public User createUser(User userDomainObj) {
    UserEntity userEntity = userEntityMapper.toEntity(userDomainObj);
    UserEntity savedObj = userRepository.save(userEntity);
    return userEntityMapper.toDomainObj(savedObj);
  }
}
