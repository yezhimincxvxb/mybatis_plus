package com.yzm.optimistic_lock.test;

import com.yzm.optimistic_lock.entity.Goods;
import com.yzm.optimistic_lock.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class Demo {

    @Autowired
    private GoodsService goodsService;

    @PostConstruct
    public void demo() throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(12);
        for (int i = 0; i < 12; i++) {
            executorService.execute(() -> reduceNum(1));
            Thread.sleep((long) (Math.random() * 1000));
        }
        executorService.shutdown();
    }

    private void reduceNum(Integer id) {
        System.out.println(Thread.currentThread().getName());
        Goods goods = goodsService.getById(id);
        if (goods.getLeftNum() > 0) {
            goods.setLeftNum(goods.getLeftNum() - 1);
            goodsService.updateById(goods);
            return;
        }
        System.out.println("库存不足");
    }
}
