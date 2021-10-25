package org.github.boutanche.exo1.service.impl;

import org.github.boutanche.exo1.domain.entity.Utilisateur;
import org.github.boutanche.exo1.domain.repository.UtilisateurRepository;
import org.github.boutanche.exo1.service.UserService;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

/**
 * Implémentation de l'interface {@link UserService}
 */
@Service
public class UserServiceImpl implements UserService {
    private final UtilisateurRepository utilisateurRepository;

    public UserServiceImpl(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
    }

    @Override
    public Utilisateur create(Utilisateur utilisateur) {
        Utilisateur utilisateur1 = utilisateurRepository.add(utilisateur);
        return utilisateur1;
    }
    @Override
    public void update(Utilisateur utilisateur) {
        utilisateurRepository.update(utilisateur);
    }
    @Override
    public Utilisateur select(Integer id) {
        return utilisateurRepository.findById(id);
    }
    @Override
    public void delete(Integer id) {
        utilisateurRepository.deleteById(id);
    }


}
