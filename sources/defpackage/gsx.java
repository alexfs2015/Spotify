package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.playlist.models.Show.MediaType;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import io.reactivex.SingleSource;
import java.util.ArrayList;

/* renamed from: gsx reason: default package */
public final class gsx implements gst {
    private final String a;
    private final rxi b;
    private final gsy c;

    public gsx(String str, rxi rxi, gsy gsy) {
        this.a = (String) fay.a(str);
        this.b = (rxi) fay.a(rxi);
        this.c = (gsy) fay.a(gsy);
    }

    /* access modifiers changed from: private */
    public static Boolean a(uzx uzx) {
        return Boolean.valueOf(uzx.a().k() == MediaType.AUDIO || uzx.a().k() == MediaType.VIDEO || uzx.a().k() == MediaType.MIXED);
    }

    public final wud<PlayerContext> resolve() {
        return vun.a((SingleSource<T>) this.c.a(this.a)).b((wut<? super T, ? extends wud<? extends R>>) new $$Lambda$gsx$lkvXcYMSeYD906GlCnxYhqI0eQ<Object,Object>(this)).c((wut<? super T, Boolean>) $$Lambda$gsx$2Ai_rb2u1F_ZCzhc2khR3Rx37oA.INSTANCE).f(new $$Lambda$gsx$kBlPgsgH14xwB43Wi7D29BOzRcw(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ wud a(SortOption sortOption) {
        rxi rxi = this.b;
        rxi.c = sortOption;
        return vun.a((ObservableSource<T>) rxi.a(), BackpressureStrategy.BUFFER);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ PlayerContext b(uzx uzx) {
        int length = ((uys[]) uzx.getItems()).length;
        if (length == 0) {
            return PlayerContext.create(this.a, new PlayerTrack[0]);
        }
        ArrayList arrayList = new ArrayList(((uys[]) uzx.getItems()).length);
        uys[] uysArr = (uys[]) uzx.getItems();
        for (int i = 0; i < length; i++) {
            if (gtc.a(uysArr[i])) {
                arrayList.add(PlayerTrack.create(uysArr[i].getUri(), uysArr[i].v()));
            }
        }
        return PlayerContext.create(this.a, (PlayerTrack[]) arrayList.toArray(new PlayerTrack[0]));
    }
}
