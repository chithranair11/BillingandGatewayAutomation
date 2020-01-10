package com.pratian.billingandgateway.loader.decorator;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.Locatable;
import org.openqa.selenium.internal.WrapsElement;

import com.pratian.billingandgateway.element.HtmlElement;
import com.pratian.billingandgateway.element.TypifiedElement;

@SuppressWarnings("unchecked")
public class ProxyFactory {
    public static <T extends WebElement> T createWebElementProxy(ClassLoader loader, InvocationHandler handler) {
        Class<?>[] interfaces = new Class[]{WebElement.class, WrapsElement.class, Locatable.class};
        return (T) Proxy.newProxyInstance(loader, interfaces, handler);
    }

    public static <T extends WebElement> List<T> createWebElementListProxy(ClassLoader loader,
                                                                           InvocationHandler handler) {
        return (List<T>) Proxy.newProxyInstance(loader, new Class[]{List.class}, handler);
    }

    public static <T extends TypifiedElement> List<T> createTypifiedElementListProxy(ClassLoader loader,
                                                                                     InvocationHandler handler) {
        return (List<T>) Proxy.newProxyInstance(loader, new Class[]{List.class}, handler);
    }
    
    //Creating HTML proxy list
    public static <T extends HtmlElement> List<T> createHtmlElementListProxy(ClassLoader loader,
                                                                             InvocationHandler handler) {
        return (List<T>) Proxy.newProxyInstance(loader, new Class[]{List.class}, handler);
    }
}
