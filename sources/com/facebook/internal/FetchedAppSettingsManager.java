package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class FetchedAppSettingsManager {
    /* access modifiers changed from: private */
    public static final String a = FetchedAppSettingsManager.class.getSimpleName();
    private static final String[] b = {"supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "gdpv4_chrome_custom_tabs_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url"};
    /* access modifiers changed from: private */
    public static final Map<String, amg> c = new ConcurrentHashMap();
    /* access modifiers changed from: private */
    public static final AtomicReference<FetchAppSettingState> d = new AtomicReference<>(FetchAppSettingState.NOT_LOADED);
    private static final ConcurrentLinkedQueue<a> e = new ConcurrentLinkedQueue<>();
    /* access modifiers changed from: private */
    public static boolean f = false;
    private static JSONArray g = null;

    enum FetchAppSettingState {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR
    }

    public interface a {
    }

    public static void a() {
        final Context g2 = akc.g();
        final String k = akc.k();
        if (amw.a(k)) {
            d.set(FetchAppSettingState.ERROR);
            g();
        } else if (c.containsKey(k)) {
            d.set(FetchAppSettingState.SUCCESS);
            g();
        } else {
            if (!(d.compareAndSet(FetchAppSettingState.NOT_LOADED, FetchAppSettingState.LOADING) || d.compareAndSet(FetchAppSettingState.ERROR, FetchAppSettingState.LOADING))) {
                g();
                return;
            }
            final String format = String.format("com.facebook.internal.APP_SETTINGS.%s", new Object[]{k});
            akc.e().execute(new Runnable() {
                public final void run() {
                    JSONObject jSONObject;
                    SharedPreferences sharedPreferences = g2.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
                    amg amg = null;
                    String string = sharedPreferences.getString(format, null);
                    if (!amw.a(string)) {
                        try {
                            jSONObject = new JSONObject(string);
                        } catch (JSONException e) {
                            amw.a("FacebookSDK", (Exception) e);
                            jSONObject = null;
                        }
                        if (jSONObject != null) {
                            amg = FetchedAppSettingsManager.b(k, jSONObject);
                        }
                    }
                    JSONObject b2 = FetchedAppSettingsManager.c(k);
                    if (b2 != null) {
                        FetchedAppSettingsManager.b(k, b2);
                        sharedPreferences.edit().putString(format, b2.toString()).apply();
                    }
                    if (amg != null) {
                        String str = amg.k;
                        if (!FetchedAppSettingsManager.f && str != null && str.length() > 0) {
                            FetchedAppSettingsManager.f = true;
                            FetchedAppSettingsManager.a;
                        }
                    }
                    amf.a(k, true);
                    ali.a();
                    alj.a();
                    FetchedAppSettingsManager.d.set(FetchedAppSettingsManager.c.containsKey(k) ? FetchAppSettingState.SUCCESS : FetchAppSettingState.ERROR);
                    FetchedAppSettingsManager.g();
                }
            });
        }
    }

    public static amg a(String str) {
        if (str != null) {
            return (amg) c.get(str);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void g() {
        /*
            java.lang.Class<com.facebook.internal.FetchedAppSettingsManager> r0 = com.facebook.internal.FetchedAppSettingsManager.class
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference<com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState> r1 = d     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0071 }
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r1 = (com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState) r1     // Catch:{ all -> 0x0071 }
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r2 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.NOT_LOADED     // Catch:{ all -> 0x0071 }
            boolean r2 = r2.equals(r1)     // Catch:{ all -> 0x0071 }
            if (r2 != 0) goto L_0x006f
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r2 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.LOADING     // Catch:{ all -> 0x0071 }
            boolean r2 = r2.equals(r1)     // Catch:{ all -> 0x0071 }
            if (r2 == 0) goto L_0x001c
            goto L_0x006f
        L_0x001c:
            java.lang.String r2 = defpackage.akc.k()     // Catch:{ all -> 0x0071 }
            java.util.Map<java.lang.String, amg> r3 = c     // Catch:{ all -> 0x0071 }
            java.lang.Object r2 = r3.get(r2)     // Catch:{ all -> 0x0071 }
            amg r2 = (defpackage.amg) r2     // Catch:{ all -> 0x0071 }
            android.os.Handler r3 = new android.os.Handler     // Catch:{ all -> 0x0071 }
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0071 }
            r3.<init>(r4)     // Catch:{ all -> 0x0071 }
            com.facebook.internal.FetchedAppSettingsManager$FetchAppSettingState r4 = com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState.ERROR     // Catch:{ all -> 0x0071 }
            boolean r1 = r4.equals(r1)     // Catch:{ all -> 0x0071 }
            if (r1 == 0) goto L_0x0054
        L_0x0039:
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.FetchedAppSettingsManager$a> r1 = e     // Catch:{ all -> 0x0071 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r1 != 0) goto L_0x0052
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.FetchedAppSettingsManager$a> r1 = e     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0071 }
            com.facebook.internal.FetchedAppSettingsManager$a r1 = (com.facebook.internal.FetchedAppSettingsManager.a) r1     // Catch:{ all -> 0x0071 }
            com.facebook.internal.FetchedAppSettingsManager$2 r2 = new com.facebook.internal.FetchedAppSettingsManager$2     // Catch:{ all -> 0x0071 }
            r2.<init>(r1)     // Catch:{ all -> 0x0071 }
            r3.post(r2)     // Catch:{ all -> 0x0071 }
            goto L_0x0039
        L_0x0052:
            monitor-exit(r0)
            return
        L_0x0054:
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.FetchedAppSettingsManager$a> r1 = e     // Catch:{ all -> 0x0071 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r1 != 0) goto L_0x006d
            java.util.concurrent.ConcurrentLinkedQueue<com.facebook.internal.FetchedAppSettingsManager$a> r1 = e     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r1.poll()     // Catch:{ all -> 0x0071 }
            com.facebook.internal.FetchedAppSettingsManager$a r1 = (com.facebook.internal.FetchedAppSettingsManager.a) r1     // Catch:{ all -> 0x0071 }
            com.facebook.internal.FetchedAppSettingsManager$3 r4 = new com.facebook.internal.FetchedAppSettingsManager$3     // Catch:{ all -> 0x0071 }
            r4.<init>(r1, r2)     // Catch:{ all -> 0x0071 }
            r3.post(r4)     // Catch:{ all -> 0x0071 }
            goto L_0x0054
        L_0x006d:
            monitor-exit(r0)
            return
        L_0x006f:
            monitor-exit(r0)
            return
        L_0x0071:
            r1 = move-exception
            monitor-exit(r0)
            goto L_0x0075
        L_0x0074:
            throw r1
        L_0x0075:
            goto L_0x0074
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.FetchedAppSettingsManager.g():void");
    }

    public static amg a(String str, boolean z) {
        if (!z && c.containsKey(str)) {
            return (amg) c.get(str);
        }
        JSONObject c2 = c(str);
        if (c2 == null) {
            return null;
        }
        amg b2 = b(str, c2);
        if (str.equals(akc.k())) {
            d.set(FetchAppSettingState.SUCCESS);
            g();
        }
        return b2;
    }

    /* access modifiers changed from: private */
    public static amg b(String str, JSONObject jSONObject) {
        amc amc;
        JSONObject jSONObject2 = jSONObject;
        JSONArray optJSONArray = jSONObject2.optJSONArray("android_sdk_error_categories");
        if (optJSONArray == null) {
            amc = amc.a();
        } else {
            amc = amc.a(optJSONArray);
        }
        amc amc2 = amc;
        int optInt = jSONObject2.optInt("app_events_feature_bitmask", 0);
        boolean z = (optInt & 8) != 0;
        boolean z2 = (optInt & 16) != 0;
        boolean z3 = (optInt & 32) != 0;
        boolean z4 = (optInt & 256) != 0;
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("auto_event_mapping_android");
        g = optJSONArray2;
        amg amg = r2;
        amg amg2 = new amg(jSONObject2.optBoolean("supports_implicit_sdk_logging", false), jSONObject2.optString("gdpv4_nux_content", ""), jSONObject2.optBoolean("gdpv4_nux_enabled", false), jSONObject2.optBoolean("gdpv4_chrome_custom_tabs_enabled", false), jSONObject2.optInt("app_events_session_timeout", 60), SmartLoginOption.a(jSONObject2.optLong("seamless_login")), a(jSONObject2.optJSONObject("android_dialog_configs")), z, amc2, jSONObject2.optString("smart_login_bookmark_icon_url"), jSONObject2.optString("smart_login_menu_icon_url"), z2, z3, optJSONArray2, jSONObject2.optString("sdk_update_message"), z4);
        amg amg3 = amg;
        c.put(str, amg3);
        return amg3;
    }

    /* access modifiers changed from: private */
    public static JSONObject c(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", TextUtils.join(",", new ArrayList(Arrays.asList(b))));
        akd a2 = akd.a((aju) null, str, (b) null);
        a2.h = true;
        a2.d = bundle;
        return akd.a(a2).a;
    }

    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v1, types: [amg$a, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v2, types: [android.net.Uri] */
    /* JADX WARNING: type inference failed for: r7v7, types: [amg$a] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4, types: [android.net.Uri] */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r6v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], ?[OBJECT, ARRAY], android.net.Uri]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], amg$a, java.lang.Object, android.net.Uri]
      mth insns count: 46
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
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Map<java.lang.String, java.util.Map<java.lang.String, defpackage.amg.a>> a(org.json.JSONObject r9) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r9 == 0) goto L_0x0082
            java.lang.String r1 = "data"
            org.json.JSONArray r9 = r9.optJSONArray(r1)
            if (r9 == 0) goto L_0x0082
            r1 = 0
            r2 = 0
        L_0x0011:
            int r3 = r9.length()
            if (r2 >= r3) goto L_0x0082
            org.json.JSONObject r3 = r9.optJSONObject(r2)
            java.lang.String r4 = "name"
            java.lang.String r4 = r3.optString(r4)
            boolean r5 = defpackage.amw.a(r4)
            r6 = 0
            if (r5 == 0) goto L_0x0029
            goto L_0x0066
        L_0x0029:
            java.lang.String r5 = "\\|"
            java.lang.String[] r4 = r4.split(r5)
            int r5 = r4.length
            r7 = 2
            if (r5 == r7) goto L_0x0034
            goto L_0x0066
        L_0x0034:
            r5 = r4[r1]
            r7 = 1
            r4 = r4[r7]
            boolean r7 = defpackage.amw.a(r5)
            if (r7 != 0) goto L_0x0066
            boolean r7 = defpackage.amw.a(r4)
            if (r7 == 0) goto L_0x0046
            goto L_0x0066
        L_0x0046:
            java.lang.String r7 = "url"
            java.lang.String r7 = r3.optString(r7)
            boolean r8 = defpackage.amw.a(r7)
            if (r8 != 0) goto L_0x0056
            android.net.Uri r6 = android.net.Uri.parse(r7)
        L_0x0056:
            java.lang.String r7 = "versions"
            org.json.JSONArray r3 = r3.optJSONArray(r7)
            int[] r3 = defpackage.amg.a.a(r3)
            amg$a r7 = new amg$a
            r7.<init>(r5, r4, r6, r3)
            r6 = r7
        L_0x0066:
            if (r6 == 0) goto L_0x007f
            java.lang.String r3 = r6.a
            java.lang.Object r4 = r0.get(r3)
            java.util.Map r4 = (java.util.Map) r4
            if (r4 != 0) goto L_0x007a
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r0.put(r3, r4)
        L_0x007a:
            java.lang.String r3 = r6.b
            r4.put(r3, r6)
        L_0x007f:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0082:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.FetchedAppSettingsManager.a(org.json.JSONObject):java.util.Map");
    }
}
