package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qwi reason: default package */
public final class qwi implements ObservableTransformer<hcs, hcs> {
    public static final ObservableTransformer<hcs, hcs> a = $$Lambda$qwi$A4DERvmHVNQejDHNSb_rDAHjwcE.INSTANCE;

    qwi() {
    }

    private static SpotifyIconV2 a(String str) {
        switch (jva.a(str).b) {
            case ALBUM:
                return SpotifyIconV2.ALBUM;
            case ARTIST:
                return SpotifyIconV2.ARTIST;
            case TRACK:
                return SpotifyIconV2.TRACK;
            case PLAYLIST_V2:
                return SpotifyIconV2.PLAYLIST;
            case BROWSE_GENRES:
                return SpotifyIconV2.BROWSE;
            case SHOW_SHOW:
                return SpotifyIconV2.PODCASTS;
            default:
                return SpotifyIconV2.TRACK;
        }
    }

    private static hcm a(hcm hcm) {
        hcr target = hcm.target();
        if (target == null) {
            return hcm;
        }
        String uri = target.uri();
        return uri == null ? hcm : hcm.toBuilder().a(hcm.images().toBuilder().a((Enum<?>) a(uri))).a();
    }

    /* access modifiers changed from: private */
    public static hcs a(hcs hcs) {
        List body = hcs.body();
        return body.isEmpty() ? hcs : hcs.toBuilder().a(a(body)).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(Observable observable) {
        return observable;
    }

    private static List<? extends hcm> a(List<? extends hcm> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (hcm hcm : list) {
            if (hcm.children().isEmpty()) {
                arrayList.add(a(hcm));
            } else {
                arrayList.add(a(hcm).toBuilder().a(a(hcm.children())).a());
            }
        }
        return arrayList;
    }

    public final ObservableSource<hcs> apply(Observable<hcs> observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$qwi$Zn2qsb5bCCamEg9rNGh9XHStFxg.INSTANCE);
    }
}
