package com.eumji.zblog.mapper;


import com.eumji.zblog.vo.Article;
import com.eumji.zblog.vo.Pager;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* Created by GeneratorFx on 2017-04-11.
*/
@Mapper
public interface ArticleMapper {

    int getArticleCount();

    List<Article> getArticleList(Pager pager);
}
