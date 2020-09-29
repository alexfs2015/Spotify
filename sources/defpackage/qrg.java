package defpackage;

import com.spotify.music.features.tasteonboarding.logging.Intent;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: qrg reason: default package */
public final class qrg {
    public final jlr a;
    public final qul b;
    private final InteractionLogger c;
    private final ImpressionLogger d;

    qrg(jlr jlr, InteractionLogger interactionLogger, ImpressionLogger impressionLogger, qul qul) {
        this.a = jlr;
        this.c = interactionLogger;
        this.d = impressionLogger;
        this.b = qul;
    }

    public final void a() {
        a((String) null, "to-artist-picker", 0, ImpressionType.BUTTON, RenderType.PAGE);
    }

    public final void a(TasteOnboardingItem tasteOnboardingItem, int i, int i2, String str) {
        qur qur = (qur) fbp.a(tasteOnboardingItem.logging());
        this.a.a(this.b.a(tasteOnboardingItem.id(), Intent.SELECT_ENABLE.mIntent, qur.b(), qur.c(), qur.a(), i, i2, str));
    }

    public void a(String str, String str2, int i, ImpressionType impressionType, RenderType renderType) {
        this.d.a(str, str2, i, impressionType, renderType);
    }

    public void a(String str, String str2, int i, InteractionType interactionType, Intent intent) {
        this.c.a(null, str2, 0, interactionType, intent.mIntent);
    }

    public final void b(TasteOnboardingItem tasteOnboardingItem, int i, int i2, String str) {
        qur qur = (qur) fbp.a(tasteOnboardingItem.logging());
        this.a.a(this.b.a(tasteOnboardingItem.id(), Intent.SELECT_DISABLE.mIntent, qur.b(), qur.c(), qur.a(), i, i2, str));
    }
}
