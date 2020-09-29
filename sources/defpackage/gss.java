package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.playlist.models.Covers.Size;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.HashMap;
import java.util.Map;

/* renamed from: gss reason: default package */
public final class gss implements gst {
    private final RxResolver a;
    private final String b;
    private final rnf c;

    public gss(RxResolver rxResolver, jst jst, rnf rnf) {
        this.a = rxResolver;
        this.b = jst.h();
        this.c = rnf;
    }

    public final wud<PlayerContext> resolve() {
        iog iog = new iog(this.a, this.b, this.c);
        iog.g = true;
        iog.a(true, false, false);
        return vun.a((ObservableSource<T>) iog.a(), BackpressureStrategy.BUFFER).f(new $$Lambda$gss$odsUc6W9Dk2Sc0NEE4m70J1csrk(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ PlayerContext a(iot iot) {
        int length = ((uzc[]) iot.getItems()).length;
        PlayerTrack[] playerTrackArr = new PlayerTrack[length];
        for (int i = 0; i < length; i++) {
            playerTrackArr[i] = PlayerTrack.create(((uzc[]) iot.getItems())[i].getUri(), "", iot.getHeader().getUri());
        }
        String str = this.b;
        HashMap hashMap = new HashMap(3);
        if (iot.getHeader() != null) {
            hashMap.put("context_description", iot.getHeader().getTitle());
            hashMap.put("image_url", iot.getHeader().getImageUri());
            hashMap.put("image_large_url", iot.getHeader().getImageUri(Size.LARGE));
        }
        return PlayerContext.create(str, playerTrackArr, (Map<String, String>) hashMap);
    }
}
