package com.spotify.music.spotlets.offline.util;

public final class OffliningLogger {
    private final sih a;

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

    public OffliningLogger(sih sih) {
        this.a = sih;
    }

    public final void a(String str, SourceElement sourceElement, boolean z) {
        a(this.a, str, sourceElement, z);
    }

    public static void a(sih sih, String str, SourceElement sourceElement, boolean z) {
        ((jjg) ggw.a(jjg.class)).a(new x(sih.toString(), str, sourceElement.mName, z));
    }
}
