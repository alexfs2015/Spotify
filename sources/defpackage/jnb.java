package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.service.session.SessionState;

/* renamed from: jnb reason: default package */
public final class jnb implements szh {
    private final pns a;

    public jnb(pns pns) {
        this.a = pns;
    }

    public final jqx a(fqn fqn) {
        return this.a.b(fqn) ? pmn.a(fqn) : jmx.a(fqn);
    }

    public final jqx create(Intent intent, jva jva, String str, fqn fqn, SessionState sessionState) {
        return a(fqn);
    }
}
