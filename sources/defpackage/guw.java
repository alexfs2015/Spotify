package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.SortOption;
import com.spotify.playlist.models.Show.MediaType;
import io.reactivex.BackpressureStrategy;
import io.reactivex.ObservableSource;
import io.reactivex.SingleSource;
import java.util.ArrayList;

/* renamed from: guw reason: default package */
public final class guw implements gus {
    private final String a;
    private final sgs b;
    private final gux c;

    public guw(String str, sgs sgs, gux gux) {
        this.a = (String) fbp.a(str);
        this.b = (sgs) fbp.a(sgs);
        this.c = (gux) fbp.a(gux);
    }

    /* access modifiers changed from: private */
    public static Boolean a(vml vml) {
        return Boolean.valueOf(vml.a().k() == MediaType.AUDIO || vml.a().k() == MediaType.VIDEO || vml.a().k() == MediaType.MIXED);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ xii a(SortOption sortOption) {
        sgs sgs = this.b;
        sgs.c = sortOption;
        return wit.a((ObservableSource<T>) sgs.a(), BackpressureStrategy.BUFFER);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ PlayerContext b(vml vml) {
        int length = ((vkv[]) vml.getItems()).length;
        if (length == 0) {
            return PlayerContext.create(this.a, new PlayerTrack[0]);
        }
        ArrayList arrayList = new ArrayList(((vkv[]) vml.getItems()).length);
        vkv[] vkvArr = (vkv[]) vml.getItems();
        for (int i = 0; i < length; i++) {
            if (gvb.a(vkvArr[i])) {
                arrayList.add(PlayerTrack.create(vkvArr[i].getUri(), vkvArr[i].v()));
            }
        }
        return PlayerContext.create(this.a, (PlayerTrack[]) arrayList.toArray(new PlayerTrack[0]));
    }

    public final xii<PlayerContext> resolve() {
        return wit.a((SingleSource<T>) this.c.a(this.a)).b((xiy<? super T, ? extends xii<? extends R>>) new $$Lambda$guw$uciMFvICV94Ex2jpkyrgMu_5o<Object,Object>(this)).c((xiy<? super T, Boolean>) $$Lambda$guw$_ynZtRqrt9uKPKRzXiuJN5laQ.INSTANCE).e((xiy<? super T, ? extends R>) new $$Lambda$guw$BqyzmbQtVxm7jnZihZYm4P0SNo<Object,Object>(this));
    }
}
