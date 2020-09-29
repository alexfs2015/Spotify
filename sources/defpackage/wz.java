package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: wz reason: default package */
public final class wz {
    private final SharedPreferences a;

    public wz(Context context) {
        this.a = context.getSharedPreferences("adjust_preferences", 0);
    }

    private synchronized void a(String str, String str2) {
        this.a.edit().putString(str, str2).apply();
    }

    private synchronized void a(String str, boolean z) {
        this.a.edit().putBoolean(str, true).apply();
    }

    private synchronized String b(String str) {
        try {
        } catch (ClassCastException unused) {
            return null;
        } catch (Throwable unused2) {
            if (str.equals("raw_referrers")) {
                c("raw_referrers");
            }
            return null;
        }
        return this.a.getString(str, null);
    }

    private synchronized boolean b(String str, boolean z) {
        try {
        } catch (ClassCastException unused) {
            return false;
        }
        return this.a.getBoolean(str, false);
    }

    private synchronized void c(String str) {
        this.a.edit().remove(str).apply();
    }

    private synchronized int d(String str, long j) {
        try {
            JSONArray a2 = a();
            for (int i = 0; i < a2.length(); i++) {
                JSONArray jSONArray = a2.getJSONArray(i);
                String optString = jSONArray.optString(0, null);
                if (optString != null && optString.equals(str) && jSONArray.optLong(1, -1) == j) {
                    return i;
                }
            }
        } catch (JSONException unused) {
        }
        return -1;
    }

    private synchronized long e(String str, long j) {
        try {
        } catch (ClassCastException unused) {
            return -1;
        }
        return this.a.getLong(str, -1);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:1|2|3|(3:5|6|(6:8|(1:10)|25|11|12|13)(4:14|15|16|17))|18|19|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0034 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized org.json.JSONArray a() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "raw_referrers"
            java.lang.String r0 = r5.b(r0)     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0034
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0034 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0034 }
            int r2 = r1.length()     // Catch:{ JSONException -> 0x0034 }
            r3 = 10
            if (r2 <= r3) goto L_0x002d
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0034 }
            r0.<init>()     // Catch:{ JSONException -> 0x0034 }
            r2 = 0
        L_0x001c:
            if (r2 >= r3) goto L_0x0028
            java.lang.Object r4 = r1.get(r2)     // Catch:{ JSONException -> 0x0034 }
            r0.put(r4)     // Catch:{ JSONException -> 0x0034 }
            int r2 = r2 + 1
            goto L_0x001c
        L_0x0028:
            r5.a(r0)     // Catch:{ JSONException -> 0x0034 }
            monitor-exit(r5)
            return r0
        L_0x002d:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0034 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0034 }
            monitor-exit(r5)
            return r1
        L_0x0034:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ all -> 0x003b }
            r0.<init>()     // Catch:{ all -> 0x003b }
            monitor-exit(r5)
            return r0
        L_0x003b:
            r0 = move-exception
            monitor-exit(r5)
            goto L_0x003f
        L_0x003e:
            throw r0
        L_0x003f:
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz.a():org.json.JSONArray");
    }

    public final synchronized void a(String str) {
        a("push_token", str);
    }

    public final synchronized void a(String str, long j) {
        try {
            if (c(str, j) == null) {
                JSONArray a2 = a();
                if (a2.length() != 10) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(0, str);
                    jSONArray.put(1, j);
                    jSONArray.put(2, 0);
                    a2.put(jSONArray);
                    a(a2);
                }
            }
        } catch (JSONException unused) {
        }
    }

    public final synchronized void a(JSONArray jSONArray) {
        try {
            a("raw_referrers", jSONArray.toString());
        } catch (Throwable unused) {
            c("raw_referrers");
        }
    }

    public final synchronized void b() {
        try {
            JSONArray a2 = a();
            boolean z = false;
            for (int i = 0; i < a2.length(); i++) {
                JSONArray jSONArray = a2.getJSONArray(i);
                if (jSONArray.optInt(2, -1) == 1) {
                    jSONArray.put(2, 0);
                    z = true;
                }
            }
            if (z) {
                a(a2);
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(java.lang.String r3, long r4) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 == 0) goto L_0x003c
            int r0 = r3.length()     // Catch:{ all -> 0x0039 }
            if (r0 != 0) goto L_0x000a
            goto L_0x003c
        L_0x000a:
            int r3 = r2.d(r3, r4)     // Catch:{ all -> 0x0039 }
            if (r3 >= 0) goto L_0x0012
            monitor-exit(r2)
            return
        L_0x0012:
            org.json.JSONArray r4 = r2.a()     // Catch:{ all -> 0x0039 }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ all -> 0x0039 }
            r5.<init>()     // Catch:{ all -> 0x0039 }
            r0 = 0
        L_0x001c:
            int r1 = r4.length()     // Catch:{ all -> 0x0039 }
            if (r0 >= r1) goto L_0x002e
            if (r0 == r3) goto L_0x002b
            org.json.JSONArray r1 = r4.getJSONArray(r0)     // Catch:{ JSONException -> 0x002b }
            r5.put(r1)     // Catch:{ JSONException -> 0x002b }
        L_0x002b:
            int r0 = r0 + 1
            goto L_0x001c
        L_0x002e:
            java.lang.String r3 = "raw_referrers"
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0039 }
            r2.a(r3, r4)     // Catch:{ all -> 0x0039 }
            monitor-exit(r2)
            return
        L_0x0039:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x003c:
            monitor-exit(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz.b(java.lang.String, long):void");
    }

    public final synchronized String c() {
        return b("push_token");
    }

    public final synchronized JSONArray c(String str, long j) {
        int d = d(str, j);
        if (d >= 0) {
            try {
                return a().getJSONArray(d);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final synchronized void d() {
        c("push_token");
    }

    public final synchronized void e() {
        a("install_tracked", true);
    }

    public final synchronized boolean f() {
        return b("install_tracked", false);
    }

    public final synchronized boolean g() {
        return b("gdpr_forget_me", false);
    }

    public final synchronized void h() {
        c("gdpr_forget_me");
    }

    public final synchronized String i() {
        return b("deeplink_url");
    }

    public final synchronized long j() {
        return e("deeplink_click_time", -1);
    }

    public final synchronized void k() {
        c("deeplink_url");
        c("deeplink_click_time");
    }
}
