package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;

/* renamed from: fjh reason: default package */
public abstract class fjh<T> {
    public final fjb a(T t) {
        try {
            fkb fkb = new fkb();
            a(fkb, t);
            if (fkb.a.isEmpty()) {
                return fkb.b;
            }
            StringBuilder sb = new StringBuilder("Expected one JSON element but was ");
            sb.append(fkb.a);
            throw new IllegalStateException(sb.toString());
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }

    public final fjh<T> a() {
        return new fjh<T>() {
            public final T a(fkp fkp) {
                if (fkp.f() != JsonToken.NULL) {
                    return fjh.this.a(fkp);
                }
                fkp.k();
                return null;
            }

            public final void a(fkq fkq, T t) {
                if (t == null) {
                    fkq.e();
                } else {
                    fjh.this.a(fkq, t);
                }
            }
        };
    }

    public abstract T a(fkp fkp);

    public abstract void a(fkq fkq, T t);
}
