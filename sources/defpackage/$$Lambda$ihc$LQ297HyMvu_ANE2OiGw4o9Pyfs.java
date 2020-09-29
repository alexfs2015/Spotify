package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$ihc$LQ297HyMvu_ANE2OiGw4o9-Pyfs reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ihc$LQ297HyMvu_ANE2OiGw4o9Pyfs implements Consumer {
    public static final /* synthetic */ $$Lambda$ihc$LQ297HyMvu_ANE2OiGw4o9Pyfs INSTANCE = new $$Lambda$ihc$LQ297HyMvu_ANE2OiGw4o9Pyfs();

    private /* synthetic */ $$Lambda$ihc$LQ297HyMvu_ANE2OiGw4o9Pyfs() {
    }

    public final void accept(Object obj) {
        Logger.b("Failed to start fetch: %s", ((Throwable) obj).getMessage());
    }
}
