package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: njq reason: default package */
public final class njq implements a {
    public final nlx a;
    final oij b;
    final oht c;
    final LicenseLayoutProvider d;
    private final String e;

    public njq(nlx nlx, oij oij, oht oht, LicenseLayoutProvider licenseLayoutProvider, String str) {
        this.a = nlx;
        this.b = oij;
        this.c = oht;
        this.d = licenseLayoutProvider;
        this.e = str;
    }

    public final sih ae_() {
        return ViewUris.aB.a(this.e);
    }
}
