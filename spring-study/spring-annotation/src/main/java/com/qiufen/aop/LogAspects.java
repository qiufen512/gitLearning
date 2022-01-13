package com.qiufen.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Value;

import java.util.Arrays;

/*
 * 日志切面类（通知方法）：即切面类中的方法需要动态感知业务类运行的状态并执行
 *
 * */
// 通过此注解在组件加入到容器时区分切面和业务逻辑（告诉spring当前类为切面类）
@Aspect
public class LogAspects {

    // 抽取公共的切入点表达式
    // 1.本类引用 方法名+()
    // 2.其他的切面引用
    @Pointcut("execution(public int com.qiufen.aop.MathCalculator.*(..))")
    public void pointCut() {

    }
    // 在目标方法前切入，并指定切入点（即哪个类的哪个方法）
    // public int com.qiufen.aop.MathCalculator.*(..)
    // JointPoint作为参数时必须出现在第一位，否则spring无法识别
    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint) {
        // 获取切入点的参数
        Object[] args = joinPoint.getArgs();
        System.out.println("@Before:" + joinPoint.getSignature().getName() + "运行...参数列表是：{" + Arrays.asList(args) + "}");
    }

    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint) {
        System.out.println("@After:" + joinPoint.getSignature().getName() + "除法结束...");
    }

    @AfterReturning(value = "pointCut()", returning = "res")
    public void logReturn(Object res) {
        System.out.println("@AfterReturning:除法正常返回...运行结果：{" + res + "}");
    }


    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logException(Exception exception) {
        System.out.println("@AfterThrowing:除法异常...异常信息：{" + exception + "}");
    }
}
