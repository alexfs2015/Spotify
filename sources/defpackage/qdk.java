package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.R;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: qdk reason: default package */
public class qdk extends jrd implements jqx, kmm<qdg, qde>, a {
    private b<qdg, qde> T;
    public qcv a;
    public qdl b;

    public static jqx ah() {
        return new qdk();
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
        return ViewUris.c;
    }

    public final rmf af() {
        return rmf.a(PageIdentifiers.RADIO, null);
    }

    public final uqm ag() {
        return uqo.aI;
    }

    public final String b(Context context) {
        return context.getString(R.string.radio_title);
    }

    public final void b(Bundle bundle) {
        hcs hcs;
        super.b(bundle);
        a a2 = new a().a(new b());
        if (bundle != null) {
            bundle.setClassLoader(hcs.class.getClassLoader());
            hcs = (hcs) bundle.getParcelable("com.spotify.music.features.radiohub.view.RadioHubFragment.KEY_STATE");
        } else {
            hcs = null;
        }
        if (hcs != null) {
            a2 = a2.a(qdc.a(hcs));
        }
        this.T = this.a.a(a2.a());
        this.T.a(this);
        this.T.c();
    }

    public kmn<qdg> connect(knw<qde> knw) {
        return new kmn<qdg>() {
            /* access modifiers changed from: private */
            public /* synthetic */ void a(a aVar) {
                qdk.this.b.a(aVar.a);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(b bVar) {
                qdk.this.b.a(hbb.a());
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(c cVar) {
                qdk.this.b.a(cVar.a);
            }

            public final /* synthetic */ void accept(Object obj) {
                ((qdg) obj).a().a(new $$Lambda$qdk$1$6KaKZKTNOOA28h9oYO7kWj2r5Dc(this), new $$Lambda$qdk$1$40xSfqfAHQHzEiWx9x4NIGOATc(this), new $$Lambda$qdk$1$VgKfg5xmyTyKnzflti39e5rqdIQ(this));
            }

            public final void dispose() {
            }
        };
    }

    public final String e() {
        return "radio";
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelable("com.spotify.music.features.radiohub.view.RadioHubFragment.KEY_STATE", hdb.immutable(this.b.b()));
    }
}
