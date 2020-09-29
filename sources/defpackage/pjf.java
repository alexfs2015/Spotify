package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: pjf reason: default package */
public final class pjf {
    private final hed a;
    private final jrp b;

    public pjf(hed hed, jrp jrp) {
        this.a = hed;
        this.b = jrp;
    }

    public final wud<Integer> a() {
        return this.a.a("product-expiry").f(new $$Lambda$pjf$lnPesAYgSLnwShfHfLIj_TQ3ow(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Integer a(String str) {
        try {
            Date parse = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH).parse(str);
            return Integer.valueOf((int) TimeUnit.MILLISECONDS.toDays(a(parse).getTime() - a(new Date(this.b.a())).getTime()));
        } catch (ParseException e) {
            throw wul.a((Throwable) e);
        }
    }

    private Date a(Date date) {
        Calendar f = this.b.f();
        f.setTime(date);
        f.set(11, 0);
        f.set(12, 0);
        f.set(13, 0);
        f.set(14, 0);
        return f.getTime();
    }
}
