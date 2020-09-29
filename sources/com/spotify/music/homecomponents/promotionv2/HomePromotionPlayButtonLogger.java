package com.spotify.music.homecomponents.promotionv2;

public final class HomePromotionPlayButtonLogger {
    private final jlr a;
    private final uqm b;
    private final sso c;
    private final jtz d;

    enum InteractionType {
        HIT("hit");
        
        final String mType;

        private InteractionType(String str) {
            this.mType = str;
        }
    }

    public enum UserIntent {
        PLAY("play"),
        PAUSE("pause"),
        RESUME("resume");
        
        final String mIntent;

        private UserIntent(String str) {
            this.mIntent = str;
        }
    }

    public HomePromotionPlayButtonLogger(jlr jlr, uqm uqm, sso sso, jtz jtz) {
        this.a = jlr;
        this.b = uqm;
        this.c = sso;
        this.d = jtz;
    }

    public void a(String str, UserIntent userIntent) {
        jlr jlr = this.a;
        bg bgVar = new bg(null, this.b.a(), this.c.toString(), "promotion-card-v2-play-button", 0, str, InteractionType.HIT.mType, userIntent.mIntent, (double) this.d.a());
        jlr.a(bgVar);
    }
}
