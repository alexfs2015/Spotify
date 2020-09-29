package defpackage;

import com.fasterxml.jackson.databind.util.ISO8601DateFormat;
import java.text.ParseException;

/* renamed from: ubu reason: default package */
public final class ubu {
    private final tyx a;
    private final ISO8601DateFormat b = new ISO8601DateFormat();

    public ubu(tyx tyx) {
        this.a = tyx;
    }

    public final String a(String str, int i) {
        String str2 = "";
        if (i <= 0) {
            return str2;
        }
        if (str == null) {
            str = str2;
        }
        try {
            return this.a.a("", (int) (this.b.parse(str).getTime() / 1000), i, null, false).a(true).a();
        } catch (ParseException unused) {
            return str2;
        }
    }
}
