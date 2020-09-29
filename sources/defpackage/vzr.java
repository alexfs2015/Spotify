package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import com.google.common.base.Optional;
import com.spotify.music.R;
import com.spotify.termsandconditions.TermsAndConditionsView;

/* renamed from: vzr reason: default package */
public final class vzr implements kmm<vzo, vzm>, vzs, wal {
    public final Button a;
    private final View b;
    private final Context c;
    /* access modifiers changed from: private */
    public final EditText d;
    private final ProgressBar e;
    private final TermsAndConditionsView f;
    private Optional<Boolean> g = Optional.e();

    public vzr(View view, final gbp gbp) {
        this.b = view;
        this.c = view.getContext();
        this.d = (EditText) this.b.findViewById(R.id.name);
        this.a = (Button) this.b.findViewById(R.id.name_next_button);
        this.e = (ProgressBar) this.b.findViewById(R.id.progressBar);
        this.f = (TermsAndConditionsView) this.b.findViewById(R.id.terms_conditions);
        TermsAndConditionsView termsAndConditionsView = this.f;
        termsAndConditionsView.a.a((wbm) new wbm() {
            public final void a() {
                gbp.a(gbr.a((gbo) new f(), (gbj) new g()));
            }

            public final void b() {
                gbp.a(gbr.a((gbo) new f(), (gbj) new f()));
            }
        });
    }

    static /* synthetic */ void a(vzr vzr, vzo vzo) {
        boolean z = true;
        if (vzo.b() && vzr.e.getVisibility() != 0) {
            vzr.e.setVisibility(0);
            vzr.a.setVisibility(4);
            vzr.f.setEnabled(false);
        } else if (!vzo.b() && vzr.e.getVisibility() == 0) {
            vzr.e.setVisibility(8);
            vzr.a.setVisibility(0);
            vzr.f.setEnabled(true);
        }
        boolean z2 = vzo.a() instanceof b;
        vzr.a.setEnabled(z2);
        if (z2) {
            ip.a((View) vzr.d, fr.a(vzr.c, (int) R.drawable.bg_login_text_input));
            vzr.d.setTextColor(fr.c(vzr.c, R.color.login_text_input_text));
        } else {
            ip.a((View) vzr.d, fr.a(vzr.c, (int) R.drawable.bg_login_text_input_error));
            vzr.d.setTextColor(fr.c(vzr.c, R.color.red));
        }
        if (vzr.g.b() && ((Boolean) vzr.g.c()).booleanValue() == vzo.c()) {
            z = false;
        }
        if (z) {
            if (vzo.c()) {
                vzr.f.d();
            } else {
                vzr.f.c();
            }
        }
        vzr.g = Optional.b(Boolean.valueOf(vzo.c()));
    }

    public final void a() {
    }

    public final void a(String str) {
        this.d.setText(str);
    }

    public final kmn<vzo> connect(final knw<vzm> knw) {
        final AnonymousClass2 r0 = new wak() {
            public final void a(CharSequence charSequence) {
                knw.accept(new a(charSequence.toString(), vzr.this.d.hasFocus()));
            }
        };
        this.d.addTextChangedListener(r0);
        return new kmn<vzo>() {
            public final /* synthetic */ void accept(Object obj) {
                vzr.a(vzr.this, (vzo) obj);
            }

            public final void dispose() {
                vzr.this.a.setOnClickListener(null);
                vzr.this.d.removeTextChangedListener(r0);
            }
        };
    }
}
