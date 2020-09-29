package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$gou$iB-UO1-rt-dEKsvigm6XZM4ohTY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$gou$iBUO1rtdEKsvigm6XZM4ohTY implements Function {
    private final /* synthetic */ PasswordValidator f$0;

    public /* synthetic */ $$Lambda$gou$iBUO1rtdEKsvigm6XZM4ohTY(PasswordValidator passwordValidator) {
        this.f$0 = passwordValidator;
    }

    public final Object apply(Object obj) {
        return Observable.b(this.f$0.a(((d) obj).a)).c((Function<? super T, ? extends R>) new $$Lambda$gou$5nM0cYPVEsM_OyGgBG_AWrxD2_0<Object,Object>((d) obj)).e((Function<? super Throwable, ? extends T>) new $$Lambda$gou$uB64bwrr1T6aitNFEByktbHnB2g<Object,Object>((d) obj));
    }
}
