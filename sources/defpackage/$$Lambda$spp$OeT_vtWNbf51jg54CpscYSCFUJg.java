package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.functions.Action;

/* renamed from: -$$Lambda$spp$OeT_vtWNbf51jg54CpscYSCFUJg reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$spp$OeT_vtWNbf51jg54CpscYSCFUJg implements Action {
    private final /* synthetic */ wup f$0;
    private final /* synthetic */ Intent f$1;
    private final /* synthetic */ fpt f$2;
    private final /* synthetic */ SessionState f$3;

    public /* synthetic */ $$Lambda$spp$OeT_vtWNbf51jg54CpscYSCFUJg(wup wup, Intent intent, fpt fpt, SessionState sessionState) {
        this.f$0 = wup;
        this.f$1 = intent;
        this.f$2 = fpt;
        this.f$3 = sessionState;
    }

    public final void run() {
        this.f$0.call(this.f$1, this.f$2, this.f$3);
    }
}
