package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.libs.instrumentation.performance.ViewLoadingTracker;
import com.spotify.localization.SpotifyLocale;
import com.spotify.music.R;
import com.spotify.music.contentviewstate.ContentViewManager;
import com.spotify.music.contentviewstate.ContentViewManager.ContentState;
import com.spotify.music.contentviewstate.view.LoadingView;

@Deprecated
/* renamed from: ueg reason: default package */
public abstract class ueg<T extends Parcelable> extends jor implements jol, defpackage.sih.a, ued<T> {
    private ViewLoadingTracker a;
    protected uef<T> ad;
    public a ae;
    private ContentViewManager b;

    /* renamed from: ueg$a */
    public static final class a {
        public rwr a;
    }

    /* access modifiers changed from: protected */
    public abstract View a(LayoutInflater layoutInflater);

    /* access modifiers changed from: protected */
    public abstract void a(T t);

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    /* access modifiers changed from: protected */
    public abstract uef<T> ah();

    /* access modifiers changed from: protected */
    public T ai() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract fuj al();

    /* access modifiers changed from: protected */
    public abstract View am();

    /* access modifiers changed from: protected */
    public abstract LoadingView an();

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.ad == null) {
            this.ad = (uef) fay.a(ah());
        }
        this.ad.a(bundle, ai());
        View view = (View) fay.a(a(layoutInflater));
        this.a = this.ae.a.a(view, ae_().toString(), bundle, af());
        com.spotify.music.contentviewstate.ContentViewManager.a aVar = new com.spotify.music.contentviewstate.ContentViewManager.a(p(), (fuj) fay.a(al()), (View) fay.a(am()));
        aVar.a(R.string.error_no_connection_title, R.string.error_no_connection_body).b(R.string.error_general_title, R.string.error_general_body);
        this.b = aVar.a();
        fay.b(this.b.a(ContentState.SERVICE_ERROR) && this.b.a(ContentState.NO_NETWORK));
        return view;
    }

    public final void ax_() {
        super.ax_();
        this.a.e();
    }

    public void g() {
        super.g();
        this.ad.a((ued<T>) this);
    }

    public void h() {
        super.h();
        uef<T> uef = this.ad;
        uef.j.unsubscribe();
        uef.i.unsubscribe();
        uef.h = null;
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        ViewLoadingTracker viewLoadingTracker = this.a;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.a(bundle);
        }
        uef<T> uef = this.ad;
        if (uef != null) {
            uef.k = SpotifyLocale.a();
            jwo.a((Object) uef, bundle);
        }
    }

    public String e() {
        return ae_().toString();
    }

    public final void a() {
        this.b.b((ContentState) null);
        this.b.a((LoadingView) fay.a(an()));
    }

    public final void a(Throwable th) {
        this.b.c(true);
    }

    public final void b(T t) {
        this.b.b((ContentState) null);
        a(t);
        ViewLoadingTracker viewLoadingTracker = this.a;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.b();
        }
    }

    public final void ad_() {
        this.b.a(true);
    }
}
