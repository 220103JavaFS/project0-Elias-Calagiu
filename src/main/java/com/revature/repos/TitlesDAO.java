package com.revature.repos;

import com.revature.models.Titles;

import java.util.List;

public interface TitlesDAO {

    List<Titles> findAllTitles();
    Titles findbyTitle (int id);
    boolean updateTitle(Titles titles);
//    boolean
}
