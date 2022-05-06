package br.com.projetocrud.projetocrud.mapper;

import br.com.projetocrud.projetocrud.dto.UserDto;
import br.com.projetocrud.projetocrud.models.User;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserMapper {



    public static List<UserDto> converte(List<User> users){

    List<UserDto> lista = new ArrayList<UserDto>();

        for (User u : users ) {
            lista.add(conveterUserDto(u));
        }
        return lista;

    }


    public static UserDto conveterUserDto(User user){

        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(user,userDto);

        return userDto;

    }

}
