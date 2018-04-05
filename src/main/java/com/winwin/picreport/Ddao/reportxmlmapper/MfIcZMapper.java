package com.winwin.picreport.Ddao.reportxmlmapper;

import com.winwin.picreport.Edto.MfIcZ;
import com.winwin.picreport.Edto.MfIcZExample;
import com.winwin.picreport.Edto.MfIcZKey;
import com.winwin.picreport.Edto.MfIcZWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MfIcZMapper {
    long countByExample(MfIcZExample example);

    int deleteByExample(MfIcZExample example);

    int deleteByPrimaryKey(MfIcZKey key);

    int insert(MfIcZWithBLOBs record);

    int insertSelective(MfIcZWithBLOBs record);

    List<MfIcZWithBLOBs> selectByExampleWithBLOBs(MfIcZExample example);

    List<MfIcZ> selectByExample(MfIcZExample example);

    MfIcZWithBLOBs selectByPrimaryKey(MfIcZKey key);

    int updateByExampleSelective(@Param("record") MfIcZWithBLOBs record, @Param("example") MfIcZExample example);

    int updateByExampleWithBLOBs(@Param("record") MfIcZWithBLOBs record, @Param("example") MfIcZExample example);

    int updateByExample(@Param("record") MfIcZ record, @Param("example") MfIcZExample example);

    int updateByPrimaryKeySelective(MfIcZWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MfIcZWithBLOBs record);

    int updateByPrimaryKey(MfIcZ record);
}