package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.autoplay.RadioSeedBundle;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$kqo$rPY5eEJrovv5IooyOC2olpJWabs reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kqo$rPY5eEJrovv5IooyOC2olpJWabs implements Predicate {
    private final /* synthetic */ RadioSeedBundle f$0;

    public /* synthetic */ $$Lambda$kqo$rPY5eEJrovv5IooyOC2olpJWabs(RadioSeedBundle radioSeedBundle) {
        this.f$0 = radioSeedBundle;
    }

    public final boolean test(Object obj) {
        return kqo.a(this.f$0, (PlayerState) obj);
    }
}
