package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;

/* renamed from: ne reason: default package */
public abstract class ne {
    final Context a;
    final d b;
    final c c = new c();
    a d;
    nd e;
    boolean f;
    nf g;
    boolean h;

    /* renamed from: ne$a */
    public static abstract class a {
        public void a(ne neVar, nf nfVar) {
        }
    }

    /* renamed from: ne$b */
    public static abstract class b extends e {
        final Object a = new Object();
        Executor b;
        C0060b c;
        Collection<a> d;

        /* renamed from: ne$b$a */
        public static final class a {
            final nc a;
            public final int b;
            final boolean c;
            final boolean d;
            final boolean e;

            a(nc ncVar, int i, boolean z, boolean z2, boolean z3) {
                this.a = ncVar;
                this.b = i;
                this.c = z;
                this.d = z2;
                this.e = z3;
            }
        }

        /* renamed from: ne$b$b reason: collision with other inner class name */
        interface C0060b {
            void a(b bVar, Collection<a> collection);
        }

        public String a() {
            return null;
        }

        public abstract void a(String str);

        public final void a(final Collection<a> collection) {
            synchronized (this.a) {
                if (this.b != null) {
                    this.b.execute(new Runnable() {
                        public final void run() {
                            b.this.c.a(b.this, collection);
                        }
                    });
                } else {
                    this.d = new ArrayList(collection);
                }
            }
        }

        public String b() {
            return null;
        }

        public abstract void b(String str);
    }

    /* renamed from: ne$c */
    final class c extends Handler {
        c() {
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    ne neVar = ne.this;
                    neVar.f = false;
                    neVar.b(neVar.e);
                }
                return;
            }
            ne neVar2 = ne.this;
            neVar2.h = false;
            if (neVar2.d != null) {
                neVar2.d.a(neVar2, neVar2.g);
            }
        }
    }

    /* renamed from: ne$d */
    public static final class d {
        final ComponentName a;

        d(ComponentName componentName) {
            if (componentName != null) {
                this.a = componentName;
                return;
            }
            throw new IllegalArgumentException("componentName must not be null");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProviderMetadata{ componentName=");
            sb.append(this.a.flattenToShortString());
            sb.append(" }");
            return sb.toString();
        }
    }

    /* renamed from: ne$e */
    public static abstract class e {
        public void a(int i) {
            e();
        }

        public void b(int i) {
        }

        public void c() {
        }

        public void c(int i) {
        }

        public void d() {
        }

        public void e() {
        }
    }

    ne(Context context, d dVar) {
        if (context != null) {
            this.a = context;
            this.b = dVar;
            return;
        }
        throw new IllegalArgumentException("context must not be null");
    }

    public e a(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public e a(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        } else if (str2 != null) {
            return a(str);
        } else {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
    }

    public final void a(nd ndVar) {
        ni.e();
        if (!hn.a(this.e, ndVar)) {
            this.e = ndVar;
            if (!this.f) {
                this.f = true;
                this.c.sendEmptyMessage(2);
            }
        }
    }

    public final void a(a aVar) {
        ni.e();
        this.d = aVar;
    }

    public final void a(nf nfVar) {
        ni.e();
        if (this.g != nfVar) {
            this.g = nfVar;
            if (!this.h) {
                this.h = true;
                this.c.sendEmptyMessage(1);
            }
        }
    }

    public b b(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public void b(nd ndVar) {
    }
}
