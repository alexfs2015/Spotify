package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2Row;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.spotlets.user.PlaylistModel;
import com.spotify.music.R;
import java.util.List;

/* renamed from: rek reason: default package */
final class rek {
    final rem a;
    private final String b;

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(PlaylistModel playlistModel) {
        return playlistModel != null;
    }

    rek(rem rem, String str) {
        this.a = rem;
        this.b = str;
    }

    /* access modifiers changed from: 0000 */
    public final gzz a(rdv rdv) {
        String str;
        a b2 = hai.builder().b(rdv.b());
        a a2 = hae.builder().a((gzr) HubsGlueComponent.HEADER).a(had.builder().a(hag.builder().a((String) rdv.c().d()).b("user").a(HubsImmutableComponentBundle.builder().a("style", "circular").a()).a()).a());
        a a3 = haf.builder().a(rdv.b());
        if (rdv.d().isEmpty()) {
            rem rem = this.a;
            String b3 = rdv.b();
            str = rem.a.getString(R.string.other_user_profile_no_playlists, new Object[]{b3});
        } else {
            str = this.a.a.getString(R.string.other_user_profile_public_playlists);
        }
        a a4 = b2.a(a2.a(a3.c(str).a()).a());
        if (rdv.d().isEmpty()) {
            return a4.b(hae.builder().a((gzr) HubsGlueComponent.EMPTY_VIEW).a()).a();
        }
        return a4.b((List<? extends gzt>) ImmutableList.a(fbx.a((Iterable<E>) rdv.d()).a((faz<? super E>) $$Lambda$rek$7exZBjR24_PcGr1r19x4zRgbnzs.INSTANCE).a((Function<? super E, T>) new $$Lambda$rek$eXOnkj3_74IVBkHNeM_Q7n6ku64<Object,T>(this, rdv.a())).a())).a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ gzt a(String str, PlaylistModel playlistModel) {
        String str2;
        a a2 = hae.builder().a((gzr) HubsGlue2Row.IMAGE_ROW).a("click", gvz.a(playlistModel.getUri()));
        a a3 = haf.builder().a(playlistModel.getName());
        int followersCount = playlistModel.getFollowersCount();
        if (followersCount > 0) {
            str2 = this.a.a.getQuantityString(R.plurals.other_user_profile_playlist_likes, followersCount, new Object[]{Integer.valueOf(followersCount)});
        } else if (this.b.equals(str)) {
            str2 = this.a.a.getQuantityString(R.plurals.other_user_profile_playlist_likes, 0, new Object[]{Integer.valueOf(0)});
        } else {
            str2 = this.a.a.getString(R.string.other_user_profile_playlist_zero_likes);
        }
        return a2.a(a3.b(str2).a()).a(had.builder().a(hag.builder().a(playlistModel.getImageUrl()).b("playlist").a()).a()).a();
    }
}
