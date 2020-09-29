package defpackage;

import com.spotify.music.nowplaying.drivingmode.loggers.DrivingContextMenuInteractionLoggerImpl;

/* renamed from: tnx reason: default package */
public final class tnx implements a {
    public tpk a;
    private final gvp b;
    private final tnc c;
    private final tnp d;

    public tnx(gvp gvp, tnc tnc, DrivingContextMenuInteractionLoggerImpl drivingContextMenuInteractionLoggerImpl) {
        this.b = gvp;
        this.c = tnc;
        this.d = drivingContextMenuInteractionLoggerImpl;
    }

    public final void a() {
        this.b.a(true);
        tnc tnc = this.c;
        tnc.a.finish();
        tnc.b.a();
        this.d.a();
    }

    public final void a(boolean z) {
        if (!z) {
            this.d.c();
        }
    }

    public final void b() {
        this.a.a();
        this.d.b();
    }
}
