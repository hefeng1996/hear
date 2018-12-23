package com.he.hear.mapper;


import com.he.hear.pojo.User;


public interface UserMapper {
    User selectUserByName(String username);/*通过用户名查询用户*/

    boolean insertUser(User user);/*新用户注册*/

    boolean updateMessage(User user);/*修改用户信息*/

    boolean updatePassword(User user);//修改密码

    User selectUserById(int id);/*通过用户id查询用户*/


}
