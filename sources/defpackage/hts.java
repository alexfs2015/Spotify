package defpackage;

import android.content.Context;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/* renamed from: hts reason: default package */
public final class hts {
    final ObjectMapper a;
    final htq b;

    /* renamed from: hts$a */
    static class a {
        String a;
        String b;
        String c;
        String d;
        String e;

        /* synthetic */ a(byte b2) {
            this();
        }

        private a() {
        }
    }

    public hts(Context context, ghm ghm, rnf rnf, gbd gbd, gho gho, jvy jvy) {
        this.a = rnf.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        this.b = new htq(gho.b.b().a(new htr(new htv(htm.c, jvy.a(context), gbd), new a(ghm, htm.a, htm.b))).a());
    }

    public final void a() {
        this.b.a.c.a();
    }
}
