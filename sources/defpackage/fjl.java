package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: fjl reason: default package */
public final class fjl extends fin<Date> {
    public static final fio a = new fio() {
        public final <T> fin<T> a(fid fid, fju<T> fju) {
            if (fju.a == Date.class) {
                return new fjl();
            }
            return null;
        }
    };
    private final DateFormat b = new SimpleDateFormat("MMM d, yyyy");

    /* access modifiers changed from: private */
    /* renamed from: b */
    public synchronized Date a(fjv fjv) {
        if (fjv.f() == JsonToken.NULL) {
            fjv.k();
            return null;
        }
        try {
            return new Date(this.b.parse(fjv.i()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException((Throwable) e);
        }
    }

    /* access modifiers changed from: private */
    public synchronized void a(fjw fjw, Date date) {
        fjw.b(date == null ? null : this.b.format(date));
    }
}
