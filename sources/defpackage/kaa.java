package defpackage;

import java.util.Map;
import java.util.UUID;

/* renamed from: kaa reason: default package */
public abstract class kaa {
    public static kaa a(kab kab) {
        jzj jzj = new jzj(f(), kab.a(), kab.b(), kab.c(), kab.d());
        return jzj;
    }

    private static String f() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public abstract String a();

    public final String a(String str, String str2) {
        return (e() == null || !e().containsKey(str)) ? str2 : (String) e().get(str);
    }

    public abstract boolean b();

    public abstract boolean c();

    public abstract String d();

    public abstract Map<String, String> e();
}
