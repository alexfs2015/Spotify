package defpackage;

import com.spotify.music.autoplay.RadioSeedBundle;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$ktw$o-Msd9MjptR7Ks8CAhJv-eVNpMc reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ktw$oMsd9MjptR7Ks8CAhJveVNpMc implements Function {
    private final /* synthetic */ Observable f$0;
    private final /* synthetic */ RadioSeedBundle f$1;

    public /* synthetic */ $$Lambda$ktw$oMsd9MjptR7Ks8CAhJveVNpMc(Observable observable, RadioSeedBundle radioSeedBundle) {
        this.f$0 = observable;
        this.f$1 = radioSeedBundle;
    }

    public final Object apply(Object obj) {
        return ktw.a(this.f$0, this.f$1, (Boolean) obj);
    }
}
