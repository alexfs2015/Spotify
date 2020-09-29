package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;
import io.reactivex.SingleSource;
import java.util.Map;
import rx.internal.operators.CachedObservable;

/* renamed from: tmr reason: default package */
public final class tmr {
    public boolean a;
    private final rxj b;
    private wuh<PlayerContext> c;

    public tmr(rxj rxj) {
        this.b = rxj;
    }

    public final wuh<PlayerContext> a(String str, String str2) {
        if (this.c == null) {
            rxi a2 = this.b.a(str, false, false);
            a2.a(Integer.valueOf(0), Integer.valueOf(15));
            a2.a = str2;
            this.c = CachedObservable.a(wuh.a(vun.a((SingleSource<T>) a2.e()).c(new $$Lambda$tmr$Hc5O8xDxx6gPLwLRumuNGB5bFI(this, str))), 1).a();
        }
        return this.c;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ PlayerContext a(String str, uzx uzx) {
        String str2;
        ImmutableMap immutableMap;
        uys[] uysArr = (uys[]) uzx.getItems();
        PlayerTrack[] playerTrackArr = new PlayerTrack[uysArr.length];
        int i = 0;
        while (true) {
            int length = playerTrackArr.length;
            str2 = Metadata.ADDED_AT;
            if (i >= length) {
                break;
            }
            uys uys = uysArr[i];
            playerTrackArr[i] = PlayerTrack.create(uys.getUri(), ImmutableMap.g().a(uys.v()).b(str2, Integer.toString(uys.s())).b());
            i++;
        }
        if (this.a) {
            immutableMap = ImmutableMap.b(PlayerContext.Metadata.SORTING_CRITERIA, String.format("%s ASC", new Object[]{str2}));
        } else {
            immutableMap = ImmutableMap.f();
        }
        return PlayerContext.create(str, playerTrackArr, (Map<String, String>) immutableMap);
    }
}
