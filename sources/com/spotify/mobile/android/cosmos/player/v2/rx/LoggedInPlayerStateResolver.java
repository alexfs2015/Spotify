package com.spotify.mobile.android.cosmos.player.v2.rx;

import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

public class LoggedInPlayerStateResolver implements PlayerStateResolver {
    private final Observable<Boolean> mLoggedIn;
    private final PlayerStateResolver mPlayerStateResolver;

    public LoggedInPlayerStateResolver(Observable<Boolean> observable, CosmosPlayerStateResolver cosmosPlayerStateResolver) {
        this.mLoggedIn = observable;
        this.mPlayerStateResolver = cosmosPlayerStateResolver;
    }

    public Observable<PlayerState> createPlayerStateObservable(String str, int i, int i2) {
        if (Request.SUB.equals(str)) {
            return this.mLoggedIn.a(Functions.a()).h(new Function(str, i, i2) {
                private final /* synthetic */ String f$1;
                private final /* synthetic */ int f$2;
                private final /* synthetic */ int f$3;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                    this.f$3 = r4;
                }

                public final Object apply(Object obj) {
                    return LoggedInPlayerStateResolver.this.lambda$createPlayerStateObservable$0$LoggedInPlayerStateResolver(this.f$1, this.f$2, this.f$3, (Boolean) obj);
                }
            });
        }
        return this.mLoggedIn.b((Predicate<? super T>) $$Lambda$LoggedInPlayerStateResolver$pOMWAus6asJE9dL77nwejVb_vg4.INSTANCE).c(1).a((Function<? super T, ? extends ObservableSource<? extends R>>) new Function(str, i, i2) {
            private final /* synthetic */ String f$1;
            private final /* synthetic */ int f$2;
            private final /* synthetic */ int f$3;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
            }

            public final Object apply(Object obj) {
                return LoggedInPlayerStateResolver.this.lambda$createPlayerStateObservable$2$LoggedInPlayerStateResolver(this.f$1, this.f$2, this.f$3, (Boolean) obj);
            }
        }, false).c(1);
    }

    public /* synthetic */ ObservableSource lambda$createPlayerStateObservable$0$LoggedInPlayerStateResolver(String str, int i, int i2, Boolean bool) {
        if (bool.booleanValue()) {
            return this.mPlayerStateResolver.createPlayerStateObservable(str, i, i2);
        }
        return Observable.d();
    }

    static /* synthetic */ boolean lambda$createPlayerStateObservable$1(Boolean bool) {
        return !bool.booleanValue();
    }

    public /* synthetic */ ObservableSource lambda$createPlayerStateObservable$2$LoggedInPlayerStateResolver(String str, int i, int i2, Boolean bool) {
        return this.mPlayerStateResolver.createPlayerStateObservable(str, i, i2);
    }
}
