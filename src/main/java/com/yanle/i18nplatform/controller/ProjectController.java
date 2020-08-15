package com.yanle.i18nplatform.controller;


import com.yanle.i18nplatform.common.base.ApiResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    @GetMapping
    public ApiResponse add() {
        return ApiResponse.success("返回成功");
    }
}

