package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@cfp
/* renamed from: ckq reason: default package */
public final class ckq implements clb {
    /* access modifiers changed from: private */
    public static List<Future<Void>> a = Collections.synchronizedList(new ArrayList());
    private static ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */
    public final dha c;
    private final LinkedHashMap<String, dhi> d;
    private final List<String> e = new ArrayList();
    private final List<String> f = new ArrayList();
    private final Context g;
    private final cld h;
    private boolean i;
    private final cky j;
    private final cle k;
    /* access modifiers changed from: private */
    public final Object l = new Object();
    private HashSet<String> m = new HashSet<>();
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;

    public ckq(Context context, cpp cpp, cky cky, String str, cld cld) {
        bxo.a(cky, (Object) "SafeBrowsing config is not present.");
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.g = context;
        this.d = new LinkedHashMap<>();
        this.h = cld;
        this.j = cky;
        for (String lowerCase : this.j.e) {
            this.m.add(lowerCase.toLowerCase(Locale.ENGLISH));
        }
        this.m.remove("cookie".toLowerCase(Locale.ENGLISH));
        dha dha = new dha();
        dha.a = Integer.valueOf(8);
        dha.b = str;
        dha.c = str;
        dha.d = new dhb();
        dha.d.a = this.j.a;
        dhj dhj = new dhj();
        dhj.a = cpp.a;
        dhj.c = Boolean.valueOf(cas.a(this.g).a());
        bsp.b();
        long d2 = (long) bsp.d(this.g);
        if (d2 > 0) {
            dhj.b = Long.valueOf(d2);
        }
        dha.h = dhj;
        this.c = dha;
        this.k = new cle(this.g, this.j.h, this);
    }

    private final dhi d(String str) {
        dhi dhi;
        synchronized (this.l) {
            dhi = (dhi) this.d.get(str);
        }
        return dhi;
    }

    static final /* synthetic */ Void e() {
        return null;
    }

    private final cqi<Void> g() {
        cqi<Void> a2;
        dhi[] dhiArr;
        if (!((this.i && this.j.g) || (this.p && this.j.f) || (!this.i && this.j.d))) {
            return cpx.a(null);
        }
        synchronized (this.l) {
            this.c.e = new dhi[this.d.size()];
            this.d.values().toArray(this.c.e);
            this.c.i = (String[]) this.e.toArray(new String[0]);
            this.c.j = (String[]) this.f.toArray(new String[0]);
            if (cla.a()) {
                String str = this.c.b;
                String str2 = this.c.f;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 53 + String.valueOf(str2).length());
                sb.append("Sending SB report\n  url: ");
                sb.append(str);
                sb.append("\n  clickUrl: ");
                sb.append(str2);
                sb.append("\n  resources: \n");
                StringBuilder sb2 = new StringBuilder(sb.toString());
                for (dhi dhi : this.c.e) {
                    sb2.append("    [");
                    sb2.append(dhi.e.length);
                    sb2.append("] ");
                    sb2.append(dhi.b);
                }
                cla.a(sb2.toString());
            }
            cqi a3 = new coc(this.g).a(1, this.j.b, null, dgw.a((dgw) this.c));
            if (cla.a()) {
                a3.a(new ckv(), cms.a);
            }
            a2 = cpx.a(a3, cks.a, cqo.b);
        }
        return a2;
    }

    public final cky a() {
        return this.j;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ cqi a(Map map) {
        if (map != null) {
            try {
                for (String str : map.keySet()) {
                    JSONArray optJSONArray = new JSONObject((String) map.get(str)).optJSONArray("matches");
                    if (optJSONArray != null) {
                        synchronized (this.l) {
                            int length = optJSONArray.length();
                            dhi d2 = d(str);
                            if (d2 == null) {
                                String str2 = "Cannot find the corresponding resource object for ";
                                String valueOf = String.valueOf(str);
                                cla.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                            } else {
                                d2.e = new String[length];
                                boolean z = false;
                                for (int i2 = 0; i2 < length; i2++) {
                                    d2.e[i2] = optJSONArray.getJSONObject(i2).getString("threat_type");
                                }
                                boolean z2 = this.i;
                                if (length > 0) {
                                    z = true;
                                }
                                this.i = z | z2;
                            }
                        }
                    }
                }
            } catch (JSONException unused) {
                if (((Boolean) dqe.f().a(dtg.cz)).booleanValue()) {
                    cpn.a(3);
                }
                return new cqg(new Exception("Safebrowsing report transmission failed."));
            }
        }
        if (this.i) {
            synchronized (this.l) {
                this.c.a = Integer.valueOf(9);
            }
        }
        return g();
    }

    public final void a(View view) {
        if (this.j.c && !this.o) {
            bkc.e();
            Bitmap b2 = cmu.b(view);
            if (b2 == null) {
                cla.a("Failed to capture the webview bitmap.");
                return;
            }
            this.o = true;
            cmu.a((Runnable) new ckt(this, b2));
        }
    }

    public final void a(String str) {
        synchronized (this.l) {
            this.c.f = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, int r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.l
            monitor-enter(r0)
            r1 = 3
            if (r9 != r1) goto L_0x0009
            r2 = 1
            r6.p = r2     // Catch:{ all -> 0x00c6 }
        L_0x0009:
            java.util.LinkedHashMap<java.lang.String, dhi> r2 = r6.d     // Catch:{ all -> 0x00c6 }
            boolean r2 = r2.containsKey(r7)     // Catch:{ all -> 0x00c6 }
            if (r2 == 0) goto L_0x0023
            if (r9 != r1) goto L_0x0021
            java.util.LinkedHashMap<java.lang.String, dhi> r8 = r6.d     // Catch:{ all -> 0x00c6 }
            java.lang.Object r7 = r8.get(r7)     // Catch:{ all -> 0x00c6 }
            dhi r7 = (defpackage.dhi) r7     // Catch:{ all -> 0x00c6 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00c6 }
            r7.d = r8     // Catch:{ all -> 0x00c6 }
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            return
        L_0x0023:
            dhi r1 = new dhi     // Catch:{ all -> 0x00c6 }
            r1.<init>()     // Catch:{ all -> 0x00c6 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00c6 }
            r1.d = r9     // Catch:{ all -> 0x00c6 }
            java.util.LinkedHashMap<java.lang.String, dhi> r9 = r6.d     // Catch:{ all -> 0x00c6 }
            int r9 = r9.size()     // Catch:{ all -> 0x00c6 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x00c6 }
            r1.a = r9     // Catch:{ all -> 0x00c6 }
            r1.b = r7     // Catch:{ all -> 0x00c6 }
            dhd r9 = new dhd     // Catch:{ all -> 0x00c6 }
            r9.<init>()     // Catch:{ all -> 0x00c6 }
            r1.c = r9     // Catch:{ all -> 0x00c6 }
            java.util.HashSet<java.lang.String> r9 = r6.m     // Catch:{ all -> 0x00c6 }
            int r9 = r9.size()     // Catch:{ all -> 0x00c6 }
            if (r9 <= 0) goto L_0x00bf
            if (r8 == 0) goto L_0x00bf
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x00c6 }
            r9.<init>()     // Catch:{ all -> 0x00c6 }
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x00c6 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x00c6 }
        L_0x005a:
            boolean r2 = r8.hasNext()     // Catch:{ all -> 0x00c6 }
            if (r2 == 0) goto L_0x00b2
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x00c6 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00c6 }
            java.lang.Object r3 = r2.getKey()     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            if (r3 == 0) goto L_0x0073
            java.lang.Object r3 = r2.getKey()     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            goto L_0x0075
        L_0x0073:
            java.lang.String r3 = ""
        L_0x0075:
            java.lang.Object r4 = r2.getValue()     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            if (r4 == 0) goto L_0x0082
            java.lang.Object r2 = r2.getValue()     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            goto L_0x0084
        L_0x0082:
            java.lang.String r2 = ""
        L_0x0084:
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            java.lang.String r4 = r3.toLowerCase(r4)     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            java.util.HashSet<java.lang.String> r5 = r6.m     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            boolean r4 = r5.contains(r4)     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            if (r4 != 0) goto L_0x0093
            goto L_0x005a
        L_0x0093:
            dhc r4 = new dhc     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            r4.<init>()     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            java.lang.String r5 = "UTF-8"
            byte[] r3 = r3.getBytes(r5)     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            r4.a = r3     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            java.lang.String r3 = "UTF-8"
            byte[] r2 = r2.getBytes(r3)     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            r4.b = r2     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            r9.add(r4)     // Catch:{ UnsupportedEncodingException -> 0x00ac }
            goto L_0x005a
        L_0x00ac:
            java.lang.String r2 = "Cannot convert string to bytes, skip header."
            defpackage.cla.a(r2)     // Catch:{ all -> 0x00c6 }
            goto L_0x005a
        L_0x00b2:
            int r8 = r9.size()     // Catch:{ all -> 0x00c6 }
            dhc[] r8 = new defpackage.dhc[r8]     // Catch:{ all -> 0x00c6 }
            r9.toArray(r8)     // Catch:{ all -> 0x00c6 }
            dhd r9 = r1.c     // Catch:{ all -> 0x00c6 }
            r9.a = r8     // Catch:{ all -> 0x00c6 }
        L_0x00bf:
            java.util.LinkedHashMap<java.lang.String, dhi> r8 = r6.d     // Catch:{ all -> 0x00c6 }
            r8.put(r7, r1)     // Catch:{ all -> 0x00c6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            return
        L_0x00c6:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            goto L_0x00ca
        L_0x00c9:
            throw r7
        L_0x00ca:
            goto L_0x00c9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckq.a(java.lang.String, java.util.Map, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        r6 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String[] a(java.lang.String[] r12) {
        /*
            r11 = this;
            cle r0 = r11.k
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r12.length
            r3 = 0
            r4 = 0
        L_0x000a:
            if (r4 >= r2) goto L_0x007a
            r5 = r12[r4]
            java.util.List<java.lang.String> r6 = r0.c
            java.util.Iterator r6 = r6.iterator()
        L_0x0014:
            boolean r7 = r6.hasNext()
            r8 = 1
            if (r7 == 0) goto L_0x0046
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            boolean r9 = r7.equals(r5)
            if (r9 == 0) goto L_0x0029
        L_0x0027:
            r6 = 1
            goto L_0x0047
        L_0x0029:
            java.lang.String r9 = "android.webkit.resource."
            java.lang.String r7 = java.lang.String.valueOf(r7)
            int r10 = r7.length()
            if (r10 == 0) goto L_0x003a
            java.lang.String r7 = r9.concat(r7)
            goto L_0x003f
        L_0x003a:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r9)
        L_0x003f:
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x0014
            goto L_0x0027
        L_0x0046:
            r6 = 0
        L_0x0047:
            if (r6 == 0) goto L_0x0072
            java.util.Map<java.lang.String, java.lang.String> r6 = defpackage.cle.a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L_0x0066
            defpackage.bkc.e()
            android.content.Context r6 = r0.b
            java.util.Map<java.lang.String, java.lang.String> r7 = defpackage.cle.a
            java.lang.Object r7 = r7.get(r5)
            java.lang.String r7 = (java.lang.String) r7
            boolean r6 = defpackage.cmu.a(r6, r7)
            if (r6 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r8 = 0
        L_0x0066:
            if (r8 == 0) goto L_0x006c
            r1.add(r5)
            goto L_0x0077
        L_0x006c:
            ckq r6 = r0.d
            r6.c(r5)
            goto L_0x0077
        L_0x0072:
            ckq r6 = r0.d
            r6.b(r5)
        L_0x0077:
            int r4 = r4 + 1
            goto L_0x000a
        L_0x007a:
            java.lang.String[] r12 = new java.lang.String[r3]
            java.lang.Object[] r12 = r1.toArray(r12)
            java.lang.String[] r12 = (java.lang.String[]) r12
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckq.a(java.lang.String[]):java.lang.String[]");
    }

    /* access modifiers changed from: 0000 */
    public final void b(String str) {
        synchronized (this.l) {
            this.e.add(str);
        }
    }

    public final boolean b() {
        return caf.e() && this.j.c && !this.o;
    }

    public final void c() {
        this.n = true;
    }

    /* access modifiers changed from: 0000 */
    public final void c(String str) {
        synchronized (this.l) {
            this.f.add(str);
        }
    }

    public final void d() {
        synchronized (this.l) {
            cld cld = this.h;
            this.d.keySet();
            cqi a2 = cpx.a(cld.a(), (cps<? super A, ? extends B>) new ckr<Object,Object>(this), cqo.b);
            cqi a3 = cpx.a(a2, 10, TimeUnit.SECONDS, b);
            cpx.a(a2, (cpu<V>) new cku<V>(a3), cqo.b);
            a.add(a3);
        }
    }
}
