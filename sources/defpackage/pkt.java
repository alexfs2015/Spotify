package defpackage;

import com.spotify.localization.SpotifyLocale;
import com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.Channel;
import com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.a;
import com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.b;
import com.spotify.music.features.pushnotifications.inapppreference.model.Category;
import io.reactivex.Completable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: pkt reason: default package */
public final class pkt implements a {
    private final pkv a;
    private final List<String> b = new ArrayList();
    private b c;
    private CompositeDisposable d = new CompositeDisposable();

    public pkt(pkv pkv) {
        this.a = pkv;
    }

    public final void a(b bVar) {
        if (this.c != bVar) {
            this.c = bVar;
            this.c.a((a) this);
        }
    }

    public final void a() {
        this.d.a(this.a.a(SpotifyLocale.a()).a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$pkt$Gk4W9rXrn1LpCdi2JRRuRuUuND8<Object>(this), (Consumer<? super Throwable>) new $$Lambda$pkt$xv5Qn1q_jmFjhycfxxR4OHcYCDE<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Category[] categoryArr) {
        List asList = Arrays.asList(categoryArr);
        if (asList == null) {
            this.b.clear();
            this.c.a(Collections.emptyList());
            return;
        }
        this.c.a(asList);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        this.c.b();
    }

    public final void b() {
        this.d.c();
    }

    public final void a(String str, Channel channel, boolean z) {
        Completable completable;
        this.b.add(str);
        String lowerCase = channel.name().toLowerCase(Locale.US);
        if (z) {
            completable = this.a.a(lowerCase, str);
        } else {
            completable = this.a.b(lowerCase, str);
        }
        this.d.a(completable.a(AndroidSchedulers.a()).a((Action) new $$Lambda$pkt$SHT7HNfdjygDwWnEIvccAJFEVNA(this, str, channel, z), (Consumer<? super Throwable>) new $$Lambda$pkt$Wr3sf6g1c8Nr46_dtotfxWuzOGA<Object>(this)));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(String str, Channel channel, boolean z) {
        this.b.remove(str);
        if (!this.b.contains(str)) {
            this.c.a(str, channel, z);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.c.b();
    }
}
