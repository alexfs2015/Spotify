package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.spotify.base.java.logging.Logger;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import com.spotify.music.features.tasteonboarding.artistsearch.model.ArtistSearchResponse;
import com.spotify.music.features.tasteonboarding.logging.Intent;
import com.spotify.music.features.tasteonboarding.model.TasteOnboardingItem;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Consumer;

/* renamed from: qub reason: default package */
public final class qub implements a {
    ArtistSearchResponse a;
    private final qud b;
    private final qqi c;
    private final Scheduler d;
    private final qtx e;
    private Disposable f = Disposables.b();
    private b g;

    public qub(qud qud, qqi qqi, Scheduler scheduler, qtx qtx, a aVar) {
        this.b = qud;
        this.c = qqi;
        this.d = scheduler;
        this.e = qtx;
        aVar.a(new c() {
            public final void a(Bundle bundle) {
                bundle.putParcelable("key_response", qub.this.a);
            }

            public final void b(Bundle bundle) {
                if (bundle != null) {
                    qub.this.a = (ArtistSearchResponse) bundle.getParcelable("key_response");
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ArtistSearchResponse artistSearchResponse) {
        this.a = artistSearchResponse;
        ((b) fbp.a(this.g)).a(artistSearchResponse.results(), true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, ArtistSearchResponse artistSearchResponse) {
        this.a = artistSearchResponse;
        if (artistSearchResponse.results().isEmpty()) {
            ((b) fbp.a(this.g)).a(str);
            return;
        }
        ((b) fbp.a(this.g)).a(artistSearchResponse.results(), false);
        this.g.aK_();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        Logger.e(th, "Failed to get a search result", new Object[0]);
        ((b) fbp.a(this.g)).b();
    }

    private void e(String str) {
        this.f.bd_();
        if (fbo.a(str)) {
            ((b) fbp.a(this.g)).a();
            this.a = null;
            return;
        }
        qud qud = this.b;
        this.f = wit.b(qud.a.resolve(RequestBuilder.get(qud.a(str, qud.b.a(), qud.c.a(), qud.d.a())).build())).a((ObservableTransformer<? super T, ? extends R>) new vvv<Object,Object>()).a(this.d).a((Consumer<? super T>) new $$Lambda$qub$85Ut17bgwJ7KJKUAxjyAxaFljM<Object>(this, str), (Consumer<? super Throwable>) new $$Lambda$qub$XrP8iAw2EWGDAtvLleVDdJsi_Hg<Object>(this));
    }

    public final void a() {
        this.f.bd_();
        ((b) fbp.a(this.g)).f();
        this.g = null;
    }

    public final void a(int i, TasteOnboardingItem tasteOnboardingItem, String str) {
        qtx qtx = this.e;
        qur qur = (qur) fbp.a(tasteOnboardingItem.logging());
        qtx.a.a(qtx.c.a(tasteOnboardingItem.id(), Intent.SELECT_ENABLE.mIntent, qur.b(), qur.c(), qur.a(), i, ((ArtistSearchResponse) fbp.a(this.a)).results().size() - 1, str));
        qtx.a.a(qtx.d.a(Intent.SELECT_ENABLE.mIntent, "item", tasteOnboardingItem.id(), str));
        qqi qqi = this.c;
        if (!qqi.b.isEmpty()) {
            Fragment a2 = ((jlm) qqi.b.pop()).a();
            Bundle bundle = a2.i;
            String str2 = "key_item_clicked_from_search";
            if (bundle == null) {
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(str2, tasteOnboardingItem);
                a2.g(bundle2);
            } else {
                bundle.putParcelable(str2, tasteOnboardingItem);
            }
            qqi.a(a2, false);
        }
    }

    public final void a(b bVar) {
        this.g = (b) fbp.a(bVar);
        ArtistSearchResponse artistSearchResponse = this.a;
        if (artistSearchResponse != null && !artistSearchResponse.results().isEmpty()) {
            this.g.a(this.a.results(), false);
            this.g.aK_();
        }
    }

    public final boolean a(String str) {
        qtx qtx = this.e;
        qtx.a.a(qtx.d.a(Intent.NAVIGATE_BACK.mIntent, "search-back-button", null, str));
        this.c.b();
        return true;
    }

    public final void b(String str) {
        e(str);
    }

    public final boolean b() {
        ArtistSearchResponse artistSearchResponse = this.a;
        return (artistSearchResponse == null || artistSearchResponse.nextPage() == null) ? false : true;
    }

    public final void c() {
        String nextPage = b() ? ((ArtistSearchResponse) fbp.a(this.a)).nextPage() : null;
        if (nextPage != null) {
            this.f.bd_();
            this.f = wit.b(this.b.a.resolve(RequestBuilder.get(nextPage).build())).a((ObservableTransformer<? super T, ? extends R>) new vvv<Object,Object>()).a(this.d).a((Consumer<? super T>) new $$Lambda$qub$VMp6fZs2909bO42UpVAkn83hxk<Object>(this), (Consumer<? super Throwable>) $$Lambda$qub$EIphVC7sfhKjeqdCvAxdGIqDt8.INSTANCE);
        }
    }

    public final void c(String str) {
        e(str);
    }

    public final void d() {
        qtx qtx = this.e;
        qtx.a.a(qtx.d.a(Intent.NAVIGATE_BACK.mIntent, "device-back-button", null, null));
        this.c.b();
    }

    public final void d(String str) {
        qtx qtx = this.e;
        qtx.a.a(qtx.d.a(Intent.CLEAR.mIntent, "clear-button", null, str));
    }
}
