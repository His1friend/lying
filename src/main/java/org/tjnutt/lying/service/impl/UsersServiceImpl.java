package org.tjnutt.lying.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.tjnutt.lying.entity.Users;
import org.tjnutt.lying.service.UsersService;
import org.tjnutt.lying.mapper.UsersMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【users】的数据库操作Service实现
* @createDate 2025-03-08 09:01:33
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService{

}




