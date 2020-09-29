package defpackage;

import com.google.common.base.Optional;
import com.spotify.cosmos.router.Response;
import com.spotify.playlist.endpoints.exceptions.BadRequestException;
import com.spotify.playlist.endpoints.exceptions.InsufficientStorageException;
import com.spotify.playlist.endpoints.exceptions.NotFoundException;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import io.reactivex.functions.Function;

/* renamed from: vkd reason: default package */
public final class vkd {
    private static Optional<Exception> a(Response response) {
        int status = response.getStatus();
        return status != 400 ? status != 404 ? status != 507 ? Optional.e() : Optional.b(new InsufficientStorageException(response)) : Optional.b(new NotFoundException(response)) : Optional.b(new BadRequestException(response));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ ObservableSource a(fli fli, Response response) {
        Optional a = a(response);
        return a.b() ? Observable.a((Throwable) a.c()) : Observable.b(fli.c().a(response.getBody()));
    }

    public static <T extends fli> SingleTransformer<Response, ? extends fli> a(T t) {
        return new $$Lambda$vkd$uX6LGYdDBBZOU_F3F0_PcB73EnE(t);
    }

    public static Function<Response, Completable> a() {
        return $$Lambda$vkd$OmeKeEd1wAhMz3m5v9sJ3UW5hDg.INSTANCE;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Completable b(Response response) {
        Optional a = a(response);
        return a.b() ? Completable.a((Throwable) a.c()) : Completable.a();
    }

    public static <T extends fli> ObservableTransformer<Response, ? extends fli> b(T t) {
        return new $$Lambda$vkd$nTB5IoEcvwlUYyRjFjsMVJofTU(t);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ SingleSource b(fli fli, Response response) {
        Optional a = a(response);
        return a.b() ? Single.a((Throwable) a.c()) : Single.b(fli.c().a(response.getBody()));
    }
}
