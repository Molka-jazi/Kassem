package com.example.atelier1.Service;

import com.example.atelier1.Repository.IEquipeRepository;
import com.example.atelier1.entities.Equipe;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipeService implements IEquipeService{
    @Autowired
    IEquipeRepository iEquipeRepository;
    @Override
    public boolean updateEquipe(Equipe equipe) {
        if(iEquipeRepository.existsById(equipe.getIdEquipe())){
            iEquipeRepository.save(equipe);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean deleteEquipe(Integer idEquipe) {
        if(iEquipeRepository.existsById(idEquipe)){
            iEquipeRepository.deleteById(idEquipe);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int addEquipe(Equipe equipe) {
        return iEquipeRepository.save(equipe).getIdEquipe();
    }

    @Override
    public Equipe getEquipe(int idequipe) {
        return iEquipeRepository.findById(idequipe).get();

    }

    @Override
    public List<Equipe> getEquipe() {
        return iEquipeRepository.findAll();
    }


    @Override
    public List<Equipe> getContrat() {
        return iEquipeRepository.findAll();
    }




}
