package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: mov reason: default package */
public class mov extends jrd implements jqx, kmm<mpo, mpm>, a {
    private b<mpo, mpm> T;
    public mpc a;
    public mpi b;

    public static mov ah() {
        return new mov();
    }

    public final void B() {
        super.B();
        this.T.d();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.b.a();
    }

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final sso ae_() {
        return ViewUris.an;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.DAILYMIXHUB, null);
    }

    public final uqm ag() {
        return uqo.J;
    }

    public final String b(Context context) {
        return "Daily Mix Hub";
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        mpc mpc = this.a;
        this.T = knc.a(mpc.a(), new a().a(new b()).a(), knm.a());
        this.T.a(this);
        this.T.c();
    }

    public kmn<mpo> connect(knw<mpm> knw) {
        return new kmn<mpo>() {
            /* access modifiers changed from: private */
            public /* synthetic */ void a(a aVar) {
                mov.this.b.a(aVar.a);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(b bVar) {
                mov.this.b.a(hbb.a());
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(c cVar) {
                mov.this.b.a(cVar.a);
            }

            public final /* synthetic */ void accept(Object obj) {
                ((mpo) obj).a().a(new $$Lambda$mov$1$yGisl_ryHkTkuLfYsnEqs80Mces(this), new $$Lambda$mov$1$RP94Ow3twCVHs2235ZUKkGr3wgQ(this), new $$Lambda$mov$1$M2VrQrF6bvaeFnLlf9G3hEmVSk(this));
            }

            public final void dispose() {
            }
        };
    }

    public final String e() {
        return "daily-mix-hub";
    }
}
