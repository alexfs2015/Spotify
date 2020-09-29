package defpackage;

import defpackage.vyh;
import defpackage.wan;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: vyh reason: default package */
public abstract class vyh<B extends vyh<B, C>, C extends wan> implements Cloneable {
    public volatile wbv a;
    public volatile vyl<? extends C> b;
    volatile SocketAddress c;
    final Map<wba<?>, Object> d = new LinkedHashMap();
    final Map<wgy<?>, Object> e = new LinkedHashMap();
    public volatile wat f;

    /* renamed from: vyh$a */
    public static final class a extends wbp {
        volatile boolean a;

        public a(wan wan) {
            super(wan);
        }

        public final whw a() {
            if (this.a) {
                return super.a();
            }
            return wig.a;
        }
    }

    /* access modifiers changed from: 0000 */
    public abstract void a(wan wan);

    /* renamed from: b */
    public abstract B clone();

    public abstract vyi<B, C> d();

    vyh() {
    }

    vyh(vyh<B, C> vyh) {
        this.a = vyh.a;
        this.b = vyh.b;
        this.f = vyh.f;
        this.c = vyh.c;
        synchronized (vyh.d) {
            this.d.putAll(vyh.d);
        }
        synchronized (vyh.e) {
            this.e.putAll(vyh.e);
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

    public final war c() {
        wan wan = null;
        try {
            wan = this.b.a();
            a(wan);
            war a2 = d().c().a(wan);
            if (a2.f() != null) {
                if (wan.h()) {
                    wan.i();
                } else {
                    wan.l().e();
                }
            }
            return a2;
        } catch (Throwable th) {
            if (wan != null) {
                wan.l().e();
            }
            return new wbp(wan, wig.a).c(th);
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

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(wjn.a((Object) this));
        sb.append('(');
        sb.append(d());
        sb.append(')');
        return sb.toString();
    }
}
