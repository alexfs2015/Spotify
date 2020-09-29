package defpackage;

import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider;
import com.spotify.music.features.playlistentity.configuration.LicenseLayoutProvider.LicenseLayout;

@Deprecated
/* renamed from: oom reason: default package */
public final class oom implements LicenseLayoutProvider {
    private final String a;
    private final vlp b;
    private final ozl c;
    private final rqb d;

    public oom(String str, vlp vlp, ozl ozl, rqb rqb) {
        this.a = str;
        this.b = vlp;
        this.c = ozl;
        this.d = rqb;
    }

    public final LicenseLayout a() {
        return jus.b(this.c.getFlags()) ? LicenseLayout.ON_DEMAND_WHEN_PREMIUM : jus.c(this.c.getFlags()) ? this.d.a(this.c.getFlags()) ? LicenseLayout.ON_DEMAND_WHEN_FREE_NO_RESTRICTIONS : LicenseLayout.ON_DEMAND_WHEN_FREE_TFT : ((Boolean) this.b.b(this.a).a(Boolean.FALSE)).booleanValue() ? LicenseLayout.ON_DEMAND_WHEN_FREE_JUMPIN : LicenseLayout.SHUFFLE_WHEN_FREE;
    }
}
