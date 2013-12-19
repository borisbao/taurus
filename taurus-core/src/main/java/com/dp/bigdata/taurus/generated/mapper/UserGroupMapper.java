package com.dp.bigdata.taurus.generated.mapper;

import com.dp.bigdata.taurus.generated.module.UserGroup;
import com.dp.bigdata.taurus.generated.module.UserGroupExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusUserGroup
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int countByExample(UserGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusUserGroup
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int deleteByExample(UserGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusUserGroup
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusUserGroup
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int insert(UserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusUserGroup
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int insertSelective(UserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusUserGroup
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    List<UserGroup> selectByExample(UserGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusUserGroup
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    UserGroup selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusUserGroup
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int updateByExampleSelective(@Param("record") UserGroup record, @Param("example") UserGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusUserGroup
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int updateByExample(@Param("record") UserGroup record, @Param("example") UserGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusUserGroup
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int updateByPrimaryKeySelective(UserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TaurusUserGroup
     *
     * @mbggenerated Wed Sep 25 16:11:59 HKT 2013
     */
    int updateByPrimaryKey(UserGroup record);
}