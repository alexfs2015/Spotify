package defpackage;

import com.crashlytics.android.core.Report;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.io.File;
import java.util.Map.Entry;

/* renamed from: ail reason: default package */
final class ail extends vvi implements aij {
    public ail(vuz vuz, String str, String str2, vxb vxb) {
        super(vuz, str, str2, vxb, HttpMethod.POST);
    }

    public final boolean a(aii aii) {
        File[] d;
        HttpRequest a = a().a("X-CRASHLYTICS-API-KEY", aii.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", this.b.a());
        for (Entry entry : aii.b.e().entrySet()) {
            a = a.a((String) entry.getKey(), (String) entry.getValue());
        }
        Report report = aii.b;
        a.a("report[identifier]", (String) null, report.b());
        String str = "application/octet-stream";
        String str2 = " to report ";
        String str3 = "CrashlyticsCore";
        if (report.d().length == 1) {
            vvc a2 = vuu.a();
            StringBuilder sb = new StringBuilder("Adding single file ");
            sb.append(report.a());
            sb.append(str2);
            sb.append(report.b());
            a2.a(str3, sb.toString());
            a = a.a("report[file]", report.a(), str, report.c());
        } else {
            int i = 0;
            for (File file : report.d()) {
                vvc a3 = vuu.a();
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
        vvc a4 = vuu.a();
        StringBuilder sb4 = new StringBuilder("Sending report to: ");
        sb4.append(this.a);
        a4.a(str3, sb4.toString());
        int b = a.b();
        vvc a5 = vuu.a();
        StringBuilder sb5 = new StringBuilder("Create report request ID: ");
        sb5.append(a.a("X-REQUEST-ID"));
        a5.a(str3, sb5.toString());
        vvc a6 = vuu.a();
        StringBuilder sb6 = new StringBuilder("Result was: ");
        sb6.append(b);
        a6.a(str3, sb6.toString());
        return vvz.a(b) == 0;
    }
}
