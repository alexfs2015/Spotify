package com.spotify.music.loggers;

import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.LogMessage;

public final class ImpressionLogger {
    private final String a;
    private final sso b;
    private final jlr c;

    public enum ImpressionType {
        ERROR(LogMessage.SEVERITY_ERROR),
        ITEM("item"),
        BUTTON("button"),
        CARD_STACK("card-stack"),
        DIALOG("dialog"),
        TOASTIE("toastie"),
        PROGRESS_BAR("progress-bar"),
        PAGE("page"),
        BANNER("banner");
        
        private final String mStrValue;

        private ImpressionType(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public enum RenderType {
        PAGE("page"),
        STACK("stack"),
        GRID("grid"),
        CAROUSEL("carousel"),
        LIST("list"),
        DIALOG("dialog"),
        TOASTIE("toastie"),
        BANNER("banner");
        
        private final String mStrValue;

        private RenderType(String str) {
            this.mStrValue = str;
        }

        public final String toString() {
            return this.mStrValue;
        }
    }

    public ImpressionLogger(jlr jlr, sso sso, gkq gkq) {
        this.c = jlr;
        this.b = sso;
        this.a = gkq.a();
    }

    public ImpressionLogger(jlr jlr, sso sso, String str) {
        this.c = jlr;
        this.b = sso;
        this.a = str;
    }

    public final void a(String str, String str2, int i, ImpressionType impressionType, RenderType renderType) {
        a("", str, str2, i, impressionType, renderType);
    }

    public final void a(String str, String str2, String str3, int i, ImpressionType impressionType, RenderType renderType) {
        jlr jlr = this.c;
        be beVar = new be(str, this.a, this.b.toString(), str3, (long) i, str2, impressionType.toString(), renderType.toString(), (double) jtp.a.a());
        jlr.a(beVar);
    }
}
