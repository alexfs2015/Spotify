package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerProviders;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerSuppressions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack.Metadata;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map.Entry;

/* renamed from: ttp reason: default package */
public final class ttp implements gxk {
    private final Player b;
    private final a c;

    public ttp(Player player, a aVar) {
        this.b = (Player) fbp.a(player);
        this.c = (a) fbp.a(aVar);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Entry entry) {
        if (entry != null) {
            if (!Metadata.MFT_UNPLAYABLE_POLICY.equals(entry.getKey())) {
                return true;
            }
        }
        return false;
    }

    public final void handleCommand(hci hci, gwy gwy) {
        String string = hci.data().string("uri");
        if (string != null) {
            PlayerState lastPlayerState = this.b.getLastPlayerState();
            boolean z = true;
            if (lastPlayerState != null && lastPlayerState.contextUri().equals(string) && lastPlayerState.isPlaying() && !lastPlayerState.isPaused()) {
                this.b.pause();
                return;
            }
            if (lastPlayerState == null || !lastPlayerState.contextUri().equals(string) || !lastPlayerState.isPaused() || !lastPlayerState.isPlaying()) {
                z = false;
            }
            if (z) {
                this.b.resume();
                return;
            }
            PlayerContext a = hbr.a(hci.data());
            if (a != null) {
                HashSet hashSet = new HashSet();
                hashSet.add("social_play");
                PlayOptions build = new Builder().suppressions(new PlayerSuppressions(Collections.singleton(PlayerProviders.MFT_INJECT_RANDOM_TRACKS))).build();
                PlayerContext playerContext = new PlayerContext(a.uri(), ImmutableMap.g().a(Maps.a(a.metadata(), (fbq<? super Entry<K, V>>) $$Lambda$ttp$5_Qca31s9VZapg8uyMy55ko05dg.INSTANCE)).b(Metadata.MFT_UNPLAYABLE_POLICY, "remove").b(), a.restrictions(), a.pages(), a.fallbackPages(), a.url());
                this.b.play(playerContext, build, hashSet, this.c.ae_().toString());
            }
        }
    }
}
