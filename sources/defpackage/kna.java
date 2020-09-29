package defpackage;

import android.content.Intent;
import com.spotify.mobile.android.flags.RolloutFlag;

/* renamed from: kna reason: default package */
final class kna implements kms {
    private final rvv a;
    private hk<Boolean> b = $$Lambda$kna$f6yZcPgNH9UP2T8vV2K9KYXBO7Y.INSTANCE;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(Boolean bool) {
    }

    public final void a() {
    }

    kna(rvv rvv) {
        this.a = rvv;
    }

    public final void a(hk<Boolean> hkVar) {
        this.b = hkVar;
    }

    public final void a(Intent intent, fpt fpt) {
        if (fpt != null && fpt.a() && RolloutFlag.ENABLED == fpt.a(kmx.a)) {
            if ("com.google.android.apps.maps.NAVIGATING".equals(intent.getStringExtra("com.spotify.music.external.banner.MAPS"))) {
                this.b.accept(Boolean.TRUE);
                this.a.a("google_maps");
            }
        }
    }
}
