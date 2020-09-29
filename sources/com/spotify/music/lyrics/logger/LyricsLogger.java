package com.spotify.music.lyrics.logger;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerStateUtil;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.InteractionLogger;

public final class LyricsLogger {
    public final InteractionLogger a;
    public final ImpressionLogger b;
    private final wzi<PlayerState> c;

    public enum LyricsMode {
        FULLSCREEN("spotify:internal:lyrics:v2:fullscreen"),
        CARD("spotify:internal:lyrics:v2:card");
        
        private final String mMode;

        private LyricsMode(String str) {
            this.mMode = str;
        }

        public final String toString() {
            return this.mMode;
        }
    }

    public enum UserIntent {
        SHOW_FULLSCREEN("show-fullscreen"),
        CLOSE_FULLSCREEN("close-fullscreen"),
        SHARE("share");
        
        private final String mUserIntent;

        private UserIntent(String str) {
            this.mUserIntent = str;
        }

        public final String toString() {
            return this.mUserIntent;
        }
    }

    public LyricsLogger(InteractionLogger interactionLogger, ImpressionLogger impressionLogger, wzi<PlayerState> wzi) {
        this.a = (InteractionLogger) fbp.a(interactionLogger);
        this.c = (wzi) fbp.a(wzi);
        this.b = impressionLogger;
    }

    public String a() {
        return PlayerStateUtil.getTrackUri((PlayerState) this.c.get());
    }
}
