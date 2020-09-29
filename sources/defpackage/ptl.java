package defpackage;

import com.spotify.localization.SpotifyLocale;
import com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.Channel;
import com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.a;
import com.spotify.music.features.pushnotifications.inapppreference.NotificationSettingsMvp.b;
import com.spotify.music.features.pushnotifications.inapppreference.model.Category;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: ptl reason: default package */
public final class ptl implements a {
    private final ptn a;
    private final List<String> b = new ArrayList();
    private b c;
    private CompositeDisposable d = new CompositeDisposable();

    public ptl(ptn ptn) {
        this.a = ptn;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Throwable th) {
        this.c.b();
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
    public /* synthetic */ void b(String str, Channel channel, boolean z) {
        this.b.remove(str);
        if (!this.b.contains(str)) {
            this.c.a(str, channel, z);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        this.c.b();
    }

    public final void a() {
        this.d.a(this.a.a(SpotifyLocale.a()).a(AndroidSchedulers.a()).a((Consumer<? super T>) new $$Lambda$ptl$MpB1OgfjfQZHbqYpKijdWxeAIA0<Object>(this), (Consumer<? super Throwable>) new $$Lambda$ptl$PdU5W4wGojuq1lNIP5mBgGjKVf8<Object>(this)));
    }

    public final void a(b bVar) {
        if (this.c != bVar) {
            this.c = bVar;
            this.c.a((a) this);
        }
    }

    public final void a(String str, Channel channel, boolean z) {
        this.b.add(str);
        String lowerCase = channel.name().toLowerCase(Locale.US);
        this.d.a((z ? this.a.a(lowerCase, str) : this.a.b(lowerCase, str)).a(AndroidSchedulers.a()).a((Action) new $$Lambda$ptl$H4Lc3eWFHAOCLbNiN2Ncs2BHBSI(this, str, channel, z), (Consumer<? super Throwable>) new $$Lambda$ptl$53Xxvq8p7IaP5jNNa6wSpeOcrdc<Object>(this)));
    }

    public final void b() {
        this.d.c();
    }
}
