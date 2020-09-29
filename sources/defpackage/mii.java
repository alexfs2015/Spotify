package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: mii reason: default package */
public final class mii {
    private final InteractionLogger a;
    private boolean b;

    mii(InteractionLogger interactionLogger) {
        this.a = interactionLogger;
    }

    public final void a(float f) {
        if (!this.b) {
            this.b = true;
            InteractionLogger interactionLogger = this.a;
            StringBuilder sb = new StringBuilder();
            sb.append(ViewUris.bp);
            sb.append(":volume:");
            sb.append(f);
            interactionLogger.a("", sb.toString(), "com.spotify.feature.gaia", "device-picker", -1, InteractionType.DRAG_SLIDER, "change-volume");
        }
    }
}
