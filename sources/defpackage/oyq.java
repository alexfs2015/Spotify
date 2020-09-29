package defpackage;

import com.spotify.music.R;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;

/* renamed from: oyq reason: default package */
public final class oyq {
    public final oww a;
    public final boolean b;
    public boolean c;
    private final a d = new a();
    private final a e = new a();
    private final tme f;
    private final ImpressionLogger g;

    public oyq(oww oww, boolean z, tme tme, ImpressionLogger impressionLogger) {
        this.a = oww;
        this.b = z;
        this.f = tme;
        this.g = impressionLogger;
    }

    public void a(uzx uzx, tur tur) {
        uzt c2 = uzx.c();
        if (c2 == null || c2.getEpisode() == null) {
            this.f.c = null;
            return;
        }
        this.f.c = c2;
        this.d.a = R.string.continue_listening_header;
        this.e.a = c2.getEpisode();
        this.e.b = (uys[]) uzx.getItems();
        tur.a(this.d);
        tur.a(this.e);
        this.e.c = new $$Lambda$oyq$X47BURwabO4x_XmMnffIL4zwJY(this, c2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(uzt uzt) {
        this.g.a(uzt.getEpisode().getUri(), "contextual-episode", -1, ImpressionType.ITEM, RenderType.LIST);
    }
}
