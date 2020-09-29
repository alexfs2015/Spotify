package com.spotify.music.cappedondemand.dialog;

import com.spotify.music.libs.viewuri.ViewUris;

public final class CappedOndemandDialogLogger {
    private final gkq a;
    private final jlr b;
    private final jtz c;

    enum UserIntent {
        UPGRADE("upgrade"),
        DISMISS("dismiss"),
        PREVIEW("preview"),
        SHUFFLE_PLAY("shuffle_play");
        
        private final String mIntent;

        private UserIntent(String str) {
            this.mIntent = str;
        }

        public final String toString() {
            return this.mIntent;
        }
    }

    public CappedOndemandDialogLogger(gkq gkq, jlr jlr, jtz jtz) {
        this.a = gkq;
        this.b = jlr;
        this.c = jtz;
    }

    /* access modifiers changed from: 0000 */
    public void a(UserIntent userIntent, String str) {
        jlr jlr = this.b;
        String a2 = this.a.a();
        StringBuilder sb = new StringBuilder();
        sb.append(ViewUris.R);
        sb.append("-");
        sb.append(str);
        bg bgVar = new bg(null, a2, sb.toString(), null, -1, null, "hit", userIntent.toString(), (double) this.c.a());
        jlr.a(bgVar);
    }

    public final void a(String str) {
        a(UserIntent.DISMISS, str);
    }
}
