package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.Consumer;

/* renamed from: hke reason: default package */
public final class hke implements Consumer<SessionState> {
    private final hkd a;
    private boolean b;

    public hke(hkd hkd) {
        fbp.a(hkd);
        this.a = hkd;
    }

    public final /* synthetic */ void accept(Object obj) {
        SessionState sessionState = (SessionState) obj;
        boolean z = this.b;
        this.b = sessionState.loggedIn();
        if (!this.b || z) {
            if (!this.b && z) {
                this.a.a(false);
            }
            return;
        }
        this.a.a(true);
    }
}
