package net.snascimento.springbootcleanarch.infrastructure.gateways;

import net.snascimento.springbootcleanarch.domain.entity.User;
import net.snascimento.springbootcleanarch.infrastructure.persistence.UserEntity;

public class UserEntityMapper {
    UserEntity toEntity(User userDomainObj){
        return new UserEntity(userDomainObj.username(), userDomainObj.password(), userDomainObj.password());
    }

    User toDomainObj(UserEntity userEntity){
        return new User(userEntity.getUsername(), userEntity.getPassword(), userEntity.getEmail());
    }
}
