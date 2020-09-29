package com.spotify.music.features.addtoplaylist;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;
import com.spotify.music.loggers.InteractionLogger.InteractionType;
import com.spotify.music.navigation.SimpleNavigationManager.NavigationType;

public final class AddToPlaylistLogger implements spn {
    public final ImpressionLogger a;
    private final InteractionLogger b;
    private final jjf c;

    public enum UserIntent {
        ADD("add"),
        UP(PlayerTrack.TRACK_THUMB_STATE_UP),
        BACK_NAVIGATION("back-navigation"),
        CREATE("create"),
        NAVIGATE("navigate"),
        CANCEL("cancel"),
        ADD_NON_DUPLICATE_TRACKS("add-non-duplicate-tracks"),
        DONT_ADD_NON_DUPLICATE_TRACKS("dont-add-non-duplicate-tracks"),
        ADD_ALL_TRACKS("add-all-tracks");
        
        private final String mStrValue;

        private UserIntent(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public AddToPlaylistLogger(InteractionLogger interactionLogger, ImpressionLogger impressionLogger, jjf jjf) {
        this.b = interactionLogger;
        this.a = impressionLogger;
        this.c = jjf;
    }

    public final void a() {
        a(null, "create-new-playlist-button", 0, InteractionType.HIT, UserIntent.CREATE);
    }

    public final void a(String str, int i) {
        String str2 = str;
        a(str2, "list-of-playlists", i, InteractionType.HIT, UserIntent.ADD);
    }

    public final void a(String str) {
        String str2 = str;
        a(str2, "duplicate-song-dialog", 0, InteractionType.HIT, UserIntent.DONT_ADD_NON_DUPLICATE_TRACKS);
    }

    public final void a(String str, String str2, String str3, String str4) {
        jjf jjf = this.c;
        e eVar = r2;
        e eVar2 = new e("add-to-playlist", str3, "", "list-of-playlists", str4, "", -1, str2, -1, jrf.a.a(), str);
        jjf.a(eVar);
    }

    public void a(String str, String str2, int i, InteractionType interactionType, UserIntent userIntent) {
        this.b.a(str, str2, i, interactionType, userIntent.toString());
    }

    public final void a(String str, String str2, NavigationType navigationType) {
        a(str2, null, 0, InteractionType.HIT, UserIntent.NAVIGATE);
    }
}
