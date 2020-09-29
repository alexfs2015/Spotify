package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.playlist.models.Covers.Size;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.HashMap;
import java.util.Map;

/* renamed from: gur reason: default package */
public final class gur implements gus {
    private final RxResolver a;
    private final String b;
    private final rwl c;

    public gur(RxResolver rxResolver, jva jva, rwl rwl) {
        this.a = rxResolver;
        this.b = jva.h();
        this.c = rwl;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ PlayerContext a(irg irg) {
        int length = ((vlf[]) irg.getItems()).length;
        PlayerTrack[] playerTrackArr = new PlayerTrack[length];
        for (int i = 0; i < length; i++) {
            playerTrackArr[i] = PlayerTrack.create(((vlf[]) irg.getItems())[i].getUri(), "", irg.getHeader().getUri());
        }
        String str = this.b;
        HashMap hashMap = new HashMap(3);
        if (irg.getHeader() != null) {
            hashMap.put("context_description", irg.getHeader().getTitle());
            hashMap.put("image_url", irg.getHeader().getImageUri());
            hashMap.put("image_large_url", irg.getHeader().getImageUri(Size.LARGE));
        }
        return PlayerContext.create(str, playerTrackArr, (Map<String, String>) hashMap);
    }

    public final xii<PlayerContext> resolve() {
        iqt iqt = new iqt(this.a, this.b, this.c);
        iqt.g = true;
        iqt.a(true, false, false);
        return wit.a((ObservableSource<T>) iqt.a(), BackpressureStrategy.BUFFER).e((xiy<? super T, ? extends R>) new $$Lambda$gur$c2k3RwVchcFBisksYnOZj7YoHro<Object,Object>(this));
    }
}
