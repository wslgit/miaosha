package com.miaosha.service;

import com.miaosha.service.Model.PromoModel;

public interface PromoService {

    //根据itemid获取正在进行的和即将进行的秒杀活动
    PromoModel getPromoByItemId(Integer itemId);
}
