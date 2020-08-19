package hello.hellospring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeTraceApp {

    @Around("execution(* hello.hellospring..*(..))")
    public Object execute(ProceedingJoinPoint joinPoint) throws Throwable{
        long start=System.currentTimeMillis();
        System.out.println("start: "+joinPoint.toString()+" "+start+" ms");

        try {
            return joinPoint.proceed();
        }finally {
                long finish=System.currentTimeMillis();
                long timeMs=finish-start;
                System.out.println("End: "+joinPoint.toString()+" "+timeMs+" ms");
        }

    }

}
