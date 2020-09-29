package defpackage;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.IdentityHashMap;
import java.util.Map;

/* renamed from: wgn reason: default package */
public abstract class wgn<T extends SocketAddress> implements Closeable {
    private static final wjw a = wjx.a(wgn.class);
    /* access modifiers changed from: private */
    public final Map<whw, wgm<T>> b = new IdentityHashMap();

    /* access modifiers changed from: protected */
    public abstract wgm<T> b(whw whw);

    protected wgn() {
    }

    public final wgm<T> a(final whw whw) {
        final wgm<T> wgm;
        if (whw == null) {
            throw new NullPointerException("executor");
        } else if (!whw.q()) {
            synchronized (this.b) {
                wgm = (wgm) this.b.get(whw);
                if (wgm == null) {
                    try {
                        wgm = b(whw);
                        this.b.put(whw, wgm);
                        whw.r().b(new wid<Object>() {
                            public final void operationComplete(wic<Object> wic) {
                                synchronized (wgn.this.b) {
                                    wgn.this.b.remove(whw);
                                }
                                wgm.close();
                            }
                        });
                    } catch (Exception e) {
                        throw new IllegalStateException("failed to create a new resolver", e);
                    }
                }
            }
            return wgm;
        } else {
            throw new IllegalStateException("executor not accepting a task");
        }
    }

    public void close() {
        wgm[] wgmArr;
        synchronized (this.b) {
            wgmArr = (wgm[]) this.b.values().toArray(new wgm[this.b.size()]);
            this.b.clear();
        }
        for (wgm close : wgmArr) {
            try {
                close.close();
            } catch (Throwable th) {
                a.d("Failed to close a resolver:", th);
            }
        }
    }
}
