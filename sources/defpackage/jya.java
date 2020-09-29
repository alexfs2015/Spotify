package defpackage;

import java.util.Map;
import java.util.UUID;

/* renamed from: jya reason: default package */
public abstract class jya {
    public abstract String a();

    public abstract boolean b();

    public abstract boolean c();

    public abstract String d();

    public abstract Map<String, String> e();

    private static String f() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static jya a(jyb jyb) {
        jxj jxj = new jxj(f(), jyb.a(), jyb.b(), jyb.c(), jyb.d());
        return jxj;
    }

    public final String a(String str, String str2) {
        return (e() == null || !e().containsKey(str)) ? str2 : (String) e().get(str);
    }
}
