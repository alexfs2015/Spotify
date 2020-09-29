package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bss reason: default package */
public final class bss implements Callback {
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: 0000 */
    public static final Object b = new Object();
    /* access modifiers changed from: private */
    public static final Status h = new Status(4, "The user must be signed in to make this API call.");
    private static bss l;
    public final AtomicInteger c = new AtomicInteger(1);
    public final AtomicInteger d = new AtomicInteger(0);
    /* access modifiers changed from: 0000 */
    public bte e = null;
    /* access modifiers changed from: 0000 */
    public final Set<bvj<?>> f = new dq();
    public final Handler g;
    /* access modifiers changed from: private */
    public long i = 5000;
    /* access modifiers changed from: private */
    public long j = 120000;
    /* access modifiers changed from: private */
    public long k = 10000;
    /* access modifiers changed from: private */
    public final Context m;
    private final brx n;
    /* access modifiers changed from: private */
    public final bwp o;
    /* access modifiers changed from: private */
    public final Map<bvj<?>, a<?>> p = new ConcurrentHashMap(5, 0.75f, 1);
    private final Set<bvj<?>> q = new dq();

    /* renamed from: bss$a */
    public class a<O extends d> implements defpackage.bsh.b, defpackage.bsh.c, bvs {
        final f a;
        final Set<bvl> b = new HashSet();
        final Map<defpackage.bsw.a<?>, buw> c = new HashMap();
        final int d;
        final buy e;
        boolean f;
        final List<b> g = new ArrayList();
        private final Queue<bua> i = new LinkedList();
        private final defpackage.bsc.b j;
        private final bvj<O> k;
        private final btc l;
        private ConnectionResult m = null;

        public a(bsg<O> bsg) {
            this.a = bsg.a(bss.this.g.getLooper(), this);
            f fVar = this.a;
            if (fVar instanceof bxc) {
                this.j = ((bxc) fVar).a;
            } else {
                this.j = fVar;
            }
            this.k = bsg.d;
            this.l = new btc();
            this.d = bsg.f;
            if (this.a.i()) {
                this.e = bsg.a(bss.this.m, bss.this.g);
            } else {
                this.e = null;
            }
        }

        public final void a(Bundle bundle) {
            if (Looper.myLooper() == bss.this.g.getLooper()) {
                a();
            } else {
                bss.this.g.post(new buk(this));
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            e();
            c(ConnectionResult.a);
            g();
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                if (a(((buw) it.next()).a.b) != null) {
                    it.remove();
                } else {
                    try {
                        new exj();
                    } catch (DeadObjectException unused) {
                        a(1);
                        this.a.f();
                    } catch (RemoteException unused2) {
                        it.remove();
                    }
                }
            }
            c();
            j();
        }

        public final void a(int i2) {
            if (Looper.myLooper() == bss.this.g.getLooper()) {
                b();
            } else {
                bss.this.g.post(new bul(this));
            }
        }

        /* access modifiers changed from: 0000 */
        public final void b() {
            e();
            this.f = true;
            this.l.c();
            bss.this.g.sendMessageDelayed(Message.obtain(bss.this.g, 9, this.k), bss.this.i);
            bss.this.g.sendMessageDelayed(Message.obtain(bss.this.g, 11, this.k), bss.this.j);
            bss.this.o.a.clear();
        }

        private final boolean b(ConnectionResult connectionResult) {
            synchronized (bss.b) {
                if (bss.this.e == null || !bss.this.f.contains(this.k)) {
                    return false;
                }
                bss.this.e.b(connectionResult, this.d);
                return true;
            }
        }

        public final void a(ConnectionResult connectionResult, bsc<?> bsc, boolean z) {
            if (Looper.myLooper() == bss.this.g.getLooper()) {
                a(connectionResult);
            } else {
                bss.this.g.post(new bum(this, connectionResult));
            }
        }

        public final void a(ConnectionResult connectionResult) {
            bwx.a(bss.this.g);
            buy buy = this.e;
            if (buy != null) {
                buy.a();
            }
            e();
            bss.this.o.a.clear();
            c(connectionResult);
            if (connectionResult.b == 4) {
                a(bss.h);
            } else if (this.i.isEmpty()) {
                this.m = connectionResult;
            } else {
                if (!b(connectionResult) && !bss.this.a(connectionResult, this.d)) {
                    if (connectionResult.b == 18) {
                        this.f = true;
                    }
                    if (this.f) {
                        bss.this.g.sendMessageDelayed(Message.obtain(bss.this.g, 9, this.k), bss.this.i);
                        return;
                    }
                    String str = this.k.a.b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38);
                    sb.append("API: ");
                    sb.append(str);
                    sb.append(" is not available on this device.");
                    a(new Status(17, sb.toString()));
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            ArrayList arrayList = new ArrayList(this.i);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                bua bua = (bua) obj;
                if (!this.a.g()) {
                    return;
                }
                if (b(bua)) {
                    this.i.remove(bua);
                }
            }
        }

        public final void a(bua bua) {
            bwx.a(bss.this.g);
            if (!this.a.g()) {
                this.i.add(bua);
                ConnectionResult connectionResult = this.m;
                if (connectionResult == null || !connectionResult.a()) {
                    h();
                } else {
                    a(this.m);
                }
            } else if (b(bua)) {
                j();
            } else {
                this.i.add(bua);
            }
        }

        public final void d() {
            bwx.a(bss.this.g);
            a(bss.a);
            this.l.b();
            for (defpackage.bsw.a bvi : (defpackage.bsw.a[]) this.c.keySet().toArray(new defpackage.bsw.a[this.c.size()])) {
                a((bua) new bvi(bvi, new exj()));
            }
            c(new ConnectionResult(4));
            if (this.a.g()) {
                this.a.a((e) new bun(this));
            }
        }

        public final void e() {
            bwx.a(bss.this.g);
            this.m = null;
        }

        public final ConnectionResult f() {
            bwx.a(bss.this.g);
            return this.m;
        }

        private final boolean b(bua bua) {
            if (!(bua instanceof bux)) {
                c(bua);
                return true;
            }
            bux bux = (bux) bua;
            brw a2 = a(bux.b(this));
            if (a2 == null) {
                c(bua);
                return true;
            }
            if (bux.c(this)) {
                b bVar = new b(this.k, a2, 0);
                int indexOf = this.g.indexOf(bVar);
                if (indexOf >= 0) {
                    b bVar2 = (b) this.g.get(indexOf);
                    bss.this.g.removeMessages(15, bVar2);
                    bss.this.g.sendMessageDelayed(Message.obtain(bss.this.g, 15, bVar2), bss.this.i);
                } else {
                    this.g.add(bVar);
                    bss.this.g.sendMessageDelayed(Message.obtain(bss.this.g, 15, bVar), bss.this.i);
                    bss.this.g.sendMessageDelayed(Message.obtain(bss.this.g, 16, bVar), bss.this.j);
                    ConnectionResult connectionResult = new ConnectionResult(2, null);
                    if (!b(connectionResult)) {
                        bss.this.a(connectionResult, this.d);
                    }
                }
            } else {
                bux.a((RuntimeException) new UnsupportedApiCallException(a2));
            }
            return false;
        }

        private final void c(bua bua) {
            bua.a(this.l, i());
            try {
                bua.a(this);
            } catch (DeadObjectException unused) {
                a(1);
                this.a.f();
            }
        }

        public final void a(Status status) {
            bwx.a(bss.this.g);
            for (bua a2 : this.i) {
                a2.a(status);
            }
            this.i.clear();
        }

        /* access modifiers changed from: 0000 */
        public final void g() {
            if (this.f) {
                bss.this.g.removeMessages(11, this.k);
                bss.this.g.removeMessages(9, this.k);
                this.f = false;
            }
        }

        private final void j() {
            bss.this.g.removeMessages(12, this.k);
            bss.this.g.sendMessageDelayed(bss.this.g.obtainMessage(12, this.k), bss.this.k);
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(boolean z) {
            bwx.a(bss.this.g);
            if (!this.a.g() || this.c.size() != 0) {
                return false;
            }
            if (this.l.a()) {
                if (z) {
                    j();
                }
                return false;
            }
            this.a.f();
            return true;
        }

        public final void h() {
            bwx.a(bss.this.g);
            if (!this.a.g() && !this.a.h()) {
                int a2 = bss.this.o.a(bss.this.m, this.a);
                if (a2 != 0) {
                    a(new ConnectionResult(a2, null));
                    return;
                }
                c cVar = new c(this.a, this.k);
                if (this.a.i()) {
                    this.e.a((bvb) cVar);
                }
                this.a.a((defpackage.bwg.c) cVar);
            }
        }

        private final void c(ConnectionResult connectionResult) {
            for (bvl bvl : this.b) {
                String str = null;
                if (bwv.a(connectionResult, ConnectionResult.a)) {
                    str = this.a.j();
                }
                bvl.a(this.k, connectionResult, str);
            }
            this.b.clear();
        }

        public final boolean i() {
            return this.a.i();
        }

        private final brw a(brw[] brwArr) {
            if (!(brwArr == null || brwArr.length == 0)) {
                brw[] k2 = this.a.k();
                if (k2 == null) {
                    k2 = new brw[0];
                }
                dp dpVar = new dp(k2.length);
                for (brw brw : k2) {
                    dpVar.put(brw.a, Long.valueOf(brw.a()));
                }
                for (brw brw2 : brwArr) {
                    if (!dpVar.containsKey(brw2.a) || ((Long) dpVar.get(brw2.a)).longValue() < brw2.a()) {
                        return brw2;
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        public final void a(b bVar) {
            if (this.g.remove(bVar)) {
                bss.this.g.removeMessages(15, bVar);
                bss.this.g.removeMessages(16, bVar);
                brw brw = bVar.b;
                ArrayList arrayList = new ArrayList(this.i.size());
                for (bua bua : this.i) {
                    if (bua instanceof bux) {
                        brw[] b2 = ((bux) bua).b(this);
                        if (b2 != null && bzd.a((T[]) b2, brw)) {
                            arrayList.add(bua);
                        }
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    bua bua2 = (bua) obj;
                    this.i.remove(bua2);
                    bua2.a((RuntimeException) new UnsupportedApiCallException(brw));
                }
            }
        }
    }

    /* renamed from: bss$b */
    static class b {
        final bvj<?> a;
        final brw b;

        private b(bvj<?> bvj, brw brw) {
            this.a = bvj;
            this.b = brw;
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (bwv.a(this.a, bVar.a) && bwv.a(this.b, bVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b});
        }

        public final String toString() {
            return bwv.a((Object) this).a("key", this.a).a("feature", this.b).toString();
        }

        /* synthetic */ b(bvj bvj, brw brw, byte b2) {
            this(bvj, brw);
        }
    }

    /* renamed from: bss$c */
    class c implements bvb, defpackage.bwg.c {
        final f a;
        final bvj<?> b;
        boolean c = false;
        private bwq e = null;
        private Set<Scope> f = null;

        public c(f fVar, bvj<?> bvj) {
            this.a = fVar;
            this.b = bvj;
        }

        public final void a(ConnectionResult connectionResult) {
            bss.this.g.post(new bup(this, connectionResult));
        }

        public final void b(ConnectionResult connectionResult) {
            a aVar = (a) bss.this.p.get(this.b);
            bwx.a(bss.this.g);
            aVar.a.f();
            aVar.a(connectionResult);
        }

        public final void a(bwq bwq, Set<Scope> set) {
            if (bwq == null || set == null) {
                new Exception();
                b(new ConnectionResult(4));
                return;
            }
            this.e = bwq;
            this.f = set;
            a();
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            if (this.c) {
                bwq bwq = this.e;
                if (bwq != null) {
                    this.a.a(bwq, this.f);
                }
            }
        }
    }

    public static bss a(Context context) {
        bss bss;
        synchronized (b) {
            if (l == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                l = new bss(context.getApplicationContext(), handlerThread.getLooper(), brx.a());
            }
            bss = l;
        }
        return bss;
    }

    public static bss a() {
        bss bss;
        synchronized (b) {
            bwx.a(l, (Object) "Must guarantee manager is non-null before using getInstance");
            bss = l;
        }
        return bss;
    }

    public static void b() {
        synchronized (b) {
            if (l != null) {
                bss bss = l;
                bss.d.incrementAndGet();
                bss.g.sendMessageAtFrontOfQueue(bss.g.obtainMessage(10));
            }
        }
    }

    private bss(Context context, Looper looper, brx brx) {
        this.m = context;
        this.g = new ege(looper, this);
        this.n = brx;
        this.o = new bwp(brx);
        Handler handler = this.g;
        handler.sendMessage(handler.obtainMessage(6));
    }

    public final void a(bsg<?> bsg) {
        Handler handler = this.g;
        handler.sendMessage(handler.obtainMessage(7, bsg));
    }

    public final void a(bte bte) {
        synchronized (b) {
            if (this.e != bte) {
                this.e = bte;
                this.f.clear();
            }
            this.f.addAll(bte.b);
        }
    }

    public final exi<Map<bvj<?>, String>> a(Iterable<? extends bsg<?>> iterable) {
        bvl bvl = new bvl(iterable);
        Handler handler = this.g;
        handler.sendMessage(handler.obtainMessage(2, bvl));
        return bvl.b.a;
    }

    public final void c() {
        Handler handler = this.g;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x01af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            int r0 = r8.what
            r1 = 300000(0x493e0, double:1.482197E-318)
            r3 = 0
            r4 = 0
            r5 = 1
            switch(r0) {
                case 1: goto L_0x02f8;
                case 2: goto L_0x0297;
                case 3: goto L_0x027a;
                case 4: goto L_0x0234;
                case 5: goto L_0x01b3;
                case 6: goto L_0x0156;
                case 7: goto L_0x014d;
                case 8: goto L_0x0234;
                case 9: goto L_0x0129;
                case 10: goto L_0x0104;
                case 11: goto L_0x00b7;
                case 12: goto L_0x009e;
                case 13: goto L_0x0234;
                case 14: goto L_0x0070;
                case 15: goto L_0x003a;
                case 16: goto L_0x001d;
                default: goto L_0x000b;
            }
        L_0x000b:
            int r8 = r8.what
            r0 = 31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Unknown message id: "
            r1.append(r0)
            r1.append(r8)
            return r3
        L_0x001d:
            java.lang.Object r8 = r8.obj
            bss$b r8 = (defpackage.bss.b) r8
            java.util.Map<bvj<?>, bss$a<?>> r0 = r7.p
            bvj<?> r1 = r8.a
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x032f
            java.util.Map<bvj<?>, bss$a<?>> r0 = r7.p
            bvj<?> r1 = r8.a
            java.lang.Object r0 = r0.get(r1)
            bss$a r0 = (defpackage.bss.a) r0
            r0.a(r8)
            goto L_0x032f
        L_0x003a:
            java.lang.Object r8 = r8.obj
            bss$b r8 = (defpackage.bss.b) r8
            java.util.Map<bvj<?>, bss$a<?>> r0 = r7.p
            bvj<?> r1 = r8.a
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x032f
            java.util.Map<bvj<?>, bss$a<?>> r0 = r7.p
            bvj<?> r1 = r8.a
            java.lang.Object r0 = r0.get(r1)
            bss$a r0 = (defpackage.bss.a) r0
            java.util.List<bss$b> r1 = r0.g
            boolean r8 = r1.contains(r8)
            if (r8 == 0) goto L_0x032f
            boolean r8 = r0.f
            if (r8 != 0) goto L_0x032f
            bsc$f r8 = r0.a
            boolean r8 = r8.g()
            if (r8 != 0) goto L_0x006b
            r0.h()
            goto L_0x032f
        L_0x006b:
            r0.c()
            goto L_0x032f
        L_0x0070:
            java.lang.Object r8 = r8.obj
            btf r8 = (defpackage.btf) r8
            bvj<?> r0 = r8.a
            java.util.Map<bvj<?>, bss$a<?>> r1 = r7.p
            boolean r1 = r1.containsKey(r0)
            if (r1 != 0) goto L_0x0087
            exj<java.lang.Boolean> r8 = r8.b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.a(r0)
            goto L_0x032f
        L_0x0087:
            java.util.Map<bvj<?>, bss$a<?>> r1 = r7.p
            java.lang.Object r0 = r1.get(r0)
            bss$a r0 = (defpackage.bss.a) r0
            boolean r0 = r0.a(r3)
            exj<java.lang.Boolean> r8 = r8.b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.a(r0)
            goto L_0x032f
        L_0x009e:
            java.util.Map<bvj<?>, bss$a<?>> r0 = r7.p
            java.lang.Object r1 = r8.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x032f
            java.util.Map<bvj<?>, bss$a<?>> r0 = r7.p
            java.lang.Object r8 = r8.obj
            java.lang.Object r8 = r0.get(r8)
            bss$a r8 = (defpackage.bss.a) r8
            r8.a(r5)
            goto L_0x032f
        L_0x00b7:
            java.util.Map<bvj<?>, bss$a<?>> r0 = r7.p
            java.lang.Object r1 = r8.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x032f
            java.util.Map<bvj<?>, bss$a<?>> r0 = r7.p
            java.lang.Object r8 = r8.obj
            java.lang.Object r8 = r0.get(r8)
            bss$a r8 = (defpackage.bss.a) r8
            bss r0 = defpackage.bss.this
            android.os.Handler r0 = r0.g
            defpackage.bwx.a(r0)
            boolean r0 = r8.f
            if (r0 == 0) goto L_0x032f
            r8.g()
            bss r0 = defpackage.bss.this
            brx r0 = r0.n
            bss r1 = defpackage.bss.this
            android.content.Context r1 = r1.m
            int r0 = r0.a(r1)
            r1 = 18
            r2 = 8
            if (r0 != r1) goto L_0x00f3
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.String r1 = "Connection timed out while waiting for Google Play services update to complete."
            r0.<init>(r2, r1)
            goto L_0x00fa
        L_0x00f3:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.lang.String r1 = "API failed to connect while resuming due to an unknown error."
            r0.<init>(r2, r1)
        L_0x00fa:
            r8.a(r0)
            bsc$f r8 = r8.a
            r8.f()
            goto L_0x032f
        L_0x0104:
            java.util.Set<bvj<?>> r8 = r7.q
            java.util.Iterator r8 = r8.iterator()
        L_0x010a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0122
            java.lang.Object r0 = r8.next()
            bvj r0 = (defpackage.bvj) r0
            java.util.Map<bvj<?>, bss$a<?>> r1 = r7.p
            java.lang.Object r0 = r1.remove(r0)
            bss$a r0 = (defpackage.bss.a) r0
            r0.d()
            goto L_0x010a
        L_0x0122:
            java.util.Set<bvj<?>> r8 = r7.q
            r8.clear()
            goto L_0x032f
        L_0x0129:
            java.util.Map<bvj<?>, bss$a<?>> r0 = r7.p
            java.lang.Object r1 = r8.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x032f
            java.util.Map<bvj<?>, bss$a<?>> r0 = r7.p
            java.lang.Object r8 = r8.obj
            java.lang.Object r8 = r0.get(r8)
            bss$a r8 = (defpackage.bss.a) r8
            bss r0 = defpackage.bss.this
            android.os.Handler r0 = r0.g
            defpackage.bwx.a(r0)
            boolean r0 = r8.f
            if (r0 == 0) goto L_0x032f
            r8.h()
            goto L_0x032f
        L_0x014d:
            java.lang.Object r8 = r8.obj
            bsg r8 = (defpackage.bsg) r8
            r7.b(r8)
            goto L_0x032f
        L_0x0156:
            android.content.Context r8 = r7.m
            android.content.Context r8 = r8.getApplicationContext()
            boolean r8 = r8 instanceof android.app.Application
            if (r8 == 0) goto L_0x032f
            android.content.Context r8 = r7.m
            android.content.Context r8 = r8.getApplicationContext()
            android.app.Application r8 = (android.app.Application) r8
            defpackage.bsq.a(r8)
            bsq r8 = defpackage.bsq.a()
            buj r0 = new buj
            r0.<init>(r7)
            r8.a(r0)
            bsq r8 = defpackage.bsq.a()
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.b
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x01a7
            boolean r0 = defpackage.bzo.b()
            if (r0 == 0) goto L_0x01a5
            android.app.ActivityManager$RunningAppProcessInfo r0 = new android.app.ActivityManager$RunningAppProcessInfo
            r0.<init>()
            android.app.ActivityManager.getMyMemoryState(r0)
            java.util.concurrent.atomic.AtomicBoolean r3 = r8.b
            boolean r3 = r3.getAndSet(r5)
            if (r3 != 0) goto L_0x01a7
            int r0 = r0.importance
            r3 = 100
            if (r0 <= r3) goto L_0x01a7
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.a
            r0.set(r5)
            goto L_0x01a7
        L_0x01a5:
            r8 = 1
            goto L_0x01ad
        L_0x01a7:
            java.util.concurrent.atomic.AtomicBoolean r8 = r8.a
            boolean r8 = r8.get()
        L_0x01ad:
            if (r8 != 0) goto L_0x032f
            r7.k = r1
            goto L_0x032f
        L_0x01b3:
            int r0 = r8.arg1
            java.lang.Object r8 = r8.obj
            com.google.android.gms.common.ConnectionResult r8 = (com.google.android.gms.common.ConnectionResult) r8
            java.util.Map<bvj<?>, bss$a<?>> r1 = r7.p
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x01c3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01d4
            java.lang.Object r2 = r1.next()
            bss$a r2 = (defpackage.bss.a) r2
            int r3 = r2.d
            if (r3 != r0) goto L_0x01c3
            goto L_0x01d5
        L_0x01d4:
            r2 = r4
        L_0x01d5:
            if (r2 == 0) goto L_0x0219
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 17
            brx r3 = r7.n
            int r4 = r8.b
            java.lang.String r3 = r3.b(r4)
            java.lang.String r8 = r8.d
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            int r4 = r4 + 69
            java.lang.String r6 = java.lang.String.valueOf(r8)
            int r6 = r6.length()
            int r4 = r4 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r4)
            java.lang.String r4 = "Error resolution was canceled by the user, original error message: "
            r6.append(r4)
            r6.append(r3)
            java.lang.String r3 = ": "
            r6.append(r3)
            r6.append(r8)
            java.lang.String r8 = r6.toString()
            r0.<init>(r1, r8)
            r2.a(r0)
            goto L_0x032f
        L_0x0219:
            r8 = 76
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            java.lang.String r8 = "Could not find API instance "
            r1.append(r8)
            r1.append(r0)
            java.lang.String r8 = " while trying to fail enqueued calls."
            r1.append(r8)
            java.lang.Exception r8 = new java.lang.Exception
            r8.<init>()
            goto L_0x032f
        L_0x0234:
            java.lang.Object r8 = r8.obj
            buv r8 = (defpackage.buv) r8
            java.util.Map<bvj<?>, bss$a<?>> r0 = r7.p
            bsg<?> r1 = r8.c
            bvj<O> r1 = r1.d
            java.lang.Object r0 = r0.get(r1)
            bss$a r0 = (defpackage.bss.a) r0
            if (r0 != 0) goto L_0x0257
            bsg<?> r0 = r8.c
            r7.b(r0)
            java.util.Map<bvj<?>, bss$a<?>> r0 = r7.p
            bsg<?> r1 = r8.c
            bvj<O> r1 = r1.d
            java.lang.Object r0 = r0.get(r1)
            bss$a r0 = (defpackage.bss.a) r0
        L_0x0257:
            boolean r1 = r0.i()
            if (r1 == 0) goto L_0x0273
            java.util.concurrent.atomic.AtomicInteger r1 = r7.d
            int r1 = r1.get()
            int r2 = r8.b
            if (r1 == r2) goto L_0x0273
            bua r8 = r8.a
            com.google.android.gms.common.api.Status r1 = a
            r8.a(r1)
            r0.d()
            goto L_0x032f
        L_0x0273:
            bua r8 = r8.a
            r0.a(r8)
            goto L_0x032f
        L_0x027a:
            java.util.Map<bvj<?>, bss$a<?>> r8 = r7.p
            java.util.Collection r8 = r8.values()
            java.util.Iterator r8 = r8.iterator()
        L_0x0284:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x032f
            java.lang.Object r0 = r8.next()
            bss$a r0 = (defpackage.bss.a) r0
            r0.e()
            r0.h()
            goto L_0x0284
        L_0x0297:
            java.lang.Object r8 = r8.obj
            bvl r8 = (defpackage.bvl) r8
            dp<bvj<?>, com.google.android.gms.common.ConnectionResult> r0 = r8.a
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x02a5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x032f
            java.lang.Object r1 = r0.next()
            bvj r1 = (defpackage.bvj) r1
            java.util.Map<bvj<?>, bss$a<?>> r2 = r7.p
            java.lang.Object r2 = r2.get(r1)
            bss$a r2 = (defpackage.bss.a) r2
            if (r2 != 0) goto L_0x02c6
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r2 = 13
            r0.<init>(r2)
            r8.a(r1, r0, r4)
            goto L_0x032f
        L_0x02c6:
            bsc$f r3 = r2.a
            boolean r3 = r3.g()
            if (r3 == 0) goto L_0x02da
            com.google.android.gms.common.ConnectionResult r3 = com.google.android.gms.common.ConnectionResult.a
            bsc$f r2 = r2.a
            java.lang.String r2 = r2.j()
            r8.a(r1, r3, r2)
            goto L_0x02a5
        L_0x02da:
            com.google.android.gms.common.ConnectionResult r3 = r2.f()
            if (r3 == 0) goto L_0x02e8
            com.google.android.gms.common.ConnectionResult r2 = r2.f()
            r8.a(r1, r2, r4)
            goto L_0x02a5
        L_0x02e8:
            bss r1 = defpackage.bss.this
            android.os.Handler r1 = r1.g
            defpackage.bwx.a(r1)
            java.util.Set<bvl> r1 = r2.b
            r1.add(r8)
            r2.h()
            goto L_0x02a5
        L_0x02f8:
            java.lang.Object r8 = r8.obj
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0304
            r1 = 10000(0x2710, double:4.9407E-320)
        L_0x0304:
            r7.k = r1
            android.os.Handler r8 = r7.g
            r0 = 12
            r8.removeMessages(r0)
            java.util.Map<bvj<?>, bss$a<?>> r8 = r7.p
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0317:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x032f
            java.lang.Object r1 = r8.next()
            bvj r1 = (defpackage.bvj) r1
            android.os.Handler r2 = r7.g
            android.os.Message r1 = r2.obtainMessage(r0, r1)
            long r3 = r7.k
            r2.sendMessageDelayed(r1, r3)
            goto L_0x0317
        L_0x032f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bss.handleMessage(android.os.Message):boolean");
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(ConnectionResult connectionResult, int i2) {
        return this.n.a(this.m, connectionResult, i2);
    }

    public final void b(ConnectionResult connectionResult, int i2) {
        if (!a(connectionResult, i2)) {
            Handler handler = this.g;
            handler.sendMessage(handler.obtainMessage(5, i2, 0, connectionResult));
        }
    }

    private final void b(bsg<?> bsg) {
        bvj<O> bvj = bsg.d;
        a aVar = (a) this.p.get(bvj);
        if (aVar == null) {
            aVar = new a(bsg);
            this.p.put(bvj, aVar);
        }
        if (aVar.i()) {
            this.q.add(bvj);
        }
        aVar.h();
    }
}
