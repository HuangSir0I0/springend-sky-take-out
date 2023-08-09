package com.sky.mapper;

import com.sky.entity.ShoppingCart;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@Mapper
public interface ShoppingCartMapper {

    /**
     * 动态条件查询
     *
     * @param shoppingCart
     * @return
     */
    List<ShoppingCart> list(ShoppingCart shoppingCart);

    /**
     * 根据id修改商品数量
     * @param shoppingCart
     */
    @Update("update shopping_cart set number = #{number} where id = #{id}")
    void updateNumberById(ShoppingCart shoppingCart);

    /**
     * 插入购物车数据
     * @param shoppingCart
     */
    @Insert("insert into shopping_cart (name, image, user_id, dish_id," +
            " setmeal_id, dish_flavor, amount, create_time, number)" +
            " values (#{name}, #{image}, #{userId}," +
            " #{dishId}, #{setmealId}, #{dishFlavor}," +
            " #{amount}, #{createTime}, #{number});")
    void insert(ShoppingCart shoppingCart);

    /**
     * 清空当前用户购物车
     * @param currentId
     */
    @Delete("delete from shopping_cart where user_id = #{currentId}")
    void deleteByUserId(Long currentId);
}
