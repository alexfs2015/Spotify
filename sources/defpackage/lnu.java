package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.music.libs.album.model.AlbumRelease;
import io.reactivex.Flowable;
import java.util.Iterator;
import java.util.List;

/* renamed from: lnu reason: default package */
public final class lnu {
    final Player a;
    private final wud<PlayerTrack> b;

    public lnu(Player player, Flowable<PlayerState> flowable) {
        this.a = (Player) fay.a(player);
        this.b = vun.a((wrf<T>) flowable).c((wut<? super T, Boolean>) $$Lambda$lnu$EepZTcr_Z4DscETtEg0EZPnv7g.INSTANCE).f($$Lambda$s7vez6vRc_C5e28uHCZYajeVDaw.INSTANCE).b((wut<? super T, ? extends U>) $$Lambda$hS9MV1oOuY_qdOyMr9UoVuXvVFk.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(PlayerState playerState) {
        return Boolean.valueOf((playerState == null || playerState.track() == null) ? false : true);
    }

    public final void a(PlayerContext playerContext, int i) {
        Builder builder = new Builder();
        builder.skipToIndex(0, i);
        this.a.play((PlayerContext) fay.a(playerContext), builder.build());
    }

    public final wud<ho<String, String>> a(String str, List<AlbumRelease> list) {
        return this.b.f(new $$Lambda$lnu$UtgXROnqymicLezpKz72AVt1TFA(str, list));
    }

    private static boolean a(String str, PlayerTrack playerTrack) {
        return str.equals(playerTrack.metadata().get("context_uri"));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ho a(String str, List list, PlayerTrack playerTrack) {
        String str2;
        String str3 = "";
        if (a(str, playerTrack)) {
            str2 = playerTrack.uri();
        } else {
            str2 = str3;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AlbumRelease albumRelease = (AlbumRelease) it.next();
            if (a(albumRelease.getUri(), playerTrack)) {
                str3 = albumRelease.getUri();
                break;
            }
        }
        return ho.a(str2, str3);
    }
}
