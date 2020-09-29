package defpackage;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: wut reason: default package */
public abstract class wut<T extends SocketAddress> implements Closeable {
    private static final wyc a = wyd.a(wut.class);
    /* access modifiers changed from: private */
    public final Map<wwc, wus<T>> b = new IdentityHashMap();

    protected wut() {
    }

    public final wus<T> a(final wwc wwc) {
        final wus<T> wus;
        if (wwc == null) {
            throw new NullPointerException("executor");
        } else if (!wwc.q()) {
            synchronized (this.b) {
                wus = (wus) this.b.get(wwc);
                if (wus == null) {
                    try {
                        wus = b(wwc);
                        this.b.put(wwc, wus);
                        wwc.r().b(new wwj<Object>() {
                            public final void operationComplete(wwi<Object> wwi) {
                                synchronized (wut.this.b) {
                                    wut.this.b.remove(wwc);
                                }
                                wus.close();
                            }
                        });
                    } catch (Exception e) {
                        throw new IllegalStateException("failed to create a new resolver", e);
                    }
                }
            }
            return wus;
        } else {
            throw new IllegalStateException("executor not accepting a task");
        }
    }

    /* access modifiers changed from: protected */
    public abstract wus<T> b(wwc wwc);

    public void close() {
        wus[] wusArr;
        synchronized (this.b) {
            wusArr = (wus[]) this.b.values().toArray(new wus[this.b.size()]);
            this.b.clear();
        }
        for (wus close : wusArr) {
            try {
                close.close();
            } catch (Throwable th) {
                a.d("Failed to close a resolver:", th);
            }
        }
    }
}
