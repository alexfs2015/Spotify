package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat.a;
import com.spotify.base.java.logging.Logger;
import io.reactivex.Single;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: scz reason: default package */
public final class scz extends a {
    final CompositeDisposable c = new CompositeDisposable();
    boolean d;
    private final sdb e;

    public scz(sdb sdb) {
        this.e = (sdb) fbp.a(sdb);
    }

    /* access modifiers changed from: private */
    public static void a(Throwable th) {
        Logger.e(th, "Failed to resolve MediaSessionCallbackHandler", new Object[0]);
    }

    public final void a(int i) {
        this.c.a(this.e.a(Long.valueOf(262144)).a((Consumer<? super T>) new $$Lambda$scz$iXlLQnHOf1u7y3eA1br8ezqsdss<Object>(i), (Consumer<? super Throwable>) $$Lambda$scz$nd_X_fu7bsxcW1YFAETlTZ4LHR8.INSTANCE));
    }

    public final void a(long j) {
        this.c.a(this.e.a(Long.valueOf(4096)).a((Consumer<? super T>) new $$Lambda$scz$iift6y2eWU1WiIefuQMKvZi0Z4<Object>(j), (Consumer<? super Throwable>) $$Lambda$scz$nd_X_fu7bsxcW1YFAETlTZ4LHR8.INSTANCE));
    }

    public final void a(Uri uri, Bundle bundle) {
        this.c.a(this.e.a(Long.valueOf(131072)).a(this.e.a("com.google.android.googlequicksearchbox", "default")).a((Consumer<? super T>) new $$Lambda$scz$WabZV9X7posRnUG2a6tn9K916s<Object>(uri, bundle), (Consumer<? super Throwable>) $$Lambda$scz$nd_X_fu7bsxcW1YFAETlTZ4LHR8.INSTANCE));
    }

    public final void a(RatingCompat ratingCompat) {
        this.c.a(this.e.a(Long.valueOf(128)).a(this.e.a("com.google.android.googlequicksearchbox", "default")).a((Consumer<? super T>) new $$Lambda$scz$eDMW0J1OlKk_QlRK0NgaETcItU<Object>(ratingCompat), (Consumer<? super Throwable>) $$Lambda$scz$nd_X_fu7bsxcW1YFAETlTZ4LHR8.INSTANCE));
    }

    public final void a(String str, Bundle bundle) {
        this.c.a(this.e.a(Long.valueOf(1024)).a((Consumer<? super T>) new $$Lambda$scz$8cKHplSTQaDeWMHHtWetUxy4y0<Object>(str, bundle), (Consumer<? super Throwable>) $$Lambda$scz$nd_X_fu7bsxcW1YFAETlTZ4LHR8.INSTANCE));
    }

    public final void b() {
        this.c.a(this.e.a(Long.valueOf(4)).a((Consumer<? super T>) $$Lambda$V4Xtmd1GMbJyXQKq1pacopf0rQ0.INSTANCE, (Consumer<? super Throwable>) $$Lambda$scz$nd_X_fu7bsxcW1YFAETlTZ4LHR8.INSTANCE));
    }

    public final void b(int i) {
        this.c.a(this.e.a(Long.valueOf(2097152)).a(this.e.a("com.google.android.googlequicksearchbox", "default")).a((Consumer<? super T>) new $$Lambda$scz$m1O4o2V5hadkCjCLgZNFarcKfsU<Object>(i), (Consumer<? super Throwable>) $$Lambda$scz$nd_X_fu7bsxcW1YFAETlTZ4LHR8.INSTANCE));
    }

    public final void b(long j) {
        this.c.a(this.e.a(Long.valueOf(256)).a((Consumer<? super T>) new $$Lambda$scz$08dQ2WvEWivs4C_6s5gSdW3no<Object>(j), (Consumer<? super Throwable>) $$Lambda$scz$nd_X_fu7bsxcW1YFAETlTZ4LHR8.INSTANCE));
    }

    public final void b(Uri uri, Bundle bundle) {
        this.c.a(this.e.a(Long.valueOf(8192)).a(this.e.a("com.google.android.googlequicksearchbox", "default")).a((Consumer<? super T>) new $$Lambda$scz$msnHkNAcH98q391l7i1oGcODcAw<Object>(uri, bundle), (Consumer<? super Throwable>) $$Lambda$scz$nd_X_fu7bsxcW1YFAETlTZ4LHR8.INSTANCE));
    }

    public final void b(String str, Bundle bundle) {
        this.c.a(this.e.a(Long.valueOf(2048)).a((Consumer<? super T>) new $$Lambda$scz$53_K_jjC4jFKcnTWhj4mz3fvJmA<Object>(str, bundle), (Consumer<? super Throwable>) $$Lambda$scz$nd_X_fu7bsxcW1YFAETlTZ4LHR8.INSTANCE));
    }

    public final void c() {
        this.c.a(this.e.a(Long.valueOf(2)).a((Consumer<? super T>) $$Lambda$IInouZlHUOCfwqyXrRP4z6hbRAQ.INSTANCE, (Consumer<? super Throwable>) $$Lambda$scz$nd_X_fu7bsxcW1YFAETlTZ4LHR8.INSTANCE));
    }

    public final void c(String str, Bundle bundle) {
        Single single;
        sdb sdb = this.e;
        ArrayList a = sdb.b.a();
        if (a.isEmpty()) {
            single = Single.a(new Throwable("No active CallbackHandlers found"));
        } else {
            if (a.size() > 1) {
                Collections.sort(sdb.b.a(), sdb.a);
            }
            single = Single.b(((scw) sdb.b.a().get(0)).e());
        }
        this.c.a(single.a((Consumer<? super T>) new $$Lambda$scz$ebIJiVF2314qHKLgdFGWMPKTw64<Object>(str, bundle), (Consumer<? super Throwable>) $$Lambda$scz$nd_X_fu7bsxcW1YFAETlTZ4LHR8.INSTANCE));
    }

    public final void d() {
        this.c.a(this.e.a(Long.valueOf(32)).a((Consumer<? super T>) $$Lambda$TuFpYVO5ViKlrvJXuckiWEp8La8.INSTANCE, (Consumer<? super Throwable>) $$Lambda$scz$nd_X_fu7bsxcW1YFAETlTZ4LHR8.INSTANCE));
    }

    public final void e() {
        this.c.a(this.e.a(Long.valueOf(16)).a((Consumer<? super T>) $$Lambda$tfEedixE9n9fkqpofVhxjX6rMNI.INSTANCE, (Consumer<? super Throwable>) $$Lambda$scz$nd_X_fu7bsxcW1YFAETlTZ4LHR8.INSTANCE));
    }

    public final void f() {
        this.c.a(this.e.a(Long.valueOf(1)).a((Consumer<? super T>) $$Lambda$bVBUOotyQnl7z_XlABmY7ZIfqEQ.INSTANCE, (Consumer<? super Throwable>) $$Lambda$scz$nd_X_fu7bsxcW1YFAETlTZ4LHR8.INSTANCE));
    }
}
