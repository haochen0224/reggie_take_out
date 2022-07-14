package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.dto.SetmealDto;
import com.itheima.reggie.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {

    /**
     * 新增套餐，同时保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐已经关联数据
     * @param ids
     */
    public void removeWithDish(List<Long> ids);

    /**
     * 更新套餐状态 (自己写的)
     * @param ids
     * @return
     */
    public void updateStatus(int statusId, List<Long> ids);
}
