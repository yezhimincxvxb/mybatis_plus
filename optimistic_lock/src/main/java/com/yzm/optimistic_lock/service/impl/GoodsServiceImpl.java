package com.yzm.optimistic_lock.service.impl;

import com.yzm.optimistic_lock.entity.Goods;
import com.yzm.optimistic_lock.mapper.GoodsMapper;
import com.yzm.optimistic_lock.service.GoodsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author Yzm
 * @since 2021-04-19
 */
@Service
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {

}
