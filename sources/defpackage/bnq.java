package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.gms.cast.MediaInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bnq reason: default package */
public final class bnq extends bxf {
    public static final Creator<bnq> CREATOR = new brf();
    public MediaInfo a;
    public long b;
    public int c;
    public double d;
    public int e;
    public int f;
    public long g;
    public int h;
    public int i;
    public final ArrayList<bno> j;
    public boolean k;
    public bnk l;
    private long m;
    private double n;
    private boolean o;
    private long[] p;
    private int q;
    private String r;
    private JSONObject s;
    private bnf t;
    private bnt u;
    private bnn v;
    private final SparseArray<Integer> w;

    bnq(MediaInfo mediaInfo, long j2, int i2, double d2, int i3, int i4, long j3, long j4, double d3, boolean z, long[] jArr, int i5, int i6, String str, int i7, List<bno> list, boolean z2, bnf bnf, bnt bnt) {
        List<bno> list2 = list;
        this.j = new ArrayList<>();
        this.w = new SparseArray<>();
        this.a = mediaInfo;
        this.b = j2;
        this.c = i2;
        this.d = d2;
        this.e = i3;
        this.f = i4;
        this.g = j3;
        this.m = j4;
        this.n = d3;
        this.o = z;
        this.p = jArr;
        this.h = i5;
        this.q = i6;
        this.r = str;
        String str2 = this.r;
        if (str2 != null) {
            try {
                this.s = new JSONObject(str2);
            } catch (JSONException unused) {
                this.s = null;
                this.r = null;
            }
        } else {
            this.s = null;
        }
        this.i = i7;
        if (list2 != null && !list.isEmpty()) {
            a((bno[]) list2.toArray(new bno[list.size()]));
        }
        this.k = z2;
        this.t = bnf;
        this.u = bnt;
    }

    private static boolean a(int i2, int i3, int i4, int i5) {
        if (i2 != 1) {
            return false;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                return i5 != 2;
            }
            if (i3 != 3) {
                return true;
            }
        }
        return i4 == 0;
    }

    public bnq(JSONObject jSONObject) {
        this(null, 0, 0, 0.0d, 0, 0, 0, 0, 0.0d, false, null, 0, 0, null, 0, null, false, null, null);
        a(jSONObject, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02ad, code lost:
        if (r14 == false) goto L_0x02cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02e4, code lost:
        if (r1.equals(r14) == false) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0307, code lost:
        if (r1.equals(r14) == false) goto L_0x0309;
     */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0303  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0315  */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:208:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(org.json.JSONObject r13, int r14) {
        /*
            r12 = this;
            org.json.JSONObject r13 = a(r13)
            java.lang.String r0 = "mediaSessionId"
            long r0 = r13.getLong(r0)
            long r2 = r12.b
            r4 = 0
            r5 = 1
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L_0x0016
            r12.b = r0
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            java.lang.String r1 = "playerState"
            boolean r2 = r13.has(r1)
            if (r2 == 0) goto L_0x009f
            java.lang.String r1 = r13.getString(r1)
            java.lang.String r2 = "IDLE"
            boolean r2 = r1.equals(r2)
            r3 = 3
            r6 = 4
            r7 = 2
            if (r2 == 0) goto L_0x0030
            r1 = 1
            goto L_0x0059
        L_0x0030:
            java.lang.String r2 = "PLAYING"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x003a
            r1 = 2
            goto L_0x0059
        L_0x003a:
            java.lang.String r2 = "PAUSED"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0044
            r1 = 3
            goto L_0x0059
        L_0x0044:
            java.lang.String r2 = "BUFFERING"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x004e
            r1 = 4
            goto L_0x0059
        L_0x004e:
            java.lang.String r2 = "LOADING"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0058
            r1 = 5
            goto L_0x0059
        L_0x0058:
            r1 = 0
        L_0x0059:
            int r2 = r12.e
            if (r1 == r2) goto L_0x0061
            r12.e = r1
            r0 = r0 | 2
        L_0x0061:
            if (r1 != r5) goto L_0x009f
            java.lang.String r1 = "idleReason"
            boolean r2 = r13.has(r1)
            if (r2 == 0) goto L_0x009f
            java.lang.String r1 = r13.getString(r1)
            java.lang.String r2 = "CANCELLED"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0079
            r3 = 2
            goto L_0x0097
        L_0x0079:
            java.lang.String r2 = "INTERRUPTED"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x0082
            goto L_0x0097
        L_0x0082:
            java.lang.String r2 = "FINISHED"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x008c
            r3 = 1
            goto L_0x0097
        L_0x008c:
            java.lang.String r2 = "ERROR"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0096
            r3 = 4
            goto L_0x0097
        L_0x0096:
            r3 = 0
        L_0x0097:
            int r1 = r12.f
            if (r3 == r1) goto L_0x009f
            r12.f = r3
            r0 = r0 | 2
        L_0x009f:
            java.lang.String r1 = "playbackRate"
            boolean r2 = r13.has(r1)
            if (r2 == 0) goto L_0x00b5
            double r1 = r13.getDouble(r1)
            double r6 = r12.d
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x00b5
            r12.d = r1
            r0 = r0 | 2
        L_0x00b5:
            java.lang.String r1 = "currentTime"
            boolean r2 = r13.has(r1)
            if (r2 == 0) goto L_0x00d5
            double r1 = r13.getDouble(r1)
            r6 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r1 = r1 * r6
            long r1 = (long) r1
            long r6 = r12.g
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x00d3
            r12.g = r1
            r0 = r0 | 2
        L_0x00d3:
            r0 = r0 | 128(0x80, float:1.794E-43)
        L_0x00d5:
            java.lang.String r1 = "supportedMediaCommands"
            boolean r2 = r13.has(r1)
            if (r2 == 0) goto L_0x00eb
            long r1 = r13.getLong(r1)
            long r6 = r12.m
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x00eb
            r12.m = r1
            r0 = r0 | 2
        L_0x00eb:
            java.lang.String r1 = "volume"
            boolean r2 = r13.has(r1)
            if (r2 == 0) goto L_0x0118
            r14 = r14 & r5
            if (r14 != 0) goto L_0x0118
            org.json.JSONObject r14 = r13.getJSONObject(r1)
            java.lang.String r1 = "level"
            double r1 = r14.getDouble(r1)
            double r6 = r12.n
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x010a
            r12.n = r1
            r0 = r0 | 2
        L_0x010a:
            java.lang.String r1 = "muted"
            boolean r14 = r14.getBoolean(r1)
            boolean r1 = r12.o
            if (r14 == r1) goto L_0x0118
            r12.o = r14
            r0 = r0 | 2
        L_0x0118:
            java.lang.String r14 = "activeTrackIds"
            boolean r1 = r13.has(r14)
            r2 = 0
            if (r1 == 0) goto L_0x0158
            org.json.JSONArray r14 = r13.getJSONArray(r14)
            int r1 = r14.length()
            long[] r3 = new long[r1]
            r6 = 0
        L_0x012c:
            if (r6 >= r1) goto L_0x0137
            long r7 = r14.getLong(r6)
            r3[r6] = r7
            int r6 = r6 + 1
            goto L_0x012c
        L_0x0137:
            long[] r14 = r12.p
            if (r14 != 0) goto L_0x013d
        L_0x013b:
            r14 = 1
            goto L_0x0153
        L_0x013d:
            int r14 = r14.length
            if (r14 == r1) goto L_0x0141
            goto L_0x013b
        L_0x0141:
            r14 = 0
        L_0x0142:
            if (r14 >= r1) goto L_0x0152
            long[] r6 = r12.p
            r7 = r6[r14]
            r9 = r3[r14]
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 == 0) goto L_0x014f
            goto L_0x013b
        L_0x014f:
            int r14 = r14 + 1
            goto L_0x0142
        L_0x0152:
            r14 = 0
        L_0x0153:
            if (r14 == 0) goto L_0x0160
            r12.p = r3
            goto L_0x0160
        L_0x0158:
            long[] r14 = r12.p
            r3 = r2
            if (r14 == 0) goto L_0x015f
            r14 = 1
            goto L_0x0160
        L_0x015f:
            r14 = 0
        L_0x0160:
            if (r14 == 0) goto L_0x0166
            r12.p = r3
            r0 = r0 | 2
        L_0x0166:
            java.lang.String r14 = "customData"
            boolean r1 = r13.has(r14)
            if (r1 == 0) goto L_0x0178
            org.json.JSONObject r14 = r13.getJSONObject(r14)
            r12.s = r14
            r12.r = r2
            r0 = r0 | 2
        L_0x0178:
            java.lang.String r14 = "media"
            boolean r1 = r13.has(r14)
            if (r1 == 0) goto L_0x01a3
            org.json.JSONObject r14 = r13.getJSONObject(r14)
            com.google.android.gms.cast.MediaInfo r1 = new com.google.android.gms.cast.MediaInfo
            r1.<init>(r14)
            com.google.android.gms.cast.MediaInfo r3 = r12.a
            if (r3 == 0) goto L_0x0195
            if (r3 == 0) goto L_0x0199
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0199
        L_0x0195:
            r12.a = r1
            r0 = r0 | 2
        L_0x0199:
            java.lang.String r1 = "metadata"
            boolean r14 = r14.has(r1)
            if (r14 == 0) goto L_0x01a3
            r0 = r0 | 4
        L_0x01a3:
            java.lang.String r14 = "currentItemId"
            boolean r14 = r13.has(r14)
            if (r14 == 0) goto L_0x01b9
            java.lang.String r14 = "currentItemId"
            int r14 = r13.getInt(r14)
            int r1 = r12.c
            if (r1 == r14) goto L_0x01b9
            r12.c = r14
            r0 = r0 | 2
        L_0x01b9:
            java.lang.String r14 = "preloadedItemId"
            int r14 = r13.optInt(r14, r4)
            int r1 = r12.q
            if (r1 == r14) goto L_0x01c7
            r12.q = r14
            r0 = r0 | 16
        L_0x01c7:
            java.lang.String r14 = "loadingItemId"
            int r14 = r13.optInt(r14, r4)
            int r1 = r12.h
            if (r1 == r14) goto L_0x01d5
            r12.h = r14
            r0 = r0 | 2
        L_0x01d5:
            com.google.android.gms.cast.MediaInfo r14 = r12.a
            if (r14 != 0) goto L_0x01db
            r14 = -1
            goto L_0x01dd
        L_0x01db:
            int r14 = r14.a
        L_0x01dd:
            int r1 = r12.e
            int r3 = r12.f
            int r6 = r12.h
            boolean r14 = a(r1, r3, r6, r14)
            if (r14 != 0) goto L_0x02b0
            java.lang.String r14 = "repeatMode"
            boolean r14 = r13.has(r14)
            if (r14 == 0) goto L_0x0218
            java.lang.String r14 = "repeatMode"
            java.lang.String r14 = r13.getString(r14)
            java.lang.Integer r14 = defpackage.eic.a(r14)
            if (r14 != 0) goto L_0x0200
            int r14 = r12.i
            goto L_0x0204
        L_0x0200:
            int r14 = r14.intValue()
        L_0x0204:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            int r1 = r12.i
            int r3 = r14.intValue()
            if (r1 == r3) goto L_0x0218
            int r14 = r14.intValue()
            r12.i = r14
            r14 = 1
            goto L_0x0219
        L_0x0218:
            r14 = 0
        L_0x0219:
            java.lang.String r1 = "items"
            boolean r1 = r13.has(r1)
            if (r1 == 0) goto L_0x02ad
            java.lang.String r1 = "items"
            org.json.JSONArray r1 = r13.getJSONArray(r1)
            int r3 = r1.length()
            android.util.SparseArray r6 = new android.util.SparseArray
            r6.<init>()
            r7 = 0
        L_0x0231:
            if (r7 >= r3) goto L_0x0247
            org.json.JSONObject r8 = r1.getJSONObject(r7)
            java.lang.String r9 = "itemId"
            int r8 = r8.getInt(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r6.put(r7, r8)
            int r7 = r7 + 1
            goto L_0x0231
        L_0x0247:
            bno[] r7 = new defpackage.bno[r3]
            r8 = r14
            r14 = 0
        L_0x024b:
            if (r14 >= r3) goto L_0x029f
            java.lang.Object r9 = r6.get(r14)
            java.lang.Integer r9 = (java.lang.Integer) r9
            org.json.JSONObject r10 = r1.getJSONObject(r14)
            int r11 = r9.intValue()
            bno r11 = r12.a(r11)
            if (r11 == 0) goto L_0x0277
            boolean r10 = r11.a(r10)
            r8 = r8 | r10
            r7[r14] = r11
            int r9 = r9.intValue()
            java.lang.Integer r9 = r12.b(r9)
            int r9 = r9.intValue()
            if (r14 == r9) goto L_0x029c
            goto L_0x029b
        L_0x0277:
            int r8 = r9.intValue()
            int r9 = r12.c
            if (r8 != r9) goto L_0x0294
            com.google.android.gms.cast.MediaInfo r8 = r12.a
            if (r8 == 0) goto L_0x0294
            bno$a r9 = new bno$a
            r9.<init>(r8)
            bno r8 = r9.a()
            r7[r14] = r8
            r8 = r7[r14]
            r8.a(r10)
            goto L_0x029b
        L_0x0294:
            bno r8 = new bno
            r8.<init>(r10)
            r7[r14] = r8
        L_0x029b:
            r8 = 1
        L_0x029c:
            int r14 = r14 + 1
            goto L_0x024b
        L_0x029f:
            java.util.ArrayList<bno> r14 = r12.j
            int r14 = r14.size()
            if (r14 == r3) goto L_0x02a9
            r14 = 1
            goto L_0x02aa
        L_0x02a9:
            r14 = r8
        L_0x02aa:
            r12.a(r7)
        L_0x02ad:
            if (r14 == 0) goto L_0x02cc
            goto L_0x02ca
        L_0x02b0:
            r12.c = r4
            r12.h = r4
            r12.q = r4
            java.util.ArrayList<bno> r14 = r12.j
            boolean r14 = r14.isEmpty()
            if (r14 != 0) goto L_0x02cc
            r12.i = r4
            java.util.ArrayList<bno> r14 = r12.j
            r14.clear()
            android.util.SparseArray<java.lang.Integer> r14 = r12.w
            r14.clear()
        L_0x02ca:
            r0 = r0 | 8
        L_0x02cc:
            java.lang.String r14 = "breakStatus"
            org.json.JSONObject r14 = r13.optJSONObject(r14)
            bnf r14 = defpackage.bnf.a(r14)
            bnf r1 = r12.t
            if (r1 != 0) goto L_0x02dc
            if (r14 != 0) goto L_0x02e6
        L_0x02dc:
            bnf r1 = r12.t
            if (r1 == 0) goto L_0x02ef
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x02ef
        L_0x02e6:
            if (r14 == 0) goto L_0x02e9
            r4 = 1
        L_0x02e9:
            r12.k = r4
            r12.t = r14
            r0 = r0 | 32
        L_0x02ef:
            java.lang.String r14 = "videoInfo"
            org.json.JSONObject r14 = r13.optJSONObject(r14)
            bnt r14 = defpackage.bnt.a(r14)
            bnt r1 = r12.u
            if (r1 != 0) goto L_0x02ff
            if (r14 != 0) goto L_0x0309
        L_0x02ff:
            bnt r1 = r12.u
            if (r1 == 0) goto L_0x030d
            boolean r1 = r1.equals(r14)
            if (r1 != 0) goto L_0x030d
        L_0x0309:
            r12.u = r14
            r0 = r0 | 64
        L_0x030d:
            java.lang.String r14 = "breakInfo"
            boolean r14 = r13.has(r14)
            if (r14 == 0) goto L_0x0324
            com.google.android.gms.cast.MediaInfo r14 = r12.a
            if (r14 == 0) goto L_0x0324
            java.lang.String r1 = "breakInfo"
            org.json.JSONObject r1 = r13.getJSONObject(r1)
            r14.a(r1)
            r0 = r0 | 2
        L_0x0324:
            boolean r14 = defpackage.eht.b
            if (r14 == 0) goto L_0x0345
            java.lang.String r14 = "queueData"
            boolean r14 = r13.has(r14)
            if (r14 == 0) goto L_0x0345
            bnn$a r14 = new bnn$a
            r14.<init>()
            java.lang.String r1 = "queueData"
            org.json.JSONObject r1 = r13.getJSONObject(r1)
            bnn$a r14 = r14.a(r1)
            bnn r14 = r14.a()
            r12.v = r14
        L_0x0345:
            boolean r14 = defpackage.eht.b
            if (r14 == 0) goto L_0x0369
            java.lang.String r14 = "liveSeekableRange"
            boolean r14 = r13.has(r14)
            if (r14 == 0) goto L_0x0360
            java.lang.String r14 = "liveSeekableRange"
            org.json.JSONObject r13 = r13.optJSONObject(r14)
            bnk r13 = defpackage.bnk.a(r13)
            r12.l = r13
            r0 = r0 | 2
            goto L_0x0369
        L_0x0360:
            bnk r13 = r12.l
            if (r13 == 0) goto L_0x0367
            r13 = r0 | 2
            r0 = r13
        L_0x0367:
            r12.l = r2
        L_0x0369:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnq.a(org.json.JSONObject, int):int");
    }

    private static JSONObject a(JSONObject jSONObject) {
        String str = "extendedStatus";
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        if (optJSONObject == null) {
            return jSONObject;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                arrayList.add((String) keys.next());
            }
            JSONObject jSONObject2 = new JSONObject(jSONObject, (String[]) arrayList.toArray(new String[0]));
            Iterator keys2 = optJSONObject.keys();
            while (keys2.hasNext()) {
                String str2 = (String) keys2.next();
                jSONObject2.put(str2, optJSONObject.get(str2));
            }
            jSONObject2.remove(str);
            return jSONObject2;
        } catch (JSONException unused) {
            return jSONObject;
        }
    }

    public final boolean a() {
        MediaInfo mediaInfo = this.a;
        return a(this.e, this.f, this.h, mediaInfo == null ? -1 : mediaInfo.a);
    }

    public final bno a(int i2) {
        Integer num = (Integer) this.w.get(i2);
        if (num == null) {
            return null;
        }
        return (bno) this.j.get(num.intValue());
    }

    public final Integer b(int i2) {
        return (Integer) this.w.get(i2);
    }

    private final void a(bno[] bnoArr) {
        this.j.clear();
        this.w.clear();
        for (int i2 = 0; i2 < bnoArr.length; i2++) {
            bno bno = bnoArr[i2];
            this.j.add(bno);
            this.w.put(bno.b, Integer.valueOf(i2));
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnq)) {
            return false;
        }
        bnq bnq = (bnq) obj;
        if ((this.s == null) == (bnq.s == null) && this.b == bnq.b && this.c == bnq.c && this.d == bnq.d && this.e == bnq.e && this.f == bnq.f && this.g == bnq.g && this.n == bnq.n && this.o == bnq.o && this.h == bnq.h && this.q == bnq.q && this.i == bnq.i && Arrays.equals(this.p, bnq.p) && ehl.a(Long.valueOf(this.m), Long.valueOf(bnq.m)) && ehl.a(this.j, bnq.j) && ehl.a(this.a, bnq.a)) {
            JSONObject jSONObject = this.s;
            if (jSONObject != null) {
                JSONObject jSONObject2 = bnq.s;
                if (jSONObject2 != null && !bzn.a(jSONObject, jSONObject2)) {
                    z = false;
                    return !z && this.k == bnq.k && ehl.a(this.t, bnq.t) && ehl.a(this.u, bnq.u) && ehl.a(this.l, bnq.l) && bwv.a(this.v, bnq.v);
                }
            }
            z = true;
            if (!z) {
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b), Integer.valueOf(this.c), Double.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Long.valueOf(this.g), Long.valueOf(this.m), Double.valueOf(this.n), Boolean.valueOf(this.o), Integer.valueOf(Arrays.hashCode(this.p)), Integer.valueOf(this.h), Integer.valueOf(this.q), String.valueOf(this.s), Integer.valueOf(this.i), this.j, Boolean.valueOf(this.k), this.t, this.u, this.l, this.v});
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        JSONObject jSONObject = this.s;
        this.r = jSONObject == null ? null : jSONObject.toString();
        int a2 = bxg.a(parcel, 20293);
        bxg.a(parcel, 2, (Parcelable) this.a, i2, false);
        bxg.a(parcel, 3, this.b);
        bxg.b(parcel, 4, this.c);
        bxg.a(parcel, 5, this.d);
        bxg.b(parcel, 6, this.e);
        bxg.b(parcel, 7, this.f);
        bxg.a(parcel, 8, this.g);
        bxg.a(parcel, 9, this.m);
        bxg.a(parcel, 10, this.n);
        bxg.a(parcel, 11, this.o);
        bxg.a(parcel, 12, this.p, false);
        bxg.b(parcel, 13, this.h);
        bxg.b(parcel, 14, this.q);
        bxg.a(parcel, 15, this.r, false);
        bxg.b(parcel, 16, this.i);
        bxg.b(parcel, 17, this.j, false);
        bxg.a(parcel, 18, this.k);
        bxg.a(parcel, 19, (Parcelable) this.t, i2, false);
        bxg.a(parcel, 20, (Parcelable) this.u, i2, false);
        bxg.b(parcel, a2);
    }
}
