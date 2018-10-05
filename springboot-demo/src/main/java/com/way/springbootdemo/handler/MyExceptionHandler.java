package com.way.springbootdemo.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Auther: Way Leung wayleung13@163.com
 * @Date: 10/5/2018 15:46
 * @Description:
 */
@ControllerAdvice
public class MyExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(MyExceptionHandler.class);


    /**
     * 统一异常处理
     * @param exception
     * @return
     */
    @ExceptionHandler({RuntimeException.class})
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView processRuntimeException(RuntimeException exception){
        logger.info("自定义异常处理-RuntimeException");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("myException",exception.getMessage());
        modelAndView.setViewName("error/500");
        return modelAndView;
    }

    /**
     * 统一异常处理
     * @param exception
     * @return
     */
    @ExceptionHandler({Exception.class})
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView processException(Exception exception){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("myException",exception.getMessage());
        modelAndView.setViewName("error/500");
        return modelAndView;
    }




}
