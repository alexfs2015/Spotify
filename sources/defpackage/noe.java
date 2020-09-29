package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.music.connection.OfflineReason;
import io.reactivex.Single;

/* renamed from: noe reason: default package */
public final class noe {
    private final boolean a;
    private final niz b;
    private final nja c;
    private final nit d;
    private final nka e;
    private final noa f;

    public noe(boolean z, niz niz, nja nja, nit nit, nka nka, noa noa) {
        this.a = z;
        this.b = niz;
        this.c = nja;
        this.d = nit;
        this.e = nka;
        this.f = noa;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcs a(hcs hcs) {
        return (hcs) this.e.call(hcs, Integer.valueOf(0));
    }

    public final Single<hcs> a(OfflineReason offlineReason) {
        nit nit = this.d;
        int i = AnonymousClass1.a[offlineReason.ordinal()];
        Object obj = i != 1 ? (i == 2 || i == 3) ? nit.a(SpotifyIconV2.OFFLINE, nit.a, nit.b, "home-no-network-empty-view") : hdb.EMPTY : nit.a(SpotifyIconV2.OFFLINE, nit.c, nit.d, "home-no-spotify-service-empty-view");
        return wit.a(this.b.a().e((xiy<? super T, ? extends R>) this.c).e((xiy<? super T, ? extends R>) new $$Lambda$noe$2tdvp2IF91ou_4RdMdG2QUDsuRY<Object,Object>(this)).a(obj).a()).a(this.a ? this.f : $$Lambda$AeFru5LIaLic9LIWJPOnKbbiQpc.INSTANCE);
    }
}
