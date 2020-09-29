package defpackage;

import com.spotify.mobile.android.ui.contextmenu.helper.ContextMenuEvent;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: lsh reason: default package */
public final class lsh {
    private final InteractionLogger a;

    public lsh(InteractionLogger interactionLogger) {
        this.a = (InteractionLogger) fbp.a(interactionLogger);
    }

    public void a(String str, ContextMenuEvent contextMenuEvent) {
        String str2 = str;
        this.a.a(str2, "toolbar-menu", -1, InteractionType.HIT, contextMenuEvent.toString());
    }
}
