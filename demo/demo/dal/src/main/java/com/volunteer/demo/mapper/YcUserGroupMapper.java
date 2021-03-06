package com.volunteer.demo.mapper;

import com.volunteer.demo.DO.YcUserGroup;
import com.volunteer.demo.DTO.UserGroupDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface YcUserGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yc_user_group
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long userGroupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yc_user_group
     *
     * @mbggenerated
     */
    int insert(YcUserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yc_user_group
     *
     * @mbggenerated
     */
    YcUserGroup selectByPrimaryKey(Long userGroupId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yc_user_group
     *
     * @mbggenerated
     */
    List<YcUserGroup> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table yc_user_group
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(YcUserGroup record);

    int countGroupUser(Long groupId);

    /**
     * 判断用户是否是团队成员
     */
    int checkUserGroup(UserGroupDTO dto);

    /**
     * 判断用户团队是否达到三个
     */
    int countUserGroup(Long userId);
}