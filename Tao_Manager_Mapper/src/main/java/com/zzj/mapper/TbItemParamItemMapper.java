package com.zzj.mapper;

import com.zzj.domain.TbItemParamItem;
import com.zzj.domain.TbItemParamItemExample;
import com.zzj.domain.TbItemParamItemKey;
import com.zzj.domain.TbItemParamItemWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemParamItemMapper {
    long countByExample(TbItemParamItemExample example);

    int deleteByExample(TbItemParamItemExample example);

    int deleteByPrimaryKey(TbItemParamItemKey key);

    int insert(TbItemParamItemWithBLOBs record);

    int insertSelective(TbItemParamItemWithBLOBs record);

    List<TbItemParamItemWithBLOBs> selectByExampleWithBLOBs(TbItemParamItemExample example);

    List<TbItemParamItem> selectByExample(TbItemParamItemExample example);

    TbItemParamItemWithBLOBs selectByPrimaryKey(TbItemParamItemKey key);

    int updateByExampleSelective(@Param("record") TbItemParamItemWithBLOBs record, @Param("example") TbItemParamItemExample example);

    int updateByExampleWithBLOBs(@Param("record") TbItemParamItemWithBLOBs record, @Param("example") TbItemParamItemExample example);

    int updateByExample(@Param("record") TbItemParamItem record, @Param("example") TbItemParamItemExample example);

    int updateByPrimaryKeySelective(TbItemParamItemWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbItemParamItemWithBLOBs record);

    int updateByPrimaryKey(TbItemParamItem record);
}