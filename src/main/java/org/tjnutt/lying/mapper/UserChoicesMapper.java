package org.tjnutt.lying.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.tjnutt.lying.entity.UserChoices;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author Administrator
* @description 针对表【user_choices】的数据库操作Mapper
* @createDate 2025-03-08 09:24:00
* @Entity org.tjnutt.lying.entity.UserChoices
*/
@Mapper
public interface UserChoicesMapper extends BaseMapper<UserChoices> {

}




