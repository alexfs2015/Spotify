package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.appcompat.widget.SwitchCompat;
import com.spotify.mobile.android.util.loader.SettingsState;

/* renamed from: qee reason: default package */
public class qee extends qdu {
    final jug d;
    public final SwitchCompat e;
    public defpackage.jug.a<Boolean> f;
    public wut<SettingsState, Boolean> g;
    public a h;
    private boolean i;
    /* access modifiers changed from: private */
    public boolean j;
    private final OnClickListener k = new OnClickListener() {
        public final void onClick(View view) {
            qee.this.e.toggle();
        }
    };
    private final OnCheckedChangeListener l = new OnCheckedChangeListener() {
        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z != qee.this.j) {
                qee qee = qee.this;
                qee.d.a(qee.f, Boolean.valueOf(qee.e.isChecked()));
                if (qee.this.h != null) {
                    qee.this.h.a(z);
                }
            }
        }
    };

    /* renamed from: qee$a */
    public interface a {
        void a(boolean z);
    }

    public qee(View view, frh frh, jug jug) {
        super(view, frh);
        this.d = jug;
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
