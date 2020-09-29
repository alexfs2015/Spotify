package defpackage;

import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.io.File;
import java.util.List;

/* renamed from: ahj reason: default package */
final class ahj extends vvi implements vwv {
    private final String c;

    public ahj(vuz vuz, String str, String str2, vxb vxb, String str3) {
        super(vuz, str, str2, vxb, HttpMethod.POST);
        this.c = str3;
    }

    public final boolean a(List<File> list) {
        HttpRequest a = a().a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", this.b.a()).a("X-CRASHLYTICS-API-KEY", this.c);
        int i = 0;
        for (File file : list) {
            StringBuilder sb = new StringBuilder("session_analytics_file_");
            sb.append(i);
            a.a(sb.toString(), file.getName(), "application/vnd.crashlytics.android.events", file);
            i++;
        }
        vvc a2 = vuu.a();
        StringBuilder sb2 = new StringBuilder("Sending ");
        sb2.append(list.size());
        sb2.append(" analytics files to ");
        sb2.append(this.a);
        String sb3 = sb2.toString();
        String str = "Answers";
        a2.a(str, sb3);
        int b = a.b();
        vvc a3 = vuu.a();
        StringBuilder sb4 = new StringBuilder("Response code for analytics file send is ");
        sb4.append(b);
        a3.a(str, sb4.toString());
        return vvz.a(b) == 0;
    }
}
