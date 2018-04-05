package com.winwin.picreport.Ddao.reportxmlmapper;

import com.winwin.picreport.Edto.TfIcZ;
import com.winwin.picreport.Edto.TfIcZExample;
import com.winwin.picreport.Edto.TfIcZKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TfIcZMapper {
    long countByExample(TfIcZExample example);

    int deleteByExample(TfIcZExample example);

    int deleteByPrimaryKey(TfIcZKey key);

    int insert(TfIcZ record);

    int insertSelective(TfIcZ record);

    List<TfIcZ> selectByExample(TfIcZExample example);

    TfIcZ selectByPrimaryKey(TfIcZKey key);

    int updateByExampleSelective(@Param("record") TfIcZ record, @Param("example") TfIcZExample example);

    int updateByExample(@Param("record") TfIcZ record, @Param("example") TfIcZExample example);

    int updateByPrimaryKeySelective(TfIcZ record);

    int updateByPrimaryKey(TfIcZ record);
}