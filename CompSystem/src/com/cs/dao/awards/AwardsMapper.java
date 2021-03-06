package com.cs.dao.awards;

import java.util.List;
import java.util.Map;

import com.cs.pojo.Awards;

public interface AwardsMapper {
	
	/*根据学生no查找学生获奖情况*/
	List<Map<String, Object>> selectAwardsByStuNo(Integer studentno);
	
    int deleteByPrimaryKey(Integer awardsid);

    int insert(Awards record);

    int insertSelective(Awards record);

    Awards selectByPrimaryKey(Integer awardsid);

    int updateByPrimaryKeySelective(Awards record);

    int updateByPrimaryKey(Awards record);
    
//    max
    List<Map> getAwards(Map map);
    
    Map getAwardByID(String awardsId);
    
    int getTotal(Map map);
    
    int updatePubState(Map map);
    
    List<Map> analysisAwards(Map map);
    
    List<Map> unPubAward(String department);
    
    List<Map> awardsByComp(int compId);
    
    List<Integer>  allComps(Map map);
    int  allCompsCount(Map map);
    
    
}