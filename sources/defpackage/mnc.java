package defpackage;

import com.spotify.music.libs.viewuri.ViewUris;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: mnc reason: default package */
public final class mnc {
    private final InteractionLogger a;
    private boolean b;

    mnc(InteractionLogger interactionLogger) {
        this.a = interactionLogger;
    }

    public final void a(float f) {
        if (!this.b) {
            this.b = true;
            InteractionLogger interactionLogger = this.a;
            StringBuilder sb = new StringBuilder();
            sb.append(ViewUris.bo);
            sb.append(":volume:");
            sb.append(f);
            interactionLogger.a("", sb.toString(), "com.spotify.feature.gaia", "device-picker", -1, InteractionType.DRAG_SLIDER, "change-volume");
        }
    }
}
