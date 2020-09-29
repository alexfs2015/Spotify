package defpackage;

import com.spotify.mobile.android.util.Assertion.RecoverableAssertionError;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.functions.Action;

/* renamed from: rke reason: default package */
public final class rke implements rjz {
    private final ure a;
    private final rji b;

    public rke(ure ure, rji rji) {
        this.a = ure;
        this.b = rji;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.a.a(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.a.a(true);
    }

    public final Completable a(String str, String str2) {
        return this.b.a(str, str2, str, "");
    }

    public final Completable a(String str, String str2, String str3) {
        return Completable.a((Action) new $$Lambda$rke$3zznlCH4HMORrVt810OLMslegjY(this)).a((CompletableSource) this.b.a(str, str2, str, str3, ""));
    }

    public final Completable b(String str, String str2) {
        return Completable.a((Action) new $$Lambda$rke$EX2xLi2AEDT0xRaImjREko6Io(this));
    }

    public final Completable b(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder("Artist bans not available on radio: ");
        sb.append(str2);
        throw new RecoverableAssertionError(sb.toString());
    }

    public final Completable c(String str, String str2) {
        return Completable.a();
    }

    public final Completable c(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder("Artist bans not available on radio: ");
        sb.append(str2);
        throw new RecoverableAssertionError(sb.toString());
    }
}
