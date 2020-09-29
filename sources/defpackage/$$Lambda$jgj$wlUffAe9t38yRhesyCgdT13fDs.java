package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$jgj$wlUffAe9t-38yRhesyCgdT13fDs reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$jgj$wlUffAe9t38yRhesyCgdT13fDs implements Consumer {
    public static final /* synthetic */ $$Lambda$jgj$wlUffAe9t38yRhesyCgdT13fDs INSTANCE = new $$Lambda$jgj$wlUffAe9t38yRhesyCgdT13fDs();

    private /* synthetic */ $$Lambda$jgj$wlUffAe9t38yRhesyCgdT13fDs() {
    }

    public final void accept(Object obj) {
        Logger.e("Error when subscribing to PlayerState: %s", ((Throwable) obj).getMessage());
    }
}
