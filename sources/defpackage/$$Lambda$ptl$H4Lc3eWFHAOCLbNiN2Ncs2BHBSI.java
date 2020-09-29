package defpackage;

import com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.Channel;
import io.reactivex.functions.Action;

/* renamed from: -$$Lambda$ptl$H4Lc3eWFHAOCLbNiN2Ncs2BHBSI reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$ptl$H4Lc3eWFHAOCLbNiN2Ncs2BHBSI implements Action {
    private final /* synthetic */ ptl f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ Channel f$2;
    private final /* synthetic */ boolean f$3;

    public /* synthetic */ $$Lambda$ptl$H4Lc3eWFHAOCLbNiN2Ncs2BHBSI(ptl ptl, String str, Channel channel, boolean z) {
        this.f$0 = ptl;
        this.f$1 = str;
        this.f$2 = channel;
        this.f$3 = z;
    }

    public final void run() {
        this.f$0.b(this.f$1, this.f$2, this.f$3);
    }
}
