package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.spotify.mobile.android.spotlets.user.PlaylistModel;
import com.spotify.music.R;
import com.spotify.remoteconfig.AndroidFeatureUserProperties;

/* renamed from: qon reason: default package */
public final class qon extends qow<PlaylistModel, fri> {
    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(fqz fqz, Object obj) {
        fri fri = (fri) fqz;
        PlaylistModel playlistModel = (PlaylistModel) obj;
        fri.a(playlistModel.getName());
        fri.c(this.a.getResources().getQuantityString(R.plurals.profile_playlist_followers, playlistModel.getFollowersCount(), new Object[]{Integer.valueOf(playlistModel.getFollowersCount())}));
        ImageView c = fri.c();
        jwv jwv = this.b;
        jwv.a(c, playlistModel.getImageUrl(), fzg.j(jwv.a), (utt) null);
        c.setScaleType(ScaleType.CENTER_CROP);
        fri.getView().setTag(playlistModel);
    }

    public final /* bridge */ /* synthetic */ void a(boolean z) {
        super.a(z);
    }

    public final /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public final /* bridge */ /* synthetic */ long getItemId(int i) {
        return super.getItemId(i);
    }

    public final /* bridge */ /* synthetic */ int getItemViewType(int i) {
        return super.getItemViewType(i);
    }

    public final /* bridge */ /* synthetic */ View getView(int i, View view, ViewGroup viewGroup) {
        return super.getView(i, view, viewGroup);
    }

    public final /* bridge */ /* synthetic */ int getViewTypeCount() {
        return super.getViewTypeCount();
    }

    public qon(Context context, jwv jwv, AndroidFeatureUserProperties androidFeatureUserProperties) {
        this(context, false, jwv, androidFeatureUserProperties);
    }

    public qon(Context context, boolean z, jwv jwv, AndroidFeatureUserProperties androidFeatureUserProperties) {
        super(context, fri.class, z, jwv, androidFeatureUserProperties);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ fqz a(Context context, ViewGroup viewGroup) {
        fqb.b();
        return frq.b(context, viewGroup, false);
    }
}
