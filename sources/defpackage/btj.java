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

/* renamed from: btj reason: default package */
public final class btj implements Callback {
    public static final Status a = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: 0000 */
    public static final Object b = new Object();
    /* access modifiers changed from: private */
    public static final Status h = new Status(4, "The user must be signed in to make this API call.");
    private static btj l;
    public final AtomicInteger c = new AtomicInteger(1);
    public final AtomicInteger d = new AtomicInteger(0);
    /* access modifiers changed from: 0000 */
    public btv e = null;
    /* access modifiers changed from: 0000 */
    public final Set<bwa<?>> f = new dq();
    public final Handler g;
    /* access modifiers changed from: private */
    public long i = 5000;
    /* access modifiers changed from: private */
    public long j = 120000;
    /* access modifiers changed from: private */
    public long k = 10000;
    /* access modifiers changed from: private */
    public final Context m;
    private final bso n;
    /* access modifiers changed from: private */
    public final bxg o;
    /* access modifiers changed from: private */
    public final Map<bwa<?>, a<?>> p = new ConcurrentHashMap(5, 0.75f, 1);
    private final Set<bwa<?>> q = new dq();

    /* renamed from: btj$a */
    public class a<O extends d> implements defpackage.bsy.b, defpackage.bsy.c, bwj {
        final f a;
        final Set<bwc> b = new HashSet();
        final Map<defpackage.btn.a<?>, bvn> c = new HashMap();
        final int d;
        final bvp e;
        boolean f;
        final List<b> g = new ArrayList();
        private final Queue<bur> i = new LinkedList();
        private final defpackage.bst.b j;
        private final bwa<O> k;
        private final btt l;
        private ConnectionResult m = null;

        public a(bsx<O> bsx) {
            this.a = bsx.a(btj.this.g.getLooper(), this);
            f fVar = this.a;
            if (fVar instanceof bxt) {
                this.j = ((bxt) fVar).a;
            } else {
                this.j = fVar;
            }
            this.k = bsx.d;
            this.l = new btt();
            this.d = bsx.f;
            if (this.a.i()) {
                this.e = bsx.a(btj.this.m, btj.this.g);
            } else {
                this.e = null;
            }
        }

        private final bsn a(bsn[] bsnArr) {
            if (!(bsnArr == null || bsnArr.length == 0)) {
                bsn[] k2 = this.a.k();
                if (k2 == null) {
                    k2 = new bsn[0];
                }
                dp dpVar = new dp(k2.length);
                for (bsn bsn : k2) {
                    dpVar.put(bsn.a, Long.valueOf(bsn.a()));
                }
                for (bsn bsn2 : bsnArr) {
                    if (!dpVar.containsKey(bsn2.a) || ((Long) dpVar.get(bsn2.a)).longValue() < bsn2.a()) {
                        return bsn2;
                    }
                }
            }
            return null;
        }

        private final boolean b(bur bur) {
            if (!(bur instanceof bvo)) {
                c(bur);
                return true;
            }
            bvo bvo = (bvo) bur;
            bsn a2 = a(bvo.b(this));
            if (a2 == null) {
                c(bur);
                return true;
            }
            if (bvo.c(this)) {
                b bVar = new b(this.k, a2, 0);
                int indexOf = this.g.indexOf(bVar);
                if (indexOf >= 0) {
                    b bVar2 = (b) this.g.get(indexOf);
                    btj.this.g.removeMessages(15, bVar2);
                    btj.this.g.sendMessageDelayed(Message.obtain(btj.this.g, 15, bVar2), btj.this.i);
                } else {
                    this.g.add(bVar);
                    btj.this.g.sendMessageDelayed(Message.obtain(btj.this.g, 15, bVar), btj.this.i);
                    btj.this.g.sendMessageDelayed(Message.obtain(btj.this.g, 16, bVar), btj.this.j);
                    ConnectionResult connectionResult = new ConnectionResult(2, null);
                    if (!b(connectionResult)) {
                        btj.this.a(connectionResult, this.d);
                    }
                }
            } else {
                bvo.a((RuntimeException) new UnsupportedApiCallException(a2));
            }
            return false;
        }

        private final boolean b(ConnectionResult connectionResult) {
            synchronized (btj.b) {
                if (btj.this.e == null || !btj.this.f.contains(this.k)) {
                    return false;
                }
                btj.this.e.b(connectionResult, this.d);
                return true;
            }
        }

        private final void c(bur bur) {
            bur.a(this.l, i());
            try {
                bur.a(this);
            } catch (DeadObjectException unused) {
                a(1);
                this.a.f();
            }
        }

        private final void c(ConnectionResult connectionResult) {
            for (bwc bwc : this.b) {
                String str = null;
                if (bxm.a(connectionResult, ConnectionResult.a)) {
                    str = this.a.j();
                }
                bwc.a(this.k, connectionResult, str);
            }
            this.b.clear();
        }

        private final void j() {
            btj.this.g.removeMessages(12, this.k);
            btj.this.g.sendMessageDelayed(btj.this.g.obtainMessage(12, this.k), btj.this.k);
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            e();
            c(ConnectionResult.a);
            g();
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                if (a(((bvn) it.next()).a.b) != null) {
                    it.remove();
                } else {
                    try {
                        new eya();
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
            if (Looper.myLooper() == btj.this.g.getLooper()) {
                b();
            } else {
                btj.this.g.post(new bvc(this));
            }
        }

        public final void a(Bundle bundle) {
            if (Looper.myLooper() == btj.this.g.getLooper()) {
                a();
            } else {
                btj.this.g.post(new bvb(this));
            }
        }

        /* access modifiers changed from: 0000 */
        public final void a(b bVar) {
            if (this.g.remove(bVar)) {
                btj.this.g.removeMessages(15, bVar);
                btj.this.g.removeMessages(16, bVar);
                bsn bsn = bVar.b;
                ArrayList arrayList = new ArrayList(this.i.size());
                for (bur bur : this.i) {
                    if (bur instanceof bvo) {
                        bsn[] b2 = ((bvo) bur).b(this);
                        if (b2 != null && bzu.a((T[]) b2, bsn)) {
                            arrayList.add(bur);
                        }
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    bur bur2 = (bur) obj;
                    this.i.remove(bur2);
                    bur2.a((RuntimeException) new UnsupportedApiCallException(bsn));
                }
            }
        }

        public final void a(bur bur) {
            bxo.a(btj.this.g);
            if (!this.a.g()) {
                this.i.add(bur);
                ConnectionResult connectionResult = this.m;
                if (connectionResult == null || !connectionResult.a()) {
                    h();
                } else {
                    a(this.m);
                }
            } else if (b(bur)) {
                j();
            } else {
                this.i.add(bur);
            }
        }

        public final void a(ConnectionResult connectionResult) {
            bxo.a(btj.this.g);
            bvp bvp = this.e;
            if (bvp != null) {
                bvp.a();
            }
            e();
            btj.this.o.a.clear();
            c(connectionResult);
            if (connectionResult.b == 4) {
                a(btj.h);
            } else if (this.i.isEmpty()) {
                this.m = connectionResult;
            } else {
                if (!b(connectionResult) && !btj.this.a(connectionResult, this.d)) {
                    if (connectionResult.b == 18) {
                        this.f = true;
                    }
                    if (this.f) {
                        btj.this.g.sendMessageDelayed(Message.obtain(btj.this.g, 9, this.k), btj.this.i);
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

        public final void a(ConnectionResult connectionResult, bst<?> bst, boolean z) {
            if (Looper.myLooper() == btj.this.g.getLooper()) {
                a(connectionResult);
            } else {
                btj.this.g.post(new bvd(this, connectionResult));
            }
        }

        public final void a(Status status) {
            bxo.a(btj.this.g);
            for (bur a2 : this.i) {
                a2.a(status);
            }
            this.i.clear();
        }

        /* access modifiers changed from: 0000 */
        public final boolean a(boolean z) {
            bxo.a(btj.this.g);
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

        /* access modifiers changed from: 0000 */
        public final void b() {
            e();
            this.f = true;
            this.l.c();
            btj.this.g.sendMessageDelayed(Message.obtain(btj.this.g, 9, this.k), btj.this.i);
            btj.this.g.sendMessageDelayed(Message.obtain(btj.this.g, 11, this.k), btj.this.j);
            btj.this.o.a.clear();
        }

        /* access modifiers changed from: 0000 */
        public final void c() {
            ArrayList arrayList = new ArrayList(this.i);
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                bur bur = (bur) obj;
                if (!this.a.g()) {
                    return;
                }
                if (b(bur)) {
                    this.i.remove(bur);
                }
            }
        }

        public final void d() {
            bxo.a(btj.this.g);
            a(btj.a);
            this.l.b();
            for (defpackage.btn.a bvz : (defpackage.btn.a[]) this.c.keySet().toArray(new defpackage.btn.a[this.c.size()])) {
                a((bur) new bvz(bvz, new eya()));
            }
            c(new ConnectionResult(4));
            if (this.a.g()) {
                this.a.a((e) new bve(this));
            }
        }

        public final void e() {
            bxo.a(btj.this.g);
            this.m = null;
        }

        public final ConnectionResult f() {
            bxo.a(btj.this.g);
            return this.m;
        }

        /* access modifiers changed from: 0000 */
        public final void g() {
            if (this.f) {
                btj.this.g.removeMessages(11, this.k);
                btj.this.g.removeMessages(9, this.k);
                this.f = false;
            }
        }

        public final void h() {
            bxo.a(btj.this.g);
            if (!this.a.g() && !this.a.h()) {
                int a2 = btj.this.o.a(btj.this.m, this.a);
                if (a2 != 0) {
                    a(new ConnectionResult(a2, null));
                    return;
                }
                c cVar = new c(this.a, this.k);
                if (this.a.i()) {
                    this.e.a((bvs) cVar);
                }
                this.a.a((defpackage.bwx.c) cVar);
            }
        }

        public final boolean i() {
            return this.a.i();
        }
    }

    /* renamed from: btj$b */
    static class b {
        final bwa<?> a;
        final bsn b;

        private b(bwa<?> bwa, bsn bsn) {
            this.a = bwa;
            this.b = bsn;
        }

        /* synthetic */ b(bwa bwa, bsn bsn, byte b2) {
            this(bwa, bsn);
        }

        public final boolean equals(Object obj) {
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (bxm.a(this.a, bVar.a) && bxm.a(this.b, bVar.b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.a, this.b});
        }

        public final String toString() {
            return bxm.a((Object) this).a("key", this.a).a("feature", this.b).toString();
        }
    }

    /* renamed from: btj$c */
    class c implements bvs, defpackage.bwx.c {
        final f a;
        final bwa<?> b;
        boolean c = false;
        private bxh e = null;
        private Set<Scope> f = null;

        public c(f fVar, bwa<?> bwa) {
            this.a = fVar;
            this.b = bwa;
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            if (this.c) {
                bxh bxh = this.e;
                if (bxh != null) {
                    this.a.a(bxh, this.f);
                }
            }
        }

        public final void a(bxh bxh, Set<Scope> set) {
            if (bxh == null || set == null) {
                new Exception();
                b(new ConnectionResult(4));
                return;
            }
            this.e = bxh;
            this.f = set;
            a();
        }

        public final void a(ConnectionResult connectionResult) {
            btj.this.g.post(new bvg(this, connectionResult));
        }

        public final void b(ConnectionResult connectionResult) {
            a aVar = (a) btj.this.p.get(this.b);
            bxo.a(btj.this.g);
            aVar.a.f();
            aVar.a(connectionResult);
        }
    }

    private btj(Context context, Looper looper, bso bso) {
        this.m = context;
        this.g = new egv(looper, this);
        this.n = bso;
        this.o = new bxg(bso);
        Handler handler = this.g;
        handler.sendMessage(handler.obtainMessage(6));
    }

    public static btj a() {
        btj btj;
        synchronized (b) {
            bxo.a(l, (Object) "Must guarantee manager is non-null before using getInstance");
            btj = l;
        }
        return btj;
    }

    public static btj a(Context context) {
        btj btj;
        synchronized (b) {
            if (l == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                l = new btj(context.getApplicationContext(), handlerThread.getLooper(), bso.a());
            }
            btj = l;
        }
        return btj;
    }

    public static void b() {
        synchronized (b) {
            if (l != null) {
                btj btj = l;
                btj.d.incrementAndGet();
                btj.g.sendMessageAtFrontOfQueue(btj.g.obtainMessage(10));
            }
        }
    }

    private final void b(bsx<?> bsx) {
        bwa<O> bwa = bsx.d;
        a aVar = (a) this.p.get(bwa);
        if (aVar == null) {
            aVar = new a(bsx);
            this.p.put(bwa, aVar);
        }
        if (aVar.i()) {
            this.q.add(bwa);
        }
        aVar.h();
    }

    public final exz<Map<bwa<?>, String>> a(Iterable<? extends bsx<?>> iterable) {
        bwc bwc = new bwc(iterable);
        Handler handler = this.g;
        handler.sendMessage(handler.obtainMessage(2, bwc));
        return bwc.b.a;
    }

    public final void a(bsx<?> bsx) {
        Handler handler = this.g;
        handler.sendMessage(handler.obtainMessage(7, bsx));
    }

    public final void a(btv btv) {
        synchronized (b) {
            if (this.e != btv) {
                this.e = btv;
                this.f.clear();
            }
            this.f.addAll(btv.b);
        }
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
            btj$b r8 = (defpackage.btj.b) r8
            java.util.Map<bwa<?>, btj$a<?>> r0 = r7.p
            bwa<?> r1 = r8.a
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x032f
            java.util.Map<bwa<?>, btj$a<?>> r0 = r7.p
            bwa<?> r1 = r8.a
            java.lang.Object r0 = r0.get(r1)
            btj$a r0 = (defpackage.btj.a) r0
            r0.a(r8)
            goto L_0x032f
        L_0x003a:
            java.lang.Object r8 = r8.obj
            btj$b r8 = (defpackage.btj.b) r8
            java.util.Map<bwa<?>, btj$a<?>> r0 = r7.p
            bwa<?> r1 = r8.a
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x032f
            java.util.Map<bwa<?>, btj$a<?>> r0 = r7.p
            bwa<?> r1 = r8.a
            java.lang.Object r0 = r0.get(r1)
            btj$a r0 = (defpackage.btj.a) r0
            java.util.List<btj$b> r1 = r0.g
            boolean r8 = r1.contains(r8)
            if (r8 == 0) goto L_0x032f
            boolean r8 = r0.f
            if (r8 != 0) goto L_0x032f
            bst$f r8 = r0.a
            boolean r8 = r8.g()
            if (r8 != 0) goto L_0x006b
            r0.h()
            goto L_0x032f
        L_0x006b:
            r0.c()
            goto L_0x032f
        L_0x0070:
            java.lang.Object r8 = r8.obj
            btw r8 = (defpackage.btw) r8
            bwa<?> r0 = r8.a
            java.util.Map<bwa<?>, btj$a<?>> r1 = r7.p
            boolean r1 = r1.containsKey(r0)
            if (r1 != 0) goto L_0x0087
            eya<java.lang.Boolean> r8 = r8.b
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.a(r0)
            goto L_0x032f
        L_0x0087:
            java.util.Map<bwa<?>, btj$a<?>> r1 = r7.p
            java.lang.Object r0 = r1.get(r0)
            btj$a r0 = (defpackage.btj.a) r0
            boolean r0 = r0.a(r3)
            eya<java.lang.Boolean> r8 = r8.b
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.a(r0)
            goto L_0x032f
        L_0x009e:
            java.util.Map<bwa<?>, btj$a<?>> r0 = r7.p
            java.lang.Object r1 = r8.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x032f
            java.util.Map<bwa<?>, btj$a<?>> r0 = r7.p
            java.lang.Object r8 = r8.obj
            java.lang.Object r8 = r0.get(r8)
            btj$a r8 = (defpackage.btj.a) r8
            r8.a(r5)
            goto L_0x032f
        L_0x00b7:
            java.util.Map<bwa<?>, btj$a<?>> r0 = r7.p
            java.lang.Object r1 = r8.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x032f
            java.util.Map<bwa<?>, btj$a<?>> r0 = r7.p
            java.lang.Object r8 = r8.obj
            java.lang.Object r8 = r0.get(r8)
            btj$a r8 = (defpackage.btj.a) r8
            btj r0 = defpackage.btj.this
            android.os.Handler r0 = r0.g
            defpackage.bxo.a(r0)
            boolean r0 = r8.f
            if (r0 == 0) goto L_0x032f
            r8.g()
            btj r0 = defpackage.btj.this
            bso r0 = r0.n
            btj r1 = defpackage.btj.this
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
            bst$f r8 = r8.a
            r8.f()
            goto L_0x032f
        L_0x0104:
            java.util.Set<bwa<?>> r8 = r7.q
            java.util.Iterator r8 = r8.iterator()
        L_0x010a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0122
            java.lang.Object r0 = r8.next()
            bwa r0 = (defpackage.bwa) r0
            java.util.Map<bwa<?>, btj$a<?>> r1 = r7.p
            java.lang.Object r0 = r1.remove(r0)
            btj$a r0 = (defpackage.btj.a) r0
            r0.d()
            goto L_0x010a
        L_0x0122:
            java.util.Set<bwa<?>> r8 = r7.q
            r8.clear()
            goto L_0x032f
        L_0x0129:
            java.util.Map<bwa<?>, btj$a<?>> r0 = r7.p
            java.lang.Object r1 = r8.obj
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x032f
            java.util.Map<bwa<?>, btj$a<?>> r0 = r7.p
            java.lang.Object r8 = r8.obj
            java.lang.Object r8 = r0.get(r8)
            btj$a r8 = (defpackage.btj.a) r8
            btj r0 = defpackage.btj.this
            android.os.Handler r0 = r0.g
            defpackage.bxo.a(r0)
            boolean r0 = r8.f
            if (r0 == 0) goto L_0x032f
            r8.h()
            goto L_0x032f
        L_0x014d:
            java.lang.Object r8 = r8.obj
            bsx r8 = (defpackage.bsx) r8
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
            defpackage.bth.a(r8)
            bth r8 = defpackage.bth.a()
            bva r0 = new bva
            r0.<init>(r7)
            r8.a(r0)
            bth r8 = defpackage.bth.a()
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.b
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x01a7
            boolean r0 = defpackage.caf.b()
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
            java.util.Map<bwa<?>, btj$a<?>> r1 = r7.p
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        L_0x01c3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01d4
            java.lang.Object r2 = r1.next()
            btj$a r2 = (defpackage.btj.a) r2
            int r3 = r2.d
            if (r3 != r0) goto L_0x01c3
            goto L_0x01d5
        L_0x01d4:
            r2 = r4
        L_0x01d5:
            if (r2 == 0) goto L_0x0219
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r1 = 17
            bso r3 = r7.n
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
            bvm r8 = (defpackage.bvm) r8
            java.util.Map<bwa<?>, btj$a<?>> r0 = r7.p
            bsx<?> r1 = r8.c
            bwa<O> r1 = r1.d
            java.lang.Object r0 = r0.get(r1)
            btj$a r0 = (defpackage.btj.a) r0
            if (r0 != 0) goto L_0x0257
            bsx<?> r0 = r8.c
            r7.b(r0)
            java.util.Map<bwa<?>, btj$a<?>> r0 = r7.p
            bsx<?> r1 = r8.c
            bwa<O> r1 = r1.d
            java.lang.Object r0 = r0.get(r1)
            btj$a r0 = (defpackage.btj.a) r0
        L_0x0257:
            boolean r1 = r0.i()
            if (r1 == 0) goto L_0x0273
            java.util.concurrent.atomic.AtomicInteger r1 = r7.d
            int r1 = r1.get()
            int r2 = r8.b
            if (r1 == r2) goto L_0x0273
            bur r8 = r8.a
            com.google.android.gms.common.api.Status r1 = a
            r8.a(r1)
            r0.d()
            goto L_0x032f
        L_0x0273:
            bur r8 = r8.a
            r0.a(r8)
            goto L_0x032f
        L_0x027a:
            java.util.Map<bwa<?>, btj$a<?>> r8 = r7.p
            java.util.Collection r8 = r8.values()
            java.util.Iterator r8 = r8.iterator()
        L_0x0284:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x032f
            java.lang.Object r0 = r8.next()
            btj$a r0 = (defpackage.btj.a) r0
            r0.e()
            r0.h()
            goto L_0x0284
        L_0x0297:
            java.lang.Object r8 = r8.obj
            bwc r8 = (defpackage.bwc) r8
            dp<bwa<?>, com.google.android.gms.common.ConnectionResult> r0 = r8.a
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x02a5:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x032f
            java.lang.Object r1 = r0.next()
            bwa r1 = (defpackage.bwa) r1
            java.util.Map<bwa<?>, btj$a<?>> r2 = r7.p
            java.lang.Object r2 = r2.get(r1)
            btj$a r2 = (defpackage.btj.a) r2
            if (r2 != 0) goto L_0x02c6
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r2 = 13
            r0.<init>(r2)
            r8.a(r1, r0, r4)
            goto L_0x032f
        L_0x02c6:
            bst$f r3 = r2.a
            boolean r3 = r3.g()
            if (r3 == 0) goto L_0x02da
            com.google.android.gms.common.ConnectionResult r3 = com.google.android.gms.common.ConnectionResult.a
            bst$f r2 = r2.a
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
            btj r1 = defpackage.btj.this
            android.os.Handler r1 = r1.g
            defpackage.bxo.a(r1)
            java.util.Set<bwc> r1 = r2.b
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
            java.util.Map<bwa<?>, btj$a<?>> r8 = r7.p
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0317:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x032f
            java.lang.Object r1 = r8.next()
            bwa r1 = (defpackage.bwa) r1
            android.os.Handler r2 = r7.g
            android.os.Message r1 = r2.obtainMessage(r0, r1)
            long r3 = r7.k
            r2.sendMessageDelayed(r1, r3)
            goto L_0x0317
        L_0x032f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.btj.handleMessage(android.os.Message):boolean");
    }
}
