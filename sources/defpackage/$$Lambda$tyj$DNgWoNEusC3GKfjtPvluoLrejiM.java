package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$tyj$DNgWoNEusC3GKfjtPvluoLrejiM reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$tyj$DNgWoNEusC3GKfjtPvluoLrejiM implements Consumer {
    private final /* synthetic */ String f$0;

    public /* synthetic */ $$Lambda$tyj$DNgWoNEusC3GKfjtPvluoLrejiM(String str) {
        this.f$0 = str;
    }

    public final void accept(Object obj) {
        Logger.e((Throwable) obj, String.format("Failed to fetch episode context: %s", new Object[]{this.f$0}), new Object[0]);
    }
}
