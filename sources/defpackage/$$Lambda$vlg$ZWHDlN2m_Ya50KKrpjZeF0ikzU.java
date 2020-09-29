package defpackage;

import com.spotify.libs.signup.validators.AgeValidator;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vlg$ZWHDlN2m_Ya50KKr-pjZeF0ikzU reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$vlg$ZWHDlN2m_Ya50KKrpjZeF0ikzU implements ObservableTransformer {
    private final /* synthetic */ vju f$0;
    private final /* synthetic */ AgeValidator f$1;

    public /* synthetic */ $$Lambda$vlg$ZWHDlN2m_Ya50KKrpjZeF0ikzU(vju vju, AgeValidator ageValidator) {
        this.f$0 = vju;
        this.f$1 = ageValidator;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$vlg$Tv5C6EyMeOPRjoHbCbboxslfUk<Object,Object>(this.f$0, this.f$1), false);
    }
}
