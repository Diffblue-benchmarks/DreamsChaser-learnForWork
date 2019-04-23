package cn.com.git.leon.B_javaCore.m_designPattern.strategyPattern;

/**
 * @author sirius
 * @since 2019/4/14
 */
public class AStrategy implements IStrategy{

    @Override
    public void doService() {
        System.out.println("执行A分支");
    }
}
