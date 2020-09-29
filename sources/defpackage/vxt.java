package defpackage;

import com.spotify.libs.signup.validators.AgeValidator;
import com.spotify.libs.signup.validators.AgeValidator.AgeVerification;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Calendar;

/* renamed from: vxt reason: default package */
public final class vxt {
    private final wan a;
    private final AgeValidator b;
    private final vxv c;

    public vxt(wan wan, AgeValidator ageValidator, vxv vxv) {
        this.a = wan;
        this.b = ageValidator;
        this.c = vxv;
    }

    /* access modifiers changed from: private */
    public vxn a(c cVar) {
        new jtp();
        Calendar instance = Calendar.getInstance();
        instance.set(cVar.a, cVar.b, cVar.c);
        AgeVerification a2 = this.b.a(instance);
        if (a2 != AgeVerification.OK) {
            return a2 == AgeVerification.TOO_YOUNG ? vxn.a(cVar.a, cVar.b, cVar.c, vxq.a(new b())) : a2 == AgeVerification.BAD_AGE ? vxn.a(cVar.a, cVar.b, cVar.c, vxq.a(new a())) : vxn.a(cVar.a, cVar.b, cVar.c, vxq.a(new c()));
        }
        if (cVar.d) {
            this.a.b();
        }
        return vxn.a(cVar.a, cVar.b, cVar.c, new c());
    }

    /* access modifiers changed from: private */
    public void a(b bVar) {
        this.c.a(bVar.a, bVar.b, bVar.c);
    }

    public final ObservableTransformer<vxm, vxn> a() {
        wan wan = this.a;
        wan.getClass();
        return kok.a().a(a.class, (Action) new $$Lambda$EB8L1MCRVraCQV6HHmLkjEBHvM4(wan), AndroidSchedulers.a()).a(c.class, (Function<G, E>) new $$Lambda$vxt$MZM9Mlu83cRoPaFjgzyu7YljLI<G,E>(this)).a(b.class, (Consumer<G>) new $$Lambda$vxt$rUxLGvntVIW51BEp58YE3k1lro<G>(this), AndroidSchedulers.a()).a();
    }
}
