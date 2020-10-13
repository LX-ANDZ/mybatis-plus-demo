package com.lx.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lx.model.User;
import org.springframework.stereotype.Repository;

/**
 * @author 留香
 * @Describe 描述
 * @create 2020-10-13-13:50
 */
@Repository //表示该层为dao层
public interface UserMapper extends BaseMapper<User> {

}
