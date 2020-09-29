package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: vmv reason: default package */
public final class vmv implements kjd<vms, vmq>, vmw, vnf {
    private final Context a;
    private final View b;
    /* access modifiers changed from: private */
    public final EditText c;
    private final TextView d;
    private final Button e;

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(d dVar) {
    }

    public vmv(View view) {
        this.b = view;
        this.a = view.getContext();
        this.c = (EditText) view.findViewById(R.id.input_password);
        this.e = (Button) view.findViewById(R.id.password_next_button);
        this.d = (TextView) view.findViewById(R.id.password_error_message);
    }

    public final kje<vms> connect(final kkn<vmq> kkn) {
        final AnonymousClass1 r0 = new vne() {
            public final void a(CharSequence charSequence) {
                kkn.accept(new b(charSequence.toString()));
            }
        };
        this.c.addTextChangedListener(r0);
        this.c.setOnEditorActionListener(new $$Lambda$vmv$CXXcOcRWB3YTdHOTYHL82hsJpZo(kkn));
        this.e.setOnClickListener(new $$Lambda$vmv$1sLvAo8tarwr4ZqiDzcaIhftSWk(kkn));
        return new kje<vms>() {
            public final /* synthetic */ void accept(Object obj) {
                ((vms) obj).a().a((gcs<b>) new $$Lambda$vmv$_LGZwbXoCy6Pmy1hwaCYsuRpaSc<b>(vmv.this, (vms) obj), (gcs<d>) $$Lambda$vmv$buexqpfZeG1bkXo_jphtpxcVSYQ.INSTANCE, (gcs<f>) new $$Lambda$vmv$9FwZyTaA6w2KVXCIW494cPLHw<f>(vmv.this), (gcs<e>) new $$Lambda$vmv$T5iczcVPPN1o1NV994nkXlQ3gSM<e>(vmv.this), (gcs<g>) new $$Lambda$vmv$BqXnlrfSrJN0ZBxDaS4pqA5q87g<g>(vmv.this), (gcs<i>) new $$Lambda$vmv$mTdxAN3UARLCEVxkWgyYCDh0FNk<i>(vmv.this), (gcs<h>) new $$Lambda$vmv$YwpXKuQwuYXxFlumU9jiFKHaezA<h>(vmv.this, (vms) obj), (gcs<c>) new $$Lambda$vmv$gcZS4xdgZCeUMTM_Nkf0eRawj4<c>(vmv.this), (gcs<a>) new $$Lambda$vmv$ERFDPoK2D4krr8cjqa8UANK0XgY<a>(vmv.this));
            }

            public final void dispose() {
                vmv.this.c.setOnEditorActionListener(null);
                vmv.this.c.removeTextChangedListener(r0);
            }
        };
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vms vms, b bVar) {
        if (vms.b()) {
            this.d.setText(R.string.signup_password_invalid_too_short);
            a(false);
        }
        this.e.setEnabled(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(f fVar) {
        this.e.setEnabled(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(e eVar) {
        this.d.setText(null);
        this.e.setEnabled(true);
        a(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(g gVar) {
        this.d.setText(null);
        this.e.setEnabled(true);
        a(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(i iVar) {
        this.d.setText(R.string.signup_password_invalid_too_weak);
        this.e.setEnabled(false);
        a(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vms vms, h hVar) {
        if (vms.b()) {
            this.d.setText(R.string.signup_password_invalid_too_short);
            a(false);
        }
        this.e.setEnabled(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        this.d.setText(cVar.a);
        this.e.setEnabled(false);
        a(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        this.d.setText(R.string.signup_email_no_connection);
        this.e.setEnabled(true);
        a(true);
    }

    private void a(boolean z) {
        if (z) {
            ip.a((View) this.c, fr.a(this.a, (int) R.drawable.bg_login_text_input));
            this.c.setTextColor(fr.c(this.a, R.color.login_text_input_text));
            return;
        }
        ip.a((View) this.c, fr.a(this.a, (int) R.drawable.bg_login_text_input_error));
        this.c.setTextColor(fr.c(this.a, R.color.red));
    }

    public final void a() {
        gba.a(this.c);
    }

    public final void b() {
        gba.b(this.c);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(kkn kkn, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        kkn.accept(new c());
        return true;
    }
}
