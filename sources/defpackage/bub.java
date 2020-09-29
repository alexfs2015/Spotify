package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: bub reason: default package */
public final class bub implements buv {
    final buw a;
    final Lock b;
    final Context c;
    final bsp d;
    ext e;
    boolean f;
    boolean g;
    bxh h;
    boolean i;
    boolean j;
    final bwy k;
    private ConnectionResult l;
    private int m;
    private int n = 0;
    private int o;
    private final Bundle p = new Bundle();
    private final Set<c> q = new HashSet();
    private boolean r;
    private final Map<bst<?>, Boolean> s;
    private final a<? extends ext, exd> t;
    private ArrayList<Future<?>> u = new ArrayList<>();

    public bub(buw buw, bwy bwy, Map<bst<?>, Boolean> map, bsp bsp, a<? extends ext, exd> aVar, Lock lock, Context context) {
        this.a = buw;
        this.k = bwy;
        this.s = map;
        this.d = bsp;
        this.t = aVar;
        this.b = lock;
        this.c = context;
    }

    private final void a(boolean z) {
        ext ext = this.e;
        if (ext != null) {
            if (ext.g() && z) {
                this.e.s();
            }
            this.e.f();
            this.h = null;
        }
    }

    private static String c(int i2) {
        return i2 != 0 ? i2 != 1 ? "UNKNOWN" : "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    private final void g() {
        this.a.d();
        buz.a().execute(new buc(this));
        ext ext = this.e;
        if (ext != null) {
            if (this.i) {
                ext.a(this.h, this.j);
            }
            a(false);
        }
        for (c cVar : this.a.g.keySet()) {
            ((f) this.a.f.get(cVar)).f();
        }
        this.a.n.a(this.p.isEmpty() ? null : this.p);
    }

    private final void h() {
        ArrayList arrayList = this.u;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((Future) obj).cancel(true);
        }
        this.u.clear();
    }

    public final <A extends b, R extends btc, T extends a<R, A>> T a(T t2) {
        this.a.m.a.add(t2);
        return t2;
    }

    public final void a() {
        this.a.g.clear();
        this.f = false;
        this.l = null;
        this.n = 0;
        this.r = true;
        this.g = false;
        this.i = false;
        HashMap hashMap = new HashMap();
        for (bst bst : this.s.keySet()) {
            f fVar = (f) this.a.f.get(bst.b());
            boolean booleanValue = ((Boolean) this.s.get(bst)).booleanValue();
            if (fVar.i()) {
                this.f = true;
                if (booleanValue) {
                    this.q.add(bst.b());
                } else {
                    this.r = false;
                }
            }
            hashMap.put(fVar, new bud(this, bst, booleanValue));
        }
        if (this.f) {
            this.k.h = Integer.valueOf(System.identityHashCode(this.a.m));
            buk buk = new buk(this, 0);
            a<? extends ext, exd> aVar = this.t;
            Context context = this.c;
            Looper c2 = this.a.m.c();
            bwy bwy = this.k;
            this.e = (ext) aVar.a(context, c2, bwy, bwy.g, buk, buk);
        }
        this.o = this.a.f.size();
        this.u.add(buz.a().submit(new bue(this, hashMap)));
    }

    public final void a(int i2) {
        b(new ConnectionResult(8, null));
    }

    public final void a(Bundle bundle) {
        if (b(1)) {
            if (bundle != null) {
                this.p.putAll(bundle);
            }
            if (d()) {
                g();
            }
        }
    }

    public final void a(ConnectionResult connectionResult, bst<?> bst, boolean z) {
        if (b(1)) {
            b(connectionResult, bst, z);
            if (d()) {
                g();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(ConnectionResult connectionResult) {
        return this.r && !connectionResult.a();
    }

    public final <A extends b, T extends a<? extends btc, A>> T b(T t2) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* access modifiers changed from: 0000 */
    public final void b(ConnectionResult connectionResult) {
        h();
        a(!connectionResult.a());
        this.a.a(connectionResult);
        this.a.n.a(connectionResult);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if ((r6.a() || r5.d.a((android.content.Context) null, r6.b, (java.lang.String) null) != null) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(com.google.android.gms.common.ConnectionResult r6, defpackage.bst<?> r7, boolean r8) {
        /*
            r5 = this;
            r0 = 0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 1
            if (r8 == 0) goto L_0x001e
            boolean r8 = r6.a()
            if (r8 == 0) goto L_0x000f
        L_0x000d:
            r8 = 1
            goto L_0x001c
        L_0x000f:
            bsp r8 = r5.d
            int r3 = r6.b
            r4 = 0
            android.content.Intent r8 = r8.a(r4, r3, r4)
            if (r8 == 0) goto L_0x001b
            goto L_0x000d
        L_0x001b:
            r8 = 0
        L_0x001c:
            if (r8 == 0) goto L_0x0027
        L_0x001e:
            com.google.android.gms.common.ConnectionResult r8 = r5.l
            if (r8 == 0) goto L_0x0026
            int r8 = r5.m
            if (r1 >= r8) goto L_0x0027
        L_0x0026:
            r0 = 1
        L_0x0027:
            if (r0 == 0) goto L_0x002d
            r5.l = r6
            r5.m = r1
        L_0x002d:
            buw r8 = r5.a
            java.util.Map<bst$c<?>, com.google.android.gms.common.ConnectionResult> r8 = r8.g
            bst$c r7 = r7.b()
            r8.put(r7, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bub.b(com.google.android.gms.common.ConnectionResult, bst, boolean):void");
    }

    public final boolean b() {
        h();
        a(true);
        this.a.a((ConnectionResult) null);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final boolean b(int i2) {
        if (this.n == i2) {
            return true;
        }
        this.a.m.n();
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Unexpected callback in ");
        sb.append(valueOf);
        int i3 = this.o;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i3);
        String c2 = c(this.n);
        String c3 = c(i2);
        StringBuilder sb3 = new StringBuilder(String.valueOf(c2).length() + 70 + String.valueOf(c3).length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(c2);
        sb3.append(" but received callback for step ");
        sb3.append(c3);
        new Exception();
        b(new ConnectionResult(8, null));
        return false;
    }

    public final void c() {
    }

    /* access modifiers changed from: 0000 */
    public final boolean d() {
        this.o--;
        int i2 = this.o;
        if (i2 > 0) {
            return false;
        }
        if (i2 < 0) {
            this.a.m.n();
            new Exception();
            b(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.l;
        if (connectionResult == null) {
            return true;
        }
        this.a.l = this.m;
        b(connectionResult);
        return false;
    }

    /* access modifiers changed from: 0000 */
    public final void e() {
        if (this.o == 0) {
            if (!this.f || this.g) {
                ArrayList arrayList = new ArrayList();
                this.n = 1;
                this.o = this.a.f.size();
                for (c cVar : this.a.f.keySet()) {
                    if (!this.a.g.containsKey(cVar)) {
                        arrayList.add((f) this.a.f.get(cVar));
                    } else if (d()) {
                        g();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.u.add(buz.a().submit(new buh(this, arrayList)));
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void f() {
        this.f = false;
        this.a.m.c = Collections.emptySet();
        for (c cVar : this.q) {
            if (!this.a.g.containsKey(cVar)) {
                this.a.g.put(cVar, new ConnectionResult(17, null));
            }
        }
    }
}
