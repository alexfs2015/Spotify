package defpackage;

import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonToken;
import java.io.IOException;

/* renamed from: fin reason: default package */
public abstract class fin<T> {
    public abstract T a(fjv fjv);

    public abstract void a(fjw fjw, T t);

    public final fin<T> a() {
        return new fin<T>() {
            public final void a(fjw fjw, T t) {
                if (t == null) {
                    fjw.e();
                } else {
                    fin.this.a(fjw, t);
                }
            }

            public final T a(fjv fjv) {
                if (fjv.f() != JsonToken.NULL) {
                    return fin.this.a(fjv);
                }
                fjv.k();
                return null;
            }
        };
    }

    public final fih a(T t) {
        try {
            fjh fjh = new fjh();
            a(fjh, t);
            if (fjh.a.isEmpty()) {
                return fjh.b;
            }
            StringBuilder sb = new StringBuilder("Expected one JSON element but was ");
            sb.append(fjh.a);
            throw new IllegalStateException(sb.toString());
        } catch (IOException e) {
            throw new JsonIOException((Throwable) e);
        }
    }
}
