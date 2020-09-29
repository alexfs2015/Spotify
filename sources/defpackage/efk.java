package defpackage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.provider.CalendarContract.Events;

/* renamed from: efk reason: default package */
public final class efk implements OnClickListener {
    private final /* synthetic */ efj a;

    public efk(efj efj) {
        this.a = efj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        efj efj = this.a;
        Intent data = new Intent("android.intent.action.EDIT").setData(Events.CONTENT_URI);
        data.putExtra("title", efj.b);
        data.putExtra("eventLocation", efj.f);
        data.putExtra("description", efj.e);
        if (efj.c > -1) {
            data.putExtra("beginTime", efj.c);
        }
        if (efj.d > -1) {
            data.putExtra("endTime", efj.d);
        }
        data.setFlags(268435456);
        bkc.e();
        cmu.a(this.a.a, data);
    }
}
