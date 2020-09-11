package com.christ.smartvideo2.repository;

import com.christ.smartvideo2.domain.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface MoviesRepository extends JpaRepository<Movies,Integer> {
    @Query(value = "select * from mac_vod where type_id_1=?1 ",nativeQuery=true)
    public List<Movies> getMoviesByType(int type);
    @Query(value = "select * from mac_vod where type_id=?1 ",nativeQuery=true)
    public List<Movies> getFilmsByType(int type);
    @Query(value = "select * from mac_vod order by rand( ) limit 1",nativeQuery=true)
    public List<Movies> getFilmsByRand();
}
