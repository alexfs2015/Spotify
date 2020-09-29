package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: jkp reason: default package */
public final class jkp implements spa {
    private final pgr a;

    public jkp(pgr pgr) {
        this.a = pgr;
    }

    public final jol a(fpt fpt) {
        if (this.a.a(fpt)) {
            return phe.a(fpt);
        }
        if (this.a.f(fpt)) {
            return pfb.a(fpt);
        }
        return jkl.a(fpt);
    }

    public final jol create(Intent intent, jst jst, String str, fpt fpt, SessionState sessionState) {
        return a(fpt);
    }
}
