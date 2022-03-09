package cn.tang.application.modeTest.DymicProxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DymicProxy1 {

    private  Object target;

    public DymicProxy1(Object target) {
        this.target = target;
    }

    public Object getTarget(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("start");
                        Object invoke = method.invoke(target,args);
                        System.out.println("end");
                        return invoke;
                    }
                });
    }
}
