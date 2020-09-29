package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.playlist.models.Covers.Size;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.HashMap;
import java.util.Map;

/* renamed from: guq reason: default package */
public final class guq implements gus {
    private final String a;
    private final wzi<iqn> b;

    public guq(jva jva, wzi<iqn> wzi) {
        this.a = jva.h();
        this.b = wzi;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ PlayerContext a(irf irf) {
        int length = ((vlf[]) irf.getItems()).length;
        PlayerTrack[] playerTrackArr = new PlayerTrack[length];
        for (int i = 0; i < length; i++) {
            playerTrackArr[i] = PlayerTrack.create(((vlf[]) irf.getItems())[i].getUri(), irf.getHeader().getUri(), irf.getHeader().getArtist().getUri());
        }
        String str = this.a;
        HashMap hashMap = new HashMap(3);
        if (irf.getHeader() != null) {
            hashMap.put("context_description", irf.getHeader().getTitle());
            hashMap.put("image_url", irf.getHeader().getImageUri());
            hashMap.put("image_large_url", irf.getHeader().getImageUri(Size.LARGE));
        }
        return PlayerContext.create(str, playerTrackArr, (Map<String, String>) hashMap);
    }

    public final xii<PlayerContext> resolve() {
        iqm a2 = ((iqn) this.b.get()).a(this.a);
        a2.a(true, false, false);
        return wit.a((ObservableSource<T>) a2.a(), BackpressureStrategy.BUFFER).e((xiy<? super T, ? extends R>) new $$Lambda$guq$6ZoL52eP2Z5bUEkSWiYkl5F2m8<Object,Object>(this));
    }
}
