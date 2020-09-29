package defpackage;

import com.spotify.accountrecovery.api.models.SetPasswordErrorBody;
import com.spotify.libs.signup.validators.PasswordValidator;
import io.reactivex.Observable;
import io.reactivex.ObservableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;

/* renamed from: gou reason: default package */
public final class gou {
    public static ObservableTransformer<gop, goq> a(gov gov, ghm ghm, Observable<String> observable, goi goi, PasswordValidator passwordValidator) {
        return klb.a().a(c.class, (Consumer<G>) new $$Lambda$gou$mxJLkoSa7S3_XjcwPOoT1myknuQ<G>(gov), AndroidSchedulers.a()).a(d.class, (ObservableTransformer<G, E>) new $$Lambda$gou$0GFUKGJJy1uW9A_CxraygIR8w4I<G,E>(passwordValidator)).a(a.class, (ObservableTransformer<G, E>) new $$Lambda$gou$WSAXtr7fIJY7QwW4SSDj23S2Z8<G,E>(ghm, observable)).a(b.class, (Consumer<G>) new $$Lambda$gou$Nlm6Pqr1ItSPfkQwaqiKvVkc<G>(goi)).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ goq a(a aVar, gnw gnw) {
        if (gnw.a.a()) {
            return new f(aVar.a, gnw.b);
        }
        if (gnw.a.a.c != 400) {
            return goq.a(aVar.a, gnw.b, gor.a(String.valueOf(gnw.a.a.c)));
        }
        String str = null;
        wmg wmg = gnw.a.b;
        if (wmg != null) {
            SetPasswordErrorBody fromJson = SetPasswordErrorBody.fromJson(wmg.f());
            if (fromJson != null && fromJson.isRecoverable()) {
                str = fromJson.getMessage();
            }
        }
        if (str != null) {
            return goq.a(aVar.a, gnw.b, new a(str));
        }
        return goq.a(aVar.a, gnw.b, new b());
    }
}
