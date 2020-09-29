package defpackage;

import com.spotify.base.java.logging.Logger;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$tfk$XJDa0VbQM0gy0N4naRtPSkM-BlA reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$tfk$XJDa0VbQM0gy0N4naRtPSkMBlA implements Consumer {
    public static final /* synthetic */ $$Lambda$tfk$XJDa0VbQM0gy0N4naRtPSkMBlA INSTANCE = new $$Lambda$tfk$XJDa0VbQM0gy0N4naRtPSkMBlA();

    private /* synthetic */ $$Lambda$tfk$XJDa0VbQM0gy0N4naRtPSkMBlA() {
    }

    public final void accept(Object obj) {
        Logger.e("Error observing PlayerTrack: %s", ((Throwable) obj).toString());
    }
}
