package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.appcompat.widget.SwitchCompat;
import com.spotify.mobile.android.util.loader.SettingsState;

/* renamed from: qnh reason: default package */
public class qnh extends qmx {
    final jwo d;
    public final SwitchCompat e;
    public defpackage.jwo.a<Boolean> f;
    public xiy<SettingsState, Boolean> g;
    public a h;
    private boolean i;
    /* access modifiers changed from: private */
    public boolean j;
    private final OnClickListener k = new OnClickListener() {
        public final void onClick(View view) {
            qnh.this.e.toggle();
        }
    };
    private final OnCheckedChangeListener l = new OnCheckedChangeListener() {
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z != qnh.this.j) {
                qnh qnh = qnh.this;
                qnh.d.a(qnh.f, Boolean.valueOf(qnh.e.isChecked()));
                if (qnh.this.h != null) {
                    qnh.this.h.a(z);
                }
            }
        }
    };

    /* renamed from: qnh$a */
    public interface a {
        void a(boolean z);
    }

    public qnh(View view, fsb fsb, jwo jwo) {
        super(view, fsb);
        this.d = jwo;
        this.e = new SwitchCompat(this.a);
        this.b.a(this.e);
    }

    public void a(SettingsState settingsState) {
        boolean booleanValue = ((Boolean) this.g.call(settingsState)).booleanValue();
        if (!this.i || this.j != booleanValue) {
            this.i = true;
            this.c = null;
            this.e.setOnCheckedChangeListener(null);
            this.j = booleanValue;
            this.e.setChecked(this.j);
            this.c = this.k;
            this.e.setOnCheckedChangeListener(this.l);
        }
    }

    public final void a(boolean z) {
        super.a(z);
        this.e.setEnabled(z);
    }
}
