package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$pbw$1$utdbr9Z5y5sxYEXxytztymaVYmk reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$pbw$1$utdbr9Z5y5sxYEXxytztymaVYmk implements Consumer {
    public static final /* synthetic */ $$Lambda$pbw$1$utdbr9Z5y5sxYEXxytztymaVYmk INSTANCE = new $$Lambda$pbw$1$utdbr9Z5y5sxYEXxytztymaVYmk();

    private /* synthetic */ $$Lambda$pbw$1$utdbr9Z5y5sxYEXxytztymaVYmk() {
    }

    public final void accept(Object obj) {
        Logger.e((Throwable) obj, "OfflineSyncPresenterInteractor: failed to change follow state for playlist", new Object[0]);
    }
}
