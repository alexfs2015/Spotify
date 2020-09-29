package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.autoplay.RadioSeedBundle;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$kqn$kqnwUqhUhBJyGns46gAkRKW2HrE reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kqn$kqnwUqhUhBJyGns46gAkRKW2HrE implements Predicate {
    private final /* synthetic */ RadioSeedBundle f$0;

    public /* synthetic */ $$Lambda$kqn$kqnwUqhUhBJyGns46gAkRKW2HrE(RadioSeedBundle radioSeedBundle) {
        this.f$0 = radioSeedBundle;
    }

    public final boolean test(Object obj) {
        return ((PlayerState) obj).contextUri().contains(this.f$0.getRadioSeed());
    }
}
