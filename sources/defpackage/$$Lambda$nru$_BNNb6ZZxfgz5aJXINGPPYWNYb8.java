package defpackage;

import com.spotify.music.features.homemix.models.HomeMixTuning.Style;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$nru$_BNNb6ZZxfgz5aJXINGPPYWNYb8 reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$nru$_BNNb6ZZxfgz5aJXINGPPYWNYb8 implements Consumer {
    private final /* synthetic */ nru f$0;
    private final /* synthetic */ Style f$1;

    public /* synthetic */ $$Lambda$nru$_BNNb6ZZxfgz5aJXINGPPYWNYb8(nru nru, Style style) {
        this.f$0 = nru;
        this.f$1 = style;
    }

    public final void accept(Object obj) {
        this.f$0.b(this.f$1, (Boolean) obj);
    }
}
