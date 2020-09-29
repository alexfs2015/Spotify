package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;

/* renamed from: mz reason: default package */
public abstract class mz {
    final Context a;
    final d b;
    final c c = new c();
    a d;
    my e;
    boolean f;
    na g;
    boolean h;

    /* renamed from: mz$a */
    public static abstract class a {
        public void a(mz mzVar, na naVar) {
        }
    }

    /* renamed from: mz$b */
    public static abstract class b extends e {
        final Object a = new Object();
        Executor b;
        C0059b c;
        Collection<a> d;

        /* renamed from: mz$b$a */
        public static final class a {
            final mx a;
            public final int b;
            final boolean c;
            final boolean d;
            final boolean e;

            a(mx mxVar, int i, boolean z, boolean z2, boolean z3) {
                this.a = mxVar;
                this.b = i;
                this.c = z;
                this.d = z2;
                this.e = z3;
            }
        }

        /* renamed from: mz$b$b reason: collision with other inner class name */
        interface C0059b {
            void a(b bVar, Collection<a> collection);
        }

        public String a() {
            return null;
        }

        public abstract void a(String str);

        public String b() {
            return null;
        }

        public abstract void b(String str);

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
    }

    /* renamed from: mz$c */
    final class c extends Handler {
        c() {
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    mz mzVar = mz.this;
                    mzVar.f = false;
                    mzVar.b(mzVar.e);
                }
                return;
            }
            mz mzVar2 = mz.this;
            mzVar2.h = false;
            if (mzVar2.d != null) {
                mzVar2.d.a(mzVar2, mzVar2.g);
            }
        }
    }

    /* renamed from: mz$d */
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

    /* renamed from: mz$e */
    public static abstract class e {
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

        public void a(int i) {
            e();
        }
    }

    public void b(my myVar) {
    }

    mz(Context context, d dVar) {
        if (context != null) {
            this.a = context;
            this.b = dVar;
            return;
        }
        throw new IllegalArgumentException("context must not be null");
    }

    public final void a(a aVar) {
        nd.e();
        this.d = aVar;
    }

    public final void a(my myVar) {
        nd.e();
        if (!hn.a(this.e, myVar)) {
            this.e = myVar;
            if (!this.f) {
                this.f = true;
                this.c.sendEmptyMessage(2);
            }
        }
    }

    public final void a(na naVar) {
        nd.e();
        if (this.g != naVar) {
            this.g = naVar;
            if (!this.h) {
                this.h = true;
                this.c.sendEmptyMessage(1);
            }
        }
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

    public b b(String str) {
        if (str != null) {
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }
}
