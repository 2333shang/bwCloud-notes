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
@TableName("notes_content")
public class Content extends BasicTimeEntity {

    private static final long serialVersionUID=1L;

    /**
     * 流水号
     */
    private String contentNo;

    /**
     * 目录流水号
     */
    private String menuNo;

    /**
     * 内容实体
     */
    private String content;

    /**
     * 作者
     */
    private Integer authorId;

}
