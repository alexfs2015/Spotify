package defpackage;

import com.google.common.base.Optional;

/* renamed from: sgc reason: default package */
public abstract class sgc {
    public abstract String a();

    public abstract String b();

    public abstract Optional<Integer> c();

    public static sgc a(String str, String str2) {
        return new sfy(str, str2, Optional.e());
    }

    public static sgc a(String str, String str2, int i) {
        return new sfy(str, str2, Optional.b(Integer.valueOf(i)));
    }
}
