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
/* renamed from: miu reason: default package */
public abstract class miu<T extends Parcelable> extends jrd implements jqx, mir<T>, defpackage.sso.a {
    private ViewLoadingTracker a;
    protected mit<T> ad;
    public a ae;
    private ContentViewManager b;

    /* renamed from: miu$a */
    public static final class a {
        public sgb a;
    }

    /* access modifiers changed from: protected */
    public abstract View a(LayoutInflater layoutInflater);

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.ad == null) {
            this.ad = (mit) fbp.a(ah());
        }
        this.ad.a(bundle, ai());
        View view = (View) fbp.a(a(layoutInflater));
        this.a = this.ae.a.a(view, ae_().toString(), bundle, af());
        com.spotify.music.contentviewstate.ContentViewManager.a aVar = new com.spotify.music.contentviewstate.ContentViewManager.a(p(), (fvd) fbp.a(al()), (View) fbp.a(am()));
        aVar.a(R.string.error_no_connection_title, R.string.error_no_connection_body).b(R.string.error_general_title, R.string.error_general_body);
        this.b = aVar.a();
        fbp.b(this.b.a(ContentState.SERVICE_ERROR) && this.b.a(ContentState.NO_NETWORK));
        return view;
    }

    public final void a() {
        this.b.b((ContentState) null);
        this.b.a((LoadingView) fbp.a(an()));
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t);

    public final void a(Throwable th) {
        this.b.c(true);
    }

    public void aP_() {
        super.aP_();
        this.ad.a((mir<T>) this);
    }

    public final void ad_() {
        this.b.a(true);
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    /* access modifiers changed from: protected */
    public abstract mit<T> ah();

    /* access modifiers changed from: protected */
    public T ai() {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract fvd al();

    /* access modifiers changed from: protected */
    public abstract View am();

    /* access modifiers changed from: protected */
    public abstract LoadingView an();

    public final void aw_() {
        super.aw_();
        this.a.e();
    }

    public final void b(T t) {
        this.b.b((ContentState) null);
        a(t);
        ViewLoadingTracker viewLoadingTracker = this.a;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.b();
        }
    }

    public final String e() {
        return ae_().toString();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        ViewLoadingTracker viewLoadingTracker = this.a;
        if (viewLoadingTracker != null) {
            viewLoadingTracker.a(bundle);
        }
        mit<T> mit = this.ad;
        if (mit != null) {
            mit.k = SpotifyLocale.a();
            jyq.a((Object) mit, bundle);
        }
    }

    public void h() {
        super.h();
        mit<T> mit = this.ad;
        mit.j.unsubscribe();
        mit.i.unsubscribe();
        mit.h = null;
    }
}
