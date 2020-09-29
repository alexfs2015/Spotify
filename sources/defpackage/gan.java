package defpackage;

import com.spotify.mobile.android.service.session.SessionState;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.Functions;

/* renamed from: gan reason: default package */
public final class gan {
    public static <E> Observable<E> a(Observable<SessionState> observable, Function<Boolean, E> function) {
        return observable.c((Function<? super T, ? extends R>) $$Lambda$vBAchyDs5cF2YASEAOsxlt4ggc.INSTANCE).a(Functions.a()).c(function);
    }
}
