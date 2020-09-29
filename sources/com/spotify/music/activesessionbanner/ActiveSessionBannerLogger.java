package com.spotify.music.activesessionbanner;

import com.spotify.music.loggers.InteractionLogger.InteractionType;

public final class ActiveSessionBannerLogger {
    public final jjf a;
    public final jrp b;

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

    public ActiveSessionBannerLogger(jjf jjf, jrp jrp) {
        this.a = jjf;
        this.b = jrp;
    }

    public void a(kne kne, UserIntent userIntent, String str) {
        bh bhVar = new bh(null, kne.a(), null, kne.b(), -1, str, InteractionType.TAP.toString(), userIntent.toString(), (double) this.b.a());
        this.a.a(bhVar);
    }
}
