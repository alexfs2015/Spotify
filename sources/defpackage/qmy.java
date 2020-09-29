package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.appcompat.widget.SwitchCompat;
import com.spotify.mobile.android.util.loader.SettingsState;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.a;
import com.spotify.music.libs.mediasession.SpotifyRemoteControlClient;

/* renamed from: qmy reason: default package */
public final class qmy extends qmx {
    /* access modifiers changed from: 0000 */
    public boolean d;
    /* access modifiers changed from: private */
    public final SwitchCompat e = new SwitchCompat(this.a);

    public qmy(View view, fsb fsb) {
        super(view, fsb);
        this.b.a(this.e);
        this.c = new OnClickListener() {
            public final void onClick(View view) {
                qmy.this.e.toggle();
            }
        };
        this.e.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z != qmy.this.d) {
                    qmy.this.d = z;
                    qmy qmy = qmy.this;
                    a a2 = ((jyg) gih.a(jyg.class)).b(qmy.a).a();
                    a2.a(SpotifyRemoteControlClient.a, qmy.d);
                    a2.b();
                }
            }
        });
    }

    public final void a(SettingsState settingsState) {
        this.d = ((jyg) gih.a(jyg.class)).b(this.a).a(SpotifyRemoteControlClient.a, false);
        this.e.setChecked(this.d);
    }

    public final void a(boolean z) {
        super.a(z);
        this.e.setEnabled(z);
    }
}
