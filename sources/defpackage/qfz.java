package defpackage;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import com.spotify.music.R;
import com.spotify.music.spotlets.tracker.identifier.DialogIdentifier;
import com.spotify.music.spotlets.tracker.identifier.ScreenIdentifier;

/* renamed from: qfz reason: default package */
public final class qfz {
    public final fss a;
    public final Context b;
    public final ujc c;

    public qfz(fss fss, Context context, ujc ujc) {
        this.a = fss;
        this.b = context;
        this.c = ujc;
    }

    public final void a(ScreenIdentifier screenIdentifier) {
        a(R.string.choose_username_alert_no_internet_connection_title, this.b.getString(R.string.choose_username_alert_no_internet_connection_message), R.string.choose_username_alert_close, 0, null);
        this.c.a(screenIdentifier, DialogIdentifier.NO_NETWORK_ERROR);
    }

    public final void a() {
        a(R.string.choose_username_alert_title, this.b.getString(R.string.choose_username_alert_unknown), R.string.choose_username_alert_close, 0, null);
    }

    public void a(int i, String str, int i2, int i3, OnClickListener onClickListener) {
        fsr a2 = this.a.a(this.b.getString(i), str).a(this.b.getString(i2), onClickListener);
        a2.e = false;
        if (i3 != 0) {
            a2 = a2.b(this.b.getString(i3), onClickListener);
        }
        a2.a().a();
    }
}
