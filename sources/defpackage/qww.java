package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.spotify.mobile.android.spotlets.user.PlaylistModel;
import com.spotify.music.R;
import com.spotify.remoteconfig.AndroidFeatureUserProperties;

/* renamed from: qww reason: default package */
public final class qww extends qxf<PlaylistModel, fsc> {
    public qww(Context context, jyx jyx, AndroidFeatureUserProperties androidFeatureUserProperties) {
        this(context, false, jyx, androidFeatureUserProperties);
    }

    public qww(Context context, boolean z, jyx jyx, AndroidFeatureUserProperties androidFeatureUserProperties) {
        super(context, fsc.class, z, jyx, androidFeatureUserProperties);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ frt a(Context context, ViewGroup viewGroup) {
        fqv.b();
        return fsk.b(context, viewGroup, false);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(frt frt, Object obj) {
        fsc fsc = (fsc) frt;
        PlaylistModel playlistModel = (PlaylistModel) obj;
        fsc.a(playlistModel.getName());
        fsc.c(this.a.getResources().getQuantityString(R.plurals.profile_playlist_followers, playlistModel.getFollowersCount(), new Object[]{Integer.valueOf(playlistModel.getFollowersCount())}));
        ImageView c = fsc.c();
        this.b.e(c, playlistModel.getImageUrl());
        c.setScaleType(ScaleType.CENTER_CROP);
        fsc.getView().setTag(playlistModel);
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
}
