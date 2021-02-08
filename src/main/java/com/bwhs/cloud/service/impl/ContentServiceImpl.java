package com.bwhs.cloud.service.impl;

import com.bwhs.cloud.dto.Content;
import com.bwhs.cloud.dao.ContentMapper;
import com.bwhs.cloud.service.ContentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author shang
 * @since 2021-02-08
 */
@Service
public class ContentServiceImpl extends ServiceImpl<ContentMapper, Content> implements ContentService {

}
