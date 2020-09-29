package com.spotify.music.features.playlistallsongs.logging;

import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.ubi.interactions.InteractionAction;

public final class PlaylistAllSongsLoggerImpl implements oky {
    private final InteractionLogger a;
    private final ImpressionLogger b;
    private final okx c;
    private final wbt d;

    enum UserIntent {
        CLOSE("close"),
        ADD_SONGS("add-songs"),
        PLAY_PREVIEW_VIA_ROW("play-preview-via-row"),
        PLAY_PREVIEW_VIA_IMAGE("play-preview-via-image"),
        ITEM_CONTEXT_MENU_CLICKED("item-context-menu-clicked"),
        ITEM_DOWNLOAD_CLICKED("item-download-clicked"),
        BACK_NAVIGATION("back-navigation"),
        LIKE_ENABLE("like-enable"),
        LIKE_DISABLE("like-disable"),
        BAN_ENABLE("ban-enable"),
        BAN_DISABLE("ban-disable");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public PlaylistAllSongsLoggerImpl(InteractionLogger interactionLogger, ImpressionLogger impressionLogger, okx okx, wbt wbt) {
        this.a = interactionLogger;
        this.b = impressionLogger;
        this.c = okx;
        this.d = wbt;
    }

    private void a(String str, String str2, int i, InteractionType interactionType, UserIntent userIntent, InteractionAction interactionAction) {
        this.a.a(str, str2, i, interactionType, userIntent.toString(), interactionAction);
    }

    public final void a() {
        a(null, "view", 0, InteractionType.HIT, UserIntent.BACK_NAVIGATION, null);
    }

    public final void a(String str, int i) {
        String str2 = str;
        a(str2, "list", i, InteractionType.HIT, UserIntent.PLAY_PREVIEW_VIA_ROW, null);
    }

    public final void a(String str, int i, boolean z) {
        a(str, "list", i, InteractionType.HIT, z ? UserIntent.LIKE_ENABLE : UserIntent.LIKE_DISABLE, z ? InteractionAction.LIKE : InteractionAction.UNLIKE);
    }

    public final void b() {
        a(null, "toolbar", 0, InteractionType.HIT, UserIntent.CLOSE, null);
    }

    public final void b(String str, int i) {
        String str2 = str;
        a(str2, "list", i, InteractionType.HIT, UserIntent.PLAY_PREVIEW_VIA_IMAGE, null);
    }

    public final void b(String str, int i, boolean z) {
        String str2 = str;
        a(str2, "list", i, InteractionType.HIT, z ? UserIntent.BAN_ENABLE : UserIntent.BAN_DISABLE, null);
    }

    public final void c() {
        a(null, "header", 0, InteractionType.HIT, UserIntent.ADD_SONGS, null);
    }

    public final void c(String str, int i) {
        String str2 = str;
        a(str2, "list", i, InteractionType.HIT, UserIntent.ITEM_DOWNLOAD_CLICKED, null);
    }

    public final void d() {
        this.b.a(null, "update-confirmation", 0, ImpressionType.DIALOG, RenderType.DIALOG);
        wbt wbt = this.d;
        a aVar = new a(this.c, 0);
        okx okx = okx.this;
        a a2 = wbv.a();
        a2.a = "playlist-all-songs";
        a2.b = "035279906b6949ed56d4631f9578489f893c742e";
        a2.c = "c949d62257bac3368b3b4eb1587f5d7941e436e3";
        a2.e = "music";
        a2.d = okx.a;
        wbt.a(a2.a(aVar.a).a());
    }

    public final void d(String str, int i) {
        String str2 = str;
        a(str2, "list", i, InteractionType.HIT, UserIntent.ITEM_CONTEXT_MENU_CLICKED, null);
    }
}
