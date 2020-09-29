package defpackage;

import android.os.Parcelable;
import java.io.IOException;
import java.util.Comparator;
import java.util.Locale;

@fip(a = a.class)
/* renamed from: gkq reason: default package */
public abstract class gkq implements Parcelable {
    public static final Comparator<gkq> d = $$Lambda$gkq$LQwA_pT6GEy9ybg8dGP5VL995U.INSTANCE;

    /* renamed from: gkq$a */
    static class a extends fin<gkq> {
        public final /* synthetic */ Object a(fjv fjv) {
            fij g = fik.a(fjv).g();
            return gkq.a(g.a("countryCode").b(), g.a("callingCode").b());
        }

        public final /* synthetic */ void a(fjw fjw, Object obj) {
            throw new IOException();
        }
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof gkq)) {
            return false;
        }
        gkq gkq = (gkq) obj;
        if (!a().equals(gkq.a()) || !b().equals(gkq.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((a().hashCode() + 217) * 31) + b().hashCode();
    }

    public static gkq a(String str, String str2) {
        return new gkp(str, str2, new Locale("", str).getDisplayCountry());
    }
}
