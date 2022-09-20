package com.eastern.pattern.chain;

/**
 * @Author chensheng13
 * @Description TODO
 * @Date 2022/9/20 13:28
 * @Version 1.0
 */
public class RoleCheckMiddleware extends Middleware {
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
