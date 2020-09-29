package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$kzj$h40i2xuDAMIIVcAkP5jLxYnTmIo reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$kzj$h40i2xuDAMIIVcAkP5jLxYnTmIo implements Consumer {
    public static final /* synthetic */ $$Lambda$kzj$h40i2xuDAMIIVcAkP5jLxYnTmIo INSTANCE = new $$Lambda$kzj$h40i2xuDAMIIVcAkP5jLxYnTmIo();

    private /* synthetic */ $$Lambda$kzj$h40i2xuDAMIIVcAkP5jLxYnTmIo() {
    }

    public final void accept(Object obj) {
        Logger.e("Error fetching shuffle dialog data: %s", ((Throwable) obj).getMessage());
    }
}
