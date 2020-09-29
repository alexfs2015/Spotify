package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.music.autoplay.RadioSeedBundle;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$kqo$JdsC23mTbk0voJ_IHkH7b4m0F2Q reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$kqo$JdsC23mTbk0voJ_IHkH7b4m0F2Q implements Function {
    private final /* synthetic */ RadioSeedBundle f$0;

    public /* synthetic */ $$Lambda$kqo$JdsC23mTbk0voJ_IHkH7b4m0F2Q(RadioSeedBundle radioSeedBundle) {
        this.f$0 = radioSeedBundle;
    }

    public final Object apply(Object obj) {
        return ho.a((PlayerState) obj, this.f$0);
    }
}
