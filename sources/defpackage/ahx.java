package defpackage;

import io.fabric.sdk.android.services.network.HttpMethod;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.io.File;
import java.util.List;

/* renamed from: ahx reason: default package */
final class ahx extends wjo implements wlb {
    private final String c;

    public ahx(wjf wjf, String str, String str2, wlh wlh, String str3) {
        super(wjf, str, str2, wlh, HttpMethod.POST);
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
        wji a2 = wja.a();
        StringBuilder sb2 = new StringBuilder("Sending ");
        sb2.append(list.size());
        sb2.append(" analytics files to ");
        sb2.append(this.a);
        String sb3 = sb2.toString();
        String str = "Answers";
        a2.a(str, sb3);
        int b = a.b();
        wji a3 = wja.a();
        StringBuilder sb4 = new StringBuilder("Response code for analytics file send is ");
        sb4.append(b);
        a3.a(str, sb4.toString());
        return wkf.a(b) == 0;
    }
}
