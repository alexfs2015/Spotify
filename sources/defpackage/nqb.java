package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.a;
import androidx.recyclerview.widget.RecyclerView.i;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: nqb reason: default package */
public class nqb extends jor implements jol, npx, a, udv {
    private RecyclerView T;
    private View U;
    private npy V;
    public nps a;
    public nor b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public static nqb ah() {
        return new nqb();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_language_settings, viewGroup, false);
        this.T = (RecyclerView) inflate.findViewById(R.id.languages);
        RecyclerView recyclerView = this.T;
        recyclerView.q = true;
        recyclerView.a((i) new LinearLayoutManager(inflate.getContext()));
        this.T.a((a) this.b);
        this.b.a((a) this.a);
        this.U = inflate.findViewById(R.id.loading_view);
        this.V = new npy((Context) fay.a(n()), (ViewGroup) inflate.findViewById(R.id.error_view_container), new $$Lambda$nqb$knWbbgxH6ZSee05XN85NvuFfSso(this));
        return inflate;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        nps nps = this.a;
        nps.b.a();
        nps.d.h();
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        if (bundle != null) {
            this.a.b.b(bundle);
        }
    }

    public final void g() {
        super.g();
        this.a.a((npx) this);
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        this.a.b.a(bundle);
    }

    public final void h() {
        super.h();
        nps nps = this.a;
        nps.e.unsubscribe();
        nps.d.g();
        nps.c.a(nps.b.c()).a(5000, TimeUnit.MILLISECONDS, wub.a((Throwable) new TimeoutException())).b((wuc) new wuc() {
            public final void a(Throwable th) {
            }

            public final void a() {
                nps.this.a.a(false);
            }

            public final void a(wuk wuk) {
                nps.this.e = wuk;
            }
        });
        nps.b.b();
        nps.f = null;
    }

    public final void a(boolean z) {
        this.T.setVisibility(z ? 0 : 4);
    }

    public final void b(boolean z) {
        this.U.setVisibility(z ? 0 : 8);
    }

    public final void a(int i, boolean z) {
        this.V.a(i, z);
    }

    public final void a() {
        this.V.a();
    }

    public final void b() {
        nqc ah = nqc.ah();
        ah.a((kf) this.t, ah.getClass().getName());
    }

    public final String b(Context context) {
        return context.getString(R.string.title_settings);
    }

    public final udr ag() {
        return udt.H;
    }

    public final sih ae_() {
        return ViewUris.bB;
    }

    public final gjf aj() {
        return PageIdentifiers.SETTINGS_CONTENT_LANGUAGES;
    }

    public final String e() {
        return udt.H.a();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.SETTINGS_CONTENT_LANGUAGES, ViewUris.bB.toString());
    }
}
