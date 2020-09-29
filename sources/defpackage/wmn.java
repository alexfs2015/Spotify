package defpackage;

import defpackage.wmn;
import defpackage.wot;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: wmn reason: default package */
public abstract class wmn<B extends wmn<B, C>, C extends wot> implements Cloneable {
    public volatile wqb a;
    public volatile wmr<? extends C> b;
    volatile SocketAddress c;
    final Map<wpg<?>, Object> d = new LinkedHashMap();
    final Map<wve<?>, Object> e = new LinkedHashMap();
    public volatile woz f;

    /* renamed from: wmn$a */
    public static final class a extends wpv {
        volatile boolean a;

        public a(wot wot) {
            super(wot);
        }

        public final wwc a() {
            return this.a ? super.a() : wwm.a;
        }
    }

    wmn() {
    }

    wmn(wmn<B, C> wmn) {
        this.a = wmn.a;
        this.b = wmn.b;
        this.f = wmn.f;
        this.c = wmn.c;
        synchronized (wmn.d) {
            this.d.putAll(wmn.d);
        }
        synchronized (wmn.e) {
            this.e.putAll(wmn.e);
        }
    }

    static <K, V> Map<K, V> a(Map<K, V> map) {
        synchronized (map) {
            if (map.isEmpty()) {
                Map<K, V> emptyMap = Collections.emptyMap();
                return emptyMap;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            return Collections.unmodifiableMap(linkedHashMap);
        }
    }

    public B a() {
        if (this.a == null) {
            throw new IllegalStateException("group not set");
        } else if (this.b != null) {
            return this;
        } else {
            throw new IllegalStateException("channel or channelFactory not set");
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract void a(wot wot);

    /* renamed from: b */
    public abstract B clone();

    public final wox c() {
        wot wot = null;
        try {
            wot = this.b.a();
            a(wot);
            wox a2 = d().c().a(wot);
            if (a2.f() != null) {
                if (wot.h()) {
                    wot.i();
                } else {
                    wot.l().e();
                }
            }
            return a2;
        } catch (Throwable th) {
            if (wot != null) {
                wot.l().e();
            }
            return new wpv(wot, wwm.a).c(th);
        }
    }

    public abstract wmo<B, C> d();

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(wxt.a((Object) this));
        sb.append('(');
        sb.append(d());
        sb.append(')');
        return sb.toString();
    }
}
