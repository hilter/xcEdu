package com.xuecheng.manage_cms.dao;

import com.xuecheng.framework.domain.cms.CmsConfig;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author 麦客子
 * @desc
 * @email leeshuhua@163.com
 * @create 2019/07/08 21:05
 **/
public interface CmsConfigRepository extends MongoRepository<CmsConfig,String> {
}
