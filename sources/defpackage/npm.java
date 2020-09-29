package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: npm reason: default package */
public final class npm implements a {
    public final nrm a;
    final opn b;
    final oox c;
    final LicenseLayoutProvider d;
    private final String e;

    public npm(nrm nrm, opn opn, oox oox, LicenseLayoutProvider licenseLayoutProvider, String str) {
        this.a = nrm;
        this.b = opn;
        this.c = oox;
        this.d = licenseLayoutProvider;
        this.e = str;
    }

    public final sso ae_() {
        return ViewUris.aA.a(this.e);
    }
}
