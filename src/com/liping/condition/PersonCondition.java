package com.liping.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class PersonCondition implements Condition {

    /**
     *
     * @param conditionContext：上下文
     * @param annotatedTypeMetadata：注释信息
     * @return
     */
    @Override
    public boolean matches(ConditionContext conditionContext,
                           AnnotatedTypeMetadata annotatedTypeMetadata) {
        // 获取当前环境信息
        Environment environment = conditionContext.getEnvironment();
        // 获取配置文件中的值
        String propertyValue = environment.getProperty("配置文件中的key值");
        // 获取操作系统
        String property = environment.getProperty("os.name");
        // 获取ioc容器使用的beanFactory
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        // 获取类加载器
        ClassLoader classLoader = conditionContext.getClassLoader();
        // 获取bean定义的注册类
        BeanDefinitionRegistry registry = conditionContext.getRegistry();
        return false;
    }
}
