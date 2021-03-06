package com.briup.apps.poll.dao;

import com.briup.apps.poll.bean.answers;
import com.briup.apps.poll.bean.answersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface answersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_answers
     *
     * @mbg.generated Mon Jun 25 18:38:57 CST 2018
     */
    long countByExample(answersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_answers
     *
     * @mbg.generated Mon Jun 25 18:38:57 CST 2018
     */
    int deleteByExample(answersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_answers
     *
     * @mbg.generated Mon Jun 25 18:38:57 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_answers
     *
     * @mbg.generated Mon Jun 25 18:38:57 CST 2018
     */
    int insert(answers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_answers
     *
     * @mbg.generated Mon Jun 25 18:38:57 CST 2018
     */
    int insertSelective(answers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_answers
     *
     * @mbg.generated Mon Jun 25 18:38:57 CST 2018
     */
    List<answers> selectByExample(answersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_answers
     *
     * @mbg.generated Mon Jun 25 18:38:57 CST 2018
     */
    answers selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_answers
     *
     * @mbg.generated Mon Jun 25 18:38:57 CST 2018
     */
    int updateByExampleSelective(@Param("record") answers record, @Param("example") answersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_answers
     *
     * @mbg.generated Mon Jun 25 18:38:57 CST 2018
     */
    int updateByExample(@Param("record") answers record, @Param("example") answersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_answers
     *
     * @mbg.generated Mon Jun 25 18:38:57 CST 2018
     */
    int updateByPrimaryKeySelective(answers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table poll_answers
     *
     * @mbg.generated Mon Jun 25 18:38:57 CST 2018
     */
    int updateByPrimaryKey(answers record);
}