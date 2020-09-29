package defpackage;

import com.spotify.mobile.android.service.feature.FeatureService.c;
import rx.Emitter;

/* renamed from: -$$Lambda$q8GYsGm65PGbNS2_ARhKG8wvltE reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$q8GYsGm65PGbNS2_ARhKG8wvltE implements c {
    private final /* synthetic */ Emitter f$0;

    public /* synthetic */ $$Lambda$q8GYsGm65PGbNS2_ARhKG8wvltE(Emitter emitter) {
        this.f$0 = emitter;
    }

    public final void onFlagsChanged(fqn fqn) {
        this.f$0.onNext(fqn);
    }
}
