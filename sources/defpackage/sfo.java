package defpackage;

import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;
import com.spotify.base.java.logging.Logger;
import com.spotify.libs.instrumentation.performance.ViewLoadSequence;
import com.spotify.libs.instrumentation.performance.ViewLoadSequence.Step;

/* renamed from: sfo reason: default package */
final class sfo implements gnj {
    private final Context a;

    sfo(Context context) {
        this.a = context;
    }

    public /* synthetic */ void a() {
        CC.$default$a(this);
    }

    public /* synthetic */ void c(ViewLoadSequence viewLoadSequence) {
        CC.$default$c(this, viewLoadSequence);
    }

    public final void process(ViewLoadSequence viewLoadSequence) {
        if (PreferenceManager.getDefaultSharedPreferences(this.a).getBoolean("VIEW_LOAD", false)) {
            String str = viewLoadSequence.d;
            if (Step.FINISHED.toString().equals(str)) {
                Long l = (Long) viewLoadSequence.g.get(Step.STARTED.toString());
                Long l2 = (Long) viewLoadSequence.g.get(Step.FINISHED.toString());
                if (!(l == null || l2 == null)) {
                    long longValue = l2.longValue() - l.longValue();
                    Logger.b("View %s took %dms. to load", viewLoadSequence.c, Long.valueOf(longValue));
                    mh a2 = mh.a(this.a);
                    sfi sfi = new sfi(viewLoadSequence.c, viewLoadSequence.b, longValue);
                    Intent intent = new Intent("ACTION_VIEW_LOAD_UPDATE");
                    intent.putExtra("EXTRA_VIEW_LOAD_UPDATE", sfi);
                    a2.a(intent);
                }
            } else if (Step.CANCELLED.toString().equals(str)) {
                Logger.b("Cancelling %s", viewLoadSequence.c);
            } else {
                Logger.e("Unknown terminal state %s", str);
            }
        }
    }
}
