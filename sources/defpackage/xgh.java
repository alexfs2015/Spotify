package defpackage;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: xgh reason: default package */
public final class xgh {
    private final Method a;
    private final List<?> b;

    xgh(Method method, List<?> list) {
        this.a = method;
        this.b = Collections.unmodifiableList(list);
    }

    public final String toString() {
        return String.format("%s.%s() %s", new Object[]{this.a.getDeclaringClass().getName(), this.a.getName(), this.b});
    }
}