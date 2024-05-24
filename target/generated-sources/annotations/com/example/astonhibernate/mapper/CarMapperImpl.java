package com.example.astonhibernate.mapper;

import com.example.astonhibernate.dto.CarDto;
import com.example.astonhibernate.entity.Car;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-05-24T10:36:12+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Amazon.com Inc.)"
)
@Component
public class CarMapperImpl implements CarMapper {

    @Override
    public CarDto toDto(Car entity) {
        if ( entity == null ) {
            return null;
        }

        CarDto carDto = new CarDto();

        carDto.setId( entity.getId() );
        carDto.setModel( entity.getModel() );
        carDto.setType( entity.getType() );
        carDto.setUser( entity.getUser() );

        return carDto;
    }

    @Override
    public List<CarDto> toDto(List<Car> entities) {
        if ( entities == null ) {
            return null;
        }

        List<CarDto> list = new ArrayList<CarDto>( entities.size() );
        for ( Car car : entities ) {
            list.add( toDto( car ) );
        }

        return list;
    }

    @Override
    public Car toEntity(CarDto dto) {
        if ( dto == null ) {
            return null;
        }

        Car car = new Car();

        car.setId( dto.getId() );
        car.setModel( dto.getModel() );
        car.setType( dto.getType() );
        car.setUser( dto.getUser() );

        return car;
    }

    @Override
    public List<Car> toEntity(List<CarDto> dto) {
        if ( dto == null ) {
            return null;
        }

        List<Car> list = new ArrayList<Car>( dto.size() );
        for ( CarDto carDto : dto ) {
            list.add( toEntity( carDto ) );
        }

        return list;
    }
}
