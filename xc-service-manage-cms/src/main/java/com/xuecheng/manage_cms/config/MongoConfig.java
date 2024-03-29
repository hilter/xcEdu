package com.xuecheng.manage_cms.config;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSBuckets;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 麦客子
 * @desc  Mongodb的配置类
 * @email leeshuhua@163.com
 * @create 2019/07/17 21:53
 **/
@Configuration
public class MongoConfig {

    @Value("${spring.data.mongodb.database}")
    String db;

    /**
     * GridFSBucket用于打开下载流对象
     * @param mongoClient
     * @return
     */
    @Bean
    public GridFSBucket getGridFSBucket(MongoClient mongoClient) {
        MongoDatabase database = mongoClient.getDatabase(db);
        GridFSBucket bucket = GridFSBuckets.create(database);
        return bucket;
    }
}
