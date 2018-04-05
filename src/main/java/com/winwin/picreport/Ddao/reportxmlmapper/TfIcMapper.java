package com.winwin.picreport.Ddao.reportxmlmapper;

import com.winwin.picreport.Edto.TfIc;
import com.winwin.picreport.Edto.TfIcExample;
import com.winwin.picreport.Edto.TfIcKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TfIcMapper {
    long countByExample(TfIcExample example);

    int deleteByExample(TfIcExample example);

    int deleteByPrimaryKey(TfIcKey key);

    int insert(TfIc record);

    int insertSelective(TfIc record);

    List<TfIc> selectByExample(TfIcExample example);

    TfIc selectByPrimaryKey(TfIcKey key);

    int updateByExampleSelective(@Param("record") TfIc record, @Param("example") TfIcExample example);

    int updateByExample(@Param("record") TfIc record, @Param("example") TfIcExample example);

    int updateByPrimaryKeySelective(TfIc record);

    int updateByPrimaryKey(TfIc record);
}