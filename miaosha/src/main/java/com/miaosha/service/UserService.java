package com.miaosha.service;

import com.miaosha.error.BusinessException;
import com.miaosha.service.Model.UserModel;

public interface UserService {

    UserModel getUserById(Integer id);

    void register(UserModel userModel) throws BusinessException;

    UserModel validateLogin(String telphone, String encrptPassword) throws BusinessException;
}
