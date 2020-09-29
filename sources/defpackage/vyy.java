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

/* renamed from: vyy reason: default package */
public final class vyy implements kmm<vys, vyq>, vyz, wal {
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

    public vyy(View view) {
        this.c = view;
        this.b = view.getContext();
        this.d = (EditText) view.findViewById(R.id.email);
        this.e = (TextView) view.findViewById(R.id.email_error_message);
        this.f = (Button) view.findViewById(R.id.email_next_button);
        this.g = (ProgressBar) view.findViewById(R.id.email_verification_loader);
    }

    static /* synthetic */ void a(vyy vyy, b bVar, boolean z) {
        vyy.a(false);
        vyy.f.setEnabled(false);
        if (z) {
            vyy.b(false);
            if (bVar.a == 20) {
                vyy.b(true);
                vyy.f.setEnabled(true);
                StringBuilder sb = new StringBuilder();
                sb.append(vyy.b.getString(R.string.signup_email_error_email_already_taken_title));
                sb.append(' ');
                sb.append(vyy.b.getString(R.string.signup_email_error_email_already_taken_message));
                vyy.e.setText(sb.toString());
                return;
            }
            vyy.e.setText(R.string.signup_email_invalid);
            return;
        }
        vyy.e.setText(R.string.signup_email_hint);
    }

    static /* synthetic */ void a(vyy vyy, boolean z) {
        vyy.e.setText(R.string.signup_email_hint);
        if (z) {
            vyy.f.setEnabled(false);
        } else {
            vyy.f.setEnabled(true);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(knw knw, TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            return false;
        }
        knw.accept(new e());
        return true;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void b(knw knw, View view) {
        if (fbo.a(((EditText) view).getText().toString())) {
            knw.accept(new b());
        }
    }

    static /* synthetic */ void b(vyy vyy, boolean z) {
        vyy.a(false);
        vyy.b(true);
        if (z) {
            vyy.e.setText(R.string.signup_email_empty);
        } else {
            vyy.e.setText(R.string.signup_email_hint);
        }
        vyy.f.setEnabled(false);
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

    static /* synthetic */ void e(vyy vyy) {
        vyy.a(false);
        vyy.b(true);
        vyy.f.setEnabled(true);
        vyy.e.setText(R.string.signup_email_hint);
    }

    public final void a() {
        gbx.a(this.d);
    }

    public final void a(String str) {
        this.d.setText(str);
        this.d.setSelection(str.length());
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

    public final void b() {
        gbx.a(this.d);
    }

    public final kmn<vys> connect(final knw<vyq> knw) {
        final AnonymousClass1 r0 = new wak() {
            public final void a(CharSequence charSequence) {
                knw.accept(new d(charSequence.toString()));
            }
        };
        this.d.setOnClickListener(new $$Lambda$vyy$99uOGFZ20g6vsXrzW7DrN6KL0Lg(knw));
        this.d.setOnEditorActionListener(new $$Lambda$vyy$KkeK_Ya15rNk05evz4jY6fcLLoY(knw));
        this.d.addTextChangedListener(r0);
        this.d.clearFocus();
        this.f.setOnClickListener(new $$Lambda$vyy$n0PKdShPamx6cVAsew4wTFcashE(knw));
        return new kmn<vys>() {
            /* access modifiers changed from: private */
            public /* synthetic */ void a(vys vys, knw knw, c cVar) {
                vyy.a(vyy.this, vys.c());
                if (vys.c()) {
                    vyy.this.h.bd_();
                    vyy.this.h = Completable.a(750, TimeUnit.MILLISECONDS, vyy.this.a).a((Action) new $$Lambda$vyy$2$6ZMKiMMo5kLGxog8AHcaQMmO5k4(knw, vys), (Consumer<? super Throwable>) $$Lambda$vyy$2$bdVRR0Ja0fqoRyrl7m9FFpEXX1M.INSTANCE);
                }
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(vys vys, a aVar) {
                vyy.b(vyy.this, vys.c());
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(vys vys, b bVar) {
                vyy.a(vyy.this, bVar, vys.c());
            }

            /* access modifiers changed from: private */
            public /* synthetic */ void a(d dVar) {
                vyy.e(vyy.this);
            }

            /* access modifiers changed from: private */
            public static /* synthetic */ void a(e eVar) {
            }

            public final /* synthetic */ void accept(Object obj) {
                vys vys = (vys) obj;
                vys.a().a((ged<a>) new $$Lambda$vyy$2$cSnuazZWtLUKPQlJT2I5YJ3pw4<a>(this, vys), (ged<b>) new $$Lambda$vyy$2$QVKwHUFhtwJ9aI4pcwae4DEuWUA<b>(this, vys), (ged<c>) new $$Lambda$vyy$2$wAQHXB4dyMot4sDsVyndz7Q<c>(this, vys, knw), (ged<e>) $$Lambda$vyy$2$PXwL0VYV6BzbydNjHOHVWRaY8.INSTANCE, (ged<d>) new $$Lambda$vyy$2$VQ_xI_fAygaazJesghSimAzTJ78<d>(this));
                if (!vys.b()) {
                    vyy.this.e.setText(R.string.signup_email_no_connection);
                    vyy.this.f.setEnabled(false);
                }
                vyy.this.a(vys.a() instanceof e);
            }

            public final void dispose() {
                vyy.this.d.removeTextChangedListener(r0);
                vyy.this.d.setOnEditorActionListener(null);
                vyy.this.d.setOnClickListener(null);
                vyy.this.d.setOnFocusChangeListener(null);
                vyy.this.h.bd_();
            }
        };
    }
}
