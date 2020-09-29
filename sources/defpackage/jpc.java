package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobile.android.ui.activity.MarketingOptInActivity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.music.R;

/* renamed from: jpc reason: default package */
public final class jpc extends jpm {
    private final defpackage.ly.a<a> T = new defpackage.ly.a<a>() {
        public final /* bridge */ /* synthetic */ void a(mb mbVar, Object obj) {
            jpc.a(jpc.this, (a) obj);
        }

        public final mb<a> a() {
            return new b(jpc.this);
        }
    };
    private boolean a;
    private Intent b;

    /* renamed from: jpc$a */
    static class a {
        boolean a;
        String b;

        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    /* renamed from: jpc$b */
    static class b extends ma<a> {
        public b(jpc jpc) {
            super(jpc.p());
        }

        public final /* synthetic */ Object d() {
            a aVar = new a(0);
            aVar.a = ((jvy) ggw.a(jvy.class)).b(this.d).a(qfl.a, false);
            aVar.b = ((jvy) ggw.a(jvy.class)).b(this.d).a(qfl.b, (String) null);
            return aVar;
        }
    }

    public final void b(Bundle bundle) {
        super.b(bundle);
        if (bundle != null) {
            this.a = bundle.getBoolean("dialog_queued", false);
        }
        ly.a(this).a(R.id.loader_marketing_opt_in, null, this.T).h();
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        bundle.putBoolean("dialog_queued", this.a);
    }

    public final void c() {
        super.c();
        if (this.a) {
            startActivityForResult(this.b, this.Z);
        } else {
            Assertion.a("Unexpected onShow(). Did not expect to show a dialog when nothing queued");
        }
    }

    public final void a(jru jru) {
        super.a(jru);
        if (this.a) {
            this.Y.a((jpm) this);
        }
    }

    static /* synthetic */ void a(jpc jpc, a aVar) {
        if (aVar.a && !jpc.a) {
            jpc.a = true;
            jpc.b = MarketingOptInActivity.a((Context) jpc.p(), aVar.b);
            if (jpc.Y != null) {
                jpc.Y.a((jpm) jpc);
            }
        }
    }
}
