package org.tjnutt.lying.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.tjnutt.lying.entity.Cases;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author Administrator
* @description 针对表【cases】的数据库操作Mapper
* @createDate 2025-03-08 09:24:32
* @Entity org.tjnutt.lying.entity.Cases
*/
@Mapper
public interface CasesMapper extends BaseMapper<Cases> {

}




