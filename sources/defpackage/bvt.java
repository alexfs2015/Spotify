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

/* renamed from: bvt reason: default package */
final class bvt implements but {
    final buf a;
    final buf b;
    Bundle c;
    ConnectionResult d = null;
    ConnectionResult e = null;
    boolean f = false;
    final Lock g;
    private final Context h;
    private final btw i;
    private final Looper j;
    private final Map<c<?>, buf> k;
    private final Set<bsz> l = Collections.newSetFromMap(new WeakHashMap());
    private final f m;
    private int n = 0;

    public static bvt a(Context context, btw btw, Lock lock, Looper looper, bry bry, Map<c<?>, f> map, bwh bwh, Map<bsc<?>, Boolean> map2, a<? extends exc, ewm> aVar, ArrayList<bvr> arrayList) {
        Map<bsc<?>, Boolean> map3 = map2;
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
        bwx.a(!dpVar.isEmpty(), (Object) "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        dp dpVar3 = new dp();
        dp dpVar4 = new dp();
        for (bsc bsc : map2.keySet()) {
            c b2 = bsc.b();
            if (dpVar.containsKey(b2)) {
                dpVar3.put(bsc, (Boolean) map3.get(bsc));
            } else if (dpVar2.containsKey(b2)) {
                dpVar4.put(bsc, (Boolean) map3.get(bsc));
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
            bvr bvr = (bvr) obj;
            if (dpVar3.containsKey(bvr.a)) {
                arrayList2.add(bvr);
            } else if (dpVar4.containsKey(bvr.a)) {
                arrayList3.add(bvr);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        bvt bvt = new bvt(context, btw, lock, looper, bry, dpVar, dpVar2, bwh, aVar, fVar, arrayList2, arrayList3, dpVar3, dpVar4);
        return bvt;
    }

    private bvt(Context context, btw btw, Lock lock, Looper looper, bry bry, Map<c<?>, f> map, Map<c<?>, f> map2, bwh bwh, a<? extends exc, ewm> aVar, f fVar, ArrayList<bvr> arrayList, ArrayList<bvr> arrayList2, Map<bsc<?>, Boolean> map3, Map<bsc<?>, Boolean> map4) {
        this.h = context;
        this.i = btw;
        this.g = lock;
        this.j = looper;
        this.m = fVar;
        Context context2 = context;
        Lock lock2 = lock;
        Looper looper2 = looper;
        bry bry2 = bry;
        buf buf = r2;
        buf buf2 = new buf(context2, this.i, lock2, looper2, bry2, map2, null, map4, null, arrayList2, new bvv(this, 0));
        this.a = buf;
        buf buf3 = new buf(context2, this.i, lock2, looper2, bry2, map, bwh, map3, aVar, arrayList, new bvw(this, 0));
        this.b = buf3;
        dp dpVar = new dp();
        for (c put : map2.keySet()) {
            dpVar.put(put, this.a);
        }
        for (c put2 : map.keySet()) {
            dpVar.put(put2, this.b);
        }
        this.k = Collections.unmodifiableMap(dpVar);
    }

    public final <A extends b, R extends bsl, T extends a<R, A>> T a(T t) {
        if (!c(t)) {
            return this.a.a(t);
        }
        if (!h()) {
            return this.b.a(t);
        }
        t.b(new Status(4, null, i()));
        return t;
    }

    public final <A extends b, T extends a<? extends bsl, A>> T b(T t) {
        if (!c(t)) {
            return this.a.b(t);
        }
        if (!h()) {
            return this.b.b(t);
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

    private boolean d() {
        this.g.lock();
        try {
            return this.n == 2;
        } finally {
            this.g.unlock();
        }
    }

    public final boolean a(bsz bsz) {
        this.g.lock();
        try {
            if ((d() || e()) && !this.b.e()) {
                this.l.add(bsz);
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

    public final void f() {
        this.g.lock();
        try {
            boolean d2 = d();
            this.b.c();
            this.e = new ConnectionResult(4);
            if (d2) {
                new ege(this.j).post(new bvu(this));
            } else {
                g();
            }
        } finally {
            this.g.unlock();
        }
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

    private final void g() {
        for (bsz j2 : this.l) {
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

    private static boolean b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.b();
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = ":";
        printWriter.append(str).append("authClient").println(str2);
        String str3 = "  ";
        this.b.a(String.valueOf(str).concat(str3), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(str2);
        this.a.a(String.valueOf(str).concat(str3), fileDescriptor, printWriter, strArr);
    }

    private final boolean c(a<? extends bsl, ? extends b> aVar) {
        c<A> cVar = aVar.b;
        bwx.b(this.k.containsKey(cVar), "GoogleApiClient is not configured to use the API required for this call.");
        return ((buf) this.k.get(cVar)).equals(this.b);
    }

    static /* synthetic */ void a(bvt bvt) {
        if (b(bvt.d)) {
            if (b(bvt.e) || bvt.h()) {
                int i2 = bvt.n;
                if (i2 != 1) {
                    if (i2 != 2) {
                        new AssertionError();
                        bvt.n = 0;
                        return;
                    }
                    bvt.i.a(bvt.c);
                }
                bvt.g();
                bvt.n = 0;
                return;
            }
            ConnectionResult connectionResult = bvt.e;
            if (connectionResult != null) {
                if (bvt.n == 1) {
                    bvt.g();
                    return;
                }
                bvt.a(connectionResult);
                bvt.a.c();
            }
        } else if (bvt.d == null || !b(bvt.e)) {
            ConnectionResult connectionResult2 = bvt.d;
            if (!(connectionResult2 == null || bvt.e == null)) {
                if (bvt.b.l < bvt.a.l) {
                    connectionResult2 = bvt.e;
                }
                bvt.a(connectionResult2);
            }
        } else {
            bvt.b.c();
            bvt.a(bvt.d);
        }
    }

    static /* synthetic */ void a(bvt bvt, int i2, boolean z) {
        bvt.i.a(i2, z);
        bvt.e = null;
        bvt.d = null;
    }
}
