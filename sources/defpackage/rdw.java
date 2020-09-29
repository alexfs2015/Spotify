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
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: rdw reason: default package */
public final class rdw {
    private final rdz a;
    private final rec b;
    private final sih c;

    public rdw(rdz rdz, rec rec, sih sih) {
        this.a = rdz;
        this.b = rec;
        this.c = sih;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ String b() {
        sih sih = this.c;
        String c2 = jst.a(sih.toString()).c();
        if (c2 != null) {
            return Uri.encode(c2);
        }
        StringBuilder sb = new StringBuilder("Uri has no username: ");
        sb.append(sih);
        throw new IllegalArgumentException(sb.toString());
    }

    public final Single<rdv> a() {
        return Single.a((Callable<? extends T>) new $$Lambda$rdw$mRFrRQsfrDaH8jR2zQh1C8JjfC4<Object>(this)).a((Function<? super T, ? extends SingleSource<? extends R>>) new $$Lambda$rdw$eLIUkPVLfPzt5azSeI4_lVwueM<Object,Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ SingleSource a(String str) {
        return Single.a((SingleSource<? extends T1>) this.b.a(str), (SingleSource<? extends T2>) this.a.a(str), (BiFunction<? super T1, ? super T2, ? extends R>) new $$Lambda$rdw$qHQMU8kZSJJLTRBfjXCHkuZUnY<Object,Object,Object>(str));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ rdv a(String str, ProfileV2VolatileModel profileV2VolatileModel, PlaylistListModel playlistListModel) {
        List list;
        a a2 = new a().b("").a(Optional.e()).a(Collections.emptyList()).a(str);
        if (!fax.a(profileV2VolatileModel.fullName)) {
            str = profileV2VolatileModel.fullName;
        }
        a a3 = a2.b(str).a(Optional.c(profileV2VolatileModel.imageUrl));
        PlaylistModel[] playlists = playlistListModel.getPlaylists();
        if (playlists == null) {
            list = Collections.emptyList();
        } else {
            list = ImmutableList.a((E[]) playlists);
        }
        return a3.a(list).a();
    }
}
