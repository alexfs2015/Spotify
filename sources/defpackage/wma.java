package defpackage;

import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import org.json.JSONObject;

/* renamed from: wma reason: default package */
final class wma extends wjo implements wml {
    public wma(wjf wjf, String str, String str2, wlh wlh) {
        this(wjf, str, str2, wlh, HttpMethod.GET);
    }

    private wma(wjf wjf, String str, String str2, wlh wlh, HttpMethod httpMethod) {
        super(wjf, str, str2, wlh, httpMethod);
    }

    private JSONObject a(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            wji a = wja.a();
            StringBuilder sb = new StringBuilder("Failed to parse settings JSON from ");
            sb.append(this.a);
            String str2 = "Fabric";
            a.a(str2, sb.toString(), (Throwable) e);
            wji a2 = wja.a();
            StringBuilder sb2 = new StringBuilder("Settings response ");
            sb2.append(str);
            a2.a(str2, sb2.toString());
            return null;
        }
    }

    private static void a(HttpRequest httpRequest, String str, String str2) {
        if (str2 != null) {
            httpRequest.a(str, str2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d8 A[Catch:{ HttpRequestException -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e2 A[Catch:{ HttpRequestException -> 0x0113 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject a(defpackage.wmk r9) {
        /*
            r8 = this;
            java.lang.String r0 = "X-REQUEST-ID"
            java.lang.String r1 = "Settings request ID: "
            java.lang.String r2 = "Fabric"
            r3 = 0
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ HttpRequestException -> 0x0118, all -> 0x0115 }
            r4.<init>()     // Catch:{ HttpRequestException -> 0x0118, all -> 0x0115 }
            java.lang.String r5 = "build_version"
            java.lang.String r6 = r9.h     // Catch:{ HttpRequestException -> 0x0118, all -> 0x0115 }
            r4.put(r5, r6)     // Catch:{ HttpRequestException -> 0x0118, all -> 0x0115 }
            java.lang.String r5 = "display_version"
            java.lang.String r6 = r9.g     // Catch:{ HttpRequestException -> 0x0118, all -> 0x0115 }
            r4.put(r5, r6)     // Catch:{ HttpRequestException -> 0x0118, all -> 0x0115 }
            java.lang.String r5 = "source"
            int r6 = r9.i     // Catch:{ HttpRequestException -> 0x0118, all -> 0x0115 }
            java.lang.String r6 = java.lang.Integer.toString(r6)     // Catch:{ HttpRequestException -> 0x0118, all -> 0x0115 }
            r4.put(r5, r6)     // Catch:{ HttpRequestException -> 0x0118, all -> 0x0115 }
            java.lang.String r5 = r9.j     // Catch:{ HttpRequestException -> 0x0118, all -> 0x0115 }
            if (r5 == 0) goto L_0x0030
            java.lang.String r5 = "icon_hash"
            java.lang.String r6 = r9.j     // Catch:{ HttpRequestException -> 0x0118, all -> 0x0115 }
            r4.put(r5, r6)     // Catch:{ HttpRequestException -> 0x0118, all -> 0x0115 }
        L_0x0030:
            java.lang.String r5 = r9.f     // Catch:{ HttpRequestException -> 0x0118, all -> 0x0115 }
            boolean r6 = io.fabric.sdk.android.services.common.CommonUtils.d(r5)     // Catch:{ HttpRequestException -> 0x0118, all -> 0x0115 }
            if (r6 != 0) goto L_0x003d
            java.lang.String r6 = "instance"
            r4.put(r6, r5)     // Catch:{ HttpRequestException -> 0x0118, all -> 0x0115 }
        L_0x003d:
            io.fabric.sdk.android.services.network.HttpRequest r5 = r8.a(r4)     // Catch:{ HttpRequestException -> 0x0118, all -> 0x0115 }
            java.lang.String r6 = "X-CRASHLYTICS-API-KEY"
            java.lang.String r7 = r9.a     // Catch:{ HttpRequestException -> 0x0113 }
            a(r5, r6, r7)     // Catch:{ HttpRequestException -> 0x0113 }
            java.lang.String r6 = "X-CRASHLYTICS-API-CLIENT-TYPE"
            java.lang.String r7 = "android"
            a(r5, r6, r7)     // Catch:{ HttpRequestException -> 0x0113 }
            java.lang.String r6 = "X-CRASHLYTICS-API-CLIENT-VERSION"
            wjf r7 = r8.b     // Catch:{ HttpRequestException -> 0x0113 }
            java.lang.String r7 = r7.a()     // Catch:{ HttpRequestException -> 0x0113 }
            a(r5, r6, r7)     // Catch:{ HttpRequestException -> 0x0113 }
            java.lang.String r6 = "Accept"
            java.lang.String r7 = "application/json"
            a(r5, r6, r7)     // Catch:{ HttpRequestException -> 0x0113 }
            java.lang.String r6 = "X-CRASHLYTICS-DEVICE-MODEL"
            java.lang.String r7 = r9.b     // Catch:{ HttpRequestException -> 0x0113 }
            a(r5, r6, r7)     // Catch:{ HttpRequestException -> 0x0113 }
            java.lang.String r6 = "X-CRASHLYTICS-OS-BUILD-VERSION"
            java.lang.String r7 = r9.c     // Catch:{ HttpRequestException -> 0x0113 }
            a(r5, r6, r7)     // Catch:{ HttpRequestException -> 0x0113 }
            java.lang.String r6 = "X-CRASHLYTICS-OS-DISPLAY-VERSION"
            java.lang.String r7 = r9.d     // Catch:{ HttpRequestException -> 0x0113 }
            a(r5, r6, r7)     // Catch:{ HttpRequestException -> 0x0113 }
            java.lang.String r6 = "X-CRASHLYTICS-INSTALLATION-ID"
            java.lang.String r9 = r9.e     // Catch:{ HttpRequestException -> 0x0113 }
            a(r5, r6, r9)     // Catch:{ HttpRequestException -> 0x0113 }
            wji r9 = defpackage.wja.a()     // Catch:{ HttpRequestException -> 0x0113 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ HttpRequestException -> 0x0113 }
            java.lang.String r7 = "Requesting settings from "
            r6.<init>(r7)     // Catch:{ HttpRequestException -> 0x0113 }
            java.lang.String r7 = r8.a     // Catch:{ HttpRequestException -> 0x0113 }
            r6.append(r7)     // Catch:{ HttpRequestException -> 0x0113 }
            java.lang.String r6 = r6.toString()     // Catch:{ HttpRequestException -> 0x0113 }
            r9.a(r2, r6)     // Catch:{ HttpRequestException -> 0x0113 }
            wji r9 = defpackage.wja.a()     // Catch:{ HttpRequestException -> 0x0113 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ HttpRequestException -> 0x0113 }
            java.lang.String r7 = "Settings query params were: "
            r6.<init>(r7)     // Catch:{ HttpRequestException -> 0x0113 }
            r6.append(r4)     // Catch:{ HttpRequestException -> 0x0113 }
            java.lang.String r4 = r6.toString()     // Catch:{ HttpRequestException -> 0x0113 }
            r9.a(r2, r4)     // Catch:{ HttpRequestException -> 0x0113 }
            int r9 = r5.b()     // Catch:{ HttpRequestException -> 0x0113 }
            wji r4 = defpackage.wja.a()     // Catch:{ HttpRequestException -> 0x0113 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ HttpRequestException -> 0x0113 }
            java.lang.String r7 = "Settings result was: "
            r6.<init>(r7)     // Catch:{ HttpRequestException -> 0x0113 }
            r6.append(r9)     // Catch:{ HttpRequestException -> 0x0113 }
            java.lang.String r6 = r6.toString()     // Catch:{ HttpRequestException -> 0x0113 }
            r4.a(r2, r6)     // Catch:{ HttpRequestException -> 0x0113 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r9 == r4) goto L_0x00d5
            r4 = 201(0xc9, float:2.82E-43)
            if (r9 == r4) goto L_0x00d5
            r4 = 202(0xca, float:2.83E-43)
            if (r9 == r4) goto L_0x00d5
            r4 = 203(0xcb, float:2.84E-43)
            if (r9 != r4) goto L_0x00d3
            goto L_0x00d5
        L_0x00d3:
            r9 = 0
            goto L_0x00d6
        L_0x00d5:
            r9 = 1
        L_0x00d6:
            if (r9 == 0) goto L_0x00e2
            java.lang.String r9 = r5.c()     // Catch:{ HttpRequestException -> 0x0113 }
            org.json.JSONObject r9 = r8.a(r9)     // Catch:{ HttpRequestException -> 0x0113 }
            r3 = r9
            goto L_0x00f9
        L_0x00e2:
            wji r9 = defpackage.wja.a()     // Catch:{ HttpRequestException -> 0x0113 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ HttpRequestException -> 0x0113 }
            java.lang.String r6 = "Failed to retrieve settings from "
            r4.<init>(r6)     // Catch:{ HttpRequestException -> 0x0113 }
            java.lang.String r6 = r8.a     // Catch:{ HttpRequestException -> 0x0113 }
            r4.append(r6)     // Catch:{ HttpRequestException -> 0x0113 }
            java.lang.String r4 = r4.toString()     // Catch:{ HttpRequestException -> 0x0113 }
            r9.e(r2, r4)     // Catch:{ HttpRequestException -> 0x0113 }
        L_0x00f9:
            if (r5 == 0) goto L_0x012f
            wji r9 = defpackage.wja.a()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
        L_0x0104:
            java.lang.String r0 = r5.a(r0)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r9.a(r2, r0)
            goto L_0x012f
        L_0x0113:
            r9 = move-exception
            goto L_0x011a
        L_0x0115:
            r9 = move-exception
            r5 = r3
            goto L_0x0131
        L_0x0118:
            r9 = move-exception
            r5 = r3
        L_0x011a:
            wji r4 = defpackage.wja.a()     // Catch:{ all -> 0x0130 }
            java.lang.String r6 = "Settings request failed."
            r4.c(r2, r6, r9)     // Catch:{ all -> 0x0130 }
            if (r5 == 0) goto L_0x012f
            wji r9 = defpackage.wja.a()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            goto L_0x0104
        L_0x012f:
            return r3
        L_0x0130:
            r9 = move-exception
        L_0x0131:
            if (r5 == 0) goto L_0x014a
            wji r3 = defpackage.wja.a()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r0 = r5.a(r0)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r3.a(r2, r0)
        L_0x014a:
            goto L_0x014c
        L_0x014b:
            throw r9
        L_0x014c:
            goto L_0x014b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wma.a(wmk):org.json.JSONObject");
    }
}
