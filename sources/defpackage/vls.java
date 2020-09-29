package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.spotify.music.R;
import io.reactivex.Completable;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.concurrent.TimeUnit;

/* renamed from: vls reason: default package */
public final class vls implements kjd<vlm, vlk>, vlt, vnf {
    Scheduler a = AndroidSchedulers.a();
    private final Context b;
    private final View c;
    /* access modifiers changed from: private */
    public final EditText d;
    /* access modifiers changed from: private */
    public final TextView e;
    /* access modifiers changed from: private */
    public final Button f;
    private final ProgressBar g;
    /* access modifiers changed from: private */
    public Disposable h = Disposables.b();

    public vls(View view) {
        this.c = view;
        this.b = view.getContext();
        this.d = (EditText) view.findViewById(R.id.email);
        this.e = (TextView) view.findViewById(R.id.email_error_message);
        this.f = (Button) view.findViewById(R.id.email_next_button);
        this.g = (ProgressBar) view.findViewById(R.id.email_verification_loader);
    }

    public final kje<vlm> connect(final kkn<vlk> kkn) {
        final AnonymousClass1 r0 = new vne() {
            public final void a(CharSequence charSequence) {
                kkn.accept(new d(charSequence.toString()));
            }
        };
        this.d.setOnClickListener(new $$Lambda$vls$j9rtYwMvWMPYXzcK80yT6c2fSn8(kkn));
        this.d.setOnEditorActionListener(new $$Lambda$vls$XTbR5B0whBFuwY9yICEppzXo(kkn));
        this.d.addTextChangedListener(r0);
        this.d.clearFocus();
        this.f.setOnClickListener(new $$Lambda$vls$3VN9v8Dlfex1vUtEQK05xC4vq8(kkn));
        return new kje<vlm>() {
            /* access modifiers changed from: private */
            public static /* synthetic */ void a(e eVar) {
            }

            public final /* synthetic */ void accept(Object obj) {
                vlm vlm = (vlm) obj;
                vlm.a().a((gcs<a>) new $$Lambda$vls$2$e1stloXjLBV9KyfwOfH5Ktf24<a>(this, vlm), (gcs<b>) new $$Lambda$vls$2$a3P8Lp5_knA_HegeczMxJnMoLBI<b>(this, vlm), (gcs<c>) new $$Lambda$vls$2$pusaqg9Hb9I2dJkSsqW1cqc0MGU<c>(this, vlm, kkn), (gcs<e>) $$Lambda$vls$2$XspZAbwUeif00V9jF6QNaVzHp0.INSTANCE, (gcs<d>) new $$Lambda$vls$2$pEFI7KYPXuXWAc1nXyEuQwR_Tdw<d>(this));
                if (!vlm.b()) {
                    vls.this.e.setText(R.string.signup_email_no_connection);
                    vls.this.f.setEnabled(false);
                }
                vls.this.a(vlm.a() instanceof e);
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(vlm vlm, a aVar) {
                vls.b(vls.this, vlm.c());
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(vlm vlm, b bVar) {
                vls.a(vls.this, bVar, vlm.c());
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(vlm vlm, kkn kkn, c cVar) {
                vls.a(vls.this, vlm.c());
                if (vlm.c()) {
                    vls.this.h.bf_();
                    vls.this.h = Completable.a(750, TimeUnit.MILLISECONDS, vls.this.a).a((Action) new $$Lambda$vls$2$i8BEv6MKKSNxX6zzMPUfTQD_hdc(kkn, vlm), (Consumer<? super Throwable>) $$Lambda$vls$2$oORKkgbEgP5EmC0zyDze0hB_cmE.INSTANCE);
                }
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(d dVar) {
                vls.e(vls.this);
            }

            public final void dispose() {
                vls.this.d.removeTextChangedListener(r0);
                vls.this.d.setOnEditorActionListener(null);
                vls.this.d.setOnClickListener(null);
                vls.this.d.setOnFocusChangeListener(null);
                vls.this.h.bf_();
            }
        };
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(kkn kkn, View view) {
        if (fax.a(((EditText) view).getText().toString())) {
            kkn.accept(new b());
        }
    }

    public final void a(String str) {
        this.d.setText(str);
        this.d.setSelection(str.length());
    }

    public final void b() {
        gba.a(this.d);
    }

    private void b(boolean z) {
        if (z) {
            ip.a((View) this.d, fr.a(this.b, (int) R.drawable.bg_login_text_input));
            this.d.setTextColor(fr.c(this.b, R.color.login_text_input_text));
            return;
        }
        ip.a((View) this.d, fr.a(this.b, (int) R.drawable.bg_login_text_input_error));
        this.d.setTextColor(fr.c(this.b, R.color.login_text_input_text_error));
    }

    public final void a() {
        gba.a(this.d);
    }

    public final void a(boolean z) {
        int dimensionPixelSize = this.b.getResources().getDimensionPixelSize(R.dimen.login_text_input_padding);
        int dimensionPixelSize2 = this.b.getResources().getDimensionPixelSize(R.dimen.login_text_input_height);
        EditText editText = this.d;
        if (!z) {
            dimensionPixelSize2 = dimensionPixelSize;
        }
        int i = 0;
        ip.b(editText, dimensionPixelSize, 0, dimensionPixelSize2, 0);
        ProgressBar progressBar = this.g;
        if (!z) {
            i = 4;
        }
        progressBar.setVisibility(i);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(kkn kkn, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        kkn.accept(new e());
        return true;
    }

    static /* synthetic */ void e(vls vls) {
        vls.a(false);
        vls.b(true);
        vls.f.setEnabled(true);
        vls.e.setText(R.string.signup_email_hint);
    }

    static /* synthetic */ void a(vls vls, boolean z) {
        vls.e.setText(R.string.signup_email_hint);
        if (z) {
            vls.f.setEnabled(false);
        } else {
            vls.f.setEnabled(true);
        }
    }

    static /* synthetic */ void a(vls vls, b bVar, boolean z) {
        vls.a(false);
        vls.f.setEnabled(false);
        if (z) {
            vls.b(false);
            if (bVar.a == 20) {
                vls.b(true);
                vls.f.setEnabled(true);
                StringBuilder sb = new StringBuilder();
                sb.append(vls.b.getString(R.string.signup_email_error_email_already_taken_title));
                sb.append(' ');
                sb.append(vls.b.getString(R.string.signup_email_error_email_already_taken_message));
                vls.e.setText(sb.toString());
                return;
            }
            vls.e.setText(R.string.signup_email_invalid);
            return;
        }
        vls.e.setText(R.string.signup_email_hint);
    }

    static /* synthetic */ void b(vls vls, boolean z) {
        vls.a(false);
        vls.b(true);
        if (z) {
            vls.e.setText(R.string.signup_email_empty);
        } else {
            vls.e.setText(R.string.signup_email_hint);
        }
        vls.f.setEnabled(false);
    }
}
