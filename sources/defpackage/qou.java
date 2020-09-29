package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobile.android.spotlets.user.TopArtistModel;
import com.spotify.music.R;
import com.spotify.remoteconfig.AndroidFeatureUserProperties;

/* renamed from: qou reason: default package */
public final class qou extends qow<TopArtistModel, fri> {
    /* access modifiers changed from: protected */
    public final /* synthetic */ void a(fqz fqz, Object obj) {
        fri fri = (fri) fqz;
        TopArtistModel topArtistModel = (TopArtistModel) obj;
        fri.a(topArtistModel.name());
        fri.getView().setTag(topArtistModel);
        fri.c(this.a.getResources().getQuantityString(R.plurals.profile_artist_followers, topArtistModel.followersCount(), new Object[]{Integer.valueOf(topArtistModel.followersCount())}));
        this.b.d(fri.c(), topArtistModel.imageUrl());
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

    public qou(Context context, jwv jwv, AndroidFeatureUserProperties androidFeatureUserProperties) {
        this(context, false, jwv, androidFeatureUserProperties);
    }

    public qou(Context context, boolean z, jwv jwv, AndroidFeatureUserProperties androidFeatureUserProperties) {
        super(context, fri.class, z, jwv, androidFeatureUserProperties);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ fqz a(Context context, ViewGroup viewGroup) {
        fqb.b();
        return frq.b(context, viewGroup, false);
    }
}
