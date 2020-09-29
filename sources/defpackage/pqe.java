package defpackage;

import android.content.Context;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import com.spotify.mobile.android.spotlets.user.TopArtistModel;
import com.spotify.mobile.android.spotlets.user.TopArtistsListModel;
import com.spotify.music.R;
import com.spotify.music.features.profile.model.LoadingState;
import com.spotify.music.features.profile.model.ProfileListItem;
import com.spotify.music.features.profile.model.ProfileListItem.Type;
import io.reactivex.Observable;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: pqe reason: default package */
public final class pqe implements pqi {
    private final String a;
    private final pqz b;
    private final Context c;

    public pqe(String str, pqz pqz, Context context) {
        this.a = str;
        this.b = pqz;
        this.c = context;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ProfileListItem a(TopArtistModel topArtistModel) {
        TopArtistModel topArtistModel2 = (TopArtistModel) fbp.a(topArtistModel);
        Context context = this.c;
        String uri = topArtistModel2.uri();
        Type a2 = pql.a(uri);
        return ProfileListItem.f().a(a2).a(uri).b(topArtistModel2.name()).c(context.getResources().getQuantityString(R.plurals.profile_list_item_followers_count, topArtistModel2.followersCount(), new Object[]{Integer.valueOf(topArtistModel2.followersCount())})).d(topArtistModel2.imageUrl()).a();
    }

    /* access modifiers changed from: private */
    public prg a(TopArtistsListModel topArtistsListModel) {
        return prg.f().a(LoadingState.LOADED).a(ImmutableList.a(fdd.a((Iterable<F>) topArtistsListModel.getTopArtists() != null ? Arrays.asList(topArtistsListModel.getTopArtists()) : Collections.emptyList(), (Function<? super F, ? extends T>) new $$Lambda$pqe$tpVduLKbU0bYcWPcFqKbTi74y5k<Object,Object>(this)))).a();
    }

    public final String a() {
        return this.c.getResources().getString(R.string.profile_list_recently_played_artists_title);
    }

    public final Observable<prg> b() {
        return this.b.d(this.a).f(new $$Lambda$pqe$JB7wfEPp0Ap4OMAd7uwax13hKTc(this)).d();
    }
}
