package defpackage;

import com.spotify.instrumentation.PageIdentifiers;

/* renamed from: rmc reason: default package */
public abstract class rmc implements rmb {
    public static rmc a(String str) {
        return new rlv(PageIdentifiers.UNKNOWN_UNCOVERED.mPageIdentifier, null, null, str);
    }

    public static rmc a(String str, String str2) {
        return new rlv(str, str2, null, null);
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();
}
