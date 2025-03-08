package org.tjnutt.lying.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.tjnutt.lying.entity.Characters;
import org.tjnutt.lying.service.CharactersService;
import org.tjnutt.lying.mapper.CharactersMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【characters】的数据库操作Service实现
* @createDate 2025-03-08 09:24:28
*/
@Service
public class CharactersServiceImpl extends ServiceImpl<CharactersMapper, Characters>
    implements CharactersService{

}




