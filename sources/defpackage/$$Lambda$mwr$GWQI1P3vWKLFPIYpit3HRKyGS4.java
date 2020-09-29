package defpackage;

import com.spotify.music.follow.FollowManager.a;
import io.reactivex.FlowableEmitter;
import io.reactivex.FlowableOnSubscribe;

/* renamed from: -$$Lambda$mwr$GWQI1P3vWKLFPI-Ypit3HRKyGS4 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$mwr$GWQI1P3vWKLFPIYpit3HRKyGS4 implements FlowableOnSubscribe {
    private final /* synthetic */ mwr f$0;
    private final /* synthetic */ String f$1;
    private final /* synthetic */ a f$2;

    public /* synthetic */ $$Lambda$mwr$GWQI1P3vWKLFPIYpit3HRKyGS4(mwr mwr, String str, a aVar) {
        this.f$0 = mwr;
        this.f$1 = str;
        this.f$2 = aVar;
    }

    public final void subscribe(FlowableEmitter flowableEmitter) {
        this.f$0.a(this.f$1, this.f$2, flowableEmitter);
    }
}
