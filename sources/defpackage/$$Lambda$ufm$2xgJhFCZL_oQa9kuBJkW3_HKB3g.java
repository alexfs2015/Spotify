package defpackage;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.connection.OfflineState;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$ufm$2xgJhFCZL_oQa9kuBJkW3_HKB3g reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ufm$2xgJhFCZL_oQa9kuBJkW3_HKB3g implements Consumer {
    public static final /* synthetic */ $$Lambda$ufm$2xgJhFCZL_oQa9kuBJkW3_HKB3g INSTANCE = new $$Lambda$ufm$2xgJhFCZL_oQa9kuBJkW3_HKB3g();

    private /* synthetic */ $$Lambda$ufm$2xgJhFCZL_oQa9kuBJkW3_HKB3g() {
    }

    public final void accept(Object obj) {
        Logger.b("PUT OfflineState %s", Boolean.valueOf(((OfflineState) obj).offline()));
    }
}
