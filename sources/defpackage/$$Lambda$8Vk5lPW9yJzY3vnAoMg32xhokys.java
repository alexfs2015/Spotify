package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Shuffle;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$8Vk5lPW9yJzY3vnAoMg32xhokys reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$8Vk5lPW9yJzY3vnAoMg32xhokys implements Function {
    public static final /* synthetic */ $$Lambda$8Vk5lPW9yJzY3vnAoMg32xhokys INSTANCE = new $$Lambda$8Vk5lPW9yJzY3vnAoMg32xhokys();

    private /* synthetic */ $$Lambda$8Vk5lPW9yJzY3vnAoMg32xhokys() {
    }

    public final Object apply(Object obj) {
        return new Shuffle((PlayerState) obj);
    }
}
