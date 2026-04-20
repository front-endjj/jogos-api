package com.devjose.jogos_api.service;

import com.devjose.jogos_api.model.Jogo;
import com.devjose.jogos_api.repository.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JogoService {

    @Autowired
    private JogoRepository repository;

    public List<Jogo> listar() {
        return repository.findAll();
    }

    public Jogo buscarPorId(Long id) {
        Optional<Jogo> jogo = repository.findById(id);

        return jogo.orElse(null);
    }

    public Jogo inserir(Jogo jogo) {
        return repository.save(jogo);
    }

    public Jogo atualizar(Long id, Jogo jogoAtualizada) {
        Jogo jogo = buscarPorId(id);

        if (jogo != null){
            jogo.setNome(jogoAtualizada.getNome());
            jogo.setGenero(jogoAtualizada.getGenero());
            jogo.setPlataforma(jogoAtualizada.getPlataforma());
            return repository.save(jogo);
        }
        return null;
    }

    public boolean deletar(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }

}
