package defpackage;

import com.spotify.common.uri.SpotifyUri;
import com.spotify.common.uri.SpotifyUri.Kind;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.List;

/* renamed from: hbc reason: default package */
public final class hbc {
    private final gpx a;

    public hbc(gpx gpx) {
        this.a = gpx;
    }

    public final Single<List<String>> a(List<String> list) {
        return Observable.a((Iterable<? extends T>) list).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$hbc$CCdCRvdrgffpfwk9y1vfIRsaPso<Object,Object>(this), 2).b(16);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(String str) {
        SpotifyUri spotifyUri = new SpotifyUri(str);
        Kind kind = spotifyUri.a;
        if (kind == Kind.TRACK || kind == Kind.LOCAL_TRACK || kind == Kind.EPISODE) {
            return Observable.b(spotifyUri.toString());
        }
        if (kind == Kind.ALBUM) {
            return this.a.a(str).d().a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$hbc$qzIXjcUqNRapqsxPn8mHL1Vkfgw.INSTANCE, false).a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$hbc$4_inLXsi1AWII3QP2L8bFfwNL7Q.INSTANCE, false).c((Function<? super T, ? extends R>) $$Lambda$hbc$4S4IhSXMqrkmJOvkdhKB9KFGloY.INSTANCE);
        }
        StringBuilder sb = new StringBuilder("The uri was of an unhandled type: ");
        sb.append(str);
        throw new AssertionError(sb.toString());
    }
}
