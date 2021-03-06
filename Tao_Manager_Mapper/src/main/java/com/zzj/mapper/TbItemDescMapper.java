package com.zzj.mapper;

import com.zzj.domain.TbItemDesc;
import com.zzj.domain.TbItemDescExample;
import com.zzj.domain.TbItemDescKey;
import com.zzj.domain.TbItemDescWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbItemDescMapper {
    long countByExample(TbItemDescExample example);

    int deleteByExample(TbItemDescExample example);

    int deleteByPrimaryKey(TbItemDescKey key);

    int insert(TbItemDescWithBLOBs record);

    int insertSelective(TbItemDescWithBLOBs record);

    List<TbItemDescWithBLOBs> selectByExampleWithBLOBs(TbItemDescExample example);

    List<TbItemDesc> selectByExample(TbItemDescExample example);

    TbItemDescWithBLOBs selectByPrimaryKey(TbItemDescKey key);

    int updateByExampleSelective(@Param("record") TbItemDescWithBLOBs record, @Param("example") TbItemDescExample example);

    int updateByExampleWithBLOBs(@Param("record") TbItemDescWithBLOBs record, @Param("example") TbItemDescExample example);

    int updateByExample(@Param("record") TbItemDesc record, @Param("example") TbItemDescExample example);

    int updateByPrimaryKeySelective(TbItemDescWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbItemDescWithBLOBs record);

    int updateByPrimaryKey(TbItemDesc record);
}