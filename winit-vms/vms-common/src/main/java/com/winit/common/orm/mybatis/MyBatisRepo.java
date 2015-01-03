package com.winit.common.orm.mybatis;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * 标识MyBatis的Repository,方便{@link org.mybatis.spring.mapper.MapperScannerConfigurer}的扫描。
 *
 * @author ye.liu
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Component
public @interface MyBatisRepo {
}