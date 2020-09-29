package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.util.ArrayList;

/* renamed from: kdi reason: default package */
public final class kdi extends aqp {
    private final kag a;
    private final kdz b;

    public kdi(Context context, kdz kdz, int i, kag kag) {
        super(context, 1);
        this.a = kag;
        this.b = kdz;
    }

    public final void a(Context context, asu<asy> asu, long j, Handler handler, bex bex, int i, ArrayList<arf> arrayList) {
        ArrayList<arf> arrayList2 = arrayList;
        if (VERSION.SDK_INT < 23 && VERSION.SDK_INT >= 17) {
            arrayList2.add(fbc.a(context, asu, true, 5000, handler, bex, 50));
            return;
        }
        bet bet = new bet(context, awp.a, j, asu, false, handler, bex, 50);
        arrayList2.add(bet);
    }

    public final void a(Context context, asu<asy> asu, AudioProcessor[] audioProcessorArr, Handler handler, art art, int i, ArrayList<arf> arrayList) {
        if (this.b == null) {
            super.a(context, asu, audioProcessorArr, handler, art, i, arrayList);
        }
    }

    public final void a(ArrayList<arf> arrayList) {
        kdz kdz = this.b;
        if (kdz != null) {
            arrayList.add(new kea(kdz));
        }
    }

    public final arf[] a(Handler handler, bex bex, art art, bah bah, awv awv, asu<asy> asu) {
        arf[] a2 = super.a(handler, bex, art, bah, awv, asu);
        kag kag = this.a;
        if (kag != null) {
            kag.a(a2);
        }
        return a2;
    }
}
