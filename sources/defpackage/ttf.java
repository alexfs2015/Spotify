package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerProviders;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;
import java.util.Map;

/* renamed from: ttf reason: default package */
public final class ttf implements tsw {
    public boolean a;
    private final sih b;
    private final Player c;
    private final tvw d;
    private int e;

    public ttf(sih sih, Player player, tvw tvw) {
        this.b = sih;
        this.c = player;
        this.d = tvw;
    }

    public final void a(uys uys, uys[] uysArr, String str, int i) {
        a(PlayerContext.create(this.b.toString(), a(i, uysArr), a()));
        this.d.b(uys.getUri(), str, i);
    }

    private PlayerTrack[] a(int i, uys[] uysArr) {
        uys uys = uysArr[i];
        PlayerTrack[] playerTrackArr = new PlayerTrack[(uysArr.length - a(uysArr))];
        int i2 = 0;
        for (uys uys2 : uysArr) {
            if (!uys2.isHeader()) {
                if (uys.equals(uys2)) {
                    this.e = i2;
                }
                playerTrackArr[i2] = PlayerTrack.create(uys2.getUri(), a(uys2));
                i2++;
            }
        }
        return playerTrackArr;
    }

    private static Map<String, String> a(uys uys) {
        return ImmutableMap.g().a(uys.v()).b(Metadata.ADDED_AT, Integer.toString(uys.s())).b();
    }

    private Map<String, String> a() {
        if (!this.a) {
            return ImmutableMap.f();
        }
        return ImmutableMap.b(PlayerContext.Metadata.SORTING_CRITERIA, String.format("%s ASC", new Object[]{Metadata.ADDED_AT}));
    }

    private void a(PlayerContext playerContext) {
        this.c.play(playerContext, new Builder().skipToIndex(0, this.e).suppressions(PlayerProviders.MFT).playerOptionsOverride(Boolean.FALSE, null, null).build());
    }

    private static int a(uys[] uysArr) {
        int i = 0;
        for (uys isHeader : uysArr) {
            if (isHeader.isHeader()) {
                i++;
            }
        }
        return i;
    }
}
