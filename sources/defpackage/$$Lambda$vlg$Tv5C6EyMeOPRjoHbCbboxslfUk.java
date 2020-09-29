package defpackage;

import com.spotify.libs.signup.validators.AgeValidator;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vlg$Tv5C6EyMeOPR-joHbCbboxslfUk reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$vlg$Tv5C6EyMeOPRjoHbCbboxslfUk implements Function {
    private final /* synthetic */ vju f$0;
    private final /* synthetic */ AgeValidator f$1;

    public /* synthetic */ $$Lambda$vlg$Tv5C6EyMeOPRjoHbCbboxslfUk(vju vju, AgeValidator ageValidator) {
        this.f$0 = vju;
        this.f$1 = ageValidator;
    }

    public final Object apply(Object obj) {
        return this.f$0.a().d().a((ObservableTransformer<? super T, ? extends R>) new viq<Object,Object>()).b((Consumer<? super T>) new $$Lambda$vlg$MhF55Bgll3K9GDx64k3I0kOL5A0<Object>(this.f$1)).a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$vlg$yl0XmUrY9WaOxOVLQlmyNBRqWnM.INSTANCE, false).d((ObservableSource<? extends T>) Observable.c());
    }
}
