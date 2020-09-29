package defpackage;

import com.spotify.music.features.languagepicker.logger.LogInfo.Button;
import com.spotify.music.features.languagepicker.logger.LogInfo.UserIntent;
import com.spotify.music.features.languagepicker.logger.LogInfo.View;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: nph reason: default package */
public final class nph implements npg {
    public final InteractionLogger a;
    private final ImpressionLogger b;

    public nph(ImpressionLogger impressionLogger, InteractionLogger interactionLogger) {
        this.b = (ImpressionLogger) fay.a(impressionLogger);
        this.a = (InteractionLogger) fay.a(interactionLogger);
    }

    public final void a() {
        View.LOADING.a(this.b);
    }

    public final void b() {
        View.ERROR.a(this.b);
    }

    public final void c() {
        View.NO_CONNECTION.a(this.b);
    }

    public final void d() {
        View.LANGUAGES.a(this.b);
    }

    public final void e() {
        Button.NEXT.a(this.b);
    }

    public final void f() {
        Button.RETRY.a(this.b);
    }

    public final void a(npo npo, int i) {
        this.b.a(npo.a(), "language-picker", i, ImpressionType.ITEM, RenderType.GRID);
    }

    public final void g() {
        Button.NEXT.a(this.a);
    }

    public final void h() {
        Button.RETRY.a(this.a);
    }

    public final void b(npo npo, int i) {
        this.a.a(npo.a(), "language-picker", i, InteractionType.HIT, (npo.d() ? UserIntent.SELECT : UserIntent.DESELECT).toString());
    }
}
