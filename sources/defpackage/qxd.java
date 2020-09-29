package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.spotlets.user.TopArtistModel;
import com.spotify.music.R;
import com.spotify.remoteconfig.AndroidFeatureUserProperties;

/* renamed from: qxd reason: default package */
public final class qxd extends qxf<TopArtistModel, fsc> {
    public qxd(Context context, jyx jyx, AndroidFeatureUserProperties androidFeatureUserProperties) {
        this(context, false, jyx, androidFeatureUserProperties);
    }

    public qxd(Context context, boolean z, jyx jyx, AndroidFeatureUserProperties androidFeatureUserProperties) {
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
        TopArtistModel topArtistModel = (TopArtistModel) obj;
        fsc.a(topArtistModel.name());
        fsc.getView().setTag(topArtistModel);
        fsc.c(this.a.getResources().getQuantityString(R.plurals.profile_artist_followers, topArtistModel.followersCount(), new Object[]{Integer.valueOf(topArtistModel.followersCount())}));
        this.b.d(fsc.c(), topArtistModel.imageUrl());
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
