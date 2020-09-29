package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.provider.CalendarContract.Events;

/* renamed from: eet reason: default package */
public final class eet implements OnClickListener {
    private final /* synthetic */ ees a;

    public eet(ees ees) {
        this.a = ees;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ees ees = this.a;
        Intent data = new Intent("android.intent.action.EDIT").setData(Events.CONTENT_URI);
        data.putExtra("title", ees.b);
        data.putExtra("eventLocation", ees.f);
        data.putExtra("description", ees.e);
        if (ees.c > -1) {
            data.putExtra("beginTime", ees.c);
        }
        if (ees.d > -1) {
            data.putExtra("endTime", ees.d);
        }
        data.setFlags(268435456);
        bjl.e();
        cmd.a(this.a.a, data);
    }
}
