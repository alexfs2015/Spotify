package defpackage;

import android.location.Location;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;

@cey
/* renamed from: chi reason: default package */
public final class chi {
    private static final SimpleDateFormat a = new SimpleDateFormat("yyyyMMdd", Locale.US);

    private static Integer a(boolean z) {
        return Integer.valueOf(z ? 1 : 0);
    }

    private static List<String> a(JSONArray jSONArray, List<String> list) {
        if (jSONArray == null) {
            return null;
        }
        if (list == null) {
            list = new ArrayList<>();
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            list.add(jSONArray.getString(i));
        }
        return list;
    }

    private static JSONArray a(List<String> list) {
        JSONArray jSONArray = new JSONArray();
        for (String put : list) {
            jSONArray.put(put);
        }
        return jSONArray;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject a(defpackage.cfy r7) {
        /*
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r7.a
            if (r1 == 0) goto L_0x0010
            java.lang.String r1 = r7.a
            java.lang.String r2 = "ad_base_url"
            r0.put(r2, r1)
        L_0x0010:
            java.lang.String r1 = r7.l
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = r7.l
            java.lang.String r2 = "ad_size"
            r0.put(r2, r1)
        L_0x001b:
            boolean r1 = r7.s
            java.lang.String r2 = "native"
            r0.put(r2, r1)
            boolean r1 = r7.s
            if (r1 == 0) goto L_0x002b
            java.lang.String r1 = r7.b
            java.lang.String r2 = "ad_json"
            goto L_0x002f
        L_0x002b:
            java.lang.String r1 = r7.b
            java.lang.String r2 = "ad_html"
        L_0x002f:
            r0.put(r2, r1)
            java.lang.String r1 = r7.n
            if (r1 == 0) goto L_0x003d
            java.lang.String r1 = r7.n
            java.lang.String r2 = "debug_dialog"
            r0.put(r2, r1)
        L_0x003d:
            java.lang.String r1 = r7.L
            if (r1 == 0) goto L_0x0048
            java.lang.String r1 = r7.L
            java.lang.String r2 = "debug_signals"
            r0.put(r2, r1)
        L_0x0048:
            long r1 = r7.f
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0061
            long r1 = r7.f
            double r1 = (double) r1
            r5 = 4652007308841189376(0x408f400000000000, double:1000.0)
            java.lang.Double.isNaN(r1)
            double r1 = r1 / r5
            java.lang.String r5 = "interstitial_timeout"
            r0.put(r5, r1)
        L_0x0061:
            int r1 = r7.k
            cmj r2 = defpackage.bjl.g()
            int r2 = r2.b()
            java.lang.String r5 = "orientation"
            if (r1 != r2) goto L_0x0075
            java.lang.String r1 = "portrait"
        L_0x0071:
            r0.put(r5, r1)
            goto L_0x0084
        L_0x0075:
            int r1 = r7.k
            cmj r2 = defpackage.bjl.g()
            int r2 = r2.a()
            if (r1 != r2) goto L_0x0084
            java.lang.String r1 = "landscape"
            goto L_0x0071
        L_0x0084:
            java.util.List<java.lang.String> r1 = r7.c
            if (r1 == 0) goto L_0x0093
            java.util.List<java.lang.String> r1 = r7.c
            org.json.JSONArray r1 = a(r1)
            java.lang.String r2 = "click_urls"
            r0.put(r2, r1)
        L_0x0093:
            java.util.List<java.lang.String> r1 = r7.e
            if (r1 == 0) goto L_0x00a2
            java.util.List<java.lang.String> r1 = r7.e
            org.json.JSONArray r1 = a(r1)
            java.lang.String r2 = "impression_urls"
            r0.put(r2, r1)
        L_0x00a2:
            java.util.List<java.lang.String> r1 = r7.R
            if (r1 == 0) goto L_0x00b1
            java.util.List<java.lang.String> r1 = r7.R
            org.json.JSONArray r1 = a(r1)
            java.lang.String r2 = "downloaded_impression_urls"
            r0.put(r2, r1)
        L_0x00b1:
            java.util.List<java.lang.String> r1 = r7.i
            if (r1 == 0) goto L_0x00c0
            java.util.List<java.lang.String> r1 = r7.i
            org.json.JSONArray r1 = a(r1)
            java.lang.String r2 = "manual_impression_urls"
            r0.put(r2, r1)
        L_0x00c0:
            java.lang.String r1 = r7.q
            if (r1 == 0) goto L_0x00cb
            java.lang.String r1 = r7.q
            java.lang.String r2 = "active_view"
            r0.put(r2, r1)
        L_0x00cb:
            boolean r1 = r7.o
            java.lang.String r2 = "ad_is_javascript"
            r0.put(r2, r1)
            java.lang.String r1 = r7.p
            if (r1 == 0) goto L_0x00dd
            java.lang.String r1 = r7.p
            java.lang.String r2 = "ad_passback_url"
            r0.put(r2, r1)
        L_0x00dd:
            boolean r1 = r7.g
            java.lang.String r2 = "mediation"
            r0.put(r2, r1)
            boolean r1 = r7.r
            java.lang.String r2 = "custom_render_allowed"
            r0.put(r2, r1)
            boolean r1 = r7.u
            java.lang.String r2 = "content_url_opted_out"
            r0.put(r2, r1)
            boolean r1 = r7.M
            java.lang.String r2 = "content_vertical_opted_out"
            r0.put(r2, r1)
            boolean r1 = r7.v
            java.lang.String r2 = "prefetch"
            r0.put(r2, r1)
            long r1 = r7.j
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x010d
            long r1 = r7.j
            java.lang.String r5 = "refresh_interval_milliseconds"
            r0.put(r5, r1)
        L_0x010d:
            long r1 = r7.h
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x011a
            long r1 = r7.h
            java.lang.String r3 = "mediation_config_cache_time_milliseconds"
            r0.put(r3, r1)
        L_0x011a:
            java.lang.String r1 = r7.x
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0129
            java.lang.String r1 = r7.x
            java.lang.String r2 = "gws_query_id"
            r0.put(r2, r1)
        L_0x0129:
            boolean r1 = r7.y
            if (r1 == 0) goto L_0x0130
            java.lang.String r1 = "height"
            goto L_0x0132
        L_0x0130:
            java.lang.String r1 = ""
        L_0x0132:
            java.lang.String r2 = "fluid"
            r0.put(r2, r1)
            boolean r1 = r7.z
            java.lang.String r2 = "native_express"
            r0.put(r2, r1)
            java.util.List<java.lang.String> r1 = r7.B
            if (r1 == 0) goto L_0x014d
            java.util.List<java.lang.String> r1 = r7.B
            org.json.JSONArray r1 = a(r1)
            java.lang.String r2 = "video_start_urls"
            r0.put(r2, r1)
        L_0x014d:
            java.util.List<java.lang.String> r1 = r7.C
            if (r1 == 0) goto L_0x015c
            java.util.List<java.lang.String> r1 = r7.C
            org.json.JSONArray r1 = a(r1)
            java.lang.String r2 = "video_complete_urls"
            r0.put(r2, r1)
        L_0x015c:
            cjx r1 = r7.A
            if (r1 == 0) goto L_0x0182
            cjx r1 = r7.A
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = r1.a
            java.lang.String r4 = "rb_type"
            r2.put(r4, r3)
            int r1 = r1.b
            java.lang.String r3 = "rb_amount"
            r2.put(r3, r1)
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            r1.put(r2)
            java.lang.String r2 = "rewards"
            r0.put(r2, r1)
        L_0x0182:
            boolean r1 = r7.D
            java.lang.String r2 = "use_displayed_impression"
            r0.put(r2, r1)
            cga r1 = r7.E
            java.lang.String r2 = "auto_protection_configuration"
            r0.put(r2, r1)
            boolean r1 = r7.I
            java.lang.String r2 = "render_in_browser"
            r0.put(r2, r1)
            boolean r7 = r7.S
            java.lang.String r1 = "disable_closable_area"
            r0.put(r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chi.a(cfy):org.json.JSONObject");
    }

    private static void a(HashMap<String, Object> hashMap, Location location) {
        HashMap hashMap2 = new HashMap();
        Float valueOf = Float.valueOf(location.getAccuracy() * 1000.0f);
        Long valueOf2 = Long.valueOf(location.getTime() * 1000);
        Long valueOf3 = Long.valueOf((long) (location.getLatitude() * 1.0E7d));
        Long valueOf4 = Long.valueOf((long) (location.getLongitude() * 1.0E7d));
        hashMap2.put("radius", valueOf);
        hashMap2.put("lat", valueOf3);
        hashMap2.put("long", valueOf4);
        hashMap2.put("time", valueOf2);
        hashMap.put("uule", hashMap2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:137:0x0252 A[Catch:{ JSONException -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x025f A[Catch:{ JSONException -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x05f2 A[Catch:{ JSONException -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x060f A[Catch:{ JSONException -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x061b A[Catch:{ JSONException -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x063d A[Catch:{ JSONException -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0661 A[Catch:{ JSONException -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x068a A[Catch:{ JSONException -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x06ac A[Catch:{ JSONException -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x06bd A[Catch:{ JSONException -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x06e3 A[Catch:{ JSONException -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x06fb A[Catch:{ JSONException -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x070a A[Catch:{ JSONException -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x0732 A[Catch:{ JSONException -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x07aa A[Catch:{ JSONException -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:306:0x07d4 A[Catch:{ JSONException -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x07f0 A[Catch:{ JSONException -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x07f3 A[Catch:{ JSONException -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x080c A[Catch:{ JSONException -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0817 A[Catch:{ JSONException -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0836 A[Catch:{ JSONException -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x083f A[Catch:{ JSONException -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x084c A[Catch:{ JSONException -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x087f A[Catch:{ JSONException -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x08ae A[Catch:{ JSONException -> 0x0904 }] */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x08d7 A[Catch:{ JSONException -> 0x0904 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject a(android.content.Context r23, defpackage.chb r24) {
        /*
            r1 = r24
            cfu r2 = r1.j
            android.location.Location r3 = r1.d
            chr r4 = r1.k
            android.os.Bundle r5 = r1.a
            org.json.JSONObject r6 = r1.l
            r8 = 5
            java.util.HashMap r9 = new java.util.HashMap     // Catch:{ JSONException -> 0x0904 }
            r9.<init>()     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r10 = "extra_caps"
            dsf<java.lang.String> r11 = defpackage.dsp.bR     // Catch:{ JSONException -> 0x0904 }
            dsn r12 = defpackage.dpn.f()     // Catch:{ JSONException -> 0x0904 }
            java.lang.Object r11 = r12.a(r11)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r10, r11)     // Catch:{ JSONException -> 0x0904 }
            java.util.List<java.lang.String> r10 = r1.c     // Catch:{ JSONException -> 0x0904 }
            int r10 = r10.size()     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r11 = ","
            if (r10 <= 0) goto L_0x0036
            java.lang.String r10 = "eid"
            java.util.List<java.lang.String> r12 = r1.c     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r12 = android.text.TextUtils.join(r11, r12)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r10, r12)     // Catch:{ JSONException -> 0x0904 }
        L_0x0036:
            android.os.Bundle r10 = r2.b     // Catch:{ JSONException -> 0x0904 }
            if (r10 == 0) goto L_0x0041
            java.lang.String r10 = "ad_pos"
            android.os.Bundle r12 = r2.b     // Catch:{ JSONException -> 0x0904 }
            r9.put(r10, r12)     // Catch:{ JSONException -> 0x0904 }
        L_0x0041:
            doy r10 = r2.c     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r12 = defpackage.clo.a()     // Catch:{ JSONException -> 0x0904 }
            if (r12 == 0) goto L_0x004e
            java.lang.String r13 = "abf"
            r9.put(r13, r12)     // Catch:{ JSONException -> 0x0904 }
        L_0x004e:
            long r12 = r10.b     // Catch:{ JSONException -> 0x0904 }
            r14 = -1
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 == 0) goto L_0x0068
            java.lang.String r12 = "cust_age"
            java.text.SimpleDateFormat r13 = a     // Catch:{ JSONException -> 0x0904 }
            java.util.Date r7 = new java.util.Date     // Catch:{ JSONException -> 0x0904 }
            long r14 = r10.b     // Catch:{ JSONException -> 0x0904 }
            r7.<init>(r14)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r7 = r13.format(r7)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r12, r7)     // Catch:{ JSONException -> 0x0904 }
        L_0x0068:
            android.os.Bundle r7 = r10.c     // Catch:{ JSONException -> 0x0904 }
            if (r7 == 0) goto L_0x0073
            java.lang.String r7 = "extras"
            android.os.Bundle r12 = r10.c     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r12)     // Catch:{ JSONException -> 0x0904 }
        L_0x0073:
            int r7 = r10.d     // Catch:{ JSONException -> 0x0904 }
            r12 = -1
            if (r7 == r12) goto L_0x0083
            java.lang.String r7 = "cust_gender"
            int r13 = r10.d     // Catch:{ JSONException -> 0x0904 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r13)     // Catch:{ JSONException -> 0x0904 }
        L_0x0083:
            java.util.List<java.lang.String> r7 = r10.e     // Catch:{ JSONException -> 0x0904 }
            if (r7 == 0) goto L_0x008e
            java.lang.String r7 = "kw"
            java.util.List<java.lang.String> r13 = r10.e     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r13)     // Catch:{ JSONException -> 0x0904 }
        L_0x008e:
            int r7 = r10.g     // Catch:{ JSONException -> 0x0904 }
            if (r7 == r12) goto L_0x009d
            java.lang.String r7 = "tag_for_child_directed_treatment"
            int r13 = r10.g     // Catch:{ JSONException -> 0x0904 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r13)     // Catch:{ JSONException -> 0x0904 }
        L_0x009d:
            boolean r7 = r10.f     // Catch:{ JSONException -> 0x0904 }
            if (r7 == 0) goto L_0x00c0
            dsf<java.lang.Boolean> r7 = defpackage.dsp.di     // Catch:{ JSONException -> 0x0904 }
            dsn r13 = defpackage.dpn.f()     // Catch:{ JSONException -> 0x0904 }
            java.lang.Object r7 = r13.a(r7)     // Catch:{ JSONException -> 0x0904 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ JSONException -> 0x0904 }
            boolean r7 = r7.booleanValue()     // Catch:{ JSONException -> 0x0904 }
            if (r7 == 0) goto L_0x00bb
            java.lang.String r7 = "test_request"
            java.lang.Boolean r13 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x0904 }
        L_0x00b7:
            r9.put(r7, r13)     // Catch:{ JSONException -> 0x0904 }
            goto L_0x00c0
        L_0x00bb:
            java.lang.String r7 = "adtest"
            java.lang.String r13 = "on"
            goto L_0x00b7
        L_0x00c0:
            int r7 = r10.a     // Catch:{ JSONException -> 0x0904 }
            r13 = 2
            r14 = 1
            if (r7 < r13) goto L_0x00e2
            boolean r7 = r10.h     // Catch:{ JSONException -> 0x0904 }
            if (r7 == 0) goto L_0x00d3
            java.lang.String r7 = "d_imp_hdr"
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r15)     // Catch:{ JSONException -> 0x0904 }
        L_0x00d3:
            java.lang.String r7 = r10.i     // Catch:{ JSONException -> 0x0904 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x0904 }
            if (r7 != 0) goto L_0x00e2
            java.lang.String r7 = "ppid"
            java.lang.String r15 = r10.i     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r15)     // Catch:{ JSONException -> 0x0904 }
        L_0x00e2:
            int r7 = r10.a     // Catch:{ JSONException -> 0x0904 }
            r15 = 3
            if (r7 < r15) goto L_0x00f2
            java.lang.String r7 = r10.l     // Catch:{ JSONException -> 0x0904 }
            if (r7 == 0) goto L_0x00f2
            java.lang.String r7 = "url"
            java.lang.String r15 = r10.l     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r15)     // Catch:{ JSONException -> 0x0904 }
        L_0x00f2:
            int r7 = r10.a     // Catch:{ JSONException -> 0x0904 }
            if (r7 < r8) goto L_0x0117
            android.os.Bundle r7 = r10.n     // Catch:{ JSONException -> 0x0904 }
            if (r7 == 0) goto L_0x0101
            java.lang.String r7 = "custom_targeting"
            android.os.Bundle r15 = r10.n     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r15)     // Catch:{ JSONException -> 0x0904 }
        L_0x0101:
            java.util.List<java.lang.String> r7 = r10.o     // Catch:{ JSONException -> 0x0904 }
            if (r7 == 0) goto L_0x010c
            java.lang.String r7 = "category_exclusions"
            java.util.List<java.lang.String> r15 = r10.o     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r15)     // Catch:{ JSONException -> 0x0904 }
        L_0x010c:
            java.lang.String r7 = r10.p     // Catch:{ JSONException -> 0x0904 }
            if (r7 == 0) goto L_0x0117
            java.lang.String r7 = "request_agent"
            java.lang.String r15 = r10.p     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r15)     // Catch:{ JSONException -> 0x0904 }
        L_0x0117:
            int r7 = r10.a     // Catch:{ JSONException -> 0x0904 }
            r15 = 6
            if (r7 < r15) goto L_0x0127
            java.lang.String r7 = r10.q     // Catch:{ JSONException -> 0x0904 }
            if (r7 == 0) goto L_0x0127
            java.lang.String r7 = "request_pkg"
            java.lang.String r15 = r10.q     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r15)     // Catch:{ JSONException -> 0x0904 }
        L_0x0127:
            int r7 = r10.a     // Catch:{ JSONException -> 0x0904 }
            r15 = 7
            if (r7 < r15) goto L_0x0137
            java.lang.String r7 = "is_designed_for_families"
            boolean r10 = r10.r     // Catch:{ JSONException -> 0x0904 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r10)     // Catch:{ JSONException -> 0x0904 }
        L_0x0137:
            dpc r7 = r2.d     // Catch:{ JSONException -> 0x0904 }
            dpc[] r7 = r7.g     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r10 = "height"
            java.lang.String r15 = "fluid"
            java.lang.String r8 = "format"
            if (r7 != 0) goto L_0x0154
            dpc r7 = r2.d     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r7 = r7.a     // Catch:{ JSONException -> 0x0904 }
            r9.put(r8, r7)     // Catch:{ JSONException -> 0x0904 }
            dpc r7 = r2.d     // Catch:{ JSONException -> 0x0904 }
            boolean r7 = r7.i     // Catch:{ JSONException -> 0x0904 }
            if (r7 == 0) goto L_0x0186
            r9.put(r15, r10)     // Catch:{ JSONException -> 0x0904 }
            goto L_0x0186
        L_0x0154:
            dpc r7 = r2.d     // Catch:{ JSONException -> 0x0904 }
            dpc[] r7 = r7.g     // Catch:{ JSONException -> 0x0904 }
            int r14 = r7.length     // Catch:{ JSONException -> 0x0904 }
            r13 = 0
            r20 = 0
            r21 = 0
        L_0x015e:
            if (r13 >= r14) goto L_0x0186
            r12 = r7[r13]     // Catch:{ JSONException -> 0x0904 }
            r22 = r7
            boolean r7 = r12.i     // Catch:{ JSONException -> 0x0904 }
            if (r7 != 0) goto L_0x0171
            if (r20 != 0) goto L_0x0171
            java.lang.String r7 = r12.a     // Catch:{ JSONException -> 0x0904 }
            r9.put(r8, r7)     // Catch:{ JSONException -> 0x0904 }
            r20 = 1
        L_0x0171:
            boolean r7 = r12.i     // Catch:{ JSONException -> 0x0904 }
            if (r7 == 0) goto L_0x017c
            if (r21 != 0) goto L_0x017c
            r9.put(r15, r10)     // Catch:{ JSONException -> 0x0904 }
            r21 = 1
        L_0x017c:
            if (r20 == 0) goto L_0x0180
            if (r21 != 0) goto L_0x0186
        L_0x0180:
            int r13 = r13 + 1
            r7 = r22
            r12 = -1
            goto L_0x015e
        L_0x0186:
            dpc r7 = r2.d     // Catch:{ JSONException -> 0x0904 }
            int r7 = r7.e     // Catch:{ JSONException -> 0x0904 }
            r8 = -1
            if (r7 != r8) goto L_0x0194
            java.lang.String r7 = "smart_w"
            java.lang.String r8 = "full"
            r9.put(r7, r8)     // Catch:{ JSONException -> 0x0904 }
        L_0x0194:
            dpc r7 = r2.d     // Catch:{ JSONException -> 0x0904 }
            int r7 = r7.b     // Catch:{ JSONException -> 0x0904 }
            r8 = -2
            if (r7 != r8) goto L_0x01a2
            java.lang.String r7 = "smart_h"
            java.lang.String r10 = "auto"
            r9.put(r7, r10)     // Catch:{ JSONException -> 0x0904 }
        L_0x01a2:
            dpc r7 = r2.d     // Catch:{ JSONException -> 0x0904 }
            dpc[] r7 = r7.g     // Catch:{ JSONException -> 0x0904 }
            if (r7 == 0) goto L_0x0216
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0904 }
            r7.<init>()     // Catch:{ JSONException -> 0x0904 }
            dpc r10 = r2.d     // Catch:{ JSONException -> 0x0904 }
            dpc[] r10 = r10.g     // Catch:{ JSONException -> 0x0904 }
            int r12 = r10.length     // Catch:{ JSONException -> 0x0904 }
            r13 = 0
            r14 = 0
        L_0x01b4:
            if (r13 >= r12) goto L_0x01fc
            r15 = r10[r13]     // Catch:{ JSONException -> 0x0904 }
            boolean r8 = r15.i     // Catch:{ JSONException -> 0x0904 }
            if (r8 == 0) goto L_0x01c0
            r21 = r10
            r14 = 1
            goto L_0x01f6
        L_0x01c0:
            int r8 = r7.length()     // Catch:{ JSONException -> 0x0904 }
            if (r8 == 0) goto L_0x01cb
            java.lang.String r8 = "|"
            r7.append(r8)     // Catch:{ JSONException -> 0x0904 }
        L_0x01cb:
            int r8 = r15.e     // Catch:{ JSONException -> 0x0904 }
            r21 = r10
            r10 = -1
            if (r8 != r10) goto L_0x01da
            int r8 = r15.f     // Catch:{ JSONException -> 0x0904 }
            float r8 = (float) r8     // Catch:{ JSONException -> 0x0904 }
            float r10 = r4.s     // Catch:{ JSONException -> 0x0904 }
            float r8 = r8 / r10
            int r8 = (int) r8     // Catch:{ JSONException -> 0x0904 }
            goto L_0x01dc
        L_0x01da:
            int r8 = r15.e     // Catch:{ JSONException -> 0x0904 }
        L_0x01dc:
            r7.append(r8)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r8 = "x"
            r7.append(r8)     // Catch:{ JSONException -> 0x0904 }
            int r8 = r15.b     // Catch:{ JSONException -> 0x0904 }
            r10 = -2
            if (r8 != r10) goto L_0x01f1
            int r8 = r15.c     // Catch:{ JSONException -> 0x0904 }
            float r8 = (float) r8     // Catch:{ JSONException -> 0x0904 }
            float r10 = r4.s     // Catch:{ JSONException -> 0x0904 }
            float r8 = r8 / r10
            int r8 = (int) r8     // Catch:{ JSONException -> 0x0904 }
            goto L_0x01f3
        L_0x01f1:
            int r8 = r15.b     // Catch:{ JSONException -> 0x0904 }
        L_0x01f3:
            r7.append(r8)     // Catch:{ JSONException -> 0x0904 }
        L_0x01f6:
            int r13 = r13 + 1
            r10 = r21
            r8 = -2
            goto L_0x01b4
        L_0x01fc:
            if (r14 == 0) goto L_0x0211
            int r8 = r7.length()     // Catch:{ JSONException -> 0x0904 }
            if (r8 == 0) goto L_0x020b
            java.lang.String r8 = "|"
            r10 = 0
            r7.insert(r10, r8)     // Catch:{ JSONException -> 0x0904 }
            goto L_0x020c
        L_0x020b:
            r10 = 0
        L_0x020c:
            java.lang.String r8 = "320x50"
            r7.insert(r10, r8)     // Catch:{ JSONException -> 0x0904 }
        L_0x0211:
            java.lang.String r8 = "sz"
            r9.put(r8, r7)     // Catch:{ JSONException -> 0x0904 }
        L_0x0216:
            int r7 = r2.m     // Catch:{ JSONException -> 0x0904 }
            if (r7 == 0) goto L_0x0283
            java.lang.String r7 = "native_version"
            int r8 = r2.m     // Catch:{ JSONException -> 0x0904 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r8)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r7 = "native_templates"
            java.util.List<java.lang.String> r8 = r2.n     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r8)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r7 = "native_image_orientation"
            dup r8 = r2.y     // Catch:{ JSONException -> 0x0904 }
            if (r8 != 0) goto L_0x0235
        L_0x0232:
            java.lang.String r8 = "any"
            goto L_0x0247
        L_0x0235:
            int r8 = r8.c     // Catch:{ JSONException -> 0x0904 }
            if (r8 == 0) goto L_0x0232
            r10 = 1
            if (r8 == r10) goto L_0x0245
            r10 = 2
            if (r8 == r10) goto L_0x0242
            java.lang.String r8 = "not_set"
            goto L_0x0247
        L_0x0242:
            java.lang.String r8 = "landscape"
            goto L_0x0247
        L_0x0245:
            java.lang.String r8 = "portrait"
        L_0x0247:
            r9.put(r7, r8)     // Catch:{ JSONException -> 0x0904 }
            java.util.List<java.lang.String> r7 = r2.z     // Catch:{ JSONException -> 0x0904 }
            boolean r7 = r7.isEmpty()     // Catch:{ JSONException -> 0x0904 }
            if (r7 != 0) goto L_0x0259
            java.lang.String r7 = "native_custom_templates"
            java.util.List<java.lang.String> r8 = r2.z     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r8)     // Catch:{ JSONException -> 0x0904 }
        L_0x0259:
            int r7 = r2.a     // Catch:{ JSONException -> 0x0904 }
            r8 = 24
            if (r7 < r8) goto L_0x026a
            java.lang.String r7 = "max_num_ads"
            int r8 = r2.Y     // Catch:{ JSONException -> 0x0904 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r8)     // Catch:{ JSONException -> 0x0904 }
        L_0x026a:
            java.lang.String r7 = r2.W     // Catch:{ JSONException -> 0x0904 }
            boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x0904 }
            if (r7 != 0) goto L_0x0283
            java.lang.String r7 = "native_advanced_settings"
            org.json.JSONArray r8 = new org.json.JSONArray     // Catch:{ JSONException -> 0x027f }
            java.lang.String r10 = r2.W     // Catch:{ JSONException -> 0x027f }
            r8.<init>(r10)     // Catch:{ JSONException -> 0x027f }
            r9.put(r7, r8)     // Catch:{ JSONException -> 0x027f }
            goto L_0x0283
        L_0x027f:
            r7 = 5
            defpackage.cow.a(r7)     // Catch:{ JSONException -> 0x0904 }
        L_0x0283:
            java.util.List<java.lang.Integer> r7 = r2.V     // Catch:{ JSONException -> 0x0904 }
            if (r7 == 0) goto L_0x02bc
            java.util.List<java.lang.Integer> r7 = r2.V     // Catch:{ JSONException -> 0x0904 }
            int r7 = r7.size()     // Catch:{ JSONException -> 0x0904 }
            if (r7 <= 0) goto L_0x02bc
            java.util.List<java.lang.Integer> r7 = r2.V     // Catch:{ JSONException -> 0x0904 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ JSONException -> 0x0904 }
        L_0x0295:
            boolean r8 = r7.hasNext()     // Catch:{ JSONException -> 0x0904 }
            if (r8 == 0) goto L_0x02bc
            java.lang.Object r8 = r7.next()     // Catch:{ JSONException -> 0x0904 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ JSONException -> 0x0904 }
            int r10 = r8.intValue()     // Catch:{ JSONException -> 0x0904 }
            r12 = 2
            if (r10 != r12) goto L_0x02b0
            java.lang.String r8 = "iba"
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x0904 }
        L_0x02ac:
            r9.put(r8, r10)     // Catch:{ JSONException -> 0x0904 }
            goto L_0x0295
        L_0x02b0:
            int r8 = r8.intValue()     // Catch:{ JSONException -> 0x0904 }
            r10 = 1
            if (r8 != r10) goto L_0x0295
            java.lang.String r8 = "ina"
            java.lang.Boolean r10 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x0904 }
            goto L_0x02ac
        L_0x02bc:
            dpc r7 = r2.d     // Catch:{ JSONException -> 0x0904 }
            boolean r7 = r7.j     // Catch:{ JSONException -> 0x0904 }
            if (r7 == 0) goto L_0x02c9
            java.lang.String r7 = "ene"
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r8)     // Catch:{ JSONException -> 0x0904 }
        L_0x02c9:
            dsf<java.lang.Boolean> r7 = defpackage.dsp.av     // Catch:{ JSONException -> 0x0904 }
            dsn r8 = defpackage.dpn.f()     // Catch:{ JSONException -> 0x0904 }
            java.lang.Object r7 = r8.a(r7)     // Catch:{ JSONException -> 0x0904 }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ JSONException -> 0x0904 }
            boolean r7 = r7.booleanValue()     // Catch:{ JSONException -> 0x0904 }
            if (r7 == 0) goto L_0x02e2
            java.lang.String r7 = "xsrve"
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r8)     // Catch:{ JSONException -> 0x0904 }
        L_0x02e2:
            drf r7 = r2.O     // Catch:{ JSONException -> 0x0904 }
            if (r7 == 0) goto L_0x02fa
            java.lang.String r7 = "is_icon_ad"
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r8)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r7 = "icon_ad_expansion_behavior"
            drf r8 = r2.O     // Catch:{ JSONException -> 0x0904 }
            int r8 = r8.a     // Catch:{ JSONException -> 0x0904 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r8)     // Catch:{ JSONException -> 0x0904 }
        L_0x02fa:
            java.lang.String r7 = "slotname"
            java.lang.String r8 = r2.e     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r8)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r7 = "pn"
            android.content.pm.ApplicationInfo r8 = r2.f     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r8 = r8.packageName     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r8)     // Catch:{ JSONException -> 0x0904 }
            android.content.pm.PackageInfo r7 = r2.g     // Catch:{ JSONException -> 0x0904 }
            if (r7 == 0) goto L_0x031b
            java.lang.String r7 = "vc"
            android.content.pm.PackageInfo r8 = r2.g     // Catch:{ JSONException -> 0x0904 }
            int r8 = r8.versionCode     // Catch:{ JSONException -> 0x0904 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r8)     // Catch:{ JSONException -> 0x0904 }
        L_0x031b:
            java.lang.String r7 = "ms"
            java.lang.String r8 = r1.h     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r8)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r7 = "seq_num"
            java.lang.String r8 = r2.i     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r8)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r7 = "session_id"
            java.lang.String r8 = r2.j     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r8)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r7 = "js"
            coy r8 = r2.k     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r8 = r8.a     // Catch:{ JSONException -> 0x0904 }
            r9.put(r7, r8)     // Catch:{ JSONException -> 0x0904 }
            cib r7 = r1.e     // Catch:{ JSONException -> 0x0904 }
            android.os.Bundle r8 = r2.M     // Catch:{ JSONException -> 0x0904 }
            android.os.Bundle r10 = r1.b     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r12 = "am"
            int r13 = r4.a     // Catch:{ JSONException -> 0x0904 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r12, r13)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r12 = "cog"
            boolean r13 = r4.b     // Catch:{ JSONException -> 0x0904 }
            java.lang.Integer r13 = a(r13)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r12, r13)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r12 = "coh"
            boolean r13 = r4.c     // Catch:{ JSONException -> 0x0904 }
            java.lang.Integer r13 = a(r13)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r12, r13)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r12 = r4.d     // Catch:{ JSONException -> 0x0904 }
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch:{ JSONException -> 0x0904 }
            if (r12 != 0) goto L_0x036f
            java.lang.String r12 = "carrier"
            java.lang.String r13 = r4.d     // Catch:{ JSONException -> 0x0904 }
            r9.put(r12, r13)     // Catch:{ JSONException -> 0x0904 }
        L_0x036f:
            java.lang.String r12 = "gl"
            java.lang.String r13 = r4.e     // Catch:{ JSONException -> 0x0904 }
            r9.put(r12, r13)     // Catch:{ JSONException -> 0x0904 }
            boolean r12 = r4.f     // Catch:{ JSONException -> 0x0904 }
            if (r12 == 0) goto L_0x0384
            java.lang.String r12 = "simulator"
            r13 = 1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r12, r14)     // Catch:{ JSONException -> 0x0904 }
        L_0x0384:
            boolean r12 = r4.g     // Catch:{ JSONException -> 0x0904 }
            if (r12 == 0) goto L_0x0393
            java.lang.String r12 = "is_sidewinder"
            r13 = 1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r13)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r12, r14)     // Catch:{ JSONException -> 0x0904 }
            goto L_0x0394
        L_0x0393:
            r13 = 1
        L_0x0394:
            java.lang.String r12 = "ma"
            boolean r14 = r4.h     // Catch:{ JSONException -> 0x0904 }
            java.lang.Integer r14 = a(r14)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r12, r14)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r12 = "sp"
            boolean r14 = r4.i     // Catch:{ JSONException -> 0x0904 }
            java.lang.Integer r14 = a(r14)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r12, r14)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r12 = "hl"
            java.lang.String r14 = r4.j     // Catch:{ JSONException -> 0x0904 }
            r9.put(r12, r14)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r12 = r4.k     // Catch:{ JSONException -> 0x0904 }
            boolean r12 = android.text.TextUtils.isEmpty(r12)     // Catch:{ JSONException -> 0x0904 }
            if (r12 != 0) goto L_0x03c0
            java.lang.String r12 = "mv"
            java.lang.String r14 = r4.k     // Catch:{ JSONException -> 0x0904 }
            r9.put(r12, r14)     // Catch:{ JSONException -> 0x0904 }
        L_0x03c0:
            java.lang.String r12 = "muv"
            int r14 = r4.m     // Catch:{ JSONException -> 0x0904 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r12, r14)     // Catch:{ JSONException -> 0x0904 }
            int r12 = r4.n     // Catch:{ JSONException -> 0x0904 }
            r14 = -2
            if (r12 == r14) goto L_0x03db
            java.lang.String r12 = "cnt"
            int r14 = r4.n     // Catch:{ JSONException -> 0x0904 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r12, r14)     // Catch:{ JSONException -> 0x0904 }
        L_0x03db:
            java.lang.String r12 = "gnt"
            int r14 = r4.o     // Catch:{ JSONException -> 0x0904 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r12, r14)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r12 = "pt"
            int r14 = r4.p     // Catch:{ JSONException -> 0x0904 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r12, r14)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r12 = "rm"
            int r14 = r4.q     // Catch:{ JSONException -> 0x0904 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r12, r14)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r12 = "riv"
            int r14 = r4.r     // Catch:{ JSONException -> 0x0904 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r12, r14)     // Catch:{ JSONException -> 0x0904 }
            android.os.Bundle r12 = new android.os.Bundle     // Catch:{ JSONException -> 0x0904 }
            r12.<init>()     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r14 = "build_build"
            java.lang.String r15 = r4.z     // Catch:{ JSONException -> 0x0904 }
            r12.putString(r14, r15)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r14 = "build_device"
            java.lang.String r15 = r4.A     // Catch:{ JSONException -> 0x0904 }
            r12.putString(r14, r15)     // Catch:{ JSONException -> 0x0904 }
            android.os.Bundle r14 = new android.os.Bundle     // Catch:{ JSONException -> 0x0904 }
            r14.<init>()     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r15 = "is_charging"
            boolean r13 = r4.w     // Catch:{ JSONException -> 0x0904 }
            r14.putBoolean(r15, r13)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r13 = "battery_level"
            r15 = r5
            r20 = r6
            double r5 = r4.v     // Catch:{ JSONException -> 0x0904 }
            r14.putDouble(r13, r5)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r5 = "battery"
            r12.putBundle(r5, r14)     // Catch:{ JSONException -> 0x0904 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ JSONException -> 0x0904 }
            r5.<init>()     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r6 = "active_network_state"
            int r13 = r4.y     // Catch:{ JSONException -> 0x0904 }
            r5.putInt(r6, r13)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r6 = "active_network_metered"
            boolean r13 = r4.x     // Catch:{ JSONException -> 0x0904 }
            r5.putBoolean(r6, r13)     // Catch:{ JSONException -> 0x0904 }
            if (r7 == 0) goto L_0x046c
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ JSONException -> 0x0904 }
            r6.<init>()     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r13 = "predicted_latency_micros"
            int r14 = r7.a     // Catch:{ JSONException -> 0x0904 }
            r6.putInt(r13, r14)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r13 = "predicted_down_throughput_bps"
            r21 = r15
            long r14 = r7.b     // Catch:{ JSONException -> 0x0904 }
            r6.putLong(r13, r14)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r13 = "predicted_up_throughput_bps"
            long r14 = r7.c     // Catch:{ JSONException -> 0x0904 }
            r6.putLong(r13, r14)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r7 = "predictions"
            r5.putBundle(r7, r6)     // Catch:{ JSONException -> 0x0904 }
            goto L_0x046e
        L_0x046c:
            r21 = r15
        L_0x046e:
            java.lang.String r6 = "network"
            r12.putBundle(r6, r5)     // Catch:{ JSONException -> 0x0904 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ JSONException -> 0x0904 }
            r5.<init>()     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r6 = "is_browser_custom_tabs_capable"
            boolean r7 = r4.B     // Catch:{ JSONException -> 0x0904 }
            r5.putBoolean(r6, r7)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r6 = "browser"
            r12.putBundle(r6, r5)     // Catch:{ JSONException -> 0x0904 }
            if (r8 == 0) goto L_0x053d
            java.lang.String r5 = "android_mem_info"
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ JSONException -> 0x0904 }
            r6.<init>()     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r7 = "runtime_free"
            java.lang.String r13 = "runtime_free_memory"
            r14 = -1
            long r17 = r8.getLong(r13, r14)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r13 = java.lang.Long.toString(r17)     // Catch:{ JSONException -> 0x0904 }
            r6.putString(r7, r13)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r7 = "runtime_max"
            java.lang.String r13 = "runtime_max_memory"
            long r17 = r8.getLong(r13, r14)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r13 = java.lang.Long.toString(r17)     // Catch:{ JSONException -> 0x0904 }
            r6.putString(r7, r13)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r7 = "runtime_total"
            java.lang.String r13 = "runtime_total_memory"
            long r13 = r8.getLong(r13, r14)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r13 = java.lang.Long.toString(r13)     // Catch:{ JSONException -> 0x0904 }
            r6.putString(r7, r13)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r7 = "web_view_count"
            java.lang.String r13 = "web_view_count"
            r14 = 0
            int r13 = r8.getInt(r13, r14)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x0904 }
            r6.putString(r7, r13)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r7 = "debug_memory_info"
            android.os.Parcelable r7 = r8.getParcelable(r7)     // Catch:{ JSONException -> 0x0904 }
            android.os.Debug$MemoryInfo r7 = (android.os.Debug.MemoryInfo) r7     // Catch:{ JSONException -> 0x0904 }
            if (r7 == 0) goto L_0x0539
            java.lang.String r8 = "debug_info_dalvik_private_dirty"
            int r13 = r7.dalvikPrivateDirty     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x0904 }
            r6.putString(r8, r13)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r8 = "debug_info_dalvik_pss"
            int r13 = r7.dalvikPss     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x0904 }
            r6.putString(r8, r13)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r8 = "debug_info_dalvik_shared_dirty"
            int r13 = r7.dalvikSharedDirty     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x0904 }
            r6.putString(r8, r13)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r8 = "debug_info_native_private_dirty"
            int r13 = r7.nativePrivateDirty     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x0904 }
            r6.putString(r8, r13)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r8 = "debug_info_native_pss"
            int r13 = r7.nativePss     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x0904 }
            r6.putString(r8, r13)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r8 = "debug_info_native_shared_dirty"
            int r13 = r7.nativeSharedDirty     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x0904 }
            r6.putString(r8, r13)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r8 = "debug_info_other_private_dirty"
            int r13 = r7.otherPrivateDirty     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x0904 }
            r6.putString(r8, r13)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r8 = "debug_info_other_pss"
            int r13 = r7.otherPss     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ JSONException -> 0x0904 }
            r6.putString(r8, r13)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r8 = "debug_info_other_shared_dirty"
            int r7 = r7.otherSharedDirty     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ JSONException -> 0x0904 }
            r6.putString(r8, r7)     // Catch:{ JSONException -> 0x0904 }
        L_0x0539:
            r12.putBundle(r5, r6)     // Catch:{ JSONException -> 0x0904 }
            goto L_0x053e
        L_0x053d:
            r14 = 0
        L_0x053e:
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ JSONException -> 0x0904 }
            r5.<init>()     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r6 = "parental_controls"
            r5.putBundle(r6, r10)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r6 = r4.l     // Catch:{ JSONException -> 0x0904 }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ JSONException -> 0x0904 }
            if (r6 != 0) goto L_0x0557
            java.lang.String r6 = "package_version"
            java.lang.String r7 = r4.l     // Catch:{ JSONException -> 0x0904 }
            r5.putString(r6, r7)     // Catch:{ JSONException -> 0x0904 }
        L_0x0557:
            java.lang.String r6 = "play_store"
            r12.putBundle(r6, r5)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r5 = "device"
            r9.put(r5, r12)     // Catch:{ JSONException -> 0x0904 }
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ JSONException -> 0x0904 }
            r5.<init>()     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r6 = "doritos"
            java.lang.String r7 = r1.f     // Catch:{ JSONException -> 0x0904 }
            r5.putString(r6, r7)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r6 = "doritos_v2"
            java.lang.String r7 = r1.g     // Catch:{ JSONException -> 0x0904 }
            r5.putString(r6, r7)     // Catch:{ JSONException -> 0x0904 }
            dsf<java.lang.Boolean> r6 = defpackage.dsp.aH     // Catch:{ JSONException -> 0x0904 }
            dsn r7 = defpackage.dpn.f()     // Catch:{ JSONException -> 0x0904 }
            java.lang.Object r6 = r7.a(r6)     // Catch:{ JSONException -> 0x0904 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ JSONException -> 0x0904 }
            boolean r6 = r6.booleanValue()     // Catch:{ JSONException -> 0x0904 }
            if (r6 == 0) goto L_0x05c2
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r6 = r1.i     // Catch:{ JSONException -> 0x0904 }
            if (r6 == 0) goto L_0x0597
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r6 = r1.i     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r7 = r6.getId()     // Catch:{ JSONException -> 0x0904 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r6 = r1.i     // Catch:{ JSONException -> 0x0904 }
            boolean r13 = r6.isLimitAdTrackingEnabled()     // Catch:{ JSONException -> 0x0904 }
            goto L_0x0599
        L_0x0597:
            r7 = 0
            r13 = 0
        L_0x0599:
            boolean r6 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x0904 }
            if (r6 != 0) goto L_0x05b1
            java.lang.String r6 = "rdid"
            r5.putString(r6, r7)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r6 = "is_lat"
            r5.putBoolean(r6, r13)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r6 = "idtype"
            java.lang.String r7 = "adid"
        L_0x05ad:
            r5.putString(r6, r7)     // Catch:{ JSONException -> 0x0904 }
            goto L_0x05c2
        L_0x05b1:
            defpackage.dpn.a()     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r6 = defpackage.col.b(r23)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r7 = "pdid"
            r5.putString(r7, r6)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r6 = "pdidtype"
            java.lang.String r7 = "ssaid"
            goto L_0x05ad
        L_0x05c2:
            java.lang.String r6 = "pii"
            r9.put(r6, r5)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r5 = "platform"
            java.lang.String r6 = android.os.Build.MANUFACTURER     // Catch:{ JSONException -> 0x0904 }
            r9.put(r5, r6)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r5 = "submodel"
            java.lang.String r6 = android.os.Build.MODEL     // Catch:{ JSONException -> 0x0904 }
            r9.put(r5, r6)     // Catch:{ JSONException -> 0x0904 }
            if (r3 == 0) goto L_0x05db
        L_0x05d7:
            a(r9, r3)     // Catch:{ JSONException -> 0x0904 }
            goto L_0x05ed
        L_0x05db:
            doy r3 = r2.c     // Catch:{ JSONException -> 0x0904 }
            int r3 = r3.a     // Catch:{ JSONException -> 0x0904 }
            r5 = 2
            if (r3 < r5) goto L_0x05ed
            doy r3 = r2.c     // Catch:{ JSONException -> 0x0904 }
            android.location.Location r3 = r3.k     // Catch:{ JSONException -> 0x0904 }
            if (r3 == 0) goto L_0x05ed
            doy r3 = r2.c     // Catch:{ JSONException -> 0x0904 }
            android.location.Location r3 = r3.k     // Catch:{ JSONException -> 0x0904 }
            goto L_0x05d7
        L_0x05ed:
            int r3 = r2.a     // Catch:{ JSONException -> 0x0904 }
            r5 = 2
            if (r3 < r5) goto L_0x05f9
            java.lang.String r3 = "quality_signals"
            android.os.Bundle r5 = r2.l     // Catch:{ JSONException -> 0x0904 }
            r9.put(r3, r5)     // Catch:{ JSONException -> 0x0904 }
        L_0x05f9:
            int r3 = r2.a     // Catch:{ JSONException -> 0x0904 }
            r5 = 4
            if (r3 < r5) goto L_0x060d
            boolean r3 = r2.p     // Catch:{ JSONException -> 0x0904 }
            if (r3 == 0) goto L_0x060d
            java.lang.String r3 = "forceHttps"
            boolean r5 = r2.p     // Catch:{ JSONException -> 0x0904 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r3, r5)     // Catch:{ JSONException -> 0x0904 }
        L_0x060d:
            if (r21 == 0) goto L_0x0616
            java.lang.String r3 = "content_info"
            r5 = r21
            r9.put(r3, r5)     // Catch:{ JSONException -> 0x0904 }
        L_0x0616:
            int r3 = r2.a     // Catch:{ JSONException -> 0x0904 }
            r5 = 5
            if (r3 < r5) goto L_0x063d
            java.lang.String r3 = "u_sd"
            float r4 = r2.s     // Catch:{ JSONException -> 0x0904 }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r3, r4)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r3 = "sh"
            int r4 = r2.r     // Catch:{ JSONException -> 0x0904 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r3, r4)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r3 = "sw"
            int r4 = r2.q     // Catch:{ JSONException -> 0x0904 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x0904 }
        L_0x0639:
            r9.put(r3, r4)     // Catch:{ JSONException -> 0x0904 }
            goto L_0x065c
        L_0x063d:
            java.lang.String r3 = "u_sd"
            float r5 = r4.s     // Catch:{ JSONException -> 0x0904 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r3, r5)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r3 = "sh"
            int r5 = r4.u     // Catch:{ JSONException -> 0x0904 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r3, r5)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r3 = "sw"
            int r4 = r4.t     // Catch:{ JSONException -> 0x0904 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x0904 }
            goto L_0x0639
        L_0x065c:
            int r3 = r2.a     // Catch:{ JSONException -> 0x0904 }
            r4 = 6
            if (r3 < r4) goto L_0x0685
            java.lang.String r3 = r2.t     // Catch:{ JSONException -> 0x0904 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x0904 }
            if (r3 != 0) goto L_0x067a
            java.lang.String r3 = "view_hierarchy"
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0676 }
            java.lang.String r5 = r2.t     // Catch:{ JSONException -> 0x0676 }
            r4.<init>(r5)     // Catch:{ JSONException -> 0x0676 }
            r9.put(r3, r4)     // Catch:{ JSONException -> 0x0676 }
            goto L_0x067a
        L_0x0676:
            r3 = 5
            defpackage.cow.a(r3)     // Catch:{ JSONException -> 0x0904 }
        L_0x067a:
            java.lang.String r3 = "correlation_id"
            long r4 = r2.u     // Catch:{ JSONException -> 0x0904 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r3, r4)     // Catch:{ JSONException -> 0x0904 }
        L_0x0685:
            int r3 = r2.a     // Catch:{ JSONException -> 0x0904 }
            r4 = 7
            if (r3 < r4) goto L_0x0691
            java.lang.String r3 = "request_id"
            java.lang.String r4 = r2.v     // Catch:{ JSONException -> 0x0904 }
            r9.put(r3, r4)     // Catch:{ JSONException -> 0x0904 }
        L_0x0691:
            int r3 = r2.a     // Catch:{ JSONException -> 0x0904 }
            r4 = 12
            if (r3 < r4) goto L_0x06a6
            java.lang.String r3 = r2.B     // Catch:{ JSONException -> 0x0904 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x0904 }
            if (r3 != 0) goto L_0x06a6
            java.lang.String r3 = "anchor"
            java.lang.String r4 = r2.B     // Catch:{ JSONException -> 0x0904 }
            r9.put(r3, r4)     // Catch:{ JSONException -> 0x0904 }
        L_0x06a6:
            int r3 = r2.a     // Catch:{ JSONException -> 0x0904 }
            r4 = 13
            if (r3 < r4) goto L_0x06b7
            java.lang.String r3 = "android_app_volume"
            float r4 = r2.C     // Catch:{ JSONException -> 0x0904 }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r3, r4)     // Catch:{ JSONException -> 0x0904 }
        L_0x06b7:
            int r3 = r2.a     // Catch:{ JSONException -> 0x0904 }
            r4 = 18
            if (r3 < r4) goto L_0x06c8
            java.lang.String r3 = "android_app_muted"
            boolean r5 = r2.I     // Catch:{ JSONException -> 0x0904 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r3, r5)     // Catch:{ JSONException -> 0x0904 }
        L_0x06c8:
            int r3 = r2.a     // Catch:{ JSONException -> 0x0904 }
            r5 = 14
            if (r3 < r5) goto L_0x06dd
            int r3 = r2.D     // Catch:{ JSONException -> 0x0904 }
            if (r3 <= 0) goto L_0x06dd
            java.lang.String r3 = "target_api"
            int r5 = r2.D     // Catch:{ JSONException -> 0x0904 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r3, r5)     // Catch:{ JSONException -> 0x0904 }
        L_0x06dd:
            int r3 = r2.a     // Catch:{ JSONException -> 0x0904 }
            r5 = 15
            if (r3 < r5) goto L_0x06f5
            java.lang.String r3 = "scroll_index"
            int r5 = r2.E     // Catch:{ JSONException -> 0x0904 }
            r8 = -1
            if (r5 != r8) goto L_0x06eb
            goto L_0x06ee
        L_0x06eb:
            int r12 = r2.E     // Catch:{ JSONException -> 0x0904 }
            r8 = r12
        L_0x06ee:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r3, r5)     // Catch:{ JSONException -> 0x0904 }
        L_0x06f5:
            int r3 = r2.a     // Catch:{ JSONException -> 0x0904 }
            r5 = 16
            if (r3 < r5) goto L_0x0706
            java.lang.String r3 = "_activity_context"
            boolean r5 = r2.F     // Catch:{ JSONException -> 0x0904 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r3, r5)     // Catch:{ JSONException -> 0x0904 }
        L_0x0706:
            int r3 = r2.a     // Catch:{ JSONException -> 0x0904 }
            if (r3 < r4) goto L_0x072e
            java.lang.String r3 = r2.J     // Catch:{ JSONException -> 0x0904 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x0904 }
            if (r3 != 0) goto L_0x0723
            java.lang.String r3 = "app_settings"
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x071f }
            java.lang.String r6 = r2.J     // Catch:{ JSONException -> 0x071f }
            r5.<init>(r6)     // Catch:{ JSONException -> 0x071f }
            r9.put(r3, r5)     // Catch:{ JSONException -> 0x071f }
            goto L_0x0723
        L_0x071f:
            r3 = 5
            defpackage.cow.a(r3)     // Catch:{ JSONException -> 0x0904 }
        L_0x0723:
            java.lang.String r3 = "render_in_browser"
            boolean r5 = r2.K     // Catch:{ JSONException -> 0x0904 }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r3, r5)     // Catch:{ JSONException -> 0x0904 }
        L_0x072e:
            int r3 = r2.a     // Catch:{ JSONException -> 0x0904 }
            if (r3 < r4) goto L_0x073d
            java.lang.String r3 = "android_num_video_cache_tasks"
            int r4 = r2.L     // Catch:{ JSONException -> 0x0904 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r3, r4)     // Catch:{ JSONException -> 0x0904 }
        L_0x073d:
            coy r3 = r2.k     // Catch:{ JSONException -> 0x0904 }
            boolean r4 = r2.Z     // Catch:{ JSONException -> 0x0904 }
            boolean r1 = r1.m     // Catch:{ JSONException -> 0x0904 }
            boolean r5 = r2.ab     // Catch:{ JSONException -> 0x0904 }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ JSONException -> 0x0904 }
            r6.<init>()     // Catch:{ JSONException -> 0x0904 }
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ JSONException -> 0x0904 }
            r7.<init>()     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r8 = "cl"
            java.lang.String r10 = "193400285"
            r7.putString(r8, r10)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r8 = "rapid_rc"
            java.lang.String r10 = "dev"
            r7.putString(r8, r10)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r8 = "rapid_rollup"
            java.lang.String r10 = "HEAD"
            r7.putString(r8, r10)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r8 = "build_meta"
            r6.putBundle(r8, r7)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r7 = "mf"
            dsf<java.lang.Boolean> r8 = defpackage.dsp.bT     // Catch:{ JSONException -> 0x0904 }
            dsn r10 = defpackage.dpn.f()     // Catch:{ JSONException -> 0x0904 }
            java.lang.Object r8 = r10.a(r8)     // Catch:{ JSONException -> 0x0904 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ JSONException -> 0x0904 }
            boolean r8 = r8.booleanValue()     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r8 = java.lang.Boolean.toString(r8)     // Catch:{ JSONException -> 0x0904 }
            r6.putString(r7, r8)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r7 = "instant_app"
            r6.putBoolean(r7, r4)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r4 = "lite"
            boolean r3 = r3.e     // Catch:{ JSONException -> 0x0904 }
            r6.putBoolean(r4, r3)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r3 = "local_service"
            r6.putBoolean(r3, r1)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r1 = "is_privileged_process"
            r6.putBoolean(r1, r5)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r1 = "sdk_env"
            r9.put(r1, r6)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r1 = "cache_state"
            r3 = r20
            r9.put(r1, r3)     // Catch:{ JSONException -> 0x0904 }
            int r1 = r2.a     // Catch:{ JSONException -> 0x0904 }
            r3 = 19
            if (r1 < r3) goto L_0x07b1
            java.lang.String r1 = "gct"
            java.lang.String r3 = r2.N     // Catch:{ JSONException -> 0x0904 }
            r9.put(r1, r3)     // Catch:{ JSONException -> 0x0904 }
        L_0x07b1:
            int r1 = r2.a     // Catch:{ JSONException -> 0x0904 }
            r3 = 21
            if (r1 < r3) goto L_0x07c2
            boolean r1 = r2.P     // Catch:{ JSONException -> 0x0904 }
            if (r1 == 0) goto L_0x07c2
            java.lang.String r1 = "de"
            java.lang.String r3 = "1"
            r9.put(r1, r3)     // Catch:{ JSONException -> 0x0904 }
        L_0x07c2:
            dsf<java.lang.Boolean> r1 = defpackage.dsp.aR     // Catch:{ JSONException -> 0x0904 }
            dsn r3 = defpackage.dpn.f()     // Catch:{ JSONException -> 0x0904 }
            java.lang.Object r1 = r3.a(r1)     // Catch:{ JSONException -> 0x0904 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ JSONException -> 0x0904 }
            boolean r1 = r1.booleanValue()     // Catch:{ JSONException -> 0x0904 }
            if (r1 == 0) goto L_0x0808
            dpc r1 = r2.d     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r1 = r1.a     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r3 = "interstitial_mb"
            boolean r3 = r1.equals(r3)     // Catch:{ JSONException -> 0x0904 }
            if (r3 != 0) goto L_0x07eb
            java.lang.String r3 = "reward_mb"
            boolean r1 = r1.equals(r3)     // Catch:{ JSONException -> 0x0904 }
            if (r1 == 0) goto L_0x07e9
            goto L_0x07eb
        L_0x07e9:
            r1 = 0
            goto L_0x07ec
        L_0x07eb:
            r1 = 1
        L_0x07ec:
            android.os.Bundle r3 = r2.Q     // Catch:{ JSONException -> 0x0904 }
            if (r3 == 0) goto L_0x07f3
            r19 = 1
            goto L_0x07f5
        L_0x07f3:
            r19 = 0
        L_0x07f5:
            if (r1 == 0) goto L_0x0808
            if (r19 == 0) goto L_0x0808
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ JSONException -> 0x0904 }
            r1.<init>()     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r4 = "interstitial_pool"
            r1.putBundle(r4, r3)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r3 = "counters"
            r9.put(r3, r1)     // Catch:{ JSONException -> 0x0904 }
        L_0x0808:
            java.lang.String r1 = r2.R     // Catch:{ JSONException -> 0x0904 }
            if (r1 == 0) goto L_0x0813
            java.lang.String r1 = "gmp_app_id"
            java.lang.String r3 = r2.R     // Catch:{ JSONException -> 0x0904 }
            r9.put(r1, r3)     // Catch:{ JSONException -> 0x0904 }
        L_0x0813:
            java.lang.String r1 = r2.S     // Catch:{ JSONException -> 0x0904 }
            if (r1 == 0) goto L_0x0836
            java.lang.String r1 = "TIME_OUT"
            java.lang.String r3 = r2.S     // Catch:{ JSONException -> 0x0904 }
            boolean r1 = r1.equals(r3)     // Catch:{ JSONException -> 0x0904 }
            if (r1 == 0) goto L_0x0831
            java.lang.String r1 = "sai_timeout"
            dsf<java.lang.Long> r3 = defpackage.dsp.at     // Catch:{ JSONException -> 0x0904 }
            dsn r4 = defpackage.dpn.f()     // Catch:{ JSONException -> 0x0904 }
            java.lang.Object r3 = r4.a(r3)     // Catch:{ JSONException -> 0x0904 }
        L_0x082d:
            r9.put(r1, r3)     // Catch:{ JSONException -> 0x0904 }
            goto L_0x083b
        L_0x0831:
            java.lang.String r1 = "fbs_aiid"
            java.lang.String r3 = r2.S     // Catch:{ JSONException -> 0x0904 }
            goto L_0x082d
        L_0x0836:
            java.lang.String r1 = "fbs_aiid"
            java.lang.String r3 = ""
            goto L_0x082d
        L_0x083b:
            java.lang.String r1 = r2.T     // Catch:{ JSONException -> 0x0904 }
            if (r1 == 0) goto L_0x0846
            java.lang.String r1 = "fbs_aeid"
            java.lang.String r3 = r2.T     // Catch:{ JSONException -> 0x0904 }
            r9.put(r1, r3)     // Catch:{ JSONException -> 0x0904 }
        L_0x0846:
            int r1 = r2.a     // Catch:{ JSONException -> 0x0904 }
            r3 = 24
            if (r1 < r3) goto L_0x0857
            java.lang.String r1 = "disable_ml"
            boolean r3 = r2.aa     // Catch:{ JSONException -> 0x0904 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r1, r3)     // Catch:{ JSONException -> 0x0904 }
        L_0x0857:
            dsf<java.lang.String> r1 = defpackage.dsp.E     // Catch:{ JSONException -> 0x0904 }
            dsn r3 = defpackage.dpn.f()     // Catch:{ JSONException -> 0x0904 }
            java.lang.Object r1 = r3.a(r1)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x0904 }
            if (r1 == 0) goto L_0x089c
            boolean r3 = r1.isEmpty()     // Catch:{ JSONException -> 0x0904 }
            if (r3 != 0) goto L_0x089c
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ JSONException -> 0x0904 }
            dsf<java.lang.Integer> r4 = defpackage.dsp.F     // Catch:{ JSONException -> 0x0904 }
            dsn r5 = defpackage.dpn.f()     // Catch:{ JSONException -> 0x0904 }
            java.lang.Object r4 = r5.a(r4)     // Catch:{ JSONException -> 0x0904 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ JSONException -> 0x0904 }
            int r4 = r4.intValue()     // Catch:{ JSONException -> 0x0904 }
            if (r3 < r4) goto L_0x089c
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ JSONException -> 0x0904 }
            r3.<init>()     // Catch:{ JSONException -> 0x0904 }
            java.lang.String[] r1 = r1.split(r11)     // Catch:{ JSONException -> 0x0904 }
            int r4 = r1.length     // Catch:{ JSONException -> 0x0904 }
        L_0x0889:
            if (r14 >= r4) goto L_0x0897
            r5 = r1[r14]     // Catch:{ JSONException -> 0x0904 }
            java.util.List r6 = defpackage.coj.a(r5)     // Catch:{ JSONException -> 0x0904 }
            r3.put(r5, r6)     // Catch:{ JSONException -> 0x0904 }
            int r14 = r14 + 1
            goto L_0x0889
        L_0x0897:
            java.lang.String r1 = "video_decoders"
            r9.put(r1, r3)     // Catch:{ JSONException -> 0x0904 }
        L_0x089c:
            dsf<java.lang.Boolean> r1 = defpackage.dsp.de     // Catch:{ JSONException -> 0x0904 }
            dsn r3 = defpackage.dpn.f()     // Catch:{ JSONException -> 0x0904 }
            java.lang.Object r1 = r3.a(r1)     // Catch:{ JSONException -> 0x0904 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ JSONException -> 0x0904 }
            boolean r1 = r1.booleanValue()     // Catch:{ JSONException -> 0x0904 }
            if (r1 == 0) goto L_0x08bd
            java.lang.String r1 = "omid_v"
            ccg r3 = defpackage.bjl.u()     // Catch:{ JSONException -> 0x0904 }
            r4 = r23
            java.lang.String r3 = r3.b(r4)     // Catch:{ JSONException -> 0x0904 }
            r9.put(r1, r3)     // Catch:{ JSONException -> 0x0904 }
        L_0x08bd:
            java.util.ArrayList<java.lang.String> r1 = r2.ac     // Catch:{ JSONException -> 0x0904 }
            if (r1 == 0) goto L_0x08d0
            java.util.ArrayList<java.lang.String> r1 = r2.ac     // Catch:{ JSONException -> 0x0904 }
            boolean r1 = r1.isEmpty()     // Catch:{ JSONException -> 0x0904 }
            if (r1 != 0) goto L_0x08d0
            java.lang.String r1 = "android_permissions"
            java.util.ArrayList<java.lang.String> r2 = r2.ac     // Catch:{ JSONException -> 0x0904 }
            r9.put(r1, r2)     // Catch:{ JSONException -> 0x0904 }
        L_0x08d0:
            r1 = 2
            boolean r2 = defpackage.clu.a(r1)     // Catch:{ JSONException -> 0x0904 }
            if (r2 == 0) goto L_0x08fb
            cmd r2 = defpackage.bjl.e()     // Catch:{ JSONException -> 0x0904 }
            org.json.JSONObject r2 = r2.a(r9)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r1 = r2.toString(r1)     // Catch:{ JSONException -> 0x0904 }
            java.lang.String r2 = "Ad Request JSON: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ JSONException -> 0x0904 }
            int r3 = r1.length()     // Catch:{ JSONException -> 0x0904 }
            if (r3 == 0) goto L_0x08f3
            r2.concat(r1)     // Catch:{ JSONException -> 0x0904 }
            goto L_0x08f8
        L_0x08f3:
            java.lang.String r1 = new java.lang.String     // Catch:{ JSONException -> 0x0904 }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x0904 }
        L_0x08f8:
            defpackage.clu.a()     // Catch:{ JSONException -> 0x0904 }
        L_0x08fb:
            cmd r1 = defpackage.bjl.e()     // Catch:{ JSONException -> 0x0904 }
            org.json.JSONObject r1 = r1.a(r9)     // Catch:{ JSONException -> 0x0904 }
            return r1
        L_0x0904:
            r0 = move-exception
            r1 = r0
            java.lang.String r2 = "Problem serializing ad request to JSON: "
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            if (r3 == 0) goto L_0x091a
            r2.concat(r1)
            goto L_0x091f
        L_0x091a:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
        L_0x091f:
            r1 = 5
            defpackage.cow.a(r1)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chi.a(android.content.Context, chb):org.json.JSONObject");
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e1 A[Catch:{ JSONException -> 0x0267 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e7 A[Catch:{ JSONException -> 0x0267 }] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0161 A[Catch:{ JSONException -> 0x0267 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016a A[Catch:{ JSONException -> 0x0267 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.cfy a(android.content.Context r53, defpackage.cfu r54, java.lang.String r55) {
        /*
            r0 = r54
            java.lang.String r1 = "interstitial_timeout"
            java.lang.String r10 = ""
            r15 = 0
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0267 }
            r2 = r55
            r11.<init>(r2)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r2 = "ad_base_url"
            r12 = 0
            java.lang.String r2 = r11.optString(r2, r12)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r3 = "ad_url"
            java.lang.String r4 = r11.optString(r3, r12)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r3 = "ad_size"
            java.lang.String r13 = r11.optString(r3, r12)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r3 = "ad_slot_size"
            java.lang.String r40 = r11.optString(r3, r13)     // Catch:{ JSONException -> 0x0267 }
            if (r0 == 0) goto L_0x0030
            int r3 = r0.m     // Catch:{ JSONException -> 0x0267 }
            if (r3 == 0) goto L_0x0030
            r24 = 1
            goto L_0x0032
        L_0x0030:
            r24 = 0
        L_0x0032:
            java.lang.String r3 = "ad_json"
            java.lang.String r3 = r11.optString(r3, r12)     // Catch:{ JSONException -> 0x0267 }
            if (r3 != 0) goto L_0x0040
            java.lang.String r3 = "ad_html"
            java.lang.String r3 = r11.optString(r3, r12)     // Catch:{ JSONException -> 0x0267 }
        L_0x0040:
            if (r3 != 0) goto L_0x0048
            java.lang.String r3 = "body"
            java.lang.String r3 = r11.optString(r3, r12)     // Catch:{ JSONException -> 0x0267 }
        L_0x0048:
            if (r3 != 0) goto L_0x0056
            java.lang.String r5 = "ads"
            boolean r5 = r11.has(r5)     // Catch:{ JSONException -> 0x0267 }
            if (r5 == 0) goto L_0x0056
            java.lang.String r3 = r11.toString()     // Catch:{ JSONException -> 0x0267 }
        L_0x0056:
            java.lang.String r5 = "debug_dialog"
            java.lang.String r19 = r11.optString(r5, r12)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r5 = "debug_signals"
            java.lang.String r42 = r11.optString(r5, r12)     // Catch:{ JSONException -> 0x0267 }
            boolean r5 = r11.has(r1)     // Catch:{ JSONException -> 0x0267 }
            r8 = -1
            if (r5 == 0) goto L_0x0079
            double r5 = r11.getDouble(r1)     // Catch:{ JSONException -> 0x0267 }
            r16 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r5 = r5 * r16
            long r5 = (long) r5     // Catch:{ JSONException -> 0x0267 }
            r16 = r5
            goto L_0x007b
        L_0x0079:
            r16 = r8
        L_0x007b:
            java.lang.String r1 = "orientation"
            java.lang.String r1 = r11.optString(r1, r12)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r5 = "portrait"
            boolean r5 = r5.equals(r1)     // Catch:{ JSONException -> 0x0267 }
            r7 = -1
            if (r5 == 0) goto L_0x0095
            cmj r1 = defpackage.bjl.g()     // Catch:{ JSONException -> 0x0267 }
            int r1 = r1.b()     // Catch:{ JSONException -> 0x0267 }
        L_0x0092:
            r18 = r1
            goto L_0x00a8
        L_0x0095:
            java.lang.String r5 = "landscape"
            boolean r1 = r5.equals(r1)     // Catch:{ JSONException -> 0x0267 }
            if (r1 == 0) goto L_0x00a6
            cmj r1 = defpackage.bjl.g()     // Catch:{ JSONException -> 0x0267 }
            int r1 = r1.a()     // Catch:{ JSONException -> 0x0267 }
            goto L_0x0092
        L_0x00a6:
            r18 = -1
        L_0x00a8:
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ JSONException -> 0x0267 }
            if (r1 == 0) goto L_0x00d9
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch:{ JSONException -> 0x0267 }
            if (r1 != 0) goto L_0x00d9
            coy r1 = r0.k     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r3 = r1.a     // Catch:{ JSONException -> 0x0267 }
            r5 = 0
            r6 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r1 = r54
            r2 = r53
            r14 = -1
            r7 = r20
            r8 = r21
            r9 = r22
            cfy r1 = defpackage.chd.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r2 = r1.a     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r3 = r1.b     // Catch:{ JSONException -> 0x0267 }
            long r4 = r1.m     // Catch:{ JSONException -> 0x0267 }
            r20 = r4
            r4 = r3
            goto L_0x00de
        L_0x00d9:
            r14 = -1
            r4 = r3
            r1 = r12
            r20 = -1
        L_0x00de:
            r3 = r2
            if (r4 != 0) goto L_0x00e7
            cfy r0 = new cfy     // Catch:{ JSONException -> 0x0267 }
            r0.<init>(r15)     // Catch:{ JSONException -> 0x0267 }
            return r0
        L_0x00e7:
            java.lang.String r2 = "click_urls"
            org.json.JSONArray r2 = r11.optJSONArray(r2)     // Catch:{ JSONException -> 0x0267 }
            if (r1 != 0) goto L_0x00f1
            r5 = r12
            goto L_0x00f3
        L_0x00f1:
            java.util.List<java.lang.String> r5 = r1.c     // Catch:{ JSONException -> 0x0267 }
        L_0x00f3:
            if (r2 == 0) goto L_0x00fa
            java.util.List r2 = a(r2, r5)     // Catch:{ JSONException -> 0x0267 }
            r5 = r2
        L_0x00fa:
            java.lang.String r2 = "impression_urls"
            org.json.JSONArray r2 = r11.optJSONArray(r2)     // Catch:{ JSONException -> 0x0267 }
            if (r1 != 0) goto L_0x0104
            r6 = r12
            goto L_0x0106
        L_0x0104:
            java.util.List<java.lang.String> r6 = r1.e     // Catch:{ JSONException -> 0x0267 }
        L_0x0106:
            if (r2 == 0) goto L_0x010d
            java.util.List r2 = a(r2, r6)     // Catch:{ JSONException -> 0x0267 }
            r6 = r2
        L_0x010d:
            java.lang.String r2 = "downloaded_impression_urls"
            org.json.JSONArray r2 = r11.optJSONArray(r2)     // Catch:{ JSONException -> 0x0267 }
            if (r1 != 0) goto L_0x0117
            r7 = r12
            goto L_0x0119
        L_0x0117:
            java.util.List<java.lang.String> r7 = r1.R     // Catch:{ JSONException -> 0x0267 }
        L_0x0119:
            if (r2 == 0) goto L_0x0122
            java.util.List r2 = a(r2, r7)     // Catch:{ JSONException -> 0x0267 }
            r47 = r2
            goto L_0x0124
        L_0x0122:
            r47 = r7
        L_0x0124:
            java.lang.String r2 = "manual_impression_urls"
            org.json.JSONArray r2 = r11.optJSONArray(r2)     // Catch:{ JSONException -> 0x0267 }
            if (r1 != 0) goto L_0x012e
            r7 = r12
            goto L_0x0130
        L_0x012e:
            java.util.List<java.lang.String> r7 = r1.i     // Catch:{ JSONException -> 0x0267 }
        L_0x0130:
            if (r2 == 0) goto L_0x0139
            java.util.List r2 = a(r2, r7)     // Catch:{ JSONException -> 0x0267 }
            r22 = r2
            goto L_0x013b
        L_0x0139:
            r22 = r7
        L_0x013b:
            if (r1 == 0) goto L_0x0151
            int r2 = r1.k     // Catch:{ JSONException -> 0x0267 }
            if (r2 == r14) goto L_0x0145
            int r2 = r1.k     // Catch:{ JSONException -> 0x0267 }
            r18 = r2
        L_0x0145:
            long r7 = r1.f     // Catch:{ JSONException -> 0x0267 }
            r25 = 0
            int r2 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r2 <= 0) goto L_0x0151
            long r1 = r1.f     // Catch:{ JSONException -> 0x0267 }
            r7 = r1
            goto L_0x0153
        L_0x0151:
            r7 = r16
        L_0x0153:
            java.lang.String r1 = "active_view"
            java.lang.String r23 = r11.optString(r1)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r1 = "ad_is_javascript"
            boolean r25 = r11.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x0267 }
            if (r25 == 0) goto L_0x016a
            java.lang.String r1 = "ad_passback_url"
            java.lang.String r1 = r11.optString(r1, r12)     // Catch:{ JSONException -> 0x0267 }
            r26 = r1
            goto L_0x016c
        L_0x016a:
            r26 = r12
        L_0x016c:
            java.lang.String r1 = "mediation"
            boolean r9 = r11.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r1 = "custom_render_allowed"
            boolean r27 = r11.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r1 = "content_url_opted_out"
            r2 = 1
            boolean r28 = r11.optBoolean(r1, r2)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r1 = "content_vertical_opted_out"
            boolean r43 = r11.optBoolean(r1, r2)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r1 = "prefetch"
            boolean r29 = r11.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r1 = "refresh_interval_milliseconds"
            r14 = r13
            r12 = -1
            long r16 = r11.optLong(r1, r12)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r1 = "mediation_config_cache_time_milliseconds"
            long r12 = r11.optLong(r1, r12)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r1 = "gws_query_id"
            java.lang.String r30 = r11.optString(r1, r10)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r1 = "height"
            java.lang.String r2 = "fluid"
            java.lang.String r2 = r11.optString(r2, r10)     // Catch:{ JSONException -> 0x0267 }
            boolean r31 = r1.equals(r2)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r1 = "native_express"
            boolean r32 = r11.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r1 = "video_start_urls"
            org.json.JSONArray r1 = r11.optJSONArray(r1)     // Catch:{ JSONException -> 0x0267 }
            r2 = 0
            java.util.List r33 = a(r1, r2)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r1 = "video_complete_urls"
            org.json.JSONArray r1 = r11.optJSONArray(r1)     // Catch:{ JSONException -> 0x0267 }
            java.util.List r34 = a(r1, r2)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r1 = "rewards"
            org.json.JSONArray r1 = r11.optJSONArray(r1)     // Catch:{ JSONException -> 0x0267 }
            cjx r35 = defpackage.cjx.a(r1)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r1 = "use_displayed_impression"
            boolean r36 = r11.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r1 = "auto_protection_configuration"
            org.json.JSONObject r1 = r11.optJSONObject(r1)     // Catch:{ JSONException -> 0x0267 }
            cga r37 = defpackage.cga.a(r1)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r1 = "set_cookie"
            java.lang.String r38 = r11.optString(r1, r10)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r1 = "remote_ping_urls"
            org.json.JSONArray r1 = r11.optJSONArray(r1)     // Catch:{ JSONException -> 0x0267 }
            r2 = 0
            java.util.List r39 = a(r1, r2)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r1 = "safe_browsing"
            org.json.JSONObject r1 = r11.optJSONObject(r1)     // Catch:{ JSONException -> 0x0267 }
            ckh r41 = defpackage.ckh.a(r1)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r1 = "render_in_browser"
            boolean r2 = r0.K     // Catch:{ JSONException -> 0x0267 }
            boolean r44 = r11.optBoolean(r1, r2)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r1 = "custom_close_blocked"
            boolean r45 = r11.optBoolean(r1)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r1 = "enable_omid"
            boolean r46 = r11.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r1 = "omid_settings"
            r2 = 0
            java.lang.String r49 = r11.optString(r1, r2)     // Catch:{ JSONException -> 0x0267 }
            java.lang.String r1 = "disable_closable_area"
            boolean r48 = r11.optBoolean(r1, r15)     // Catch:{ JSONException -> 0x0267 }
            cfy r50 = new cfy     // Catch:{ JSONException -> 0x0267 }
            boolean r10 = r0.p     // Catch:{ JSONException -> 0x0267 }
            boolean r11 = r0.G     // Catch:{ JSONException -> 0x0267 }
            boolean r2 = r0.U     // Catch:{ JSONException -> 0x0267 }
            r1 = r50
            r51 = r2
            r2 = r54
            r0 = r10
            r52 = r11
            r10 = r12
            r12 = r22
            r22 = r14
            r13 = r16
            r15 = r18
            r16 = r22
            r17 = r20
            r20 = r25
            r21 = r26
            r22 = r23
            r23 = r27
            r25 = r0
            r26 = r28
            r27 = r29
            r28 = r30
            r29 = r31
            r30 = r32
            r31 = r35
            r32 = r33
            r33 = r34
            r34 = r36
            r35 = r37
            r36 = r52
            r37 = r38
            r38 = r39
            r39 = r44
            r44 = r51
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r10, r12, r13, r15, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)     // Catch:{ JSONException -> 0x0267 }
            return r50
        L_0x0267:
            r0 = move-exception
            java.lang.String r1 = "Could not parse the inline ad response: "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x027c
            r1.concat(r0)
            goto L_0x0281
        L_0x027c:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x0281:
            r0 = 5
            defpackage.cow.a(r0)
            cfy r0 = new cfy
            r1 = 0
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chi.a(android.content.Context, cfu, java.lang.String):cfy");
    }
}
