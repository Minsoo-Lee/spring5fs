package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.AppCtx;
import spring.ChangePasswordService;
import spring.MemberNotFoundException;
import spring.WrongIdPasswordException;

public class MainForCPS {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppCtx.class);
        ChangePasswordService cps =
                ctx.getBean("changePwdSvc", ChangePasswordService.class);
        try {
            cps.changePassword("madvirus@madvirus.net", "0x1.ad794143b1717p-1", "1111");
            System.out.println("changed pwd");
        } catch (MemberNotFoundException e) {
            System.out.println("member not found");
        } catch (WrongIdPasswordException e) {
            System.out.println("pwd not match");
        }
        ctx.close();
    }
}
