package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.ui.activity.MarketingOptInActivity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;

/* renamed from: jro reason: default package */
public final class jro extends jry {
    private final defpackage.md.a<a> T = new defpackage.md.a<a>() {
        public final mg<a> a() {
            return new b(jro.this);
        }

        public final /* bridge */ /* synthetic */ void a(mg mgVar, Object obj) {
            jro.a(jro.this, (a) obj);
        }
    };
    private boolean a;
    private Intent b;

    /* renamed from: jro$a */
    static class a {
        boolean a;
        String b;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: jro$b */
    static class b extends mf<a> {
        public b(jro jro) {
            super(jro.p());
        }

        public final /* synthetic */ Object d() {
            a aVar = new a(0);
            aVar.a = ((jyg) gih.a(jyg.class)).b(this.d).a(gqm.a, false);
            aVar.b = ((jyg) gih.a(jyg.class)).b(this.d).a(gqm.b, (String) null);
            return aVar;
        }
    }

    static /* synthetic */ void a(jro jro, a aVar) {
        if (aVar.a && !jro.a) {
            jro.a = true;
            jro.b = MarketingOptInActivity.a((Context) jro.p(), aVar.b);
            if (jro.Y != null) {
                jro.Y.a((jry) jro);
            }
        }
    }

    public final void a(jue jue) {
        super.a(jue);
        if (this.a) {
            this.Y.a((jry) this);
        }
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle != null) {
            this.a = bundle.getBoolean("dialog_queued", false);
        }
        md.a(this).a(R.id.loader_marketing_opt_in, null, this.T).h();
    }

    public final void c() {
        super.c();
        if (this.a) {
            startActivityForResult(this.b, this.Z);
        } else {
            Assertion.a("Unexpected onShow(). Did not expect to show a dialog when nothing queued");
        }
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putBoolean("dialog_queued", this.a);
    }
}
