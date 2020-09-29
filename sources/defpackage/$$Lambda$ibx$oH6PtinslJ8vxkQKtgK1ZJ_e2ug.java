package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$ibx$oH6PtinslJ8vxkQKtgK1ZJ_e2ug reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ibx$oH6PtinslJ8vxkQKtgK1ZJ_e2ug implements Consumer {
    private final /* synthetic */ String f$0;
    private final /* synthetic */ String f$1;

    public /* synthetic */ $$Lambda$ibx$oH6PtinslJ8vxkQKtgK1ZJ_e2ug(String str, String str2) {
        this.f$0 = str;
        this.f$1 = str2;
    }

    public final void accept(Object obj) {
        Logger.b("Failed to report event %s for ad %s.", this.f$0, this.f$1);
    }
}
