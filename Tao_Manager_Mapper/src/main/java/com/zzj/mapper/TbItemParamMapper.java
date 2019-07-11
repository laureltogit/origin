package com.zzj.mapper;

import com.zzj.domain.TbItemParam;
import com.zzj.domain.TbItemParamExample;
import com.zzj.domain.TbItemParamKey;
import com.zzj.domain.TbItemParamWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemParamMapper {
    long countByExample(TbItemParamExample example);

    int deleteByExample(TbItemParamExample example);

    int deleteByPrimaryKey(TbItemParamKey key);

    int insert(TbItemParamWithBLOBs record);

    int insertSelective(TbItemParamWithBLOBs record);

    List<TbItemParamWithBLOBs> selectByExampleWithBLOBs(TbItemParamExample example);

    List<TbItemParam> selectByExample(TbItemParamExample example);

    TbItemParamWithBLOBs selectByPrimaryKey(TbItemParamKey key);

    int updateByExampleSelective(@Param("record") TbItemParamWithBLOBs record, @Param("example") TbItemParamExample example);

    int updateByExampleWithBLOBs(@Param("record") TbItemParamWithBLOBs record, @Param("example") TbItemParamExample example);

    int updateByExample(@Param("record") TbItemParam record, @Param("example") TbItemParamExample example);

    int updateByPrimaryKeySelective(TbItemParamWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbItemParamWithBLOBs record);

    int updateByPrimaryKey(TbItemParam record);
}