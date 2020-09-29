package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.u;
import com.spotify.music.R;
import com.spotify.music.loggers.ImpressionLogger;
import com.spotify.music.loggers.ImpressionLogger.ImpressionType;
import com.spotify.music.loggers.ImpressionLogger.RenderType;

/* renamed from: rfi reason: default package */
public class rfi extends iqs {
    public boolean c = true;
    private final ImpressionLogger d;
    private final rfg e;

    public rfi(ImpressionLogger impressionLogger, rfg rfg) {
        super(R.id.free_tier_impression_logged);
        this.d = impressionLogger;
        this.e = rfg;
    }

    public final void a(int i, u uVar) {
        gzq a = rfg.a(uVar);
        String string = a.string("ui:uri");
        String string2 = a.string("ui:group");
        this.d.a(a.string("ui:source"), string, string2, i, ImpressionType.ITEM, RenderType.LIST);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        if (r0 != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0050, code lost:
        a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.view.View r4) {
        /*
            r3 = this;
            super.a(r4)
            boolean r0 = r3.c
            if (r0 == 0) goto L_0x0053
            boolean r0 = r4 instanceof androidx.recyclerview.widget.RecyclerView
            if (r0 == 0) goto L_0x0053
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r0 = 0
            r1 = 0
        L_0x000f:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$h> r2 = r4.o
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x004e
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$h> r2 = r4.o
            int r2 = r2.size()
            if (r1 < 0) goto L_0x0034
            if (r1 >= r2) goto L_0x0034
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$h> r2 = r4.o
            java.lang.Object r2 = r2.get(r1)
            androidx.recyclerview.widget.RecyclerView$h r2 = (androidx.recyclerview.widget.RecyclerView.h) r2
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0031
            r0 = 1
            goto L_0x004e
        L_0x0031:
            int r1 = r1 + 1
            goto L_0x000f
        L_0x0034:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " is an invalid index for size "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L_0x004e:
            if (r0 != 0) goto L_0x0053
            r3.a(r4)
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rfi.a(android.view.View):void");
    }

    public final void b(View view) {
        super.b(view);
        if (this.c && (view instanceof RecyclerView)) {
            b((RecyclerView) view);
        }
    }
}
