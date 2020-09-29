package defpackage;

import com.spotify.music.features.languagepicker.logger.LogInfo.Button;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;

/* renamed from: npu reason: default package */
public final class npu implements a {
    private final npj a;
    private b b;

    public npu(npj npj) {
        this.a = (npj) fay.a(npj);
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
