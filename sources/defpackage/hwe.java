package defpackage;

import android.content.Context;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

/* renamed from: hwe reason: default package */
public final class hwe {
    final ObjectMapper a;
    final hwc b;

    /* renamed from: hwe$a */
    static class a {
        String a;
        String b;
        String c;
        String d;
        String e;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    public hwe(Context context, gix gix, rwl rwl, gcb gcb, giz giz, jyg jyg) {
        this.a = rwl.a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        this.b = new hwc(giz.b.b().a(new hwd(new hwh(hvy.c, jyg.a(context), gcb), new a(gix, hvy.a, hvy.b))).a());
    }

    public final void a() {
        this.b.a.c.a();
    }
}
