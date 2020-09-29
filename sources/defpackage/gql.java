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

/* renamed from: gql reason: default package */
public final class gql implements gqk, kmm<gqi, gqf> {
    /* access modifiers changed from: private */
    public final EditText a;
    /* access modifiers changed from: private */
    public final Button b;
    /* access modifiers changed from: private */
    public final ProgressBar c;
    private final TextView d;
    private final MagiclinkSetPasswordActivity e;

    public gql(MagiclinkSetPasswordActivity magiclinkSetPasswordActivity) {
        this.e = magiclinkSetPasswordActivity;
        this.a = (EditText) fbp.a(magiclinkSetPasswordActivity.findViewById(R.id.input_password));
        this.b = (Button) fbp.a(magiclinkSetPasswordActivity.findViewById(R.id.password_save));
        this.c = (ProgressBar) fbp.a(magiclinkSetPasswordActivity.findViewById(R.id.progressBar));
        this.d = (TextView) fbp.a(magiclinkSetPasswordActivity.findViewById(R.id.password_error_message));
    }

    static /* synthetic */ void a(gql gql, int i) {
        gql.d.setVisibility(0);
        gql.d.setText(i);
    }

    static /* synthetic */ void a(gql gql, String str) {
        gql.d.setVisibility(0);
        gql.d.setText(str);
    }

    public final void a(boolean z, String str) {
        Intent intent = new Intent();
        intent.putExtra("REASON", str);
        this.e.setResult(z ? -1 : 0, intent);
        this.e.finish();
    }

    public final kmn<gqi> connect(final knw<gqf> knw) {
        final AnonymousClass1 r0 = new TextWatcher() {
            public final void afterTextChanged(Editable editable) {
                knw.accept(new b(editable.toString()));
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }
        };
        this.b.setOnClickListener(new $$Lambda$gql$0A2oj2WBWzIauYl6J4BK6MKGnR8(knw));
        this.a.addTextChangedListener(r0);
        return new kmn<gqi>() {
            public final /* synthetic */ void accept(Object obj) {
                gqi gqi = (gqi) obj;
                if ((gqi.b() instanceof g) && !gql.this.b.isEnabled()) {
                    gql.this.b.setEnabled(true);
                } else if (!(gqi.b() instanceof g) && gql.this.b.isEnabled()) {
                    gql.this.b.setEnabled(false);
                }
                if (!(gqi.c() instanceof a)) {
                    gql.this.d.setVisibility(8);
                } else if (((a) gqi.c()).a instanceof a) {
                    gql.a(gql.this, ((a) ((a) gqi.c()).a).a);
                } else {
                    gql.a(gql.this, (int) R.string.magiclink_set_password_connection_error);
                }
                if (!gqi.f() || gql.this.c.getVisibility() == 0) {
                    if (!gqi.f() && gql.this.c.getVisibility() == 0) {
                        gql.this.c.setVisibility(8);
                    }
                    return;
                }
                gql.this.c.setVisibility(0);
            }

            public final void dispose() {
                gql.this.b.setOnClickListener(null);
                gql.this.a.removeTextChangedListener(r0);
            }
        };
    }
}
