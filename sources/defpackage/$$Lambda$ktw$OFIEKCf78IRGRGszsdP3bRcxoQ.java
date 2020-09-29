package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.autoplay.RadioSeedBundle;
import io.reactivex.functions.Predicate;

/* renamed from: -$$Lambda$ktw$OFIEKCf78IRGRGsz-sdP3bRcxoQ reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ktw$OFIEKCf78IRGRGszsdP3bRcxoQ implements Predicate {
    private final /* synthetic */ RadioSeedBundle f$0;

    public /* synthetic */ $$Lambda$ktw$OFIEKCf78IRGRGszsdP3bRcxoQ(RadioSeedBundle radioSeedBundle) {
        this.f$0 = radioSeedBundle;
    }

    public final boolean test(Object obj) {
        return ((PlayerState) obj).contextUri().contains(this.f$0.getRadioSeed());
    }
}
