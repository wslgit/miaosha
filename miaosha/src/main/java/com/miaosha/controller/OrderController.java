package com.miaosha.controller;

import com.miaosha.error.BusinessException;
import com.miaosha.error.EmBusinessError;
import com.miaosha.response.CommonReturnType;
import com.miaosha.service.Model.OrderModel;
import com.miaosha.service.Model.UserModel;
import com.miaosha.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController("order")
@RequestMapping("/order")
@CrossOrigin(allowCredentials = "true",allowedHeaders = "*")
public class OrderController extends BaseController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private HttpServletRequest httpServletRequest;

    //封装下单请求
    @RequestMapping(value = "/createorder",method = {RequestMethod.POST},consumes = {CONTENT_TYPE_FORMED})
    public CommonReturnType createOrder(@RequestParam(name = "itemId")Integer itemId,
                                        @RequestParam(name = "amount")Integer amount,
                                        @RequestParam(name = "promoId",required = false)Integer promoId) throws BusinessException {
       Boolean isLogin = (Boolean) httpServletRequest.getSession().getAttribute("IS_LOGIN");
       if (isLogin == null || !isLogin.booleanValue()){
           throw new BusinessException(EmBusinessError.USER_NOT_LOGIN);
       }
       UserModel userModel = (UserModel) httpServletRequest.getSession().getAttribute("LOGIN_USER");

       OrderModel orderModel = orderService.createOrder(userModel.getId(),itemId,promoId,amount);

       return CommonReturnType.create(orderModel);
    }

}
