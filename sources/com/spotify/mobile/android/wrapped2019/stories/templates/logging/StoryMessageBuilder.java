package com.spotify.mobile.android.wrapped2019.stories.templates.logging;

public final class StoryMessageBuilder {
    private final jtz a;
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

    public StoryMessageBuilder(jtz jtz) {
        this.a = jtz;
    }

    public final StoryMessageBuilder a(Page page) {
        this.c = page.mLogName;
        return this;
    }

    public final StoryMessageBuilder a(Type type) {
        this.d = type.mLogName;
        return this;
    }

    public final StoryMessageBuilder a(String str) {
        Object[] objArr = {str};
        String str2 = "eas-ersa-issgfyoeit90sdno:2%ttr:p1";
        this.b = String.format("spotify:genre:2019:data-stories-%s", objArr);
        return this;
    }

    public final hdp a() {
        fbp.a(this.b);
        fbp.a(this.c);
        fbp.a(this.d);
        String str = "o:ymnpdfifis";
        al alVar = new al(this.d, this.a.a(), this.c, this.b, "spotify:find");
        return alVar;
    }
}
