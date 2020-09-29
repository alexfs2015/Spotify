package defpackage;

import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.ubi.interactions.InteractionAction;

/* renamed from: tyf reason: default package */
public final class tyf implements tye {
    private final lar a;
    private final gkq b;
    private final InteractionLogger c;

    public tyf(lar lar, gkq gkq, InteractionLogger interactionLogger) {
        this.a = lar;
        this.b = gkq;
        this.c = interactionLogger;
    }

    public final void a(String str, boolean z) {
        if (z) {
            this.a.a(str, true);
        } else {
            this.a.a(str, str, true);
        }
        boolean z2 = !z;
        if (this.b != PageIdentifiers.UNKNOWN) {
            InteractionAction interactionAction = z2 ? InteractionAction.FOLLOW : InteractionAction.UNFOLLOW;
            this.c.a(str, (String) null, -1, InteractionType.HIT, interactionAction.mLogString, interactionAction);
            return;
        }
        Assertion.b("Follow action attempted on unknown page");
    }
}
