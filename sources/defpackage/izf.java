package defpackage;

import android.app.Activity;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.mobile.android.spotlets.share.AppShareDestination;
import com.spotify.remoteconfig.AndroidLibsShareProperties;
import java.util.List;

/* renamed from: izf reason: default package */
public final class izf implements ize {
    private final jon a;
    private final AndroidLibsShareProperties b;
    private final jbr c;

    public izf(jon jon, AndroidLibsShareProperties androidLibsShareProperties, jbr jbr) {
        this.a = jon;
        this.b = androidLibsShareProperties;
        this.c = jbr;
    }

    public final jpe a(kf kfVar, fqn fqn, izn izn, List<AppShareDestination> list, jqg jqg, sso sso) {
        izo b2 = izn.b();
        jpw jpw = new jpw(this.a, (fqn) fbp.a(fqn), (Activity) fbp.a(kfVar), jqg, jqo.a((gkq) PageIdentifiers.CONTEXTMENU_SENDTO, b2.a(), izn.c(), b2.b(), b2.b() != null, b2.e()), izn, uqo.aQ, this.b, this.c, list, sso);
        return jpe.a((jpk<Void>) jpw);
    }
}
