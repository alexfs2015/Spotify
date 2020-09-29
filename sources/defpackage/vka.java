package defpackage;

import android.content.Context;
import com.spotify.libs.signup.validators.AgeValidator;
import com.spotify.libs.signup.validators.PasswordValidator;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;
import java.util.Calendar;

/* renamed from: vka reason: default package */
public final class vka {
    private final vlg a;
    private final PublishSubject<Boolean> b;
    private final Observable<Boolean> c;
    private final vjy d;
    private final vjz e;

    public vka(ka kaVar, vnj vnj, PublishSubject<Boolean> publishSubject, vju vju, PasswordValidator passwordValidator, gmx gmx, vjy vjy, vni vni, gne gne, vjz vjz, vkq vkq) {
        vnj vnj2 = vnj;
        this.b = publishSubject;
        this.c = jto.a((Context) kaVar).e(Boolean.valueOf(jto.c(kaVar)));
        vjy vjy2 = vjy;
        this.d = vjy2;
        this.e = vjz;
        new jrf();
        AgeValidator ageValidator = new AgeValidator(Calendar.getInstance());
        vnj vnj3 = vnj;
        vlo vlo = new vlo(new vlq(vju), vjy2, vnj3, vnj2.a, vnj2.d, vni);
        vmu vmu = new vmu(passwordValidator, gmx, vnj3, vnj, vkq.a());
        vlg vlg = new vlg(vlo, vmu, new vkn(vnj2, ageValidator, vnj2.c), new vmb(vnj2), new vmk(), vnj, kaVar, vju, ageValidator, vni, gne, this.d);
        this.a = vlg;
    }

    public c<vlf, vld, vlc> a() {
        return klb.a(vle.a(vle.a(), vle.b(), vle.c(), vle.d(), vle.e()), this.a.a()).a(this.d.b, c(), b()).a((d<M, E, F>) this.e).a((kjo<M, F>) $$Lambda$jybkDh2QnrHug5hTrqL2_QfR5I.INSTANCE);
    }

    private kjm<vld> b() {
        return kla.a(this.c.a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$vka$rWOIggjFEW_bws0biJ8YKFkeNxI.INSTANCE, false));
    }

    private kjm<vld> c() {
        return kla.a(this.b.c((Function<? super T, ? extends R>) $$Lambda$vka$img9Xz9VYHcbRZmxocAgyIs7g.INSTANCE));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ vld a(Boolean bool) {
        return new i();
    }
}
