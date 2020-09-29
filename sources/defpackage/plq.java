package defpackage;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.podcastonboarding.logger.PodcastOnboardingLogger;
import com.spotify.podcastonboarding.logger.PodcastOnboardingLogger.PodcastOnboardingRenderType;
import com.spotify.podcastonboarding.logger.UserIntent;

/* renamed from: plq reason: default package */
public final class plq implements PodcastOnboardingLogger {
    private final InteractionLogger a;
    private final ImpressionLogger b;
    private final jlr c;
    private final String d;
    private final sso e;

    public plq(InteractionLogger interactionLogger, ImpressionLogger impressionLogger, jlr jlr, sso sso, gkq gkq) {
        this.a = interactionLogger;
        this.b = impressionLogger;
        this.c = jlr;
        this.e = sso;
        this.d = gkq.a();
    }

    private void a(String str, String str2, int i, ImpressionType impressionType, RenderType renderType) {
        this.b.a(null, str2, 0, impressionType, renderType);
    }

    private void a(String str, String str2, int i, UserIntent userIntent) {
        this.a.a(str, str2, i, InteractionType.HIT, userIntent.mIntent);
    }

    public final void a() {
        a(null, "po-topic-picker", 0, UserIntent.NAVIGATE_FORWARD);
    }

    public final void a(String str, int i) {
        a(str, "po-topic-picker", i, UserIntent.SELECT_ENABLE);
    }

    public final void a(String str, int i, PodcastOnboardingRenderType podcastOnboardingRenderType) {
        ImpressionType impressionType = ImpressionType.ITEM;
        jlr jlr = this.c;
        String str2 = "";
        be beVar = new be(str2, this.d, this.e.toString(), "po-topic-picker", (long) i, str, impressionType.toString(), podcastOnboardingRenderType.toString(), (double) jtp.a.a());
        jlr.a(beVar);
    }

    public final void b() {
        a(null, "po-topic-picker", 0, UserIntent.SKIP);
    }

    public final void b(String str, int i) {
        a(str, "po-topic-picker", i, UserIntent.SELECT_DISABLE);
    }

    public final void c() {
        a(null, "po-skip-dialog", 0, UserIntent.NAVIGATE_FORWARD);
    }

    public final void d() {
        a(null, "po-skip-dialog", 0, UserIntent.SKIP_DISMISS);
    }

    public final void e() {
        a(null, "po-topic-picker", 0, ImpressionType.BUTTON, RenderType.PAGE);
    }

    public final void f() {
        a(null, "po-skip-dialog", 0, ImpressionType.DIALOG, RenderType.DIALOG);
    }

    public final void g() {
        a(null, "po-topic-picker", 0, ImpressionType.ERROR, RenderType.PAGE);
    }
}
