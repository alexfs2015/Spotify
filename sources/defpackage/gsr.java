package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.playlist.models.Covers.Size;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import java.util.HashMap;
import java.util.Map;

/* renamed from: gsr reason: default package */
public final class gsr implements gst {
    private final String a;
    private final wlc<ioa> b;

    public gsr(jst jst, wlc<ioa> wlc) {
        this.a = jst.h();
        this.b = wlc;
    }

    public final wud<PlayerContext> resolve() {
        inz a2 = ((ioa) this.b.get()).a(this.a);
        a2.a(true, false, false);
        return vun.a((ObservableSource<T>) a2.a(), BackpressureStrategy.BUFFER).f(new $$Lambda$gsr$k7IkyQNn_btom2Q51d5FvSsIY84(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ PlayerContext a(ios ios) {
        int length = ((uzc[]) ios.getItems()).length;
        PlayerTrack[] playerTrackArr = new PlayerTrack[length];
        for (int i = 0; i < length; i++) {
            playerTrackArr[i] = PlayerTrack.create(((uzc[]) ios.getItems())[i].getUri(), ios.getHeader().getUri(), ios.getHeader().getArtist().getUri());
        }
        String str = this.a;
        HashMap hashMap = new HashMap(3);
        if (ios.getHeader() != null) {
            hashMap.put("context_description", ios.getHeader().getTitle());
            hashMap.put("image_url", ios.getHeader().getImageUri());
            hashMap.put("image_large_url", ios.getHeader().getImageUri(Size.LARGE));
        }
        return PlayerContext.create(str, playerTrackArr, (Map<String, String>) hashMap);
    }
}
