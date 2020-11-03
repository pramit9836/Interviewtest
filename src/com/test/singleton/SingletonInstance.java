
package com.test.singleton;

/**
 * @author Pramit Karmakar
 * Created on 17/05/20
 */

public enum SingletonInstance {

    INSTANCE;

    int a;

    public void setInstance(int s) {
        a = s;
    }

    public int getInstance() {
        return a;
    }

}
