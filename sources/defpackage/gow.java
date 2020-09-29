package defpackage;

import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.magiclink.setpassword.MagiclinkSetPasswordActivity;
import com.spotify.music.R;

/* renamed from: gow reason: default package */
public final class gow implements gov, kjd<got, goq> {
    /* access modifiers changed from: private */
    public final EditText a;
    /* access modifiers changed from: private */
    public final Button b;
    /* access modifiers changed from: private */
    public final ProgressBar c;
    private final TextView d;
    private final MagiclinkSetPasswordActivity e;

    public gow(MagiclinkSetPasswordActivity magiclinkSetPasswordActivity) {
        this.e = magiclinkSetPasswordActivity;
        this.a = (EditText) fay.a(magiclinkSetPasswordActivity.findViewById(R.id.input_password));
        this.b = (Button) fay.a(magiclinkSetPasswordActivity.findViewById(R.id.password_save));
        this.c = (ProgressBar) fay.a(magiclinkSetPasswordActivity.findViewById(R.id.progressBar));
        this.d = (TextView) fay.a(magiclinkSetPasswordActivity.findViewById(R.id.password_error_message));
    }

    public final kje<got> connect(final kkn<goq> kkn) {
        final AnonymousClass1 r0 = new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                kkn.accept(new b(editable.toString()));
            }
        };
        this.b.setOnClickListener(new $$Lambda$gow$JQGQYu0MxiuvsdaF8igbuiKexZg(kkn));
        this.a.addTextChangedListener(r0);
        return new kje<got>() {
            public final /* synthetic */ void accept(Object obj) {
                got got = (got) obj;
                if ((got.b() instanceof g) && !gow.this.b.isEnabled()) {
                    gow.this.b.setEnabled(true);
                } else if (!(got.b() instanceof g) && gow.this.b.isEnabled()) {
                    gow.this.b.setEnabled(false);
                }
                if (!(got.c() instanceof a)) {
                    gow.this.d.setVisibility(8);
                } else if (((a) got.c()).a instanceof a) {
                    gow.a(gow.this, ((a) ((a) got.c()).a).a);
                } else {
                    gow.a(gow.this, (int) R.string.magiclink_set_password_connection_error);
                }
                if (!got.f() || gow.this.c.getVisibility() == 0) {
                    if (!got.f() && gow.this.c.getVisibility() == 0) {
                        gow.this.c.setVisibility(8);
                    }
                    return;
                }
                gow.this.c.setVisibility(0);
            }

            public final void dispose() {
                gow.this.b.setOnClickListener(null);
                gow.this.a.removeTextChangedListener(r0);
            }
        };
    }

    public final void a(boolean z, String str) {
        Intent intent = new Intent();
        intent.putExtra("REASON", str);
        this.e.setResult(z ? -1 : 0, intent);
        this.e.finish();
    }

    static /* synthetic */ void a(gow gow, String str) {
        gow.d.setVisibility(0);
        gow.d.setText(str);
    }

    static /* synthetic */ void a(gow gow, int i) {
        gow.d.setVisibility(0);
        gow.d.setText(i);
    }
}
