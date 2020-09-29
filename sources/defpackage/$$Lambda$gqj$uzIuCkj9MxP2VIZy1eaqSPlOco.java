package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$gqj$uzIuCkj-9MxP2VIZy1eaqSPlOco reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$gqj$uzIuCkj9MxP2VIZy1eaqSPlOco implements Function {
    private final /* synthetic */ PasswordValidator f$0;

    public /* synthetic */ $$Lambda$gqj$uzIuCkj9MxP2VIZy1eaqSPlOco(PasswordValidator passwordValidator) {
        this.f$0 = passwordValidator;
    }

    public final Object apply(Object obj) {
        return Observable.b(this.f$0.a(((d) obj).a)).c((Function<? super T, ? extends R>) new $$Lambda$gqj$HVcdjQmgTYrA61rq_p2K3ksgAs<Object,Object>((d) obj)).e((Function<? super Throwable, ? extends T>) new $$Lambda$gqj$YCdu6TpDtxMf0x_cw5kc257YQ<Object,Object>((d) obj));
    }
}
