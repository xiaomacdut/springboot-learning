package com.didispace.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.didispace.entity.User;

/**
 * @author xiaomacdut
 * @date 2019年9月1日 上午9:28:54
 */
@Service
public class UserService{
    
    @Autowired
    private JdbcTemplate jdbctemplate;
    
    public void addUser(User user){
        jdbctemplate.update("insert into user(UserName,PassWord) values (?,?)", user.getUserName(),
                user.getPassWord());
    }
    
    public void addUserList(List<User> users){
        List<Object []> datas = new ArrayList<>();
        for(User s : users){
            datas.add(new Object[]{s.getUserName(), s.getPassWord()});
        }
        jdbctemplate.batchUpdate("insert into user(UserName,PassWord) values (?,?)", datas);
    }
    
    public User getUserById(Integer id){
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
        return jdbctemplate.queryForObject("select * from user where Id = ?", rowMapper, id);
    }
    
    public List<User> getUsers(){
        RowMapper<User> rowMapper = new BeanPropertyRowMapper<>(User.class);
        return jdbctemplate.query("select * from user", rowMapper);
    }
    
    public Long getUsersSize(){
        return jdbctemplate.queryForObject("select count(Id) from user", Long.class);
    }
}
