package com.springboot.college.mapper;

import com.springboot.college.model.JshSequence;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Update;

public interface JshSequenceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_sequence
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    @Delete({
        "delete from jsh_sequence",
        "where seq_name = #{seqName,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String seqName);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_sequence
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    @Insert({
        "insert into jsh_sequence (seq_name, min_value, ",
        "max_value, current_val, ",
        "increment_val, remark)",
        "values (#{seqName,jdbcType=VARCHAR}, #{minValue,jdbcType=BIGINT}, ",
        "#{maxValue,jdbcType=BIGINT}, #{currentVal,jdbcType=BIGINT}, ",
        "#{incrementVal,jdbcType=INTEGER}, #{remark,jdbcType=VARCHAR})"
    })
    int insert(JshSequence record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_sequence
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    int insertSelective(JshSequence record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_sequence
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */


    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_sequence
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    int updateByPrimaryKeySelective(JshSequence record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table jsh_sequence
     *
     * @mbg.generated Wed Mar 25 14:58:00 CST 2020
     */
    @Update({
        "update jsh_sequence",
        "set min_value = #{minValue,jdbcType=BIGINT},",
          "max_value = #{maxValue,jdbcType=BIGINT},",
          "current_val = #{currentVal,jdbcType=BIGINT},",
          "increment_val = #{incrementVal,jdbcType=INTEGER},",
          "remark = #{remark,jdbcType=VARCHAR}",
        "where seq_name = #{seqName,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(JshSequence record);
}