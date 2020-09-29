package org.slf4j.helpers;

import java.io.Serializable;

public abstract class NamedLoggerBase implements Serializable, xfo {
    private static final long serialVersionUID = 7535258609338176893L;
    protected String name;

    NamedLoggerBase() {
    }

    public String f() {
        return this.name;
    }

    /* access modifiers changed from: protected */
    public Object readResolve() {
        return xfp.a(f());
    }
}
