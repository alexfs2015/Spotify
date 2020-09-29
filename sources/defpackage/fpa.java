package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* renamed from: fpa reason: default package */
public abstract class fpa extends BroadcastReceiver {
    /* access modifiers changed from: protected */
    public void a(Context context, int i, fpk fpk) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(Context context, int[] iArr);

    /* access modifiers changed from: protected */
    public abstract void b(Context context, int[] iArr);

    /* access modifiers changed from: protected */
    public abstract void c(Context context, int[] iArr);

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        String str = "IdNo";
        if ("com.samsung.android.app.spage.action.CARD_UPDATE".equals(action)) {
            foz.a();
            a(context, intent.getIntArrayExtra(str));
        } else if ("com.samsung.android.app.spage.action.CARD_ENABLED".equals(action)) {
            b(context, intent.getIntArrayExtra(str));
        } else if ("com.samsung.android.app.spage.action.CARD_DISABLED".equals(action)) {
            c(context, intent.getIntArrayExtra(str));
        } else if ("com.samsung.android.app.spage.action.CARD_EVENT".equals(action)) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                fpk a = fpk.a(extras);
                if (a != null) {
                    foz.a();
                    a(context, intent.getIntExtra(str, -1), a);
                }
            }
        } else {
            if ("com.samsung.android.app.spage.action.CARD_INSTANT_UPDATE".equals(action)) {
                if (intent.getIntExtra("updateCode", 0) != 0) {
                    foz.a();
                    intent.getIntExtra(str, -1);
                } else {
                    Log.e("CardContentProvider", "wrong update code - zero");
                }
            } else if ("com.samsung.android.app.spage.action.MULTI_INSTANCE_PREFERENCE_UPDATE".equals(action)) {
                foz.a();
                intent.getIntExtra(str, -1);
            }
        }
    }
}
