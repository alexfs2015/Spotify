package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.connection.OfflineReason;
import io.reactivex.Single;

/* renamed from: nii reason: default package */
public final class nii {
    private final boolean a;
    private final ndk b;
    private final ndl c;
    private final nde d;
    private final nel e;
    private final nie f;

    public nii(boolean z, ndk ndk, ndl ndl, nde nde, nel nel, nie nie) {
        this.a = z;
        this.b = ndk;
        this.c = ndl;
        this.d = nde;
        this.e = nel;
        this.f = nie;
    }

    public final Single<gzz> a(OfflineReason offlineReason) {
        Object obj;
        nde nde = this.d;
        int i = AnonymousClass1.a[offlineReason.ordinal()];
        if (i == 1) {
            obj = nde.a(SpotifyIconV2.OFFLINE, nde.c, nde.d, "home-no-spotify-service-empty-view");
        } else if (i == 2 || i == 3) {
            obj = nde.a(SpotifyIconV2.OFFLINE, nde.a, nde.b, "home-no-network-empty-view");
        } else {
            obj = hai.EMPTY;
        }
        return vun.a(this.b.a().f(this.c).f(new $$Lambda$nii$xLjqTfFsUgOQuAtV3pFjnLWdg1I(this)).a(obj).a()).a(this.a ? this.f : $$Lambda$zVwfHrwr9OrFPEL9ngZ3BOpjo.INSTANCE);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzz a(gzz gzz) {
        return (gzz) this.e.call(gzz, Integer.valueOf(0));
    }
}
