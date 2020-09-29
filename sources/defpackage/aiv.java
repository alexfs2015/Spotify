package defpackage;

import com.crashlytics.android.core.Report;
import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.io.File;

/* renamed from: aiv reason: default package */
final class aiv extends vvi implements aij {
    public aiv(vuz vuz, String str, String str2, vxb vxb) {
        super(vuz, str, str2, vxb, HttpMethod.POST);
    }

    public final boolean a(aii aii) {
        HttpRequest a = a();
        String str = aii.a;
        StringBuilder sb = new StringBuilder("Crashlytics Android SDK/");
        sb.append(this.b.a());
        a.a("User-Agent", sb.toString()).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", this.b.a()).a("X-CRASHLYTICS-API-KEY", str);
        HttpRequest a2 = a(a, aii.b);
        vvc a3 = vuu.a();
        StringBuilder sb2 = new StringBuilder("Sending report to: ");
        sb2.append(this.a);
        String str2 = "CrashlyticsCore";
        a3.a(str2, sb2.toString());
        int b = a2.b();
        vvc a4 = vuu.a();
        StringBuilder sb3 = new StringBuilder("Result was: ");
        sb3.append(b);
        a4.a(str2, sb3.toString());
        return vvz.a(b) == 0;
    }

    private static HttpRequest a(HttpRequest httpRequest, Report report) {
        File[] d;
        httpRequest.a("report_id", (String) null, report.b());
        for (File file : report.d()) {
            String str = "application/octet-stream";
            if (file.getName().equals("minidump")) {
                httpRequest.a("minidump_file", file.getName(), str, file);
            } else if (file.getName().equals("metadata")) {
                httpRequest.a("crash_meta_file", file.getName(), str, file);
            } else if (file.getName().equals("binaryImages")) {
                httpRequest.a("binary_images_file", file.getName(), str, file);
            } else if (file.getName().equals("session")) {
                httpRequest.a("session_meta_file", file.getName(), str, file);
            } else if (file.getName().equals("app")) {
                httpRequest.a("app_meta_file", file.getName(), str, file);
            } else if (file.getName().equals("device")) {
                httpRequest.a("device_meta_file", file.getName(), str, file);
            } else if (file.getName().equals("os")) {
                httpRequest.a("os_meta_file", file.getName(), str, file);
            } else if (file.getName().equals("user")) {
                httpRequest.a("user_meta_file", file.getName(), str, file);
            } else if (file.getName().equals("logs")) {
                httpRequest.a("logs_file", file.getName(), str, file);
            } else if (file.getName().equals("keys")) {
                httpRequest.a("keys_file", file.getName(), str, file);
            }
        }
        return httpRequest;
    }
}
