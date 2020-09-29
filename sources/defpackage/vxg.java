package defpackage;

import android.content.Context;
import com.spotify.libs.signup.validators.AgeValidator;
import com.spotify.libs.signup.validators.PasswordValidator;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.subjects.PublishSubject;
import java.util.Calendar;

/* renamed from: vxg reason: default package */
public final class vxg {
    private final vym a;
    private final PublishSubject<Boolean> b;
    private final Observable<Boolean> c;
    private final vxe d;
    private final vxf e;

    public vxg(kf kfVar, wap wap, PublishSubject<Boolean> publishSubject, vxa vxa, PasswordValidator passwordValidator, gom gom, vxe vxe, wao wao, got got, vxf vxf, vxw vxw, gqm gqm) {
        wap wap2 = wap;
        this.b = publishSubject;
        this.c = jvw.a((Context) kfVar).e(Boolean.valueOf(jvw.c(kfVar)));
        vxe vxe2 = vxe;
        this.d = vxe2;
        this.e = vxf;
        new jtp();
        AgeValidator ageValidator = new AgeValidator(Calendar.getInstance());
        wap wap3 = wap;
        vyu vyu = new vyu(new vyw(vxa), vxe2, wap3, wap2.a, wap2.d, wao);
        waa waa = new waa(passwordValidator, gom, wap3, wap, vxw.a());
        vym vym = new vym(vyu, waa, new vxt(wap2, ageValidator, wap2.c), new vzh(wap2), new vzq(), wap, kfVar, vxa, ageValidator, wao, got, this.d, gqm);
        this.a = vym;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ vyj a(Boolean bool) {
        return new i();
    }

    private kmv<vyj> b() {
        return koj.a(this.c.a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$vxg$NXc438JFzkLAw6JDB1bbEDWl0c.INSTANCE, false));
    }

    private kmv<vyj> c() {
        return koj.a(this.b.c((Function<? super T, ? extends R>) $$Lambda$vxg$_pyMwZpN50aBDg01inpN2Qirhg.INSTANCE));
    }

    public c<vyl, vyj, vyi> a() {
        return kok.a(vyk.a(vyk.a(), vyk.b(), vyk.c(), vyk.d(), vyk.e()), this.a.a()).a(this.d.b, c(), b()).a((d<M, E, F>) this.e).a((kmx<M, F>) $$Lambda$Wgxm26YP00XJoku6nfYsvFrgN6o.INSTANCE);
    }
}
