package xin.yiliya.dao;

import org.springframework.stereotype.Repository;
import xin.yiliya.pojo.Concern;

@Repository
public interface ConcernMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Concern record);

    int insertSelective(Concern record);

    Concern selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Concern record);

    int updateByPrimaryKey(Concern record);
}