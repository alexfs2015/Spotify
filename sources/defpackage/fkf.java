package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: fkf reason: default package */
public final class fkf extends fjh<Date> {
    public static final fji a = new fji() {
        public final <T> fjh<T> a(fix fix, fko<T> fko) {
            if (fko.a == Date.class) {
                return new fkf();
            }
            return null;
        }
    };
    private final DateFormat b = new SimpleDateFormat("MMM d, yyyy");

    /* access modifiers changed from: private */
    public synchronized void a(fkq fkq, Date date) {
        fkq.b(date == null ? null : this.b.format(date));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public synchronized Date a(fkp fkp) {
        if (fkp.f() == JsonToken.NULL) {
            fkp.k();
            return null;
        }
        try {
            return new Date(this.b.parse(fkp.i()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException((Throwable) e);
        }
    }
}
