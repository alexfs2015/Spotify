package defpackage;

import com.spotify.music.features.languagepicker.logger.LogInfo.Button;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;

/* renamed from: nvx reason: default package */
public final class nvx implements a {
    private final nvm a;
    private b b;

    public nvx(nvm nvm) {
        this.a = (nvm) fbp.a(nvm);
    }

    public final void a() {
        this.a.b.a("no-skip-dialog", "language-picker-no-skip-dialog", 0, ImpressionType.DIALOG, RenderType.DIALOG);
        Button.GOT_IT.a(this.a.b);
    }

    public final void a(b bVar) {
        this.b = bVar;
    }

    public final void b() {
        this.b = null;
    }

    public final void c() {
        Button.GOT_IT.a(this.a.a);
        this.b.c();
    }
}
