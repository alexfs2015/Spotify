package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;

@Deprecated
/* renamed from: ohi reason: default package */
public final class ohi implements LicenseLayoutProvider {
    private final String a;
    private final uzm b;
    private final osf c;
    private final rgz d;

    public ohi(String str, uzm uzm, osf osf, rgz rgz) {
        this.a = str;
        this.b = uzm;
        this.c = osf;
        this.d = rgz;
    }

    public final LicenseLayout a() {
        if (jsl.b(this.c.getFlags())) {
            return LicenseLayout.ON_DEMAND_WHEN_PREMIUM;
        }
        if (jsl.c(this.c.getFlags())) {
            if (this.d.a(this.c.getFlags())) {
                return LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS;
            }
            return LicenseLayout.ON_DEMAND_WHEN_FREE_TFT;
        } else if (((Boolean) this.b.b(this.a).a(Boolean.FALSE)).booleanValue()) {
            return LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN;
        } else {
            return LicenseLayout.SHUFFLE_WHEN_FREE;
        }
    }
}
