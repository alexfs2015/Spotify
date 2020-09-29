package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.util.ArrayList;

/* renamed from: kbi reason: default package */
public final class kbi extends apy {
    private final jyg a;
    private final kby b;

    public kbi(Context context, kby kby, int i, jyg jyg) {
        super(context, 1);
        this.a = jyg;
        this.b = kby;
    }

    public final aqo[] a(Handler handler, beg beg, arc arc, azq azq, awe awe, asd<ash> asd) {
        aqo[] a2 = super.a(handler, beg, arc, azq, awe, asd);
        jyg jyg = this.a;
        if (jyg != null) {
            jyg.a(a2);
        }
        return a2;
    }

    public final void a(Context context, asd<ash> asd, AudioProcessor[] audioProcessorArr, Handler handler, arc arc, int i, ArrayList<aqo> arrayList) {
        if (this.b == null) {
            super.a(context, asd, audioProcessorArr, handler, arc, i, arrayList);
        }
    }

    public final void a(ArrayList<aqo> arrayList) {
        kby kby = this.b;
        if (kby != null) {
            arrayList.add(new kbz(kby));
        }
    }

    public final void a(Context context, asd<ash> asd, long j, Handler handler, beg beg, int i, ArrayList<aqo> arrayList) {
        ArrayList<aqo> arrayList2 = arrayList;
        if (VERSION.SDK_INT < 23 && VERSION.SDK_INT >= 17) {
            arrayList2.add(fal.a(context, asd, true, 5000, handler, beg, 50));
            return;
        }
        bec bec = new bec(context, avy.a, j, asd, false, handler, beg, 50);
        arrayList2.add(bec);
    }
}
