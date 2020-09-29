package defpackage;

import com.spotify.instrumentation.PageIdentifiers;

/* renamed from: rde reason: default package */
public abstract class rde implements rdd {
    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public static rde a(String str, String str2) {
        return new rcx(str, str2, null, null);
    }

    public static rde a(String str) {
        return new rcx(PageIdentifiers.UNKNOWN_UNCOVERED.mPageIdentifier, null, null, str);
    }
}
