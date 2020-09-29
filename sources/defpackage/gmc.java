package defpackage;

import android.os.Parcelable;
import java.io.IOException;
import java.util.Comparator;
import java.util.Locale;

@fjj(a = a.class)
/* renamed from: gmc reason: default package */
public abstract class gmc implements Parcelable {
    public static final Comparator<gmc> d = $$Lambda$gmc$QHUWv7Lx8K8KIQkWXDPPjA08v0.INSTANCE;

    /* renamed from: gmc$a */
    static class a extends fjh<gmc> {
        public final /* synthetic */ Object a(fkp fkp) {
            fjd g = fje.a(fkp).g();
            return gmc.a(g.a("countryCode").b(), g.a("callingCode").b());
        }

        public final /* synthetic */ void a(fkq fkq, Object obj) {
            throw new IOException();
        }
    }

    public static gmc a(String str, String str2) {
        return new gmb(str, str2, new Locale("", str).getDisplayCountry());
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof gmc)) {
            return false;
        }
        gmc gmc = (gmc) obj;
        return a().equals(gmc.a()) && b().equals(gmc.b());
    }

    public final int hashCode() {
        return ((a().hashCode() + 217) * 31) + b().hashCode();
    }
}
