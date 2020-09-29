package defpackage;

import com.spotify.mobile.android.service.feature.FeatureService.c;
import rx.Emitter;

/* renamed from: -$$Lambda$ZSzLtD190ZVmQI6TbA2yZ_wyJm4 reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$ZSzLtD190ZVmQI6TbA2yZ_wyJm4 implements c {
    private final /* synthetic */ Emitter f$0;

    public /* synthetic */ $$Lambda$ZSzLtD190ZVmQI6TbA2yZ_wyJm4(Emitter emitter) {
        this.f$0 = emitter;
    }

    public final void onFlagsChanged(fpt fpt) {
        this.f$0.onNext(fpt);
    }
}
