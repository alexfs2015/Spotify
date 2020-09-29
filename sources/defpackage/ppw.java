package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: ppw reason: default package */
public final class ppw {
    private final hgz a;
    private final jtz b;

    public ppw(hgz hgz, jtz jtz) {
        this.a = hgz;
        this.b = jtz;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Integer a(String str) {
        try {
            Date parse = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH).parse(str);
            return Integer.valueOf((int) TimeUnit.MILLISECONDS.toDays(a(parse).getTime() - a(new Date(this.b.a())).getTime()));
        } catch (ParseException e) {
            throw xiq.a((Throwable) e);
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

    public final xii<Integer> a() {
        return this.a.a("product-expiry").e((xiy<? super T, ? extends R>) new $$Lambda$ppw$ih__s2SPgD_snpuXZAw12a03ZBU<Object,Object>(this));
    }
}
