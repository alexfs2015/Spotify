package defpackage;

import io.reactivex.Completable;

/* renamed from: rjx reason: default package */
public final class rjx implements rjz {
    private final rji a;

    public rjx(rji rji) {
        this.a = rji;
    }

    public final Completable a(String str, String str2) {
        return this.a.a(str, str2, str, "");
    }

    public final Completable a(String str, String str2, String str3) {
        return this.a.a(str, str2, str, str3, "");
    }

    public final Completable b(String str, String str2) {
        return this.a.b(str, str2, str, "", "local");
    }

    public final Completable b(String str, String str2, String str3) {
        return this.a.b(str, str2, str3, "", "local");
    }

    public final Completable c(String str, String str2) {
        return this.a.a(str, str2, str, "");
    }

    public final Completable c(String str, String str2, String str3) {
        return this.a.a(str, str2, str3, "");
    }
}
