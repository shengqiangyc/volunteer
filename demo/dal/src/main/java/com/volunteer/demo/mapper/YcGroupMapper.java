package com.volunteer.demo.mapper;

import com.volunteer.demo.DO.YcGroup;
import com.volunteer.demo.DTO.UserGroupDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface YcGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yc_group
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long groupId);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yc_group
     *
     * @mbggenerated
     */
    int insert(YcGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yc_group
     *
     * @mbggenerated
     */
    YcGroup selectByPrimaryKey(Long groupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yc_group
     *
     * @mbggenerated
     */
    List<YcGroup> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yc_group
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(YcGroup record);

    /**
     * 校验团队名是否存在
     */
    int countGroup(String groupName);

    /**
     * 获取首页展示的团队
     */
    List<YcGroup> getIndexGroup();

    /**
     * 通过name获取对象
     */
    YcGroup getGroup(String groupName);


}