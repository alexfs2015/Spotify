package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.music.features.user.ProfilesListFragment;
import com.spotify.music.features.user.ProfilesListFragment.Type;

/* renamed from: prt reason: default package */
public final class prt implements taa {

    /* renamed from: prt$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[LinkType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                com.spotify.mobile.android.util.LinkType[] r0 = com.spotify.mobile.android.util.LinkType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.PROFILE_FOLLOWERS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.PROFILE_FOLLOWING     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.PROFILE_PLAYLIST_OVERVIEW     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0035 }
                com.spotify.mobile.android.util.LinkType r1 = com.spotify.mobile.android.util.LinkType.PROFILE_ARTISTS     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.prt.AnonymousClass1.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ tad a(Intent intent, fqn fqn, SessionState sessionState) {
        jva a = jva.a(intent.getDataString());
        if (psk.a(fqn)) {
            return tad.a((jqx) prh.b(a.h()));
        }
        int i = AnonymousClass1.a[a.b.ordinal()];
        if (i == 1) {
            return tad.a((jqx) ProfilesListFragment.a(a.h(), Type.FOLLOWERS));
        }
        if (i == 2) {
            return tad.a((jqx) ProfilesListFragment.a(a.h(), Type.FOLLOWING));
        }
        if (i == 3) {
            return tad.a((jqx) qxc.b(a.h()));
        }
        if (i != 4) {
            return new a();
        }
        if (!qxe.b(intent)) {
            return tad.a((jqx) qxe.b(a.h()));
        }
        qxe qxe = new qxe();
        Bundle bundle = qxe.ae().i;
        if (bundle == null) {
            bundle = new Bundle();
            qxe.ae().g(bundle);
        }
        bundle.putAll((Bundle) fbp.a(intent.getExtras()));
        return tad.a((jqx) qxe);
    }

    public final void a(szz szz) {
        $$Lambda$prt$_60L0fyRBRDn9PVAEqBqfGJ1nos r0 = $$Lambda$prt$_60L0fyRBRDn9PVAEqBqfGJ1nos.INSTANCE;
        szz.a(LinkType.PROFILE_ARTISTS, "Artist list in the profile feature", (tae) r0);
        szz.a(LinkType.PROFILE_FOLLOWERS, "Followers list in the profile feature", (tae) r0);
        szz.a(LinkType.PROFILE_FOLLOWING, "Following list in the profile feature", (tae) r0);
        szz.a(LinkType.PROFILE_PLAYLIST_OVERVIEW, "Public playlist list in the profile feature", (tae) r0);
    }
}
