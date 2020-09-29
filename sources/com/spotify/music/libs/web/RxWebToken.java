package com.spotify.music.libs.web;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.cosmos.JacksonModel;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Scheduler;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.TimeUnit;

public final class RxWebToken {
    private final gky<TokenResponse> a;
    private final Scheduler b;

    static class TokenResponse implements JacksonModel {
        public String token;

        TokenResponse() {
        }
    }

    public RxWebToken(gkz gkz, Scheduler scheduler) {
        this(gkz.a(TokenResponse.class), scheduler);
    }

    public RxWebToken(RxResolver rxResolver, Scheduler scheduler, Scheduler scheduler2, rnf rnf) {
        this((gky<TokenResponse>) new glb<TokenResponse>(TokenResponse.class, rnf.b(), rxResolver, scheduler2), scheduler);
    }

    private RxWebToken(gky<TokenResponse> gky, Scheduler scheduler) {
        this.a = gky;
        this.b = scheduler;
    }

    public final Observable<Uri> a(Uri uri) {
        Observable c = vun.b(this.a.resolve(new Request(Request.GET, String.format("sp://auth/v2/web_token?uri=%s", new Object[]{Uri.encode(uri.toString())})))).c((Function<? super T, ? extends R>) new Function(uri) {
            private final /* synthetic */ Uri f$0;

            {
                this.f$0 = r1;
            }

            public final Object apply(Object obj) {
                return RxWebToken.a(this.f$0, (TokenResponse) obj);
            }
        });
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Scheduler scheduler = this.b;
        Observable b2 = Observable.b(uri);
        ObjectHelper.a(b2, "other is null");
        return c.a(3, timeUnit, (ObservableSource<? extends T>) b2, scheduler);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Uri a(Uri uri, TokenResponse tokenResponse) {
        String str = tokenResponse.token;
        Builder buildUpon = uri.buildUpon();
        if (!TextUtils.isEmpty(str)) {
            buildUpon.appendQueryParameter("oauth_token", str);
        }
        Uri build = buildUpon.build();
        Logger.b("Base Url:%s", uri);
        Logger.b("Token: %s", str);
        Logger.b("Url to open: %s", build);
        return build;
    }
}
