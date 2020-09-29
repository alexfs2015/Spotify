package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ocd$FvuPzJupxcqdp47Z7tk22-PxpAg reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ocd$FvuPzJupxcqdp47Z7tk22PxpAg implements Function {
    public static final /* synthetic */ $$Lambda$ocd$FvuPzJupxcqdp47Z7tk22PxpAg INSTANCE = new $$Lambda$ocd$FvuPzJupxcqdp47Z7tk22PxpAg();

    private /* synthetic */ $$Lambda$ocd$FvuPzJupxcqdp47Z7tk22PxpAg() {
    }

    public final Object apply(Object obj) {
        return Logger.e((Throwable) obj, "Server error. Can't fetch partner settings", new Object[0]);
    }
}
