package defpackage;

import android.os.Bundle;
import com.google.common.base.Optional;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.LoadingState;
import com.spotify.music.features.yourlibrary.musicpages.domain.MusicPagesModel.a;

/* renamed from: rbl reason: default package */
public final class rbl {
    public static void a(Bundle bundle, a aVar) {
        LoadingState loadingState = (LoadingState) bundle.getSerializable("loading-state");
        if (loadingState != null) {
            aVar.a(loadingState).a(bundle.getInt("visible-range-start", 0)).b(bundle.getInt("visible-range-size", 0));
            rdc rdc = (rdc) bundle.getParcelable("viewport");
            if (rdc != null) {
                aVar.a(rdc);
            }
            String str = "drilldown-header-expanded";
            if (bundle.containsKey(str)) {
                aVar.h(Optional.b(Boolean.valueOf(bundle.getBoolean(str)))).a(bundle.getBoolean("text-filter-visible")).a(bundle.getString("text-filter"));
            }
        }
    }

    public static void a(Bundle bundle, MusicPagesModel musicPagesModel) {
        bundle.putSerializable("loading-state", musicPagesModel.n());
        bundle.putInt("visible-range-start", musicPagesModel.f());
        bundle.putInt("visible-range-size", musicPagesModel.g());
        bundle.putParcelable("viewport", rdd.a(musicPagesModel.h(), musicPagesModel.f(), musicPagesModel.g()));
        if (musicPagesModel.m().b()) {
            bundle.putBoolean("drilldown-header-expanded", ((Boolean) musicPagesModel.m().c()).booleanValue());
            bundle.putBoolean("text-filter-visible", musicPagesModel.o());
            bundle.putString("text-filter", musicPagesModel.e());
        }
    }
}
