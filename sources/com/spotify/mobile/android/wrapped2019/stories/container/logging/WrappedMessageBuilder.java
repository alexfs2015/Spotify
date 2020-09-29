package com.spotify.mobile.android.wrapped2019.stories.container.logging;

public final class WrappedMessageBuilder {
    public int a = -1;
    public Interaction b;
    public UserIntent c;
    private final jrp d;
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

    public WrappedMessageBuilder(jrp jrp) {
        this.d = jrp;
    }

    public final WrappedMessageBuilder a(kdo kdo) {
        this.e = c(kdo);
        return this;
    }

    public final WrappedMessageBuilder b(kdo kdo) {
        this.f = c(kdo);
        return this;
    }

    private static String c(kdo kdo) {
        return String.format("spotify:genre:2019:data-stories-%s", new Object[]{kdp.a(kdo)});
    }

    public final haw a() {
        fay.a(this.e);
        fay.a(this.a >= 0);
        fay.a(this.f);
        fay.a(this.b);
        fay.a(this.c);
        bi biVar = new bi(null, "wrapped-2019-data-stories", this.e, null, (long) this.a, this.f, this.b.mLogName, this.c.mLogName, (double) this.d.a(), null);
        return biVar;
    }
}
