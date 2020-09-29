package defpackage;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: hgc reason: default package */
public abstract class hgc<T> implements hhe<T> {
    final Set<defpackage.hhe.a<T>> a;
    T b;
    public boolean c;
    final a<T> d;
    final String e;
    private final ServiceConnection f;
    private final wlc<Intent> g;

    /* renamed from: hgc$a */
    public interface a<T> {
        T resolve(IBinder iBinder);
    }

    /* renamed from: hgc$b */
    static class b<T> implements a<T> {
        public final T resolve(IBinder iBinder) {
            return iBinder;
        }

        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public void e() {
    }

    /* access modifiers changed from: protected */
    public void f() {
    }

    /* access modifiers changed from: protected */
    public void g() {
    }

    protected hgc(Context context, Class<? extends Service> cls, a<T> aVar, String str) {
        this((wlc<Intent>) new $$Lambda$hgc$2Mei3KvJbRLRq_AQq_g6j9CU8Q<Intent>(context, cls), aVar, str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Intent a(Context context, Class cls) {
        return new Intent(context, cls);
    }

    protected hgc(Context context, Class<? extends Service> cls, String str) {
        this(context, cls, new b(0), str);
    }

    private hgc(wlc<Intent> wlc, a<T> aVar, String str) {
        this.f = new ServiceConnection() {
            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                if (!hgc.this.c) {
                    ((hhc) ggw.a(hhc.class)).a(this, hgc.this.e);
                    hgc.this.f();
                    return;
                }
                hgc hgc = hgc.this;
                hgc.b = hgc.d.resolve(iBinder);
                if (hgc.this.b != null) {
                    hgc hgc2 = hgc.this;
                    hgc2.c = false;
                    hgc2.h();
                    return;
                }
                StringBuilder sb = new StringBuilder("The service was bound to, but returned a null interface. ComponentName ");
                sb.append(componentName);
                sb.append(", InterfaceResolver ");
                sb.append(hgc.this.d.getClass().getName());
                throw new IllegalStateException(sb.toString());
            }

            public final void onServiceDisconnected(ComponentName componentName) {
                hgc hgc = hgc.this;
                hgc.b = null;
                if (hgc.c) {
                    hgc.this.c = false;
                }
                hgc hgc2 = hgc.this;
                synchronized (hgc2.a) {
                    for (defpackage.hhe.a e : hgc2.a) {
                        e.e();
                    }
                }
            }
        };
        this.a = Collections.synchronizedSet(new HashSet());
        this.g = wlc;
        this.d = aVar;
        this.e = str;
    }

    public final void c() {
        b();
        a();
    }

    public final boolean d() {
        return this.b != null && !this.c;
    }

    public void a(defpackage.hhe.a<T> aVar) {
        this.a.add(aVar);
    }

    public final void b(defpackage.hhe.a<T> aVar) {
        this.a.remove(aVar);
    }

    /* access modifiers changed from: protected */
    public final void h() {
        g();
        synchronized (this.a) {
            for (defpackage.hhe.a a2 : this.a) {
                a2.a(i());
            }
        }
    }

    public final T i() {
        T t = this.b;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Service is not connected. Did you forget to connect, or forgot that you called disconnect?");
    }

    public void a() {
        jrh.b("Not called on main looper");
        if (this.b == null && !this.c) {
            e();
            this.c = true;
            ((hhc) ggw.a(hhc.class)).a((Intent) this.g.get(), this.f, this.e);
        }
    }

    public void b() {
        jrh.b("Not called on main looper");
        if (this.c) {
            this.c = false;
        }
        if (this.b != null) {
            this.b = null;
            ((hhc) ggw.a(hhc.class)).a(this.f, this.e);
            return;
        }
        f();
    }
}
