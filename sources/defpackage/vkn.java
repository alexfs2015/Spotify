package defpackage;

import com.spotify.libs.signup.validators.AgeValidator;
import com.spotify.libs.signup.validators.AgeValidator.AgeVerification;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import java.util.Calendar;

/* renamed from: vkn reason: default package */
public final class vkn {
    private final vnh a;
    private final AgeValidator b;
    private final vkp c;

    public vkn(vnh vnh, AgeValidator ageValidator, vkp vkp) {
        this.a = vnh;
        this.b = ageValidator;
        this.c = vkp;
    }

    public final ObservableTransformer<vkg, vkh> a() {
        vnh vnh = this.a;
        vnh.getClass();
        return klb.a().a(a.class, (Action) new $$Lambda$QPea7LreyfRkCdCsUgpD7BzFUag(vnh), AndroidSchedulers.a()).a(c.class, (Function<G, E>) new $$Lambda$vkn$3XXA6ZsYe6o4nQhm0QY8LeoX7uk<G,E>(this)).a(b.class, (Consumer<G>) new $$Lambda$vkn$Chm6Rj7Tw4m_osNZ2eyE5JhOOU<G>(this), AndroidSchedulers.a()).a();
    }

    /* access modifiers changed from: private */
    public void a(b bVar) {
        this.c.a(bVar.a, bVar.b, bVar.c);
    }

    /* access modifiers changed from: private */
    public vkh a(c cVar) {
        new jrf();
        Calendar instance = Calendar.getInstance();
        instance.set(cVar.a, cVar.b, cVar.c);
        AgeVerification a2 = this.b.a(instance);
        if (a2 == AgeVerification.OK) {
            if (cVar.d) {
                this.a.b();
            }
            return vkh.a(cVar.a, cVar.b, cVar.c, new c());
        } else if (a2 == AgeVerification.TOO_YOUNG) {
            return vkh.a(cVar.a, cVar.b, cVar.c, vkk.a(new b()));
        } else {
            if (a2 == AgeVerification.BAD_AGE) {
                return vkh.a(cVar.a, cVar.b, cVar.c, vkk.a(new a()));
            }
            return vkh.a(cVar.a, cVar.b, cVar.c, vkk.a(new c()));
        }
    }
}
