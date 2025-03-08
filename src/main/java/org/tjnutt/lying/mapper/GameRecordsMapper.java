package org.tjnutt.lying.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.tjnutt.lying.entity.GameRecords;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author Administrator
* @description 针对表【game_records】的数据库操作Mapper
* @createDate 2025-03-08 09:24:07
* @Entity org.tjnutt.lying.entity.GameRecords
*/
@Mapper
public interface GameRecordsMapper extends BaseMapper<GameRecords> {

}




