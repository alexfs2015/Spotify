package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* renamed from: fjm reason: default package */
public final class fjm extends fin<Time> {
    public static final fio a = new fio() {
        public final <T> fin<T> a(fid fid, fju<T> fju) {
            if (fju.a == Time.class) {
                return new fjm();
            }
            return null;
        }
    };
    private final DateFormat b = new SimpleDateFormat("hh:mm:ss a");

    /* access modifiers changed from: private */
    /* renamed from: b */
    public synchronized Time a(fjv fjv) {
        if (fjv.f() == JsonToken.NULL) {
            fjv.k();
            return null;
        }
        try {
            return new Time(this.b.parse(fjv.i()).getTime());
        } catch (ParseException e) {
            throw new JsonSyntaxException((Throwable) e);
        }
    }

    /* access modifiers changed from: private */
    public synchronized void a(fjw fjw, Time time) {
        fjw.b(time == null ? null : this.b.format(time));
    }
}
