package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: bsh reason: default package */
public abstract class bsh {
    /* access modifiers changed from: private */
    public static final Set<bsh> a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: bsh$a */
    public static final class a {
        public final Set<Scope> a = new HashSet();
        public final Set<Scope> b = new HashSet();
        public final Map<bsc<?>, d> c = new dp();
        public Looper d;
        private String e;
        private String f;
        private final Map<bsc<?>, defpackage.bwh.b> g = new dp();
        private final Context h;
        private int i = -1;
        private brx j = brx.a();
        private defpackage.bsc.a<? extends exc, ewm> k = ewz.a;
        private final ArrayList<b> l = new ArrayList<>();
        private final ArrayList<c> m = new ArrayList<>();
        private boolean n = false;

        public a(Context context) {
            this.h = context;
            this.d = context.getMainLooper();
            this.e = context.getPackageName();
            this.f = context.getClass().getName();
        }

        public final a a(b bVar) {
            bwx.a(bVar, (Object) "Listener must not be null");
            this.l.add(bVar);
            return this;
        }

        public final a a(c cVar) {
            bwx.a(cVar, (Object) "Listener must not be null");
            this.m.add(cVar);
            return this;
        }

        public final <O extends defpackage.bsc.d.c> a a(bsc<O> bsc, O o) {
            bwx.a(bsc, (Object) "Api must not be null");
            bwx.a(o, (Object) "Null options are not permitted for this Api");
            this.c.put(bsc, o);
            List a2 = bsc.a.a(o);
            this.b.addAll(a2);
            this.a.addAll(a2);
            return this;
        }

        public final bsh a() {
            bwx.b(!this.c.isEmpty(), "must call addApi() to add at least one API");
            ewm ewm = ewm.a;
            if (this.c.containsKey(ewz.b)) {
                ewm = (ewm) this.c.get(ewz.b);
            }
            bwh bwh = new bwh(null, this.a, this.g, 0, null, this.e, this.f, ewm);
            Map<bsc<?>, defpackage.bwh.b> map = bwh.d;
            dp dpVar = new dp();
            dp dpVar2 = new dp();
            ArrayList arrayList = new ArrayList();
            Iterator it = this.c.keySet().iterator();
            bsc bsc = null;
            while (true) {
                boolean z = false;
                if (it.hasNext()) {
                    bsc bsc2 = (bsc) it.next();
                    Object obj = this.c.get(bsc2);
                    if (map.get(bsc2) != null) {
                        z = true;
                    }
                    dpVar.put(bsc2, Boolean.valueOf(z));
                    bvr bvr = new bvr(bsc2, z);
                    arrayList.add(bvr);
                    bvr bvr2 = bvr;
                    bsc bsc3 = bsc2;
                    bsc bsc4 = bsc;
                    f a2 = bsc2.a().a(this.h, this.d, bwh, obj, bvr2, bvr2);
                    dpVar2.put(bsc3.b(), a2);
                    if (!a2.c()) {
                        bsc = bsc4;
                    } else if (bsc4 == null) {
                        bsc = bsc3;
                    } else {
                        String str = bsc3.b;
                        String str2 = bsc4.b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
                        sb.append(str);
                        sb.append(" cannot be used with ");
                        sb.append(str2);
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    bsc bsc5 = bsc;
                    if (bsc5 != null) {
                        bwx.a(true, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", bsc5.b);
                        bwx.a(this.a.equals(this.b), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", bsc5.b);
                    }
                    int a3 = btw.a((Iterable<f>) dpVar2.values(), true);
                    Context context = this.h;
                    ReentrantLock reentrantLock = new ReentrantLock();
                    ArrayList arrayList2 = arrayList;
                    ReentrantLock reentrantLock2 = reentrantLock;
                    btw btw = new btw(context, reentrantLock2, this.d, bwh, this.j, this.k, dpVar, this.l, this.m, dpVar2, this.i, a3, arrayList2);
                    synchronized (bsh.a) {
                        bsh.a.add(btw);
                    }
                    if (this.i >= 0) {
                        bvk.b(null).a(this.i, btw, null);
                    }
                    return btw;
                }
            }
        }
    }

    /* renamed from: bsh$b */
    public interface b {
        void a(int i);

        void a(Bundle bundle);
    }

    /* renamed from: bsh$c */
    public interface c {
        void a(ConnectionResult connectionResult);
    }

    public abstract void a(c cVar);

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void b(c cVar);

    public abstract void e();

    public abstract ConnectionResult f();

    public abstract void g();

    public abstract void h();

    public abstract bsi<Status> i();

    public abstract boolean j();

    public static Set<bsh> a() {
        Set<bsh> set;
        synchronized (a) {
            set = a;
        }
        return set;
    }

    public <A extends defpackage.bsc.b, R extends bsl, T extends defpackage.bsr.a<R, A>> T a(T t) {
        throw new UnsupportedOperationException();
    }

    public <A extends defpackage.bsc.b, T extends defpackage.bsr.a<? extends bsl, A>> T b(T t) {
        throw new UnsupportedOperationException();
    }

    public <C extends f> C a(defpackage.bsc.c<C> cVar) {
        throw new UnsupportedOperationException();
    }

    public Context b() {
        throw new UnsupportedOperationException();
    }

    public Looper c() {
        throw new UnsupportedOperationException();
    }

    public boolean a(bsz bsz) {
        throw new UnsupportedOperationException();
    }

    public void d() {
        throw new UnsupportedOperationException();
    }

    public void a(int i) {
        throw new UnsupportedOperationException();
    }
}
