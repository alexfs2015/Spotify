package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.common.base.Optional;
import com.spotify.android.glue.patterns.toolbarmenu.ToolbarConfig.d;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.playlist.models.Show.MediaType;

/* renamed from: qew reason: default package */
public class qew extends jor implements d, jol, kjd<qev, qeu>, qff {
    public vti<qex> T;
    public wug U;
    public wug V;
    /* access modifiers changed from: private */
    public View W;
    private View X;
    private b<qev, qeu> Y;
    public spi a;
    public RxResolver b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "";
    }

    public final String e() {
        return "show_resolver";
    }

    public static qew a(String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("uri", str);
        bundle.putString("original_uri", str);
        bundle.putBoolean("auto_play", z);
        return a(bundle);
    }

    public static boolean b(Intent intent) {
        return intent.getBooleanExtra("auto_play", false);
    }

    public static qew a(String str, boolean z, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("uri", str);
        bundle2.putString("original_uri", str);
        bundle2.putBoolean("auto_play", z);
        bundle2.putBundle("navigation_extras", bundle);
        return a(bundle2);
    }

    private static qew a(Bundle bundle) {
        qew qew = new qew();
        qew.g(bundle);
        return qew;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_show_resolver, viewGroup, false);
        this.W = inflate.findViewById(R.id.progress_view);
        this.Y = kkb.a(klb.a((kjz<M, E, F>) $$Lambda$HA76TqbJuLNAu14xgz_M3qOx2Fs.INSTANCE, qet.a((qff) this, this.b, this.U, this.V)).a((kjo<M, F>) $$Lambda$OMMr_MH_4EvL9Pz2mRV8NHysU28.INSTANCE).a(kkh.a("Show entity resolver")), qev.a((String) fay.a(((Bundle) fay.a(this.i)).getString("uri")), MediaType.UNKNOWN, ((Bundle) fay.a(this.i)).getBundle("navigation_extras")));
        this.Y.a(this);
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        fuq a2 = fus.a((Context) fay.a(p()), viewGroup2);
        a2.a((int) R.string.error_general_title);
        a2.b((int) R.string.error_general_body);
        this.X = a2.getView();
        this.X.setVisibility(8);
        viewGroup2.addView(this.X);
        return inflate;
    }

    public final void g() {
        super.g();
        this.Y.c();
    }

    public final void h() {
        super.h();
        this.Y.d();
    }

    public final void ax_() {
        this.Y.b();
        super.ax_();
    }

    public final void a(String str, Optional<Bundle> optional) {
        Logger.b("Go to uri %s", str);
        this.a.a(spd.a(str).c(true).a(), optional);
    }

    public final void a(String str, Throwable th) {
        Logger.e(th, "Error while resolving entity: %s", str);
        this.X.setVisibility(0);
        this.W.setVisibility(8);
    }

    public kje<qev> connect(kkn<qeu> kkn) {
        return new kje<qev>() {
            public final void dispose() {
            }

            public final /* synthetic */ void accept(Object obj) {
                if (((qev) obj).d()) {
                    qew.this.W.setVisibility(0);
                }
            }
        };
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.SHOWS_RESOLVER, null);
    }

    public final udr ag() {
        return udt.aR;
    }
}
