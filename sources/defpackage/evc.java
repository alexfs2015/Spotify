package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: evc reason: default package */
public class evc implements esw {
    private static volatile evc f;
    etm a;
    final ery b;
    List<Runnable> c;
    int d;
    int e;
    private ert g;
    private era h;
    private evz i;
    private ere j;
    private euy k;
    private evs l;
    private final evi m;
    private boolean n;
    private boolean o;
    private boolean p;
    private long q;
    private boolean r;
    private boolean s;
    private boolean t;
    private FileLock u;
    private FileChannel v;
    private List<Long> w;
    private List<Long> x;
    private long y;

    /* renamed from: evc$a */
    class a implements ewb {
        ekj a;
        List<Long> b;
        List<ekg> c;
        private long d;

        private a() {
        }

        public final void a(ekj ekj) {
            bwx.a(ekj);
            this.a = ekj;
        }

        public final boolean a(long j, ekg ekg) {
            bwx.a(ekg);
            if (this.c == null) {
                this.c = new ArrayList();
            }
            if (this.b == null) {
                this.b = new ArrayList();
            }
            if (this.c.size() > 0 && a((ekg) this.c.get(0)) != a(ekg)) {
                return false;
            }
            long e2 = this.d + ((long) ekg.e());
            if (e2 >= ((long) Math.max(0, ((Integer) eqm.p.a()).intValue()))) {
                return false;
            }
            this.d = e2;
            this.c.add(ekg);
            this.b.add(Long.valueOf(j));
            if (this.c.size() >= Math.max(1, ((Integer) eqm.q.a()).intValue())) {
                return false;
            }
            return true;
        }

        private static long a(ekg ekg) {
            return ((ekg.c.longValue() / 1000) / 60) / 60;
        }

        /* synthetic */ a(evc evc, byte b2) {
            this();
        }
    }

    public static evc a(Context context) {
        bwx.a(context);
        bwx.a(context.getApplicationContext());
        if (f == null) {
            synchronized (evc.class) {
                if (f == null) {
                    f = new evc(new evh(context));
                }
            }
        }
        return f;
    }

    private evc(evh evh) {
        this(evh, 0);
    }

    private evc(evh evh, byte b2) {
        this.n = false;
        bwx.a(evh);
        this.b = ery.a(evh.a, (eqr) null);
        this.y = -1;
        evi evi = new evi(this);
        evi.t();
        this.m = evi;
        era era = new era(this);
        era.t();
        this.h = era;
        ert ert = new ert(this);
        ert.t();
        this.g = ert;
        this.b.p().a((Runnable) new evd(this, evh));
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.b.p().c();
        d().z();
        if (this.b.b().d.a() == 0) {
            this.b.b().d.a(this.b.l().a());
        }
        j();
    }

    public final evw b() {
        return this.b.e;
    }

    public final eqw q() {
        return this.b.q();
    }

    public final eru p() {
        return this.b.p();
    }

    private final ert n() {
        a((evb) this.g);
        return this.g;
    }

    public final era c() {
        a((evb) this.h);
        return this.h;
    }

    public final evz d() {
        a((evb) this.i);
        return this.i;
    }

    private final ere o() {
        ere ere = this.j;
        if (ere != null) {
            return ere;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final euy r() {
        a((evb) this.k);
        return this.k;
    }

    public final evs e() {
        a((evb) this.l);
        return this.l;
    }

    public final evi f() {
        a((evb) this.m);
        return this.m;
    }

    public final Context m() {
        return this.b.m();
    }

    public final bzg l() {
        return this.b.l();
    }

    /* access modifiers changed from: 0000 */
    public final void g() {
        this.b.p().c();
    }

    /* access modifiers changed from: 0000 */
    public final void h() {
        if (!this.n) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    static void a(evb evb) {
        if (evb == null) {
            throw new IllegalStateException("Upload Component not created");
        } else if (!evb.i()) {
            String valueOf = String.valueOf(evb.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
            sb.append("Component not initialized: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    private final long s() {
        long a2 = this.b.l().a();
        erh b2 = this.b.b();
        b2.w();
        b2.c();
        long a3 = b2.h.a();
        if (a3 == 0) {
            a3 = 1 + ((long) b2.o().g().nextInt(86400000));
            b2.h.a(a3);
        }
        return ((((a2 + a3) / 1000) / 60) / 60) / 24;
    }

    /* access modifiers changed from: 0000 */
    public final void a(eqk eqk, String str) {
        eqk eqk2 = eqk;
        String str2 = str;
        evp b2 = d().b(str2);
        if (b2 == null || TextUtils.isEmpty(b2.i())) {
            this.b.q().j.a("No app data available; dropping event", str2);
            return;
        }
        Boolean b3 = b(b2);
        if (b3 == null) {
            if (!"_ui".equals(eqk2.a)) {
                this.b.q().f.a("Could not find package. appId", eqw.a(str));
            }
        } else if (!b3.booleanValue()) {
            this.b.q().c.a("App version does not match; dropping event. appId", eqw.a(str));
            return;
        }
        evq evq = r2;
        evp evp = b2;
        evq evq2 = new evq(str, b2.c(), b2.i(), b2.j(), b2.k(), b2.l(), b2.m(), (String) null, b2.n(), false, evp.f(), evp.t(), 0, 0, evp.u(), evp.v(), false, evp.d());
        a(eqk2, evq);
    }

    /* access modifiers changed from: 0000 */
    public final void a(eqk eqk, evq evq) {
        List<evu> list;
        List<evu> list2;
        List<evu> list3;
        eqk eqk2 = eqk;
        evq evq2 = evq;
        bwx.a(evq);
        bwx.a(evq2.a);
        g();
        h();
        String str = evq2.a;
        long j2 = eqk2.d;
        if (f().a(eqk2, evq2)) {
            if (!evq2.h) {
                c(evq2);
                return;
            }
            d().e();
            try {
                evz d2 = d();
                bwx.a(str);
                d2.c();
                d2.j();
                if (j2 < 0) {
                    d2.q().f.a("Invalid time querying timed out conditional properties", eqw.a(str), Long.valueOf(j2));
                    list = Collections.emptyList();
                } else {
                    list = d2.a("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str, String.valueOf(j2)});
                }
                for (evu evu : list) {
                    if (evu != null) {
                        this.b.q().j.a("User property timed out", evu.a, this.b.f().c(evu.c.a), evu.c.a());
                        if (evu.g != null) {
                            b(new eqk(evu.g, j2), evq2);
                        }
                        d().e(str, evu.c.a);
                    }
                }
                evz d3 = d();
                bwx.a(str);
                d3.c();
                d3.j();
                if (j2 < 0) {
                    d3.q().f.a("Invalid time querying expired conditional properties", eqw.a(str), Long.valueOf(j2));
                    list2 = Collections.emptyList();
                } else {
                    list2 = d3.a("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str, String.valueOf(j2)});
                }
                ArrayList arrayList = new ArrayList(list2.size());
                for (evu evu2 : list2) {
                    if (evu2 != null) {
                        this.b.q().j.a("User property expired", evu2.a, this.b.f().c(evu2.c.a), evu2.c.a());
                        d().b(str, evu2.c.a);
                        if (evu2.k != null) {
                            arrayList.add(evu2.k);
                        }
                        d().e(str, evu2.c.a);
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    b(new eqk((eqk) obj, j2), evq2);
                }
                evz d4 = d();
                String str2 = eqk2.a;
                bwx.a(str);
                bwx.a(str2);
                d4.c();
                d4.j();
                if (j2 < 0) {
                    d4.q().f.a("Invalid time querying triggered conditional properties", eqw.a(str), d4.n().a(str2), Long.valueOf(j2));
                    list3 = Collections.emptyList();
                } else {
                    list3 = d4.a("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str, str2, String.valueOf(j2)});
                }
                ArrayList arrayList3 = new ArrayList(list3.size());
                for (evu evu3 : list3) {
                    if (evu3 != null) {
                        evj evj = evu3.c;
                        evl evl = r4;
                        evl evl2 = new evl(evu3.a, evu3.b, evj.a, j2, evj.a());
                        if (d().a(evl)) {
                            this.b.q().j.a("User property triggered", evu3.a, this.b.f().c(evl.c), evl.e);
                        } else {
                            this.b.q().c.a("Too many active user properties, ignoring", eqw.a(evu3.a), this.b.f().c(evl.c), evl.e);
                        }
                        if (evu3.i != null) {
                            arrayList3.add(evu3.i);
                        }
                        evu3.c = new evj(evl);
                        evu3.e = true;
                        d().a(evu3);
                    }
                }
                b(eqk, evq);
                ArrayList arrayList4 = arrayList3;
                int size2 = arrayList4.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList4.get(i3);
                    i3++;
                    b(new eqk((eqk) obj2, j2), evq2);
                }
                d().u();
            } finally {
                d().v();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:193:0x073a, code lost:
        r2 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0269 A[Catch:{ SQLiteException -> 0x0234, all -> 0x07e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x029e A[Catch:{ SQLiteException -> 0x0234, all -> 0x07e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x02ee A[Catch:{ SQLiteException -> 0x0234, all -> 0x07e5 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0319  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(defpackage.eqk r27, defpackage.evq r28) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
            r3 = r28
            java.lang.String r4 = "_sno"
            defpackage.bwx.a(r28)
            java.lang.String r0 = r3.a
            defpackage.bwx.a(r0)
            long r5 = java.lang.System.nanoTime()
            r26.g()
            r26.h()
            java.lang.String r15 = r3.a
            evi r0 = r26.f()
            boolean r0 = r0.a(r2, r3)
            if (r0 != 0) goto L_0x0027
            return
        L_0x0027:
            boolean r0 = r3.h
            if (r0 != 0) goto L_0x002f
            r1.c(r3)
            return
        L_0x002f:
            ert r0 = r26.n()
            java.lang.String r7 = r2.a
            boolean r0 = r0.b(r15, r7)
            java.lang.String r14 = "_ev"
            java.lang.String r13 = "_err"
            r22 = 1
            r11 = 0
            if (r0 == 0) goto L_0x00d5
            ery r0 = r1.b
            eqw r0 = r0.q()
            eqy r0 = r0.f
            java.lang.Object r3 = defpackage.eqw.a(r15)
            ery r4 = r1.b
            equ r4 = r4.f()
            java.lang.String r5 = r2.a
            java.lang.String r4 = r4.a(r5)
            java.lang.String r5 = "Dropping blacklisted event. appId"
            r0.a(r5, r3, r4)
            ert r0 = r26.n()
            boolean r0 = r0.f(r15)
            if (r0 != 0) goto L_0x0076
            ert r0 = r26.n()
            boolean r0 = r0.g(r15)
            if (r0 == 0) goto L_0x0074
            goto L_0x0076
        L_0x0074:
            r22 = 0
        L_0x0076:
            if (r22 != 0) goto L_0x008d
            java.lang.String r0 = r2.a
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x008d
            ery r0 = r1.b
            evm r0 = r0.e()
            r3 = 11
            java.lang.String r2 = r2.a
            r0.b(r3, r14, r2, r11)
        L_0x008d:
            if (r22 == 0) goto L_0x00d4
            evz r0 = r26.d()
            evp r0 = r0.b(r15)
            if (r0 == 0) goto L_0x00d4
            long r2 = r0.q()
            long r4 = r0.p()
            long r2 = java.lang.Math.max(r2, r4)
            ery r4 = r1.b
            bzg r4 = r4.l()
            long r4 = r4.a()
            long r4 = r4 - r2
            long r2 = java.lang.Math.abs(r4)
            eqm$a<java.lang.Long> r4 = defpackage.eqm.G
            java.lang.Object r4 = r4.a()
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d4
            ery r2 = r1.b
            eqw r2 = r2.q()
            eqy r2 = r2.j
            java.lang.String r3 = "Fetching config for blacklisted app"
            r2.a(r3)
            r1.a(r0)
        L_0x00d4:
            return
        L_0x00d5:
            ery r0 = r1.b
            eqw r0 = r0.q()
            r12 = 2
            boolean r0 = r0.a(r12)
            if (r0 == 0) goto L_0x00f9
            ery r0 = r1.b
            eqw r0 = r0.q()
            eqy r0 = r0.k
            ery r7 = r1.b
            equ r7 = r7.f()
            java.lang.String r7 = r7.a(r2)
            java.lang.String r8 = "Logging event"
            r0.a(r8, r7)
        L_0x00f9:
            evz r0 = r26.d()
            r0.e()
            r1.c(r3)     // Catch:{ all -> 0x07e5 }
            java.lang.String r0 = "_iap"
            java.lang.String r7 = r2.a     // Catch:{ all -> 0x07e5 }
            boolean r0 = r0.equals(r7)     // Catch:{ all -> 0x07e5 }
            java.lang.String r7 = "ecommerce_purchase"
            if (r0 != 0) goto L_0x0120
            java.lang.String r0 = r2.a     // Catch:{ all -> 0x07e5 }
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x07e5 }
            if (r0 == 0) goto L_0x0118
            goto L_0x0120
        L_0x0118:
            r23 = r5
            r25 = r13
            r5 = 0
            r6 = 2
            goto L_0x02ad
        L_0x0120:
            eqh r0 = r2.b     // Catch:{ all -> 0x07e5 }
            java.lang.String r8 = "currency"
            java.lang.String r0 = r0.d(r8)     // Catch:{ all -> 0x07e5 }
            java.lang.String r8 = r2.a     // Catch:{ all -> 0x07e5 }
            boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x07e5 }
            java.lang.String r8 = "value"
            if (r7 == 0) goto L_0x0187
            eqh r7 = r2.b     // Catch:{ all -> 0x07e5 }
            java.lang.Double r7 = r7.c(r8)     // Catch:{ all -> 0x07e5 }
            double r16 = r7.doubleValue()     // Catch:{ all -> 0x07e5 }
            r18 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r16 = r16 * r18
            r20 = 0
            int r7 = (r16 > r20 ? 1 : (r16 == r20 ? 0 : -1))
            if (r7 != 0) goto L_0x0159
            eqh r7 = r2.b     // Catch:{ all -> 0x07e5 }
            java.lang.Long r7 = r7.b(r8)     // Catch:{ all -> 0x07e5 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x07e5 }
            double r7 = (double) r7
            java.lang.Double.isNaN(r7)
            double r16 = r7 * r18
        L_0x0159:
            r7 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            int r9 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x016a
            r7 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            int r9 = (r16 > r7 ? 1 : (r16 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x016a
            long r7 = java.lang.Math.round(r16)     // Catch:{ all -> 0x07e5 }
            goto L_0x0191
        L_0x016a:
            ery r0 = r1.b     // Catch:{ all -> 0x07e5 }
            eqw r0 = r0.q()     // Catch:{ all -> 0x07e5 }
            eqy r0 = r0.f     // Catch:{ all -> 0x07e5 }
            java.lang.String r7 = "Data lost. Currency value is too big. appId"
            java.lang.Object r8 = defpackage.eqw.a(r15)     // Catch:{ all -> 0x07e5 }
            java.lang.Double r9 = java.lang.Double.valueOf(r16)     // Catch:{ all -> 0x07e5 }
            r0.a(r7, r8, r9)     // Catch:{ all -> 0x07e5 }
            r23 = r5
            r25 = r13
            r5 = 0
            r6 = 2
            goto L_0x029c
        L_0x0187:
            eqh r7 = r2.b     // Catch:{ all -> 0x07e5 }
            java.lang.Long r7 = r7.b(r8)     // Catch:{ all -> 0x07e5 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x07e5 }
        L_0x0191:
            boolean r9 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x07e5 }
            if (r9 != 0) goto L_0x0295
            java.util.Locale r9 = java.util.Locale.US     // Catch:{ all -> 0x07e5 }
            java.lang.String r0 = r0.toUpperCase(r9)     // Catch:{ all -> 0x07e5 }
            java.lang.String r9 = "[A-Z]{3}"
            boolean r9 = r0.matches(r9)     // Catch:{ all -> 0x07e5 }
            if (r9 == 0) goto L_0x0295
            java.lang.String r9 = "_ltv_"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x07e5 }
            int r16 = r0.length()     // Catch:{ all -> 0x07e5 }
            if (r16 == 0) goto L_0x01b6
            java.lang.String r0 = r9.concat(r0)     // Catch:{ all -> 0x07e5 }
            goto L_0x01bb
        L_0x01b6:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x07e5 }
            r0.<init>(r9)     // Catch:{ all -> 0x07e5 }
        L_0x01bb:
            r9 = r0
            evz r0 = r26.d()     // Catch:{ all -> 0x07e5 }
            evl r0 = r0.c(r15, r9)     // Catch:{ all -> 0x07e5 }
            if (r0 == 0) goto L_0x01fd
            java.lang.Object r10 = r0.e     // Catch:{ all -> 0x07e5 }
            boolean r10 = r10 instanceof java.lang.Long     // Catch:{ all -> 0x07e5 }
            if (r10 != 0) goto L_0x01cd
            goto L_0x01fd
        L_0x01cd:
            java.lang.Object r0 = r0.e     // Catch:{ all -> 0x07e5 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x07e5 }
            long r17 = r0.longValue()     // Catch:{ all -> 0x07e5 }
            evl r0 = new evl     // Catch:{ all -> 0x07e5 }
            java.lang.String r10 = r2.c     // Catch:{ all -> 0x07e5 }
            ery r11 = r1.b     // Catch:{ all -> 0x07e5 }
            bzg r11 = r11.l()     // Catch:{ all -> 0x07e5 }
            long r20 = r11.a()     // Catch:{ all -> 0x07e5 }
            long r17 = r17 + r7
            java.lang.Long r17 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x07e5 }
            r7 = r0
            r8 = r15
            r11 = r9
            r9 = r10
            r23 = r5
            r5 = 0
            r10 = r11
            r5 = 0
            r6 = 2
            r11 = r20
            r25 = r13
            r13 = r17
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x07e5 }
            goto L_0x025f
        L_0x01fd:
            r23 = r5
            r11 = r9
            r25 = r13
            r5 = 0
            r6 = 2
            evz r9 = r26.d()     // Catch:{ all -> 0x07e5 }
            ery r0 = r1.b     // Catch:{ all -> 0x07e5 }
            evw r0 = r0.e     // Catch:{ all -> 0x07e5 }
            eqm$a<java.lang.Integer> r10 = defpackage.eqm.L     // Catch:{ all -> 0x07e5 }
            int r0 = r0.b(r15, r10)     // Catch:{ all -> 0x07e5 }
            int r0 = r0 + -1
            defpackage.bwx.a(r15)     // Catch:{ all -> 0x07e5 }
            r9.c()     // Catch:{ all -> 0x07e5 }
            r9.j()     // Catch:{ all -> 0x07e5 }
            android.database.sqlite.SQLiteDatabase r10 = r9.w()     // Catch:{ SQLiteException -> 0x0234 }
            java.lang.String r12 = "delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);"
            r13 = 3
            java.lang.String[] r13 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0234 }
            r13[r5] = r15     // Catch:{ SQLiteException -> 0x0234 }
            r13[r22] = r15     // Catch:{ SQLiteException -> 0x0234 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ SQLiteException -> 0x0234 }
            r13[r6] = r0     // Catch:{ SQLiteException -> 0x0234 }
            r10.execSQL(r12, r13)     // Catch:{ SQLiteException -> 0x0234 }
            goto L_0x0244
        L_0x0234:
            r0 = move-exception
            eqw r9 = r9.q()     // Catch:{ all -> 0x07e5 }
            eqy r9 = r9.c     // Catch:{ all -> 0x07e5 }
            java.lang.String r10 = "Error pruning currencies. appId"
            java.lang.Object r12 = defpackage.eqw.a(r15)     // Catch:{ all -> 0x07e5 }
            r9.a(r10, r12, r0)     // Catch:{ all -> 0x07e5 }
        L_0x0244:
            evl r0 = new evl     // Catch:{ all -> 0x07e5 }
            java.lang.String r9 = r2.c     // Catch:{ all -> 0x07e5 }
            ery r10 = r1.b     // Catch:{ all -> 0x07e5 }
            bzg r10 = r10.l()     // Catch:{ all -> 0x07e5 }
            long r12 = r10.a()     // Catch:{ all -> 0x07e5 }
            java.lang.Long r16 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x07e5 }
            r7 = r0
            r8 = r15
            r10 = r11
            r11 = r12
            r13 = r16
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x07e5 }
        L_0x025f:
            evz r7 = r26.d()     // Catch:{ all -> 0x07e5 }
            boolean r7 = r7.a(r0)     // Catch:{ all -> 0x07e5 }
            if (r7 != 0) goto L_0x029b
            ery r7 = r1.b     // Catch:{ all -> 0x07e5 }
            eqw r7 = r7.q()     // Catch:{ all -> 0x07e5 }
            eqy r7 = r7.c     // Catch:{ all -> 0x07e5 }
            java.lang.String r8 = "Too many unique user properties are set. Ignoring user property. appId"
            java.lang.Object r9 = defpackage.eqw.a(r15)     // Catch:{ all -> 0x07e5 }
            ery r10 = r1.b     // Catch:{ all -> 0x07e5 }
            equ r10 = r10.f()     // Catch:{ all -> 0x07e5 }
            java.lang.String r11 = r0.c     // Catch:{ all -> 0x07e5 }
            java.lang.String r10 = r10.c(r11)     // Catch:{ all -> 0x07e5 }
            java.lang.Object r0 = r0.e     // Catch:{ all -> 0x07e5 }
            r7.a(r8, r9, r10, r0)     // Catch:{ all -> 0x07e5 }
            ery r0 = r1.b     // Catch:{ all -> 0x07e5 }
            evm r0 = r0.e()     // Catch:{ all -> 0x07e5 }
            r7 = 9
            r8 = 0
            r0.b(r7, r8, r8, r5)     // Catch:{ all -> 0x07e5 }
            goto L_0x029b
        L_0x0295:
            r23 = r5
            r25 = r13
            r5 = 0
            r6 = 2
        L_0x029b:
            r11 = 1
        L_0x029c:
            if (r11 != 0) goto L_0x02ad
            evz r0 = r26.d()     // Catch:{ all -> 0x07e5 }
            r0.u()     // Catch:{ all -> 0x07e5 }
            evz r0 = r26.d()
            r0.v()
            return
        L_0x02ad:
            java.lang.String r0 = r2.a     // Catch:{ all -> 0x07e5 }
            boolean r0 = defpackage.evm.a(r0)     // Catch:{ all -> 0x07e5 }
            java.lang.String r7 = r2.a     // Catch:{ all -> 0x07e5 }
            r8 = r25
            boolean r16 = r8.equals(r7)     // Catch:{ all -> 0x07e5 }
            evz r7 = r26.d()     // Catch:{ all -> 0x07e5 }
            long r8 = r26.s()     // Catch:{ all -> 0x07e5 }
            r11 = 1
            r13 = 0
            r17 = 0
            r10 = r15
            r12 = r0
            r6 = r14
            r14 = r16
            r18 = r15
            r15 = r17
            ewa r7 = r7.a(r8, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x07e5 }
            long r8 = r7.b     // Catch:{ all -> 0x07e5 }
            eqm$a<java.lang.Integer> r10 = defpackage.eqm.r     // Catch:{ all -> 0x07e5 }
            java.lang.Object r10 = r10.a()     // Catch:{ all -> 0x07e5 }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x07e5 }
            int r10 = r10.intValue()     // Catch:{ all -> 0x07e5 }
            long r10 = (long) r10     // Catch:{ all -> 0x07e5 }
            long r8 = r8 - r10
            r10 = 1000(0x3e8, double:4.94E-321)
            r12 = 1
            r14 = 0
            int r17 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r17 <= 0) goto L_0x0319
            long r8 = r8 % r10
            int r0 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x030a
            ery r0 = r1.b     // Catch:{ all -> 0x07e5 }
            eqw r0 = r0.q()     // Catch:{ all -> 0x07e5 }
            eqy r0 = r0.c     // Catch:{ all -> 0x07e5 }
            java.lang.String r2 = "Data loss. Too many events logged. appId, count"
            java.lang.Object r3 = defpackage.eqw.a(r18)     // Catch:{ all -> 0x07e5 }
            long r4 = r7.b     // Catch:{ all -> 0x07e5 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x07e5 }
            r0.a(r2, r3, r4)     // Catch:{ all -> 0x07e5 }
        L_0x030a:
            evz r0 = r26.d()     // Catch:{ all -> 0x07e5 }
            r0.u()     // Catch:{ all -> 0x07e5 }
            evz r0 = r26.d()
            r0.v()
            return
        L_0x0319:
            if (r0 == 0) goto L_0x036a
            long r8 = r7.a     // Catch:{ all -> 0x07e5 }
            eqm$a<java.lang.Integer> r17 = defpackage.eqm.t     // Catch:{ all -> 0x07e5 }
            java.lang.Object r17 = r17.a()     // Catch:{ all -> 0x07e5 }
            java.lang.Integer r17 = (java.lang.Integer) r17     // Catch:{ all -> 0x07e5 }
            int r5 = r17.intValue()     // Catch:{ all -> 0x07e5 }
            long r12 = (long) r5     // Catch:{ all -> 0x07e5 }
            long r8 = r8 - r12
            int r5 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x036a
            long r8 = r8 % r10
            r3 = 1
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x034d
            ery r0 = r1.b     // Catch:{ all -> 0x07e5 }
            eqw r0 = r0.q()     // Catch:{ all -> 0x07e5 }
            eqy r0 = r0.c     // Catch:{ all -> 0x07e5 }
            java.lang.String r3 = "Data loss. Too many public events logged. appId, count"
            java.lang.Object r4 = defpackage.eqw.a(r18)     // Catch:{ all -> 0x07e5 }
            long r7 = r7.a     // Catch:{ all -> 0x07e5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x07e5 }
            r0.a(r3, r4, r5)     // Catch:{ all -> 0x07e5 }
        L_0x034d:
            ery r0 = r1.b     // Catch:{ all -> 0x07e5 }
            evm r0 = r0.e()     // Catch:{ all -> 0x07e5 }
            r3 = 16
            java.lang.String r2 = r2.a     // Catch:{ all -> 0x07e5 }
            r4 = 0
            r0.b(r3, r6, r2, r4)     // Catch:{ all -> 0x07e5 }
            evz r0 = r26.d()     // Catch:{ all -> 0x07e5 }
            r0.u()     // Catch:{ all -> 0x07e5 }
            evz r0 = r26.d()
            r0.v()
            return
        L_0x036a:
            if (r16 == 0) goto L_0x03b8
            long r5 = r7.d     // Catch:{ all -> 0x07e5 }
            ery r8 = r1.b     // Catch:{ all -> 0x07e5 }
            evw r8 = r8.e     // Catch:{ all -> 0x07e5 }
            java.lang.String r9 = r3.a     // Catch:{ all -> 0x07e5 }
            eqm$a<java.lang.Integer> r10 = defpackage.eqm.s     // Catch:{ all -> 0x07e5 }
            int r8 = r8.b(r9, r10)     // Catch:{ all -> 0x07e5 }
            r9 = 1000000(0xf4240, float:1.401298E-39)
            int r8 = java.lang.Math.min(r9, r8)     // Catch:{ all -> 0x07e5 }
            r9 = 0
            int r8 = java.lang.Math.max(r9, r8)     // Catch:{ all -> 0x07e5 }
            long r8 = (long) r8     // Catch:{ all -> 0x07e5 }
            long r5 = r5 - r8
            int r8 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r8 <= 0) goto L_0x03b8
            r8 = 1
            int r0 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x03a9
            ery r0 = r1.b     // Catch:{ all -> 0x07e5 }
            eqw r0 = r0.q()     // Catch:{ all -> 0x07e5 }
            eqy r0 = r0.c     // Catch:{ all -> 0x07e5 }
            java.lang.String r2 = "Too many error events logged. appId, count"
            java.lang.Object r3 = defpackage.eqw.a(r18)     // Catch:{ all -> 0x07e5 }
            long r4 = r7.d     // Catch:{ all -> 0x07e5 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x07e5 }
            r0.a(r2, r3, r4)     // Catch:{ all -> 0x07e5 }
        L_0x03a9:
            evz r0 = r26.d()     // Catch:{ all -> 0x07e5 }
            r0.u()     // Catch:{ all -> 0x07e5 }
            evz r0 = r26.d()
            r0.v()
            return
        L_0x03b8:
            eqh r5 = r2.b     // Catch:{ all -> 0x07e5 }
            android.os.Bundle r5 = r5.a()     // Catch:{ all -> 0x07e5 }
            ery r6 = r1.b     // Catch:{ all -> 0x07e5 }
            evm r6 = r6.e()     // Catch:{ all -> 0x07e5 }
            java.lang.String r7 = "_o"
            java.lang.String r8 = r2.c     // Catch:{ all -> 0x07e5 }
            r6.a(r5, r7, r8)     // Catch:{ all -> 0x07e5 }
            ery r6 = r1.b     // Catch:{ all -> 0x07e5 }
            evm r6 = r6.e()     // Catch:{ all -> 0x07e5 }
            r12 = r18
            boolean r6 = r6.f(r12)     // Catch:{ all -> 0x07e5 }
            java.lang.String r13 = "_r"
            if (r6 == 0) goto L_0x03f9
            ery r6 = r1.b     // Catch:{ all -> 0x07e5 }
            evm r6 = r6.e()     // Catch:{ all -> 0x07e5 }
            java.lang.String r7 = "_dbg"
            r8 = 1
            java.lang.Long r10 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x07e5 }
            r6.a(r5, r7, r10)     // Catch:{ all -> 0x07e5 }
            ery r6 = r1.b     // Catch:{ all -> 0x07e5 }
            evm r6 = r6.e()     // Catch:{ all -> 0x07e5 }
            java.lang.Long r7 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x07e5 }
            r6.a(r5, r13, r7)     // Catch:{ all -> 0x07e5 }
        L_0x03f9:
            ery r6 = r1.b     // Catch:{ all -> 0x07e5 }
            evw r6 = r6.e     // Catch:{ all -> 0x07e5 }
            java.lang.String r7 = r3.a     // Catch:{ all -> 0x07e5 }
            boolean r6 = r6.i(r7)     // Catch:{ all -> 0x07e5 }
            if (r6 == 0) goto L_0x042c
            java.lang.String r6 = "_s"
            java.lang.String r7 = r2.a     // Catch:{ all -> 0x07e5 }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x07e5 }
            if (r6 == 0) goto L_0x042c
            evz r6 = r26.d()     // Catch:{ all -> 0x07e5 }
            java.lang.String r7 = r3.a     // Catch:{ all -> 0x07e5 }
            evl r6 = r6.c(r7, r4)     // Catch:{ all -> 0x07e5 }
            if (r6 == 0) goto L_0x042c
            java.lang.Object r7 = r6.e     // Catch:{ all -> 0x07e5 }
            boolean r7 = r7 instanceof java.lang.Long     // Catch:{ all -> 0x07e5 }
            if (r7 == 0) goto L_0x042c
            ery r7 = r1.b     // Catch:{ all -> 0x07e5 }
            evm r7 = r7.e()     // Catch:{ all -> 0x07e5 }
            java.lang.Object r6 = r6.e     // Catch:{ all -> 0x07e5 }
            r7.a(r5, r4, r6)     // Catch:{ all -> 0x07e5 }
        L_0x042c:
            evz r4 = r26.d()     // Catch:{ all -> 0x07e5 }
            long r6 = r4.c(r12)     // Catch:{ all -> 0x07e5 }
            int r4 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r4 <= 0) goto L_0x044d
            ery r4 = r1.b     // Catch:{ all -> 0x07e5 }
            eqw r4 = r4.q()     // Catch:{ all -> 0x07e5 }
            eqy r4 = r4.f     // Catch:{ all -> 0x07e5 }
            java.lang.String r8 = "Data lost. Too many events stored on disk, deleted. appId"
            java.lang.Object r9 = defpackage.eqw.a(r12)     // Catch:{ all -> 0x07e5 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x07e5 }
            r4.a(r8, r9, r6)     // Catch:{ all -> 0x07e5 }
        L_0x044d:
            ewh r4 = new ewh     // Catch:{ all -> 0x07e5 }
            ery r8 = r1.b     // Catch:{ all -> 0x07e5 }
            java.lang.String r9 = r2.c     // Catch:{ all -> 0x07e5 }
            java.lang.String r11 = r2.a     // Catch:{ all -> 0x07e5 }
            long r6 = r2.d     // Catch:{ all -> 0x07e5 }
            r16 = 0
            r18 = r6
            r7 = r4
            r10 = r12
            r2 = r12
            r6 = r13
            r12 = r18
            r14 = r16
            r16 = r5
            r7.<init>(r8, r9, r10, r11, r12, r14, r16)     // Catch:{ all -> 0x07e5 }
            evz r5 = r26.d()     // Catch:{ all -> 0x07e5 }
            java.lang.String r7 = r4.b     // Catch:{ all -> 0x07e5 }
            eqg r5 = r5.a(r2, r7)     // Catch:{ all -> 0x07e5 }
            if (r5 != 0) goto L_0x04d8
            evz r5 = r26.d()     // Catch:{ all -> 0x07e5 }
            long r7 = r5.f(r2)     // Catch:{ all -> 0x07e5 }
            r9 = 500(0x1f4, double:2.47E-321)
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 < 0) goto L_0x04bc
            if (r0 == 0) goto L_0x04bc
            ery r0 = r1.b     // Catch:{ all -> 0x07e5 }
            eqw r0 = r0.q()     // Catch:{ all -> 0x07e5 }
            eqy r0 = r0.c     // Catch:{ all -> 0x07e5 }
            java.lang.String r3 = "Too many event names used, ignoring event. appId, name, supported count"
            java.lang.Object r2 = defpackage.eqw.a(r2)     // Catch:{ all -> 0x07e5 }
            ery r5 = r1.b     // Catch:{ all -> 0x07e5 }
            equ r5 = r5.f()     // Catch:{ all -> 0x07e5 }
            java.lang.String r4 = r4.b     // Catch:{ all -> 0x07e5 }
            java.lang.String r4 = r5.a(r4)     // Catch:{ all -> 0x07e5 }
            r5 = 500(0x1f4, float:7.0E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x07e5 }
            r0.a(r3, r2, r4, r5)     // Catch:{ all -> 0x07e5 }
            ery r0 = r1.b     // Catch:{ all -> 0x07e5 }
            evm r0 = r0.e()     // Catch:{ all -> 0x07e5 }
            r2 = 8
            r3 = 0
            r5 = 0
            r0.b(r2, r3, r3, r5)     // Catch:{ all -> 0x07e5 }
            evz r0 = r26.d()
            r0.v()
            return
        L_0x04bc:
            r5 = 0
            eqg r0 = new eqg     // Catch:{ all -> 0x07e5 }
            java.lang.String r9 = r4.b     // Catch:{ all -> 0x07e5 }
            r10 = 0
            r12 = 0
            long r14 = r4.c     // Catch:{ all -> 0x07e5 }
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r7 = r0
            r8 = r2
            r7.<init>(r8, r9, r10, r12, r14, r16, r18, r19, r20, r21)     // Catch:{ all -> 0x07e5 }
            r2 = 0
            goto L_0x04e7
        L_0x04d8:
            r2 = 0
            ery r0 = r1.b     // Catch:{ all -> 0x07e5 }
            long r7 = r5.e     // Catch:{ all -> 0x07e5 }
            ewh r4 = r4.a(r0, r7)     // Catch:{ all -> 0x07e5 }
            long r7 = r4.c     // Catch:{ all -> 0x07e5 }
            eqg r0 = r5.a(r7)     // Catch:{ all -> 0x07e5 }
        L_0x04e7:
            evz r5 = r26.d()     // Catch:{ all -> 0x07e5 }
            r5.a(r0)     // Catch:{ all -> 0x07e5 }
            r26.g()     // Catch:{ all -> 0x07e5 }
            r26.h()     // Catch:{ all -> 0x07e5 }
            defpackage.bwx.a(r4)     // Catch:{ all -> 0x07e5 }
            defpackage.bwx.a(r28)     // Catch:{ all -> 0x07e5 }
            java.lang.String r0 = r4.a     // Catch:{ all -> 0x07e5 }
            defpackage.bwx.a(r0)     // Catch:{ all -> 0x07e5 }
            java.lang.String r0 = r4.a     // Catch:{ all -> 0x07e5 }
            java.lang.String r5 = r3.a     // Catch:{ all -> 0x07e5 }
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x07e5 }
            defpackage.bwx.b(r0)     // Catch:{ all -> 0x07e5 }
            ekj r5 = new ekj     // Catch:{ all -> 0x07e5 }
            r5.<init>()     // Catch:{ all -> 0x07e5 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)     // Catch:{ all -> 0x07e5 }
            r5.a = r0     // Catch:{ all -> 0x07e5 }
            java.lang.String r0 = "android"
            r5.i = r0     // Catch:{ all -> 0x07e5 }
            java.lang.String r0 = r3.a     // Catch:{ all -> 0x07e5 }
            r5.o = r0     // Catch:{ all -> 0x07e5 }
            java.lang.String r0 = r3.d     // Catch:{ all -> 0x07e5 }
            r5.n = r0     // Catch:{ all -> 0x07e5 }
            java.lang.String r0 = r3.c     // Catch:{ all -> 0x07e5 }
            r5.p = r0     // Catch:{ all -> 0x07e5 }
            long r7 = r3.j     // Catch:{ all -> 0x07e5 }
            r9 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0530
            r10 = 0
            goto L_0x0537
        L_0x0530:
            long r7 = r3.j     // Catch:{ all -> 0x07e5 }
            int r0 = (int) r7     // Catch:{ all -> 0x07e5 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x07e5 }
        L_0x0537:
            r5.C = r10     // Catch:{ all -> 0x07e5 }
            long r7 = r3.e     // Catch:{ all -> 0x07e5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x07e5 }
            r5.q = r0     // Catch:{ all -> 0x07e5 }
            java.lang.String r0 = r3.b     // Catch:{ all -> 0x07e5 }
            r5.y = r0     // Catch:{ all -> 0x07e5 }
            java.lang.String r0 = r3.r     // Catch:{ all -> 0x07e5 }
            r5.I = r0     // Catch:{ all -> 0x07e5 }
            long r7 = r3.f     // Catch:{ all -> 0x07e5 }
            r9 = 0
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0553
            r0 = 0
            goto L_0x0559
        L_0x0553:
            long r7 = r3.f     // Catch:{ all -> 0x07e5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x07e5 }
        L_0x0559:
            r5.v = r0     // Catch:{ all -> 0x07e5 }
            ery r0 = r1.b     // Catch:{ all -> 0x07e5 }
            evw r0 = r0.e     // Catch:{ all -> 0x07e5 }
            java.lang.String r7 = r3.a     // Catch:{ all -> 0x07e5 }
            eqm$a<java.lang.Boolean> r8 = defpackage.eqm.am     // Catch:{ all -> 0x07e5 }
            boolean r0 = r0.c(r7, r8)     // Catch:{ all -> 0x07e5 }
            if (r0 == 0) goto L_0x0573
            evi r0 = r26.f()     // Catch:{ all -> 0x07e5 }
            int[] r0 = r0.e()     // Catch:{ all -> 0x07e5 }
            r5.K = r0     // Catch:{ all -> 0x07e5 }
        L_0x0573:
            ery r0 = r1.b     // Catch:{ all -> 0x07e5 }
            erh r0 = r0.b()     // Catch:{ all -> 0x07e5 }
            java.lang.String r7 = r3.a     // Catch:{ all -> 0x07e5 }
            android.util.Pair r0 = r0.a(r7)     // Catch:{ all -> 0x07e5 }
            java.lang.Object r7 = r0.first     // Catch:{ all -> 0x07e5 }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ all -> 0x07e5 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x07e5 }
            if (r7 != 0) goto L_0x059a
            boolean r7 = r3.o     // Catch:{ all -> 0x07e5 }
            if (r7 == 0) goto L_0x05f3
            java.lang.Object r7 = r0.first     // Catch:{ all -> 0x07e5 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x07e5 }
            r5.s = r7     // Catch:{ all -> 0x07e5 }
            java.lang.Object r0 = r0.second     // Catch:{ all -> 0x07e5 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x07e5 }
            r5.t = r0     // Catch:{ all -> 0x07e5 }
            goto L_0x05f3
        L_0x059a:
            ery r0 = r1.b     // Catch:{ all -> 0x07e5 }
            ewg r0 = r0.j()     // Catch:{ all -> 0x07e5 }
            ery r7 = r1.b     // Catch:{ all -> 0x07e5 }
            android.content.Context r7 = r7.m()     // Catch:{ all -> 0x07e5 }
            boolean r0 = r0.a(r7)     // Catch:{ all -> 0x07e5 }
            if (r0 != 0) goto L_0x05f3
            boolean r0 = r3.p     // Catch:{ all -> 0x07e5 }
            if (r0 == 0) goto L_0x05f3
            ery r0 = r1.b     // Catch:{ all -> 0x07e5 }
            android.content.Context r0 = r0.m()     // Catch:{ all -> 0x07e5 }
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch:{ all -> 0x07e5 }
            java.lang.String r7 = "android_id"
            java.lang.String r0 = android.provider.Settings.Secure.getString(r0, r7)     // Catch:{ all -> 0x07e5 }
            if (r0 != 0) goto L_0x05d8
            ery r0 = r1.b     // Catch:{ all -> 0x07e5 }
            eqw r0 = r0.q()     // Catch:{ all -> 0x07e5 }
            eqy r0 = r0.f     // Catch:{ all -> 0x07e5 }
            java.lang.String r7 = "null secure ID. appId"
            java.lang.String r8 = r5.o     // Catch:{ all -> 0x07e5 }
            java.lang.Object r8 = defpackage.eqw.a(r8)     // Catch:{ all -> 0x07e5 }
            r0.a(r7, r8)     // Catch:{ all -> 0x07e5 }
            java.lang.String r0 = "null"
            goto L_0x05f1
        L_0x05d8:
            boolean r7 = r0.isEmpty()     // Catch:{ all -> 0x07e5 }
            if (r7 == 0) goto L_0x05f1
            ery r7 = r1.b     // Catch:{ all -> 0x07e5 }
            eqw r7 = r7.q()     // Catch:{ all -> 0x07e5 }
            eqy r7 = r7.f     // Catch:{ all -> 0x07e5 }
            java.lang.String r8 = "empty secure ID. appId"
            java.lang.String r11 = r5.o     // Catch:{ all -> 0x07e5 }
            java.lang.Object r11 = defpackage.eqw.a(r11)     // Catch:{ all -> 0x07e5 }
            r7.a(r8, r11)     // Catch:{ all -> 0x07e5 }
        L_0x05f1:
            r5.D = r0     // Catch:{ all -> 0x07e5 }
        L_0x05f3:
            ery r0 = r1.b     // Catch:{ all -> 0x07e5 }
            ewg r0 = r0.j()     // Catch:{ all -> 0x07e5 }
            r0.w()     // Catch:{ all -> 0x07e5 }
            java.lang.String r0 = android.os.Build.MODEL     // Catch:{ all -> 0x07e5 }
            r5.k = r0     // Catch:{ all -> 0x07e5 }
            ery r0 = r1.b     // Catch:{ all -> 0x07e5 }
            ewg r0 = r0.j()     // Catch:{ all -> 0x07e5 }
            r0.w()     // Catch:{ all -> 0x07e5 }
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x07e5 }
            r5.j = r0     // Catch:{ all -> 0x07e5 }
            ery r0 = r1.b     // Catch:{ all -> 0x07e5 }
            ewg r0 = r0.j()     // Catch:{ all -> 0x07e5 }
            long r7 = r0.f()     // Catch:{ all -> 0x07e5 }
            int r0 = (int) r7     // Catch:{ all -> 0x07e5 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x07e5 }
            r5.m = r0     // Catch:{ all -> 0x07e5 }
            ery r0 = r1.b     // Catch:{ all -> 0x07e5 }
            ewg r0 = r0.j()     // Catch:{ all -> 0x07e5 }
            java.lang.String r0 = r0.g()     // Catch:{ all -> 0x07e5 }
            r5.l = r0     // Catch:{ all -> 0x07e5 }
            r7 = 0
            r5.r = r7     // Catch:{ all -> 0x07e5 }
            r5.d = r7     // Catch:{ all -> 0x07e5 }
            r5.e = r7     // Catch:{ all -> 0x07e5 }
            r5.f = r7     // Catch:{ all -> 0x07e5 }
            long r7 = r3.l     // Catch:{ all -> 0x07e5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x07e5 }
            r5.F = r0     // Catch:{ all -> 0x07e5 }
            ery r0 = r1.b     // Catch:{ all -> 0x07e5 }
            boolean r0 = r0.o()     // Catch:{ all -> 0x07e5 }
            if (r0 == 0) goto L_0x064c
            boolean r0 = defpackage.evw.j()     // Catch:{ all -> 0x07e5 }
            if (r0 == 0) goto L_0x064c
            r7 = 0
            r5.G = r7     // Catch:{ all -> 0x07e5 }
        L_0x064c:
            evz r0 = r26.d()     // Catch:{ all -> 0x07e5 }
            java.lang.String r7 = r3.a     // Catch:{ all -> 0x07e5 }
            evp r0 = r0.b(r7)     // Catch:{ all -> 0x07e5 }
            if (r0 != 0) goto L_0x06ba
            evp r0 = new evp     // Catch:{ all -> 0x07e5 }
            ery r7 = r1.b     // Catch:{ all -> 0x07e5 }
            java.lang.String r8 = r3.a     // Catch:{ all -> 0x07e5 }
            r0.<init>(r7, r8)     // Catch:{ all -> 0x07e5 }
            ery r7 = r1.b     // Catch:{ all -> 0x07e5 }
            evm r7 = r7.e()     // Catch:{ all -> 0x07e5 }
            java.lang.String r7 = r7.i()     // Catch:{ all -> 0x07e5 }
            r0.a(r7)     // Catch:{ all -> 0x07e5 }
            java.lang.String r7 = r3.k     // Catch:{ all -> 0x07e5 }
            r0.e(r7)     // Catch:{ all -> 0x07e5 }
            java.lang.String r7 = r3.b     // Catch:{ all -> 0x07e5 }
            r0.b(r7)     // Catch:{ all -> 0x07e5 }
            ery r7 = r1.b     // Catch:{ all -> 0x07e5 }
            erh r7 = r7.b()     // Catch:{ all -> 0x07e5 }
            java.lang.String r8 = r3.a     // Catch:{ all -> 0x07e5 }
            java.lang.String r7 = r7.b(r8)     // Catch:{ all -> 0x07e5 }
            r0.d(r7)     // Catch:{ all -> 0x07e5 }
            r0.f(r9)     // Catch:{ all -> 0x07e5 }
            r0.a(r9)     // Catch:{ all -> 0x07e5 }
            r0.b(r9)     // Catch:{ all -> 0x07e5 }
            java.lang.String r7 = r3.c     // Catch:{ all -> 0x07e5 }
            r0.f(r7)     // Catch:{ all -> 0x07e5 }
            long r7 = r3.j     // Catch:{ all -> 0x07e5 }
            r0.c(r7)     // Catch:{ all -> 0x07e5 }
            java.lang.String r7 = r3.d     // Catch:{ all -> 0x07e5 }
            r0.g(r7)     // Catch:{ all -> 0x07e5 }
            long r7 = r3.e     // Catch:{ all -> 0x07e5 }
            r0.d(r7)     // Catch:{ all -> 0x07e5 }
            long r7 = r3.f     // Catch:{ all -> 0x07e5 }
            r0.e(r7)     // Catch:{ all -> 0x07e5 }
            boolean r7 = r3.h     // Catch:{ all -> 0x07e5 }
            r0.a(r7)     // Catch:{ all -> 0x07e5 }
            long r7 = r3.l     // Catch:{ all -> 0x07e5 }
            r0.i(r7)     // Catch:{ all -> 0x07e5 }
            evz r7 = r26.d()     // Catch:{ all -> 0x07e5 }
            r7.a(r0)     // Catch:{ all -> 0x07e5 }
        L_0x06ba:
            java.lang.String r7 = r0.b()     // Catch:{ all -> 0x07e5 }
            r5.u = r7     // Catch:{ all -> 0x07e5 }
            java.lang.String r0 = r0.f()     // Catch:{ all -> 0x07e5 }
            r5.B = r0     // Catch:{ all -> 0x07e5 }
            evz r0 = r26.d()     // Catch:{ all -> 0x07e5 }
            java.lang.String r3 = r3.a     // Catch:{ all -> 0x07e5 }
            java.util.List r0 = r0.a(r3)     // Catch:{ all -> 0x07e5 }
            int r3 = r0.size()     // Catch:{ all -> 0x07e5 }
            ekm[] r3 = new defpackage.ekm[r3]     // Catch:{ all -> 0x07e5 }
            r5.c = r3     // Catch:{ all -> 0x07e5 }
            r3 = 0
        L_0x06d9:
            int r7 = r0.size()     // Catch:{ all -> 0x07e5 }
            if (r3 >= r7) goto L_0x0712
            ekm r7 = new ekm     // Catch:{ all -> 0x07e5 }
            r7.<init>()     // Catch:{ all -> 0x07e5 }
            ekm[] r8 = r5.c     // Catch:{ all -> 0x07e5 }
            r8[r3] = r7     // Catch:{ all -> 0x07e5 }
            java.lang.Object r8 = r0.get(r3)     // Catch:{ all -> 0x07e5 }
            evl r8 = (defpackage.evl) r8     // Catch:{ all -> 0x07e5 }
            java.lang.String r8 = r8.c     // Catch:{ all -> 0x07e5 }
            r7.b = r8     // Catch:{ all -> 0x07e5 }
            java.lang.Object r8 = r0.get(r3)     // Catch:{ all -> 0x07e5 }
            evl r8 = (defpackage.evl) r8     // Catch:{ all -> 0x07e5 }
            long r11 = r8.d     // Catch:{ all -> 0x07e5 }
            java.lang.Long r8 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x07e5 }
            r7.a = r8     // Catch:{ all -> 0x07e5 }
            evi r8 = r26.f()     // Catch:{ all -> 0x07e5 }
            java.lang.Object r11 = r0.get(r3)     // Catch:{ all -> 0x07e5 }
            evl r11 = (defpackage.evl) r11     // Catch:{ all -> 0x07e5 }
            java.lang.Object r11 = r11.e     // Catch:{ all -> 0x07e5 }
            r8.a(r7, r11)     // Catch:{ all -> 0x07e5 }
            int r3 = r3 + 1
            goto L_0x06d9
        L_0x0712:
            evz r0 = r26.d()     // Catch:{ IOException -> 0x077c }
            long r7 = r0.a(r5)     // Catch:{ IOException -> 0x077c }
            evz r0 = r26.d()     // Catch:{ all -> 0x07e5 }
            eqh r3 = r4.e     // Catch:{ all -> 0x07e5 }
            if (r3 == 0) goto L_0x0773
            eqh r3 = r4.e     // Catch:{ all -> 0x07e5 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x07e5 }
        L_0x0728:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x07e5 }
            if (r5 == 0) goto L_0x073c
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x07e5 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x07e5 }
            boolean r5 = r6.equals(r5)     // Catch:{ all -> 0x07e5 }
            if (r5 == 0) goto L_0x0728
        L_0x073a:
            r2 = 1
            goto L_0x0773
        L_0x073c:
            ert r3 = r26.n()     // Catch:{ all -> 0x07e5 }
            java.lang.String r5 = r4.a     // Catch:{ all -> 0x07e5 }
            java.lang.String r6 = r4.b     // Catch:{ all -> 0x07e5 }
            boolean r3 = r3.c(r5, r6)     // Catch:{ all -> 0x07e5 }
            evz r11 = r26.d()     // Catch:{ all -> 0x07e5 }
            long r12 = r26.s()     // Catch:{ all -> 0x07e5 }
            java.lang.String r14 = r4.a     // Catch:{ all -> 0x07e5 }
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            ewa r5 = r11.a(r12, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x07e5 }
            if (r3 == 0) goto L_0x0773
            long r5 = r5.e     // Catch:{ all -> 0x07e5 }
            ery r3 = r1.b     // Catch:{ all -> 0x07e5 }
            evw r3 = r3.e     // Catch:{ all -> 0x07e5 }
            java.lang.String r11 = r4.a     // Catch:{ all -> 0x07e5 }
            int r3 = r3.a(r11)     // Catch:{ all -> 0x07e5 }
            long r11 = (long) r3     // Catch:{ all -> 0x07e5 }
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 >= 0) goto L_0x0773
            goto L_0x073a
        L_0x0773:
            boolean r0 = r0.a(r4, r7, r2)     // Catch:{ all -> 0x07e5 }
            if (r0 == 0) goto L_0x0790
            r1.q = r9     // Catch:{ all -> 0x07e5 }
            goto L_0x0790
        L_0x077c:
            r0 = move-exception
            ery r2 = r1.b     // Catch:{ all -> 0x07e5 }
            eqw r2 = r2.q()     // Catch:{ all -> 0x07e5 }
            eqy r2 = r2.c     // Catch:{ all -> 0x07e5 }
            java.lang.String r3 = "Data loss. Failed to insert raw event metadata. appId"
            java.lang.String r5 = r5.o     // Catch:{ all -> 0x07e5 }
            java.lang.Object r5 = defpackage.eqw.a(r5)     // Catch:{ all -> 0x07e5 }
            r2.a(r3, r5, r0)     // Catch:{ all -> 0x07e5 }
        L_0x0790:
            evz r0 = r26.d()     // Catch:{ all -> 0x07e5 }
            r0.u()     // Catch:{ all -> 0x07e5 }
            ery r0 = r1.b     // Catch:{ all -> 0x07e5 }
            eqw r0 = r0.q()     // Catch:{ all -> 0x07e5 }
            r2 = 2
            boolean r0 = r0.a(r2)     // Catch:{ all -> 0x07e5 }
            if (r0 == 0) goto L_0x07bb
            ery r0 = r1.b     // Catch:{ all -> 0x07e5 }
            eqw r0 = r0.q()     // Catch:{ all -> 0x07e5 }
            eqy r0 = r0.k     // Catch:{ all -> 0x07e5 }
            java.lang.String r2 = "Event recorded"
            ery r3 = r1.b     // Catch:{ all -> 0x07e5 }
            equ r3 = r3.f()     // Catch:{ all -> 0x07e5 }
            java.lang.String r3 = r3.a(r4)     // Catch:{ all -> 0x07e5 }
            r0.a(r2, r3)     // Catch:{ all -> 0x07e5 }
        L_0x07bb:
            evz r0 = r26.d()
            r0.v()
            r26.j()
            ery r0 = r1.b
            eqw r0 = r0.q()
            eqy r0 = r0.k
            long r2 = java.lang.System.nanoTime()
            long r2 = r2 - r23
            r4 = 500000(0x7a120, double:2.47033E-318)
            long r2 = r2 + r4
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 / r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = "Background event processing time, ms"
            r0.a(r3, r2)
            return
        L_0x07e5:
            r0 = move-exception
            evz r2 = r26.d()
            r2.v()
            goto L_0x07ef
        L_0x07ee:
            throw r0
        L_0x07ef:
            goto L_0x07ee
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evc.b(eqk, evq):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:92|93) */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        r14.b.q().c.a("Failed to parse upload URL. Not uploading. appId", defpackage.eqw.a(r4), r12);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:92:0x0275 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r14 = this;
            r14.g()
            r14.h()
            r0 = 1
            r14.t = r0
            r1 = 0
            ery r2 = r14.b     // Catch:{ all -> 0x02af }
            ets r2 = r2.i()     // Catch:{ all -> 0x02af }
            java.lang.Boolean r2 = r2.c     // Catch:{ all -> 0x02af }
            if (r2 != 0) goto L_0x0027
            ery r0 = r14.b     // Catch:{ all -> 0x02af }
            eqw r0 = r0.q()     // Catch:{ all -> 0x02af }
            eqy r0 = r0.f     // Catch:{ all -> 0x02af }
            java.lang.String r2 = "Upload data called on the client side before use of service was decided"
            r0.a(r2)     // Catch:{ all -> 0x02af }
            r14.t = r1
            r14.u()
            return
        L_0x0027:
            boolean r2 = r2.booleanValue()     // Catch:{ all -> 0x02af }
            if (r2 == 0) goto L_0x0040
            ery r0 = r14.b     // Catch:{ all -> 0x02af }
            eqw r0 = r0.q()     // Catch:{ all -> 0x02af }
            eqy r0 = r0.c     // Catch:{ all -> 0x02af }
            java.lang.String r2 = "Upload called in the client side when service should be used"
            r0.a(r2)     // Catch:{ all -> 0x02af }
            r14.t = r1
            r14.u()
            return
        L_0x0040:
            long r2 = r14.q     // Catch:{ all -> 0x02af }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0051
            r14.j()     // Catch:{ all -> 0x02af }
            r14.t = r1
            r14.u()
            return
        L_0x0051:
            r14.g()     // Catch:{ all -> 0x02af }
            java.util.List<java.lang.Long> r2 = r14.w     // Catch:{ all -> 0x02af }
            if (r2 == 0) goto L_0x005a
            r2 = 1
            goto L_0x005b
        L_0x005a:
            r2 = 0
        L_0x005b:
            if (r2 == 0) goto L_0x0070
            ery r0 = r14.b     // Catch:{ all -> 0x02af }
            eqw r0 = r0.q()     // Catch:{ all -> 0x02af }
            eqy r0 = r0.k     // Catch:{ all -> 0x02af }
            java.lang.String r2 = "Uploading requested multiple times"
            r0.a(r2)     // Catch:{ all -> 0x02af }
            r14.t = r1
            r14.u()
            return
        L_0x0070:
            era r2 = r14.c()     // Catch:{ all -> 0x02af }
            boolean r2 = r2.e()     // Catch:{ all -> 0x02af }
            if (r2 != 0) goto L_0x0090
            ery r0 = r14.b     // Catch:{ all -> 0x02af }
            eqw r0 = r0.q()     // Catch:{ all -> 0x02af }
            eqy r0 = r0.k     // Catch:{ all -> 0x02af }
            java.lang.String r2 = "Network not connected, ignoring upload request"
            r0.a(r2)     // Catch:{ all -> 0x02af }
            r14.j()     // Catch:{ all -> 0x02af }
            r14.t = r1
            r14.u()
            return
        L_0x0090:
            ery r2 = r14.b     // Catch:{ all -> 0x02af }
            bzg r2 = r2.l()     // Catch:{ all -> 0x02af }
            long r2 = r2.a()     // Catch:{ all -> 0x02af }
            long r6 = defpackage.evw.h()     // Catch:{ all -> 0x02af }
            long r6 = r2 - r6
            r14.a(r6)     // Catch:{ all -> 0x02af }
            ery r6 = r14.b     // Catch:{ all -> 0x02af }
            erh r6 = r6.b()     // Catch:{ all -> 0x02af }
            erj r6 = r6.d     // Catch:{ all -> 0x02af }
            long r6 = r6.a()     // Catch:{ all -> 0x02af }
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x00ca
            ery r4 = r14.b     // Catch:{ all -> 0x02af }
            eqw r4 = r4.q()     // Catch:{ all -> 0x02af }
            eqy r4 = r4.j     // Catch:{ all -> 0x02af }
            java.lang.String r5 = "Uploading events. Elapsed time since last upload attempt (ms)"
            long r6 = r2 - r6
            long r6 = java.lang.Math.abs(r6)     // Catch:{ all -> 0x02af }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02af }
            r4.a(r5, r6)     // Catch:{ all -> 0x02af }
        L_0x00ca:
            evz r4 = r14.d()     // Catch:{ all -> 0x02af }
            java.lang.String r4 = r4.x()     // Catch:{ all -> 0x02af }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x02af }
            r6 = -1
            if (r5 != 0) goto L_0x0287
            long r8 = r14.y     // Catch:{ all -> 0x02af }
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x00ea
            evz r5 = r14.d()     // Catch:{ all -> 0x02af }
            long r5 = r5.E()     // Catch:{ all -> 0x02af }
            r14.y = r5     // Catch:{ all -> 0x02af }
        L_0x00ea:
            ery r5 = r14.b     // Catch:{ all -> 0x02af }
            evw r5 = r5.e     // Catch:{ all -> 0x02af }
            eqm$a<java.lang.Integer> r6 = defpackage.eqm.n     // Catch:{ all -> 0x02af }
            int r5 = r5.b(r4, r6)     // Catch:{ all -> 0x02af }
            ery r6 = r14.b     // Catch:{ all -> 0x02af }
            evw r6 = r6.e     // Catch:{ all -> 0x02af }
            eqm$a<java.lang.Integer> r7 = defpackage.eqm.o     // Catch:{ all -> 0x02af }
            int r6 = r6.b(r4, r7)     // Catch:{ all -> 0x02af }
            int r6 = java.lang.Math.max(r1, r6)     // Catch:{ all -> 0x02af }
            evz r7 = r14.d()     // Catch:{ all -> 0x02af }
            java.util.List r5 = r7.a(r4, r5, r6)     // Catch:{ all -> 0x02af }
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x02af }
            if (r6 != 0) goto L_0x02a9
            java.util.Iterator r6 = r5.iterator()     // Catch:{ all -> 0x02af }
        L_0x0114:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x02af }
            r8 = 0
            if (r7 == 0) goto L_0x0130
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x02af }
            android.util.Pair r7 = (android.util.Pair) r7     // Catch:{ all -> 0x02af }
            java.lang.Object r7 = r7.first     // Catch:{ all -> 0x02af }
            ekj r7 = (defpackage.ekj) r7     // Catch:{ all -> 0x02af }
            java.lang.String r9 = r7.s     // Catch:{ all -> 0x02af }
            boolean r9 = android.text.TextUtils.isEmpty(r9)     // Catch:{ all -> 0x02af }
            if (r9 != 0) goto L_0x0114
            java.lang.String r6 = r7.s     // Catch:{ all -> 0x02af }
            goto L_0x0131
        L_0x0130:
            r6 = r8
        L_0x0131:
            if (r6 == 0) goto L_0x015c
            r7 = 0
        L_0x0134:
            int r9 = r5.size()     // Catch:{ all -> 0x02af }
            if (r7 >= r9) goto L_0x015c
            java.lang.Object r9 = r5.get(r7)     // Catch:{ all -> 0x02af }
            android.util.Pair r9 = (android.util.Pair) r9     // Catch:{ all -> 0x02af }
            java.lang.Object r9 = r9.first     // Catch:{ all -> 0x02af }
            ekj r9 = (defpackage.ekj) r9     // Catch:{ all -> 0x02af }
            java.lang.String r10 = r9.s     // Catch:{ all -> 0x02af }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x02af }
            if (r10 != 0) goto L_0x0159
            java.lang.String r9 = r9.s     // Catch:{ all -> 0x02af }
            boolean r9 = r9.equals(r6)     // Catch:{ all -> 0x02af }
            if (r9 != 0) goto L_0x0159
            java.util.List r5 = r5.subList(r1, r7)     // Catch:{ all -> 0x02af }
            goto L_0x015c
        L_0x0159:
            int r7 = r7 + 1
            goto L_0x0134
        L_0x015c:
            eki r6 = new eki     // Catch:{ all -> 0x02af }
            r6.<init>()     // Catch:{ all -> 0x02af }
            int r7 = r5.size()     // Catch:{ all -> 0x02af }
            ekj[] r7 = new defpackage.ekj[r7]     // Catch:{ all -> 0x02af }
            r6.a = r7     // Catch:{ all -> 0x02af }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x02af }
            int r9 = r5.size()     // Catch:{ all -> 0x02af }
            r7.<init>(r9)     // Catch:{ all -> 0x02af }
            boolean r9 = defpackage.evw.j()     // Catch:{ all -> 0x02af }
            if (r9 == 0) goto L_0x0184
            ery r9 = r14.b     // Catch:{ all -> 0x02af }
            evw r9 = r9.e     // Catch:{ all -> 0x02af }
            boolean r9 = r9.c(r4)     // Catch:{ all -> 0x02af }
            if (r9 == 0) goto L_0x0184
            r9 = 1
            goto L_0x0185
        L_0x0184:
            r9 = 0
        L_0x0185:
            r10 = 0
        L_0x0186:
            ekj[] r11 = r6.a     // Catch:{ all -> 0x02af }
            int r11 = r11.length     // Catch:{ all -> 0x02af }
            if (r10 >= r11) goto L_0x01cf
            ekj[] r11 = r6.a     // Catch:{ all -> 0x02af }
            java.lang.Object r12 = r5.get(r10)     // Catch:{ all -> 0x02af }
            android.util.Pair r12 = (android.util.Pair) r12     // Catch:{ all -> 0x02af }
            java.lang.Object r12 = r12.first     // Catch:{ all -> 0x02af }
            ekj r12 = (defpackage.ekj) r12     // Catch:{ all -> 0x02af }
            r11[r10] = r12     // Catch:{ all -> 0x02af }
            java.lang.Object r11 = r5.get(r10)     // Catch:{ all -> 0x02af }
            android.util.Pair r11 = (android.util.Pair) r11     // Catch:{ all -> 0x02af }
            java.lang.Object r11 = r11.second     // Catch:{ all -> 0x02af }
            java.lang.Long r11 = (java.lang.Long) r11     // Catch:{ all -> 0x02af }
            r7.add(r11)     // Catch:{ all -> 0x02af }
            ekj[] r11 = r6.a     // Catch:{ all -> 0x02af }
            r11 = r11[r10]     // Catch:{ all -> 0x02af }
            r12 = 14700(0x396c, double:7.263E-320)
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x02af }
            r11.r = r12     // Catch:{ all -> 0x02af }
            ekj[] r11 = r6.a     // Catch:{ all -> 0x02af }
            r11 = r11[r10]     // Catch:{ all -> 0x02af }
            java.lang.Long r12 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x02af }
            r11.d = r12     // Catch:{ all -> 0x02af }
            ekj[] r11 = r6.a     // Catch:{ all -> 0x02af }
            r11 = r11[r10]     // Catch:{ all -> 0x02af }
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x02af }
            r11.z = r12     // Catch:{ all -> 0x02af }
            if (r9 != 0) goto L_0x01cc
            ekj[] r11 = r6.a     // Catch:{ all -> 0x02af }
            r11 = r11[r10]     // Catch:{ all -> 0x02af }
            r11.G = r8     // Catch:{ all -> 0x02af }
        L_0x01cc:
            int r10 = r10 + 1
            goto L_0x0186
        L_0x01cf:
            ery r5 = r14.b     // Catch:{ all -> 0x02af }
            eqw r5 = r5.q()     // Catch:{ all -> 0x02af }
            r9 = 2
            boolean r5 = r5.a(r9)     // Catch:{ all -> 0x02af }
            if (r5 == 0) goto L_0x01e4
            evi r5 = r14.f()     // Catch:{ all -> 0x02af }
            java.lang.String r8 = r5.b(r6)     // Catch:{ all -> 0x02af }
        L_0x01e4:
            evi r5 = r14.f()     // Catch:{ all -> 0x02af }
            byte[] r9 = r5.a(r6)     // Catch:{ all -> 0x02af }
            eqm$a<java.lang.String> r5 = defpackage.eqm.x     // Catch:{ all -> 0x02af }
            java.lang.Object r5 = r5.a()     // Catch:{ all -> 0x02af }
            r12 = r5
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x02af }
            java.net.URL r10 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0275 }
            r10.<init>(r12)     // Catch:{ MalformedURLException -> 0x0275 }
            boolean r5 = r7.isEmpty()     // Catch:{ MalformedURLException -> 0x0275 }
            if (r5 != 0) goto L_0x0202
            r5 = 1
            goto L_0x0203
        L_0x0202:
            r5 = 0
        L_0x0203:
            defpackage.bwx.b(r5)     // Catch:{ MalformedURLException -> 0x0275 }
            java.util.List<java.lang.Long> r5 = r14.w     // Catch:{ MalformedURLException -> 0x0275 }
            if (r5 == 0) goto L_0x0218
            ery r5 = r14.b     // Catch:{ MalformedURLException -> 0x0275 }
            eqw r5 = r5.q()     // Catch:{ MalformedURLException -> 0x0275 }
            eqy r5 = r5.c     // Catch:{ MalformedURLException -> 0x0275 }
            java.lang.String r7 = "Set uploading progress before finishing the previous upload"
            r5.a(r7)     // Catch:{ MalformedURLException -> 0x0275 }
            goto L_0x021f
        L_0x0218:
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ MalformedURLException -> 0x0275 }
            r5.<init>(r7)     // Catch:{ MalformedURLException -> 0x0275 }
            r14.w = r5     // Catch:{ MalformedURLException -> 0x0275 }
        L_0x021f:
            ery r5 = r14.b     // Catch:{ MalformedURLException -> 0x0275 }
            erh r5 = r5.b()     // Catch:{ MalformedURLException -> 0x0275 }
            erj r5 = r5.e     // Catch:{ MalformedURLException -> 0x0275 }
            r5.a(r2)     // Catch:{ MalformedURLException -> 0x0275 }
            java.lang.String r2 = "?"
            ekj[] r3 = r6.a     // Catch:{ MalformedURLException -> 0x0275 }
            int r3 = r3.length     // Catch:{ MalformedURLException -> 0x0275 }
            if (r3 <= 0) goto L_0x0237
            ekj[] r2 = r6.a     // Catch:{ MalformedURLException -> 0x0275 }
            r2 = r2[r1]     // Catch:{ MalformedURLException -> 0x0275 }
            java.lang.String r2 = r2.o     // Catch:{ MalformedURLException -> 0x0275 }
        L_0x0237:
            ery r3 = r14.b     // Catch:{ MalformedURLException -> 0x0275 }
            eqw r3 = r3.q()     // Catch:{ MalformedURLException -> 0x0275 }
            eqy r3 = r3.k     // Catch:{ MalformedURLException -> 0x0275 }
            java.lang.String r5 = "Uploading data. app, uncompressed size, data"
            int r6 = r9.length     // Catch:{ MalformedURLException -> 0x0275 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ MalformedURLException -> 0x0275 }
            r3.a(r5, r2, r6, r8)     // Catch:{ MalformedURLException -> 0x0275 }
            r14.s = r0     // Catch:{ MalformedURLException -> 0x0275 }
            era r6 = r14.c()     // Catch:{ MalformedURLException -> 0x0275 }
            eve r11 = new eve     // Catch:{ MalformedURLException -> 0x0275 }
            r11.<init>(r14, r4)     // Catch:{ MalformedURLException -> 0x0275 }
            r6.c()     // Catch:{ MalformedURLException -> 0x0275 }
            r6.j()     // Catch:{ MalformedURLException -> 0x0275 }
            defpackage.bwx.a(r10)     // Catch:{ MalformedURLException -> 0x0275 }
            defpackage.bwx.a(r9)     // Catch:{ MalformedURLException -> 0x0275 }
            defpackage.bwx.a(r11)     // Catch:{ MalformedURLException -> 0x0275 }
            eru r0 = r6.p()     // Catch:{ MalformedURLException -> 0x0275 }
            erd r2 = new erd     // Catch:{ MalformedURLException -> 0x0275 }
            r3 = 0
            r5 = r2
            r7 = r4
            r8 = r10
            r10 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)     // Catch:{ MalformedURLException -> 0x0275 }
            r0.b(r2)     // Catch:{ MalformedURLException -> 0x0275 }
            goto L_0x02a9
        L_0x0275:
            ery r0 = r14.b     // Catch:{ all -> 0x02af }
            eqw r0 = r0.q()     // Catch:{ all -> 0x02af }
            eqy r0 = r0.c     // Catch:{ all -> 0x02af }
            java.lang.String r2 = "Failed to parse upload URL. Not uploading. appId"
            java.lang.Object r3 = defpackage.eqw.a(r4)     // Catch:{ all -> 0x02af }
            r0.a(r2, r3, r12)     // Catch:{ all -> 0x02af }
            goto L_0x02a9
        L_0x0287:
            r14.y = r6     // Catch:{ all -> 0x02af }
            evz r0 = r14.d()     // Catch:{ all -> 0x02af }
            long r4 = defpackage.evw.h()     // Catch:{ all -> 0x02af }
            long r2 = r2 - r4
            java.lang.String r0 = r0.a(r2)     // Catch:{ all -> 0x02af }
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x02af }
            if (r2 != 0) goto L_0x02a9
            evz r2 = r14.d()     // Catch:{ all -> 0x02af }
            evp r0 = r2.b(r0)     // Catch:{ all -> 0x02af }
            if (r0 == 0) goto L_0x02a9
            r14.a(r0)     // Catch:{ all -> 0x02af }
        L_0x02a9:
            r14.t = r1
            r14.u()
            return
        L_0x02af:
            r0 = move-exception
            r14.t = r1
            r14.u()
            goto L_0x02b7
        L_0x02b6:
            throw r0
        L_0x02b7:
            goto L_0x02b6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evc.i():void");
    }

    /* JADX WARNING: type inference failed for: r12v0 */
    /* JADX WARNING: type inference failed for: r12v99, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r9v50, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v51 */
    /* JADX WARNING: type inference failed for: r12v100 */
    /* JADX WARNING: type inference failed for: r9v52 */
    /* JADX WARNING: type inference failed for: r9v53, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v54 */
    /* JADX WARNING: type inference failed for: r12v101 */
    /* JADX WARNING: type inference failed for: r9v55 */
    /* JADX WARNING: type inference failed for: r12v102, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r9v56 */
    /* JADX WARNING: type inference failed for: r9v57 */
    /* JADX WARNING: type inference failed for: r9v58 */
    /* JADX WARNING: type inference failed for: r13v24, types: [java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r18v4, types: [java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r9v59, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r18v5, types: [java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r6v173, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v60 */
    /* JADX WARNING: type inference failed for: r9v61 */
    /* JADX WARNING: type inference failed for: r7v114, types: [java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r18v6 */
    /* JADX WARNING: type inference failed for: r14v56, types: [java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r18v7 */
    /* JADX WARNING: type inference failed for: r12v105, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r9v71 */
    /* JADX WARNING: type inference failed for: r12v106 */
    /* JADX WARNING: type inference failed for: r12v112 */
    /* JADX WARNING: type inference failed for: r9v72 */
    /* JADX WARNING: type inference failed for: r12v114, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r8v101, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r9v73 */
    /* JADX WARNING: type inference failed for: r12v115 */
    /* JADX WARNING: type inference failed for: r9v74 */
    /* JADX WARNING: type inference failed for: r12v116 */
    /* JADX WARNING: type inference failed for: r9v75 */
    /* JADX WARNING: type inference failed for: r12v117 */
    /* JADX WARNING: type inference failed for: r12v118 */
    /* JADX WARNING: type inference failed for: r12v119 */
    /* JADX WARNING: type inference failed for: r9v76 */
    /* JADX WARNING: type inference failed for: r9v77 */
    /* JADX WARNING: type inference failed for: r12v120 */
    /* JADX WARNING: type inference failed for: r9v78 */
    /* JADX WARNING: type inference failed for: r9v79 */
    /* JADX WARNING: type inference failed for: r12v121 */
    /* JADX WARNING: type inference failed for: r9v80 */
    /* JADX WARNING: type inference failed for: r9v81 */
    /* JADX WARNING: type inference failed for: r9v82 */
    /* JADX WARNING: type inference failed for: r9v83 */
    /* JADX WARNING: type inference failed for: r9v84 */
    /* JADX WARNING: type inference failed for: r9v85 */
    /* JADX WARNING: type inference failed for: r9v86 */
    /* JADX WARNING: type inference failed for: r9v87 */
    /* JADX WARNING: type inference failed for: r12v122 */
    /* JADX WARNING: type inference failed for: r12v123 */
    /* JADX WARNING: type inference failed for: r12v124 */
    /* JADX WARNING: type inference failed for: r12v125 */
    /* JADX WARNING: type inference failed for: r12v126 */
    /* JADX WARNING: type inference failed for: r12v127 */
    /* JADX WARNING: type inference failed for: r12v128 */
    /* JADX WARNING: type inference failed for: r12v129 */
    /* JADX WARNING: type inference failed for: r12v130 */
    /* JADX WARNING: type inference failed for: r12v131 */
    /* JADX WARNING: type inference failed for: r12v132 */
    /* JADX WARNING: type inference failed for: r12v133 */
    /* JADX WARNING: type inference failed for: r12v134 */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0243, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0244, code lost:
        r6 = r0;
        r9 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0042, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0043, code lost:
        r5 = r1;
        r9 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        r6 = r0;
        r9 = 0;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0678, code lost:
        if (r1.a(r11, r2) != false) goto L_0x067a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0abf, code lost:
        if (r26 != r14) goto L_0x0ac1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:?, code lost:
        r9.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v51
      assigns: []
      uses: []
      mth insns count: 1448
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0042 A[ExcHandler: all (th java.lang.Throwable), PHI: r12 
      PHI: (r12v112 ?) = (r12v117 ?), (r12v119 ?), (r12v123 ?), (r12v125 ?), (r12v127 ?), (r12v130 ?), (r12v132 ?), (r12v133 ?), (r12v134 ?) binds: [B:9:0x0033, B:10:?, B:47:0x00e1, B:53:0x00ee, B:54:?, B:24:0x0081, B:30:0x008e, B:32:0x0092, B:33:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:9:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0262 A[SYNTHETIC, Splitter:B:128:0x0262] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0269 A[Catch:{ IOException -> 0x0229, all -> 0x0d5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0277 A[Catch:{ IOException -> 0x0229, all -> 0x0d5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0390 A[Catch:{ IOException -> 0x0229, all -> 0x0d5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x039b A[Catch:{ IOException -> 0x0229, all -> 0x0d5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:189:0x039c A[Catch:{ IOException -> 0x0229, all -> 0x0d5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:294:0x0646 A[Catch:{ IOException -> 0x0229, all -> 0x0d5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x06ca A[Catch:{ IOException -> 0x0229, all -> 0x0d5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x080f A[Catch:{ IOException -> 0x0229, all -> 0x0d5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x0827 A[Catch:{ IOException -> 0x0229, all -> 0x0d5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0847 A[Catch:{ IOException -> 0x0229, all -> 0x0d5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x098d A[Catch:{ IOException -> 0x0229, all -> 0x0d5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:422:0x099c A[Catch:{ IOException -> 0x0229, all -> 0x0d5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x099f A[Catch:{ IOException -> 0x0229, all -> 0x0d5b }] */
    /* JADX WARNING: Removed duplicated region for block: B:426:0x09bc A[SYNTHETIC, Splitter:B:426:0x09bc] */
    /* JADX WARNING: Removed duplicated region for block: B:481:0x0ade A[Catch:{ all -> 0x0d3a }] */
    /* JADX WARNING: Removed duplicated region for block: B:485:0x0b27 A[Catch:{ all -> 0x0d3a }] */
    /* JADX WARNING: Removed duplicated region for block: B:562:0x0d3e  */
    /* JADX WARNING: Removed duplicated region for block: B:570:0x0d55 A[SYNTHETIC, Splitter:B:570:0x0d55] */
    /* JADX WARNING: Removed duplicated region for block: B:607:0x0824 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 25 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(long r44) {
        /*
            r43 = this;
            r1 = r43
            java.lang.String r2 = "_lte"
            evz r3 = r43.d()
            r3.e()
            evc$a r3 = new evc$a     // Catch:{ all -> 0x0d5b }
            r4 = 0
            r3.<init>(r1, r4)     // Catch:{ all -> 0x0d5b }
            evz r5 = r43.d()     // Catch:{ all -> 0x0d5b }
            long r6 = r1.y     // Catch:{ all -> 0x0d5b }
            defpackage.bwx.a(r3)     // Catch:{ all -> 0x0d5b }
            r5.c()     // Catch:{ all -> 0x0d5b }
            r5.j()     // Catch:{ all -> 0x0d5b }
            r9 = -1
            r11 = 2
            r12 = 0
            r13 = 1
            android.database.sqlite.SQLiteDatabase r15 = r5.w()     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
            boolean r14 = android.text.TextUtils.isEmpty(r12)     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
            if (r14 == 0) goto L_0x00a3
            int r14 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r14 == 0) goto L_0x004c
            java.lang.String[] r14 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0047, all -> 0x0042 }
            java.lang.String r16 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x0047, all -> 0x0042 }
            r14[r4] = r16     // Catch:{ SQLiteException -> 0x0047, all -> 0x0042 }
            java.lang.String r16 = java.lang.String.valueOf(r44)     // Catch:{ SQLiteException -> 0x0047, all -> 0x0042 }
            r14[r13] = r16     // Catch:{ SQLiteException -> 0x0047, all -> 0x0042 }
            goto L_0x0054
        L_0x0042:
            r0 = move-exception
            r5 = r1
            r9 = r12
            goto L_0x024a
        L_0x0047:
            r0 = move-exception
            r6 = r0
            r9 = r12
            goto L_0x0251
        L_0x004c:
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
            java.lang.String r16 = java.lang.String.valueOf(r44)     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
            r14[r4] = r16     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
        L_0x0054:
            int r16 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r16 == 0) goto L_0x005b
            java.lang.String r16 = "rowid <= ? and "
            goto L_0x005d
        L_0x005b:
            java.lang.String r16 = ""
        L_0x005d:
            r44 = r16
            int r8 = r44.length()     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
            int r8 = r8 + 148
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
            r12.<init>(r8)     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
            java.lang.String r8 = "select app_id, metadata_fingerprint from raw_events where "
            r12.append(r8)     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
            r8 = r44
            r12.append(r8)     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
            java.lang.String r8 = "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
            r12.append(r8)     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
            java.lang.String r8 = r12.toString()     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
            android.database.Cursor r12 = r15.rawQuery(r8, r14)     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
            boolean r8 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x0243, all -> 0x0042 }
            if (r8 != 0) goto L_0x008e
            if (r12 == 0) goto L_0x0265
            r12.close()     // Catch:{ all -> 0x0d5b }
            goto L_0x0265
        L_0x008e:
            java.lang.String r8 = r12.getString(r4)     // Catch:{ SQLiteException -> 0x0243, all -> 0x0042 }
            java.lang.String r14 = r12.getString(r13)     // Catch:{ SQLiteException -> 0x009d, all -> 0x0042 }
            r12.close()     // Catch:{ SQLiteException -> 0x009d, all -> 0x0042 }
            r9 = r12
            r12 = r8
            r8 = r14
            goto L_0x00f8
        L_0x009d:
            r0 = move-exception
            r6 = r0
            r9 = r12
            r12 = r8
            goto L_0x0251
        L_0x00a3:
            int r8 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x00b3
            java.lang.String[] r8 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
            r12 = 0
            r8[r4] = r12     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
            java.lang.String r12 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
            r8[r13] = r12     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
            goto L_0x00b8
        L_0x00b3:
            java.lang.String[] r8 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
            r12 = 0
            r8[r4] = r12     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
        L_0x00b8:
            int r12 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x00bf
            java.lang.String r12 = " and rowid <= ?"
            goto L_0x00c1
        L_0x00bf:
            java.lang.String r12 = ""
        L_0x00c1:
            int r14 = r12.length()     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
            int r14 = r14 + 84
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
            r9.<init>(r14)     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
            java.lang.String r10 = "select metadata_fingerprint from raw_events where app_id = ?"
            r9.append(r10)     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
            r9.append(r12)     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
            java.lang.String r10 = " order by rowid limit 1;"
            r9.append(r10)     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
            java.lang.String r9 = r9.toString()     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
            android.database.Cursor r12 = r15.rawQuery(r9, r8)     // Catch:{ SQLiteException -> 0x024d, all -> 0x0247 }
            boolean r8 = r12.moveToFirst()     // Catch:{ SQLiteException -> 0x0243, all -> 0x0042 }
            if (r8 != 0) goto L_0x00ee
            if (r12 == 0) goto L_0x0265
            r12.close()     // Catch:{ all -> 0x0d5b }
            goto L_0x0265
        L_0x00ee:
            java.lang.String r14 = r12.getString(r4)     // Catch:{ SQLiteException -> 0x0243, all -> 0x0042 }
            r12.close()     // Catch:{ SQLiteException -> 0x0243, all -> 0x0042 }
            r9 = r12
            r8 = r14
            r12 = 0
        L_0x00f8:
            java.lang.String r10 = "raw_events_metadata"
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0240 }
            java.lang.String r16 = "metadata"
            r14[r4] = r16     // Catch:{ SQLiteException -> 0x0240 }
            java.lang.String r17 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r13 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0240 }
            r13[r4] = r12     // Catch:{ SQLiteException -> 0x0240 }
            r16 = 1
            r13[r16] = r8     // Catch:{ SQLiteException -> 0x0240 }
            r19 = 0
            r20 = 0
            java.lang.String r21 = "rowid"
            java.lang.String r22 = "2"
            r16 = r14
            r14 = r15
            r24 = r15
            r15 = r10
            r18 = r13
            android.database.Cursor r9 = r14.query(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ SQLiteException -> 0x0240 }
            boolean r10 = r9.moveToFirst()     // Catch:{ SQLiteException -> 0x0240 }
            if (r10 != 0) goto L_0x013a
            eqw r6 = r5.q()     // Catch:{ SQLiteException -> 0x0240 }
            eqy r6 = r6.c     // Catch:{ SQLiteException -> 0x0240 }
            java.lang.String r7 = "Raw event metadata record is missing. appId"
            java.lang.Object r8 = defpackage.eqw.a(r12)     // Catch:{ SQLiteException -> 0x0240 }
            r6.a(r7, r8)     // Catch:{ SQLiteException -> 0x0240 }
            if (r9 == 0) goto L_0x0265
            r9.close()     // Catch:{ all -> 0x0d5b }
            goto L_0x0265
        L_0x013a:
            byte[] r10 = r9.getBlob(r4)     // Catch:{ SQLiteException -> 0x0240 }
            int r13 = r10.length     // Catch:{ SQLiteException -> 0x0240 }
            eps r10 = defpackage.eps.a(r10, r13)     // Catch:{ SQLiteException -> 0x0240 }
            ekj r13 = new ekj     // Catch:{ SQLiteException -> 0x0240 }
            r13.<init>()     // Catch:{ SQLiteException -> 0x0240 }
            r13.a(r10)     // Catch:{ IOException -> 0x0229 }
            boolean r10 = r9.moveToNext()     // Catch:{ SQLiteException -> 0x0240 }
            if (r10 == 0) goto L_0x0160
            eqw r10 = r5.q()     // Catch:{ SQLiteException -> 0x0240 }
            eqy r10 = r10.f     // Catch:{ SQLiteException -> 0x0240 }
            java.lang.String r14 = "Get multiple raw event metadata records, expected one. appId"
            java.lang.Object r15 = defpackage.eqw.a(r12)     // Catch:{ SQLiteException -> 0x0240 }
            r10.a(r14, r15)     // Catch:{ SQLiteException -> 0x0240 }
        L_0x0160:
            r9.close()     // Catch:{ SQLiteException -> 0x0240 }
            r3.a(r13)     // Catch:{ SQLiteException -> 0x0240 }
            r13 = -1
            int r10 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r10 == 0) goto L_0x0181
            java.lang.String r10 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
            r13 = 3
            java.lang.String[] r14 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x0240 }
            r14[r4] = r12     // Catch:{ SQLiteException -> 0x0240 }
            r13 = 1
            r14[r13] = r8     // Catch:{ SQLiteException -> 0x0240 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ SQLiteException -> 0x0240 }
            r14[r11] = r6     // Catch:{ SQLiteException -> 0x0240 }
            r17 = r10
            r18 = r14
            goto L_0x018e
        L_0x0181:
            java.lang.String r6 = "app_id = ? and metadata_fingerprint = ?"
            java.lang.String[] r7 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0240 }
            r7[r4] = r12     // Catch:{ SQLiteException -> 0x0240 }
            r10 = 1
            r7[r10] = r8     // Catch:{ SQLiteException -> 0x0240 }
            r17 = r6
            r18 = r7
        L_0x018e:
            java.lang.String r15 = "raw_events"
            r6 = 4
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0240 }
            java.lang.String r7 = "rowid"
            r6[r4] = r7     // Catch:{ SQLiteException -> 0x0240 }
            java.lang.String r7 = "name"
            r8 = 1
            r6[r8] = r7     // Catch:{ SQLiteException -> 0x0240 }
            java.lang.String r7 = "timestamp"
            r6[r11] = r7     // Catch:{ SQLiteException -> 0x0240 }
            java.lang.String r7 = "data"
            r8 = 3
            r6[r8] = r7     // Catch:{ SQLiteException -> 0x0240 }
            r19 = 0
            r20 = 0
            java.lang.String r21 = "rowid"
            r22 = 0
            r14 = r24
            r16 = r6
            android.database.Cursor r6 = r14.query(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ SQLiteException -> 0x0240 }
            boolean r7 = r6.moveToFirst()     // Catch:{ SQLiteException -> 0x0226, all -> 0x0222 }
            if (r7 != 0) goto L_0x01d1
            eqw r7 = r5.q()     // Catch:{ SQLiteException -> 0x0226, all -> 0x0222 }
            eqy r7 = r7.f     // Catch:{ SQLiteException -> 0x0226, all -> 0x0222 }
            java.lang.String r8 = "Raw event data disappeared while in transaction. appId"
            java.lang.Object r9 = defpackage.eqw.a(r12)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0222 }
            r7.a(r8, r9)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0222 }
            if (r6 == 0) goto L_0x0265
            r6.close()     // Catch:{ all -> 0x0d5b }
            goto L_0x0265
        L_0x01d1:
            long r7 = r6.getLong(r4)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0222 }
            r9 = 3
            byte[] r10 = r6.getBlob(r9)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0222 }
            int r9 = r10.length     // Catch:{ SQLiteException -> 0x0226, all -> 0x0222 }
            eps r9 = defpackage.eps.a(r10, r9)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0222 }
            ekg r10 = new ekg     // Catch:{ SQLiteException -> 0x0226, all -> 0x0222 }
            r10.<init>()     // Catch:{ SQLiteException -> 0x0226, all -> 0x0222 }
            r10.a(r9)     // Catch:{ IOException -> 0x0205 }
            r9 = 1
            java.lang.String r13 = r6.getString(r9)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0222 }
            r10.b = r13     // Catch:{ SQLiteException -> 0x0226, all -> 0x0222 }
            long r13 = r6.getLong(r11)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0222 }
            java.lang.Long r9 = java.lang.Long.valueOf(r13)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0222 }
            r10.c = r9     // Catch:{ SQLiteException -> 0x0226, all -> 0x0222 }
            boolean r7 = r3.a(r7, r10)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0222 }
            if (r7 != 0) goto L_0x0216
            if (r6 == 0) goto L_0x0265
            r6.close()     // Catch:{ all -> 0x0d5b }
            goto L_0x0265
        L_0x0205:
            r0 = move-exception
            r7 = r0
            eqw r8 = r5.q()     // Catch:{ SQLiteException -> 0x0226, all -> 0x0222 }
            eqy r8 = r8.c     // Catch:{ SQLiteException -> 0x0226, all -> 0x0222 }
            java.lang.String r9 = "Data loss. Failed to merge raw event. appId"
            java.lang.Object r10 = defpackage.eqw.a(r12)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0222 }
            r8.a(r9, r10, r7)     // Catch:{ SQLiteException -> 0x0226, all -> 0x0222 }
        L_0x0216:
            boolean r7 = r6.moveToNext()     // Catch:{ SQLiteException -> 0x0226, all -> 0x0222 }
            if (r7 != 0) goto L_0x01d1
            if (r6 == 0) goto L_0x0265
            r6.close()     // Catch:{ all -> 0x0d5b }
            goto L_0x0265
        L_0x0222:
            r0 = move-exception
            r5 = r1
            r9 = r6
            goto L_0x024a
        L_0x0226:
            r0 = move-exception
            r9 = r6
            goto L_0x0241
        L_0x0229:
            r0 = move-exception
            r6 = r0
            eqw r7 = r5.q()     // Catch:{ SQLiteException -> 0x0240 }
            eqy r7 = r7.c     // Catch:{ SQLiteException -> 0x0240 }
            java.lang.String r8 = "Data loss. Failed to merge raw event metadata. appId"
            java.lang.Object r10 = defpackage.eqw.a(r12)     // Catch:{ SQLiteException -> 0x0240 }
            r7.a(r8, r10, r6)     // Catch:{ SQLiteException -> 0x0240 }
            if (r9 == 0) goto L_0x0265
            r9.close()     // Catch:{ all -> 0x0d5b }
            goto L_0x0265
        L_0x0240:
            r0 = move-exception
        L_0x0241:
            r6 = r0
            goto L_0x0251
        L_0x0243:
            r0 = move-exception
            r6 = r0
            r9 = r12
            goto L_0x0250
        L_0x0247:
            r0 = move-exception
            r5 = r1
            r9 = 0
        L_0x024a:
            r1 = r0
            goto L_0x0d53
        L_0x024d:
            r0 = move-exception
            r6 = r0
            r9 = 0
        L_0x0250:
            r12 = 0
        L_0x0251:
            eqw r5 = r5.q()     // Catch:{ all -> 0x0d4f }
            eqy r5 = r5.c     // Catch:{ all -> 0x0d4f }
            java.lang.String r7 = "Data loss. Error selecting raw event. appId"
            java.lang.Object r8 = defpackage.eqw.a(r12)     // Catch:{ all -> 0x0d4f }
            r5.a(r7, r8, r6)     // Catch:{ all -> 0x0d4f }
            if (r9 == 0) goto L_0x0265
            r9.close()     // Catch:{ all -> 0x0d5b }
        L_0x0265:
            java.util.List<ekg> r5 = r3.c     // Catch:{ all -> 0x0d5b }
            if (r5 == 0) goto L_0x0274
            java.util.List<ekg> r5 = r3.c     // Catch:{ all -> 0x0d5b }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0d5b }
            if (r5 == 0) goto L_0x0272
            goto L_0x0274
        L_0x0272:
            r5 = 0
            goto L_0x0275
        L_0x0274:
            r5 = 1
        L_0x0275:
            if (r5 != 0) goto L_0x0d3e
            ekj r5 = r3.a     // Catch:{ all -> 0x0d5b }
            java.util.List<ekg> r6 = r3.c     // Catch:{ all -> 0x0d5b }
            int r6 = r6.size()     // Catch:{ all -> 0x0d5b }
            ekg[] r6 = new defpackage.ekg[r6]     // Catch:{ all -> 0x0d5b }
            r5.b = r6     // Catch:{ all -> 0x0d5b }
            ery r6 = r1.b     // Catch:{ all -> 0x0d5b }
            evw r6 = r6.e     // Catch:{ all -> 0x0d5b }
            java.lang.String r7 = r5.o     // Catch:{ all -> 0x0d5b }
            boolean r6 = r6.d(r7)     // Catch:{ all -> 0x0d5b }
            ery r7 = r1.b     // Catch:{ all -> 0x0d5b }
            evw r7 = r7.e     // Catch:{ all -> 0x0d5b }
            ekj r8 = r3.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r8 = r8.o     // Catch:{ all -> 0x0d5b }
            eqm$a<java.lang.Boolean> r9 = defpackage.eqm.aj     // Catch:{ all -> 0x0d5b }
            boolean r7 = r7.c(r8, r9)     // Catch:{ all -> 0x0d5b }
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x02a2:
            java.util.List<ekg> r11 = r3.c     // Catch:{ all -> 0x0d5b }
            int r11 = r11.size()     // Catch:{ all -> 0x0d5b }
            java.lang.String r4 = "_et"
            r18 = r13
            java.lang.String r13 = "_e"
            r19 = 1
            if (r10 >= r11) goto L_0x0729
            java.util.List<ekg> r11 = r3.c     // Catch:{ all -> 0x0d5b }
            java.lang.Object r11 = r11.get(r10)     // Catch:{ all -> 0x0d5b }
            ekg r11 = (defpackage.ekg) r11     // Catch:{ all -> 0x0d5b }
            r21 = r2
            ert r2 = r43.n()     // Catch:{ all -> 0x0d5b }
            r22 = r10
            ekj r10 = r3.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r10 = r10.o     // Catch:{ all -> 0x0d5b }
            r24 = r12
            java.lang.String r12 = r11.b     // Catch:{ all -> 0x0d5b }
            boolean r2 = r2.b(r10, r12)     // Catch:{ all -> 0x0d5b }
            java.lang.String r10 = "_err"
            if (r2 == 0) goto L_0x033d
            ery r2 = r1.b     // Catch:{ all -> 0x0d5b }
            eqw r2 = r2.q()     // Catch:{ all -> 0x0d5b }
            eqy r2 = r2.f     // Catch:{ all -> 0x0d5b }
            java.lang.String r4 = "Dropping blacklisted raw event. appId"
            ekj r12 = r3.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r12 = r12.o     // Catch:{ all -> 0x0d5b }
            java.lang.Object r12 = defpackage.eqw.a(r12)     // Catch:{ all -> 0x0d5b }
            ery r13 = r1.b     // Catch:{ all -> 0x0d5b }
            equ r13 = r13.f()     // Catch:{ all -> 0x0d5b }
            r25 = r5
            java.lang.String r5 = r11.b     // Catch:{ all -> 0x0d5b }
            java.lang.String r5 = r13.a(r5)     // Catch:{ all -> 0x0d5b }
            r2.a(r4, r12, r5)     // Catch:{ all -> 0x0d5b }
            ert r2 = r43.n()     // Catch:{ all -> 0x0d5b }
            ekj r4 = r3.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r4 = r4.o     // Catch:{ all -> 0x0d5b }
            boolean r2 = r2.f(r4)     // Catch:{ all -> 0x0d5b }
            if (r2 != 0) goto L_0x0314
            ert r2 = r43.n()     // Catch:{ all -> 0x0d5b }
            ekj r4 = r3.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r4 = r4.o     // Catch:{ all -> 0x0d5b }
            boolean r2 = r2.g(r4)     // Catch:{ all -> 0x0d5b }
            if (r2 == 0) goto L_0x0312
            goto L_0x0314
        L_0x0312:
            r2 = 0
            goto L_0x0315
        L_0x0314:
            r2 = 1
        L_0x0315:
            if (r2 != 0) goto L_0x032f
            java.lang.String r2 = r11.b     // Catch:{ all -> 0x0d5b }
            boolean r2 = r10.equals(r2)     // Catch:{ all -> 0x0d5b }
            if (r2 != 0) goto L_0x032f
            ery r2 = r1.b     // Catch:{ all -> 0x0d5b }
            evm r2 = r2.e()     // Catch:{ all -> 0x0d5b }
            r4 = 11
            java.lang.String r5 = "_ev"
            java.lang.String r10 = r11.b     // Catch:{ all -> 0x0d5b }
            r11 = 0
            r2.b(r4, r5, r10, r11)     // Catch:{ all -> 0x0d5b }
        L_0x032f:
            r29 = r6
            r31 = r7
            r2 = r9
            r13 = r18
            r12 = r24
            r5 = r25
            r9 = 3
            goto L_0x071d
        L_0x033d:
            r25 = r5
            ert r2 = r43.n()     // Catch:{ all -> 0x0d5b }
            ekj r5 = r3.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r5 = r5.o     // Catch:{ all -> 0x0d5b }
            java.lang.String r12 = r11.b     // Catch:{ all -> 0x0d5b }
            boolean r2 = r2.c(r5, r12)     // Catch:{ all -> 0x0d5b }
            java.lang.String r5 = "_c"
            if (r2 != 0) goto L_0x03a5
            r43.f()     // Catch:{ all -> 0x0d5b }
            java.lang.String r12 = r11.b     // Catch:{ all -> 0x0d5b }
            defpackage.bwx.a(r12)     // Catch:{ all -> 0x0d5b }
            r27 = r14
            int r14 = r12.hashCode()     // Catch:{ all -> 0x0d5b }
            r15 = 94660(0x171c4, float:1.32647E-40)
            if (r14 == r15) goto L_0x0383
            r15 = 95025(0x17331, float:1.33158E-40)
            if (r14 == r15) goto L_0x0379
            r15 = 95027(0x17333, float:1.33161E-40)
            if (r14 == r15) goto L_0x036f
            goto L_0x038d
        L_0x036f:
            java.lang.String r14 = "_ui"
            boolean r12 = r12.equals(r14)     // Catch:{ all -> 0x0d5b }
            if (r12 == 0) goto L_0x038d
            r12 = 1
            goto L_0x038e
        L_0x0379:
            java.lang.String r14 = "_ug"
            boolean r12 = r12.equals(r14)     // Catch:{ all -> 0x0d5b }
            if (r12 == 0) goto L_0x038d
            r12 = 2
            goto L_0x038e
        L_0x0383:
            java.lang.String r14 = "_in"
            boolean r12 = r12.equals(r14)     // Catch:{ all -> 0x0d5b }
            if (r12 == 0) goto L_0x038d
            r12 = 0
            goto L_0x038e
        L_0x038d:
            r12 = -1
        L_0x038e:
            if (r12 == 0) goto L_0x0398
            r14 = 1
            if (r12 == r14) goto L_0x0398
            r14 = 2
            if (r12 == r14) goto L_0x0398
            r12 = 0
            goto L_0x0399
        L_0x0398:
            r12 = 1
        L_0x0399:
            if (r12 == 0) goto L_0x039c
            goto L_0x03a7
        L_0x039c:
            r29 = r6
            r31 = r7
            r12 = r8
            r30 = r9
            goto L_0x057d
        L_0x03a5:
            r27 = r14
        L_0x03a7:
            ekh[] r12 = r11.a     // Catch:{ all -> 0x0d5b }
            if (r12 != 0) goto L_0x03b0
            r12 = 0
            ekh[] r14 = new defpackage.ekh[r12]     // Catch:{ all -> 0x0d5b }
            r11.a = r14     // Catch:{ all -> 0x0d5b }
        L_0x03b0:
            ekh[] r12 = r11.a     // Catch:{ all -> 0x0d5b }
            int r14 = r12.length     // Catch:{ all -> 0x0d5b }
            r31 = r7
            r15 = 0
            r29 = 0
            r30 = 0
        L_0x03ba:
            java.lang.String r7 = "_r"
            if (r15 >= r14) goto L_0x03ec
            r32 = r14
            r14 = r12[r15]     // Catch:{ all -> 0x0d5b }
            r33 = r12
            java.lang.String r12 = r14.a     // Catch:{ all -> 0x0d5b }
            boolean r12 = r5.equals(r12)     // Catch:{ all -> 0x0d5b }
            if (r12 == 0) goto L_0x03d5
            java.lang.Long r7 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0d5b }
            r14.c = r7     // Catch:{ all -> 0x0d5b }
            r29 = 1
            goto L_0x03e5
        L_0x03d5:
            java.lang.String r12 = r14.a     // Catch:{ all -> 0x0d5b }
            boolean r7 = r7.equals(r12)     // Catch:{ all -> 0x0d5b }
            if (r7 == 0) goto L_0x03e5
            java.lang.Long r7 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0d5b }
            r14.c = r7     // Catch:{ all -> 0x0d5b }
            r30 = 1
        L_0x03e5:
            int r15 = r15 + 1
            r14 = r32
            r12 = r33
            goto L_0x03ba
        L_0x03ec:
            if (r29 != 0) goto L_0x042d
            if (r2 == 0) goto L_0x042d
            ery r12 = r1.b     // Catch:{ all -> 0x0d5b }
            eqw r12 = r12.q()     // Catch:{ all -> 0x0d5b }
            eqy r12 = r12.k     // Catch:{ all -> 0x0d5b }
            java.lang.String r14 = "Marking event as conversion"
            ery r15 = r1.b     // Catch:{ all -> 0x0d5b }
            equ r15 = r15.f()     // Catch:{ all -> 0x0d5b }
            r29 = r6
            java.lang.String r6 = r11.b     // Catch:{ all -> 0x0d5b }
            java.lang.String r6 = r15.a(r6)     // Catch:{ all -> 0x0d5b }
            r12.a(r14, r6)     // Catch:{ all -> 0x0d5b }
            ekh[] r6 = r11.a     // Catch:{ all -> 0x0d5b }
            ekh[] r12 = r11.a     // Catch:{ all -> 0x0d5b }
            int r12 = r12.length     // Catch:{ all -> 0x0d5b }
            r14 = 1
            int r12 = r12 + r14
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r12)     // Catch:{ all -> 0x0d5b }
            ekh[] r6 = (defpackage.ekh[]) r6     // Catch:{ all -> 0x0d5b }
            ekh r12 = new ekh     // Catch:{ all -> 0x0d5b }
            r12.<init>()     // Catch:{ all -> 0x0d5b }
            r12.a = r5     // Catch:{ all -> 0x0d5b }
            java.lang.Long r14 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0d5b }
            r12.c = r14     // Catch:{ all -> 0x0d5b }
            int r14 = r6.length     // Catch:{ all -> 0x0d5b }
            r15 = 1
            int r14 = r14 - r15
            r6[r14] = r12     // Catch:{ all -> 0x0d5b }
            r11.a = r6     // Catch:{ all -> 0x0d5b }
            goto L_0x042f
        L_0x042d:
            r29 = r6
        L_0x042f:
            if (r30 != 0) goto L_0x046b
            ery r6 = r1.b     // Catch:{ all -> 0x0d5b }
            eqw r6 = r6.q()     // Catch:{ all -> 0x0d5b }
            eqy r6 = r6.k     // Catch:{ all -> 0x0d5b }
            java.lang.String r12 = "Marking event as real-time"
            ery r14 = r1.b     // Catch:{ all -> 0x0d5b }
            equ r14 = r14.f()     // Catch:{ all -> 0x0d5b }
            java.lang.String r15 = r11.b     // Catch:{ all -> 0x0d5b }
            java.lang.String r14 = r14.a(r15)     // Catch:{ all -> 0x0d5b }
            r6.a(r12, r14)     // Catch:{ all -> 0x0d5b }
            ekh[] r6 = r11.a     // Catch:{ all -> 0x0d5b }
            ekh[] r12 = r11.a     // Catch:{ all -> 0x0d5b }
            int r12 = r12.length     // Catch:{ all -> 0x0d5b }
            r14 = 1
            int r12 = r12 + r14
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r12)     // Catch:{ all -> 0x0d5b }
            ekh[] r6 = (defpackage.ekh[]) r6     // Catch:{ all -> 0x0d5b }
            ekh r12 = new ekh     // Catch:{ all -> 0x0d5b }
            r12.<init>()     // Catch:{ all -> 0x0d5b }
            r12.a = r7     // Catch:{ all -> 0x0d5b }
            java.lang.Long r14 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0d5b }
            r12.c = r14     // Catch:{ all -> 0x0d5b }
            int r14 = r6.length     // Catch:{ all -> 0x0d5b }
            r15 = 1
            int r14 = r14 - r15
            r6[r14] = r12     // Catch:{ all -> 0x0d5b }
            r11.a = r6     // Catch:{ all -> 0x0d5b }
        L_0x046b:
            evz r32 = r43.d()     // Catch:{ all -> 0x0d5b }
            long r33 = r43.s()     // Catch:{ all -> 0x0d5b }
            ekj r6 = r3.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r6 = r6.o     // Catch:{ all -> 0x0d5b }
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 1
            r35 = r6
            ewa r6 = r32.a(r33, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0d5b }
            long r14 = r6.e     // Catch:{ all -> 0x0d5b }
            ery r6 = r1.b     // Catch:{ all -> 0x0d5b }
            evw r6 = r6.e     // Catch:{ all -> 0x0d5b }
            ekj r12 = r3.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r12 = r12.o     // Catch:{ all -> 0x0d5b }
            int r6 = r6.a(r12)     // Catch:{ all -> 0x0d5b }
            r12 = r8
            r30 = r9
            long r8 = (long) r6     // Catch:{ all -> 0x0d5b }
            int r6 = (r14 > r8 ? 1 : (r14 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x04d0
            r6 = 0
        L_0x049e:
            ekh[] r8 = r11.a     // Catch:{ all -> 0x0d5b }
            int r8 = r8.length     // Catch:{ all -> 0x0d5b }
            if (r6 >= r8) goto L_0x04d2
            ekh[] r8 = r11.a     // Catch:{ all -> 0x0d5b }
            r8 = r8[r6]     // Catch:{ all -> 0x0d5b }
            java.lang.String r8 = r8.a     // Catch:{ all -> 0x0d5b }
            boolean r8 = r7.equals(r8)     // Catch:{ all -> 0x0d5b }
            if (r8 == 0) goto L_0x04cd
            ekh[] r7 = r11.a     // Catch:{ all -> 0x0d5b }
            int r7 = r7.length     // Catch:{ all -> 0x0d5b }
            r8 = 1
            int r7 = r7 - r8
            ekh[] r7 = new defpackage.ekh[r7]     // Catch:{ all -> 0x0d5b }
            if (r6 <= 0) goto L_0x04be
            ekh[] r8 = r11.a     // Catch:{ all -> 0x0d5b }
            r9 = 0
            java.lang.System.arraycopy(r8, r9, r7, r9, r6)     // Catch:{ all -> 0x0d5b }
        L_0x04be:
            int r8 = r7.length     // Catch:{ all -> 0x0d5b }
            if (r6 >= r8) goto L_0x04ca
            ekh[] r8 = r11.a     // Catch:{ all -> 0x0d5b }
            int r9 = r6 + 1
            int r14 = r7.length     // Catch:{ all -> 0x0d5b }
            int r14 = r14 - r6
            java.lang.System.arraycopy(r8, r9, r7, r6, r14)     // Catch:{ all -> 0x0d5b }
        L_0x04ca:
            r11.a = r7     // Catch:{ all -> 0x0d5b }
            goto L_0x04d2
        L_0x04cd:
            int r6 = r6 + 1
            goto L_0x049e
        L_0x04d0:
            r18 = 1
        L_0x04d2:
            java.lang.String r6 = r11.b     // Catch:{ all -> 0x0d5b }
            boolean r6 = defpackage.evm.a(r6)     // Catch:{ all -> 0x0d5b }
            if (r6 == 0) goto L_0x057d
            if (r2 == 0) goto L_0x057d
            evz r32 = r43.d()     // Catch:{ all -> 0x0d5b }
            long r33 = r43.s()     // Catch:{ all -> 0x0d5b }
            ekj r6 = r3.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r6 = r6.o     // Catch:{ all -> 0x0d5b }
            r36 = 0
            r37 = 0
            r38 = 1
            r39 = 0
            r40 = 0
            r35 = r6
            ewa r6 = r32.a(r33, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0d5b }
            long r6 = r6.c     // Catch:{ all -> 0x0d5b }
            ery r8 = r1.b     // Catch:{ all -> 0x0d5b }
            evw r8 = r8.e     // Catch:{ all -> 0x0d5b }
            ekj r9 = r3.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r9 = r9.o     // Catch:{ all -> 0x0d5b }
            eqm$a<java.lang.Integer> r14 = defpackage.eqm.u     // Catch:{ all -> 0x0d5b }
            int r8 = r8.b(r9, r14)     // Catch:{ all -> 0x0d5b }
            long r8 = (long) r8     // Catch:{ all -> 0x0d5b }
            int r14 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r14 <= 0) goto L_0x057d
            ery r6 = r1.b     // Catch:{ all -> 0x0d5b }
            eqw r6 = r6.q()     // Catch:{ all -> 0x0d5b }
            eqy r6 = r6.f     // Catch:{ all -> 0x0d5b }
            java.lang.String r7 = "Too many conversions. Not logging as conversion. appId"
            ekj r8 = r3.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r8 = r8.o     // Catch:{ all -> 0x0d5b }
            java.lang.Object r8 = defpackage.eqw.a(r8)     // Catch:{ all -> 0x0d5b }
            r6.a(r7, r8)     // Catch:{ all -> 0x0d5b }
            ekh[] r6 = r11.a     // Catch:{ all -> 0x0d5b }
            int r7 = r6.length     // Catch:{ all -> 0x0d5b }
            r8 = 0
            r9 = 0
            r14 = 0
        L_0x0528:
            if (r8 >= r7) goto L_0x0546
            r15 = r6[r8]     // Catch:{ all -> 0x0d5b }
            r19 = r6
            java.lang.String r6 = r15.a     // Catch:{ all -> 0x0d5b }
            boolean r6 = r5.equals(r6)     // Catch:{ all -> 0x0d5b }
            if (r6 == 0) goto L_0x0538
            r14 = r15
            goto L_0x0541
        L_0x0538:
            java.lang.String r6 = r15.a     // Catch:{ all -> 0x0d5b }
            boolean r6 = r10.equals(r6)     // Catch:{ all -> 0x0d5b }
            if (r6 == 0) goto L_0x0541
            r9 = 1
        L_0x0541:
            int r8 = r8 + 1
            r6 = r19
            goto L_0x0528
        L_0x0546:
            if (r9 == 0) goto L_0x055b
            if (r14 == 0) goto L_0x055b
            ekh[] r6 = r11.a     // Catch:{ all -> 0x0d5b }
            r7 = 1
            ekh[] r8 = new defpackage.ekh[r7]     // Catch:{ all -> 0x0d5b }
            r7 = 0
            r8[r7] = r14     // Catch:{ all -> 0x0d5b }
            java.lang.Object[] r6 = defpackage.bzd.a((T[]) r6, (T[]) r8)     // Catch:{ all -> 0x0d5b }
            ekh[] r6 = (defpackage.ekh[]) r6     // Catch:{ all -> 0x0d5b }
            r11.a = r6     // Catch:{ all -> 0x0d5b }
            goto L_0x057d
        L_0x055b:
            if (r14 == 0) goto L_0x0568
            r14.a = r10     // Catch:{ all -> 0x0d5b }
            r6 = 10
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d5b }
            r14.c = r6     // Catch:{ all -> 0x0d5b }
            goto L_0x057d
        L_0x0568:
            ery r6 = r1.b     // Catch:{ all -> 0x0d5b }
            eqw r6 = r6.q()     // Catch:{ all -> 0x0d5b }
            eqy r6 = r6.c     // Catch:{ all -> 0x0d5b }
            java.lang.String r7 = "Did not find conversion parameter. appId"
            ekj r8 = r3.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r8 = r8.o     // Catch:{ all -> 0x0d5b }
            java.lang.Object r8 = defpackage.eqw.a(r8)     // Catch:{ all -> 0x0d5b }
            r6.a(r7, r8)     // Catch:{ all -> 0x0d5b }
        L_0x057d:
            ery r6 = r1.b     // Catch:{ all -> 0x0d5b }
            evw r6 = r6.e     // Catch:{ all -> 0x0d5b }
            ekj r7 = r3.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r7 = r7.o     // Catch:{ all -> 0x0d5b }
            eqm$a<java.lang.Boolean> r8 = defpackage.eqm.Z     // Catch:{ all -> 0x0d5b }
            boolean r6 = r6.c(r7, r8)     // Catch:{ all -> 0x0d5b }
            if (r6 == 0) goto L_0x0635
            if (r2 == 0) goto L_0x0635
            ekh[] r2 = r11.a     // Catch:{ all -> 0x0d5b }
            r6 = 0
            r7 = -1
            r8 = -1
        L_0x0594:
            int r9 = r2.length     // Catch:{ all -> 0x0d5b }
            if (r6 >= r9) goto L_0x05b5
            java.lang.String r9 = "value"
            r10 = r2[r6]     // Catch:{ all -> 0x0d5b }
            java.lang.String r10 = r10.a     // Catch:{ all -> 0x0d5b }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0d5b }
            if (r9 == 0) goto L_0x05a5
            r7 = r6
            goto L_0x05b2
        L_0x05a5:
            java.lang.String r9 = "currency"
            r10 = r2[r6]     // Catch:{ all -> 0x0d5b }
            java.lang.String r10 = r10.a     // Catch:{ all -> 0x0d5b }
            boolean r9 = r9.equals(r10)     // Catch:{ all -> 0x0d5b }
            if (r9 == 0) goto L_0x05b2
            r8 = r6
        L_0x05b2:
            int r6 = r6 + 1
            goto L_0x0594
        L_0x05b5:
            r6 = -1
            if (r7 == r6) goto L_0x05e1
            r6 = r2[r7]     // Catch:{ all -> 0x0d5b }
            java.lang.Long r6 = r6.c     // Catch:{ all -> 0x0d5b }
            if (r6 != 0) goto L_0x05e3
            r6 = r2[r7]     // Catch:{ all -> 0x0d5b }
            java.lang.Double r6 = r6.d     // Catch:{ all -> 0x0d5b }
            if (r6 != 0) goto L_0x05e3
            ery r6 = r1.b     // Catch:{ all -> 0x0d5b }
            eqw r6 = r6.q()     // Catch:{ all -> 0x0d5b }
            eqy r6 = r6.h     // Catch:{ all -> 0x0d5b }
            java.lang.String r8 = "Value must be specified with a numeric type."
            r6.a(r8)     // Catch:{ all -> 0x0d5b }
            ekh[] r2 = a(r2, r7)     // Catch:{ all -> 0x0d5b }
            ekh[] r2 = a(r2, r5)     // Catch:{ all -> 0x0d5b }
            r5 = 18
            java.lang.String r6 = "value"
            ekh[] r2 = a(r2, r5, r6)     // Catch:{ all -> 0x0d5b }
        L_0x05e1:
            r9 = 3
            goto L_0x0632
        L_0x05e3:
            r6 = -1
            if (r8 != r6) goto L_0x05e9
            r6 = 1
            r9 = 3
            goto L_0x0613
        L_0x05e9:
            r6 = r2[r8]     // Catch:{ all -> 0x0d5b }
            java.lang.String r6 = r6.b     // Catch:{ all -> 0x0d5b }
            if (r6 == 0) goto L_0x0611
            int r8 = r6.length()     // Catch:{ all -> 0x0d5b }
            r9 = 3
            if (r8 == r9) goto L_0x05f7
            goto L_0x0612
        L_0x05f7:
            r8 = 0
        L_0x05f8:
            int r10 = r6.length()     // Catch:{ all -> 0x0d5b }
            if (r8 >= r10) goto L_0x060f
            int r10 = r6.codePointAt(r8)     // Catch:{ all -> 0x0d5b }
            boolean r14 = java.lang.Character.isLetter(r10)     // Catch:{ all -> 0x0d5b }
            if (r14 != 0) goto L_0x0609
            goto L_0x0612
        L_0x0609:
            int r10 = java.lang.Character.charCount(r10)     // Catch:{ all -> 0x0d5b }
            int r8 = r8 + r10
            goto L_0x05f8
        L_0x060f:
            r6 = 0
            goto L_0x0613
        L_0x0611:
            r9 = 3
        L_0x0612:
            r6 = 1
        L_0x0613:
            if (r6 == 0) goto L_0x0632
            ery r6 = r1.b     // Catch:{ all -> 0x0d5b }
            eqw r6 = r6.q()     // Catch:{ all -> 0x0d5b }
            eqy r6 = r6.h     // Catch:{ all -> 0x0d5b }
            java.lang.String r8 = "Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter."
            r6.a(r8)     // Catch:{ all -> 0x0d5b }
            ekh[] r2 = a(r2, r7)     // Catch:{ all -> 0x0d5b }
            ekh[] r2 = a(r2, r5)     // Catch:{ all -> 0x0d5b }
            r5 = 19
            java.lang.String r6 = "currency"
            ekh[] r2 = a(r2, r5, r6)     // Catch:{ all -> 0x0d5b }
        L_0x0632:
            r11.a = r2     // Catch:{ all -> 0x0d5b }
            goto L_0x0636
        L_0x0635:
            r9 = 3
        L_0x0636:
            ery r2 = r1.b     // Catch:{ all -> 0x0d5b }
            evw r2 = r2.e     // Catch:{ all -> 0x0d5b }
            ekj r5 = r3.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r5 = r5.o     // Catch:{ all -> 0x0d5b }
            eqm$a<java.lang.Boolean> r6 = defpackage.eqm.ai     // Catch:{ all -> 0x0d5b }
            boolean r2 = r2.c(r5, r6)     // Catch:{ all -> 0x0d5b }
            if (r2 == 0) goto L_0x06b8
            java.lang.String r2 = r11.b     // Catch:{ all -> 0x0d5b }
            boolean r2 = r13.equals(r2)     // Catch:{ all -> 0x0d5b }
            if (r2 == 0) goto L_0x0681
            r43.f()     // Catch:{ all -> 0x0d5b }
            java.lang.String r2 = "_fr"
            ekh r2 = defpackage.evi.a(r11, r2)     // Catch:{ all -> 0x0d5b }
            if (r2 != 0) goto L_0x06b8
            if (r30 == 0) goto L_0x067d
            r2 = r30
            java.lang.Long r5 = r2.c     // Catch:{ all -> 0x0d5b }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0d5b }
            java.lang.Long r7 = r11.c     // Catch:{ all -> 0x0d5b }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0d5b }
            long r5 = r5 - r7
            long r5 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x0d5b }
            r7 = 1000(0x3e8, double:4.94E-321)
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 > 0) goto L_0x067f
            boolean r5 = r1.a(r11, r2)     // Catch:{ all -> 0x0d5b }
            if (r5 == 0) goto L_0x067f
        L_0x067a:
            r2 = 0
            r12 = 0
            goto L_0x06ba
        L_0x067d:
            r2 = r30
        L_0x067f:
            r12 = r11
            goto L_0x06ba
        L_0x0681:
            r2 = r30
            java.lang.String r5 = "_vs"
            java.lang.String r6 = r11.b     // Catch:{ all -> 0x0d5b }
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x0d5b }
            if (r5 == 0) goto L_0x06ba
            r43.f()     // Catch:{ all -> 0x0d5b }
            ekh r5 = defpackage.evi.a(r11, r4)     // Catch:{ all -> 0x0d5b }
            if (r5 != 0) goto L_0x06ba
            if (r12 == 0) goto L_0x06b6
            java.lang.Long r2 = r12.c     // Catch:{ all -> 0x0d5b }
            long r5 = r2.longValue()     // Catch:{ all -> 0x0d5b }
            java.lang.Long r2 = r11.c     // Catch:{ all -> 0x0d5b }
            long r7 = r2.longValue()     // Catch:{ all -> 0x0d5b }
            long r5 = r5 - r7
            long r5 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x0d5b }
            r7 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x06b6
            boolean r2 = r1.a(r12, r11)     // Catch:{ all -> 0x0d5b }
            if (r2 == 0) goto L_0x06b6
            goto L_0x067a
        L_0x06b6:
            r2 = r11
            goto L_0x06ba
        L_0x06b8:
            r2 = r30
        L_0x06ba:
            if (r29 == 0) goto L_0x070f
            if (r31 != 0) goto L_0x070f
            java.lang.String r5 = r11.b     // Catch:{ all -> 0x0d5b }
            boolean r5 = r13.equals(r5)     // Catch:{ all -> 0x0d5b }
            if (r5 == 0) goto L_0x070f
            ekh[] r5 = r11.a     // Catch:{ all -> 0x0d5b }
            if (r5 == 0) goto L_0x06fa
            ekh[] r5 = r11.a     // Catch:{ all -> 0x0d5b }
            int r5 = r5.length     // Catch:{ all -> 0x0d5b }
            if (r5 != 0) goto L_0x06d0
            goto L_0x06fa
        L_0x06d0:
            r43.f()     // Catch:{ all -> 0x0d5b }
            java.lang.Object r4 = defpackage.evi.b(r11, r4)     // Catch:{ all -> 0x0d5b }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x0d5b }
            if (r4 != 0) goto L_0x06f1
            ery r4 = r1.b     // Catch:{ all -> 0x0d5b }
            eqw r4 = r4.q()     // Catch:{ all -> 0x0d5b }
            eqy r4 = r4.f     // Catch:{ all -> 0x0d5b }
            java.lang.String r5 = "Engagement event does not include duration. appId"
            ekj r6 = r3.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r6 = r6.o     // Catch:{ all -> 0x0d5b }
            java.lang.Object r6 = defpackage.eqw.a(r6)     // Catch:{ all -> 0x0d5b }
            r4.a(r5, r6)     // Catch:{ all -> 0x0d5b }
            goto L_0x070f
        L_0x06f1:
            long r4 = r4.longValue()     // Catch:{ all -> 0x0d5b }
            long r14 = r27 + r4
            r5 = r25
            goto L_0x0713
        L_0x06fa:
            ery r4 = r1.b     // Catch:{ all -> 0x0d5b }
            eqw r4 = r4.q()     // Catch:{ all -> 0x0d5b }
            eqy r4 = r4.f     // Catch:{ all -> 0x0d5b }
            java.lang.String r5 = "Engagement event does not contain any parameters. appId"
            ekj r6 = r3.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r6 = r6.o     // Catch:{ all -> 0x0d5b }
            java.lang.Object r6 = defpackage.eqw.a(r6)     // Catch:{ all -> 0x0d5b }
            r4.a(r5, r6)     // Catch:{ all -> 0x0d5b }
        L_0x070f:
            r5 = r25
            r14 = r27
        L_0x0713:
            ekg[] r4 = r5.b     // Catch:{ all -> 0x0d5b }
            int r6 = r24 + 1
            r4[r24] = r11     // Catch:{ all -> 0x0d5b }
            r8 = r12
            r13 = r18
            r12 = r6
        L_0x071d:
            int r10 = r22 + 1
            r9 = r2
            r2 = r21
            r6 = r29
            r7 = r31
            r4 = 0
            goto L_0x02a2
        L_0x0729:
            r21 = r2
            r29 = r6
            r31 = r7
            r24 = r12
            r27 = r14
            if (r31 == 0) goto L_0x0782
            r2 = 0
        L_0x0736:
            if (r2 >= r12) goto L_0x0782
            ekg[] r6 = r5.b     // Catch:{ all -> 0x0d5b }
            r6 = r6[r2]     // Catch:{ all -> 0x0d5b }
            java.lang.String r7 = r6.b     // Catch:{ all -> 0x0d5b }
            boolean r7 = r13.equals(r7)     // Catch:{ all -> 0x0d5b }
            if (r7 == 0) goto L_0x0761
            r43.f()     // Catch:{ all -> 0x0d5b }
            java.lang.String r7 = "_fr"
            ekh r7 = defpackage.evi.a(r6, r7)     // Catch:{ all -> 0x0d5b }
            if (r7 == 0) goto L_0x0761
            ekg[] r6 = r5.b     // Catch:{ all -> 0x0d5b }
            int r7 = r2 + 1
            ekg[] r8 = r5.b     // Catch:{ all -> 0x0d5b }
            int r9 = r12 - r2
            r10 = 1
            int r9 = r9 - r10
            java.lang.System.arraycopy(r6, r7, r8, r2, r9)     // Catch:{ all -> 0x0d5b }
            int r12 = r12 + -1
            int r2 = r2 + -1
            goto L_0x077f
        L_0x0761:
            if (r29 == 0) goto L_0x077f
            r43.f()     // Catch:{ all -> 0x0d5b }
            ekh r6 = defpackage.evi.a(r6, r4)     // Catch:{ all -> 0x0d5b }
            if (r6 == 0) goto L_0x077f
            java.lang.Long r6 = r6.c     // Catch:{ all -> 0x0d5b }
            if (r6 == 0) goto L_0x077f
            long r7 = r6.longValue()     // Catch:{ all -> 0x0d5b }
            r9 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 <= 0) goto L_0x077f
            long r6 = r6.longValue()     // Catch:{ all -> 0x0d5b }
            long r14 = r14 + r6
        L_0x077f:
            r6 = 1
            int r2 = r2 + r6
            goto L_0x0736
        L_0x0782:
            java.util.List<ekg> r2 = r3.c     // Catch:{ all -> 0x0d5b }
            int r2 = r2.size()     // Catch:{ all -> 0x0d5b }
            if (r12 >= r2) goto L_0x0794
            ekg[] r2 = r5.b     // Catch:{ all -> 0x0d5b }
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r12)     // Catch:{ all -> 0x0d5b }
            ekg[] r2 = (defpackage.ekg[]) r2     // Catch:{ all -> 0x0d5b }
            r5.b = r2     // Catch:{ all -> 0x0d5b }
        L_0x0794:
            if (r29 == 0) goto L_0x085d
            evz r2 = r43.d()     // Catch:{ all -> 0x0d5b }
            java.lang.String r4 = r5.o     // Catch:{ all -> 0x0d5b }
            r6 = r21
            evl r2 = r2.c(r4, r6)     // Catch:{ all -> 0x0d5b }
            if (r2 == 0) goto L_0x07cf
            java.lang.Object r4 = r2.e     // Catch:{ all -> 0x0d5b }
            if (r4 != 0) goto L_0x07a9
            goto L_0x07cf
        L_0x07a9:
            evl r4 = new evl     // Catch:{ all -> 0x0d5b }
            java.lang.String r8 = r5.o     // Catch:{ all -> 0x0d5b }
            java.lang.String r9 = "auto"
            java.lang.String r10 = "_lte"
            ery r7 = r1.b     // Catch:{ all -> 0x0d5b }
            bzg r7 = r7.l()     // Catch:{ all -> 0x0d5b }
            long r11 = r7.a()     // Catch:{ all -> 0x0d5b }
            java.lang.Object r2 = r2.e     // Catch:{ all -> 0x0d5b }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ all -> 0x0d5b }
            long r21 = r2.longValue()     // Catch:{ all -> 0x0d5b }
            long r21 = r21 + r14
            java.lang.Long r13 = java.lang.Long.valueOf(r21)     // Catch:{ all -> 0x0d5b }
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ all -> 0x0d5b }
            r2 = r4
            goto L_0x07ec
        L_0x07cf:
            evl r2 = new evl     // Catch:{ all -> 0x0d5b }
            java.lang.String r4 = r5.o     // Catch:{ all -> 0x0d5b }
            java.lang.String r26 = "auto"
            java.lang.String r27 = "_lte"
            ery r7 = r1.b     // Catch:{ all -> 0x0d5b }
            bzg r7 = r7.l()     // Catch:{ all -> 0x0d5b }
            long r28 = r7.a()     // Catch:{ all -> 0x0d5b }
            java.lang.Long r30 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x0d5b }
            r24 = r2
            r25 = r4
            r24.<init>(r25, r26, r27, r28, r30)     // Catch:{ all -> 0x0d5b }
        L_0x07ec:
            ekm r4 = new ekm     // Catch:{ all -> 0x0d5b }
            r4.<init>()     // Catch:{ all -> 0x0d5b }
            r4.b = r6     // Catch:{ all -> 0x0d5b }
            ery r7 = r1.b     // Catch:{ all -> 0x0d5b }
            bzg r7 = r7.l()     // Catch:{ all -> 0x0d5b }
            long r7 = r7.a()     // Catch:{ all -> 0x0d5b }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0d5b }
            r4.a = r7     // Catch:{ all -> 0x0d5b }
            java.lang.Object r7 = r2.e     // Catch:{ all -> 0x0d5b }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0d5b }
            r4.d = r7     // Catch:{ all -> 0x0d5b }
            r7 = 0
        L_0x080a:
            ekm[] r8 = r5.c     // Catch:{ all -> 0x0d5b }
            int r8 = r8.length     // Catch:{ all -> 0x0d5b }
            if (r7 >= r8) goto L_0x0824
            ekm[] r8 = r5.c     // Catch:{ all -> 0x0d5b }
            r8 = r8[r7]     // Catch:{ all -> 0x0d5b }
            java.lang.String r8 = r8.b     // Catch:{ all -> 0x0d5b }
            boolean r8 = r6.equals(r8)     // Catch:{ all -> 0x0d5b }
            if (r8 == 0) goto L_0x0821
            ekm[] r6 = r5.c     // Catch:{ all -> 0x0d5b }
            r6[r7] = r4     // Catch:{ all -> 0x0d5b }
            r6 = 1
            goto L_0x0825
        L_0x0821:
            int r7 = r7 + 1
            goto L_0x080a
        L_0x0824:
            r6 = 0
        L_0x0825:
            if (r6 != 0) goto L_0x0841
            ekm[] r6 = r5.c     // Catch:{ all -> 0x0d5b }
            ekm[] r7 = r5.c     // Catch:{ all -> 0x0d5b }
            int r7 = r7.length     // Catch:{ all -> 0x0d5b }
            r8 = 1
            int r7 = r7 + r8
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)     // Catch:{ all -> 0x0d5b }
            ekm[] r6 = (defpackage.ekm[]) r6     // Catch:{ all -> 0x0d5b }
            r5.c = r6     // Catch:{ all -> 0x0d5b }
            ekm[] r6 = r5.c     // Catch:{ all -> 0x0d5b }
            ekj r7 = r3.a     // Catch:{ all -> 0x0d5b }
            ekm[] r7 = r7.c     // Catch:{ all -> 0x0d5b }
            int r7 = r7.length     // Catch:{ all -> 0x0d5b }
            r8 = 1
            int r7 = r7 - r8
            r6[r7] = r4     // Catch:{ all -> 0x0d5b }
        L_0x0841:
            r6 = 0
            int r4 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x085d
            evz r4 = r43.d()     // Catch:{ all -> 0x0d5b }
            r4.a(r2)     // Catch:{ all -> 0x0d5b }
            ery r4 = r1.b     // Catch:{ all -> 0x0d5b }
            eqw r4 = r4.q()     // Catch:{ all -> 0x0d5b }
            eqy r4 = r4.j     // Catch:{ all -> 0x0d5b }
            java.lang.String r6 = "Updated lifetime engagement user property with value. Value"
            java.lang.Object r2 = r2.e     // Catch:{ all -> 0x0d5b }
            r4.a(r6, r2)     // Catch:{ all -> 0x0d5b }
        L_0x085d:
            java.lang.String r2 = r5.o     // Catch:{ all -> 0x0d5b }
            ekm[] r4 = r5.c     // Catch:{ all -> 0x0d5b }
            ekg[] r6 = r5.b     // Catch:{ all -> 0x0d5b }
            defpackage.bwx.a(r2)     // Catch:{ all -> 0x0d5b }
            evs r7 = r43.e()     // Catch:{ all -> 0x0d5b }
            eke[] r2 = r7.a(r2, r6, r4)     // Catch:{ all -> 0x0d5b }
            r5.A = r2     // Catch:{ all -> 0x0d5b }
            ery r2 = r1.b     // Catch:{ all -> 0x0d5b }
            evw r2 = r2.e     // Catch:{ all -> 0x0d5b }
            ekj r4 = r3.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r4 = r4.o     // Catch:{ all -> 0x0d5b }
            java.lang.String r6 = "1"
            evy r2 = r2.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r7 = "measurement.event_sampling_enabled"
            java.lang.String r2 = r2.a(r4, r7)     // Catch:{ all -> 0x0d5b }
            boolean r2 = r6.equals(r2)     // Catch:{ all -> 0x0d5b }
            if (r2 == 0) goto L_0x0b77
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0d3a }
            r2.<init>()     // Catch:{ all -> 0x0d3a }
            ekg[] r4 = r5.b     // Catch:{ all -> 0x0d3a }
            int r4 = r4.length     // Catch:{ all -> 0x0d3a }
            ekg[] r4 = new defpackage.ekg[r4]     // Catch:{ all -> 0x0d3a }
            ery r6 = r1.b     // Catch:{ all -> 0x0d3a }
            evm r6 = r6.e()     // Catch:{ all -> 0x0d3a }
            java.security.SecureRandom r6 = r6.g()     // Catch:{ all -> 0x0d3a }
            ekg[] r7 = r5.b     // Catch:{ all -> 0x0d3a }
            int r8 = r7.length     // Catch:{ all -> 0x0d3a }
            r9 = 0
            r10 = 0
        L_0x08a1:
            if (r9 >= r8) goto L_0x0b46
            r11 = r7[r9]     // Catch:{ all -> 0x0d3a }
            java.lang.String r12 = r11.b     // Catch:{ all -> 0x0d3a }
            java.lang.String r13 = "_ep"
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x0d3a }
            if (r12 == 0) goto L_0x092a
            r43.f()     // Catch:{ all -> 0x0d5b }
            java.lang.String r12 = "_en"
            java.lang.Object r12 = defpackage.evi.b(r11, r12)     // Catch:{ all -> 0x0d5b }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x0d5b }
            java.lang.Object r13 = r2.get(r12)     // Catch:{ all -> 0x0d5b }
            eqg r13 = (defpackage.eqg) r13     // Catch:{ all -> 0x0d5b }
            if (r13 != 0) goto L_0x08d1
            evz r13 = r43.d()     // Catch:{ all -> 0x0d5b }
            ekj r14 = r3.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r14 = r14.o     // Catch:{ all -> 0x0d5b }
            eqg r13 = r13.a(r14, r12)     // Catch:{ all -> 0x0d5b }
            r2.put(r12, r13)     // Catch:{ all -> 0x0d5b }
        L_0x08d1:
            java.lang.Long r12 = r13.h     // Catch:{ all -> 0x0d5b }
            if (r12 != 0) goto L_0x091d
            java.lang.Long r12 = r13.i     // Catch:{ all -> 0x0d5b }
            long r14 = r12.longValue()     // Catch:{ all -> 0x0d5b }
            int r12 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r12 <= 0) goto L_0x08ee
            r43.f()     // Catch:{ all -> 0x0d5b }
            ekh[] r12 = r11.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r14 = "_sr"
            java.lang.Long r15 = r13.i     // Catch:{ all -> 0x0d5b }
            ekh[] r12 = defpackage.evi.a(r12, r14, r15)     // Catch:{ all -> 0x0d5b }
            r11.a = r12     // Catch:{ all -> 0x0d5b }
        L_0x08ee:
            java.lang.Boolean r12 = r13.j     // Catch:{ all -> 0x0d5b }
            if (r12 == 0) goto L_0x090b
            java.lang.Boolean r12 = r13.j     // Catch:{ all -> 0x0d5b }
            boolean r12 = r12.booleanValue()     // Catch:{ all -> 0x0d5b }
            if (r12 == 0) goto L_0x090b
            r43.f()     // Catch:{ all -> 0x0d5b }
            ekh[] r12 = r11.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r13 = "_efs"
            java.lang.Long r14 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0d5b }
            ekh[] r12 = defpackage.evi.a(r12, r13, r14)     // Catch:{ all -> 0x0d5b }
            r11.a = r12     // Catch:{ all -> 0x0d5b }
        L_0x090b:
            int r12 = r10 + 1
            r4[r10] = r11     // Catch:{ all -> 0x0d5b }
            r25 = r5
            r24 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            r10 = r12
            r12 = r2
            goto L_0x0b37
        L_0x091d:
            r12 = r2
            r25 = r5
            r24 = r6
            r21 = r7
            r22 = r8
            r23 = r9
            goto L_0x0b37
        L_0x092a:
            ert r12 = r43.n()     // Catch:{ all -> 0x0d3a }
            ekj r13 = r3.a     // Catch:{ all -> 0x0d3a }
            java.lang.String r13 = r13.o     // Catch:{ all -> 0x0d3a }
            long r12 = r12.e(r13)     // Catch:{ all -> 0x0d3a }
            ery r14 = r1.b     // Catch:{ all -> 0x0d3a }
            r14.e()     // Catch:{ all -> 0x0d3a }
            java.lang.Long r14 = r11.c     // Catch:{ all -> 0x0d3a }
            long r14 = r14.longValue()     // Catch:{ all -> 0x0d3a }
            long r14 = defpackage.evm.a(r14, r12)     // Catch:{ all -> 0x0d3a }
            r21 = r7
            java.lang.String r7 = "_dbg"
            r22 = r8
            java.lang.Long r8 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0d3a }
            boolean r23 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x0d3a }
            if (r23 != 0) goto L_0x0984
            if (r8 != 0) goto L_0x0958
            goto L_0x0984
        L_0x0958:
            r25 = r5
            ekh[] r5 = r11.a     // Catch:{ all -> 0x0d5b }
            r23 = r9
            int r9 = r5.length     // Catch:{ all -> 0x0d5b }
            r26 = r12
            r12 = 0
        L_0x0962:
            if (r12 >= r9) goto L_0x098a
            r13 = r5[r12]     // Catch:{ all -> 0x0d5b }
            r24 = r5
            java.lang.String r5 = r13.a     // Catch:{ all -> 0x0d5b }
            boolean r5 = r7.equals(r5)     // Catch:{ all -> 0x0d5b }
            if (r5 == 0) goto L_0x097f
            boolean r5 = r8 instanceof java.lang.Long     // Catch:{ all -> 0x0d5b }
            if (r5 == 0) goto L_0x098a
            java.lang.Long r5 = r13.c     // Catch:{ all -> 0x0d5b }
            boolean r5 = r8.equals(r5)     // Catch:{ all -> 0x0d5b }
            if (r5 != 0) goto L_0x097d
            goto L_0x098a
        L_0x097d:
            r5 = 1
            goto L_0x098b
        L_0x097f:
            int r12 = r12 + 1
            r5 = r24
            goto L_0x0962
        L_0x0984:
            r25 = r5
            r23 = r9
            r26 = r12
        L_0x098a:
            r5 = 0
        L_0x098b:
            if (r5 != 0) goto L_0x099c
            ert r5 = r43.n()     // Catch:{ all -> 0x0d5b }
            ekj r7 = r3.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r7 = r7.o     // Catch:{ all -> 0x0d5b }
            java.lang.String r8 = r11.b     // Catch:{ all -> 0x0d5b }
            int r13 = r5.d(r7, r8)     // Catch:{ all -> 0x0d5b }
            goto L_0x099d
        L_0x099c:
            r13 = 1
        L_0x099d:
            if (r13 > 0) goto L_0x09bc
            ery r5 = r1.b     // Catch:{ all -> 0x0d5b }
            eqw r5 = r5.q()     // Catch:{ all -> 0x0d5b }
            eqy r5 = r5.f     // Catch:{ all -> 0x0d5b }
            java.lang.String r7 = "Sample rate must be positive. event, rate"
            java.lang.String r8 = r11.b     // Catch:{ all -> 0x0d5b }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0d5b }
            r5.a(r7, r8, r9)     // Catch:{ all -> 0x0d5b }
            int r5 = r10 + 1
            r4[r10] = r11     // Catch:{ all -> 0x0d5b }
            r12 = r2
            r10 = r5
            r24 = r6
            goto L_0x0b37
        L_0x09bc:
            java.lang.String r5 = r11.b     // Catch:{ all -> 0x0d3a }
            java.lang.Object r5 = r2.get(r5)     // Catch:{ all -> 0x0d3a }
            eqg r5 = (defpackage.eqg) r5     // Catch:{ all -> 0x0d3a }
            if (r5 != 0) goto L_0x0a0e
            evz r5 = r43.d()     // Catch:{ all -> 0x0d5b }
            ekj r7 = r3.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r7 = r7.o     // Catch:{ all -> 0x0d5b }
            java.lang.String r8 = r11.b     // Catch:{ all -> 0x0d5b }
            eqg r5 = r5.a(r7, r8)     // Catch:{ all -> 0x0d5b }
            if (r5 != 0) goto L_0x0a0e
            ery r5 = r1.b     // Catch:{ all -> 0x0d5b }
            eqw r5 = r5.q()     // Catch:{ all -> 0x0d5b }
            eqy r5 = r5.f     // Catch:{ all -> 0x0d5b }
            java.lang.String r7 = "Event being bundled has no eventAggregate. appId, eventName"
            ekj r8 = r3.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r8 = r8.o     // Catch:{ all -> 0x0d5b }
            java.lang.String r9 = r11.b     // Catch:{ all -> 0x0d5b }
            r5.a(r7, r8, r9)     // Catch:{ all -> 0x0d5b }
            eqg r5 = new eqg     // Catch:{ all -> 0x0d5b }
            ekj r7 = r3.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r7 = r7.o     // Catch:{ all -> 0x0d5b }
            java.lang.String r8 = r11.b     // Catch:{ all -> 0x0d5b }
            r31 = 1
            r33 = 1
            java.lang.Long r9 = r11.c     // Catch:{ all -> 0x0d5b }
            long r35 = r9.longValue()     // Catch:{ all -> 0x0d5b }
            r37 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r28 = r5
            r29 = r7
            r30 = r8
            r28.<init>(r29, r30, r31, r33, r35, r37, r39, r40, r41, r42)     // Catch:{ all -> 0x0d5b }
        L_0x0a0e:
            r43.f()     // Catch:{ all -> 0x0d3a }
            java.lang.String r7 = "_eid"
            java.lang.Object r7 = defpackage.evi.b(r11, r7)     // Catch:{ all -> 0x0d3a }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0d3a }
            if (r7 == 0) goto L_0x0a1d
            r8 = 1
            goto L_0x0a1e
        L_0x0a1d:
            r8 = 0
        L_0x0a1e:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x0d3a }
            r9 = 1
            if (r13 != r9) goto L_0x0a4b
            int r7 = r10 + 1
            r4[r10] = r11     // Catch:{ all -> 0x0d5b }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x0d5b }
            if (r8 == 0) goto L_0x0a45
            java.lang.Long r8 = r5.h     // Catch:{ all -> 0x0d5b }
            if (r8 != 0) goto L_0x0a3b
            java.lang.Long r8 = r5.i     // Catch:{ all -> 0x0d5b }
            if (r8 != 0) goto L_0x0a3b
            java.lang.Boolean r8 = r5.j     // Catch:{ all -> 0x0d5b }
            if (r8 == 0) goto L_0x0a45
        L_0x0a3b:
            r8 = 0
            eqg r5 = r5.a(r8, r8, r8)     // Catch:{ all -> 0x0d5b }
            java.lang.String r8 = r11.b     // Catch:{ all -> 0x0d5b }
            r2.put(r8, r5)     // Catch:{ all -> 0x0d5b }
        L_0x0a45:
            r12 = r2
            r24 = r6
            r10 = r7
            goto L_0x0b37
        L_0x0a4b:
            int r9 = r6.nextInt(r13)     // Catch:{ all -> 0x0d3a }
            if (r9 != 0) goto L_0x0a8b
            r43.f()     // Catch:{ all -> 0x0d5b }
            ekh[] r7 = r11.a     // Catch:{ all -> 0x0d5b }
            java.lang.String r9 = "_sr"
            long r12 = (long) r13     // Catch:{ all -> 0x0d5b }
            r24 = r6
            java.lang.Long r6 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0d5b }
            ekh[] r6 = defpackage.evi.a(r7, r9, r6)     // Catch:{ all -> 0x0d5b }
            r11.a = r6     // Catch:{ all -> 0x0d5b }
            int r6 = r10 + 1
            r4[r10] = r11     // Catch:{ all -> 0x0d5b }
            boolean r7 = r8.booleanValue()     // Catch:{ all -> 0x0d5b }
            if (r7 == 0) goto L_0x0a78
            java.lang.Long r7 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0d5b }
            r8 = 0
            eqg r5 = r5.a(r8, r7, r8)     // Catch:{ all -> 0x0d5b }
        L_0x0a78:
            java.lang.String r7 = r11.b     // Catch:{ all -> 0x0d5b }
            java.lang.Long r8 = r11.c     // Catch:{ all -> 0x0d5b }
            long r8 = r8.longValue()     // Catch:{ all -> 0x0d5b }
            eqg r5 = r5.a(r8, r14)     // Catch:{ all -> 0x0d5b }
            r2.put(r7, r5)     // Catch:{ all -> 0x0d5b }
            r12 = r2
            r10 = r6
            goto L_0x0b37
        L_0x0a8b:
            r24 = r6
            ery r6 = r1.b     // Catch:{ all -> 0x0d3a }
            evw r6 = r6.e     // Catch:{ all -> 0x0d3a }
            ekj r9 = r3.a     // Catch:{ all -> 0x0d3a }
            java.lang.String r9 = r9.o     // Catch:{ all -> 0x0d3a }
            eqm$a<java.lang.Boolean> r12 = defpackage.eqm.aa     // Catch:{ all -> 0x0d3a }
            boolean r6 = r6.c(r9, r12)     // Catch:{ all -> 0x0d3a }
            if (r6 == 0) goto L_0x0ac5
            java.lang.Long r6 = r5.g     // Catch:{ all -> 0x0d3a }
            if (r6 == 0) goto L_0x0aaa
            java.lang.Long r6 = r5.g     // Catch:{ all -> 0x0d5b }
            long r26 = r6.longValue()     // Catch:{ all -> 0x0d5b }
            r12 = r2
            r9 = r7
            goto L_0x0abd
        L_0x0aaa:
            ery r6 = r1.b     // Catch:{ all -> 0x0d3a }
            r6.e()     // Catch:{ all -> 0x0d3a }
            java.lang.Long r6 = r11.d     // Catch:{ all -> 0x0d3a }
            r9 = r7
            long r6 = r6.longValue()     // Catch:{ all -> 0x0d3a }
            r12 = r2
            r1 = r26
            long r26 = defpackage.evm.a(r6, r1)     // Catch:{ all -> 0x0d3a }
        L_0x0abd:
            int r1 = (r26 > r14 ? 1 : (r26 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x0ac3
        L_0x0ac1:
            r1 = 1
            goto L_0x0adc
        L_0x0ac3:
            r1 = 0
            goto L_0x0adc
        L_0x0ac5:
            r12 = r2
            r9 = r7
            long r1 = r5.f     // Catch:{ all -> 0x0d3a }
            java.lang.Long r6 = r11.c     // Catch:{ all -> 0x0d3a }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0d3a }
            long r6 = r6 - r1
            long r1 = java.lang.Math.abs(r6)     // Catch:{ all -> 0x0d3a }
            r6 = 86400000(0x5265c00, double:4.2687272E-316)
            int r26 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r26 < 0) goto L_0x0ac3
            goto L_0x0ac1
        L_0x0adc:
            if (r1 == 0) goto L_0x0b27
            r43.f()     // Catch:{ all -> 0x0d3a }
            ekh[] r1 = r11.a     // Catch:{ all -> 0x0d3a }
            java.lang.String r2 = "_efs"
            java.lang.Long r6 = java.lang.Long.valueOf(r19)     // Catch:{ all -> 0x0d3a }
            ekh[] r1 = defpackage.evi.a(r1, r2, r6)     // Catch:{ all -> 0x0d3a }
            r11.a = r1     // Catch:{ all -> 0x0d3a }
            r43.f()     // Catch:{ all -> 0x0d3a }
            ekh[] r1 = r11.a     // Catch:{ all -> 0x0d3a }
            java.lang.String r2 = "_sr"
            long r6 = (long) r13     // Catch:{ all -> 0x0d3a }
            java.lang.Long r9 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d3a }
            ekh[] r1 = defpackage.evi.a(r1, r2, r9)     // Catch:{ all -> 0x0d3a }
            r11.a = r1     // Catch:{ all -> 0x0d3a }
            int r1 = r10 + 1
            r4[r10] = r11     // Catch:{ all -> 0x0d3a }
            boolean r2 = r8.booleanValue()     // Catch:{ all -> 0x0d3a }
            if (r2 == 0) goto L_0x0b16
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d3a }
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0d3a }
            r7 = 0
            eqg r5 = r5.a(r7, r2, r6)     // Catch:{ all -> 0x0d3a }
        L_0x0b16:
            java.lang.String r2 = r11.b     // Catch:{ all -> 0x0d3a }
            java.lang.Long r6 = r11.c     // Catch:{ all -> 0x0d3a }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0d3a }
            eqg r5 = r5.a(r6, r14)     // Catch:{ all -> 0x0d3a }
            r12.put(r2, r5)     // Catch:{ all -> 0x0d3a }
            r10 = r1
            goto L_0x0b37
        L_0x0b27:
            boolean r1 = r8.booleanValue()     // Catch:{ all -> 0x0d3a }
            if (r1 == 0) goto L_0x0b37
            java.lang.String r1 = r11.b     // Catch:{ all -> 0x0d3a }
            r2 = 0
            eqg r5 = r5.a(r9, r2, r2)     // Catch:{ all -> 0x0d3a }
            r12.put(r1, r5)     // Catch:{ all -> 0x0d3a }
        L_0x0b37:
            int r9 = r23 + 1
            r1 = r43
            r2 = r12
            r7 = r21
            r8 = r22
            r6 = r24
            r5 = r25
            goto L_0x08a1
        L_0x0b46:
            r12 = r2
            r1 = r5
            ekg[] r2 = r1.b     // Catch:{ all -> 0x0d3a }
            int r2 = r2.length     // Catch:{ all -> 0x0d3a }
            if (r10 >= r2) goto L_0x0b55
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r4, r10)     // Catch:{ all -> 0x0d3a }
            ekg[] r2 = (defpackage.ekg[]) r2     // Catch:{ all -> 0x0d3a }
            r1.b = r2     // Catch:{ all -> 0x0d3a }
        L_0x0b55:
            java.util.Set r2 = r12.entrySet()     // Catch:{ all -> 0x0d3a }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0d3a }
        L_0x0b5d:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0d3a }
            if (r4 == 0) goto L_0x0b78
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0d3a }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x0d3a }
            evz r5 = r43.d()     // Catch:{ all -> 0x0d3a }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0d3a }
            eqg r4 = (defpackage.eqg) r4     // Catch:{ all -> 0x0d3a }
            r5.a(r4)     // Catch:{ all -> 0x0d3a }
            goto L_0x0b5d
        L_0x0b77:
            r1 = r5
        L_0x0b78:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0d3a }
            r1.e = r2     // Catch:{ all -> 0x0d3a }
            r4 = -9223372036854775808
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0d3a }
            r1.f = r2     // Catch:{ all -> 0x0d3a }
            r2 = 0
        L_0x0b8c:
            ekg[] r4 = r1.b     // Catch:{ all -> 0x0d3a }
            int r4 = r4.length     // Catch:{ all -> 0x0d3a }
            if (r2 >= r4) goto L_0x0bc0
            ekg[] r4 = r1.b     // Catch:{ all -> 0x0d3a }
            r4 = r4[r2]     // Catch:{ all -> 0x0d3a }
            java.lang.Long r5 = r4.c     // Catch:{ all -> 0x0d3a }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0d3a }
            java.lang.Long r7 = r1.e     // Catch:{ all -> 0x0d3a }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0d3a }
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0ba9
            java.lang.Long r5 = r4.c     // Catch:{ all -> 0x0d3a }
            r1.e = r5     // Catch:{ all -> 0x0d3a }
        L_0x0ba9:
            java.lang.Long r5 = r4.c     // Catch:{ all -> 0x0d3a }
            long r5 = r5.longValue()     // Catch:{ all -> 0x0d3a }
            java.lang.Long r7 = r1.f     // Catch:{ all -> 0x0d3a }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0d3a }
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0bbd
            java.lang.Long r4 = r4.c     // Catch:{ all -> 0x0d3a }
            r1.f = r4     // Catch:{ all -> 0x0d3a }
        L_0x0bbd:
            int r2 = r2 + 1
            goto L_0x0b8c
        L_0x0bc0:
            ekj r2 = r3.a     // Catch:{ all -> 0x0d3a }
            java.lang.String r2 = r2.o     // Catch:{ all -> 0x0d3a }
            evz r4 = r43.d()     // Catch:{ all -> 0x0d3a }
            evp r4 = r4.b(r2)     // Catch:{ all -> 0x0d3a }
            if (r4 != 0) goto L_0x0be6
            r5 = r43
            ery r4 = r5.b     // Catch:{ all -> 0x0d59 }
            eqw r4 = r4.q()     // Catch:{ all -> 0x0d59 }
            eqy r4 = r4.c     // Catch:{ all -> 0x0d59 }
            java.lang.String r6 = "Bundling raw events w/o app info. appId"
            ekj r7 = r3.a     // Catch:{ all -> 0x0d59 }
            java.lang.String r7 = r7.o     // Catch:{ all -> 0x0d59 }
            java.lang.Object r7 = defpackage.eqw.a(r7)     // Catch:{ all -> 0x0d59 }
            r4.a(r6, r7)     // Catch:{ all -> 0x0d59 }
            goto L_0x0c4f
        L_0x0be6:
            r5 = r43
            ekg[] r6 = r1.b     // Catch:{ all -> 0x0d59 }
            int r6 = r6.length     // Catch:{ all -> 0x0d59 }
            if (r6 <= 0) goto L_0x0c4f
            long r6 = r4.h()     // Catch:{ all -> 0x0d59 }
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x0bfc
            java.lang.Long r12 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d59 }
            goto L_0x0bfd
        L_0x0bfc:
            r12 = 0
        L_0x0bfd:
            r1.h = r12     // Catch:{ all -> 0x0d59 }
            long r8 = r4.g()     // Catch:{ all -> 0x0d59 }
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 != 0) goto L_0x0c0a
            goto L_0x0c0b
        L_0x0c0a:
            r6 = r8
        L_0x0c0b:
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L_0x0c14
            java.lang.Long r12 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d59 }
            goto L_0x0c15
        L_0x0c14:
            r12 = 0
        L_0x0c15:
            r1.g = r12     // Catch:{ all -> 0x0d59 }
            r4.r()     // Catch:{ all -> 0x0d59 }
            long r6 = r4.o()     // Catch:{ all -> 0x0d59 }
            int r7 = (int) r6     // Catch:{ all -> 0x0d59 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0d59 }
            r1.w = r6     // Catch:{ all -> 0x0d59 }
            java.lang.Long r6 = r1.e     // Catch:{ all -> 0x0d59 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0d59 }
            r4.a(r6)     // Catch:{ all -> 0x0d59 }
            java.lang.Long r6 = r1.f     // Catch:{ all -> 0x0d59 }
            long r6 = r6.longValue()     // Catch:{ all -> 0x0d59 }
            r4.b(r6)     // Catch:{ all -> 0x0d59 }
            ery r6 = r4.a     // Catch:{ all -> 0x0d59 }
            eru r6 = r6.p()     // Catch:{ all -> 0x0d59 }
            r6.c()     // Catch:{ all -> 0x0d59 }
            java.lang.String r6 = r4.h     // Catch:{ all -> 0x0d59 }
            r7 = 0
            r4.h(r7)     // Catch:{ all -> 0x0d59 }
            r1.x = r6     // Catch:{ all -> 0x0d59 }
            evz r6 = r43.d()     // Catch:{ all -> 0x0d59 }
            r6.a(r4)     // Catch:{ all -> 0x0d59 }
        L_0x0c4f:
            ekg[] r4 = r1.b     // Catch:{ all -> 0x0d59 }
            int r4 = r4.length     // Catch:{ all -> 0x0d59 }
            if (r4 <= 0) goto L_0x0c9d
            ert r4 = r43.n()     // Catch:{ all -> 0x0d59 }
            ekj r6 = r3.a     // Catch:{ all -> 0x0d59 }
            java.lang.String r6 = r6.o     // Catch:{ all -> 0x0d59 }
            ekc r4 = r4.a(r6)     // Catch:{ all -> 0x0d59 }
            if (r4 == 0) goto L_0x0c6c
            java.lang.Long r6 = r4.a     // Catch:{ all -> 0x0d59 }
            if (r6 != 0) goto L_0x0c67
            goto L_0x0c6c
        L_0x0c67:
            java.lang.Long r4 = r4.a     // Catch:{ all -> 0x0d59 }
            r1.E = r4     // Catch:{ all -> 0x0d59 }
            goto L_0x0c94
        L_0x0c6c:
            ekj r4 = r3.a     // Catch:{ all -> 0x0d59 }
            java.lang.String r4 = r4.y     // Catch:{ all -> 0x0d59 }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0d59 }
            if (r4 == 0) goto L_0x0c7f
            r6 = -1
            java.lang.Long r4 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0d59 }
            r1.E = r4     // Catch:{ all -> 0x0d59 }
            goto L_0x0c94
        L_0x0c7f:
            ery r4 = r5.b     // Catch:{ all -> 0x0d59 }
            eqw r4 = r4.q()     // Catch:{ all -> 0x0d59 }
            eqy r4 = r4.f     // Catch:{ all -> 0x0d59 }
            java.lang.String r6 = "Did not find measurement config or missing version info. appId"
            ekj r7 = r3.a     // Catch:{ all -> 0x0d59 }
            java.lang.String r7 = r7.o     // Catch:{ all -> 0x0d59 }
            java.lang.Object r7 = defpackage.eqw.a(r7)     // Catch:{ all -> 0x0d59 }
            r4.a(r6, r7)     // Catch:{ all -> 0x0d59 }
        L_0x0c94:
            evz r4 = r43.d()     // Catch:{ all -> 0x0d59 }
            r13 = r18
            r4.a(r1, r13)     // Catch:{ all -> 0x0d59 }
        L_0x0c9d:
            evz r1 = r43.d()     // Catch:{ all -> 0x0d59 }
            java.util.List<java.lang.Long> r3 = r3.b     // Catch:{ all -> 0x0d59 }
            defpackage.bwx.a(r3)     // Catch:{ all -> 0x0d59 }
            r1.c()     // Catch:{ all -> 0x0d59 }
            r1.j()     // Catch:{ all -> 0x0d59 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0d59 }
            java.lang.String r6 = "rowid in ("
            r4.<init>(r6)     // Catch:{ all -> 0x0d59 }
            r6 = 0
        L_0x0cb4:
            int r7 = r3.size()     // Catch:{ all -> 0x0d59 }
            if (r6 >= r7) goto L_0x0cd1
            if (r6 == 0) goto L_0x0cc1
            java.lang.String r7 = ","
            r4.append(r7)     // Catch:{ all -> 0x0d59 }
        L_0x0cc1:
            java.lang.Object r7 = r3.get(r6)     // Catch:{ all -> 0x0d59 }
            java.lang.Long r7 = (java.lang.Long) r7     // Catch:{ all -> 0x0d59 }
            long r7 = r7.longValue()     // Catch:{ all -> 0x0d59 }
            r4.append(r7)     // Catch:{ all -> 0x0d59 }
            int r6 = r6 + 1
            goto L_0x0cb4
        L_0x0cd1:
            java.lang.String r6 = ")"
            r4.append(r6)     // Catch:{ all -> 0x0d59 }
            android.database.sqlite.SQLiteDatabase r6 = r1.w()     // Catch:{ all -> 0x0d59 }
            java.lang.String r7 = "raw_events"
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0d59 }
            r8 = 0
            int r4 = r6.delete(r7, r4, r8)     // Catch:{ all -> 0x0d59 }
            int r6 = r3.size()     // Catch:{ all -> 0x0d59 }
            if (r4 == r6) goto L_0x0d02
            eqw r1 = r1.q()     // Catch:{ all -> 0x0d59 }
            eqy r1 = r1.c     // Catch:{ all -> 0x0d59 }
            java.lang.String r6 = "Deleted fewer rows from raw events table than expected"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0d59 }
            int r3 = r3.size()     // Catch:{ all -> 0x0d59 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0d59 }
            r1.a(r6, r4, r3)     // Catch:{ all -> 0x0d59 }
        L_0x0d02:
            evz r1 = r43.d()     // Catch:{ all -> 0x0d59 }
            android.database.sqlite.SQLiteDatabase r3 = r1.w()     // Catch:{ all -> 0x0d59 }
            java.lang.String r4 = "delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)"
            r6 = 2
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0d19 }
            r7 = 0
            r6[r7] = r2     // Catch:{ SQLiteException -> 0x0d19 }
            r7 = 1
            r6[r7] = r2     // Catch:{ SQLiteException -> 0x0d19 }
            r3.execSQL(r4, r6)     // Catch:{ SQLiteException -> 0x0d19 }
            goto L_0x0d2a
        L_0x0d19:
            r0 = move-exception
            r3 = r0
            eqw r1 = r1.q()     // Catch:{ all -> 0x0d59 }
            eqy r1 = r1.c     // Catch:{ all -> 0x0d59 }
            java.lang.String r4 = "Failed to remove unused event metadata. appId"
            java.lang.Object r2 = defpackage.eqw.a(r2)     // Catch:{ all -> 0x0d59 }
            r1.a(r4, r2, r3)     // Catch:{ all -> 0x0d59 }
        L_0x0d2a:
            evz r1 = r43.d()     // Catch:{ all -> 0x0d59 }
            r1.u()     // Catch:{ all -> 0x0d59 }
            evz r1 = r43.d()
            r1.v()
            r1 = 1
            return r1
        L_0x0d3a:
            r0 = move-exception
            r5 = r43
            goto L_0x0d5d
        L_0x0d3e:
            r5 = r1
            evz r1 = r43.d()     // Catch:{ all -> 0x0d59 }
            r1.u()     // Catch:{ all -> 0x0d59 }
            evz r1 = r43.d()
            r1.v()
            r1 = 0
            return r1
        L_0x0d4f:
            r0 = move-exception
            r5 = r1
            goto L_0x024a
        L_0x0d53:
            if (r9 == 0) goto L_0x0d58
            r9.close()     // Catch:{ all -> 0x0d59 }
        L_0x0d58:
            throw r1     // Catch:{ all -> 0x0d59 }
        L_0x0d59:
            r0 = move-exception
            goto L_0x0d5d
        L_0x0d5b:
            r0 = move-exception
            r5 = r1
        L_0x0d5d:
            r1 = r0
            evz r2 = r43.d()
            r2.v()
            goto L_0x0d67
        L_0x0d66:
            throw r1
        L_0x0d67:
            goto L_0x0d66
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evc.a(long):boolean");
    }

    private final boolean a(ekg ekg, ekg ekg2) {
        Object obj;
        bwx.b("_e".equals(ekg.b));
        f();
        ekh a2 = evi.a(ekg, "_sc");
        String str = null;
        if (a2 == null) {
            obj = null;
        } else {
            obj = a2.b;
        }
        f();
        ekh a3 = evi.a(ekg2, "_pc");
        if (a3 != null) {
            str = a3.b;
        }
        if (str == null || !str.equals(obj)) {
            return false;
        }
        f();
        String str2 = "_et";
        ekh a4 = evi.a(ekg, str2);
        if (a4.c != null && a4.c.longValue() > 0) {
            long longValue = a4.c.longValue();
            f();
            ekh a5 = evi.a(ekg2, str2);
            if (!(a5 == null || a5.c == null || a5.c.longValue() <= 0)) {
                longValue += a5.c.longValue();
            }
            f();
            ekg2.a = evi.a(ekg2.a, str2, (Object) Long.valueOf(longValue));
            f();
            ekg.a = evi.a(ekg.a, "_fr", (Object) Long.valueOf(1));
        }
        return true;
    }

    private static ekh[] a(ekh[] ekhArr, String str) {
        int i2 = 0;
        while (true) {
            if (i2 >= ekhArr.length) {
                i2 = -1;
                break;
            } else if (str.equals(ekhArr[i2].a)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return ekhArr;
        }
        return a(ekhArr, i2);
    }

    private static ekh[] a(ekh[] ekhArr, int i2) {
        ekh[] ekhArr2 = new ekh[(ekhArr.length - 1)];
        if (i2 > 0) {
            System.arraycopy(ekhArr, 0, ekhArr2, 0, i2);
        }
        if (i2 < ekhArr2.length) {
            System.arraycopy(ekhArr, i2 + 1, ekhArr2, i2, ekhArr2.length - i2);
        }
        return ekhArr2;
    }

    private static ekh[] a(ekh[] ekhArr, int i2, String str) {
        int i3 = 0;
        while (true) {
            String str2 = "_err";
            if (i3 >= ekhArr.length) {
                ekh[] ekhArr2 = new ekh[(ekhArr.length + 2)];
                System.arraycopy(ekhArr, 0, ekhArr2, 0, ekhArr.length);
                ekh ekh = new ekh();
                ekh.a = str2;
                ekh.c = Long.valueOf((long) i2);
                ekh ekh2 = new ekh();
                ekh2.a = "_ev";
                ekh2.b = str;
                ekhArr2[ekhArr2.length - 2] = ekh;
                ekhArr2[ekhArr2.length - 1] = ekh2;
                return ekhArr2;
            } else if (str2.equals(ekhArr[i3].a)) {
                return ekhArr;
            } else {
                i3++;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: 0000 */
    public final void a(int i2, Throwable th, byte[] bArr, String str) {
        evz d2;
        g();
        h();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.s = false;
                u();
                throw th2;
            }
        }
        List<Long> list = this.w;
        this.w = null;
        boolean z = true;
        if ((i2 == 200 || i2 == 204) && th == null) {
            try {
                this.b.b().d.a(this.b.l().a());
                this.b.b().e.a(0);
                j();
                this.b.q().k.a("Successful upload. Got network response. code, size", Integer.valueOf(i2), Integer.valueOf(bArr.length));
                d().e();
                try {
                    for (Long l2 : list) {
                        try {
                            d2 = d();
                            long longValue = l2.longValue();
                            d2.c();
                            d2.j();
                            if (d2.w().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                throw new SQLiteException("Deleted fewer rows from queue than expected");
                            }
                        } catch (SQLiteException e2) {
                            d2.q().c.a("Failed to delete a bundle in a queue table", e2);
                            throw e2;
                        } catch (SQLiteException e3) {
                            if (this.x == null || !this.x.contains(l2)) {
                                throw e3;
                            }
                        }
                    }
                    d().u();
                    d().v();
                    this.x = null;
                    if (!c().e() || !t()) {
                        this.y = -1;
                        j();
                    } else {
                        i();
                    }
                    this.q = 0;
                } catch (Throwable th3) {
                    d().v();
                    throw th3;
                }
            } catch (SQLiteException e4) {
                this.b.q().c.a("Database error while trying to delete uploaded bundles", e4);
                this.q = this.b.l().b();
                this.b.q().k.a("Disable upload, time", Long.valueOf(this.q));
            }
        } else {
            this.b.q().k.a("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th);
            this.b.b().e.a(this.b.l().a());
            if (i2 != 503) {
                if (i2 != 429) {
                    z = false;
                }
            }
            if (z) {
                this.b.b().f.a(this.b.l().a());
            }
            if (this.b.e.c(str, eqm.T)) {
                d().a(list);
            }
            j();
        }
        this.s = false;
        u();
    }

    private final boolean t() {
        g();
        h();
        return d().C() || !TextUtils.isEmpty(d().x());
    }

    private final void a(evp evp) {
        Map map;
        g();
        if (!TextUtils.isEmpty(evp.c()) || (evw.u() && !TextUtils.isEmpty(evp.d()))) {
            Builder builder = new Builder();
            String c2 = evp.c();
            if (TextUtils.isEmpty(c2) && evw.u()) {
                c2 = evp.d();
            }
            Builder encodedAuthority = builder.scheme((String) eqm.l.a()).encodedAuthority((String) eqm.m.a());
            String str = "config/app/";
            String valueOf = String.valueOf(c2);
            encodedAuthority.path(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)).appendQueryParameter("app_instance_id", evp.b()).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", "14700");
            String uri = builder.build().toString();
            try {
                URL url = new URL(uri);
                this.b.q().k.a("Fetching remote configuration", evp.a());
                ekc a2 = n().a(evp.a());
                String b2 = n().b(evp.a());
                if (a2 == null || TextUtils.isEmpty(b2)) {
                    map = null;
                } else {
                    dp dpVar = new dp();
                    dpVar.put("If-Modified-Since", b2);
                    map = dpVar;
                }
                this.r = true;
                era c3 = c();
                String a3 = evp.a();
                evf evf = new evf(this);
                c3.c();
                c3.j();
                bwx.a(url);
                bwx.a(evf);
                eru p2 = c3.p();
                erd erd = new erd(c3, a3, url, null, map, evf);
                p2.b((Runnable) erd);
            } catch (MalformedURLException unused) {
                this.b.q().c.a("Failed to parse config URL. Not fetching. appId", eqw.a(evp.a()), uri);
            }
        } else {
            a(evp.a(), 204, null, null, null);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0134 A[Catch:{ all -> 0x0183, all -> 0x018c }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0142 A[Catch:{ all -> 0x0183, all -> 0x018c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r7, int r8, java.lang.Throwable r9, byte[] r10, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r11) {
        /*
            r6 = this;
            r6.g()
            r6.h()
            defpackage.bwx.a(r7)
            r0 = 0
            if (r10 != 0) goto L_0x000e
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x018c }
        L_0x000e:
            ery r1 = r6.b     // Catch:{ all -> 0x018c }
            eqw r1 = r1.q()     // Catch:{ all -> 0x018c }
            eqy r1 = r1.k     // Catch:{ all -> 0x018c }
            java.lang.String r2 = "onConfigFetched. Response size"
            int r3 = r10.length     // Catch:{ all -> 0x018c }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x018c }
            r1.a(r2, r3)     // Catch:{ all -> 0x018c }
            evz r1 = r6.d()     // Catch:{ all -> 0x018c }
            r1.e()     // Catch:{ all -> 0x018c }
            evz r1 = r6.d()     // Catch:{ all -> 0x0183 }
            evp r1 = r1.b(r7)     // Catch:{ all -> 0x0183 }
            r2 = 200(0xc8, float:2.8E-43)
            r3 = 304(0x130, float:4.26E-43)
            r4 = 1
            if (r8 == r2) goto L_0x003c
            r2 = 204(0xcc, float:2.86E-43)
            if (r8 == r2) goto L_0x003c
            if (r8 != r3) goto L_0x0040
        L_0x003c:
            if (r9 != 0) goto L_0x0040
            r2 = 1
            goto L_0x0041
        L_0x0040:
            r2 = 0
        L_0x0041:
            if (r1 != 0) goto L_0x0056
            ery r8 = r6.b     // Catch:{ all -> 0x0183 }
            eqw r8 = r8.q()     // Catch:{ all -> 0x0183 }
            eqy r8 = r8.f     // Catch:{ all -> 0x0183 }
            java.lang.String r9 = "App does not exist in onConfigFetched. appId"
            java.lang.Object r7 = defpackage.eqw.a(r7)     // Catch:{ all -> 0x0183 }
            r8.a(r9, r7)     // Catch:{ all -> 0x0183 }
            goto L_0x016f
        L_0x0056:
            r5 = 404(0x194, float:5.66E-43)
            if (r2 != 0) goto L_0x00c4
            if (r8 != r5) goto L_0x005d
            goto L_0x00c4
        L_0x005d:
            ery r10 = r6.b     // Catch:{ all -> 0x0183 }
            bzg r10 = r10.l()     // Catch:{ all -> 0x0183 }
            long r10 = r10.a()     // Catch:{ all -> 0x0183 }
            r1.h(r10)     // Catch:{ all -> 0x0183 }
            evz r10 = r6.d()     // Catch:{ all -> 0x0183 }
            r10.a(r1)     // Catch:{ all -> 0x0183 }
            ery r10 = r6.b     // Catch:{ all -> 0x0183 }
            eqw r10 = r10.q()     // Catch:{ all -> 0x0183 }
            eqy r10 = r10.k     // Catch:{ all -> 0x0183 }
            java.lang.String r11 = "Fetching config failed. code, error"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0183 }
            r10.a(r11, r1, r9)     // Catch:{ all -> 0x0183 }
            ert r9 = r6.n()     // Catch:{ all -> 0x0183 }
            r9.c(r7)     // Catch:{ all -> 0x0183 }
            ery r7 = r6.b     // Catch:{ all -> 0x0183 }
            erh r7 = r7.b()     // Catch:{ all -> 0x0183 }
            erj r7 = r7.e     // Catch:{ all -> 0x0183 }
            ery r9 = r6.b     // Catch:{ all -> 0x0183 }
            bzg r9 = r9.l()     // Catch:{ all -> 0x0183 }
            long r9 = r9.a()     // Catch:{ all -> 0x0183 }
            r7.a(r9)     // Catch:{ all -> 0x0183 }
            r7 = 503(0x1f7, float:7.05E-43)
            if (r8 == r7) goto L_0x00a8
            r7 = 429(0x1ad, float:6.01E-43)
            if (r8 != r7) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r4 = 0
        L_0x00a8:
            if (r4 == 0) goto L_0x00bf
            ery r7 = r6.b     // Catch:{ all -> 0x0183 }
            erh r7 = r7.b()     // Catch:{ all -> 0x0183 }
            erj r7 = r7.f     // Catch:{ all -> 0x0183 }
            ery r8 = r6.b     // Catch:{ all -> 0x0183 }
            bzg r8 = r8.l()     // Catch:{ all -> 0x0183 }
            long r8 = r8.a()     // Catch:{ all -> 0x0183 }
            r7.a(r8)     // Catch:{ all -> 0x0183 }
        L_0x00bf:
            r6.j()     // Catch:{ all -> 0x0183 }
            goto L_0x016f
        L_0x00c4:
            r9 = 0
            if (r11 == 0) goto L_0x00d0
            java.lang.String r2 = "Last-Modified"
            java.lang.Object r11 = r11.get(r2)     // Catch:{ all -> 0x0183 }
            java.util.List r11 = (java.util.List) r11     // Catch:{ all -> 0x0183 }
            goto L_0x00d1
        L_0x00d0:
            r11 = r9
        L_0x00d1:
            if (r11 == 0) goto L_0x00e0
            int r2 = r11.size()     // Catch:{ all -> 0x0183 }
            if (r2 <= 0) goto L_0x00e0
            java.lang.Object r11 = r11.get(r0)     // Catch:{ all -> 0x0183 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x0183 }
            goto L_0x00e1
        L_0x00e0:
            r11 = r9
        L_0x00e1:
            if (r8 == r5) goto L_0x00fd
            if (r8 != r3) goto L_0x00e6
            goto L_0x00fd
        L_0x00e6:
            ert r9 = r6.n()     // Catch:{ all -> 0x0183 }
            boolean r9 = r9.a(r7, r10, r11)     // Catch:{ all -> 0x0183 }
            if (r9 != 0) goto L_0x011e
            evz r7 = r6.d()     // Catch:{ all -> 0x018c }
            r7.v()     // Catch:{ all -> 0x018c }
            r6.r = r0
            r6.u()
            return
        L_0x00fd:
            ert r11 = r6.n()     // Catch:{ all -> 0x0183 }
            ekc r11 = r11.a(r7)     // Catch:{ all -> 0x0183 }
            if (r11 != 0) goto L_0x011e
            ert r11 = r6.n()     // Catch:{ all -> 0x0183 }
            boolean r9 = r11.a(r7, r9, r9)     // Catch:{ all -> 0x0183 }
            if (r9 != 0) goto L_0x011e
            evz r7 = r6.d()     // Catch:{ all -> 0x018c }
            r7.v()     // Catch:{ all -> 0x018c }
            r6.r = r0
            r6.u()
            return
        L_0x011e:
            ery r9 = r6.b     // Catch:{ all -> 0x0183 }
            bzg r9 = r9.l()     // Catch:{ all -> 0x0183 }
            long r2 = r9.a()     // Catch:{ all -> 0x0183 }
            r1.g(r2)     // Catch:{ all -> 0x0183 }
            evz r9 = r6.d()     // Catch:{ all -> 0x0183 }
            r9.a(r1)     // Catch:{ all -> 0x0183 }
            if (r8 != r5) goto L_0x0142
            ery r8 = r6.b     // Catch:{ all -> 0x0183 }
            eqw r8 = r8.q()     // Catch:{ all -> 0x0183 }
            eqy r8 = r8.h     // Catch:{ all -> 0x0183 }
            java.lang.String r9 = "Config not found. Using empty config. appId"
            r8.a(r9, r7)     // Catch:{ all -> 0x0183 }
            goto L_0x0158
        L_0x0142:
            ery r7 = r6.b     // Catch:{ all -> 0x0183 }
            eqw r7 = r7.q()     // Catch:{ all -> 0x0183 }
            eqy r7 = r7.k     // Catch:{ all -> 0x0183 }
            java.lang.String r9 = "Successfully fetched config. Got network response. code, size"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0183 }
            int r10 = r10.length     // Catch:{ all -> 0x0183 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x0183 }
            r7.a(r9, r8, r10)     // Catch:{ all -> 0x0183 }
        L_0x0158:
            era r7 = r6.c()     // Catch:{ all -> 0x0183 }
            boolean r7 = r7.e()     // Catch:{ all -> 0x0183 }
            if (r7 == 0) goto L_0x016c
            boolean r7 = r6.t()     // Catch:{ all -> 0x0183 }
            if (r7 == 0) goto L_0x016c
            r6.i()     // Catch:{ all -> 0x0183 }
            goto L_0x016f
        L_0x016c:
            r6.j()     // Catch:{ all -> 0x0183 }
        L_0x016f:
            evz r7 = r6.d()     // Catch:{ all -> 0x0183 }
            r7.u()     // Catch:{ all -> 0x0183 }
            evz r7 = r6.d()     // Catch:{ all -> 0x018c }
            r7.v()     // Catch:{ all -> 0x018c }
            r6.r = r0
            r6.u()
            return
        L_0x0183:
            r7 = move-exception
            evz r8 = r6.d()     // Catch:{ all -> 0x018c }
            r8.v()     // Catch:{ all -> 0x018c }
            throw r7     // Catch:{ all -> 0x018c }
        L_0x018c:
            r7 = move-exception
            r6.r = r0
            r6.u()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evc.a(java.lang.String, int, java.lang.Throwable, byte[], java.util.Map):void");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r20 = this;
            r0 = r20
            r20.g()
            r20.h()
            boolean r1 = r20.w()
            if (r1 != 0) goto L_0x001b
            ery r1 = r0.b
            evw r1 = r1.e
            eqm$a<java.lang.Boolean> r2 = defpackage.eqm.al
            boolean r1 = r1.a(r2)
            if (r1 != 0) goto L_0x001b
            return
        L_0x001b:
            long r1 = r0.q
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x005e
            ery r1 = r0.b
            bzg r1 = r1.l()
            long r1 = r1.b()
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r7 = r0.q
            long r1 = r1 - r7
            long r1 = java.lang.Math.abs(r1)
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x005c
            ery r1 = r0.b
            eqw r1 = r1.q()
            eqy r1 = r1.k
            java.lang.Long r2 = java.lang.Long.valueOf(r5)
            java.lang.String r3 = "Upload has been suspended. Will update scheduling later in approximately ms"
            r1.a(r3, r2)
            ere r1 = r20.o()
            r1.b()
            euy r1 = r20.r()
            r1.e()
            return
        L_0x005c:
            r0.q = r3
        L_0x005e:
            ery r1 = r0.b
            boolean r1 = r1.t()
            if (r1 == 0) goto L_0x025b
            boolean r1 = r20.t()
            if (r1 != 0) goto L_0x006e
            goto L_0x025b
        L_0x006e:
            ery r1 = r0.b
            bzg r1 = r1.l()
            long r1 = r1.a()
            eqm$a<java.lang.Long> r5 = defpackage.eqm.H
            java.lang.Object r5 = r5.a()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            evz r7 = r20.d()
            boolean r7 = r7.D()
            if (r7 != 0) goto L_0x009f
            evz r7 = r20.d()
            boolean r7 = r7.y()
            if (r7 == 0) goto L_0x009d
            goto L_0x009f
        L_0x009d:
            r7 = 0
            goto L_0x00a0
        L_0x009f:
            r7 = 1
        L_0x00a0:
            if (r7 == 0) goto L_0x00da
            ery r9 = r0.b
            evw r9 = r9.e
            java.lang.String r9 = r9.i()
            boolean r10 = android.text.TextUtils.isEmpty(r9)
            if (r10 != 0) goto L_0x00c9
            java.lang.String r10 = ".none."
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x00c9
            eqm$a<java.lang.Long> r9 = defpackage.eqm.C
            java.lang.Object r9 = r9.a()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r9 = java.lang.Math.max(r3, r9)
            goto L_0x00ea
        L_0x00c9:
            eqm$a<java.lang.Long> r9 = defpackage.eqm.B
            java.lang.Object r9 = r9.a()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r9 = java.lang.Math.max(r3, r9)
            goto L_0x00ea
        L_0x00da:
            eqm$a<java.lang.Long> r9 = defpackage.eqm.A
            java.lang.Object r9 = r9.a()
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            long r9 = java.lang.Math.max(r3, r9)
        L_0x00ea:
            ery r11 = r0.b
            erh r11 = r11.b()
            erj r11 = r11.d
            long r11 = r11.a()
            ery r13 = r0.b
            erh r13 = r13.b()
            erj r13 = r13.e
            long r13 = r13.a()
            evz r15 = r20.d()
            r16 = r9
            long r8 = r15.A()
            evz r10 = r20.d()
            r18 = r5
            long r5 = r10.B()
            long r5 = java.lang.Math.max(r8, r5)
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 != 0) goto L_0x0121
        L_0x011e:
            r8 = r3
            goto L_0x0196
        L_0x0121:
            long r5 = r5 - r1
            long r5 = java.lang.Math.abs(r5)
            long r5 = r1 - r5
            long r11 = r11 - r1
            long r8 = java.lang.Math.abs(r11)
            long r8 = r1 - r8
            long r13 = r13 - r1
            long r10 = java.lang.Math.abs(r13)
            long r1 = r1 - r10
            long r8 = java.lang.Math.max(r8, r1)
            long r10 = r5 + r18
            if (r7 == 0) goto L_0x0147
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0147
            long r10 = java.lang.Math.min(r5, r8)
            long r10 = r10 + r16
        L_0x0147:
            evi r7 = r20.f()
            r12 = r16
            boolean r7 = r7.a(r8, r12)
            if (r7 != 0) goto L_0x0155
            long r8 = r8 + r12
            goto L_0x0156
        L_0x0155:
            r8 = r10
        L_0x0156:
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x0196
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x0196
            r5 = 0
        L_0x015f:
            r6 = 20
            eqm$a<java.lang.Integer> r7 = defpackage.eqm.J
            java.lang.Object r7 = r7.a()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r10 = 0
            int r7 = java.lang.Math.max(r10, r7)
            int r6 = java.lang.Math.min(r6, r7)
            if (r5 >= r6) goto L_0x011e
            r6 = 1
            long r6 = r6 << r5
            eqm$a<java.lang.Long> r11 = defpackage.eqm.I
            java.lang.Object r11 = r11.a()
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            long r11 = java.lang.Math.max(r3, r11)
            long r11 = r11 * r6
            long r8 = r8 + r11
            int r6 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0193
            goto L_0x0196
        L_0x0193:
            int r5 = r5 + 1
            goto L_0x015f
        L_0x0196:
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x01b6
            ery r1 = r0.b
            eqw r1 = r1.q()
            eqy r1 = r1.k
            java.lang.String r2 = "Next upload time is 0"
            r1.a(r2)
            ere r1 = r20.o()
            r1.b()
            euy r1 = r20.r()
            r1.e()
            return
        L_0x01b6:
            era r1 = r20.c()
            boolean r1 = r1.e()
            if (r1 != 0) goto L_0x01dc
            ery r1 = r0.b
            eqw r1 = r1.q()
            eqy r1 = r1.k
            java.lang.String r2 = "No network"
            r1.a(r2)
            ere r1 = r20.o()
            r1.a()
            euy r1 = r20.r()
            r1.e()
            return
        L_0x01dc:
            ery r1 = r0.b
            erh r1 = r1.b()
            erj r1 = r1.f
            long r1 = r1.a()
            eqm$a<java.lang.Long> r5 = defpackage.eqm.y
            java.lang.Object r5 = r5.a()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            long r5 = java.lang.Math.max(r3, r5)
            evi r7 = r20.f()
            boolean r7 = r7.a(r1, r5)
            if (r7 != 0) goto L_0x0207
            long r1 = r1 + r5
            long r8 = java.lang.Math.max(r8, r1)
        L_0x0207:
            ere r1 = r20.o()
            r1.b()
            ery r1 = r0.b
            bzg r1 = r1.l()
            long r1 = r1.a()
            long r8 = r8 - r1
            int r1 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0242
            eqm$a<java.lang.Long> r1 = defpackage.eqm.D
            java.lang.Object r1 = r1.a()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            long r8 = java.lang.Math.max(r3, r1)
            ery r1 = r0.b
            erh r1 = r1.b()
            erj r1 = r1.d
            ery r2 = r0.b
            bzg r2 = r2.l()
            long r2 = r2.a()
            r1.a(r2)
        L_0x0242:
            ery r1 = r0.b
            eqw r1 = r1.q()
            eqy r1 = r1.k
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            java.lang.String r3 = "Upload scheduled in approximately ms"
            r1.a(r3, r2)
            euy r1 = r20.r()
            r1.a(r8)
            return
        L_0x025b:
            ery r1 = r0.b
            eqw r1 = r1.q()
            eqy r1 = r1.k
            java.lang.String r2 = "Nothing to upload or uploading impossible"
            r1.a(r2)
            ere r1 = r20.o()
            r1.b()
            euy r1 = r20.r()
            r1.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evc.j():void");
    }

    private final void u() {
        g();
        if (this.r || this.s || this.t) {
            this.b.q().k.a("Not stopping services. fetch, network, upload", Boolean.valueOf(this.r), Boolean.valueOf(this.s), Boolean.valueOf(this.t));
            return;
        }
        this.b.q().k.a("Stopping uploading service(s)");
        List<Runnable> list = this.c;
        if (list != null) {
            for (Runnable run : list) {
                run.run();
            }
            this.c.clear();
        }
    }

    private final Boolean b(evp evp) {
        try {
            if (evp.j() != -2147483648L) {
                if (evp.j() == ((long) cab.a(this.b.m()).b(evp.a(), 0).versionCode)) {
                    return Boolean.TRUE;
                }
            } else {
                String str = cab.a(this.b.m()).b(evp.a(), 0).versionName;
                if (evp.i() != null && evp.i().equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (NameNotFoundException unused) {
            return null;
        }
    }

    private final boolean v() {
        g();
        try {
            this.v = new RandomAccessFile(new File(this.b.m().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.u = this.v.tryLock();
            if (this.u != null) {
                this.b.q().k.a("Storage concurrent access okay");
                return true;
            }
            this.b.q().c.a("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e2) {
            this.b.q().c.a("Failed to acquire storage lock", e2);
        } catch (IOException e3) {
            this.b.q().c.a("Failed to access storage lock file", e3);
        }
    }

    private final int a(FileChannel fileChannel) {
        g();
        int i2 = 0;
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.b.q().c.a("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0);
            int read = fileChannel.read(allocate);
            if (read != 4) {
                if (read != -1) {
                    this.b.q().f.a("Unexpected data length. Bytes read", Integer.valueOf(read));
                }
                return 0;
            }
            allocate.flip();
            i2 = allocate.getInt();
            return i2;
        } catch (IOException e2) {
            this.b.q().c.a("Failed to read from channel", e2);
        }
    }

    private final boolean a(int i2, FileChannel fileChannel) {
        g();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.b.q().c.a("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i2);
        allocate.flip();
        try {
            fileChannel.truncate(0);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.b.q().c.a("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e2) {
            this.b.q().c.a("Failed to write to channel", e2);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void k() {
        g();
        h();
        if (!this.p) {
            this.p = true;
            g();
            h();
            if ((this.b.e.a(eqm.al) || w()) && v()) {
                int a2 = a(this.v);
                int y2 = this.b.k().y();
                g();
                if (a2 > y2) {
                    this.b.q().c.a("Panic: can't downgrade version. Previous, current version", Integer.valueOf(a2), Integer.valueOf(y2));
                } else if (a2 < y2) {
                    if (a(y2, this.v)) {
                        this.b.q().k.a("Storage version upgraded. Previous, current version", Integer.valueOf(a2), Integer.valueOf(y2));
                    } else {
                        this.b.q().c.a("Storage version upgrade failed. Previous, current version", Integer.valueOf(a2), Integer.valueOf(y2));
                    }
                }
            }
        }
        if (!this.o && !this.b.e.a(eqm.al)) {
            this.b.q().i.a("This instance being marked as an uploader");
            this.o = true;
            j();
        }
    }

    private final boolean w() {
        g();
        h();
        return this.o;
    }

    /* access modifiers changed from: 0000 */
    public final void a(evq evq) {
        String str = "app_id=?";
        if (this.w != null) {
            this.x = new ArrayList();
            this.x.addAll(this.w);
        }
        evz d2 = d();
        String str2 = evq.a;
        bwx.a(str2);
        d2.c();
        d2.j();
        try {
            SQLiteDatabase w2 = d2.w();
            String[] strArr = {str2};
            int delete = w2.delete("apps", str, strArr) + 0 + w2.delete("events", str, strArr) + w2.delete("user_attributes", str, strArr) + w2.delete("conditional_properties", str, strArr) + w2.delete("raw_events", str, strArr) + w2.delete("raw_events_metadata", str, strArr) + w2.delete("queue", str, strArr) + w2.delete("audience_filter_values", str, strArr) + w2.delete("main_event_params", str, strArr);
            if (delete > 0) {
                d2.q().k.a("Reset analytics data. app, records", str2, Integer.valueOf(delete));
            }
        } catch (SQLiteException e2) {
            d2.q().c.a("Error resetting analytics data. appId, error", eqw.a(str2), e2);
        }
        evq a2 = a(this.b.m(), evq.a, evq.b, evq.h, evq.o, evq.p, evq.m, evq.r);
        if (!this.b.e.e(evq.a) || evq.h) {
            b(a2);
        }
    }

    private final evq a(Context context, String str, String str2, boolean z, boolean z2, boolean z3, long j2, String str3) {
        String str4;
        String str5;
        int i2;
        String str6 = str;
        String str7 = "Unknown";
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            this.b.q().c.a("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            str4 = packageManager.getInstallerPackageName(str6);
        } catch (IllegalArgumentException unused) {
            this.b.q().c.a("Error retrieving installer package name. appId", eqw.a(str));
            str4 = str7;
        }
        if (str4 == null) {
            str4 = "manual_install";
        } else if ("com.android.vending".equals(str4)) {
            str4 = "";
        }
        String str8 = str4;
        try {
            PackageInfo b2 = cab.a(context).b(str6, 0);
            if (b2 != null) {
                CharSequence b3 = cab.a(context).b(str6);
                if (!TextUtils.isEmpty(b3)) {
                    String charSequence = b3.toString();
                }
                String str9 = b2.versionName;
                i2 = b2.versionCode;
                str5 = str9;
            } else {
                i2 = Integer.MIN_VALUE;
                str5 = str7;
            }
            evq evq = new evq(str, str2, str5, (long) i2, str8, 14700, this.b.e().a(context, str6), (String) null, z, false, "", 0, this.b.e.c(str6, eqm.Y) ? j2 : 0, 0, z2, z3, false, str3);
            return evq;
        } catch (NameNotFoundException unused2) {
            this.b.q().c.a("Error retrieving newly installed package info. appId, appName", eqw.a(str), str7);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(evj evj, evq evq) {
        g();
        h();
        if (TextUtils.isEmpty(evq.b) && TextUtils.isEmpty(evq.r)) {
            return;
        }
        if (!evq.h) {
            c(evq);
            return;
        }
        int c2 = this.b.e().c(evj.a);
        String str = "_ev";
        int i2 = 0;
        if (c2 != 0) {
            this.b.e();
            String a2 = evm.a(evj.a, 24, true);
            if (evj.a != null) {
                i2 = evj.a.length();
            }
            this.b.e().b(c2, str, a2, i2);
            return;
        }
        int b2 = this.b.e().b(evj.a, evj.a());
        if (b2 != 0) {
            this.b.e();
            String a3 = evm.a(evj.a, 24, true);
            Object a4 = evj.a();
            if (a4 != null && ((a4 instanceof String) || (a4 instanceof CharSequence))) {
                i2 = String.valueOf(a4).length();
            }
            this.b.e().b(b2, str, a3, i2);
            return;
        }
        this.b.e();
        Object c3 = evm.c(evj.a, evj.a());
        if (c3 != null) {
            if (this.b.e.i(evq.a)) {
                String str2 = "_sno";
                if (str2.equals(evj.a)) {
                    long j2 = 0;
                    evl c4 = d().c(evq.a, str2);
                    if (c4 == null || !(c4.e instanceof Long)) {
                        eqg a5 = d().a(evq.a, "_s");
                        if (a5 != null) {
                            j2 = a5.c;
                            this.b.q().k.a("Backfill the session number. Last used session number", Long.valueOf(j2));
                        }
                    } else {
                        j2 = ((Long) c4.e).longValue();
                    }
                    c3 = Long.valueOf(j2 + 1);
                }
            }
            evl evl = new evl(evq.a, evj.c, evj.a, evj.b, c3);
            this.b.q().j.a("Setting user property", this.b.f().c(evl.c), c3);
            d().e();
            try {
                c(evq);
                boolean a6 = d().a(evl);
                d().u();
                if (a6) {
                    this.b.q().j.a("User property set", this.b.f().c(evl.c), evl.e);
                } else {
                    this.b.q().c.a("Too many unique user properties are set. Ignoring user property", this.b.f().c(evl.c), evl.e);
                    this.b.e().b(9, null, null, 0);
                }
            } finally {
                d().v();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(evj evj, evq evq) {
        g();
        h();
        if (TextUtils.isEmpty(evq.b) && TextUtils.isEmpty(evq.r)) {
            return;
        }
        if (!evq.h) {
            c(evq);
            return;
        }
        this.b.q().j.a("Removing user property", this.b.f().c(evj.a));
        d().e();
        try {
            c(evq);
            d().b(evq.a, evj.a);
            d().u();
            this.b.q().j.a("User property removed", this.b.f().c(evj.a));
        } finally {
            d().v();
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x031c A[Catch:{ SQLiteException -> 0x0141, all -> 0x042b }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0349 A[Catch:{ SQLiteException -> 0x0141, all -> 0x042b }] */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x03cf A[Catch:{ SQLiteException -> 0x0141, all -> 0x042b }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x03fd A[Catch:{ SQLiteException -> 0x0141, all -> 0x042b }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01ca A[Catch:{ SQLiteException -> 0x0141, all -> 0x042b }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01d7 A[Catch:{ SQLiteException -> 0x0141, all -> 0x042b }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01e9 A[Catch:{ SQLiteException -> 0x0141, all -> 0x042b }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02c0 A[Catch:{ SQLiteException -> 0x0141, all -> 0x042b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.evq r22) {
        /*
            r21 = this;
            r1 = r21
            r2 = r22
            java.lang.String r3 = "_sysu"
            java.lang.String r4 = "_sys"
            java.lang.String r5 = "_pfo"
            java.lang.String r6 = "_uwa"
            java.lang.String r0 = "app_id=?"
            r21.g()
            r21.h()
            defpackage.bwx.a(r22)
            java.lang.String r7 = r2.a
            defpackage.bwx.a(r7)
            java.lang.String r7 = r2.b
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x002d
            java.lang.String r7 = r2.r
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x002d
            return
        L_0x002d:
            evz r7 = r21.d()
            java.lang.String r8 = r2.a
            evp r7 = r7.b(r8)
            r8 = 0
            if (r7 == 0) goto L_0x0060
            java.lang.String r10 = r7.c()
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 == 0) goto L_0x0060
            java.lang.String r10 = r2.b
            boolean r10 = android.text.TextUtils.isEmpty(r10)
            if (r10 != 0) goto L_0x0060
            r7.g(r8)
            evz r10 = r21.d()
            r10.a(r7)
            ert r7 = r21.n()
            java.lang.String r10 = r2.a
            r7.d(r10)
        L_0x0060:
            boolean r7 = r2.h
            if (r7 != 0) goto L_0x0068
            r21.c(r22)
            return
        L_0x0068:
            long r10 = r2.m
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0078
            ery r7 = r1.b
            bzg r7 = r7.l()
            long r10 = r7.a()
        L_0x0078:
            int r7 = r2.n
            r14 = 1
            if (r7 == 0) goto L_0x0097
            if (r7 == r14) goto L_0x0097
            ery r12 = r1.b
            eqw r12 = r12.q()
            eqy r12 = r12.f
            java.lang.String r13 = r2.a
            java.lang.Object r13 = defpackage.eqw.a(r13)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "Incorrect app type, assuming installed app. appId, appType"
            r12.a(r8, r13, r7)
            r7 = 0
        L_0x0097:
            evz r8 = r21.d()
            r8.e()
            evz r8 = r21.d()     // Catch:{ all -> 0x042b }
            java.lang.String r9 = r2.a     // Catch:{ all -> 0x042b }
            evp r8 = r8.b(r9)     // Catch:{ all -> 0x042b }
            if (r8 == 0) goto L_0x0152
            ery r12 = r1.b     // Catch:{ all -> 0x042b }
            r12.e()     // Catch:{ all -> 0x042b }
            java.lang.String r12 = r2.b     // Catch:{ all -> 0x042b }
            java.lang.String r13 = r8.c()     // Catch:{ all -> 0x042b }
            java.lang.String r9 = r2.r     // Catch:{ all -> 0x042b }
            java.lang.String r15 = r8.d()     // Catch:{ all -> 0x042b }
            boolean r9 = defpackage.evm.a(r12, r13, r9, r15)     // Catch:{ all -> 0x042b }
            if (r9 == 0) goto L_0x0152
            ery r9 = r1.b     // Catch:{ all -> 0x042b }
            eqw r9 = r9.q()     // Catch:{ all -> 0x042b }
            eqy r9 = r9.f     // Catch:{ all -> 0x042b }
            java.lang.String r12 = "New GMP App Id passed in. Removing cached database data. appId"
            java.lang.String r13 = r8.a()     // Catch:{ all -> 0x042b }
            java.lang.Object r13 = defpackage.eqw.a(r13)     // Catch:{ all -> 0x042b }
            r9.a(r12, r13)     // Catch:{ all -> 0x042b }
            evz r9 = r21.d()     // Catch:{ all -> 0x042b }
            java.lang.String r8 = r8.a()     // Catch:{ all -> 0x042b }
            r9.j()     // Catch:{ all -> 0x042b }
            r9.c()     // Catch:{ all -> 0x042b }
            defpackage.bwx.a(r8)     // Catch:{ all -> 0x042b }
            android.database.sqlite.SQLiteDatabase r12 = r9.w()     // Catch:{ SQLiteException -> 0x0141 }
            java.lang.String[] r13 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x0141 }
            r15 = 0
            r13[r15] = r8     // Catch:{ SQLiteException -> 0x0141 }
            java.lang.String r14 = "events"
            int r14 = r12.delete(r14, r0, r13)     // Catch:{ SQLiteException -> 0x0141 }
            int r14 = r14 + r15
            java.lang.String r15 = "user_attributes"
            int r15 = r12.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x0141 }
            int r14 = r14 + r15
            java.lang.String r15 = "conditional_properties"
            int r15 = r12.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x0141 }
            int r14 = r14 + r15
            java.lang.String r15 = "apps"
            int r15 = r12.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x0141 }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events"
            int r15 = r12.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x0141 }
            int r14 = r14 + r15
            java.lang.String r15 = "raw_events_metadata"
            int r15 = r12.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x0141 }
            int r14 = r14 + r15
            java.lang.String r15 = "event_filters"
            int r15 = r12.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x0141 }
            int r14 = r14 + r15
            java.lang.String r15 = "property_filters"
            int r15 = r12.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x0141 }
            int r14 = r14 + r15
            java.lang.String r15 = "audience_filter_values"
            int r0 = r12.delete(r15, r0, r13)     // Catch:{ SQLiteException -> 0x0141 }
            int r14 = r14 + r0
            if (r14 <= 0) goto L_0x0151
            eqw r0 = r9.q()     // Catch:{ SQLiteException -> 0x0141 }
            eqy r0 = r0.k     // Catch:{ SQLiteException -> 0x0141 }
            java.lang.String r12 = "Deleted application data. app, records"
            java.lang.Integer r13 = java.lang.Integer.valueOf(r14)     // Catch:{ SQLiteException -> 0x0141 }
            r0.a(r12, r8, r13)     // Catch:{ SQLiteException -> 0x0141 }
            goto L_0x0151
        L_0x0141:
            r0 = move-exception
            eqw r9 = r9.q()     // Catch:{ all -> 0x042b }
            eqy r9 = r9.c     // Catch:{ all -> 0x042b }
            java.lang.String r12 = "Error deleting application data. appId, error"
            java.lang.Object r8 = defpackage.eqw.a(r8)     // Catch:{ all -> 0x042b }
            r9.a(r12, r8, r0)     // Catch:{ all -> 0x042b }
        L_0x0151:
            r8 = 0
        L_0x0152:
            if (r8 == 0) goto L_0x01c4
            long r12 = r8.j()     // Catch:{ all -> 0x042b }
            r14 = -2147483648(0xffffffff80000000, double:NaN)
            java.lang.String r0 = "_pv"
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x018e
            long r12 = r8.j()     // Catch:{ all -> 0x042b }
            long r14 = r2.j     // Catch:{ all -> 0x042b }
            int r9 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r9 == 0) goto L_0x01c4
            android.os.Bundle r9 = new android.os.Bundle     // Catch:{ all -> 0x042b }
            r9.<init>()     // Catch:{ all -> 0x042b }
            java.lang.String r8 = r8.i()     // Catch:{ all -> 0x042b }
            r9.putString(r0, r8)     // Catch:{ all -> 0x042b }
            eqk r0 = new eqk     // Catch:{ all -> 0x042b }
            java.lang.String r13 = "_au"
            eqh r14 = new eqh     // Catch:{ all -> 0x042b }
            r14.<init>(r9)     // Catch:{ all -> 0x042b }
            java.lang.String r15 = "auto"
            r12 = r0
            r9 = 1
            r8 = 0
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x042b }
            r1.a(r0, r2)     // Catch:{ all -> 0x042b }
            goto L_0x01c5
        L_0x018e:
            r9 = 1
            r15 = 0
            java.lang.String r12 = r8.i()     // Catch:{ all -> 0x042b }
            if (r12 == 0) goto L_0x01c5
            java.lang.String r12 = r8.i()     // Catch:{ all -> 0x042b }
            java.lang.String r13 = r2.c     // Catch:{ all -> 0x042b }
            boolean r12 = r12.equals(r13)     // Catch:{ all -> 0x042b }
            if (r12 != 0) goto L_0x01c5
            android.os.Bundle r12 = new android.os.Bundle     // Catch:{ all -> 0x042b }
            r12.<init>()     // Catch:{ all -> 0x042b }
            java.lang.String r8 = r8.i()     // Catch:{ all -> 0x042b }
            r12.putString(r0, r8)     // Catch:{ all -> 0x042b }
            eqk r0 = new eqk     // Catch:{ all -> 0x042b }
            java.lang.String r13 = "_au"
            eqh r14 = new eqh     // Catch:{ all -> 0x042b }
            r14.<init>(r12)     // Catch:{ all -> 0x042b }
            java.lang.String r8 = "auto"
            r12 = r0
            r15 = r8
            r16 = r10
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x042b }
            r1.a(r0, r2)     // Catch:{ all -> 0x042b }
            goto L_0x01c5
        L_0x01c4:
            r9 = 1
        L_0x01c5:
            r21.c(r22)     // Catch:{ all -> 0x042b }
            if (r7 != 0) goto L_0x01d7
            evz r0 = r21.d()     // Catch:{ all -> 0x042b }
            java.lang.String r8 = r2.a     // Catch:{ all -> 0x042b }
            java.lang.String r12 = "_f"
            eqg r0 = r0.a(r8, r12)     // Catch:{ all -> 0x042b }
            goto L_0x01e7
        L_0x01d7:
            if (r7 != r9) goto L_0x01e6
            evz r0 = r21.d()     // Catch:{ all -> 0x042b }
            java.lang.String r8 = r2.a     // Catch:{ all -> 0x042b }
            java.lang.String r12 = "_v"
            eqg r0 = r0.a(r8, r12)     // Catch:{ all -> 0x042b }
            goto L_0x01e7
        L_0x01e6:
            r0 = 0
        L_0x01e7:
            if (r0 != 0) goto L_0x03fd
            r12 = 3600000(0x36ee80, double:1.7786363E-317)
            long r14 = r10 / r12
            r18 = r10
            r9 = 1
            long r14 = r14 + r9
            long r14 = r14 * r12
            java.lang.String r0 = "_r"
            java.lang.String r11 = "_c"
            java.lang.String r13 = "_et"
            if (r7 != 0) goto L_0x0361
            evj r7 = new evj     // Catch:{ all -> 0x042b }
            java.lang.String r16 = "_fot"
            java.lang.Long r17 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x042b }
            java.lang.String r20 = "auto"
            r12 = r7
            r14 = r13
            r13 = r16
            r8 = r14
            r14 = r18
            r16 = r17
            r17 = r20
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x042b }
            r1.a(r7, r2)     // Catch:{ all -> 0x042b }
            ery r7 = r1.b     // Catch:{ all -> 0x042b }
            evw r7 = r7.e     // Catch:{ all -> 0x042b }
            java.lang.String r12 = r2.b     // Catch:{ all -> 0x042b }
            boolean r7 = r7.g(r12)     // Catch:{ all -> 0x042b }
            if (r7 == 0) goto L_0x0230
            r21.g()     // Catch:{ all -> 0x042b }
            ery r7 = r1.b     // Catch:{ all -> 0x042b }
            erm r7 = r7.j     // Catch:{ all -> 0x042b }
            java.lang.String r12 = r2.a     // Catch:{ all -> 0x042b }
            r7.a(r12)     // Catch:{ all -> 0x042b }
        L_0x0230:
            r21.g()     // Catch:{ all -> 0x042b }
            r21.h()     // Catch:{ all -> 0x042b }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x042b }
            r7.<init>()     // Catch:{ all -> 0x042b }
            r7.putLong(r11, r9)     // Catch:{ all -> 0x042b }
            r7.putLong(r0, r9)     // Catch:{ all -> 0x042b }
            r11 = 0
            r7.putLong(r6, r11)     // Catch:{ all -> 0x042b }
            r7.putLong(r5, r11)     // Catch:{ all -> 0x042b }
            r7.putLong(r4, r11)     // Catch:{ all -> 0x042b }
            r7.putLong(r3, r11)     // Catch:{ all -> 0x042b }
            ery r0 = r1.b     // Catch:{ all -> 0x042b }
            evw r0 = r0.e     // Catch:{ all -> 0x042b }
            java.lang.String r11 = r2.a     // Catch:{ all -> 0x042b }
            boolean r0 = r0.l(r11)     // Catch:{ all -> 0x042b }
            if (r0 == 0) goto L_0x025e
            r7.putLong(r8, r9)     // Catch:{ all -> 0x042b }
        L_0x025e:
            ery r0 = r1.b     // Catch:{ all -> 0x042b }
            evw r0 = r0.e     // Catch:{ all -> 0x042b }
            java.lang.String r11 = r2.a     // Catch:{ all -> 0x042b }
            boolean r0 = r0.e(r11)     // Catch:{ all -> 0x042b }
            if (r0 == 0) goto L_0x0273
            boolean r0 = r2.q     // Catch:{ all -> 0x042b }
            if (r0 == 0) goto L_0x0273
            java.lang.String r0 = "_dac"
            r7.putLong(r0, r9)     // Catch:{ all -> 0x042b }
        L_0x0273:
            ery r0 = r1.b     // Catch:{ all -> 0x042b }
            android.content.Context r0 = r0.m()     // Catch:{ all -> 0x042b }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ all -> 0x042b }
            if (r0 != 0) goto L_0x0294
            ery r0 = r1.b     // Catch:{ all -> 0x042b }
            eqw r0 = r0.q()     // Catch:{ all -> 0x042b }
            eqy r0 = r0.c     // Catch:{ all -> 0x042b }
            java.lang.String r3 = "PackageManager is null, first open report might be inaccurate. appId"
            java.lang.String r4 = r2.a     // Catch:{ all -> 0x042b }
            java.lang.Object r4 = defpackage.eqw.a(r4)     // Catch:{ all -> 0x042b }
            r0.a(r3, r4)     // Catch:{ all -> 0x042b }
            goto L_0x032e
        L_0x0294:
            ery r0 = r1.b     // Catch:{ NameNotFoundException -> 0x02a8 }
            android.content.Context r0 = r0.m()     // Catch:{ NameNotFoundException -> 0x02a8 }
            caa r0 = defpackage.cab.a(r0)     // Catch:{ NameNotFoundException -> 0x02a8 }
            java.lang.String r11 = r2.a     // Catch:{ NameNotFoundException -> 0x02a8 }
            r14 = 0
            android.content.pm.PackageInfo r0 = r0.b(r11, r14)     // Catch:{ NameNotFoundException -> 0x02a6 }
            goto L_0x02be
        L_0x02a6:
            r0 = move-exception
            goto L_0x02aa
        L_0x02a8:
            r0 = move-exception
            r14 = 0
        L_0x02aa:
            ery r11 = r1.b     // Catch:{ all -> 0x042b }
            eqw r11 = r11.q()     // Catch:{ all -> 0x042b }
            eqy r11 = r11.c     // Catch:{ all -> 0x042b }
            java.lang.String r12 = "Package info is null, first open report might be inaccurate. appId"
            java.lang.String r13 = r2.a     // Catch:{ all -> 0x042b }
            java.lang.Object r13 = defpackage.eqw.a(r13)     // Catch:{ all -> 0x042b }
            r11.a(r12, r13, r0)     // Catch:{ all -> 0x042b }
            r0 = 0
        L_0x02be:
            if (r0 == 0) goto L_0x02f3
            long r11 = r0.firstInstallTime     // Catch:{ all -> 0x042b }
            r15 = 0
            int r13 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r13 == 0) goto L_0x02f3
            long r11 = r0.firstInstallTime     // Catch:{ all -> 0x042b }
            long r14 = r0.lastUpdateTime     // Catch:{ all -> 0x042b }
            int r0 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x02d5
            r7.putLong(r6, r9)     // Catch:{ all -> 0x042b }
            r0 = 0
            goto L_0x02d6
        L_0x02d5:
            r0 = 1
        L_0x02d6:
            evj r6 = new evj     // Catch:{ all -> 0x042b }
            java.lang.String r13 = "_fi"
            if (r0 == 0) goto L_0x02de
            r11 = r9
            goto L_0x02e0
        L_0x02de:
            r11 = 0
        L_0x02e0:
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x042b }
            java.lang.String r17 = "auto"
            r12 = r6
            r11 = 0
            r14 = r18
            r16 = r0
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x042b }
            r1.a(r6, r2)     // Catch:{ all -> 0x042b }
            goto L_0x02f4
        L_0x02f3:
            r11 = 0
        L_0x02f4:
            ery r0 = r1.b     // Catch:{ NameNotFoundException -> 0x0305 }
            android.content.Context r0 = r0.m()     // Catch:{ NameNotFoundException -> 0x0305 }
            caa r0 = defpackage.cab.a(r0)     // Catch:{ NameNotFoundException -> 0x0305 }
            java.lang.String r6 = r2.a     // Catch:{ NameNotFoundException -> 0x0305 }
            android.content.pm.ApplicationInfo r0 = r0.a(r6, r11)     // Catch:{ NameNotFoundException -> 0x0305 }
            goto L_0x031a
        L_0x0305:
            r0 = move-exception
            ery r6 = r1.b     // Catch:{ all -> 0x042b }
            eqw r6 = r6.q()     // Catch:{ all -> 0x042b }
            eqy r6 = r6.c     // Catch:{ all -> 0x042b }
            java.lang.String r11 = "Application info is null, first open report might be inaccurate. appId"
            java.lang.String r12 = r2.a     // Catch:{ all -> 0x042b }
            java.lang.Object r12 = defpackage.eqw.a(r12)     // Catch:{ all -> 0x042b }
            r6.a(r11, r12, r0)     // Catch:{ all -> 0x042b }
            r0 = 0
        L_0x031a:
            if (r0 == 0) goto L_0x032e
            int r6 = r0.flags     // Catch:{ all -> 0x042b }
            r11 = 1
            r6 = r6 & r11
            if (r6 == 0) goto L_0x0325
            r7.putLong(r4, r9)     // Catch:{ all -> 0x042b }
        L_0x0325:
            int r0 = r0.flags     // Catch:{ all -> 0x042b }
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x032e
            r7.putLong(r3, r9)     // Catch:{ all -> 0x042b }
        L_0x032e:
            evz r0 = r21.d()     // Catch:{ all -> 0x042b }
            java.lang.String r3 = r2.a     // Catch:{ all -> 0x042b }
            defpackage.bwx.a(r3)     // Catch:{ all -> 0x042b }
            r0.c()     // Catch:{ all -> 0x042b }
            r0.j()     // Catch:{ all -> 0x042b }
            java.lang.String r4 = "first_open_count"
            long r3 = r0.h(r3, r4)     // Catch:{ all -> 0x042b }
            r11 = 0
            int r0 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r0 < 0) goto L_0x034c
            r7.putLong(r5, r3)     // Catch:{ all -> 0x042b }
        L_0x034c:
            eqk r0 = new eqk     // Catch:{ all -> 0x042b }
            java.lang.String r13 = "_f"
            eqh r14 = new eqh     // Catch:{ all -> 0x042b }
            r14.<init>(r7)     // Catch:{ all -> 0x042b }
            java.lang.String r15 = "auto"
            r12 = r0
            r16 = r18
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x042b }
            r1.a(r0, r2)     // Catch:{ all -> 0x042b }
            goto L_0x03c1
        L_0x0361:
            r8 = r13
            r3 = 1
            if (r7 != r3) goto L_0x03c1
            evj r3 = new evj     // Catch:{ all -> 0x042b }
            java.lang.String r13 = "_fvt"
            java.lang.Long r16 = java.lang.Long.valueOf(r14)     // Catch:{ all -> 0x042b }
            java.lang.String r17 = "auto"
            r12 = r3
            r14 = r18
            r12.<init>(r13, r14, r16, r17)     // Catch:{ all -> 0x042b }
            r1.a(r3, r2)     // Catch:{ all -> 0x042b }
            r21.g()     // Catch:{ all -> 0x042b }
            r21.h()     // Catch:{ all -> 0x042b }
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x042b }
            r3.<init>()     // Catch:{ all -> 0x042b }
            r3.putLong(r11, r9)     // Catch:{ all -> 0x042b }
            r3.putLong(r0, r9)     // Catch:{ all -> 0x042b }
            ery r0 = r1.b     // Catch:{ all -> 0x042b }
            evw r0 = r0.e     // Catch:{ all -> 0x042b }
            java.lang.String r4 = r2.a     // Catch:{ all -> 0x042b }
            boolean r0 = r0.l(r4)     // Catch:{ all -> 0x042b }
            if (r0 == 0) goto L_0x0398
            r3.putLong(r8, r9)     // Catch:{ all -> 0x042b }
        L_0x0398:
            ery r0 = r1.b     // Catch:{ all -> 0x042b }
            evw r0 = r0.e     // Catch:{ all -> 0x042b }
            java.lang.String r4 = r2.a     // Catch:{ all -> 0x042b }
            boolean r0 = r0.e(r4)     // Catch:{ all -> 0x042b }
            if (r0 == 0) goto L_0x03ad
            boolean r0 = r2.q     // Catch:{ all -> 0x042b }
            if (r0 == 0) goto L_0x03ad
            java.lang.String r0 = "_dac"
            r3.putLong(r0, r9)     // Catch:{ all -> 0x042b }
        L_0x03ad:
            eqk r0 = new eqk     // Catch:{ all -> 0x042b }
            java.lang.String r13 = "_v"
            eqh r14 = new eqh     // Catch:{ all -> 0x042b }
            r14.<init>(r3)     // Catch:{ all -> 0x042b }
            java.lang.String r15 = "auto"
            r12 = r0
            r16 = r18
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x042b }
            r1.a(r0, r2)     // Catch:{ all -> 0x042b }
        L_0x03c1:
            ery r0 = r1.b     // Catch:{ all -> 0x042b }
            evw r0 = r0.e     // Catch:{ all -> 0x042b }
            java.lang.String r3 = r2.a     // Catch:{ all -> 0x042b }
            eqm$a<java.lang.Boolean> r4 = defpackage.eqm.aj     // Catch:{ all -> 0x042b }
            boolean r0 = r0.c(r3, r4)     // Catch:{ all -> 0x042b }
            if (r0 != 0) goto L_0x041c
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x042b }
            r0.<init>()     // Catch:{ all -> 0x042b }
            r0.putLong(r8, r9)     // Catch:{ all -> 0x042b }
            ery r3 = r1.b     // Catch:{ all -> 0x042b }
            evw r3 = r3.e     // Catch:{ all -> 0x042b }
            java.lang.String r4 = r2.a     // Catch:{ all -> 0x042b }
            boolean r3 = r3.l(r4)     // Catch:{ all -> 0x042b }
            if (r3 == 0) goto L_0x03e8
            java.lang.String r3 = "_fr"
            r0.putLong(r3, r9)     // Catch:{ all -> 0x042b }
        L_0x03e8:
            eqk r3 = new eqk     // Catch:{ all -> 0x042b }
            java.lang.String r13 = "_e"
            eqh r14 = new eqh     // Catch:{ all -> 0x042b }
            r14.<init>(r0)     // Catch:{ all -> 0x042b }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r18
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x042b }
            r1.a(r3, r2)     // Catch:{ all -> 0x042b }
            goto L_0x041c
        L_0x03fd:
            r18 = r10
            boolean r0 = r2.i     // Catch:{ all -> 0x042b }
            if (r0 == 0) goto L_0x041c
            android.os.Bundle r0 = new android.os.Bundle     // Catch:{ all -> 0x042b }
            r0.<init>()     // Catch:{ all -> 0x042b }
            eqk r3 = new eqk     // Catch:{ all -> 0x042b }
            java.lang.String r13 = "_cd"
            eqh r14 = new eqh     // Catch:{ all -> 0x042b }
            r14.<init>(r0)     // Catch:{ all -> 0x042b }
            java.lang.String r15 = "auto"
            r12 = r3
            r16 = r18
            r12.<init>(r13, r14, r15, r16)     // Catch:{ all -> 0x042b }
            r1.a(r3, r2)     // Catch:{ all -> 0x042b }
        L_0x041c:
            evz r0 = r21.d()     // Catch:{ all -> 0x042b }
            r0.u()     // Catch:{ all -> 0x042b }
            evz r0 = r21.d()
            r0.v()
            return
        L_0x042b:
            r0 = move-exception
            evz r2 = r21.d()
            r2.v()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evc.b(evq):void");
    }

    /* access modifiers changed from: 0000 */
    public final evq a(String str) {
        String str2 = str;
        evp b2 = d().b(str2);
        if (b2 == null || TextUtils.isEmpty(b2.i())) {
            this.b.q().j.a("No app data available; dropping", str2);
            return null;
        }
        Boolean b3 = b(b2);
        if (b3 == null || b3.booleanValue()) {
            evp evp = b2;
            evq evq = new evq(str, b2.c(), b2.i(), b2.j(), b2.k(), b2.l(), b2.m(), (String) null, b2.n(), false, b2.f(), evp.t(), 0, 0, evp.u(), evp.v(), false, evp.d());
            return evq;
        }
        this.b.q().c.a("App version does not match; dropping. appId", eqw.a(str));
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final void a(evu evu, evq evq) {
        bwx.a(evu);
        bwx.a(evu.a);
        bwx.a(evu.b);
        bwx.a(evu.c);
        bwx.a(evu.c.a);
        g();
        h();
        if (TextUtils.isEmpty(evq.b) && TextUtils.isEmpty(evq.r)) {
            return;
        }
        if (!evq.h) {
            c(evq);
            return;
        }
        evu evu2 = new evu(evu);
        boolean z = false;
        evu2.e = false;
        d().e();
        try {
            evu d2 = d().d(evu2.a, evu2.c.a);
            if (d2 != null && !d2.b.equals(evu2.b)) {
                this.b.q().f.a("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.b.f().c(evu2.c.a), evu2.b, d2.b);
            }
            if (d2 != null && d2.e) {
                evu2.b = d2.b;
                evu2.d = d2.d;
                evu2.h = d2.h;
                evu2.f = d2.f;
                evu2.i = d2.i;
                evu2.e = d2.e;
                evj evj = new evj(evu2.c.a, d2.c.b, evu2.c.a(), d2.c.c);
                evu2.c = evj;
            } else if (TextUtils.isEmpty(evu2.f)) {
                evj evj2 = new evj(evu2.c.a, evu2.d, evu2.c.a(), evu2.c.c);
                evu2.c = evj2;
                evu2.e = true;
                z = true;
            }
            if (evu2.e) {
                evj evj3 = evu2.c;
                evl evl = new evl(evu2.a, evu2.b, evj3.a, evj3.b, evj3.a());
                if (d().a(evl)) {
                    this.b.q().j.a("User property updated immediately", evu2.a, this.b.f().c(evl.c), evl.e);
                } else {
                    this.b.q().c.a("(2)Too many active user properties, ignoring", eqw.a(evu2.a), this.b.f().c(evl.c), evl.e);
                }
                if (z && evu2.i != null) {
                    b(new eqk(evu2.i, evu2.d), evq);
                }
            }
            if (d().a(evu2)) {
                this.b.q().j.a("Conditional property added", evu2.a, this.b.f().c(evu2.c.a), evu2.c.a());
            } else {
                this.b.q().c.a("Too many conditional properties, ignoring", eqw.a(evu2.a), this.b.f().c(evu2.c.a), evu2.c.a());
            }
            d().u();
        } finally {
            d().v();
        }
    }

    /* access modifiers changed from: 0000 */
    public final void b(evu evu, evq evq) {
        bwx.a(evu);
        bwx.a(evu.a);
        bwx.a(evu.c);
        bwx.a(evu.c.a);
        g();
        h();
        if (TextUtils.isEmpty(evq.b) && TextUtils.isEmpty(evq.r)) {
            return;
        }
        if (!evq.h) {
            c(evq);
            return;
        }
        d().e();
        try {
            c(evq);
            evu d2 = d().d(evu.a, evu.c.a);
            if (d2 != null) {
                this.b.q().j.a("Removing conditional user property", evu.a, this.b.f().c(evu.c.a));
                d().e(evu.a, evu.c.a);
                if (d2.e) {
                    d().b(evu.a, evu.c.a);
                }
                if (evu.k != null) {
                    Bundle bundle = null;
                    if (evu.k.b != null) {
                        bundle = evu.k.b.a();
                    }
                    Bundle bundle2 = bundle;
                    b(this.b.e().a(evu.a, evu.k.a, bundle2, d2.b, evu.k.d), evq);
                }
            } else {
                this.b.q().f.a("Conditional user property doesn't exist", eqw.a(evu.a), this.b.f().c(evu.c.a));
            }
            d().u();
        } finally {
            d().v();
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.evp c(defpackage.evq r9) {
        /*
            r8 = this;
            r8.g()
            r8.h()
            defpackage.bwx.a(r9)
            java.lang.String r0 = r9.a
            defpackage.bwx.a(r0)
            evz r0 = r8.d()
            java.lang.String r1 = r9.a
            evp r0 = r0.b(r1)
            ery r1 = r8.b
            erh r1 = r1.b()
            java.lang.String r2 = r9.a
            java.lang.String r1 = r1.b(r2)
            r2 = 1
            if (r0 != 0) goto L_0x0042
            evp r0 = new evp
            ery r3 = r8.b
            java.lang.String r4 = r9.a
            r0.<init>(r3, r4)
            ery r3 = r8.b
            evm r3 = r3.e()
            java.lang.String r3 = r3.i()
            r0.a(r3)
            r0.d(r1)
        L_0x0040:
            r1 = 1
            goto L_0x005e
        L_0x0042:
            java.lang.String r3 = r0.e()
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L_0x005d
            r0.d(r1)
            ery r1 = r8.b
            evm r1 = r1.e()
            java.lang.String r1 = r1.i()
            r0.a(r1)
            goto L_0x0040
        L_0x005d:
            r1 = 0
        L_0x005e:
            java.lang.String r3 = r9.b
            java.lang.String r4 = r0.c()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L_0x0070
            java.lang.String r1 = r9.b
            r0.b(r1)
            r1 = 1
        L_0x0070:
            java.lang.String r3 = r9.r
            java.lang.String r4 = r0.d()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L_0x0082
            java.lang.String r1 = r9.r
            r0.c(r1)
            r1 = 1
        L_0x0082:
            java.lang.String r3 = r9.k
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x009c
            java.lang.String r3 = r9.k
            java.lang.String r4 = r0.f()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x009c
            java.lang.String r1 = r9.k
            r0.e(r1)
            r1 = 1
        L_0x009c:
            long r3 = r9.e
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00b4
            long r3 = r9.e
            long r5 = r0.l()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00b4
            long r3 = r9.e
            r0.d(r3)
            r1 = 1
        L_0x00b4:
            java.lang.String r3 = r9.c
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00ce
            java.lang.String r3 = r9.c
            java.lang.String r4 = r0.i()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00ce
            java.lang.String r1 = r9.c
            r0.f(r1)
            r1 = 1
        L_0x00ce:
            long r3 = r9.j
            long r5 = r0.j()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00de
            long r3 = r9.j
            r0.c(r3)
            r1 = 1
        L_0x00de:
            java.lang.String r3 = r9.d
            if (r3 == 0) goto L_0x00f4
            java.lang.String r3 = r9.d
            java.lang.String r4 = r0.k()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00f4
            java.lang.String r1 = r9.d
            r0.g(r1)
            r1 = 1
        L_0x00f4:
            long r3 = r9.f
            long r5 = r0.m()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0104
            long r3 = r9.f
            r0.e(r3)
            r1 = 1
        L_0x0104:
            boolean r3 = r9.h
            boolean r4 = r0.n()
            if (r3 == r4) goto L_0x0112
            boolean r1 = r9.h
            r0.a(r1)
            r1 = 1
        L_0x0112:
            java.lang.String r3 = r9.g
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x012c
            java.lang.String r3 = r9.g
            java.lang.String r4 = r0.s()
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x012c
            java.lang.String r1 = r9.g
            r0.h(r1)
            r1 = 1
        L_0x012c:
            long r3 = r9.l
            long r5 = r0.t()
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x013c
            long r3 = r9.l
            r0.i(r3)
            r1 = 1
        L_0x013c:
            boolean r3 = r9.o
            boolean r4 = r0.u()
            if (r3 == r4) goto L_0x014a
            boolean r1 = r9.o
            r0.b(r1)
            r1 = 1
        L_0x014a:
            boolean r3 = r9.p
            boolean r4 = r0.v()
            if (r3 == r4) goto L_0x0158
            boolean r9 = r9.p
            r0.c(r9)
            r1 = 1
        L_0x0158:
            if (r1 == 0) goto L_0x0161
            evz r9 = r8.d()
            r9.a(r0)
        L_0x0161:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evc.c(evq):evp");
    }

    /* access modifiers changed from: 0000 */
    public final String d(evq evq) {
        try {
            return (String) this.b.p().a((Callable<V>) new evg<V>(this, evq)).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            this.b.q().c.a("Failed to get app instance id. appId", eqw.a(evq.a), e2);
            return null;
        }
    }

    static /* synthetic */ void a(evc evc, evh evh) {
        evc.b.p().c();
        evz evz = new evz(evc);
        evz.t();
        evc.i = evz;
        evc.b.e.a = evc.g;
        evs evs = new evs(evc);
        evs.t();
        evc.l = evs;
        etm etm = new etm(evc);
        etm.t();
        evc.a = etm;
        euy euy = new euy(evc);
        euy.t();
        evc.k = euy;
        evc.j = new ere(evc);
        if (evc.d != evc.e) {
            evc.b.q().c.a("Not all upload components initialized", Integer.valueOf(evc.d), Integer.valueOf(evc.e));
        }
        evc.n = true;
    }
}
