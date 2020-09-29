package defpackage;

import android.app.Activity;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.spotlets.share.AppShareDestination;
import com.spotify.remoteconfig.AndroidLibsShareProperties;
import java.util.List;

/* renamed from: iwu reason: default package */
public final class iwu implements iwt {
    private final jmb a;
    private final AndroidLibsShareProperties b;
    private final izg c;

    public iwu(jmb jmb, AndroidLibsShareProperties androidLibsShareProperties, izg izg) {
        this.a = jmb;
        this.b = androidLibsShareProperties;
        this.c = izg;
    }

    public final jms a(ka kaVar, fpt fpt, ixc ixc, List<AppShareDestination> list, jnu jnu, sih sih) {
        ixd b2 = ixc.b();
        jnk jnk = new jnk(this.a, (fpt) fay.a(fpt), (Activity) fay.a(kaVar), jnu, joc.a((gjf) PageIdentifiers.CONTEXTMENU_SENDTO, b2.a(), ixc.c(), b2.b(), b2.b() != null, b2.e()), ixc, udt.aQ, this.b, this.c, list, sih);
        return jms.a((jmy<Void>) jnk);
    }
}
