package defpackage;

import android.net.Uri;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.user.PlaylistListModel;
import com.spotify.mobile.android.spotlets.user.PlaylistModel;
import com.spotify.mobile.android.spotlets.user.ProfileV2VolatileModel;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.util.Collections;
import java.util.concurrent.Callable;

/* renamed from: rmy reason: default package */
public final class rmy {
    private final rnb a;
    private final rne b;
    private final sso c;

    public rmy(rnb rnb, rne rne, sso sso) {
        this.a = rnb;
        this.b = rne;
        this.c = sso;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(String str) {
        return Single.a((SingleSource<? extends T1>) this.b.a(str), (SingleSource<? extends T2>) this.a.a(str), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$rmy$PyGggV3XHiHNqRwFK6HD7FGo<Object,Object,Object>(str));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ rmx a(String str, ProfileV2VolatileModel profileV2VolatileModel, PlaylistListModel playlistListModel) {
        a a2 = new a().b("").a(Optional.e()).a(Collections.emptyList()).a(str);
        if (!fbo.a(profileV2VolatileModel.fullName)) {
            str = profileV2VolatileModel.fullName;
        }
        a a3 = a2.b(str).a(Optional.c(profileV2VolatileModel.imageUrl));
        PlaylistModel[] playlists = playlistListModel.getPlaylists();
        return a3.a(playlists == null ? Collections.emptyList() : ImmutableList.a((E[]) playlists)).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String b() {
        sso sso = this.c;
        String c2 = jva.a(sso.toString()).c();
        if (c2 != null) {
            return Uri.encode(c2);
        }
        StringBuilder sb = new StringBuilder("Uri has no username: ");
        sb.append(sso);
        throw new IllegalArgumentException(sb.toString());
    }

    public final Single<rmx> a() {
        return Single.a((Callable<? extends T>) new $$Lambda$rmy$YTIE7nzqEONDYeKoDtZjHNvDKXg<Object>(this)).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$rmy$Rs5skPHWaVLER2XbbLdXt8sPFg<Object,Object>(this));
    }
}
