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

/* renamed from: uch reason: default package */
public final class uch {
    public static Observable<ucb> a(RxResolver rxResolver, rnc rnc, Scheduler scheduler) {
        return rxResolver.resolve(new Request(Request.SUB, "sp://server-push/notifications?ident=social-connect:session")).a((Predicate<? super T>) $$Lambda$uch$wvmU7VKBvqBOo_ATDZDFzXJRo.INSTANCE).a((ObservableTransformer<? super T, ? extends R>) JacksonResponseParser.forClass(Notification.class, rnc.a(), scheduler)).c((Function<? super T, ? extends R>) $$Lambda$ZKsYY1xB0i7_zX13EB5388Qi_b4.INSTANCE).a((Consumer<? super Throwable>) $$Lambda$uch$BcamXHw81gYmoLbW5tYKopjJz8.INSTANCE).d((ObservableSource<? extends T>) Observable.d());
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(Response response) {
        return response.getStatus() == 200 && response.getBody().length > 0;
    }

    public static Observable<ucb> a(hvl hvl) {
        return hvl.a.c((Function<? super T, ? extends R>) $$Lambda$DtEvfn0Icv19eGJW_fHdFkt5y4.INSTANCE).a(Functions.a()).c((Function<? super T, ? extends R>) $$Lambda$I81sMTmwlFcdPvi6z7iUQ8EthFU.INSTANCE).j().a((Consumer<? super Throwable>) $$Lambda$uch$ifSVY57FjpeLaNPBYBInK5LLFzE.INSTANCE).d((ObservableSource<? extends T>) Observable.d());
    }
}
