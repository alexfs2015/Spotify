package defpackage;

import com.spotify.android.paste.graphics.SpotifyIconV2;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* renamed from: qnz reason: default package */
public final class qnz implements ObservableTransformer<gzz, gzz> {
    public static final ObservableTransformer<gzz, gzz> a = $$Lambda$qnz$0ecUDGE6iptcbNAwIrD8soOp6RE.INSTANCE;

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(Observable observable) {
        return observable;
    }

    qnz() {
    }

    public final ObservableSource<gzz> apply(Observable<gzz> observable) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$qnz$D8s6dqsoPFPc_a4gvIMQTmHTN4w.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static gzz a(gzz gzz) {
        List body = gzz.body();
        if (body.isEmpty()) {
            return gzz;
        }
        return gzz.toBuilder().a(a(body)).a();
    }

    private static List<? extends gzt> a(List<? extends gzt> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (gzt gzt : list) {
            if (gzt.children().isEmpty()) {
                arrayList.add(a(gzt));
            } else {
                arrayList.add(a(gzt).toBuilder().a(a(gzt.children())).a());
            }
        }
        return arrayList;
    }

    private static gzt a(gzt gzt) {
        gzy target = gzt.target();
        if (target == null) {
            return gzt;
        }
        String uri = target.uri();
        if (uri == null) {
            return gzt;
        }
        return gzt.toBuilder().a(gzt.images().toBuilder().a((Enum<?>) a(uri))).a();
    }

    private static SpotifyIconV2 a(String str) {
        switch (jst.a(str).b) {
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
}
