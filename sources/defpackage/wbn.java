package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: wbn reason: default package */
public final class wbn {

    /* renamed from: a */
    public static final int terms_and_conditions_text_terms_and_conditions = 2131953909;

    /* renamed from: b */
    public static final int terms_and_conditions_text_privacy_policy = 2131953908;

    /* renamed from: c */
    public static final int terms_and_conditions_text_choose_username_accept_tos_email_optout_info = 2131953906;
    private static int f = 2131953904;
    private static final a g = new a() {
        public final void a() {
        }

        public final void b() {
        }

        public final void c() {
        }
    };
    public final wbo d = new wbo();
    public a e = g;
    private final Context h;
    /* access modifiers changed from: private */
    public boolean i;
    private wbq j;

    /* renamed from: wbn$a */
    public interface a {
        void a();

        void b();

        void c();
    }

    public wbn(Context context) {
        this.h = context;
    }

    private int a(boolean z) {
        return this.j.c() ? R.string.terms_and_conditions_text_terms_and_conditions_specific : z ? f : terms_and_conditions_text_terms_and_conditions;
    }

    private void a(int i2, int i3, a aVar) {
        Context context = this.h;
        ftl b = fts.a(context, context.getString(i2), "").a(this.h.getString(R.string.terms_and_conditions_button_accept), new $$Lambda$wbn$RxaGbuQCWtKfXzPH5pxpBGwI4s(aVar)).b(this.h.getString(R.string.terms_and_conditions_button_decline), new $$Lambda$wbn$djPF464OclFs1Sp_9FowyKcMJ2k(this, aVar));
        b.f = new $$Lambda$wbn$Jr1t5AMY1xNVz1z_E1u1N1rUsJ4(this, aVar);
        ftj a2 = b.a();
        this.d.a((TextView) a2.d().findViewById(R.id.body), this.h.getString(i3));
        a2.a();
    }

    /* access modifiers changed from: private */
    public void a(a aVar) {
        a((int) R.string.terms_and_conditions_title_privacy_policy, (int) R.string.terms_and_conditions_text_privacy_policy, aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, DialogInterface dialogInterface) {
        b(aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, DialogInterface dialogInterface, int i2) {
        b(aVar);
    }

    private void a(boolean z, a aVar) {
        a((int) R.string.terms_and_conditions_title_terms_and_conditions, a(z), aVar);
    }

    private void b(a aVar) {
        Context context = this.h;
        ftl b = fts.a(context, context.getString(R.string.terms_and_conditions_title_terms_and_conditions), this.h.getString(R.string.terms_and_conditions_text_decline)).a(this.h.getString(R.string.terms_and_conditions_button_exit), new $$Lambda$wbn$ft8MdYSZUnOoW77aSPSKPzXmi0(aVar)).b(this.h.getString(R.string.terms_and_conditions_button_cancel), new $$Lambda$wbn$OC1M67PCueS0_GB3Fm0hM1cL5ds(this, aVar));
        b.f = new $$Lambda$wbn$zkGM8pa3w_xOGSSuAEFSUv8lwjk(aVar);
        b.a().a();
    }

    private void c(final a aVar) {
        if (this.i) {
            a(aVar);
        } else {
            a(false, (a) new a() {
                public final void a() {
                    wbn.this.i = true;
                    wbn.this.a(aVar);
                }

                public final void b() {
                    aVar.b();
                }

                public final void c() {
                    aVar.c();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(a aVar, DialogInterface dialogInterface, int i2) {
        a(this.j, aVar);
    }

    public final void a(wbq wbq, a aVar) {
        this.j = wbq;
        if (wbq.a()) {
            aVar.a();
        } else if (wbq.b()) {
            a(true, aVar);
        } else {
            c(aVar);
        }
    }
}
