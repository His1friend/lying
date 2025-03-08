package org.tjnutt.lying.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.tjnutt.lying.entity.UserFeedback;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author Administrator
* @description 针对表【user_feedback】的数据库操作Mapper
* @createDate 2025-03-08 09:23:53
* @Entity org.tjnutt.lying.entity.UserFeedback
*/
@Mapper
public interface UserFeedbackMapper extends BaseMapper<UserFeedback> {

}




