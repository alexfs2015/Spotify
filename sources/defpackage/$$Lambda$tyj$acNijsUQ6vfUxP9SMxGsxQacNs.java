package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$tyj$ac-NijsUQ6vfUxP9SMxGsxQacNs reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$tyj$acNijsUQ6vfUxP9SMxGsxQacNs implements Consumer {
    private final /* synthetic */ tyj f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ long f$2;

    public /* synthetic */ $$Lambda$tyj$acNijsUQ6vfUxP9SMxGsxQacNs(tyj tyj, String str, long j) {
        this.f$0 = tyj;
        this.f$1 = str;
        this.f$2 = j;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, this.f$2, (PlayerContext) obj);
    }
}
