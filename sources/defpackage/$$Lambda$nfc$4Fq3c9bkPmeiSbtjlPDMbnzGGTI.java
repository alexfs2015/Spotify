package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$nfc$4Fq3c9bkPmeiSbtjlPDMbnzGGTI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$nfc$4Fq3c9bkPmeiSbtjlPDMbnzGGTI implements Consumer {
    private final /* synthetic */ nfc f$0;
    private final /* synthetic */ String f$1;

    public /* synthetic */ $$Lambda$nfc$4Fq3c9bkPmeiSbtjlPDMbnzGGTI(nfc nfc, String str) {
        this.f$0 = nfc;
        this.f$1 = str;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, (PlayerTrack) obj);
    }
}
