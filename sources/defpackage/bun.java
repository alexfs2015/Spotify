package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

/* renamed from: bun reason: default package */
public final class bun extends bsy implements bvl {
    final Queue<a<?, ?>> a = new LinkedList();
    final Map<c<?>, f> b;
    Set<Scope> c = new HashSet();
    Set<bvt> d = null;
    final bvu e;
    private final Lock f;
    private boolean g;
    private final bxd h;
    private bvk i = null;
    private final int j;
    /* access modifiers changed from: private */
    public final Context k;
    private final Looper l;
    private volatile boolean m;
    private long n = 120000;
    private long o = 5000;
    private final but p;
    private final bso q;
    private bvi r;
    private final bwy s;
    private final Map<bst<?>, Boolean> t;
    private final a<? extends ext, exd> u;
    private final bto v = new bto();
    private final ArrayList<bwi> w;
    private Integer x = null;
    private final a y = new buo(this);

    public bun(Context context, Lock lock, Looper looper, bwy bwy, bso bso, a<? extends ext, exd> aVar, Map<bst<?>, Boolean> map, List<b> list, List<c> list2, Map<c<?>, f> map2, int i2, int i3, ArrayList<bwi> arrayList) {
        Looper looper2 = looper;
        this.k = context;
        this.f = lock;
        this.g = false;
        this.h = new bxd(looper, this.y);
        this.l = looper2;
        this.p = new but(this, looper);
        this.q = bso;
        this.j = i2;
        if (this.j >= 0) {
            this.x = Integer.valueOf(i3);
        }
        this.t = map;
        this.b = map2;
        this.w = arrayList;
        this.e = new bvu(this.b);
        for (b bVar : list) {
            bxd bxd = this.h;
            bxo.a(bVar);
            synchronized (bxd.i) {
                if (bxd.b.contains(bVar)) {
                    String valueOf = String.valueOf(bVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                    sb.append("registerConnectionCallbacks(): listener ");
                    sb.append(valueOf);
                    sb.append(" is already registered");
                } else {
                    bxd.b.add(bVar);
                }
            }
            if (bxd.a.g()) {
                bxd.h.sendMessage(bxd.h.obtainMessage(1, bVar));
            }
        }
        for (c a2 : list2) {
            this.h.a(a2);
        }
        this.s = bwy;
        this.u = aVar;
    }

    public static int a(Iterable<f> iterable, boolean z) {
        boolean z2 = false;
        boolean z3 = false;
        for (f fVar : iterable) {
            if (fVar.i()) {
                z2 = true;
            }
            if (fVar.c()) {
                z3 = true;
            }
        }
        if (z2) {
            return (!z3 || !z) ? 1 : 2;
        }
        return 3;
    }

    /* access modifiers changed from: private */
    public final void a(bsy bsy, bts bts, boolean z) {
        bxy.c.a(bsy).a((btd<? super R>) new bus<Object>(this, bts, z, bsy));
    }

    static /* synthetic */ void a(bun bun) {
        bun.f.lock();
        try {
            if (bun.m) {
                bun.o();
            }
        } finally {
            bun.f.unlock();
        }
    }

    private final void b(int i2) {
        Integer num = this.x;
        if (num == null) {
            this.x = Integer.valueOf(i2);
        } else if (num.intValue() != i2) {
            String c2 = c(i2);
            String c3 = c(this.x.intValue());
            StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 51 + String.valueOf(c3).length());
            sb.append("Cannot use sign-in mode: ");
            sb.append(c2);
            sb.append(". Mode was already set to ");
            sb.append(c3);
            throw new IllegalStateException(sb.toString());
        }
        if (this.i == null) {
            boolean z = false;
            boolean z2 = false;
            for (f fVar : this.b.values()) {
                if (fVar.i()) {
                    z = true;
                }
                if (fVar.c()) {
                    z2 = true;
                }
            }
            int intValue = this.x.intValue();
            if (intValue != 1) {
                if (intValue == 2) {
                    if (z) {
                        this.i = bwk.a(this.k, this, this.f, this.l, this.q, this.b, this.s, this.t, this.u, this.w);
                        return;
                    }
                }
            } else if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            buw buw = new buw(this.k, this, this.f, this.l, this.q, this.b, this.s, this.t, this.u, this.w, this);
            this.i = buw;
        }
    }

    static /* synthetic */ void b(bun bun) {
        bun.f.lock();
        try {
            if (bun.l()) {
                bun.o();
            }
        } finally {
            bun.f.unlock();
        }
    }

    private static String c(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    private final void o() {
        this.h.e = true;
        this.i.a();
    }

    public final <C extends f> C a(c<C> cVar) {
        C c2 = (f) this.b.get(cVar);
        bxo.a(c2, (Object) "Appropriate Api was not requested.");
        return c2;
    }

    public final <A extends b, R extends btc, T extends a<R, A>> T a(T t2) {
        bxo.b(t2.b != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.b.containsKey(t2.b);
        String str = t2.c != null ? t2.c.b : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        bxo.b(containsKey, sb.toString());
        this.f.lock();
        try {
            if (this.i == null) {
                this.a.add(t2);
                return t2;
            }
            T a2 = this.i.a(t2);
            this.f.unlock();
            return a2;
        } finally {
            this.f.unlock();
        }
    }

    public final void a(int i2) {
        this.f.lock();
        boolean z = true;
        if (!(i2 == 3 || i2 == 1 || i2 == 2)) {
            z = false;
        }
        try {
            StringBuilder sb = new StringBuilder(33);
            sb.append("Illegal sign-in mode: ");
            sb.append(i2);
            bxo.b(z, sb.toString());
            b(i2);
            o();
        } finally {
            this.f.unlock();
        }
    }

    public final void a(int i2, boolean z) {
        if (i2 == 1 && !z && !this.m) {
            this.m = true;
            if (this.r == null) {
                this.r = this.q.a(this.k.getApplicationContext(), (bvj) new buu(this));
            }
            but but = this.p;
            but.sendMessageDelayed(but.obtainMessage(1), this.n);
            but but2 = this.p;
            but2.sendMessageDelayed(but2.obtainMessage(2), this.o);
        }
        for (BasePendingResult c2 : (BasePendingResult[]) this.e.c.toArray(bvu.b)) {
            c2.c(bvu.a);
        }
        bxd bxd = this.h;
        bxo.a(Looper.myLooper() == bxd.h.getLooper(), (Object) "onUnintentionalDisconnection must only be called on the Handler thread");
        bxd.h.removeMessages(1);
        synchronized (bxd.i) {
            bxd.g = true;
            ArrayList arrayList = new ArrayList(bxd.b);
            int i3 = bxd.f.get();
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                b bVar = (b) obj;
                if (!bxd.e || bxd.f.get() != i3) {
                    break;
                } else if (bxd.b.contains(bVar)) {
                    bVar.a(i2);
                }
            }
            bxd.c.clear();
            bxd.g = false;
        }
        this.h.a();
        if (i2 == 2) {
            o();
        }
    }

    public final void a(Bundle bundle) {
        while (!this.a.isEmpty()) {
            b((a) this.a.remove());
        }
        bxd bxd = this.h;
        boolean z = true;
        bxo.a(Looper.myLooper() == bxd.h.getLooper(), (Object) "onConnectionSuccess must only be called on the Handler thread");
        synchronized (bxd.i) {
            bxo.a(!bxd.g);
            bxd.h.removeMessages(1);
            bxd.g = true;
            if (bxd.c.size() != 0) {
                z = false;
            }
            bxo.a(z);
            ArrayList arrayList = new ArrayList(bxd.b);
            int i2 = bxd.f.get();
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                b bVar = (b) obj;
                if (!bxd.e || !bxd.a.g() || bxd.f.get() != i2) {
                    break;
                } else if (!bxd.c.contains(bVar)) {
                    bVar.a(bundle);
                }
            }
            bxd.c.clear();
            bxd.g = false;
        }
    }

    public final void a(c cVar) {
        this.h.a(cVar);
    }

    public final void a(ConnectionResult connectionResult) {
        if (!bsp.c(this.k, connectionResult.b)) {
            l();
        }
        if (!this.m) {
            bxd bxd = this.h;
            int i2 = 0;
            bxo.a(Looper.myLooper() == bxd.h.getLooper(), (Object) "onConnectionFailure must only be called on the Handler thread");
            bxd.h.removeMessages(1);
            synchronized (bxd.i) {
                ArrayList arrayList = new ArrayList(bxd.d);
                int i3 = bxd.f.get();
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    Object obj = arrayList2.get(i2);
                    i2++;
                    c cVar = (c) obj;
                    if (!bxd.e) {
                        break;
                    } else if (bxd.f.get() != i3) {
                        break;
                    } else if (bxd.d.contains(cVar)) {
                        cVar.a(connectionResult);
                    }
                }
            }
            this.h.a();
        }
    }

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.k);
        printWriter.append(str).append("mResuming=").print(this.m);
        printWriter.append(" mWorkQueue.size()=").print(this.a.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.e.c.size());
        bvk bvk = this.i;
        if (bvk != null) {
            bvk.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final boolean a(btq btq) {
        bvk bvk = this.i;
        return bvk != null && bvk.a(btq);
    }

    public final Context b() {
        return this.k;
    }

    public final <A extends b, T extends a<? extends btc, A>> T b(T t2) {
        bxo.b(t2.b != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.b.containsKey(t2.b);
        String str = t2.c != null ? t2.c.b : "the API";
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        bxo.b(containsKey, sb.toString());
        this.f.lock();
        try {
            if (this.i == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            } else if (this.m) {
                this.a.add(t2);
                while (!this.a.isEmpty()) {
                    a aVar = (a) this.a.remove();
                    this.e.a(aVar);
                    aVar.b(Status.c);
                }
                return t2;
            } else {
                T b2 = this.i.b(t2);
                this.f.unlock();
                return b2;
            }
        } finally {
            this.f.unlock();
        }
    }

    public final void b(c cVar) {
        bxd bxd = this.h;
        bxo.a(cVar);
        synchronized (bxd.i) {
            if (!bxd.d.remove(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
            }
        }
    }

    public final Looper c() {
        return this.l;
    }

    public final void d() {
        bvk bvk = this.i;
        if (bvk != null) {
            bvk.f();
        }
    }

    public final void e() {
        this.f.lock();
        try {
            boolean z = false;
            if (this.j >= 0) {
                if (this.x != null) {
                    z = true;
                }
                bxo.a(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.x == null) {
                this.x = Integer.valueOf(a((Iterable<f>) this.b.values(), false));
            } else if (this.x.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            a(this.x.intValue());
        } finally {
            this.f.unlock();
        }
    }

    public final ConnectionResult f() {
        boolean z = false;
        bxo.a(Looper.myLooper() != Looper.getMainLooper(), (Object) "blockingConnect must not be called on the UI thread");
        this.f.lock();
        try {
            if (this.j >= 0) {
                if (this.x != null) {
                    z = true;
                }
                bxo.a(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.x == null) {
                this.x = Integer.valueOf(a((Iterable<f>) this.b.values(), false));
            } else if (this.x.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            b(this.x.intValue());
            this.h.e = true;
            return this.i.b();
        } finally {
            this.f.unlock();
        }
    }

    public final void g() {
        this.f.lock();
        try {
            this.e.a();
            if (this.i != null) {
                this.i.c();
            }
            bto bto = this.v;
            for (btn btn : bto.a) {
                btn.a = null;
            }
            bto.a.clear();
            for (a aVar : this.a) {
                aVar.a((bvw) null);
                aVar.b();
            }
            this.a.clear();
            if (this.i != null) {
                l();
                this.h.a();
                this.f.unlock();
            }
        } finally {
            this.f.unlock();
        }
    }

    public final void h() {
        g();
        e();
    }

    public final bsz<Status> i() {
        bxo.a(j(), (Object) "GoogleApiClient is not connected yet.");
        bxo.a(this.x.intValue() != 2, (Object) "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        bts bts = new bts(this);
        if (this.b.containsKey(bxy.a)) {
            a((bsy) this, bts, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            bup bup = new bup(this, atomicReference, bts);
            buq buq = new buq(bts);
            a aVar = new a(this.k);
            bst<Object> bst = bxy.b;
            bxo.a(bst, (Object) "Api must not be null");
            aVar.c.put(bst, null);
            List a2 = bst.a.a(null);
            aVar.b.addAll(a2);
            aVar.a.addAll(a2);
            a a3 = aVar.a((b) bup).a((c) buq);
            but but = this.p;
            bxo.a(but, (Object) "Handler must not be null");
            a3.d = but.getLooper();
            bsy a4 = a3.a();
            atomicReference.set(a4);
            a4.e();
        }
        return bts;
    }

    public final boolean j() {
        bvk bvk = this.i;
        return bvk != null && bvk.e();
    }

    /* access modifiers changed from: 0000 */
    public final boolean l() {
        if (!this.m) {
            return false;
        }
        this.m = false;
        this.p.removeMessages(2);
        this.p.removeMessages(1);
        bvi bvi = this.r;
        if (bvi != null) {
            bvi.a();
            this.r = null;
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    public final boolean m() {
        this.f.lock();
        try {
            if (this.d == null) {
                this.f.unlock();
                return false;
            }
            boolean z = !this.d.isEmpty();
            this.f.unlock();
            return z;
        } catch (Throwable th) {
            this.f.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    public final String n() {
        StringWriter stringWriter = new StringWriter();
        a("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }
}
