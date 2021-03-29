package com.cloud.spring.service.impl;

import com.cloud.spring.entity.Dictionary;
import com.cloud.spring.mapper.DictionaryMapper;
import com.cloud.spring.service.IDictionaryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author QMS
 * @since 2021-03-29
 */
@Service
public class DictionaryServiceImpl extends ServiceImpl<DictionaryMapper, Dictionary> implements IDictionaryService {

}
