package defpackage;

import com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.Channel;
import io.reactivex.functions.Action;

/* renamed from: -$$Lambda$pkt$SHT7HNfdjygDwWnEIvccAJFEVNA reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$pkt$SHT7HNfdjygDwWnEIvccAJFEVNA implements Action {
    private final /* synthetic */ pkt f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ Channel f$2;
    private final /* synthetic */ boolean f$3;

    public /* synthetic */ $$Lambda$pkt$SHT7HNfdjygDwWnEIvccAJFEVNA(pkt pkt, String str, Channel channel, boolean z) {
        this.f$0 = pkt;
        this.f$1 = str;
        this.f$2 = channel;
        this.f$3 = z;
    }

    public final void run() {
        this.f$0.b(this.f$1, this.f$2, this.f$3);
    }
}
