package defpackage;

import com.spotify.music.nowplaying.drivingmode.loggers.DrivingContextMenuInteractionLogger;
import com.spotify.music.nowplaying.drivingmode.loggers.DrivingContextMenuInteractionLogger.SectionId;
import com.spotify.music.nowplaying.drivingmode.loggers.DrivingContextMenuInteractionLogger.UserIntent;

/* renamed from: tdo reason: default package */
public final class tdo implements a {
    public tfa a;
    private final gtp b;
    private final tcv c;
    private final DrivingContextMenuInteractionLogger d;

    public tdo(gtp gtp, tcv tcv, DrivingContextMenuInteractionLogger drivingContextMenuInteractionLogger) {
        this.b = gtp;
        this.c = tcv;
        this.d = drivingContextMenuInteractionLogger;
    }

    public final void a() {
        this.b.a(true);
        tcv tcv = this.c;
        tcv.a.finish();
        tcv.b.a();
        this.d.a(SectionId.DISABLE_BUTTON, UserIntent.DISABLE_DRIVING_MODE);
    }

    public final void b() {
        this.a.a();
        this.d.a(SectionId.CANCEL_BUTTON, UserIntent.CANCEL);
    }
}
