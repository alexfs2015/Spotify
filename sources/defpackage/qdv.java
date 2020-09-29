package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import androidx.appcompat.widget.SwitchCompat;
import com.spotify.mobile.android.util.loader.SettingsState;
import com.spotify.mobile.android.util.prefs.SpSharedPreferences.a;
import com.spotify.music.libs.mediasession.SpotifyRemoteControlClient;

/* renamed from: qdv reason: default package */
public final class qdv extends qdu {
    /* access modifiers changed from: 0000 */
    public boolean d;
    /* access modifiers changed from: private */
    public final SwitchCompat e = new SwitchCompat(this.a);

    public qdv(View view, frh frh) {
        super(view, frh);
        this.b.a(this.e);
        this.c = new OnClickListener() {
            public final void onClick(View view) {
                qdv.this.e.toggle();
            }
        };
        this.e.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z != qdv.this.d) {
                    qdv.this.d = z;
                    qdv qdv = qdv.this;
                    a a2 = ((jvy) ggw.a(jvy.class)).b(qdv.a).a();
                    a2.a(SpotifyRemoteControlClient.a, qdv.d);
                    a2.b();
                }
            }
        });
    }

    public final void a(SettingsState settingsState) {
        this.d = ((jvy) ggw.a(jvy.class)).b(this.a).a(SpotifyRemoteControlClient.a, false);
        this.e.setChecked(this.d);
    }

    public final void a(boolean z) {
        super.a(z);
        this.e.setEnabled(z);
    }
}
