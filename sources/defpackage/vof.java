package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: vof reason: default package */
public final class vof {

    /* renamed from: a */
    public static final int terms_and_conditions_text_terms_and_conditions = 2131953897;

    /* renamed from: b */
    public static final int terms_and_conditions_text_privacy_policy = 2131953896;

    /* renamed from: c */
    public static final int terms_and_conditions_text_choose_username_accept_tos_email_optout_info = 2131953894;
    private static final a f = new a() {
        public final void a() {
        }

        public final void b() {
        }

        public final void c() {
        }
    };
    public final vog d = new vog();
    public a e = f;
    private final Context g;
    /* access modifiers changed from: private */
    public boolean h;
    private voi i;

    /* renamed from: vof$a */
    public interface a {
        void a();

        void b();

        void c();
    }

    public vof(Context context) {
        this.g = context;
    }

    public final void a(voi voi, a aVar) {
        this.i = voi;
        if (voi.a()) {
            aVar.a();
        } else if (voi.b()) {
            a(aVar);
        } else {
            d(aVar);
        }
    }

    private void a(a aVar) {
        a((int) R.string.terms_and_conditions_title_terms_and_conditions, a(), aVar);
    }

    /* access modifiers changed from: private */
    public void b(a aVar) {
        a((int) R.string.terms_and_conditions_title_privacy_policy, (int) R.string.terms_and_conditions_text_privacy_policy, aVar);
    }

    private void c(a aVar) {
        Context context = this.g;
        fsr b = fsy.a(context, context.getString(R.string.terms_and_conditions_title_terms_and_conditions), this.g.getString(R.string.terms_and_conditions_text_decline)).a(this.g.getString(R.string.terms_and_conditions_button_exit), new $$Lambda$vof$LTFU9nkC197EbCeZj7ubG7mAsXo(aVar)).b(this.g.getString(R.string.terms_and_conditions_button_cancel), new $$Lambda$vof$uTDRb5cl75tXEfXGeGPwqZfV4QM(this, aVar));
        b.f = new $$Lambda$vof$7rYjqtUSlR3gPQLmQ1Qk8dn_XE(aVar);
        b.a().a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c(a aVar, DialogInterface dialogInterface, int i2) {
        a(this.i, aVar);
    }

    private void d(final a aVar) {
        if (this.h) {
            b(aVar);
        } else {
            a(new a() {
                public final void a() {
                    vof.this.h = true;
                    vof.this.b(aVar);
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

    private int a() {
        if (this.i.c()) {
            return R.string.terms_and_conditions_text_terms_and_conditions_specific;
        }
        return terms_and_conditions_text_terms_and_conditions;
    }

    private void a(int i2, int i3, a aVar) {
        Context context = this.g;
        fsr b = fsy.a(context, context.getString(i2), "").a(this.g.getString(R.string.terms_and_conditions_button_accept), new $$Lambda$vof$vFeoKd1DGYwOadrCAaaMjGyGsaY(aVar)).b(this.g.getString(R.string.terms_and_conditions_button_decline), new $$Lambda$vof$Kzux8b0mRT1VlmcXgh1U5Cgs_E0(this, aVar));
        b.f = new $$Lambda$vof$e1O5VEBFbxJkCINKvd_RepSpPvU(this, aVar);
        fsp a2 = b.a();
        this.d.a((TextView) a2.d().findViewById(R.id.body), this.g.getString(i3));
        a2.a();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, DialogInterface dialogInterface, int i2) {
        c(aVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar, DialogInterface dialogInterface) {
        c(aVar);
    }
}
