package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$gou$0GFUKGJJy1uW9A_CxraygIR8w4I reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$gou$0GFUKGJJy1uW9A_CxraygIR8w4I implements ObservableTransformer {
    private final /* synthetic */ PasswordValidator f$0;

    public /* synthetic */ $$Lambda$gou$0GFUKGJJy1uW9A_CxraygIR8w4I(PasswordValidator passwordValidator) {
        this.f$0 = passwordValidator;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.a((Function<? super T, ? extends ObservableSource<? extends R>>) new $$Lambda$gou$iBUO1rtdEKsvigm6XZM4ohTY<Object,Object>(this.f$0), false);
    }
}
