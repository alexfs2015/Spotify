package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: kqj reason: default package */
final class kqj implements kqb {
    private final sff a;
    private hk<Boolean> b = $$Lambda$kqj$wxwdD9f2bID_SL1hURNalYfnk.INSTANCE;

    kqj(sff sff) {
        this.a = sff;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Boolean bool) {
    }

    public final void a() {
    }

    public final void a(Intent intent, fqn fqn) {
        if (fqn != null && fqn.a() && RolloutFlag.ENABLED == fqn.a(kqg.a)) {
            if ("com.google.android.apps.maps.NAVIGATING".equals(intent.getStringExtra("com.spotify.music.external.banner.MAPS"))) {
                this.b.accept(Boolean.TRUE);
                this.a.a("google_maps");
            }
        }
    }

    public final void a(hk<Boolean> hkVar) {
        this.b = hkVar;
    }
}
