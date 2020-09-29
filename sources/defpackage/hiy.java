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

/* renamed from: hiy reason: default package */
public abstract class hiy<T> implements hjy<T> {
    final Set<defpackage.hjy.a<T>> a;
    T b;
    public boolean c;
    final a<T> d;
    final String e;
    final hjw f;
    private final ServiceConnection g;
    private final wzi<Intent> h;

    /* renamed from: hiy$a */
    public interface a<T> {
        T resolve(IBinder iBinder);
    }

    /* renamed from: hiy$b */
    static class b<T> implements a<T> {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final T resolve(IBinder iBinder) {
            return iBinder;
        }
    }

    protected hiy(Context context, Class<? extends Service> cls, a<T> aVar, String str, hjw hjw) {
        this((wzi<Intent>) new $$Lambda$hiy$kHSfVLGWnL8JGqbkK15tEP2__QY<Intent>(context, cls), aVar, str, hjw);
    }

    protected hiy(Context context, Class<? extends Service> cls, String str, hjw hjw) {
        this(context, cls, new b(0), str, hjw);
    }

    private hiy(wzi<Intent> wzi, a<T> aVar, String str, hjw hjw) {
        this.g = new ServiceConnection() {
            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                if (!hiy.this.c) {
                    hiy.this.f.a(this, hiy.this.e);
                    hiy.this.e();
                    return;
                }
                hiy hiy = hiy.this;
                hiy.b = hiy.d.resolve(iBinder);
                if (hiy.this.b != null) {
                    hiy hiy2 = hiy.this;
                    hiy2.c = false;
                    hiy2.g();
                    return;
                }
                StringBuilder sb = new StringBuilder("The service was bound to, but returned a null interface. ComponentName ");
                sb.append(componentName);
                sb.append(", InterfaceResolver ");
                sb.append(hiy.this.d.getClass().getName());
                throw new IllegalStateException(sb.toString());
            }

            public final void onServiceDisconnected(ComponentName componentName) {
                hiy hiy = hiy.this;
                hiy.b = null;
                if (hiy.c) {
                    hiy.this.c = false;
                }
                hiy hiy2 = hiy.this;
                synchronized (hiy2.a) {
                    for (defpackage.hjy.a e : hiy2.a) {
                        e.e();
                    }
                }
            }
        };
        this.a = Collections.synchronizedSet(new HashSet());
        this.h = wzi;
        this.d = aVar;
        this.e = str;
        this.f = hjw;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Intent a(Context context, Class cls) {
        return new Intent(context, cls);
    }

    public void a() {
        jtr.b("Not called on main looper");
        if (this.b == null && !this.c) {
            d();
            this.c = true;
            this.f.a((Intent) this.h.get(), this.g, this.e);
        }
    }

    public void a(defpackage.hjy.a<T> aVar) {
        this.a.add(aVar);
    }

    public void b() {
        jtr.b("Not called on main looper");
        if (this.c) {
            this.c = false;
        }
        if (this.b != null) {
            this.b = null;
            this.f.a(this.g, this.e);
            return;
        }
        e();
    }

    public final void b(defpackage.hjy.a<T> aVar) {
        this.a.remove(aVar);
    }

    public final boolean c() {
        return this.b != null && !this.c;
    }

    /* access modifiers changed from: protected */
    public void d() {
    }

    /* access modifiers changed from: protected */
    public void e() {
    }

    /* access modifiers changed from: protected */
    public void f() {
    }

    /* access modifiers changed from: protected */
    public final void g() {
        f();
        synchronized (this.a) {
            for (defpackage.hjy.a a2 : this.a) {
                a2.a(h());
            }
        }
    }

    public final T h() {
        T t = this.b;
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Service is not connected. Did you forget to connect, or forgot that you called disconnect?");
    }
}
