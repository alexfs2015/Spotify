package defpackage;

import com.spotify.signup.api.services.model.EmailSignupResponse;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/* renamed from: -$$Lambda$vym$xpUBBUmndv61nNyYlCVcoSs0YBA reason: invalid class name and default package */
public final /* synthetic */ class $$Lambda$vym$xpUBBUmndv61nNyYlCVcoSs0YBA implements Function {
    public static final /* synthetic */ $$Lambda$vym$xpUBBUmndv61nNyYlCVcoSs0YBA INSTANCE = new $$Lambda$vym$xpUBBUmndv61nNyYlCVcoSs0YBA();

    private /* synthetic */ $$Lambda$vym$xpUBBUmndv61nNyYlCVcoSs0YBA() {
    }

    public final Object apply(Object obj) {
        return Observable.b(vyj.a(((EmailSignupResponse) obj).status()));
    }
}
