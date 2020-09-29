package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.newplaying.scroll.NowPlayingWidget.Type;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$ssh$BNOv9iB_YFsRIzta-svTxkuTO7A reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ssh$BNOv9iB_YFsRIztasvTxkuTO7A implements Predicate {
    private final /* synthetic */ ssh f$0;
    private final /* synthetic */ PlayerState f$1;

    public /* synthetic */ $$Lambda$ssh$BNOv9iB_YFsRIztasvTxkuTO7A(ssh ssh, PlayerState playerState) {
        this.f$0 = ssh;
        this.f$1 = playerState;
    }

    public final boolean test(Object obj) {
        return this.f$0.a(this.f$1, (Type) obj);
    }
}
