package defpackage;

import android.os.SystemClock;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.internal.cast.zzds;
import com.moat.analytics.mobile.MoatAdEvent;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: eim reason: default package */
public final class eim extends ehp {
    public static final String e = eic.b("com.google.cast.media");
    private final eir A = new eir(86400000);
    private final eir B = new eir(86400000);
    public long f;
    public boh g;
    public Long h;
    public eio i;
    private final eir j = new eir(86400000);
    private final eir k = new eir(86400000);
    private final eir l = new eir(86400000);
    private final eir m = new eir(86400000);
    private final eir n = new eir(10000);
    private final eir o = new eir(86400000);
    private final eir p = new eir(86400000);
    private final eir q = new eir(86400000);
    private final eir r = new eir(86400000);
    private final eir s = new eir(86400000);
    private final eir t = new eir(86400000);
    private final eir u = new eir(86400000);
    private final eir v = new eir(86400000);
    private final eir w = new eir(86400000);
    private final eir x = new eir(86400000);
    private final eir y = new eir(86400000);
    private final eir z = new eir(86400000);

    public eim() {
        super(e, "MediaControlChannel");
        a(this.j);
        a(this.k);
        a(this.l);
        a(this.m);
        a(this.n);
        a(this.o);
        a(this.p);
        a(this.q);
        a(this.r);
        a(this.s);
        a(this.t);
        a(this.u);
        a(this.v);
        a(this.w);
        a(this.x);
        a(this.z);
        a(this.z);
        a(this.A);
        a(this.B);
        j();
    }

    private static int[] a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int[] iArr = new int[jSONArray.length()];
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            iArr[i2] = jSONArray.getInt(i2);
        }
        return iArr;
    }

    private final long e() {
        boh boh = this.g;
        if (boh != null) {
            return boh.b;
        }
        throw new zzds();
    }

    private final void f() {
        eio eio = this.i;
        if (eio != null) {
            eio.a();
        }
    }

    private final void g() {
        eio eio = this.i;
        if (eio != null) {
            eio.b();
        }
    }

    private final void h() {
        eio eio = this.i;
        if (eio != null) {
            eio.c();
        }
    }

    private final void i() {
        eio eio = this.i;
        if (eio != null) {
            eio.d();
        }
    }

    private final void j() {
        this.f = 0;
        this.g = null;
        for (eir a : this.a) {
            a.a(2002);
        }
    }

    public final long a(double d, long j2, long j3) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f;
        if (elapsedRealtime < 0) {
            elapsedRealtime = 0;
        }
        if (elapsedRealtime == 0) {
            return j2;
        }
        double d2 = (double) elapsedRealtime;
        Double.isNaN(d2);
        long j4 = ((long) (d2 * d)) + j2;
        if (j3 > 0 && j4 > j3) {
            j4 = j3;
        } else if (j4 < 0) {
            j4 = 0;
        }
        return j4;
    }

    public final long a(eis eis) {
        JSONObject jSONObject = new JSONObject();
        long b = b();
        try {
            jSONObject.put("requestId", b);
            jSONObject.put(MoatAdEvent.EVENT_TYPE, "GET_STATUS");
            if (this.g != null) {
                jSONObject.put("mediaSessionId", this.g.b);
            }
        } catch (JSONException unused) {
        }
        a(jSONObject.toString(), b);
        this.q.a(b, eis);
        return b;
    }

    public final long a(eis eis, int i2, long j2, bof[] bofArr, int i3, Integer num, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long b = b();
        try {
            jSONObject2.put("requestId", b);
            jSONObject2.put(MoatAdEvent.EVENT_TYPE, "QUEUE_UPDATE");
            jSONObject2.put("mediaSessionId", e());
            if (i3 != 0) {
                jSONObject2.put("jump", i3);
            }
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        a(jSONObject2.toString(), b);
        this.u.a(b, eis);
        return b;
    }

    public final long a(eis eis, bog bog) {
        JSONObject jSONObject = new JSONObject();
        long b = b();
        long j2 = bog.c ? 4294967296000L : bog.a;
        try {
            jSONObject.put("requestId", b);
            jSONObject.put(MoatAdEvent.EVENT_TYPE, "SEEK");
            jSONObject.put("mediaSessionId", e());
            String str = "currentTime";
            double d = (double) j2;
            Double.isNaN(d);
            jSONObject.put(str, d / 1000.0d);
            String str2 = "resumeState";
            if (bog.b == 1) {
                jSONObject.put(str2, "PLAYBACK_START");
            } else if (bog.b == 2) {
                jSONObject.put(str2, "PLAYBACK_PAUSE");
            }
            if (bog.d != null) {
                jSONObject.put("customData", bog.d);
            }
        } catch (JSONException unused) {
        }
        a(jSONObject.toString(), b);
        this.h = Long.valueOf(j2);
        this.n.a(b, new eip(this, eis));
        return b;
    }

    public final long a(eis eis, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long b = b();
        try {
            jSONObject2.put("requestId", b);
            jSONObject2.put(MoatAdEvent.EVENT_TYPE, "PAUSE");
            jSONObject2.put("mediaSessionId", e());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        a(jSONObject2.toString(), b);
        this.k.a(b, eis);
        return b;
    }

    public final long a(eis eis, int[] iArr) {
        JSONObject jSONObject = new JSONObject();
        long b = b();
        try {
            jSONObject.put("requestId", b);
            jSONObject.put(MoatAdEvent.EVENT_TYPE, "QUEUE_GET_ITEMS");
            jSONObject.put("mediaSessionId", e());
            JSONArray jSONArray = new JSONArray();
            for (int put : iArr) {
                jSONArray.put(put);
            }
            jSONObject.put("itemIds", jSONArray);
        } catch (JSONException unused) {
        }
        a(jSONObject.toString(), b);
        this.y.a(b, eis);
        return b;
    }

    public final void a() {
        super.a();
        j();
    }

    public final void a(long j2, int i2) {
        for (eir a : this.a) {
            a.a(j2, i2, (Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:115:0x0208 A[Catch:{ JSONException -> 0x0283 }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0215 A[Catch:{ JSONException -> 0x0283 }] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0222 A[Catch:{ JSONException -> 0x0283 }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x022c A[Catch:{ JSONException -> 0x0283 }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0233 A[Catch:{ JSONException -> 0x0283 }] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x023a A[Catch:{ JSONException -> 0x0283 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0241 A[Catch:{ JSONException -> 0x0283 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0254 A[Catch:{ JSONException -> 0x0283 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r15) {
        /*
            r14 = this;
            ein r0 = r14.b
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r15
            java.lang.String r4 = "message received: %s"
            r0.a(r4, r2)
            r0 = 2
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0283 }
            r2.<init>(r15)     // Catch:{ JSONException -> 0x0283 }
            java.lang.String r4 = "type"
            java.lang.String r4 = r2.getString(r4)     // Catch:{ JSONException -> 0x0283 }
            java.lang.String r5 = "requestId"
            r6 = -1
            long r5 = r2.optLong(r5, r6)     // Catch:{ JSONException -> 0x0283 }
            int r7 = r4.hashCode()     // Catch:{ JSONException -> 0x0283 }
            r8 = -1
            r9 = 4
            r10 = 3
            switch(r7) {
                case -1830647528: goto L_0x0072;
                case -1790231854: goto L_0x0068;
                case -1125000185: goto L_0x005e;
                case -262628938: goto L_0x0054;
                case 154411710: goto L_0x004a;
                case 431600379: goto L_0x0040;
                case 823510221: goto L_0x0036;
                case 2107149050: goto L_0x002c;
                default: goto L_0x002b;
            }     // Catch:{ JSONException -> 0x0283 }
        L_0x002b:
            goto L_0x007c
        L_0x002c:
            java.lang.String r7 = "QUEUE_ITEM_IDS"
            boolean r4 = r4.equals(r7)     // Catch:{ JSONException -> 0x0283 }
            if (r4 == 0) goto L_0x007c
            r4 = 5
            goto L_0x007d
        L_0x0036:
            java.lang.String r7 = "MEDIA_STATUS"
            boolean r4 = r4.equals(r7)     // Catch:{ JSONException -> 0x0283 }
            if (r4 == 0) goto L_0x007c
            r4 = 0
            goto L_0x007d
        L_0x0040:
            java.lang.String r7 = "INVALID_PLAYER_STATE"
            boolean r4 = r4.equals(r7)     // Catch:{ JSONException -> 0x0283 }
            if (r4 == 0) goto L_0x007c
            r4 = 1
            goto L_0x007d
        L_0x004a:
            java.lang.String r7 = "QUEUE_CHANGE"
            boolean r4 = r4.equals(r7)     // Catch:{ JSONException -> 0x0283 }
            if (r4 == 0) goto L_0x007c
            r4 = 6
            goto L_0x007d
        L_0x0054:
            java.lang.String r7 = "LOAD_FAILED"
            boolean r4 = r4.equals(r7)     // Catch:{ JSONException -> 0x0283 }
            if (r4 == 0) goto L_0x007c
            r4 = 2
            goto L_0x007d
        L_0x005e:
            java.lang.String r7 = "INVALID_REQUEST"
            boolean r4 = r4.equals(r7)     // Catch:{ JSONException -> 0x0283 }
            if (r4 == 0) goto L_0x007c
            r4 = 4
            goto L_0x007d
        L_0x0068:
            java.lang.String r7 = "QUEUE_ITEMS"
            boolean r4 = r4.equals(r7)     // Catch:{ JSONException -> 0x0283 }
            if (r4 == 0) goto L_0x007c
            r4 = 7
            goto L_0x007d
        L_0x0072:
            java.lang.String r7 = "LOAD_CANCELLED"
            boolean r4 = r4.equals(r7)     // Catch:{ JSONException -> 0x0283 }
            if (r4 == 0) goto L_0x007c
            r4 = 3
            goto L_0x007d
        L_0x007c:
            r4 = -1
        L_0x007d:
            java.lang.String r7 = "itemIds"
            r11 = 2100(0x834, float:2.943E-42)
            java.lang.String r12 = "customData"
            r13 = 0
            switch(r4) {
                case 0: goto L_0x01ae;
                case 1: goto L_0x018a;
                case 2: goto L_0x0180;
                case 3: goto L_0x0174;
                case 4: goto L_0x0150;
                case 5: goto L_0x0137;
                case 6: goto L_0x00be;
                case 7: goto L_0x0089;
                default: goto L_0x0087;
            }
        L_0x0087:
            goto L_0x0282
        L_0x0089:
            eir r4 = r14.y     // Catch:{ JSONException -> 0x0283 }
            r4.a(r5, r3, r13)     // Catch:{ JSONException -> 0x0283 }
            eio r4 = r14.i     // Catch:{ JSONException -> 0x0283 }
            if (r4 == 0) goto L_0x0282
            java.lang.String r4 = "items"
            org.json.JSONArray r2 = r2.getJSONArray(r4)     // Catch:{ JSONException -> 0x0283 }
            int r4 = r2.length()     // Catch:{ JSONException -> 0x0283 }
            bof[] r4 = new defpackage.bof[r4]     // Catch:{ JSONException -> 0x0283 }
            r5 = 0
        L_0x009f:
            int r6 = r2.length()     // Catch:{ JSONException -> 0x0283 }
            if (r5 >= r6) goto L_0x00b7
            bof$a r6 = new bof$a     // Catch:{ JSONException -> 0x0283 }
            org.json.JSONObject r7 = r2.getJSONObject(r5)     // Catch:{ JSONException -> 0x0283 }
            r6.<init>(r7)     // Catch:{ JSONException -> 0x0283 }
            bof r6 = r6.a()     // Catch:{ JSONException -> 0x0283 }
            r4[r5] = r6     // Catch:{ JSONException -> 0x0283 }
            int r5 = r5 + 1
            goto L_0x009f
        L_0x00b7:
            eio r2 = r14.i     // Catch:{ JSONException -> 0x0283 }
            r2.a(r4)     // Catch:{ JSONException -> 0x0283 }
            goto L_0x0282
        L_0x00be:
            eir r4 = r14.z     // Catch:{ JSONException -> 0x0283 }
            r4.a(r5, r3, r13)     // Catch:{ JSONException -> 0x0283 }
            eio r4 = r14.i     // Catch:{ JSONException -> 0x0283 }
            if (r4 == 0) goto L_0x0136
            java.lang.String r4 = "changeType"
            java.lang.String r4 = r2.getString(r4)     // Catch:{ JSONException -> 0x0283 }
            org.json.JSONArray r5 = r2.getJSONArray(r7)     // Catch:{ JSONException -> 0x0283 }
            int[] r5 = a(r5)     // Catch:{ JSONException -> 0x0283 }
            java.lang.String r6 = "insertBefore"
            int r2 = r2.optInt(r6, r3)     // Catch:{ JSONException -> 0x0283 }
            if (r5 == 0) goto L_0x0136
            int r6 = r4.hashCode()     // Catch:{ JSONException -> 0x0283 }
            switch(r6) {
                case -2130463047: goto L_0x010d;
                case -1881281404: goto L_0x0103;
                case -1785516855: goto L_0x00f9;
                case 1122976047: goto L_0x00ef;
                case 1395699694: goto L_0x00e5;
                default: goto L_0x00e4;
            }     // Catch:{ JSONException -> 0x0283 }
        L_0x00e4:
            goto L_0x0116
        L_0x00e5:
            java.lang.String r6 = "NO_CHANGE"
            boolean r4 = r4.equals(r6)     // Catch:{ JSONException -> 0x0283 }
            if (r4 == 0) goto L_0x0116
            r8 = 4
            goto L_0x0116
        L_0x00ef:
            java.lang.String r6 = "ITEMS_CHANGE"
            boolean r4 = r4.equals(r6)     // Catch:{ JSONException -> 0x0283 }
            if (r4 == 0) goto L_0x0116
            r8 = 1
            goto L_0x0116
        L_0x00f9:
            java.lang.String r6 = "UPDATE"
            boolean r4 = r4.equals(r6)     // Catch:{ JSONException -> 0x0283 }
            if (r4 == 0) goto L_0x0116
            r8 = 3
            goto L_0x0116
        L_0x0103:
            java.lang.String r6 = "REMOVE"
            boolean r4 = r4.equals(r6)     // Catch:{ JSONException -> 0x0283 }
            if (r4 == 0) goto L_0x0116
            r8 = 2
            goto L_0x0116
        L_0x010d:
            java.lang.String r6 = "INSERT"
            boolean r4 = r4.equals(r6)     // Catch:{ JSONException -> 0x0283 }
            if (r4 == 0) goto L_0x0116
            r8 = 0
        L_0x0116:
            if (r8 == 0) goto L_0x0131
            if (r8 == r1) goto L_0x012b
            if (r8 == r0) goto L_0x0125
            if (r8 == r10) goto L_0x011f
            goto L_0x0136
        L_0x011f:
            eio r2 = r14.i     // Catch:{ JSONException -> 0x0283 }
            r2.a(r5)     // Catch:{ JSONException -> 0x0283 }
            return
        L_0x0125:
            eio r2 = r14.i     // Catch:{ JSONException -> 0x0283 }
            r2.c(r5)     // Catch:{ JSONException -> 0x0283 }
            return
        L_0x012b:
            eio r2 = r14.i     // Catch:{ JSONException -> 0x0283 }
            r2.b(r5)     // Catch:{ JSONException -> 0x0283 }
            return
        L_0x0131:
            eio r4 = r14.i     // Catch:{ JSONException -> 0x0283 }
            r4.a(r5, r2)     // Catch:{ JSONException -> 0x0283 }
        L_0x0136:
            return
        L_0x0137:
            eir r4 = r14.x     // Catch:{ JSONException -> 0x0283 }
            r4.a(r5, r3, r13)     // Catch:{ JSONException -> 0x0283 }
            eio r4 = r14.i     // Catch:{ JSONException -> 0x0283 }
            if (r4 == 0) goto L_0x014f
            org.json.JSONArray r2 = r2.getJSONArray(r7)     // Catch:{ JSONException -> 0x0283 }
            int[] r2 = a(r2)     // Catch:{ JSONException -> 0x0283 }
            if (r2 == 0) goto L_0x014f
            eio r4 = r14.i     // Catch:{ JSONException -> 0x0283 }
            r4.a(r2)     // Catch:{ JSONException -> 0x0283 }
        L_0x014f:
            return
        L_0x0150:
            ein r4 = r14.b     // Catch:{ JSONException -> 0x0283 }
            java.lang.String r7 = "received unexpected error: Invalid Request."
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ JSONException -> 0x0283 }
            r4.c(r7, r8)     // Catch:{ JSONException -> 0x0283 }
            org.json.JSONObject r2 = r2.optJSONObject(r12)     // Catch:{ JSONException -> 0x0283 }
            java.util.List<eir> r4 = r14.a     // Catch:{ JSONException -> 0x0283 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ JSONException -> 0x0283 }
        L_0x0163:
            boolean r7 = r4.hasNext()     // Catch:{ JSONException -> 0x0283 }
            if (r7 == 0) goto L_0x0173
            java.lang.Object r7 = r4.next()     // Catch:{ JSONException -> 0x0283 }
            eir r7 = (defpackage.eir) r7     // Catch:{ JSONException -> 0x0283 }
            r7.a(r5, r11, r2)     // Catch:{ JSONException -> 0x0283 }
            goto L_0x0163
        L_0x0173:
            return
        L_0x0174:
            org.json.JSONObject r2 = r2.optJSONObject(r12)     // Catch:{ JSONException -> 0x0283 }
            eir r4 = r14.j     // Catch:{ JSONException -> 0x0283 }
            r7 = 2101(0x835, float:2.944E-42)
            r4.a(r5, r7, r2)     // Catch:{ JSONException -> 0x0283 }
            return
        L_0x0180:
            org.json.JSONObject r2 = r2.optJSONObject(r12)     // Catch:{ JSONException -> 0x0283 }
            eir r4 = r14.j     // Catch:{ JSONException -> 0x0283 }
            r4.a(r5, r11, r2)     // Catch:{ JSONException -> 0x0283 }
            return
        L_0x018a:
            ein r4 = r14.b     // Catch:{ JSONException -> 0x0283 }
            java.lang.String r7 = "received unexpected error: Invalid Player State."
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ JSONException -> 0x0283 }
            r4.c(r7, r8)     // Catch:{ JSONException -> 0x0283 }
            org.json.JSONObject r2 = r2.optJSONObject(r12)     // Catch:{ JSONException -> 0x0283 }
            java.util.List<eir> r4 = r14.a     // Catch:{ JSONException -> 0x0283 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ JSONException -> 0x0283 }
        L_0x019d:
            boolean r7 = r4.hasNext()     // Catch:{ JSONException -> 0x0283 }
            if (r7 == 0) goto L_0x01ad
            java.lang.Object r7 = r4.next()     // Catch:{ JSONException -> 0x0283 }
            eir r7 = (defpackage.eir) r7     // Catch:{ JSONException -> 0x0283 }
            r7.a(r5, r11, r2)     // Catch:{ JSONException -> 0x0283 }
            goto L_0x019d
        L_0x01ad:
            return
        L_0x01ae:
            java.lang.String r4 = "status"
            org.json.JSONArray r2 = r2.getJSONArray(r4)     // Catch:{ JSONException -> 0x0283 }
            int r4 = r2.length()     // Catch:{ JSONException -> 0x0283 }
            if (r4 <= 0) goto L_0x025e
            org.json.JSONObject r2 = r2.getJSONObject(r3)     // Catch:{ JSONException -> 0x0283 }
            eir r4 = r14.j     // Catch:{ JSONException -> 0x0283 }
            boolean r4 = r4.a(r5)     // Catch:{ JSONException -> 0x0283 }
            eir r7 = r14.o     // Catch:{ JSONException -> 0x0283 }
            boolean r7 = r7.a()     // Catch:{ JSONException -> 0x0283 }
            if (r7 == 0) goto L_0x01d4
            eir r7 = r14.o     // Catch:{ JSONException -> 0x0283 }
            boolean r7 = r7.a(r5)     // Catch:{ JSONException -> 0x0283 }
            if (r7 == 0) goto L_0x01e4
        L_0x01d4:
            eir r7 = r14.p     // Catch:{ JSONException -> 0x0283 }
            boolean r7 = r7.a()     // Catch:{ JSONException -> 0x0283 }
            if (r7 == 0) goto L_0x01e6
            eir r7 = r14.p     // Catch:{ JSONException -> 0x0283 }
            boolean r7 = r7.a(r5)     // Catch:{ JSONException -> 0x0283 }
            if (r7 != 0) goto L_0x01e6
        L_0x01e4:
            r7 = 1
            goto L_0x01e7
        L_0x01e6:
            r7 = 0
        L_0x01e7:
            if (r4 != 0) goto L_0x01f5
            boh r4 = r14.g     // Catch:{ JSONException -> 0x0283 }
            if (r4 != 0) goto L_0x01ee
            goto L_0x01f5
        L_0x01ee:
            boh r4 = r14.g     // Catch:{ JSONException -> 0x0283 }
            int r2 = r4.a(r2, r7)     // Catch:{ JSONException -> 0x0283 }
            goto L_0x0204
        L_0x01f5:
            boh r4 = new boh     // Catch:{ JSONException -> 0x0283 }
            r4.<init>(r2)     // Catch:{ JSONException -> 0x0283 }
            r14.g = r4     // Catch:{ JSONException -> 0x0283 }
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x0283 }
            r14.f = r7     // Catch:{ JSONException -> 0x0283 }
            r2 = 127(0x7f, float:1.78E-43)
        L_0x0204:
            r4 = r2 & 1
            if (r4 == 0) goto L_0x0211
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x0283 }
            r14.f = r7     // Catch:{ JSONException -> 0x0283 }
            r14.f()     // Catch:{ JSONException -> 0x0283 }
        L_0x0211:
            r4 = r2 & 2
            if (r4 == 0) goto L_0x021e
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x0283 }
            r14.f = r7     // Catch:{ JSONException -> 0x0283 }
            r14.f()     // Catch:{ JSONException -> 0x0283 }
        L_0x021e:
            r4 = r2 & 128(0x80, float:1.794E-43)
            if (r4 == 0) goto L_0x0228
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x0283 }
            r14.f = r7     // Catch:{ JSONException -> 0x0283 }
        L_0x0228:
            r4 = r2 & 4
            if (r4 == 0) goto L_0x022f
            r14.g()     // Catch:{ JSONException -> 0x0283 }
        L_0x022f:
            r4 = r2 & 8
            if (r4 == 0) goto L_0x0236
            r14.h()     // Catch:{ JSONException -> 0x0283 }
        L_0x0236:
            r4 = r2 & 16
            if (r4 == 0) goto L_0x023d
            r14.i()     // Catch:{ JSONException -> 0x0283 }
        L_0x023d:
            r4 = r2 & 32
            if (r4 == 0) goto L_0x0250
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x0283 }
            r14.f = r7     // Catch:{ JSONException -> 0x0283 }
            eio r4 = r14.i     // Catch:{ JSONException -> 0x0283 }
            if (r4 == 0) goto L_0x0250
            eio r4 = r14.i     // Catch:{ JSONException -> 0x0283 }
            r4.e()     // Catch:{ JSONException -> 0x0283 }
        L_0x0250:
            r2 = r2 & 64
            if (r2 == 0) goto L_0x026c
            long r7 = android.os.SystemClock.elapsedRealtime()     // Catch:{ JSONException -> 0x0283 }
            r14.f = r7     // Catch:{ JSONException -> 0x0283 }
            r14.f()     // Catch:{ JSONException -> 0x0283 }
            goto L_0x026c
        L_0x025e:
            r14.g = r13     // Catch:{ JSONException -> 0x0283 }
            r14.f()     // Catch:{ JSONException -> 0x0283 }
            r14.g()     // Catch:{ JSONException -> 0x0283 }
            r14.h()     // Catch:{ JSONException -> 0x0283 }
            r14.i()     // Catch:{ JSONException -> 0x0283 }
        L_0x026c:
            java.util.List<eir> r2 = r14.a     // Catch:{ JSONException -> 0x0283 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ JSONException -> 0x0283 }
        L_0x0272:
            boolean r4 = r2.hasNext()     // Catch:{ JSONException -> 0x0283 }
            if (r4 == 0) goto L_0x0282
            java.lang.Object r4 = r2.next()     // Catch:{ JSONException -> 0x0283 }
            eir r4 = (defpackage.eir) r4     // Catch:{ JSONException -> 0x0283 }
            r4.a(r5, r3, r13)     // Catch:{ JSONException -> 0x0283 }
            goto L_0x0272
        L_0x0282:
            return
        L_0x0283:
            r2 = move-exception
            ein r4 = r14.b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = r2.getMessage()
            r0[r3] = r2
            r0[r1] = r15
            java.lang.String r15 = "Message is malformed (%s); ignoring: %s"
            r4.c(r15, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eim.a(java.lang.String):void");
    }

    public final long b(eis eis) {
        JSONObject jSONObject = new JSONObject();
        long b = b();
        try {
            jSONObject.put("requestId", b);
            jSONObject.put(MoatAdEvent.EVENT_TYPE, "QUEUE_GET_ITEM_IDS");
            jSONObject.put("mediaSessionId", e());
        } catch (JSONException unused) {
        }
        a(jSONObject.toString(), b);
        this.x.a(b, eis);
        return b;
    }

    public final long b(eis eis, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long b = b();
        try {
            jSONObject2.put("requestId", b);
            jSONObject2.put(MoatAdEvent.EVENT_TYPE, "STOP");
            jSONObject2.put("mediaSessionId", e());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        a(jSONObject2.toString(), b);
        this.m.a(b, eis);
        return b;
    }

    public final long c() {
        MediaInfo d = d();
        if (d != null) {
            return d.c;
        }
        return 0;
    }

    public final long c(eis eis, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        long b = b();
        try {
            jSONObject2.put("requestId", b);
            jSONObject2.put(MoatAdEvent.EVENT_TYPE, "PLAY");
            jSONObject2.put("mediaSessionId", e());
            if (jSONObject != null) {
                jSONObject2.put("customData", jSONObject);
            }
        } catch (JSONException unused) {
        }
        a(jSONObject2.toString(), b);
        this.l.a(b, eis);
        return b;
    }

    public final MediaInfo d() {
        boh boh = this.g;
        if (boh == null) {
            return null;
        }
        return boh.a;
    }
}
