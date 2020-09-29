package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ly reason: default package */
public abstract class ly {
    private final Map<String, Object> a = new HashMap();
    private volatile boolean b = false;

    /* access modifiers changed from: protected */
    public void a() {
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        this.b = true;
        synchronized (this.a) {
            for (Object next : this.a.values()) {
                if (next instanceof Closeable) {
                    try {
                        ((Closeable) next).close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        a();
    }
}
