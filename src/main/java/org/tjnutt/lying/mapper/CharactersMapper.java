package org.tjnutt.lying.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.tjnutt.lying.entity.Characters;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author Administrator
* @description 针对表【characters】的数据库操作Mapper
* @createDate 2025-03-08 09:24:28
* @Entity org.tjnutt.lying.entity.Characters
*/
@Mapper
public interface CharactersMapper extends BaseMapper<Characters> {

}




