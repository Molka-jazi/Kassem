package com.example.atelier1.Service;

import com.example.atelier1.entities.DetailEquipe;

import java.util.List;

public interface IDetailEquipeSevice {
    boolean updateDetailEquipe(DetailEquipe detailEquipe);
    boolean deleteDetailEquipe(Integer iddetailEquipe);
    int addDetailEquipe(DetailEquipe detailEquipe);
    DetailEquipe getDetailEquipe(int iddetailEquipe);
    List<DetailEquipe> getDetailEquipe();
}
