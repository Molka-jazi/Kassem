package com.example.atelier1.Service;

import com.example.atelier1.Repository.IContratRepository;
import com.example.atelier1.entities.Contrat;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Supplier;
import java.util.logging.Logger;

@Service
@Slf4j
    public class ContratService implements IContratService{

    @Autowired
    IContratRepository repositoryContrat;


    @Override
    public boolean updateContrat(Contrat c) {
        if(repositoryContrat.existsById(c.getIdContract())){
            repositoryContrat.save(c);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean deleteContrat(Integer idContrat) {
        if(repositoryContrat.existsById(idContrat)){
            repositoryContrat.deleteById(idContrat);
           return true;
        }else{
        return false;
    }
    }

    @Override
    public int addContrat(Contrat contrat) {

        return repositoryContrat.save(contrat).getIdContract();
    }

    @Override
    public Contrat getContrat(int contrat) {

        return repositoryContrat.findById(contrat).get();
    }

    @Override
    public List<Contrat> getContrat() {

        return  repositoryContrat.findAll();
    }

    @Override
    @Scheduled(cron= "*/20 * * * * *" )
    public  List<Contrat> OrderBy() {
     List<Contrat> List=  repositoryContrat.x1();
        return List;
    }
}
