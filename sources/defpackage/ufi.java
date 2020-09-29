package defpackage;

import com.google.common.collect.ImmutableMap;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext.Metadata;
import com.spotify.mobile.android.cosmos.player.v2.PlayerProviders;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.Map;

/* renamed from: ufi reason: default package */
public final class ufi implements uez {
    public boolean a;
    private final sso b;
    private final Player c;
    private final uhz d;
    private int e;

    public ufi(sso sso, Player player, uhz uhz) {
        this.b = sso;
        this.c = player;
        this.d = uhz;
    }

    private static int a(vkv[] vkvArr) {
        int i = 0;
        for (vkv isHeader : vkvArr) {
            if (isHeader.isHeader()) {
                i++;
            }
        }
        return i;
    }

    private Map<String, String> a() {
        if (!this.a) {
            return ImmutableMap.f();
        }
        return ImmutableMap.b(Metadata.SORTING_CRITERIA, String.format("%s ASC", new Object[]{PlayerTrack.Metadata.ADDED_AT}));
    }

    private static Map<String, String> a(vkv vkv) {
        return ImmutableMap.g().a(vkv.v()).b(PlayerTrack.Metadata.ADDED_AT, Integer.toString(vkv.s())).b();
    }

    private void a(PlayerContext playerContext) {
        this.c.play(playerContext, new Builder().skipToIndex(0, this.e).suppressions(PlayerProviders.MFT).playerOptionsOverride(Boolean.FALSE, null, null).build());
    }

    private PlayerTrack[] a(int i, vkv[] vkvArr) {
        vkv vkv = vkvArr[i];
        PlayerTrack[] playerTrackArr = new PlayerTrack[(vkvArr.length - a(vkvArr))];
        int i2 = 0;
        for (vkv vkv2 : vkvArr) {
            if (!vkv2.isHeader()) {
                if (vkv.equals(vkv2)) {
                    this.e = i2;
                }
                playerTrackArr[i2] = PlayerTrack.create(vkv2.getUri(), a(vkv2));
                i2++;
            }
        }
        return playerTrackArr;
    }

    public final void a(vkv vkv, vkv[] vkvArr, String str, int i) {
        a(PlayerContext.create(this.b.toString(), a(i, vkvArr), a()));
        this.d.b(vkv.getUri(), str, i);
    }
}
