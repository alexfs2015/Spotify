package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import com.google.common.base.Optional;
import com.spotify.music.R;
import com.spotify.termsandconditions.TermsAndConditionsView;

/* renamed from: vml reason: default package */
public final class vml implements kjd<vmi, vmg>, vmm, vnf {
    public final Button a;
    private final View b;
    private final Context c;
    /* access modifiers changed from: private */
    public final EditText d;
    private final ProgressBar e;
    private final TermsAndConditionsView f;
    private Optional<Boolean> g = Optional.e();

    public final void a() {
    }

    public vml(View view, final gao gao) {
        this.b = view;
        this.c = view.getContext();
        this.d = (EditText) this.b.findViewById(R.id.name);
        this.a = (Button) this.b.findViewById(R.id.name_next_button);
        this.e = (ProgressBar) this.b.findViewById(R.id.progressBar);
        this.f = (TermsAndConditionsView) this.b.findViewById(R.id.terms_conditions);
        TermsAndConditionsView termsAndConditionsView = this.f;
        termsAndConditionsView.a.a((voe) new voe() {
            public final void a() {
                gao.a(gaq.a((gaw) new e(), (gat) new c()));
            }

            public final void b() {
                gao.a(gaq.a((gaw) new e(), (gat) new b()));
            }
        });
    }

    public final kje<vmi> connect(final kkn<vmg> kkn) {
        final AnonymousClass2 r0 = new vne() {
            public final void a(CharSequence charSequence) {
                kkn.accept(new a(charSequence.toString(), vml.this.d.hasFocus()));
            }
        };
        this.d.addTextChangedListener(r0);
        return new kje<vmi>() {
            public final /* synthetic */ void accept(Object obj) {
                vml.a(vml.this, (vmi) obj);
            }

            public final void dispose() {
                vml.this.a.setOnClickListener(null);
                vml.this.d.removeTextChangedListener(r0);
            }
        };
    }

    public final void a(String str) {
        this.d.setText(str);
    }

    static /* synthetic */ void a(vml vml, vmi vmi) {
        boolean z = false;
        if (vmi.b() && vml.e.getVisibility() != 0) {
            vml.e.setVisibility(0);
            vml.a.setVisibility(4);
        } else if (!vmi.b() && vml.e.getVisibility() == 0) {
            vml.e.setVisibility(8);
            vml.a.setVisibility(0);
        }
        boolean z2 = vmi.a() instanceof b;
        vml.a.setEnabled(z2);
        if (z2) {
            ip.a((View) vml.d, fr.a(vml.c, (int) R.drawable.bg_login_text_input));
            vml.d.setTextColor(fr.c(vml.c, R.color.login_text_input_text));
        } else {
            ip.a((View) vml.d, fr.a(vml.c, (int) R.drawable.bg_login_text_input_error));
            vml.d.setTextColor(fr.c(vml.c, R.color.red));
        }
        if (!vml.g.b() || ((Boolean) vml.g.c()).booleanValue() != vmi.c()) {
            z = true;
        }
        if (z) {
            if (vmi.c()) {
                vml.f.d();
            } else {
                vml.f.c();
            }
        }
        vml.g = Optional.b(Boolean.valueOf(vmi.c()));
    }
}
