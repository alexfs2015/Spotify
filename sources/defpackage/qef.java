package defpackage;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.appcompat.widget.SwitchCompat;
import com.spotify.mobile.android.util.loader.SettingsState;

/* renamed from: qef reason: default package */
public final class qef extends qdu {
    /* access modifiers changed from: private */
    public final SwitchCompat d;
    /* access modifiers changed from: private */
    public final kdl e;
    private final OnCheckedChangeListener f = new OnCheckedChangeListener() {
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Context context = qef.this.a;
            if (z) {
                qef.this.e.b(true);
                qef.this.e.a(false);
                new kda(context, qef.this.h).a(true, null);
                return;
            }
            qef.this.e.b(false);
            new kda(context, qef.this.h).b();
        }
    };
    private final OnClickListener g = new OnClickListener() {
        public final void onClick(View view) {
            if (!qef.this.d.isChecked()) {
                qef.this.d.setChecked(true);
            } else {
                qef.this.d.setChecked(false);
            }
        }
    };
    /* access modifiers changed from: private */
    public final vjo h;

    public qef(View view, frh frh, kdl kdl, vjo vjo) {
        super(view, frh);
        this.h = vjo;
        this.d = new SwitchCompat(this.a);
        this.b.a(this.d);
        this.e = kdl;
    }

    public final void a(boolean z) {
        super.a(z);
        this.d.setEnabled(z);
    }

    public final void a(SettingsState settingsState) {
        this.c = this.g;
        this.d.setOnCheckedChangeListener(null);
        this.d.setChecked(this.e.b());
        this.d.setOnCheckedChangeListener(this.f);
    }
}
