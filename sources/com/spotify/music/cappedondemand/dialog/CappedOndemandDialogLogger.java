package com.spotify.music.cappedondemand.dialog;

import com.spotify.music.libs.viewuri.ViewUris;

public final class CappedOndemandDialogLogger {
    private final gjf a;
    private final jjf b;
    private final jrp c;

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

    public CappedOndemandDialogLogger(gjf gjf, jjf jjf, jrp jrp) {
        this.a = gjf;
        this.b = jjf;
        this.c = jrp;
    }

    public final void a(String str) {
        a(UserIntent.DISMISS, str);
    }

    /* access modifiers changed from: 0000 */
    public void a(UserIntent userIntent, String str) {
        jjf jjf = this.b;
        String a2 = this.a.a();
        StringBuilder sb = new StringBuilder();
        sb.append(ViewUris.S);
        sb.append("-");
        sb.append(str);
        bh bhVar = new bh(null, a2, sb.toString(), null, -1, null, "hit", userIntent.toString(), (double) this.c.a());
        jjf.a(bhVar);
    }
}
