package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.spotify.instrumentation.PageIdentifiers;
import com.spotify.music.libs.viewuri.ViewUris;

/* renamed from: mkc reason: default package */
public class mkc extends jor implements jol, kjd<mkv, mkt>, a {
    private b<mkv, mkt> T;
    public mkj a;
    public mkp b;

    public /* synthetic */ Fragment ae() {
        return CC.$default$ae(this);
    }

    public final String b(Context context) {
        return "Daily Mix Hub";
    }

    public final String e() {
        return "daily-mix-hub";
    }

    public static mkc ah() {
        return new mkc();
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        mkj mkj = this.a;
        this.T = kjt.a(mkj.a(), new a().a(new b()).a(), kkd.a());
        this.T.a(this);
        this.T.c();
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.b.a();
    }

    public final rdh af() {
        return rdh.a(PageIdentifiers.DAILYMIXHUB, null);
    }

    public final udr ag() {
        return udt.J;
    }

    public kje<mkv> connect(kkn<mkt> kkn) {
        return new kje<mkv>() {
            public final void dispose() {
            }

            public final /* synthetic */ void accept(Object obj) {
                ((mkv) obj).a().a(new $$Lambda$mkc$1$9GdwV8SasoQlek8Bzv0hpG6i7I(this), new $$Lambda$mkc$1$cR2J5fYO6usqExyv5J0stqRhWAw(this), new $$Lambda$mkc$1$Adk0uBNuzLo7K752LCbA9t8i68o(this));
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(b bVar) {
                mkc.this.b.a(gyi.a());
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(a aVar) {
                mkc.this.b.a(aVar.a);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(c cVar) {
                mkc.this.b.a(cVar.a);
            }
        };
    }

    public final sih ae_() {
        return ViewUris.ao;
    }

    public final void B() {
        super.B();
        this.T.d();
    }
}
