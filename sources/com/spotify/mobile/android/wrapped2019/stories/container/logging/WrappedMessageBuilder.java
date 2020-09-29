package com.spotify.mobile.android.wrapped2019.stories.container.logging;

public final class WrappedMessageBuilder {
    public int a = -1;
    public Interaction b;
    public UserIntent c;
    private final jtz d;
    private String e;
    private String f;

    public enum Interaction {
        HIT("hit"),
        AUTO_PROGRESS("auto-navigate");
        
        /* access modifiers changed from: private */
        public final String mLogName;

        private Interaction(String str) {
            this.mLogName = str;
        }
    }

    public enum UserIntent {
        NAVIGATE_FORWARD("navigate-forward"),
        NAVIGATE_BACKWARD("navigate-backward"),
        MUTE("mute"),
        UNMUTE("unmute");
        
        /* access modifiers changed from: private */
        public final String mLogName;

        private UserIntent(String str) {
            this.mLogName = str;
        }
    }

    public WrappedMessageBuilder(jtz jtz) {
        this.d = jtz;
    }

    private static String c(kfp kfp) {
        Object[] objArr = {kfq.a(kfp)};
        String str = "esseie20oy:ipst-:t:rd1oagns-srt9%f";
        return String.format("spotify:genre:2019:data-stories-%s", objArr);
    }

    public final WrappedMessageBuilder a(kfp kfp) {
        this.e = c(kfp);
        return this;
    }

    public final hdp a() {
        fbp.a(this.e);
        fbp.a(this.a >= 0);
        fbp.a(this.f);
        fbp.a(this.b);
        fbp.a(this.c);
        bh bhVar = new bh(null, "wrapped-2019-data-stories", this.e, null, (long) this.a, this.f, this.b.mLogName, this.c.mLogName, (double) this.d.a(), null);
        return bhVar;
    }

    public final WrappedMessageBuilder b(kfp kfp) {
        this.f = c(kfp);
        return this;
    }
}
