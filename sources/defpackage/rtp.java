package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat.a;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.service.media.browser.RootListType;
import com.spotify.music.libs.mediabrowserservice.MediaSessionCallbackResolver;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: rtp reason: default package */
public final class rtp extends a {
    final CompositeDisposable c = new CompositeDisposable();
    boolean d;
    private final MediaSessionCallbackResolver e;

    public rtp(MediaSessionCallbackResolver mediaSessionCallbackResolver) {
        this.e = (MediaSessionCallbackResolver) fay.a(mediaSessionCallbackResolver);
    }

    public final void c(String str, Bundle bundle) {
        Single single;
        MediaSessionCallbackResolver mediaSessionCallbackResolver = this.e;
        ArrayList a = mediaSessionCallbackResolver.b.a();
        if (a.isEmpty()) {
            single = Single.a(new Throwable("No active CallbackHandlers found"));
        } else {
            if (a.size() > 1) {
                Collections.sort(mediaSessionCallbackResolver.b.a(), mediaSessionCallbackResolver.a);
            }
            single = Single.b(((rtm) mediaSessionCallbackResolver.b.a().get(0)).e());
        }
        this.c.a(single.a((Consumer<? super T>) new $$Lambda$rtp$x14sriF7B6flzzDEW09W4rsa0OI<Object>(str, bundle), (Consumer<? super Throwable>) $$Lambda$rtp$M1gGo0EjPmY_zmoj7hG0GEOlTTg.INSTANCE));
    }

    public final void c() {
        this.c.a(this.e.a(Long.valueOf(2)).a((Consumer<? super T>) $$Lambda$Qs9_O0cEHjTdNV_3NLSeGPqeDYU.INSTANCE, (Consumer<? super Throwable>) $$Lambda$rtp$M1gGo0EjPmY_zmoj7hG0GEOlTTg.INSTANCE));
    }

    public final void f() {
        this.c.a(this.e.a(Long.valueOf(1)).a((Consumer<? super T>) $$Lambda$UcV6JYNeZxSk118WdNUTCIFkDSQ.INSTANCE, (Consumer<? super Throwable>) $$Lambda$rtp$M1gGo0EjPmY_zmoj7hG0GEOlTTg.INSTANCE));
    }

    public final void a(String str, Bundle bundle) {
        this.c.a(this.e.a(Long.valueOf(1024)).a((Consumer<? super T>) new $$Lambda$rtp$4S4NlEsBRc79e2bcN4scLHK33zo<Object>(str, bundle), (Consumer<? super Throwable>) $$Lambda$rtp$M1gGo0EjPmY_zmoj7hG0GEOlTTg.INSTANCE));
    }

    public final void b() {
        this.c.a(this.e.a(Long.valueOf(4)).a((Consumer<? super T>) $$Lambda$RmXazNhlE4XSbCWYfhX5kN1xlFo.INSTANCE, (Consumer<? super Throwable>) $$Lambda$rtp$M1gGo0EjPmY_zmoj7hG0GEOlTTg.INSTANCE));
    }

    public final void b(String str, Bundle bundle) {
        this.c.a(this.e.a(Long.valueOf(2048)).a((Consumer<? super T>) new $$Lambda$rtp$mTJ1CwHFJBozeyhg2H3jqsiseak<Object>(str, bundle), (Consumer<? super Throwable>) $$Lambda$rtp$M1gGo0EjPmY_zmoj7hG0GEOlTTg.INSTANCE));
    }

    public final void a(int i) {
        this.c.a(this.e.a(Long.valueOf(262144)).a((Consumer<? super T>) new $$Lambda$rtp$E0KcGn4IJQmR9iLn1_LWu08Do<Object>(i), (Consumer<? super Throwable>) $$Lambda$rtp$M1gGo0EjPmY_zmoj7hG0GEOlTTg.INSTANCE));
    }

    public final void b(Uri uri, Bundle bundle) {
        this.c.a(this.e.a(Long.valueOf(8192)).a(this.e.a("com.google.android.googlequicksearchbox", RootListType.DEFAULT)).a((Consumer<? super T>) new $$Lambda$rtp$ONMObmydlOunVm2bWZwrzFqlHmY<Object>(uri, bundle), (Consumer<? super Throwable>) $$Lambda$rtp$M1gGo0EjPmY_zmoj7hG0GEOlTTg.INSTANCE));
    }

    public final void a(Uri uri, Bundle bundle) {
        this.c.a(this.e.a(Long.valueOf(131072)).a(this.e.a("com.google.android.googlequicksearchbox", RootListType.DEFAULT)).a((Consumer<? super T>) new $$Lambda$rtp$os6MS1GGtsc1lAykOUIHCrg03Ho<Object>(uri, bundle), (Consumer<? super Throwable>) $$Lambda$rtp$M1gGo0EjPmY_zmoj7hG0GEOlTTg.INSTANCE));
    }

    public final void a(RatingCompat ratingCompat) {
        this.c.a(this.e.a(Long.valueOf(128)).a(this.e.a("com.google.android.googlequicksearchbox", RootListType.DEFAULT)).a((Consumer<? super T>) new $$Lambda$rtp$Jm4l18QVJYZTtjrWtbR2WY9xhc<Object>(ratingCompat), (Consumer<? super Throwable>) $$Lambda$rtp$M1gGo0EjPmY_zmoj7hG0GEOlTTg.INSTANCE));
    }

    public final void b(int i) {
        this.c.a(this.e.a(Long.valueOf(2097152)).a(this.e.a("com.google.android.googlequicksearchbox", RootListType.DEFAULT)).a((Consumer<? super T>) new $$Lambda$rtp$xuRaksWFSFXwi4gJy7hL5jWM1ro<Object>(i), (Consumer<? super Throwable>) $$Lambda$rtp$M1gGo0EjPmY_zmoj7hG0GEOlTTg.INSTANCE));
    }

    public final void d() {
        this.c.a(this.e.a(Long.valueOf(32)).a((Consumer<? super T>) $$Lambda$LFgNNbxF0Abm1cgHqIGg3ZzpYU4.INSTANCE, (Consumer<? super Throwable>) $$Lambda$rtp$M1gGo0EjPmY_zmoj7hG0GEOlTTg.INSTANCE));
    }

    public final void e() {
        this.c.a(this.e.a(Long.valueOf(16)).a((Consumer<? super T>) $$Lambda$QawDF7kGER_A5ZxUJs0kiQwUrBE.INSTANCE, (Consumer<? super Throwable>) $$Lambda$rtp$M1gGo0EjPmY_zmoj7hG0GEOlTTg.INSTANCE));
    }

    public final void a(long j) {
        this.c.a(this.e.a(Long.valueOf(4096)).a((Consumer<? super T>) new $$Lambda$rtp$FVqqdFvaJSThWMG_zdaNKnvBuEE<Object>(j), (Consumer<? super Throwable>) $$Lambda$rtp$M1gGo0EjPmY_zmoj7hG0GEOlTTg.INSTANCE));
    }

    public final void b(long j) {
        this.c.a(this.e.a(Long.valueOf(256)).a((Consumer<? super T>) new $$Lambda$rtp$xwT01a5QzB3suTdfW3C1FD5Xbt8<Object>(j), (Consumer<? super Throwable>) $$Lambda$rtp$M1gGo0EjPmY_zmoj7hG0GEOlTTg.INSTANCE));
    }

    /* access modifiers changed from: private */
    public static void a(Throwable th) {
        Logger.e(th, "Failed to resolve MediaSessionCallbackHandler", new Object[0]);
    }
}
