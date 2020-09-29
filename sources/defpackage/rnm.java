package defpackage;

import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueComponent;
import com.spotify.mobile.android.hubframework.defaults.components.glue2.HubsGlue2Row;
import com.spotify.mobile.android.hubframework.model.immutable.HubsImmutableComponentBundle;
import com.spotify.mobile.android.spotlets.user.PlaylistModel;
import com.spotify.music.R;
import java.util.List;

/* renamed from: rnm reason: default package */
final class rnm {
    final rno a;
    private final String b;

    rnm(rno rno, String str) {
        this.a = rno;
        this.b = str;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ hcm a(String str, PlaylistModel playlistModel) {
        String str2;
        a a2 = hcx.builder().a((hck) HubsGlue2Row.IMAGE_ROW).a("click", gya.a(playlistModel.getUri()));
        a a3 = hcy.builder().a(playlistModel.getName());
        int followersCount = playlistModel.getFollowersCount();
        if (followersCount > 0) {
            str2 = this.a.a.getQuantityString(R.plurals.other_user_profile_playlist_likes, followersCount, new Object[]{Integer.valueOf(followersCount)});
        } else if (this.b.equals(str)) {
            str2 = this.a.a.getQuantityString(R.plurals.other_user_profile_playlist_likes, 0, new Object[]{Integer.valueOf(0)});
        } else {
            str2 = this.a.a.getString(R.string.other_user_profile_playlist_zero_likes);
        }
        return a2.a(a3.b(str2).a()).a(hcw.builder().a(hcz.builder().a(playlistModel.getImageUrl()).b("playlist").a()).a()).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(PlaylistModel playlistModel) {
        return playlistModel != null;
    }

    /* access modifiers changed from: 0000 */
    public final hcs a(rmx rmx) {
        String str;
        a b2 = hdb.builder().b(rmx.b());
        a a2 = hcx.builder().a((hck) HubsGlueComponent.HEADER).a(hcw.builder().a(hcz.builder().a((String) rmx.c().d()).b("user").a(HubsImmutableComponentBundle.builder().a("style", "circular").a()).a()).a());
        a a3 = hcy.builder().a(rmx.b());
        if (rmx.d().isEmpty()) {
            rno rno = this.a;
            String b3 = rmx.b();
            str = rno.a.getString(R.string.other_user_profile_no_playlists, new Object[]{b3});
        } else {
            str = this.a.a.getString(R.string.other_user_profile_public_playlists);
        }
        a a4 = b2.a(a2.a(a3.c(str).a()).a());
        if (rmx.d().isEmpty()) {
            return a4.b(hcx.builder().a((hck) HubsGlueComponent.EMPTY_VIEW).a()).a();
        }
        return a4.b((List<? extends hcm>) ImmutableList.a(fcp.a((Iterable<E>) rmx.d()).a((fbq<? super E>) $$Lambda$rnm$se9sR7IvMj1LA1FdBmjsu2dJJU4.INSTANCE).a((Function<? super E, T>) new $$Lambda$rnm$poZsGV7l81eNrpqQqfIGRkFpE<Object,T>(this, rmx.a())).a())).a();
    }
}
