package defpackage;

import com.spotify.music.features.languagepicker.logger.LogInfo.Button;
import com.spotify.music.features.languagepicker.logger.LogInfo.UserIntent;
import com.spotify.music.features.languagepicker.logger.LogInfo.View;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: nvk reason: default package */
public final class nvk implements nvj {
    public final InteractionLogger a;
    private final ImpressionLogger b;

    public nvk(ImpressionLogger impressionLogger, InteractionLogger interactionLogger) {
        this.b = (ImpressionLogger) fbp.a(impressionLogger);
        this.a = (InteractionLogger) fbp.a(interactionLogger);
    }

    public final void a() {
        View.LOADING.a(this.b);
    }

    public final void a(nvr nvr, int i) {
        this.b.a(nvr.a(), "language-picker", i, ImpressionType.ITEM, RenderType.GRID);
    }

    public final void b() {
        View.ERROR.a(this.b);
    }

    public final void b(nvr nvr, int i) {
        this.a.a(nvr.a(), "language-picker", i, InteractionType.HIT, (nvr.d() ? UserIntent.SELECT : UserIntent.DESELECT).toString());
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

    public final void g() {
        Button.NEXT.a(this.a);
    }

    public final void h() {
        Button.RETRY.a(this.a);
    }
}
