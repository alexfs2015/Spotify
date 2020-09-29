package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;
import io.reactivex.SingleSource;
import java.util.Map;
import rx.internal.operators.CachedObservable;

/* renamed from: tym reason: default package */
public final class tym {
    public boolean a;
    private final sgt b;
    private xim<PlayerContext> c;

    public tym(sgt sgt) {
        this.b = sgt;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ PlayerContext a(String str, vml vml) {
        String str2;
        ImmutableMap immutableMap;
        vkv[] vkvArr = (vkv[]) vml.getItems();
        PlayerTrack[] playerTrackArr = new PlayerTrack[vkvArr.length];
        int i = 0;
        while (true) {
            int length = playerTrackArr.length;
            str2 = Metadata.ADDED_AT;
            if (i >= length) {
                break;
            }
            vkv vkv = vkvArr[i];
            playerTrackArr[i] = PlayerTrack.create(vkv.getUri(), ImmutableMap.g().a(vkv.v()).b(str2, Integer.toString(vkv.s())).b());
            i++;
        }
        if (this.a) {
            immutableMap = ImmutableMap.b(PlayerContext.Metadata.SORTING_CRITERIA, String.format("%s ASC", new Object[]{str2}));
        } else {
            immutableMap = ImmutableMap.f();
        }
        return PlayerContext.create(str, playerTrackArr, (Map<String, String>) immutableMap);
    }

    public final xim<PlayerContext> a(String str, String str2) {
        if (this.c == null) {
            sgs a2 = this.b.a(str, false, false);
            a2.a(Integer.valueOf(0), Integer.valueOf(15));
            a2.a = str2;
            this.c = CachedObservable.a(xim.a(wit.a((SingleSource<T>) a2.e()).c(new $$Lambda$tym$6GL4vR4PeO5uWAuEwWrPUx9djgs(this, str))), 1).a();
        }
        return this.c;
    }
}
