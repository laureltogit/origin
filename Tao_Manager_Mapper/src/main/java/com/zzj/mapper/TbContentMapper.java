package com.zzj.mapper;

import com.zzj.domain.TbContent;
import com.zzj.domain.TbContentExample;
import com.zzj.domain.TbContentKey;
import com.zzj.domain.TbContentWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbContentMapper {
    long countByExample(TbContentExample example);

    int deleteByExample(TbContentExample example);

    int deleteByPrimaryKey(TbContentKey key);

    int insert(TbContentWithBLOBs record);

    int insertSelective(TbContentWithBLOBs record);

    List<TbContentWithBLOBs> selectByExampleWithBLOBs(TbContentExample example);

    List<TbContent> selectByExample(TbContentExample example);

    TbContentWithBLOBs selectByPrimaryKey(TbContentKey key);

    int updateByExampleSelective(@Param("record") TbContentWithBLOBs record, @Param("example") TbContentExample example);

    int updateByExampleWithBLOBs(@Param("record") TbContentWithBLOBs record, @Param("example") TbContentExample example);

    int updateByExample(@Param("record") TbContent record, @Param("example") TbContentExample example);

    int updateByPrimaryKeySelective(TbContentWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbContentWithBLOBs record);

    int updateByPrimaryKey(TbContent record);
}