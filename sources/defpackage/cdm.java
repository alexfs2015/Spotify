package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@cey
/* renamed from: cdm reason: default package */
public final class cdm implements Callable<ckz> {
    private static long f = 10;
    final Context a;
    /* access modifiers changed from: 0000 */
    public final bis b;
    final dhx c;
    final cla d;
    final dtc e;
    private final cnl g;
    private final ced h;
    private final Object i = new Object();
    private boolean j;
    private int k;
    private List<String> l;
    private JSONObject m;
    private String n;
    private String o;

    public cdm(Context context, bis bis, cnl cnl, dhx dhx, cla cla, dtc dtc) {
        this.a = context;
        this.b = bis;
        this.g = cnl;
        this.d = cla;
        this.c = dhx;
        this.e = dtc;
        this.h = bis.A_();
        this.j = false;
        this.k = -2;
        this.l = null;
        this.n = null;
        this.o = null;
    }

    private final ckz a(duf duf, boolean z) {
        int i2;
        synchronized (this.i) {
            i2 = (duf == null && this.k == -2) ? 0 : this.k;
        }
        ckz ckz = new ckz(this.d.a.c, null, this.d.b.c, i2, this.d.b.e, this.l, this.d.b.k, this.d.b.j, this.d.a.i, false, null, null, null, null, null, 0, this.d.d, this.d.b.f, this.d.f, this.d.g, this.d.b.n, this.m, i2 != -2 ? null : duf, null, null, null, this.d.b.D, this.d.b.E, null, this.d.b.H, this.n, this.d.i, this.d.b.O, this.d.j, z, this.d.b.R, this.d.b.S, this.o);
        return ckz;
    }

    private final void a(int i2) {
        synchronized (this.i) {
            this.j = true;
            this.k = i2;
        }
    }

    private static Integer b(JSONObject jSONObject, String str) {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            return Integer.valueOf(Color.rgb(jSONObject2.getInt("r"), jSONObject2.getInt("g"), jSONObject2.getInt("b")));
        } catch (JSONException unused) {
            return null;
        }
    }

    private final boolean b() {
        boolean z;
        synchronized (this.i) {
            z = this.j;
        }
        return z;
    }

    public final cpr<dtm> a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("attribution");
        if (optJSONObject == null) {
            return cpg.a(null);
        }
        String optString = optJSONObject.optString("text");
        int optInt = optJSONObject.optInt("text_size", -1);
        Integer b2 = b(optJSONObject, "text_color");
        Integer b3 = b(optJSONObject, "bg_color");
        int optInt2 = optJSONObject.optInt("animation_ms", 1000);
        int optInt3 = optJSONObject.optInt("presentation_ms", 4000);
        int i2 = (this.d.a.y == null || this.d.a.y.a < 2) ? 1 : this.d.a.y.e;
        boolean optBoolean = optJSONObject.optBoolean("allow_pub_rendering");
        List<cpr> arrayList = new ArrayList<>();
        String str = "images";
        if (optJSONObject.optJSONArray(str) != null) {
            arrayList = b(optJSONObject, str, false, true);
        } else {
            arrayList.add(a(optJSONObject, "image", false, false));
        }
        cqc cqc = new cqc();
        int size = arrayList.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        for (cpr a2 : arrayList) {
            a2.a(new cdt(atomicInteger, size, cqc, arrayList), cmb.a);
        }
        cdr cdr = new cdr(optString, b3, b2, optInt, optInt3, optInt2, i2, optBoolean);
        return cpg.a((cpr<A>) cqc, (cpc<A, B>) cdr, (Executor) cmb.a);
    }

    public final cpr<dtq> a(JSONObject jSONObject, String str, boolean z, boolean z2) {
        JSONObject jSONObject2 = z ? jSONObject.getJSONObject(str) : jSONObject.optJSONObject(str);
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        return a(jSONObject2, z, z2);
    }

    /* access modifiers changed from: 0000 */
    public final cpr<dtq> a(JSONObject jSONObject, boolean z, boolean z2) {
        String str = "url";
        String string = z ? jSONObject.getString(str) : jSONObject.optString(str);
        double optDouble = jSONObject.optDouble("scale", 1.0d);
        boolean optBoolean = jSONObject.optBoolean("is_transparent", true);
        if (TextUtils.isEmpty(string)) {
            a(0, z);
            return cpg.a(null);
        } else if (z2) {
            return cpg.a(new dtq(null, Uri.parse(string), optDouble));
        } else {
            cnl cnl = this.g;
            cds cds = new cds(this, z, optDouble, optBoolean, string);
            return cnl.a(string, (cnr<T>) cds);
        }
    }

    public final void a(int i2, boolean z) {
        if (z) {
            a(i2);
        }
    }

    public final List<cpr<dtq>> b(JSONObject jSONObject, String str, boolean z, boolean z2) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        ArrayList arrayList = new ArrayList();
        if (optJSONArray == null || optJSONArray.length() == 0) {
            a(0, false);
            return arrayList;
        }
        int length = z2 ? optJSONArray.length() : 1;
        for (int i2 = 0; i2 < length; i2++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            arrayList.add(a(jSONObject2, false, z));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0041, code lost:
        if (r6.length() != 0) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0080 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00aa A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0153 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0155 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01c2 A[Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01ed  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ckz call() {
        /*
            r17 = this;
            r0 = r17
            java.lang.String r1 = "custom_template_id"
            r2 = 5
            r3 = 0
            r4 = 0
            bis r5 = r0.b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            java.lang.String r14 = r5.n     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            boolean r5 = r17.b()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            if (r5 != 0) goto L_0x006f
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            cla r6 = r0.d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            cfy r6 = r6.b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            java.lang.String r6 = r6.b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            r5.<init>(r6)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            cla r7 = r0.d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            cfy r7 = r7.b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            java.lang.String r7 = r7.b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            r6.<init>(r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            int r7 = r6.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            java.lang.String r8 = "ads"
            if (r7 == 0) goto L_0x0043
            org.json.JSONArray r6 = r6.optJSONArray(r8)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            if (r6 == 0) goto L_0x003a
            org.json.JSONObject r6 = r6.optJSONObject(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            goto L_0x003b
        L_0x003a:
            r6 = r4
        L_0x003b:
            if (r6 == 0) goto L_0x0043
            int r6 = r6.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            if (r6 != 0) goto L_0x0047
        L_0x0043:
            r6 = 3
            r0.a(r6)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
        L_0x0047:
            ced r6 = r0.h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            cpr r5 = r6.a(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            long r6 = f     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            java.lang.Object r5 = r5.get(r6, r9)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            org.json.JSONObject r5 = (org.json.JSONObject) r5     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            java.lang.String r6 = "success"
            boolean r6 = r5.optBoolean(r6, r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            if (r6 == 0) goto L_0x006f
            java.lang.String r6 = "json"
            org.json.JSONObject r5 = r5.getJSONObject(r6)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            org.json.JSONArray r5 = r5.optJSONArray(r8)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            org.json.JSONObject r5 = r5.getJSONObject(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            r11 = r5
            goto L_0x0070
        L_0x006f:
            r11 = r4
        L_0x0070:
            java.lang.String r5 = "enable_omid"
            boolean r5 = r11.optBoolean(r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            java.lang.String r6 = "omid_settings"
            if (r5 != 0) goto L_0x0080
        L_0x007a:
            cpq r7 = defpackage.cpg.a(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            r15 = r7
            goto L_0x00a4
        L_0x0080:
            org.json.JSONObject r7 = r11.optJSONObject(r6)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            if (r7 != 0) goto L_0x0087
            goto L_0x007a
        L_0x0087:
            java.lang.String r8 = "omid_html"
            java.lang.String r7 = r7.optString(r8)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            if (r8 == 0) goto L_0x0094
            goto L_0x007a
        L_0x0094:
            cqc r8 = new cqc     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            r8.<init>()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            java.util.concurrent.Executor r9 = defpackage.cpx.a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            cdn r10 = new cdn     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            r10.<init>(r0, r8, r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            r9.execute(r10)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            r15 = r8
        L_0x00a4:
            boolean r7 = r17.b()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            if (r7 != 0) goto L_0x0148
            if (r11 != 0) goto L_0x00ae
            goto L_0x0148
        L_0x00ae:
            java.lang.String r7 = "template_id"
            java.lang.String r7 = r11.getString(r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            cla r8 = r0.d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            cfu r8 = r8.a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            dup r8 = r8.y     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            if (r8 == 0) goto L_0x00c5
            cla r8 = r0.d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            cfu r8 = r8.a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            dup r8 = r8.y     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            boolean r8 = r8.b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            goto L_0x00c6
        L_0x00c5:
            r8 = 0
        L_0x00c6:
            cla r9 = r0.d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            cfu r9 = r9.a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            dup r9 = r9.y     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            if (r9 == 0) goto L_0x00d7
            cla r9 = r0.d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            cfu r9 = r9.a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            dup r9 = r9.y     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            boolean r9 = r9.d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            goto L_0x00d8
        L_0x00d7:
            r9 = 0
        L_0x00d8:
            java.lang.String r10 = "2"
            boolean r10 = r10.equals(r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            if (r10 == 0) goto L_0x00ea
            cee r1 = new cee     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            cla r7 = r0.d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            boolean r7 = r7.j     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            r1.<init>(r8, r9, r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            goto L_0x0149
        L_0x00ea:
            java.lang.String r10 = "1"
            boolean r10 = r10.equals(r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            if (r10 == 0) goto L_0x00fc
            cef r1 = new cef     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            cla r7 = r0.d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            boolean r7 = r7.j     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            r1.<init>(r8, r9, r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            goto L_0x0149
        L_0x00fc:
            java.lang.String r9 = "3"
            boolean r7 = r9.equals(r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            if (r7 == 0) goto L_0x0145
            java.lang.String r7 = r11.getString(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            cqc r9 = new cqc     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            r9.<init>()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            android.os.Handler r10 = defpackage.cmd.a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            cdp r12 = new cdp     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            r12.<init>(r0, r9, r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            r10.post(r12)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            long r12 = f     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            java.lang.Object r7 = r9.get(r12, r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            if (r7 == 0) goto L_0x0127
            ceg r1 = new ceg     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            r1.<init>(r8)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            goto L_0x0149
        L_0x0127:
            java.lang.String r7 = "No handler for custom template: "
            java.lang.String r1 = r11.getString(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            int r8 = r1.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            if (r8 == 0) goto L_0x013c
            java.lang.String r1 = r7.concat(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            goto L_0x0141
        L_0x013c:
            java.lang.String r1 = new java.lang.String     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            r1.<init>(r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
        L_0x0141:
            defpackage.clu.a(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            goto L_0x0148
        L_0x0145:
            r0.a(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
        L_0x0148:
            r1 = r4
        L_0x0149:
            boolean r7 = r17.b()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            if (r7 != 0) goto L_0x01bd
            if (r1 == 0) goto L_0x01bd
            if (r11 != 0) goto L_0x0155
            goto L_0x01bd
        L_0x0155:
            java.lang.String r7 = "tracking_urls_and_actions"
            org.json.JSONObject r7 = r11.getJSONObject(r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            java.lang.String r8 = "impression_tracking_urls"
            org.json.JSONArray r8 = r7.optJSONArray(r8)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            if (r8 != 0) goto L_0x0165
            r9 = r4
            goto L_0x017b
        L_0x0165:
            int r9 = r8.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            r10 = 0
        L_0x016c:
            int r12 = r8.length()     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            if (r10 >= r12) goto L_0x017b
            java.lang.String r12 = r8.getString(r10)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            r9[r10] = r12     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            int r10 = r10 + 1
            goto L_0x016c
        L_0x017b:
            if (r9 != 0) goto L_0x017f
            r8 = r4
            goto L_0x0183
        L_0x017f:
            java.util.List r8 = java.util.Arrays.asList(r9)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
        L_0x0183:
            r0.l = r8     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            java.lang.String r8 = "active_view"
            org.json.JSONObject r7 = r7.optJSONObject(r8)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            r0.m = r7     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            java.lang.String r7 = "debug_signals"
            java.lang.String r7 = r11.optString(r7)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            r0.n = r7     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            java.lang.String r6 = r11.optString(r6)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            r0.o = r6     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            duf r1 = r1.a(r0, r11)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            duh r13 = new duh     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            android.content.Context r7 = r0.a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            bis r8 = r0.b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            ced r9 = r0.h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            dhx r10 = r0.c     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            cla r6 = r0.d     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            cfu r6 = r6.a     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            coy r12 = r6.k     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            r6 = r13
            r16 = r12
            r12 = r1
            r4 = r13
            r13 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            r1.a(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            goto L_0x01be
        L_0x01bd:
            r1 = 0
        L_0x01be:
            boolean r4 = r1 instanceof defpackage.dtv     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            if (r4 == 0) goto L_0x01d1
            r4 = r1
            dtv r4 = (defpackage.dtv) r4     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            cdq r6 = new cdq     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            r6.<init>(r0, r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            ced r4 = r0.h     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            java.lang.String r7 = "/nativeAdCustomClick"
            r4.a(r7, r6)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
        L_0x01d1:
            ckz r1 = r0.a(r1, r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            bis r4 = r0.b     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            csr r5 = b(r15)     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            r4.l = r5     // Catch:{ InterruptedException | CancellationException | ExecutionException | JSONException -> 0x01e6, TimeoutException -> 0x01e2, Exception -> 0x01de }
            return r1
        L_0x01de:
            defpackage.cow.a(r2)
            goto L_0x01e9
        L_0x01e2:
            defpackage.cow.a(r2)
            goto L_0x01e9
        L_0x01e6:
            defpackage.cow.a(r2)
        L_0x01e9:
            boolean r1 = r0.j
            if (r1 != 0) goto L_0x01f0
            r0.a(r3)
        L_0x01f0:
            r1 = 0
            ckz r1 = r0.a(r1, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdm.call():ckz");
    }

    private static csr b(cpr<csr> cpr) {
        try {
            return (csr) cpr.get((long) ((Integer) dpn.f().a(dsp.cb)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            cow.a(5);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException | ExecutionException | TimeoutException unused2) {
            cow.a(5);
            return null;
        }
    }

    public final cpr<csr> a(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return cpg.a(null);
        }
        if (TextUtils.isEmpty(optJSONObject.optString("vast_xml"))) {
            cow.a(5);
            return cpg.a(null);
        }
        cdv cdv = new cdv(this.a, this.c, this.d, this.e, this.b);
        cqc cqc = new cqc();
        cpx.a.execute(new cdw(cdv, optJSONObject, cqc));
        return cqc;
    }

    static csr a(cpr<csr> cpr) {
        try {
            return (csr) cpr.get((long) ((Integer) dpn.f().a(dsp.ca)).intValue(), TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            cow.a(5);
            Thread.currentThread().interrupt();
            return null;
        } catch (CancellationException | ExecutionException | TimeoutException unused2) {
            cow.a(5);
            return null;
        }
    }

    static /* synthetic */ void a(cdm cdm, dvw dvw, String str) {
        try {
            dwh b2 = cdm.b.b(dvw.l());
            if (b2 != null) {
                b2.a(dvw, str);
            }
        } catch (RemoteException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            sb.toString();
            cow.a(5);
        }
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<cpr>, for r2v0, types: [java.util.List<cpr>, java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ java.util.List a(java.util.List<defpackage.cpr> r2) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0009:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x001f
            java.lang.Object r1 = r2.next()
            cpr r1 = (defpackage.cpr) r1
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto L_0x0009
            r0.add(r1)
            goto L_0x0009
        L_0x001f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cdm.a(java.util.List):java.util.List");
    }
}
