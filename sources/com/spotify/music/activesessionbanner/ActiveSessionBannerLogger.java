package com.spotify.music.activesessionbanner;

import com.spotify.music.loggers.InteractionLogger.InteractionType;

public final class ActiveSessionBannerLogger {
    public final jlr a;
    public final jtz b;

    public enum UserIntent {
        DISMISS("dismiss"),
        GOTO_PARTNER_APP("goto-partner-app");
        
        private final String mValue;

        private UserIntent(String str) {
            this.mValue = str;
        }

        public final String toString() {
            return this.mValue;
        }
    }

    public ActiveSessionBannerLogger(jlr jlr, jtz jtz) {
        this.a = jlr;
        this.b = jtz;
    }

    public void a(kqn kqn, UserIntent userIntent, String str) {
        bg bgVar = new bg(null, kqn.a(), null, kqn.b(), -1, str, InteractionType.TAP.toString(), userIntent.toString(), (double) this.b.a());
        this.a.a(bgVar);
    }
}
