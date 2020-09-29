package defpackage;

import com.spotify.mobile.android.ui.contextmenu.helper.ContextMenuEvent;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;

/* renamed from: mdv reason: default package */
public final class mdv {
    private final InteractionLogger a;

    public mdv(InteractionLogger interactionLogger) {
        this.a = interactionLogger;
    }

    public final void a(ContextMenuEvent contextMenuEvent, String str) {
        String str2 = str;
        this.a.a(str2, "toolbar-menu", -1, InteractionType.HIT, contextMenuEvent.toString());
    }
}
