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

/* renamed from: qnz reason: default package */
public class qnz extends jrd implements d, jqx, kmm<qny, qnx>, qoi {
    public who<qoa> T;
    public xil U;
    public xil V;
    /* access modifiers changed from: private */
    public View W;
    private View X;
    private b<qny, qnx> Y;
    public szp a;
    public RxResolver b;

    private static qnz a(Bundle bundle) {
        qnz qnz = new qnz();
        qnz.g(bundle);
        return qnz;
    }

    public static qnz a(String str, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("uri", str);
        bundle.putString("original_uri", str);
        bundle.putBoolean("auto_play", z);
        return a(bundle);
    }

    public static qnz a(String str, boolean z, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("uri", str);
        bundle2.putString("original_uri", str);
        bundle2.putBoolean("auto_play", z);
        bundle2.putBundle("navigation_extras", bundle);
        return a(bundle2);
    }

    public static boolean b(Intent intent) {
        return intent.getBooleanExtra("auto_play", false);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_show_resolver, viewGroup, false);
        this.W = inflate.findViewById(R.id.progress_view);
        this.Y = knk.a(kok.a((kni<M, E, F>) $$Lambda$aYFZ_9RqKS_iDCEf8hgavJF7fQ8.INSTANCE, qnw.a((qoi) this, this.b, this.U, this.V)).a((kmx<M, F>) $$Lambda$nRgOtW0nKzsvLql_F23QEdwSJ3U.INSTANCE).a(knq.a("Show entity resolver")), qny.a((String) fbp.a(((Bundle) fbp.a(this.i)).getString("uri")), MediaType.UNKNOWN, ((Bundle) fbp.a(this.i)).getBundle("navigation_extras")));
        this.Y.a(this);
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        fvk a2 = fvm.a((Context) fbp.a(p()), viewGroup2);
        a2.a((int) R.string.error_general_title);
        a2.b((int) R.string.error_general_body);
        this.X = a2.getView();
        this.X.setVisibility(8);
        viewGroup2.addView(this.X);
        return inflate;
    }

    public final void a(String str, Optional<Bundle> optional) {
        Logger.b("Go to uri %s", str);
        this.a.a(szk.a(str).c(true).a(), optional);
    }

    public final void a(String str, Throwable th) {
        Logger.e(th, "Error while resolving entity: %s", str);
        this.X.setVisibility(0);
        this.W.setVisibility(8);
    }

    public final void aP_() {
        super.aP_();
        this.Y.c();
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.SHOWS_RESOLVER, null);
    }

    public final uqm ag() {
        return uqo.aR;
    }

    public final void aw_() {
        this.Y.b();
        super.aw_();
    }

    public final String b(Context context) {
        return "";
    }

    public kmn<qny> connect(knw<qnx> knw) {
        return new kmn<qny>() {
            public final /* synthetic */ void accept(Object obj) {
                if (((qny) obj).d()) {
                    qnz.this.W.setVisibility(0);
                }
            }

            public final void dispose() {
            }
        };
    }

    public final String e() {
        return "show_resolver";
    }

    public final void h() {
        super.h();
        this.Y.d();
    }
}
