package defpackage;

import com.spotify.music.features.freetieralbum.offline.AlbumOfflineStateProvider.OfflineState;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$muh$u64Bt9XI6EEGKEFySqqwgt4Aphg reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$muh$u64Bt9XI6EEGKEFySqqwgt4Aphg implements Function {
    public static final /* synthetic */ $$Lambda$muh$u64Bt9XI6EEGKEFySqqwgt4Aphg INSTANCE = new $$Lambda$muh$u64Bt9XI6EEGKEFySqqwgt4Aphg();

    private /* synthetic */ $$Lambda$muh$u64Bt9XI6EEGKEFySqqwgt4Aphg() {
    }

    public final Object apply(Object obj) {
        return ((OfflineState) obj).getAlbum().getOfflineState();
    }
}
