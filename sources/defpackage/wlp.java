package defpackage;

import com.spotify.cosmos.router.Request;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;

/* renamed from: wlp reason: default package */
abstract class wlp extends wjo {
    public wlp(wjf wjf, String str, String str2, wlh wlh, HttpMethod httpMethod) {
        super(wjf, str, str2, wlh, httpMethod);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private io.fabric.sdk.android.services.network.HttpRequest a(io.fabric.sdk.android.services.network.HttpRequest r9, defpackage.wls r10) {
        /*
            r8 = this;
            java.lang.String r0 = "Failed to close app icon InputStream."
            java.lang.String r1 = r10.b
            r2 = 0
            java.lang.String r3 = "app[identifier]"
            io.fabric.sdk.android.services.network.HttpRequest r9 = r9.a(r3, r2, r1)
            java.lang.String r1 = r10.f
            java.lang.String r3 = "app[name]"
            io.fabric.sdk.android.services.network.HttpRequest r9 = r9.a(r3, r2, r1)
            java.lang.String r1 = r10.c
            java.lang.String r3 = "app[display_version]"
            io.fabric.sdk.android.services.network.HttpRequest r9 = r9.a(r3, r2, r1)
            java.lang.String r1 = r10.d
            java.lang.String r3 = "app[build_version]"
            io.fabric.sdk.android.services.network.HttpRequest r9 = r9.a(r3, r2, r1)
            int r1 = r10.g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r3 = "app[source]"
            io.fabric.sdk.android.services.network.HttpRequest r9 = r9.a(r3, r1)
            java.lang.String r1 = r10.h
            java.lang.String r3 = "app[minimum_sdk_version]"
            io.fabric.sdk.android.services.network.HttpRequest r9 = r9.a(r3, r2, r1)
            java.lang.String r1 = r10.i
            java.lang.String r3 = "app[built_sdk_version]"
            io.fabric.sdk.android.services.network.HttpRequest r9 = r9.a(r3, r2, r1)
            java.lang.String r1 = r10.e
            boolean r1 = io.fabric.sdk.android.services.common.CommonUtils.d(r1)
            if (r1 != 0) goto L_0x004e
            java.lang.String r1 = r10.e
            java.lang.String r3 = "app[instance_identifier]"
            r9.a(r3, r2, r1)
        L_0x004e:
            wmc r1 = r10.j
            if (r1 == 0) goto L_0x00bd
            wjf r1 = r8.b     // Catch:{ NotFoundException -> 0x0097, all -> 0x0094 }
            android.content.Context r1 = r1.h     // Catch:{ NotFoundException -> 0x0097, all -> 0x0094 }
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ NotFoundException -> 0x0097, all -> 0x0094 }
            wmc r3 = r10.j     // Catch:{ NotFoundException -> 0x0097, all -> 0x0094 }
            int r3 = r3.b     // Catch:{ NotFoundException -> 0x0097, all -> 0x0094 }
            java.io.InputStream r1 = r1.openRawResource(r3)     // Catch:{ NotFoundException -> 0x0097, all -> 0x0094 }
            java.lang.String r3 = "app[icon][hash]"
            wmc r4 = r10.j     // Catch:{ NotFoundException -> 0x0092 }
            java.lang.String r4 = r4.a     // Catch:{ NotFoundException -> 0x0092 }
            io.fabric.sdk.android.services.network.HttpRequest r3 = r9.a(r3, r2, r4)     // Catch:{ NotFoundException -> 0x0092 }
            java.lang.String r4 = "app[icon][data]"
            java.lang.String r5 = "icon.png"
            java.lang.String r6 = "application/octet-stream"
            io.fabric.sdk.android.services.network.HttpRequest r3 = r3.a(r4, r5, r6, r1)     // Catch:{ NotFoundException -> 0x0092 }
            java.lang.String r4 = "app[icon][width]"
            wmc r5 = r10.j     // Catch:{ NotFoundException -> 0x0092 }
            int r5 = r5.c     // Catch:{ NotFoundException -> 0x0092 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NotFoundException -> 0x0092 }
            io.fabric.sdk.android.services.network.HttpRequest r3 = r3.a(r4, r5)     // Catch:{ NotFoundException -> 0x0092 }
            java.lang.String r4 = "app[icon][height]"
            wmc r5 = r10.j     // Catch:{ NotFoundException -> 0x0092 }
            int r5 = r5.d     // Catch:{ NotFoundException -> 0x0092 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NotFoundException -> 0x0092 }
            r3.a(r4, r5)     // Catch:{ NotFoundException -> 0x0092 }
            goto L_0x00b4
        L_0x0092:
            r3 = move-exception
            goto L_0x0099
        L_0x0094:
            r9 = move-exception
            r1 = r2
            goto L_0x00b9
        L_0x0097:
            r3 = move-exception
            r1 = r2
        L_0x0099:
            wji r4 = defpackage.wja.a()     // Catch:{ all -> 0x00b8 }
            java.lang.String r5 = "Fabric"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b8 }
            java.lang.String r7 = "Failed to find app icon with resource ID: "
            r6.<init>(r7)     // Catch:{ all -> 0x00b8 }
            wmc r7 = r10.j     // Catch:{ all -> 0x00b8 }
            int r7 = r7.b     // Catch:{ all -> 0x00b8 }
            r6.append(r7)     // Catch:{ all -> 0x00b8 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00b8 }
            r4.c(r5, r6, r3)     // Catch:{ all -> 0x00b8 }
        L_0x00b4:
            io.fabric.sdk.android.services.common.CommonUtils.a(r1, r0)
            goto L_0x00bd
        L_0x00b8:
            r9 = move-exception
        L_0x00b9:
            io.fabric.sdk.android.services.common.CommonUtils.a(r1, r0)
            throw r9
        L_0x00bd:
            java.util.Collection<wjh> r0 = r10.k
            if (r0 == 0) goto L_0x00fc
            java.util.Collection<wjh> r10 = r10.k
            java.util.Iterator r10 = r10.iterator()
        L_0x00c7:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00fc
            java.lang.Object r0 = r10.next()
            wjh r0 = (defpackage.wjh) r0
            java.util.Locale r1 = java.util.Locale.US
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            java.lang.String r5 = r0.a
            r6 = 0
            r4[r6] = r5
            java.lang.String r5 = "app[build][libraries][%s][version]"
            java.lang.String r1 = java.lang.String.format(r1, r5, r4)
            java.lang.String r4 = r0.b
            r9.a(r1, r2, r4)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = r0.a
            r3[r6] = r4
            java.lang.String r4 = "app[build][libraries][%s][type]"
            java.lang.String r1 = java.lang.String.format(r1, r4, r3)
            java.lang.String r0 = r0.c
            r9.a(r1, r2, r0)
            goto L_0x00c7
        L_0x00fc:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wlp.a(io.fabric.sdk.android.services.network.HttpRequest, wls):io.fabric.sdk.android.services.network.HttpRequest");
    }

    public boolean a(wls wls) {
        HttpRequest a = a(a().a("X-CRASHLYTICS-API-KEY", wls.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", this.b.a()), wls);
        wji a2 = wja.a();
        StringBuilder sb = new StringBuilder("Sending app info to ");
        sb.append(this.a);
        String str = "Fabric";
        a2.a(str, sb.toString());
        if (wls.j != null) {
            wji a3 = wja.a();
            StringBuilder sb2 = new StringBuilder("App icon hash is ");
            sb2.append(wls.j.a);
            a3.a(str, sb2.toString());
            wji a4 = wja.a();
            StringBuilder sb3 = new StringBuilder("App icon size is ");
            sb3.append(wls.j.c);
            sb3.append("x");
            sb3.append(wls.j.d);
            a4.a(str, sb3.toString());
        }
        int b = a.b();
        String str2 = Request.POST.equals(a.a().getRequestMethod()) ? "Create" : "Update";
        wji a5 = wja.a();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str2);
        sb4.append(" app request ID: ");
        sb4.append(a.a("X-REQUEST-ID"));
        a5.a(str, sb4.toString());
        wji a6 = wja.a();
        StringBuilder sb5 = new StringBuilder("Result was ");
        sb5.append(b);
        a6.a(str, sb5.toString());
        return wkf.a(b) == 0;
    }
}
