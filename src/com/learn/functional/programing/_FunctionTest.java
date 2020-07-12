/*
 * Copyright (c) 2017 JCPenney Co. All rights reserved.
 */
package com.learn.functional.programing;

import java.util.function.Function;

/**
 * @author Pramit Karmakar
 * Created on 16/05/20
 */

public class _FunctionTest {

    public Function<String, Integer> functionTest = string -> {
      if (string != null) return string.length();
      return 0;
    };
}
