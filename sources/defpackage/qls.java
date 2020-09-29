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

/* renamed from: qls reason: default package */
public final class qls implements a {
    ArtistSearchResponse a;
    private final qlu b;
    private final qhu c;
    private final Scheduler d;
    private final qlo e;
    private Disposable f = Disposables.b();
    private b g;

    public qls(qlu qlu, qhu qhu, Scheduler scheduler, qlo qlo, a aVar) {
        this.b = qlu;
        this.c = qhu;
        this.d = scheduler;
        this.e = qlo;
        aVar.a(new c() {
            public final void a(Bundle bundle) {
                bundle.putParcelable("key_response", qls.this.a);
            }

            public final void b(Bundle bundle) {
                if (bundle != null) {
                    qls.this.a = (ArtistSearchResponse) bundle.getParcelable("key_response");
                }
            }
        });
    }

    private void e(String str) {
        this.f.bf_();
        if (fax.a(str)) {
            ((b) fay.a(this.g)).a();
            this.a = null;
            return;
        }
        qlu qlu = this.b;
        this.f = vun.b(qlu.a.resolve(RequestBuilder.get(qlu.a(str, qlu.b.a(), qlu.c.a(), qlu.d.a())).build())).a((ObservableTransformer<? super T, ? extends R>) new viq<Object,Object>()).a(this.d).a((Consumer<? super T>) new $$Lambda$qls$mtUaUPi2aKJEgSWiwFa7JAghxVo<Object>(this, str), (Consumer<? super Throwable>) new $$Lambda$qls$5i3cdRHt7qYOzrhK7Tqv1IFR8<Object>(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, ArtistSearchResponse artistSearchResponse) {
        this.a = artistSearchResponse;
        if (artistSearchResponse.results().isEmpty()) {
            ((b) fay.a(this.g)).a(str);
            return;
        }
        ((b) fay.a(this.g)).a(artistSearchResponse.results(), false);
        this.g.aM_();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(Throwable th) {
        Logger.e(th, "Failed to get a search result", new Object[0]);
        ((b) fay.a(this.g)).b();
    }

    public final void a(b bVar) {
        this.g = (b) fay.a(bVar);
        ArtistSearchResponse artistSearchResponse = this.a;
        if (artistSearchResponse != null && !artistSearchResponse.results().isEmpty()) {
            this.g.a(this.a.results(), false);
            this.g.aM_();
        }
    }

    public final void a() {
        this.f.bf_();
        ((b) fay.a(this.g)).f();
        this.g = null;
    }

    public final boolean b() {
        ArtistSearchResponse artistSearchResponse = this.a;
        return (artistSearchResponse == null || artistSearchResponse.nextPage() == null) ? false : true;
    }

    public final void c() {
        String nextPage = b() ? ((ArtistSearchResponse) fay.a(this.a)).nextPage() : null;
        if (nextPage != null) {
            this.f.bf_();
            this.f = vun.b(this.b.a.resolve(RequestBuilder.get(nextPage).build())).a((ObservableTransformer<? super T, ? extends R>) new viq<Object,Object>()).a(this.d).a((Consumer<? super T>) new $$Lambda$qls$mruBoyWOACl2OWr1m8IDno9f4Tk<Object>(this), (Consumer<? super Throwable>) $$Lambda$qls$Nxn0DG6hYuYFOfsqoEy5a_opi7c.INSTANCE);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ArtistSearchResponse artistSearchResponse) {
        this.a = artistSearchResponse;
        ((b) fay.a(this.g)).a(artistSearchResponse.results(), true);
    }

    public final void a(int i, TasteOnboardingItem tasteOnboardingItem, String str) {
        qlo qlo = this.e;
        qmj qmj = (qmj) fay.a(tasteOnboardingItem.logging());
        qlo.a.a(qlo.c.a(tasteOnboardingItem.id(), Intent.SELECT_ENABLE.mIntent, qmj.b(), qmj.c(), qmj.a(), i, ((ArtistSearchResponse) fay.a(this.a)).results().size() - 1, str));
        qlo.a.a(qlo.d.a(Intent.SELECT_ENABLE.mIntent, "item", tasteOnboardingItem.id(), str));
        qhu qhu = this.c;
        if (!qhu.b.isEmpty()) {
            Fragment a2 = ((jja) qhu.b.pop()).a();
            Bundle bundle = a2.i;
            String str2 = "key_item_clicked_from_search";
            if (bundle == null) {
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(str2, tasteOnboardingItem);
                a2.g(bundle2);
            } else {
                bundle.putParcelable(str2, tasteOnboardingItem);
            }
            qhu.a(a2, false);
        }
    }

    public final boolean a(String str) {
        qlo qlo = this.e;
        qlo.a.a(qlo.d.a(Intent.NAVIGATE_BACK.mIntent, "search-back-button", null, str));
        this.c.b();
        return true;
    }

    public final void d() {
        qlo qlo = this.e;
        qlo.a.a(qlo.d.a(Intent.NAVIGATE_BACK.mIntent, "device-back-button", null, null));
        this.c.b();
    }

    public final void b(String str) {
        e(str);
    }

    public final void c(String str) {
        e(str);
    }

    public final void d(String str) {
        qlo qlo = this.e;
        qlo.a.a(qlo.d.a(Intent.CLEAR.mIntent, "clear-button", null, str));
    }
}
