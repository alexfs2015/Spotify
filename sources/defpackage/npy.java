package defpackage;

import com.spotify.music.features.homemix.models.HomeMixTuning;
import io.reactivex.Single;

/* renamed from: npy reason: default package */
public interface npy {
    @xhw(a = "home-mix/tuning/v1/tune/{playlistUri}")
    Single<xgo<Void>> a(@xia(a = "playlistUri") String str, @xhi HomeMixTuning homeMixTuning);
}
