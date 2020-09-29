package defpackage;

import android.net.Uri;
import com.spotify.mobile.android.util.Assertion;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Protocol;

/* renamed from: giq reason: default package */
public final class giq implements wly {
    private final Map<String, Long> a = new HashMap(16);
    private final gio b;
    private final jrp c;

    public giq(gio gio, gbd gbd) {
        this.b = gio;
        this.c = gbd.a();
    }

    public final wmf a(a aVar) {
        wmd a2 = aVar.a();
        if (!this.b.a(a2)) {
            return aVar.a(a2);
        }
        Uri parse = Uri.parse(a2.a.a().toExternalForm());
        List pathSegments = parse.getPathSegments();
        StringBuilder sb = new StringBuilder();
        sb.append(parse.getHost());
        String str = "";
        sb.append(pathSegments.isEmpty() ? str : (String) pathSegments.get(0));
        String sb2 = sb.toString();
        long j = 0;
        Date date = null;
        if (((Long) jtc.a(this.a.get(sb2), Long.valueOf(0))).longValue() - this.c.c() > 0) {
            a aVar2 = new a();
            aVar2.a = a2;
            aVar2.b = Protocol.HTTP_1_1;
            aVar2.c = 429;
            aVar2.g = wmg.a(null, new byte[0]);
            aVar2.d = str;
            return aVar2.a();
        }
        wmf a3 = aVar.a(a2);
        String str2 = "Retry-After";
        String a4 = a3.a(str2, null);
        if (a4 != null) {
            String a5 = a3.f.a(str2);
            if (a5 != null) {
                date = wna.a(a5);
            }
            if (date != null) {
                Calendar f = this.c.f();
                f.setTime(date);
                j = (this.c.c() + f.getTimeInMillis()) - this.c.a();
            } else {
                try {
                    j = this.c.c() + (Long.parseLong(a4) * 1000);
                } catch (NumberFormatException unused) {
                    StringBuilder sb3 = new StringBuilder("Could not parse Retry-After header as long: ");
                    sb3.append(a4);
                    Assertion.b(sb3.toString());
                }
            }
            this.a.put(sb2, Long.valueOf(j));
        }
        return a3;
    }
}
