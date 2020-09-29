package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol.Identifier;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$iii$jssINi55rcozqC6w9iW8ZKMYDrA reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$iii$jssINi55rcozqC6w9iW8ZKMYDrA implements Function {
    private final /* synthetic */ Identifier f$0;

    public /* synthetic */ $$Lambda$iii$jssINi55rcozqC6w9iW8ZKMYDrA(Identifier identifier) {
        this.f$0 = identifier;
    }

    public final Object apply(Object obj) {
        return iii.a(this.f$0, (PlayerState) obj);
    }
}
