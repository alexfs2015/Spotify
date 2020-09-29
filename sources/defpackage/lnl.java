package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Observable;

/* renamed from: lnl reason: default package */
public final class lnl implements wig<Observable<String>> {
    private final wzi<xii<SessionState>> a;

    private lnl(wzi<xii<SessionState>> wzi) {
        this.a = wzi;
    }

    public static lnl a(wzi<xii<SessionState>> wzi) {
        return new lnl(wzi);
    }

    public final /* synthetic */ Object get() {
        return (Observable) wil.a(CC.b((xii) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
