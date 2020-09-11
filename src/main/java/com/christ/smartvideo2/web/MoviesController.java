package com.christ.smartvideo2.web;

import com.christ.smartvideo2.domain.Film;
import com.christ.smartvideo2.domain.Movies;
import com.christ.smartvideo2.domain.Url;
import com.christ.smartvideo2.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MoviesController {

    private MoviesRepository moviesRepository;
    @Autowired
    public void setMoviesRepository(MoviesRepository moviesRepository){
        this.moviesRepository=moviesRepository;
    }

    @RequestMapping("/getall")
    @ResponseBody
    public List<Film> getmovies(int typeid1){
        List<Movies> moviesList;
        if(typeid1==1||typeid1==2){
            moviesList=moviesRepository.getMoviesByType(typeid1);
        }else{
            moviesList=moviesRepository.getFilmsByType(typeid1);
        }
        List<Film> filmList=new ArrayList<>();
        String url;
        List<String> url_split=new ArrayList<>();
        for(int i=0;i<moviesList.size();i++){
            url=moviesList.get(i).getVod_play_url();
            String[] temp= url.split("\\$\\$\\$");
            Film film=new Film();
            film.setVod_id(moviesList.get(i).getVod_id());
            film.setType_id(moviesList.get(i).getType_id());
            film.setType_id_1(moviesList.get(i).getType_id_1());
            film.setGroup_id(moviesList.get(i).getGroup_id());
            film.setVod_name(moviesList.get(i).getVod_name());
            film.setVod_sub(moviesList.get(i).getVod_sub());
            film.setVod_en(moviesList.get(i).getVod_en());
            film.setVod_status(moviesList.get(i).getVod_status());
            film.setVod_letter(moviesList.get(i).getVod_letter());
            film.setVod_color(moviesList.get(i).getVod_color());
            film.setVod_tag(moviesList.get(i).getVod_tag());
            film.setVod_class(moviesList.get(i).getVod_class());
            film.setVod_pic(moviesList.get(i).getVod_pic());
            film.setVod_pic_thumb(moviesList.get(i).getVod_pic_thumb());
            film.setVod_pic_slide(moviesList.get(i).getVod_pic_slide());
            film.setVod_actor(moviesList.get(i).getVod_actor());
            film.setVod_director(moviesList.get(i).getVod_director());
            film.setVod_writer(moviesList.get(i).getVod_writer());
            film.setVod_behind(moviesList.get(i).getVod_behind());
            film.setVod_blurb(moviesList.get(i).getVod_blurb());
            film.setVod_remarks(moviesList.get(i).getVod_remarks());
            film.setVod_pubdate(moviesList.get(i).getVod_pubdate());
            film.setVod_total(moviesList.get(i).getVod_total());
            film.setVod_serial(moviesList.get(i).getVod_serial());
            film.setVod_tv(moviesList.get(i).getVod_tv());
            film.setVod_weekday(moviesList.get(i).getVod_weekday());
            film.setVod_area(moviesList.get(i).getVod_area());
            film.setVod_lang(moviesList.get(i).getVod_lang());
            film.setVod_year(moviesList.get(i).getVod_year());
            film.setVod_version(moviesList.get(i).getVod_version());
            film.setVod_state(moviesList.get(i).getVod_state());
            film.setVod_author(moviesList.get(i).getVod_author());
            film.setVod_jumpurl(moviesList.get(i).getVod_jumpurl());
            film.setVod_tpl(moviesList.get(i).getVod_tpl());
            film.setVod_tpl_play(moviesList.get(i).getVod_tpl_play());
            film.setVod_tpl_down(moviesList.get(i).getVod_tpl_down());
            film.setVod_isend(moviesList.get(i).getVod_isend());
            film.setVod_lock(moviesList.get(i).getVod_lock());
            film.setVod_level(moviesList.get(i).getVod_level());
            film.setVod_copyright(moviesList.get(i).getVod_copyright());
            film.setVod_points(moviesList.get(i).getVod_points());
            film.setVod_points_play(moviesList.get(i).getVod_points_play());
            film.setVod_points_down(moviesList.get(i).getVod_points_down());
            film.setVod_hits(moviesList.get(i).getVod_hits());
            film.setVod_hits_day(moviesList.get(i).getVod_hits_day());
            film.setVod_hits_week(moviesList.get(i).getVod_hits_week());
            film.setVod_hits_month(moviesList.get(i).getVod_hits_month());
            film.setVod_duration(moviesList.get(i).getVod_duration());
            film.setVod_up(moviesList.get(i).getVod_up());
            film.setVod_down(moviesList.get(i).getVod_down());
            film.setVod_score(moviesList.get(i).getVod_score());
            film.setVod_score_all(moviesList.get(i).getVod_score_all());
            film.setVod_score_num(moviesList.get(i).getVod_score_num());
            film.setVod_time(moviesList.get(i).getVod_time());
            film.setVod_time_add(moviesList.get(i).getVod_time_add());
            film.setVod_time_hits(moviesList.get(i).getVod_time_hits());
            film.setVod_time_make(moviesList.get(i).getVod_time_make());
            film.setVod_trysee(moviesList.get(i).getVod_trysee());
            film.setVod_douban_id(moviesList.get(i).getVod_douban_id());
            film.setVod_douban_score(moviesList.get(i).getVod_douban_score());
            film.setVod_reurl(moviesList.get(i).getVod_reurl());
            film.setVod_rel_vod(moviesList.get(i).getVod_rel_vod());
            film.setVod_rel_art(moviesList.get(i).getVod_rel_art());
            film.setVod_pwd(moviesList.get(i).getVod_pwd());
            film.setVod_pwd_url(moviesList.get(i).getVod_pwd_url());
            film.setVod_pwd_play(moviesList.get(i).getVod_pwd_play());
            film.setVod_pwd_play_url(moviesList.get(i).getVod_pwd_play_url());
            film.setVod_pwd_down(moviesList.get(i).getVod_pwd_down());
            film.setVod_pwd_down_url(moviesList.get(i).getVod_pwd_down_url());
            film.setVod_content(moviesList.get(i).getVod_content());
            film.setVod_play_from(moviesList.get(i).getVod_play_from());
            film.setVod_play_note(moviesList.get(i).getVod_play_note());
            film.setVod_play_server(moviesList.get(i).getVod_play_server());
//            film.setVod_play_url(moviesList.get(i).getVod_play_url());
            film.setVod_down_from(moviesList.get(i).getVod_down_from());
            film.setVod_down_server(moviesList.get(i).getVod_down_server());
            film.setVod_down_note(moviesList.get(i).getVod_down_note());
            film.setVod_down_url(moviesList.get(i).getVod_down_url());
            if(typeid1==1){
                String[] temp1=temp[0].split("\\$");
                Url urlTemp=new Url(temp1[0],temp1[1]);
                List<Url> tempUrl=new ArrayList<>();
                tempUrl.add(urlTemp);
                film.setUrl(tempUrl);
            }else{
                String[] temp1=temp[0].split("#");
                Url urlTemp1;
                List<Url> tempUrl=new ArrayList<>();
                for (String temp2:temp1
                     ) {
                    String[] temp3=temp2.split("\\$");
                    urlTemp1=new Url(temp3[0],temp3[1]);
                    tempUrl.add(urlTemp1);
                }
                film.setUrl(tempUrl);
            }
            filmList.add(film);
        }
        return filmList;
    }
    @RequestMapping("/getAds")
    @ResponseBody
    public List<Film> getRand(){
        List<Movies> moviesList;
        moviesList=moviesRepository.getFilmsByRand();
        List<Film> ads=new ArrayList<>();
        String url;
        List<String> url_split=new ArrayList<>();
        url=moviesList.get(0).getVod_play_url();
        String[] temp= url.split("\\$\\$\\$");
            Film film=new Film();
            film.setVod_id(moviesList.get(0).getVod_id());
            film.setType_id(moviesList.get(0).getType_id());
            film.setType_id_1(moviesList.get(0).getType_id_1());
            film.setGroup_id(moviesList.get(0).getGroup_id());
            film.setVod_name(moviesList.get(0).getVod_name());
            film.setVod_sub(moviesList.get(0).getVod_sub());
            film.setVod_en(moviesList.get(0).getVod_en());
            film.setVod_status(moviesList.get(0).getVod_status());
            film.setVod_letter(moviesList.get(0).getVod_letter());
            film.setVod_color(moviesList.get(0).getVod_color());
            film.setVod_tag(moviesList.get(0).getVod_tag());
            film.setVod_class(moviesList.get(0).getVod_class());
            film.setVod_pic(moviesList.get(0).getVod_pic());
            film.setVod_pic_thumb(moviesList.get(0).getVod_pic_thumb());
            film.setVod_pic_slide(moviesList.get(0).getVod_pic_slide());
            film.setVod_actor(moviesList.get(0).getVod_actor());
            film.setVod_director(moviesList.get(0).getVod_director());
            film.setVod_writer(moviesList.get(0).getVod_writer());
            film.setVod_behind(moviesList.get(0).getVod_behind());
            film.setVod_blurb(moviesList.get(0).getVod_blurb());
            film.setVod_remarks(moviesList.get(0).getVod_remarks());
            film.setVod_pubdate(moviesList.get(0).getVod_pubdate());
            film.setVod_total(moviesList.get(0).getVod_total());
            film.setVod_serial(moviesList.get(0).getVod_serial());
            film.setVod_tv(moviesList.get(0).getVod_tv());
            film.setVod_weekday(moviesList.get(0).getVod_weekday());
            film.setVod_area(moviesList.get(0).getVod_area());
            film.setVod_lang(moviesList.get(0).getVod_lang());
            film.setVod_year(moviesList.get(0).getVod_year());
            film.setVod_version(moviesList.get(0).getVod_version());
            film.setVod_state(moviesList.get(0).getVod_state());
            film.setVod_author(moviesList.get(0).getVod_author());
            film.setVod_jumpurl(moviesList.get(0).getVod_jumpurl());
            film.setVod_tpl(moviesList.get(0).getVod_tpl());
            film.setVod_tpl_play(moviesList.get(0).getVod_tpl_play());
            film.setVod_tpl_down(moviesList.get(0).getVod_tpl_down());
            film.setVod_isend(moviesList.get(0).getVod_isend());
            film.setVod_lock(moviesList.get(0).getVod_lock());
            film.setVod_level(moviesList.get(0).getVod_level());
            film.setVod_copyright(moviesList.get(0).getVod_copyright());
            film.setVod_points(moviesList.get(0).getVod_points());
            film.setVod_points_play(moviesList.get(0).getVod_points_play());
            film.setVod_points_down(moviesList.get(0).getVod_points_down());
            film.setVod_hits(moviesList.get(0).getVod_hits());
            film.setVod_hits_day(moviesList.get(0).getVod_hits_day());
            film.setVod_hits_week(moviesList.get(0).getVod_hits_week());
            film.setVod_hits_month(moviesList.get(0).getVod_hits_month());
            film.setVod_duration(moviesList.get(0).getVod_duration());
            film.setVod_up(moviesList.get(0).getVod_up());
            film.setVod_down(moviesList.get(0).getVod_down());
            film.setVod_score(moviesList.get(0).getVod_score());
            film.setVod_score_all(moviesList.get(0).getVod_score_all());
            film.setVod_score_num(moviesList.get(0).getVod_score_num());
            film.setVod_time(moviesList.get(0).getVod_time());
            film.setVod_time_add(moviesList.get(0).getVod_time_add());
            film.setVod_time_hits(moviesList.get(0).getVod_time_hits());
            film.setVod_time_make(moviesList.get(0).getVod_time_make());
            film.setVod_trysee(moviesList.get(0).getVod_trysee());
            film.setVod_douban_id(moviesList.get(0).getVod_douban_id());
            film.setVod_douban_score(moviesList.get(0).getVod_douban_score());
            film.setVod_reurl(moviesList.get(0).getVod_reurl());
            film.setVod_rel_vod(moviesList.get(0).getVod_rel_vod());
            film.setVod_rel_art(moviesList.get(0).getVod_rel_art());
            film.setVod_pwd(moviesList.get(0).getVod_pwd());
            film.setVod_pwd_url(moviesList.get(0).getVod_pwd_url());
            film.setVod_pwd_play(moviesList.get(0).getVod_pwd_play());
            film.setVod_pwd_play_url(moviesList.get(0).getVod_pwd_play_url());
            film.setVod_pwd_down(moviesList.get(0).getVod_pwd_down());
            film.setVod_pwd_down_url(moviesList.get(0).getVod_pwd_down_url());
            film.setVod_content(moviesList.get(0).getVod_content());
            film.setVod_play_from(moviesList.get(0).getVod_play_from());
            film.setVod_play_note(moviesList.get(0).getVod_play_note());
            film.setVod_play_server(moviesList.get(0).getVod_play_server());
//            film.setVod_play_url(moviesList.get(i).getVod_play_url());
            film.setVod_down_from(moviesList.get(0).getVod_down_from());
            film.setVod_down_server(moviesList.get(0).getVod_down_server());
            film.setVod_down_note(moviesList.get(0).getVod_down_note());
            film.setVod_down_url(moviesList.get(0).getVod_down_url());
            if(moviesList.get(0).getType_id_1()==1){
                String[] temp1=temp[0].split("\\$");
                Url urlTemp=new Url(temp1[0],temp1[1]);
                List<Url> tempUrl=new ArrayList<>();
                tempUrl.add(urlTemp);
                film.setUrl(tempUrl);
            }else{
                String[] tempads1=temp[0].split("#");
                Url urlTemp1;
                List<Url> tempUrl=new ArrayList<>();
                for (String temp2:tempads1) {
                    String[] temp3=temp2.split("\\$");
                    urlTemp1=new Url(temp3[0],temp3[1]);
                    tempUrl.add(urlTemp1);
                }
                film.setUrl(tempUrl);
            }
            ads.add(film);
            return ads;
    }
}
