package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.Consumer;

/* renamed from: hhk reason: default package */
public final class hhk implements Consumer<SessionState> {
    private final hhj a;
    private boolean b;

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

    public hhk(hhj hhj) {
        fay.a(hhj);
        this.a = hhj;
    }
}
