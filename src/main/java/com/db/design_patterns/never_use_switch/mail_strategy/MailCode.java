package com.db.design_patterns.never_use_switch.mail_strategy;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(MailCodes.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface MailCode {
    int value();
}
