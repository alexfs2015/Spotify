package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$iid$9mbW1VMsYo4eWnbCvAJxhfwm9RE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$iid$9mbW1VMsYo4eWnbCvAJxhfwm9RE implements Consumer {
    public static final /* synthetic */ $$Lambda$iid$9mbW1VMsYo4eWnbCvAJxhfwm9RE INSTANCE = new $$Lambda$iid$9mbW1VMsYo4eWnbCvAJxhfwm9RE();

    private /* synthetic */ $$Lambda$iid$9mbW1VMsYo4eWnbCvAJxhfwm9RE() {
    }

    public final void accept(Object obj) {
        Logger.b("Ad Targeting - Error in making request to targeting endpoint: %s", ((Throwable) obj).getMessage());
    }
}
