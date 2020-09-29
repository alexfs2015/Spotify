package defpackage;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonToken;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: fje reason: default package */
public final class fje extends fin<Date> {
    public static final fio a = new fio() {
        public final <T> fin<T> a(fid fid, fju<T> fju) {
            if (fju.a == Date.class) {
                return new fje();
            }
            return null;
        }
    };
    private final List<DateFormat> b = new ArrayList();

    public fje() {
        this.b.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.b.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (fiw.b()) {
            List<DateFormat> list = this.b;
            StringBuilder sb = new StringBuilder();
            sb.append("MMM d, yyyy");
            sb.append(" ");
            sb.append("h:mm:ss a");
            list.add(new SimpleDateFormat(sb.toString(), Locale.US));
        }
    }

    private synchronized Date a(String str) {
        for (DateFormat parse : this.b) {
            try {
                return parse.parse(str);
            } catch (ParseException unused) {
            }
        }
        try {
            return fjq.a(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new JsonSyntaxException(str, e);
        }
    }

    /* access modifiers changed from: private */
    public synchronized void a(fjw fjw, Date date) {
        if (date == null) {
            fjw.e();
        } else {
            fjw.b(((DateFormat) this.b.get(0)).format(date));
        }
    }

    public final /* synthetic */ Object a(fjv fjv) {
        if (fjv.f() != JsonToken.NULL) {
            return a(fjv.i());
        }
        fjv.k();
        return null;
    }
}
