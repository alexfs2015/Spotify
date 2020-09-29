package defpackage;

import android.content.Context;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.user.PlaylistListModel;
import com.spotify.mobile.android.spotlets.user.PlaylistModel;
import com.spotify.music.R;
import com.spotify.music.features.profile.model.LoadingState;
import com.spotify.music.features.profile.model.ProfileListItem;
import com.spotify.music.features.profile.model.ProfileListItem.Type;
import io.reactivex.Observable;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: pqg reason: default package */
public final class pqg implements pqi {
    private final String a;
    private final pqz b;
    private final Context c;

    public pqg(String str, pqz pqz, Context context) {
        this.a = str;
        this.b = pqz;
        this.c = context;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ProfileListItem a(PlaylistModel playlistModel) {
        PlaylistModel playlistModel2 = (PlaylistModel) fbp.a(playlistModel);
        Context context = this.c;
        String uri = playlistModel2.getUri();
        Type a2 = pql.a(uri);
        return ProfileListItem.f().a(a2).a(uri).b(playlistModel2.getName()).c(context.getResources().getQuantityString(R.plurals.profile_list_item_followers_count, playlistModel2.getFollowersCount(), new Object[]{Integer.valueOf(playlistModel2.getFollowersCount())})).d(playlistModel2.getImageUrl()).a();
    }

    /* access modifiers changed from: private */
    public prg a(PlaylistListModel playlistListModel) {
        return prg.f().a(LoadingState.LOADED).a(ImmutableList.a(fdd.a((Iterable<F>) playlistListModel.getPlaylists() != null ? Arrays.asList(playlistListModel.getPlaylists()) : Collections.emptyList(), (Function<? super F, ? extends T>) new $$Lambda$pqg$hsInoUk9MNtxOSuPWA0qZsLn1qY<Object,Object>(this)))).a();
    }

    public final String a() {
        return this.c.getResources().getString(R.string.profile_list_public_playlists_title);
    }

    public final Observable<prg> b() {
        return this.b.e(this.a).f(new $$Lambda$pqg$e5tuN8VmB525v6PRJ76fNb0p6nc(this)).d();
    }
}
