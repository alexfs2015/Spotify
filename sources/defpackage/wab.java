package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.spotify.music.R;

/* renamed from: wab reason: default package */
public final class wab implements kmm<vzy, vzw>, wac, wal {
    private final Context a;
    private final View b;
    /* access modifiers changed from: private */
    public final EditText c;
    private final TextView d;
    private final Button e;

    public wab(View view) {
        this.b = view;
        this.a = view.getContext();
        this.c = (EditText) view.findViewById(R.id.input_password);
        this.e = (Button) view.findViewById(R.id.password_next_button);
        this.d = (TextView) view.findViewById(R.id.password_error_message);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vzy vzy, b bVar) {
        if (vzy.b()) {
            this.d.setText(R.string.signup_password_invalid_too_short);
            a(false);
        }
        this.e.setEnabled(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(vzy vzy, h hVar) {
        if (vzy.b()) {
            this.d.setText(R.string.signup_password_invalid_too_short);
            a(false);
        }
        this.e.setEnabled(false);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(a aVar) {
        this.d.setText(R.string.signup_email_no_connection);
        this.e.setEnabled(true);
        a(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(c cVar) {
        this.d.setText(cVar.a);
        this.e.setEnabled(false);
        a(false);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void a(d dVar) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(e eVar) {
        this.d.setText(null);
        this.e.setEnabled(true);
        a(true);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(f fVar) {
        this.e.setEnabled(false);
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

    private void a(boolean z) {
        if (z) {
            ip.a((View) this.c, fr.a(this.a, (int) R.drawable.bg_login_text_input));
            this.c.setTextColor(fr.c(this.a, R.color.login_text_input_text));
            return;
        }
        ip.a((View) this.c, fr.a(this.a, (int) R.drawable.bg_login_text_input_error));
        this.c.setTextColor(fr.c(this.a, R.color.red));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(knw knw, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        knw.accept(new c());
        return true;
    }

    public final void a() {
        gbx.a(this.c);
    }

    public final void b() {
        gbx.b(this.c);
    }

    public final kmn<vzy> connect(final knw<vzw> knw) {
        final AnonymousClass1 r0 = new wak() {
            public final void a(CharSequence charSequence) {
                knw.accept(new b(charSequence.toString()));
            }
        };
        this.c.addTextChangedListener(r0);
        this.c.setOnEditorActionListener(new $$Lambda$wab$eG4I44IHlgO8any0NKhrW0N2wU0(knw));
        this.e.setOnClickListener(new $$Lambda$wab$3IeI8Hpovosoa75oPmzUUDCeHhY(knw));
        return new kmn<vzy>() {
            public final /* synthetic */ void accept(Object obj) {
                ((vzy) obj).a().a((ged<b>) new $$Lambda$wab$JsBm2g0xgNUtOfjJe16yiXSEzI<b>(wab.this, (vzy) obj), (ged<d>) $$Lambda$wab$EDf2lsW7k_D6vh6In42QgaxJw_k.INSTANCE, (ged<f>) new $$Lambda$wab$7D89bZT7zfMm5G3L8WfxMIS8UZo<f>(wab.this), (ged<e>) new $$Lambda$wab$NAk_IGTXekH4BsKpQvjpEip3o<e>(wab.this), (ged<g>) new $$Lambda$wab$xHayo8SXLLyNc1pM8vk_XEDEHA<g>(wab.this), (ged<i>) new $$Lambda$wab$KAYTUX7IclEPbx8XFjBz0Px35J0<i>(wab.this), (ged<h>) new $$Lambda$wab$pVjAdsjMmMFkr1jpV080dxiVodg<h>(wab.this, (vzy) obj), (ged<c>) new $$Lambda$wab$kYuiFsG5CoW6ywyHH9fYhRvpNfk<c>(wab.this), (ged<a>) new $$Lambda$wab$gyRLQCKLkGgqzfTF3Nd3j88zLrw<a>(wab.this));
            }

            public final void dispose() {
                wab.this.c.setOnEditorActionListener(null);
                wab.this.c.removeTextChangedListener(r0);
            }
        };
    }
}
