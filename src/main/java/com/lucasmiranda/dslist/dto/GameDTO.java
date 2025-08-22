package com.lucasmiranda.dslist.dto;


import com.lucasmiranda.dslist.entities.Game;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

@Getter
@Setter
@NoArgsConstructor
public class GameDTO {

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;

    public GameDTO(Game entity){ BeanUtils.copyProperties(entity, this);}

}
