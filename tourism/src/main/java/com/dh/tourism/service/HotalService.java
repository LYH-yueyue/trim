package com.dh.tourism.service;

import com.baomidou.mybatisplus.service.IService;
import com.dh.tourism.model.Car;
import com.dh.tourism.model.Hotal;
import com.dh.tourism.model.HotalOrder;


public interface HotalService extends IService<Hotal>{


    Hotal queryById(Integer hotalId);
}
