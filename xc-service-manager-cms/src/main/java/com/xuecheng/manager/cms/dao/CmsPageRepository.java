package com.xuecheng.manager.cms.dao;/**
 * Created by Administrator on 2020/3/5.
 */


import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * cmsPage cms页面管理持久层
 *
 * @author rp
 * @create 2020/3/5
 */
public interface CmsPageRepository extends MongoRepository<CmsPage,String> {

    /**
     * 根据页面名称查询
     * @param pageName
     * @return
     */
    CmsPage findByPageName(String pageName);

    /**
     * 根据页面名称和类型查询
     * @param pageName
     * @param pageType
     * @return
     */
    CmsPage findByPageNameAndPageType(String pageName,String pageType);

    /**
     * 根据站点和页面类型查询记录数
     * @param siteId
     * @param pageType
     * @return
     */
    int countBySiteIdAndPageType(String siteId,String pageType);


    /**
     * 根据站点和页面类型分页查询
     * @param siteId
     * @param pageType
     * @param pageable
     * @return
     */
    Page<CmsPage> findBySiteIdAndPageType(String siteId, String pageType, Pageable pageable);
}
