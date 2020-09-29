package defpackage;

import com.spotify.music.features.profile.proto.ProfileChangeDisplaynameRequest.ChangeDisplayNameRequest;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$pqs$8Cc8ZcP4m_czR-ak2WmDuKbkqPg reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$pqs$8Cc8ZcP4m_czRak2WmDuKbkqPg implements Function {
    private final /* synthetic */ pqw f$0;
    private final /* synthetic */ Scheduler f$1;

    public /* synthetic */ $$Lambda$pqs$8Cc8ZcP4m_czRak2WmDuKbkqPg(pqw pqw, Scheduler scheduler) {
        this.f$0 = pqw;
        this.f$1 = scheduler;
    }

    public final Object apply(Object obj) {
        return this.f$0.a((ChangeDisplayNameRequest) ChangeDisplayNameRequest.k().a(((b) obj).a).b(((b) obj).b).g()).a(this.f$1).f($$Lambda$pqs$e_2NPQitMTKxnVzKV4jQAzAPol4.INSTANCE).d();
    }
}
