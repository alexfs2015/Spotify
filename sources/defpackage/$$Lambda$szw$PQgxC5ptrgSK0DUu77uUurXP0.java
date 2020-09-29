package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.Action;

/* renamed from: -$$Lambda$szw$-PQg-xC5ptrgSK0DUu77uUurXP0 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$szw$PQgxC5ptrgSK0DUu77uUurXP0 implements Action {
    private final /* synthetic */ xiu f$0;
    private final /* synthetic */ Intent f$1;
    private final /* synthetic */ fqn f$2;
    private final /* synthetic */ SessionState f$3;

    public /* synthetic */ $$Lambda$szw$PQgxC5ptrgSK0DUu77uUurXP0(xiu xiu, Intent intent, fqn fqn, SessionState sessionState) {
        this.f$0 = xiu;
        this.f$1 = intent;
        this.f$2 = fqn;
        this.f$3 = sessionState;
    }

    public final void run() {
        this.f$0.call(this.f$1, this.f$2, this.f$3);
    }
}
