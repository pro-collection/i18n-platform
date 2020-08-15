package com.yanle.i18nplatform.controller;


import com.yanle.i18nplatform.common.base.ApiResponse;
import com.yanle.i18nplatform.common.data.pojo.GetProjectListParams;
import com.yanle.i18nplatform.entity.Project;
import com.yanle.i18nplatform.service.IProjectService;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yanle
 * @since 2020-08-08
 */
@RestController
@RequestMapping("/api/project")
public class ProjectController {

    @Autowired
    private IProjectService projectservice;

    @GetMapping("/list")
    public ApiResponse getList(GetProjectListParams params) {
        System.out.println(params);
        List<Project> projectList = projectservice.list();
        return ApiResponse.ofSuccess(projectList);
    }
}

