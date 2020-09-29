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

/* renamed from: puo reason: default package */
public class puo extends jor implements jol, kjd<puk, pui>, a {
    private b<puk, pui> T;
    public ptz a;
    public pup b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String e() {
        return "radio";
    }

    public static jol ah() {
        return new puo();
    }

    public final void b(Bundle bundle) {
        gzz gzz;
        super.b(bundle);
        a a2 = new a().a(new b());
        if (bundle != null) {
            bundle.setClassLoader(gzz.class.getClassLoader());
            gzz = (gzz) bundle.getParcelable("com.spotify.music.features.radiohub.view.RadioHubFragment.KEY_STATE");
        } else {
            gzz = null;
        }
        if (gzz != null) {
            a2 = a2.a(pug.a(gzz));
        }
        this.T = this.a.a(a2.a());
        this.T.a(this);
        this.T.c();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.b.a();
    }

    public final String b(Context context) {
        return context.getString(R.string.radio_title);
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.RADIO, null);
    }

    public final sih ae_() {
        return ViewUris.d;
    }

    public final udr ag() {
        return udt.aI;
    }

    public kje<puk> connect(kkn<pui> kkn) {
        return new kje<puk>() {
            public final void dispose() {
            }

            public final /* synthetic */ void accept(Object obj) {
                ((puk) obj).a().a(new $$Lambda$puo$1$_xCDBI7gYA_LIuh74c8oyXb25gY(this), new $$Lambda$puo$1$p1NernMH0TEs7YiNAtqKudJQG7k(this), new $$Lambda$puo$1$xiFoqts078oV14LZVdpAiYYecg(this));
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(b bVar) {
                puo.this.b.a(gyi.a());
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(a aVar) {
                puo.this.b.a(aVar.a);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(c cVar) {
                puo.this.b.a(cVar.a);
            }
        };
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putParcelable("com.spotify.music.features.radiohub.view.RadioHubFragment.KEY_STATE", hai.immutable(this.b.b()));
    }

    public final void B() {
        super.B();
        this.T.d();
    }
}
