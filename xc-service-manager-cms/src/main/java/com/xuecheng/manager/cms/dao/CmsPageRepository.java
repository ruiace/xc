package com.xuecheng.manager.cms.dao;/**
 * Created by Administrator on 2020/3/5.
 */


import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author rp
 * @create 2020/3/5
 */
public interface CmsPageRepository extends MongoRepository<CmsPage,String> {
}
