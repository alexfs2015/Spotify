package com.spotify.music.homecomponents.promotionv2;

public final class HomePromotionPlayButtonLogger {
    private final jjf a;
    private final udr b;
    private final sih c;
    private final jrp d;

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

    public HomePromotionPlayButtonLogger(jjf jjf, udr udr, sih sih, jrp jrp) {
        this.a = jjf;
        this.b = udr;
        this.c = sih;
        this.d = jrp;
    }

    public void a(String str, UserIntent userIntent) {
        jjf jjf = this.a;
        bh bhVar = new bh(null, this.b.a(), this.c.toString(), "promotion-card-v2-play-button", 0, str, InteractionType.HIT.mType, userIntent.mIntent, (double) this.d.a());
        jjf.a(bhVar);
    }
}
