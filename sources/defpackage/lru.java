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

/* renamed from: lru reason: default package */
public final class lru {
    final Player a;
    private final xii<PlayerTrack> b;

    public lru(Player player, Flowable<PlayerState> flowable) {
        this.a = (Player) fbp.a(player);
        this.b = wit.a((xfk<T>) flowable).c((xiy<? super T, Boolean>) $$Lambda$lru$UnPeUVv3FZ2hP_WM3K64wXBXKl0.INSTANCE).e((xiy<? super T, ? extends R>) $$Lambda$CU4HsHLF6o7BOT68dmlohDtLFvQ.INSTANCE).b((xiy<? super T, ? extends U>) $$Lambda$UffjuocpeZXFAba747XMf6nEuyg.INSTANCE);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ho a(String str, List list, PlayerTrack playerTrack) {
        String str2 = "";
        String uri = a(str, playerTrack) ? playerTrack.uri() : str2;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AlbumRelease albumRelease = (AlbumRelease) it.next();
            if (a(albumRelease.getUri(), playerTrack)) {
                str2 = albumRelease.getUri();
                break;
            }
        }
        return ho.a(uri, str2);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Boolean a(PlayerState playerState) {
        return Boolean.valueOf((playerState == null || playerState.track() == null) ? false : true);
    }

    private static boolean a(String str, PlayerTrack playerTrack) {
        return str.equals(playerTrack.metadata().get("context_uri"));
    }

    public final xii<ho<String, String>> a(String str, List<AlbumRelease> list) {
        return this.b.e((xiy<? super T, ? extends R>) new $$Lambda$lru$Nx3vfUopDKad1_9248YdBW8RqhQ<Object,Object>(str, list));
    }

    public final void a(PlayerContext playerContext, int i) {
        Builder builder = new Builder();
        builder.skipToIndex(0, i);
        this.a.play((PlayerContext) fbp.a(playerContext), builder.build());
    }
}
