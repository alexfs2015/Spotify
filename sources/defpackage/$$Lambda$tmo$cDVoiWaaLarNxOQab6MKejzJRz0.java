package defpackage;

import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import io.reactivex.functions.Consumer;

/* renamed from: -$$Lambda$tmo$cDVoiWaaLarNxOQab6MKejzJRz0 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$tmo$cDVoiWaaLarNxOQab6MKejzJRz0 implements Consumer {
    private final /* synthetic */ tmo f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ long f$2;

    public /* synthetic */ $$Lambda$tmo$cDVoiWaaLarNxOQab6MKejzJRz0(tmo tmo, String str, long j) {
        this.f$0 = tmo;
        this.f$1 = str;
        this.f$2 = j;
    }

    public final void accept(Object obj) {
        this.f$0.a(this.f$1, this.f$2, (PlayerContext) obj);
    }
}
