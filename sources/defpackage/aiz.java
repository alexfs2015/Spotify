package defpackage;

import com.crashlytics.android.core.Report;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.io.File;
import java.util.Map.Entry;

/* renamed from: aiz reason: default package */
final class aiz extends wjo implements aix {
    public aiz(wjf wjf, String str, String str2, wlh wlh) {
        super(wjf, str, str2, wlh, HttpMethod.POST);
    }

    public final boolean a(aiw aiw) {
        File[] d;
        HttpRequest a = a().a("X-CRASHLYTICS-API-KEY", aiw.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", this.b.a());
        for (Entry entry : aiw.b.e().entrySet()) {
            a = a.a((String) entry.getKey(), (String) entry.getValue());
        }
        Report report = aiw.b;
        a.a("report[identifier]", (String) null, report.b());
        String str = "application/octet-stream";
        String str2 = " to report ";
        String str3 = "CrashlyticsCore";
        if (report.d().length == 1) {
            wji a2 = wja.a();
            StringBuilder sb = new StringBuilder("Adding single file ");
            sb.append(report.a());
            sb.append(str2);
            sb.append(report.b());
            a2.a(str3, sb.toString());
            a = a.a("report[file]", report.a(), str, report.c());
        } else {
            int i = 0;
            for (File file : report.d()) {
                wji a3 = wja.a();
                StringBuilder sb2 = new StringBuilder("Adding file ");
                sb2.append(file.getName());
                sb2.append(str2);
                sb2.append(report.b());
                a3.a(str3, sb2.toString());
                StringBuilder sb3 = new StringBuilder("report[file");
                sb3.append(i);
                sb3.append("]");
                a.a(sb3.toString(), file.getName(), str, file);
                i++;
            }
        }
        wji a4 = wja.a();
        StringBuilder sb4 = new StringBuilder("Sending report to: ");
        sb4.append(this.a);
        a4.a(str3, sb4.toString());
        int b = a.b();
        wji a5 = wja.a();
        StringBuilder sb5 = new StringBuilder("Create report request ID: ");
        sb5.append(a.a("X-REQUEST-ID"));
        a5.a(str3, sb5.toString());
        wji a6 = wja.a();
        StringBuilder sb6 = new StringBuilder("Result was: ");
        sb6.append(b);
        a6.a(str3, sb6.toString());
        return wkf.a(b) == 0;
    }
}
