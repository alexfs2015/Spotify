package defpackage;

import java.io.IOException;
import java.io.StringWriter;

/* renamed from: fjb reason: default package */
public abstract class fjb {
    public Number a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public long d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final fjd g() {
        if (this instanceof fjd) {
            return (fjd) this;
        }
        StringBuilder sb = new StringBuilder("Not a JSON Object: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public final fjf h() {
        if (this instanceof fjf) {
            return (fjf) this;
        }
        StringBuilder sb = new StringBuilder("Not a JSON Primitive: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            fkq fkq = new fkq(stringWriter);
            fkq.c = true;
            fju.a(this, fkq);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
