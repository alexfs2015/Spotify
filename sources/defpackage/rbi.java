package defpackage;

import com.spotify.mobile.android.util.Assertion.RecoverableAssertionError;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Action;

/* renamed from: rbi reason: default package */
public final class rbi implements rbd {
    private final ufq a;
    private final ram b;

    public rbi(ufq ufq, ram ram) {
        this.a = ufq;
        this.b = ram;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.a.a(true);
    }

    public final Completable a(String str, String str2, String str3) {
        return Completable.a((Action) new $$Lambda$rbi$3JVpo7uCp8qAXqQu7JtM0Fzplg8(this)).a((CompletableSource) this.b.a(str, str2, str, str3, ""));
    }

    public final Completable a(String str, String str2) {
        return this.b.a(str, str2, str, "");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.a.a(false);
    }

    public final Completable b(String str, String str2) {
        return Completable.a((Action) new $$Lambda$rbi$5W7fqrPlyOMy0pYebKnpzH8DxvU(this));
    }

    public final Completable c(String str, String str2) {
        return Completable.a();
    }

    public final Completable b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder("Artist bans not available on radio: ");
        sb.append(str2);
        throw new RecoverableAssertionError(sb.toString());
    }

    public final Completable c(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder("Artist bans not available on radio: ");
        sb.append(str2);
        throw new RecoverableAssertionError(sb.toString());
    }
}
