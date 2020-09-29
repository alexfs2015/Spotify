package defpackage;

import com.spotify.music.features.profile.domain.ProfileModel;
import io.reactivex.Scheduler;

/* renamed from: pji reason: default package */
public final class pji {
    private final pju a;
    private final kxz b;
    private final Scheduler c;
    private final pjj d;

    public pji(pju pju, kxz kxz, Scheduler scheduler, pjj pjj) {
        this.a = pju;
        this.b = kxz;
        this.c = scheduler;
        this.d = pjj;
    }

    /* access modifiers changed from: 0000 */
    public c<ProfileModel, pjr, pjq> a() {
        return klb.a((kjz<M, E, F>) $$Lambda$X8FOMSmPXKkVniSXpCqCx0PIN4.INSTANCE, pjt.a(this.a, this.c, this.d)).a((kjo<M, F>) $$Lambda$FBipFlXliTA_IVe4HldQ88as6OQ.INSTANCE).a(pjv.a(this.b)).a(kkh.a("profile"));
    }
}
