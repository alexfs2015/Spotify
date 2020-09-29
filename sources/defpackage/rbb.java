package defpackage;

import io.reactivex.Completable;

/* renamed from: rbb reason: default package */
public final class rbb implements rbd {
    private final ram a;

    public rbb(ram ram) {
        this.a = ram;
    }

    public final Completable a(String str, String str2, String str3) {
        return this.a.a(str, str2, str, str3, "");
    }

    public final Completable a(String str, String str2) {
        return this.a.a(str, str2, str, "");
    }

    public final Completable b(String str, String str2) {
        return this.a.b(str, str2, str, "", "local");
    }

    public final Completable c(String str, String str2) {
        return this.a.a(str, str2, str, "");
    }

    public final Completable b(String str, String str2, String str3) {
        return this.a.b(str, str2, str3, "", "local");
    }

    public final Completable c(String str, String str2, String str3) {
        return this.a.a(str, str2, str3, "");
    }
}
