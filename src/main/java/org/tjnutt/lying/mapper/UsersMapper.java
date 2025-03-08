package org.tjnutt.lying.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.tjnutt.lying.entity.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author Administrator
* @description 针对表【users】的数据库操作Mapper
* @createDate 2025-03-08 09:01:33
* @Entity org.tjnutt.lying.entity.Users
*/
@Mapper
public interface UsersMapper extends BaseMapper<Users> {

}




