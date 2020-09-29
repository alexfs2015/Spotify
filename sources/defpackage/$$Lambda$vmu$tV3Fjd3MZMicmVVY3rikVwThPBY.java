package defpackage;

import com.spotify.libs.signup.validators.PasswordValidator;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vmu$tV3Fjd3MZMicmVVY3rikVwThPBY reason: invalid class name and default package */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$vmu$tV3Fjd3MZMicmVVY3rikVwThPBY implements ObservableTransformer {
    private final /* synthetic */ PasswordValidator f$0;

    public /* synthetic */ $$Lambda$vmu$tV3Fjd3MZMicmVVY3rikVwThPBY(PasswordValidator passwordValidator) {
        this.f$0 = passwordValidator;
    }

    public final ObservableSource apply(Observable observable) {
        return observable.c((Function<? super T, ? extends R>) new $$Lambda$vmu$q25Y4eBak_79Y6ikadeP7WMd6iQ<Object,Object>(this.f$0));
    }
}
