package com.spotify.mobile.android.wrapped2019.stories.templates.logging;

public final class StoryMessageBuilder {
    private final jrp a;
    private String b;
    private String c;
    private String d;

    public enum Page {
        STORY("wrapped-2019/data-stories"),
        LOADER("wrapped-2019/data-stories/loader"),
        LOAD_FAIL("wrapped-2019/data-stories/load-fail");
        
        /* access modifiers changed from: private */
        public final String mLogName;

        private Page(String str) {
            this.mLogName = str;
        }
    }

    public enum Type {
        ENTER("enter"),
        EXIT("exit");
        
        /* access modifiers changed from: private */
        public final String mLogName;

        private Type(String str) {
            this.mLogName = str;
        }
    }

    public StoryMessageBuilder(jrp jrp) {
        this.a = jrp;
    }

    public final StoryMessageBuilder a(String str) {
        this.b = String.format("spotify:genre:2019:data-stories-%s", new Object[]{str});
        return this;
    }

    public final StoryMessageBuilder a(Page page) {
        this.c = page.mLogName;
        return this;
    }

    public final StoryMessageBuilder a(Type type) {
        this.d = type.mLogName;
        return this;
    }

    public final haw a() {
        fay.a(this.b);
        fay.a(this.c);
        fay.a(this.d);
        am amVar = new am(this.d, this.a.a(), this.c, this.b, "spotify:find");
        return amVar;
    }
}
