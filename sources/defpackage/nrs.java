package defpackage;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: nrs reason: default package */
public final class nrs {
    final Context a;
    final ujc b;
    final jvy c;
    final jsi d;
    private final jrp e;
    private final hee f;

    nrs(jrp jrp, Context context, ujc ujc, hee hee, jvy jvy, jsi jsi) {
        this.e = jrp;
        this.a = context;
        this.b = ujc;
        this.f = hee;
        this.c = jvy;
        this.d = jsi;
    }

    /* access modifiers changed from: 0000 */
    public void a(hvf hvf, String str, String str2) {
        gbk.a((CharSequence) str, "referralCode must be set");
        if (str2 != null && !str2.isEmpty()) {
            this.f.a("created_by_partner", str2);
            this.f.a("mobile-product-test", str2);
        }
        this.f.a("referral", str);
        this.f.a("referral-timestamp", a(hvf));
    }

    private String a(hvf hvf) {
        Long l = (Long) hvf.call().a(Long.valueOf(0));
        Calendar f2 = this.e.f();
        f2.setTimeInMillis(l.longValue() * 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        StringBuilder sb = new StringBuilder();
        sb.append(simpleDateFormat.format(f2.getTime()));
        sb.append(" UTC");
        return sb.toString();
    }
}
