package net.snascimento.springbootcleanarch.application.gateways;

import net.snascimento.springbootcleanarch.domain.entity.User;

public interface UserGateway {
    User createUser(User user);
}
