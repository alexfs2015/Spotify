package defpackage;

import com.spotify.common.uri.SpotifyUri;
import com.spotify.common.uri.SpotifyUri.Kind;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.List;

/* renamed from: hdv reason: default package */
public final class hdv {
    private final grw a;

    public hdv(grw grw) {
        this.a = grw;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ObservableSource a(String str) {
        SpotifyUri spotifyUri = new SpotifyUri(str);
        Kind kind = spotifyUri.a;
        if (kind == Kind.TRACK || kind == Kind.LOCAL_TRACK || kind == Kind.EPISODE) {
            return Observable.b(spotifyUri.toString());
        }
        if (kind == Kind.ALBUM) {
            return this.a.a(str).d().a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$hdv$2OoGUAkAFDq8x0PaAviQq7WxqSg.INSTANCE, false).a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$hdv$W5gGmVNy56f62WHBfvgGYOyzU.INSTANCE, false).c((Function<? super T, ? extends R>) $$Lambda$hdv$yurATEUrjORPtIftCe8S7SBYS6M.INSTANCE);
        }
        StringBuilder sb = new StringBuilder("The uri was of an unhandled type: ");
        sb.append(str);
        throw new AssertionError(sb.toString());
    }

    public final Single<List<String>> a(List<String> list) {
        return Observable.a((Iterable<? extends T>) list).a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$hdv$dcCOXucvTFk5R0j1EzmFm7X3WI<Object,Object>(this), 2).b(16);
    }
}
