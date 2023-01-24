package com.example.atelier1.Service;

import com.example.atelier1.Repository.IDetailEquipeRepository;
import com.example.atelier1.entities.DetailEquipe;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DetailEquipeService implements IDetailEquipeSevice{
    @Autowired
    IDetailEquipeRepository repositoryDetailEquipe;
    @Override
    public boolean updateDetailEquipe(DetailEquipe detailEquipe) {
        if(repositoryDetailEquipe.existsById(detailEquipe.getSalle())){
            repositoryDetailEquipe.save(detailEquipe);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean deleteDetailEquipe(Integer iddetailEquipe) {
        if(repositoryDetailEquipe.existsById(iddetailEquipe)){
            repositoryDetailEquipe.deleteById(iddetailEquipe);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int addDetailEquipe(DetailEquipe detailEquipe) {
        return repositoryDetailEquipe.save(detailEquipe).getSalle();
    }

    @Override
    public DetailEquipe getDetailEquipe(int iddetailEquipe) {
        return repositoryDetailEquipe.findById(iddetailEquipe).get();
    }

    @Override
    public List<DetailEquipe> getDetailEquipe() {
        return  repositoryDetailEquipe.findAll();
    }
}
