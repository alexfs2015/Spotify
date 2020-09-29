package defpackage;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: nxv reason: default package */
public final class nxv {
    final Context a;
    final uun b;
    final jyg c;
    final vos d;
    private final jtz e;
    private final hha f;

    nxv(jtz jtz, Context context, uun uun, hha hha, jyg jyg, vos vos) {
        this.e = jtz;
        this.a = context;
        this.b = uun;
        this.f = hha;
        this.c = jyg;
        this.d = vos;
    }

    private String a(hxr hxr) {
        Long l = (Long) hxr.call().a(Long.valueOf(0));
        Calendar f2 = this.e.f();
        f2.setTimeInMillis(l.longValue() * 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        StringBuilder sb = new StringBuilder();
        sb.append(simpleDateFormat.format(f2.getTime()));
        sb.append(" UTC");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public void a(hxr hxr, String str, String str2) {
        gci.a((CharSequence) str, "referralCode must be set");
        if (str2 != null && !str2.isEmpty()) {
            this.f.a("created_by_partner", str2);
            this.f.a("mobile-product-test", str2);
        }
        this.f.a("referral", str);
        this.f.a("referral-timestamp", a(hxr));
    }
}
