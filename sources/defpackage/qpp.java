package defpackage;

import com.spotify.mobile.android.connect.ConnectManager;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;

/* renamed from: qpp reason: default package */
public final class qpp {
    private final ConnectManager a;

    public qpp(ConnectManager connectManager) {
        this.a = connectManager;
    }

    public final Observable<String> a() {
        return this.a.e().a((Function<? super T, ? extends ObservableSource<? extends R>>) $$Lambda$k5IFIFh2b0rvliibq9wFIyISHk.INSTANCE, false).a((Predicate<? super T>) $$Lambda$Tdc3bjCzDZTWINTQgSFviYnYj4U.INSTANCE).c((Function<? super T, ? extends R>) $$Lambda$gZXYrhn33UsCbanix92uQ8dqvK4.INSTANCE);
    }
}
