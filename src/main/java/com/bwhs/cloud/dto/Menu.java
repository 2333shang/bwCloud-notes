package com.bwhs.cloud.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.bwhs.cloud.entity.BasicTimeEntity;

import lombok.Data;

import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author shang
 * @since 2021-02-08
 */
@Data
@TableName("notes_menu")
public class Menu extends BasicTimeEntity  {

    private static final long serialVersionUID=1L;

    /**
     * 流水号
     */
    private String menuNo;

    /**
     * 目录优先级
     */
    private Integer menuPrivilege;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 用户编号
     */
    private Integer userId;

    /**
     * 所属父节点编号
     */
    private String parentMenuNo;
}
