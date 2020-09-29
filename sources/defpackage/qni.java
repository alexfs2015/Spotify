package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.appcompat.widget.SwitchCompat;
import com.spotify.mobile.android.util.loader.SettingsState;

/* renamed from: qni reason: default package */
public final class qni extends qmx {
    /* access modifiers changed from: private */
    public final SwitchCompat d;
    /* access modifiers changed from: private */
    public final kfm e;
    private final OnCheckedChangeListener f = new OnCheckedChangeListener() {
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Context context = qni.this.a;
            if (z) {
                qni.this.e.b(true);
                qni.this.e.a(false);
                new kfb(context, qni.this.h).a(true, null);
                return;
            }
            qni.this.e.b(false);
            new kfb(context, qni.this.h).b();
        }
    };
    private final OnClickListener g = new OnClickListener() {
        public final void onClick(View view) {
            if (!qni.this.d.isChecked()) {
                qni.this.d.setChecked(true);
            } else {
                qni.this.d.setChecked(false);
            }
        }
    };
    /* access modifiers changed from: private */
    public final vwu h;

    public qni(View view, fsb fsb, kfm kfm, vwu vwu) {
        super(view, fsb);
        this.h = vwu;
        this.d = new SwitchCompat(this.a);
        this.b.a(this.d);
        this.e = kfm;
    }

    public final void a(SettingsState settingsState) {
        this.c = this.g;
        this.d.setOnCheckedChangeListener(null);
        this.d.setChecked(this.e.b());
        this.d.setOnCheckedChangeListener(this.f);
    }

    public final void a(boolean z) {
        super.a(z);
        this.d.setEnabled(z);
    }
}
