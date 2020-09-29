package defpackage;

import com.spotify.music.features.profile.proto.ProfileProfilesRequest.GetProfilesRequest;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$psh$-pfZQ38NjvOUqH_68640MFfkefY reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$psh$pfZQ38NjvOUqH_68640MFfkefY implements Function {
    private final /* synthetic */ pqw f$0;
    private final /* synthetic */ Scheduler f$1;

    public /* synthetic */ $$Lambda$psh$pfZQ38NjvOUqH_68640MFfkefY(pqw pqw, Scheduler scheduler) {
        this.f$0 = pqw;
        this.f$1 = scheduler;
    }

    public final Object apply(Object obj) {
        return this.f$0.a((GetProfilesRequest) GetProfilesRequest.k().a(((b) obj).a).g()).a(this.f$1).c((Function<? super T, ? extends R>) $$Lambda$kOQr_f27U5ObyPWNRGHbjR9S3a8.INSTANCE);
    }
}
