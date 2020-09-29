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

/* renamed from: bsy reason: default package */
public abstract class bsy {
    /* access modifiers changed from: private */
    public static final Set<bsy> a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: bsy$a */
    public static final class a {
        public final Set<Scope> a = new HashSet();
        public final Set<Scope> b = new HashSet();
        public final Map<bst<?>, d> c = new dp();
        public Looper d;
        private String e;
        private String f;
        private final Map<bst<?>, defpackage.bwy.b> g = new dp();
        private final Context h;
        private int i = -1;
        private bso j = bso.a();
        private defpackage.bst.a<? extends ext, exd> k = exq.a;
        private final ArrayList<b> l = new ArrayList<>();
        private final ArrayList<c> m = new ArrayList<>();
        private boolean n = false;

        public a(Context context) {
            this.h = context;
            this.d = context.getMainLooper();
            this.e = context.getPackageName();
            this.f = context.getClass().getName();
        }

        public final <O extends defpackage.bst.d.c> a a(bst<O> bst, O o) {
            bxo.a(bst, (Object) "Api must not be null");
            bxo.a(o, (Object) "Null options are not permitted for this Api");
            this.c.put(bst, o);
            List a2 = bst.a.a(o);
            this.b.addAll(a2);
            this.a.addAll(a2);
            return this;
        }

        public final a a(b bVar) {
            bxo.a(bVar, (Object) "Listener must not be null");
            this.l.add(bVar);
            return this;
        }

        public final a a(c cVar) {
            bxo.a(cVar, (Object) "Listener must not be null");
            this.m.add(cVar);
            return this;
        }

        public final bsy a() {
            bxo.b(!this.c.isEmpty(), "must call addApi() to add at least one API");
            exd exd = exd.a;
            if (this.c.containsKey(exq.b)) {
                exd = (exd) this.c.get(exq.b);
            }
            bwy bwy = new bwy(null, this.a, this.g, 0, null, this.e, this.f, exd);
            Map<bst<?>, defpackage.bwy.b> map = bwy.d;
            dp dpVar = new dp();
            dp dpVar2 = new dp();
            ArrayList arrayList = new ArrayList();
            Iterator it = this.c.keySet().iterator();
            bst bst = null;
            while (true) {
                boolean z = false;
                if (it.hasNext()) {
                    bst bst2 = (bst) it.next();
                    Object obj = this.c.get(bst2);
                    if (map.get(bst2) != null) {
                        z = true;
                    }
                    dpVar.put(bst2, Boolean.valueOf(z));
                    bwi bwi = new bwi(bst2, z);
                    arrayList.add(bwi);
                    bwi bwi2 = bwi;
                    bst bst3 = bst2;
                    bst bst4 = bst;
                    f a2 = bst2.a().a(this.h, this.d, bwy, obj, bwi2, bwi2);
                    dpVar2.put(bst3.b(), a2);
                    if (!a2.c()) {
                        bst = bst4;
                    } else if (bst4 == null) {
                        bst = bst3;
                    } else {
                        String str = bst3.b;
                        String str2 = bst4.b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length());
                        sb.append(str);
                        sb.append(" cannot be used with ");
                        sb.append(str2);
                        throw new IllegalStateException(sb.toString());
                    }
                } else {
                    bst bst5 = bst;
                    if (bst5 != null) {
                        bxo.a(true, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", bst5.b);
                        bxo.a(this.a.equals(this.b), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", bst5.b);
                    }
                    int a3 = bun.a((Iterable<f>) dpVar2.values(), true);
                    Context context = this.h;
                    ReentrantLock reentrantLock = new ReentrantLock();
                    ArrayList arrayList2 = arrayList;
                    ReentrantLock reentrantLock2 = reentrantLock;
                    bun bun = new bun(context, reentrantLock2, this.d, bwy, this.j, this.k, dpVar, this.l, this.m, dpVar2, this.i, a3, arrayList2);
                    synchronized (bsy.a) {
                        bsy.a.add(bun);
                    }
                    if (this.i >= 0) {
                        bwb.b(null).a(this.i, bun, null);
                    }
                    return bun;
                }
            }
        }
    }

    /* renamed from: bsy$b */
    public interface b {
        void a(int i);

        void a(Bundle bundle);
    }

    /* renamed from: bsy$c */
    public interface c {
        void a(ConnectionResult connectionResult);
    }

    public static Set<bsy> a() {
        Set<bsy> set;
        synchronized (a) {
            set = a;
        }
        return set;
    }

    public <C extends f> C a(defpackage.bst.c<C> cVar) {
        throw new UnsupportedOperationException();
    }

    public <A extends defpackage.bst.b, R extends btc, T extends defpackage.bti.a<R, A>> T a(T t) {
        throw new UnsupportedOperationException();
    }

    public void a(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract void a(c cVar);

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public boolean a(btq btq) {
        throw new UnsupportedOperationException();
    }

    public Context b() {
        throw new UnsupportedOperationException();
    }

    public <A extends defpackage.bst.b, T extends defpackage.bti.a<? extends btc, A>> T b(T t) {
        throw new UnsupportedOperationException();
    }

    public abstract void b(c cVar);

    public Looper c() {
        throw new UnsupportedOperationException();
    }

    public void d() {
        throw new UnsupportedOperationException();
    }

    public abstract void e();

    public abstract ConnectionResult f();

    public abstract void g();

    public abstract void h();

    public abstract bsz<Status> i();

    public abstract boolean j();
}
