package defpackage;

import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.parser.JacksonResponseParser;
import com.spotify.music.sociallistening.model.Notification;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;

/* renamed from: upc reason: default package */
public final class upc {
    public static Observable<uow> a(RxResolver rxResolver, rwi rwi, Scheduler scheduler) {
        return rxResolver.resolve(new Request(Request.SUB, "sp://server-push/notifications?ident=social-connect:session")).a((Predicate<? super T>) $$Lambda$upc$BfjD05jFUp98GCT9kvpIkfXQcUQ.INSTANCE).a((ObservableTransformer<? super T, ? extends R>) JacksonResponseParser.forClass(Notification.class, rwi.a(), scheduler)).c((Function<? super T, ? extends R>) $$Lambda$kZaa6l7rwFZy6WYpQ33147M19qA.INSTANCE).a((Consumer<? super Throwable>) $$Lambda$upc$mx7kBRWYrPmmWQYxQHBc65nzJQ.INSTANCE).d((ObservableSource<? extends T>) Observable.d());
    }

    public static Observable<uow> a(hxx hxx) {
        return hxx.a.c((Function<? super T, ? extends R>) $$Lambda$DtEvfn0Icv19eGJW_fHdFkt5y4.INSTANCE).a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$1o3M6gpxL3i0UzUtOlOHMUZRAw.INSTANCE).j().a((Consumer<? super Throwable>) $$Lambda$upc$fByY8y6QCa4kjSt6SiZdxDgGPO0.INSTANCE).d((ObservableSource<? extends T>) Observable.d());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Response response) {
        return response.getStatus() == 200 && response.getBody().length > 0;
    }
}
