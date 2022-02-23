package annotation;

import java.lang.annotation.*;

//测试元注解
@MyAnnotation
public class Test02 {
    @MyAnnotation
    public void test()
    {}
}
//定义一个注解
@Target(value = {ElementType.METHOD,ElementType.TYPE})
//定义一个作用域,表示注解可以放在的位置。
@Retention(value = RetentionPolicy.RUNTIME)
//表示注解在程序的哪个阶段还有效 runtime>class>sources
@Documented//表示是否将注解生成在JAVAdoc文档中
@Inherited//子类可以继承父类的注解
@interface MyAnnotation
{

}