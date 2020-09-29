package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$mzv$-Zq9ARw_OTNnHnvXRrsQufqvq7U reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$mzv$Zq9ARw_OTNnHnvXRrsQufqvq7U implements Consumer {
    private final /* synthetic */ mzv f$0;
    private final /* synthetic */ String f$1;

    public /* synthetic */ $$Lambda$mzv$Zq9ARw_OTNnHnvXRrsQufqvq7U(mzv mzv, String str) {
        this.f$0 = mzv;
        this.f$1 = str;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, (PlayerTrack) obj);
    }
}
