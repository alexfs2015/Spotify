package defpackage;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import com.spotify.music.R;

/* renamed from: qoo reason: default package */
public final class qoo {
    public final Context a;
    public final gbp b;
    private final ftm c;

    public qoo(ftm ftm, Context context, gbp gbp) {
        this.c = ftm;
        this.a = context;
        this.b = gbp;
    }

    public final void a() {
        a(R.string.choose_username_alert_title, this.a.getString(R.string.choose_username_alert_unknown), R.string.choose_username_alert_close, 0, null);
    }

    public void a(int i, String str, int i2, int i3, OnClickListener onClickListener) {
        ftl a2 = this.c.a(this.a.getString(i), str).a(this.a.getString(i2), onClickListener);
        a2.e = false;
        if (i3 != 0) {
            a2 = a2.b(this.a.getString(i3), onClickListener);
        }
        a2.a().a();
    }

    public final void a(gbo gbo) {
        a(R.string.choose_username_alert_no_internet_connection_title, this.a.getString(R.string.choose_username_alert_no_internet_connection_message), R.string.choose_username_alert_close, 0, null);
        this.b.a(gbr.a(gbo, (gbj) new c()));
    }
}
