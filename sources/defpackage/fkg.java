package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: fkg reason: default package */
public final class fkg extends fjh<Time> {
    public static final fji a = new fji() {
        public final <T> fjh<T> a(fix fix, fko<T> fko) {
            if (fko.a == Time.class) {
                return new fkg();
            }
            return null;
        }
    };
    private final DateFormat b = new SimpleDateFormat("hh:mm:ss a");

    /* access modifiers changed from: private */
    public synchronized void a(fkq fkq, Time time) {
        fkq.b(time == null ? null : this.b.format(time));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public synchronized Time a(fkp fkp) {
        if (fkp.f() == JsonToken.NULL) {
            fkp.k();
            return null;
        }
        try {
            return new Time(this.b.parse(fkp.i()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException((Throwable) e);
        }
    }
}
