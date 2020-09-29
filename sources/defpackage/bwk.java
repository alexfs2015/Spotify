package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: bwk reason: default package */
final class bwk implements bvk {
    final buw a;
    final buw b;
    Bundle c;
    ConnectionResult d = null;
    ConnectionResult e = null;
    boolean f = false;
    final Lock g;
    private final Context h;
    private final bun i;
    private final Looper j;
    private final Map<c<?>, buw> k;
    private final Set<btq> l = Collections.newSetFromMap(new WeakHashMap());
    private final f m;
    private int n = 0;

    private bwk(Context context, bun bun, Lock lock, Looper looper, bsp bsp, Map<c<?>, f> map, Map<c<?>, f> map2, bwy bwy, a<? extends ext, exd> aVar, f fVar, ArrayList<bwi> arrayList, ArrayList<bwi> arrayList2, Map<bst<?>, Boolean> map3, Map<bst<?>, Boolean> map4) {
        this.h = context;
        this.i = bun;
        this.g = lock;
        this.j = looper;
        this.m = fVar;
        Context context2 = context;
        Lock lock2 = lock;
        Looper looper2 = looper;
        bsp bsp2 = bsp;
        buw buw = r2;
        buw buw2 = new buw(context2, this.i, lock2, looper2, bsp2, map2, null, map4, null, arrayList2, new bwm(this, 0));
        this.a = buw;
        buw buw3 = new buw(context2, this.i, lock2, looper2, bsp2, map, bwy, map3, aVar, arrayList, new bwn(this, 0));
        this.b = buw3;
        dp dpVar = new dp();
        for (c put : map2.keySet()) {
            dpVar.put(put, this.a);
        }
        for (c put2 : map.keySet()) {
            dpVar.put(put2, this.b);
        }
        this.k = Collections.unmodifiableMap(dpVar);
    }

    public static bwk a(Context context, bun bun, Lock lock, Looper looper, bsp bsp, Map<c<?>, f> map, bwy bwy, Map<bst<?>, Boolean> map2, a<? extends ext, exd> aVar, ArrayList<bwi> arrayList) {
        Map<bst<?>, Boolean> map3 = map2;
        dp dpVar = new dp();
        dp dpVar2 = new dp();
        f fVar = null;
        for (Entry entry : map.entrySet()) {
            f fVar2 = (f) entry.getValue();
            if (fVar2.c()) {
                fVar = fVar2;
            }
            if (fVar2.i()) {
                dpVar.put((c) entry.getKey(), fVar2);
            } else {
                dpVar2.put((c) entry.getKey(), fVar2);
            }
        }
        bxo.a(!dpVar.isEmpty(), (Object) "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        dp dpVar3 = new dp();
        dp dpVar4 = new dp();
        for (bst bst : map2.keySet()) {
            c b2 = bst.b();
            if (dpVar.containsKey(b2)) {
                dpVar3.put(bst, (Boolean) map3.get(bst));
            } else if (dpVar2.containsKey(b2)) {
                dpVar4.put(bst, (Boolean) map3.get(bst));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = arrayList;
        int size = arrayList4.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList4.get(i2);
            i2++;
            bwi bwi = (bwi) obj;
            if (dpVar3.containsKey(bwi.a)) {
                arrayList2.add(bwi);
            } else if (dpVar4.containsKey(bwi.a)) {
                arrayList3.add(bwi);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        bwk bwk = new bwk(context, bun, lock, looper, bsp, dpVar, dpVar2, bwy, aVar, fVar, arrayList2, arrayList3, dpVar3, dpVar4);
        return bwk;
    }

    static /* synthetic */ void a(bwk bwk) {
        if (b(bwk.d)) {
            if (b(bwk.e) || bwk.h()) {
                int i2 = bwk.n;
                if (i2 != 1) {
                    if (i2 != 2) {
                        new AssertionError();
                        bwk.n = 0;
                        return;
                    }
                    bwk.i.a(bwk.c);
                }
                bwk.g();
                bwk.n = 0;
                return;
            }
            ConnectionResult connectionResult = bwk.e;
            if (connectionResult != null) {
                if (bwk.n == 1) {
                    bwk.g();
                    return;
                }
                bwk.a(connectionResult);
                bwk.a.c();
            }
        } else if (bwk.d == null || !b(bwk.e)) {
            ConnectionResult connectionResult2 = bwk.d;
            if (!(connectionResult2 == null || bwk.e == null)) {
                if (bwk.b.l < bwk.a.l) {
                    connectionResult2 = bwk.e;
                }
                bwk.a(connectionResult2);
            }
        } else {
            bwk.b.c();
            bwk.a(bwk.d);
        }
    }

    static /* synthetic */ void a(bwk bwk, int i2, boolean z) {
        bwk.i.a(i2, z);
        bwk.e = null;
        bwk.d = null;
    }

    private final void a(ConnectionResult connectionResult) {
        int i2 = this.n;
        if (i2 != 1) {
            if (i2 != 2) {
                new Exception();
                this.n = 0;
            }
            this.i.a(connectionResult);
        }
        g();
        this.n = 0;
    }

    private static boolean b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.b();
    }

    private final boolean c(a<? extends btc, ? extends b> aVar) {
        c<A> cVar = aVar.b;
        bxo.b(this.k.containsKey(cVar), "GoogleApiClient is not configured to use the API required for this call.");
        return ((buw) this.k.get(cVar)).equals(this.b);
    }

    private boolean d() {
        this.g.lock();
        try {
            return this.n == 2;
        } finally {
            this.g.unlock();
        }
    }

    private final void g() {
        for (btq j2 : this.l) {
            j2.j();
        }
        this.l.clear();
    }

    private final boolean h() {
        ConnectionResult connectionResult = this.e;
        return connectionResult != null && connectionResult.b == 4;
    }

    private final PendingIntent i() {
        if (this.m == null) {
            return null;
        }
        return PendingIntent.getActivity(this.h, System.identityHashCode(this.i), this.m.d(), 134217728);
    }

    public final <A extends b, R extends btc, T extends a<R, A>> T a(T t) {
        if (!c(t)) {
            return this.a.a(t);
        }
        if (!h()) {
            return this.b.a(t);
        }
        t.b(new Status(4, null, i()));
        return t;
    }

    public final void a() {
        this.n = 2;
        this.f = false;
        this.e = null;
        this.d = null;
        this.a.a();
        this.b.a();
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = ":";
        printWriter.append(str).append("authClient").println(str2);
        String str3 = "  ";
        this.b.a(String.valueOf(str).concat(str3), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(str2);
        this.a.a(String.valueOf(str).concat(str3), fileDescriptor, printWriter, strArr);
    }

    public final boolean a(btq btq) {
        this.g.lock();
        try {
            if ((d() || e()) && !this.b.e()) {
                this.l.add(btq);
                if (this.n == 0) {
                    this.n = 1;
                }
                this.e = null;
                this.b.a();
                return true;
            }
            this.g.unlock();
            return false;
        } finally {
            this.g.unlock();
        }
    }

    public final <A extends b, T extends a<? extends btc, A>> T b(T t) {
        if (!c(t)) {
            return this.a.b(t);
        }
        if (!h()) {
            return this.b.b(t);
        }
        t.b(new Status(4, null, i()));
        return t;
    }

    public final ConnectionResult b() {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        this.e = null;
        this.d = null;
        this.n = 0;
        this.a.c();
        this.b.c();
        g();
    }

    public final boolean e() {
        this.g.lock();
        try {
            boolean z = true;
            if (!this.a.e() || (!this.b.e() && !h() && this.n != 1)) {
                z = false;
            }
            return z;
        } finally {
            this.g.unlock();
        }
    }

    public final void f() {
        this.g.lock();
        try {
            boolean d2 = d();
            this.b.c();
            this.e = new ConnectionResult(4);
            if (d2) {
                new egv(this.j).post(new bwl(this));
            } else {
                g();
            }
        } finally {
            this.g.unlock();
        }
    }
}
