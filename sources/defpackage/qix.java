package defpackage;

import com.spotify.music.features.tasteonboarding.logging.Intent;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: qix reason: default package */
public final class qix {
    public final jjf a;
    public final qmd b;
    private final InteractionLogger c;
    private final ImpressionLogger d;

    qix(jjf jjf, InteractionLogger interactionLogger, ImpressionLogger impressionLogger, qmd qmd) {
        this.a = jjf;
        this.c = interactionLogger;
        this.d = impressionLogger;
        this.b = qmd;
    }

    public final void a() {
        a((String) null, "to-artist-picker", 0, ImpressionType.BUTTON, RenderType.PAGE);
    }

    public final void a(TasteOnboardingItem tasteOnboardingItem, int i, int i2, String str) {
        qmj qmj = (qmj) fay.a(tasteOnboardingItem.logging());
        this.a.a(this.b.a(tasteOnboardingItem.id(), Intent.SELECT_ENABLE.mIntent, qmj.b(), qmj.c(), qmj.a(), i, i2, str));
    }

    public final void b(TasteOnboardingItem tasteOnboardingItem, int i, int i2, String str) {
        qmj qmj = (qmj) fay.a(tasteOnboardingItem.logging());
        this.a.a(this.b.a(tasteOnboardingItem.id(), Intent.SELECT_DISABLE.mIntent, qmj.b(), qmj.c(), qmj.a(), i, i2, str));
    }

    public void a(String str, String str2, int i, InteractionType interactionType, Intent intent) {
        this.c.a(null, str2, 0, interactionType, intent.mIntent);
    }

    public void a(String str, String str2, int i, ImpressionType impressionType, RenderType renderType) {
        this.d.a(str, str2, i, impressionType, renderType);
    }
}
