package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$tvh$W37xE_tyHLkRBwLTG7IkB7y1IHQ reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$tvh$W37xE_tyHLkRBwLTG7IkB7y1IHQ implements Consumer {
    private final /* synthetic */ tvh f$0;
    private final /* synthetic */ ho f$1;

    public /* synthetic */ $$Lambda$tvh$W37xE_tyHLkRBwLTG7IkB7y1IHQ(tvh tvh, ho hoVar) {
        this.f$0 = tvh;
        this.f$1 = hoVar;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, (PlayerState) obj);
    }
}
