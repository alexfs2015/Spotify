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

/* renamed from: fjy reason: default package */
public final class fjy extends fjh<Date> {
    public static final fji a = new fji() {
        public final <T> fjh<T> a(fix fix, fko<T> fko) {
            if (fko.a == Date.class) {
                return new fjy();
            }
            return null;
        }
    };
    private final List<DateFormat> b = new ArrayList();

    public fjy() {
        this.b.add(DateFormat.getDateTimeInstance(2, 2, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.b.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (fjq.b()) {
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
            return fkk.a(str, new ParsePosition(0));
        } catch (ParseException e) {
            throw new JsonSyntaxException(str, e);
        }
    }

    /* access modifiers changed from: private */
    public synchronized void a(fkq fkq, Date date) {
        if (date == null) {
            fkq.e();
        } else {
            fkq.b(((DateFormat) this.b.get(0)).format(date));
        }
    }

    public final /* synthetic */ Object a(fkp fkp) {
        if (fkp.f() != JsonToken.NULL) {
            return a(fkp.i());
        }
        fkp.k();
        return null;
    }
}
