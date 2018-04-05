package com.winwin.picreport.Ddao.reportxmlmapper;

import com.winwin.picreport.Edto.MfIc;
import com.winwin.picreport.Edto.MfIcExample;
import com.winwin.picreport.Edto.MfIcKey;
import com.winwin.picreport.Edto.MfIcWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MfIcMapper {
    long countByExample(MfIcExample example);

    int deleteByExample(MfIcExample example);

    int deleteByPrimaryKey(MfIcKey key);

    int insert(MfIcWithBLOBs record);

    int insertSelective(MfIcWithBLOBs record);

    List<MfIcWithBLOBs> selectByExampleWithBLOBs(MfIcExample example);

    List<MfIc> selectByExample(MfIcExample example);

    MfIcWithBLOBs selectByPrimaryKey(MfIcKey key);

    int updateByExampleSelective(@Param("record") MfIcWithBLOBs record, @Param("example") MfIcExample example);

    int updateByExampleWithBLOBs(@Param("record") MfIcWithBLOBs record, @Param("example") MfIcExample example);

    int updateByExample(@Param("record") MfIc record, @Param("example") MfIcExample example);

    int updateByPrimaryKeySelective(MfIcWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MfIcWithBLOBs record);

    int updateByPrimaryKey(MfIc record);
}