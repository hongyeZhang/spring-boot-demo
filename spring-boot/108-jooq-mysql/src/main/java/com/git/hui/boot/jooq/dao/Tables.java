/*
 * This file is generated by jOOQ.
 */
package com.git.hui.boot.jooq.dao;


import com.git.hui.boot.jooq.dao.tables.MoneyTB;
import com.git.hui.boot.jooq.dao.tables.UserTB;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in test
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>test.money</code>.
     */
    public static final MoneyTB MONEY = MoneyTB.MONEY;

    /**
     * The table <code>test.user</code>.
     */
    public static final UserTB USER = UserTB.USER;
}