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

/* renamed from: nwe reason: default package */
public class nwe extends jrd implements jqx, nwa, a, uqq {
    private RecyclerView T;
    private View U;
    private nwb V;
    public nvv a;
    public nuu b;

    public static nwe ah() {
        return new nwe();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        nvv nvv = this.a;
        nvv.b.a();
        nvv.d.h();
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
        this.V = new nwb((Context) fbp.a(n()), (ViewGroup) inflate.findViewById(R.id.error_view_container), new $$Lambda$nwe$ghw8HHatZA7LLhYYGZgOjknwZaw(this));
        return inflate;
    }

    public final void a() {
        this.V.a();
    }

    public final void a(int i, boolean z) {
        this.V.a(i, z);
    }

    public final void a(boolean z) {
        this.T.setVisibility(z ? 0 : 4);
    }

    public final void aP_() {
        super.aP_();
        this.a.a((nwa) this);
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.bA;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.SETTINGS_CONTENT_LANGUAGES, ViewUris.bA.toString());
    }

    public final uqm ag() {
        return uqo.H;
    }

    public final gkq aj() {
        return PageIdentifiers.SETTINGS_CONTENT_LANGUAGES;
    }

    public final String b(Context context) {
        return context.getString(R.string.title_settings);
    }

    public final void b() {
        nwf ah = nwf.ah();
        ah.a((kk) this.t, ah.getClass().getName());
    }

    public final void b(boolean z) {
        this.U.setVisibility(z ? 0 : 8);
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        if (bundle != null) {
            this.a.b.b(bundle);
        }
    }

    public final String e() {
        return uqo.H.a();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        this.a.b.a(bundle);
    }

    public final void h() {
        super.h();
        nvv nvv = this.a;
        nvv.e.unsubscribe();
        nvv.d.g();
        nvv.c.a(nvv.b.c()).a(5000, TimeUnit.MILLISECONDS, xig.a((Throwable) new TimeoutException())).b((xih) new xih() {
            public final void a() {
                nvv.this.a.a(false);
            }

            public final void a(Throwable th) {
            }

            public final void a(xip xip) {
                nvv.this.e = xip;
            }
        });
        nvv.b.b();
        nvv.f = null;
    }
}
