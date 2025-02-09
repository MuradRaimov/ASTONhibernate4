package com.example.astonhibernate.mapper;

import com.example.astonhibernate.dto.ClothesDto;
import com.example.astonhibernate.entity.Clothes;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-24T13:37:20+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Amazon.com Inc.)"
)
@Component
public class ClothesMapperImpl implements ClothesMapper {

    @Override
    public ClothesDto toDto(Clothes entity) {
        if ( entity == null ) {
            return null;
        }

        ClothesDto clothesDto = new ClothesDto();

        clothesDto.setId( entity.getId() );
        clothesDto.setName( entity.getName() );
        clothesDto.setType( entity.getType() );
        clothesDto.setUser( entity.getUser() );

        return clothesDto;
    }

    @Override
    public List<ClothesDto> toDto(List<Clothes> entities) {
        if ( entities == null ) {
            return null;
        }

        List<ClothesDto> list = new ArrayList<ClothesDto>( entities.size() );
        for ( Clothes clothes : entities ) {
            list.add( toDto( clothes ) );
        }

        return list;
    }

    @Override
    public Clothes toEntity(ClothesDto dto) {
        if ( dto == null ) {
            return null;
        }

        Clothes clothes = new Clothes();

        clothes.setId( dto.getId() );
        clothes.setName( dto.getName() );
        clothes.setType( dto.getType() );
        clothes.setUser( dto.getUser() );

        return clothes;
    }

    @Override
    public List<Clothes> toEntity(List<ClothesDto> dto) {
        if ( dto == null ) {
            return null;
        }

        List<Clothes> list = new ArrayList<Clothes>( dto.size() );
        for ( ClothesDto clothesDto : dto ) {
            list.add( toEntity( clothesDto ) );
        }

        return list;
    }
}
