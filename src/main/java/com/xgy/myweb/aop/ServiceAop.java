/**
 * Copyright(c) 2016 ShenZhen Gowild Intelligent Technology Co., Ltd.
 * All rights reserved.
 * Created on  Apr 8, 2016  3:28:06 PM
 */
package com.xgy.myweb.aop;

import com.xgy.myweb.common.LogConstant;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 *
 * @author sunrh
 */
@Aspect
@Component
public class ServiceAop {

    private static Logger logger = LogManager.getLogger(ServiceAop.class);

    /**
     * 定义一个切片
     */
//    @Pointcut("execution(public * com.gowild.dubbo..*.*DubboServiceImpl.*(..))")
    @Pointcut("execution(public * com.xgy.myweb.service.impl.UserService.*(..))")
    private void serviceMethod() {
    }

    /**
     * 前置通知
     */
    @Before("execution(* com.xgy.myweb.service.impl.UserService.login(..))")
    public void before(){
        System.out.println("前置通知....");
    }

    /**
     * 后置通知
     * returnVal,切点方法执行后的返回值
     */
//    @AfterReturning(value="execution(* com.zejian.spring.springAop.dao.UserDao.addUser(..))",returning = "returnVal")
//    public void AfterReturning(Object returnVal){
//        System.out.println("后置通知...."+returnVal);
//    }

    /**
     * 增加try catch
     *
     * @param pjp
     *
     * @return
     */
    @Around("serviceMethod()")
    public Object addTryCatch(ProceedingJoinPoint pjp) throws Throwable {
        try {
            long start = System.currentTimeMillis();
            Object result = pjp.proceed();

            long last = System.currentTimeMillis() - start;
            //统计数据
            audit(pjp, result);
            //打印日志
            printLog(pjp, result, last);
            return result;
        } catch (Throwable t) {
            logger.error(LogConstant.AOP_LOGGER_EXP, t);
            throw t;
        }
    }

    /**
     * 审计拦截
     */
    private void audit(ProceedingJoinPoint pjp, Object result) {
//        auditDispatchService.dispatchRequest(pjp, result);
    }

    /**
     * 打印拦截信息
     *
     * @param pjp          信息
     * @param returnObject 返回结果
     * @param last         持续时间
     */
    private void printLog(ProceedingJoinPoint pjp, Object returnObject, long last) {
        String className = pjp.getTarget().getClass().toString();
        String methodName = pjp.getSignature().getName();
        Object[] args = pjp.getArgs();
        StringBuffer params = new StringBuffer();
        for (Object o : args) {
            params.append(o + ", ");
        }
        logger.info(LogConstant.AOP_LOGGER_PARAM + " [类名]=" + className + " [方法名]=" + methodName + " [持续时间]=" + last + " [参数]=" + params.toString() + " [返回]=" + returnObject);
    }

}
