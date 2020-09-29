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

/* renamed from: btw reason: default package */
public final class btw extends bsh implements buu {
    final Queue<a<?, ?>> a = new LinkedList();
    final Map<c<?>, f> b;
    Set<Scope> c = new HashSet();
    Set<bvc> d = null;
    final bvd e;
    private final Lock f;
    private boolean g;
    private final bwm h;
    private but i = null;
    private final int j;
    /* access modifiers changed from: private */
    public final Context k;
    private final Looper l;
    private volatile boolean m;
    private long n = 120000;
    private long o = 5000;
    private final buc p;
    private final brx q;
    private bur r;
    private final bwh s;
    private final Map<bsc<?>, Boolean> t;
    private final a<? extends exc, ewm> u;
    private final bsx v = new bsx();
    private final ArrayList<bvr> w;
    private Integer x = null;
    private final a y = new btx(this);

    public btw(Context context, Lock lock, Looper looper, bwh bwh, brx brx, a<? extends exc, ewm> aVar, Map<bsc<?>, Boolean> map, List<b> list, List<c> list2, Map<c<?>, f> map2, int i2, int i3, ArrayList<bvr> arrayList) {
        Looper looper2 = looper;
        this.k = context;
        this.f = lock;
        this.g = false;
        this.h = new bwm(looper, this.y);
        this.l = looper2;
        this.p = new buc(this, looper);
        this.q = brx;
        this.j = i2;
        if (this.j >= 0) {
            this.x = Integer.valueOf(i3);
        }
        this.t = map;
        this.b = map2;
        this.w = arrayList;
        this.e = new bvd(this.b);
        for (b bVar : list) {
            bwm bwm = this.h;
            bwx.a(bVar);
            synchronized (bwm.i) {
                if (bwm.b.contains(bVar)) {
                    String valueOf = String.valueOf(bVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                    sb.append("registerConnectionCallbacks(): listener ");
                    sb.append(valueOf);
                    sb.append(" is already registered");
                } else {
                    bwm.b.add(bVar);
                }
            }
            if (bwm.a.g()) {
                bwm.h.sendMessage(bwm.h.obtainMessage(1, bVar));
            }
        }
        for (c a2 : list2) {
            this.h.a(a2);
        }
        this.s = bwh;
        this.u = aVar;
    }

    private static String c(int i2) {
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    public final <C extends f> C a(c<C> cVar) {
        C c2 = (f) this.b.get(cVar);
        bwx.a(c2, (Object) "Appropriate Api was not requested.");
        return c2;
    }

    public final void e() {
        this.f.lock();
        try {
            boolean z = false;
            if (this.j >= 0) {
                if (this.x != null) {
                    z = true;
                }
                bwx.a(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
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
            bwx.b(z, sb.toString());
            b(i2);
            o();
        } finally {
            this.f.unlock();
        }
    }

    public final ConnectionResult f() {
        boolean z = false;
        bwx.a(Looper.myLooper() != Looper.getMainLooper(), (Object) "blockingConnect must not be called on the UI thread");
        this.f.lock();
        try {
            if (this.j >= 0) {
                if (this.x != null) {
                    z = true;
                }
                bwx.a(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
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
            bsx bsx = this.v;
            for (bsw bsw : bsx.a) {
                bsw.a = null;
            }
            bsx.a.clear();
            for (a aVar : this.a) {
                aVar.a((bvf) null);
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

    public final bsi<Status> i() {
        bwx.a(j(), (Object) "GoogleApiClient is not connected yet.");
        bwx.a(this.x.intValue() != 2, (Object) "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        btb btb = new btb(this);
        if (this.b.containsKey(bxh.a)) {
            a((bsh) this, btb, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            bty bty = new bty(this, atomicReference, btb);
            btz btz = new btz(btb);
            a aVar = new a(this.k);
            bsc<Object> bsc = bxh.b;
            bwx.a(bsc, (Object) "Api must not be null");
            aVar.c.put(bsc, null);
            List a2 = bsc.a.a(null);
            aVar.b.addAll(a2);
            aVar.a.addAll(a2);
            a a3 = aVar.a((b) bty).a((c) btz);
            buc buc = this.p;
            bwx.a(buc, (Object) "Handler must not be null");
            a3.d = buc.getLooper();
            bsh a4 = a3.a();
            atomicReference.set(a4);
            a4.e();
        }
        return btb;
    }

    /* access modifiers changed from: private */
    public final void a(bsh bsh, btb btb, boolean z) {
        bxh.c.a(bsh).a((bsm<? super R>) new bub<Object>(this, btb, z, bsh));
    }

    public final boolean j() {
        but but = this.i;
        return but != null && but.e();
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
                        this.i = bvt.a(this.k, this, this.f, this.l, this.q, this.b, this.s, this.t, this.u, this.w);
                        return;
                    }
                }
            } else if (!z) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            } else if (z2) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            buf buf = new buf(this.k, this, this.f, this.l, this.q, this.b, this.s, this.t, this.u, this.w, this);
            this.i = buf;
        }
    }

    private final void o() {
        this.h.e = true;
        this.i.a();
    }

    /* access modifiers changed from: 0000 */
    public final boolean l() {
        if (!this.m) {
            return false;
        }
        this.m = false;
        this.p.removeMessages(2);
        this.p.removeMessages(1);
        bur bur = this.r;
        if (bur != null) {
            bur.a();
            this.r = null;
        }
        return true;
    }

    public final void a(c cVar) {
        this.h.a(cVar);
    }

    public final void b(c cVar) {
        bwm bwm = this.h;
        bwx.a(cVar);
        synchronized (bwm.i) {
            if (!bwm.d.remove(cVar)) {
                String valueOf = String.valueOf(cVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                sb.append("unregisterConnectionFailedListener(): listener ");
                sb.append(valueOf);
                sb.append(" not found");
            }
        }
    }

    public final void a(Bundle bundle) {
        while (!this.a.isEmpty()) {
            b((a) this.a.remove());
        }
        bwm bwm = this.h;
        boolean z = true;
        bwx.a(Looper.myLooper() == bwm.h.getLooper(), (Object) "onConnectionSuccess must only be called on the Handler thread");
        synchronized (bwm.i) {
            bwx.a(!bwm.g);
            bwm.h.removeMessages(1);
            bwm.g = true;
            if (bwm.c.size() != 0) {
                z = false;
            }
            bwx.a(z);
            ArrayList arrayList = new ArrayList(bwm.b);
            int i2 = bwm.f.get();
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                b bVar = (b) obj;
                if (!bwm.e || !bwm.a.g() || bwm.f.get() != i2) {
                    break;
                } else if (!bwm.c.contains(bVar)) {
                    bVar.a(bundle);
                }
            }
            bwm.c.clear();
            bwm.g = false;
        }
    }

    public final void a(ConnectionResult connectionResult) {
        if (!bry.c(this.k, connectionResult.b)) {
            l();
        }
        if (!this.m) {
            bwm bwm = this.h;
            int i2 = 0;
            bwx.a(Looper.myLooper() == bwm.h.getLooper(), (Object) "onConnectionFailure must only be called on the Handler thread");
            bwm.h.removeMessages(1);
            synchronized (bwm.i) {
                ArrayList arrayList = new ArrayList(bwm.d);
                int i3 = bwm.f.get();
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                while (true) {
                    if (i2 >= size) {
                        break;
                    }
                    Object obj = arrayList2.get(i2);
                    i2++;
                    c cVar = (c) obj;
                    if (!bwm.e) {
                        break;
                    } else if (bwm.f.get() != i3) {
                        break;
                    } else if (bwm.d.contains(cVar)) {
                        cVar.a(connectionResult);
                    }
                }
            }
            this.h.a();
        }
    }

    public final void a(int i2, boolean z) {
        if (i2 == 1 && !z && !this.m) {
            this.m = true;
            if (this.r == null) {
                this.r = this.q.a(this.k.getApplicationContext(), (bus) new bud(this));
            }
            buc buc = this.p;
            buc.sendMessageDelayed(buc.obtainMessage(1), this.n);
            buc buc2 = this.p;
            buc2.sendMessageDelayed(buc2.obtainMessage(2), this.o);
        }
        for (BasePendingResult c2 : (BasePendingResult[]) this.e.c.toArray(bvd.b)) {
            c2.c(bvd.a);
        }
        bwm bwm = this.h;
        bwx.a(Looper.myLooper() == bwm.h.getLooper(), (Object) "onUnintentionalDisconnection must only be called on the Handler thread");
        bwm.h.removeMessages(1);
        synchronized (bwm.i) {
            bwm.g = true;
            ArrayList arrayList = new ArrayList(bwm.b);
            int i3 = bwm.f.get();
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                b bVar = (b) obj;
                if (!bwm.e || bwm.f.get() != i3) {
                    break;
                } else if (bwm.b.contains(bVar)) {
                    bVar.a(i2);
                }
            }
            bwm.c.clear();
            bwm.g = false;
        }
        this.h.a();
        if (i2 == 2) {
            o();
        }
    }

    public final Context b() {
        return this.k;
    }

    public final Looper c() {
        return this.l;
    }

    public final boolean a(bsz bsz) {
        but but = this.i;
        return but != null && but.a(bsz);
    }

    public final void d() {
        but but = this.i;
        if (but != null) {
            but.f();
        }
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

    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.k);
        printWriter.append(str).append("mResuming=").print(this.m);
        printWriter.append(" mWorkQueue.size()=").print(this.a.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.e.c.size());
        but but = this.i;
        if (but != null) {
            but.a(str, fileDescriptor, printWriter, strArr);
        }
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
        if (!z2) {
            return 3;
        }
        if (!z3 || !z) {
            return 1;
        }
        return 2;
    }

    public final <A extends b, R extends bsl, T extends a<R, A>> T a(T t2) {
        String str;
        bwx.b(t2.b != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.b.containsKey(t2.b);
        if (t2.c != null) {
            str = t2.c.b;
        } else {
            str = "the API";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        bwx.b(containsKey, sb.toString());
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

    public final <A extends b, T extends a<? extends bsl, A>> T b(T t2) {
        String str;
        bwx.b(t2.b != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.b.containsKey(t2.b);
        if (t2.c != null) {
            str = t2.c.b;
        } else {
            str = "the API";
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 65);
        sb.append("GoogleApiClient is not configured to use ");
        sb.append(str);
        sb.append(" required for this call.");
        bwx.b(containsKey, sb.toString());
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

    static /* synthetic */ void a(btw btw) {
        btw.f.lock();
        try {
            if (btw.m) {
                btw.o();
            }
        } finally {
            btw.f.unlock();
        }
    }

    static /* synthetic */ void b(btw btw) {
        btw.f.lock();
        try {
            if (btw.l()) {
                btw.o();
            }
        } finally {
            btw.f.unlock();
        }
    }
}
