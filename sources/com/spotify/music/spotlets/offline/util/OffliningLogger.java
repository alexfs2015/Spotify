package com.spotify.music.spotlets.offline.util;

public final class OffliningLogger {
    private final sso a;

    public enum SourceElement {
        HEADER_TOGGLE("header-toggle"),
        HEADER_ACTION("header-button"),
        ITEM_ROW("item-row"),
        CONTEXT_MENU("context-menu"),
        OPTIONS_MENU("options-menu");
        
        final String mName;

        private SourceElement(String str) {
            this.mName = str;
        }
    }

    public OffliningLogger(sso sso) {
        this.a = sso;
    }

    public static void a(sso sso, String str, SourceElement sourceElement, boolean z) {
        ((jls) gih.a(jls.class)).a(new x(sso.toString(), str, sourceElement.mName, z));
    }

    public final void a(String str, SourceElement sourceElement, boolean z) {
        a(this.a, str, sourceElement, z);
    }
}
