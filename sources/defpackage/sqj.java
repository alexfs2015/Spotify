package defpackage;

import com.google.common.base.Optional;

/* renamed from: sqj reason: default package */
public abstract class sqj {
    public static sqj a(String str, String str2) {
        return new sqf(str, str2, Optional.e());
    }

    public static sqj a(String str, String str2, int i) {
        return new sqf(str, str2, Optional.b(Integer.valueOf(i)));
    }

    public abstract String a();

    public abstract String b();

    public abstract Optional<Integer> c();
}
