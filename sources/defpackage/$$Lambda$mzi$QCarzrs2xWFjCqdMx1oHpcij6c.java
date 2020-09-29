package defpackage;

import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider.OfflineState;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$mzi$QCarzrs2xW-FjCqdMx1oHpcij6c reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$mzi$QCarzrs2xWFjCqdMx1oHpcij6c implements Function {
    public static final /* synthetic */ $$Lambda$mzi$QCarzrs2xWFjCqdMx1oHpcij6c INSTANCE = new $$Lambda$mzi$QCarzrs2xWFjCqdMx1oHpcij6c();

    private /* synthetic */ $$Lambda$mzi$QCarzrs2xWFjCqdMx1oHpcij6c() {
    }

    public final Object apply(Object obj) {
        return ((OfflineState) obj).getAlbum().getOfflineState();
    }
}
