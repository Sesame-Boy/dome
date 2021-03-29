package com.cloud.spring.controller;


import com.cloud.spring.entity.Dictionary;
import com.cloud.spring.mapper.DictionaryMapper;
import com.cloud.spring.service.IDictionaryService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author QMS
 * @since 2021-03-29
 */
@RestController
@RequestMapping("/dictionary")
public class DictionaryController {
    @Resource
    private IDictionaryService iDictionaryService;
    @Resource
    private DictionaryMapper dictionaryMapper;

    @GetMapping(value = "/createTable/{tableName}")
    public boolean createTable(@PathVariable("tableName") String tableName){
        return dictionaryMapper.createTable(tableName);
    }

    @GetMapping(value = "/deleteTable/{tableName}")
    public boolean deleteTable(@PathVariable("tableName") String tableName){
        return dictionaryMapper.deleteTable(tableName);
    }

    @RequestMapping("/create")
    public boolean create(@RequestBody Dictionary dictionary){
        return iDictionaryService.save(dictionary);
    }

}

