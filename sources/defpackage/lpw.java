package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.h;
import com.spotify.music.R;

/* renamed from: lpw reason: default package */
public final class lpw extends h {
    final RecyclerView a;
    int b;
    float c;
    private final Paint d = new Paint();
    private final float e;
    private final float f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;

    public lpw(RecyclerView recyclerView) {
        this.a = recyclerView;
        Context context = recyclerView.getContext();
        Resources resources = recyclerView.getResources();
        this.h = resources.getDimensionPixelSize(R.dimen.assisted_curation_dot_decoration_bar_height);
        this.i = resources.getDimensionPixelSize(R.dimen.assisted_curation_dot_decoration_bar_left_right_margin);
        int i2 = this.h;
        this.e = ((float) i2) * 0.083333336f;
        this.f = ((float) i2) * 0.1f;
        this.g = (int) (this.e * 4.0f);
        this.j = fr.c(context, R.color.gray_inactive);
        this.k = fr.c(context, R.color.white);
        this.d.setStyle(Style.FILL);
        this.d.setAntiAlias(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.graphics.Canvas r18, androidx.recyclerview.widget.RecyclerView r19) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r19.getWidth()
            int r2 = r0.i
            int r2 = r2 << 1
            int r1 = r1 - r2
            int r2 = r0.g
            int r2 = r1 / r2
            int r3 = r0.b
            int r2 = java.lang.Math.min(r3, r2)
            int r3 = r19.getHeight()
            int r4 = r0.h
            int r4 = r4 * 2
            int r4 = r4 / 5
            int r3 = r3 - r4
            int r4 = r0.i
            int r1 = r1 / 2
            int r4 = r4 + r1
            int r1 = r2 + -1
            int r5 = r0.g
            int r1 = r1 * r5
            int r1 = r1 / 2
            int r4 = r4 - r1
            int r1 = r0.b
            if (r1 <= r2) goto L_0x004a
            int r6 = r1 - r2
            float r1 = (float) r1
            r7 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r7
            float r6 = (float) r6
            float r7 = r6 / r7
            float r1 = r1 - r7
            int r1 = (int) r1
            float r7 = r0.c
            float r1 = (float) r1
            int r8 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r8 <= 0) goto L_0x004a
            float r7 = r7 - r1
            float r1 = java.lang.Math.min(r7, r6)
            goto L_0x004b
        L_0x004a:
            r1 = 0
        L_0x004b:
            r6 = 0
        L_0x004c:
            int r7 = r0.b
            if (r6 >= r7) goto L_0x0115
            float r7 = (float) r6
            float r8 = r7 - r1
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 < 0) goto L_0x010a
            float r9 = (float) r2
            int r10 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r10 >= 0) goto L_0x010a
            float r10 = r0.c
            r11 = 1065336439(0x3f7fbe77, float:0.999)
            float r12 = r10 - r11
            r13 = 1065353216(0x3f800000, float:1.0)
            int r12 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r12 < 0) goto L_0x00d6
            float r11 = r11 + r10
            int r11 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x0071
            goto L_0x00d6
        L_0x0071:
            int r9 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x0077
            float r7 = r7 - r10
            goto L_0x0079
        L_0x0077:
            float r7 = r10 - r7
        L_0x0079:
            float r7 = r13 - r7
            float r9 = r0.f
            float r9 = r9 * r7
            float r10 = r0.e
            float r13 = r13 - r7
            float r10 = r10 * r13
            float r9 = r9 + r10
            android.graphics.Paint r10 = r0.d
            int r11 = r0.k
            int r12 = r0.j
            int r14 = android.graphics.Color.alpha(r11)
            float r14 = (float) r14
            float r14 = r14 * r7
            int r15 = android.graphics.Color.alpha(r12)
            float r15 = (float) r15
            float r15 = r15 * r13
            float r14 = r14 + r15
            int r14 = (int) r14
            int r15 = android.graphics.Color.red(r11)
            float r15 = (float) r15
            float r15 = r15 * r7
            int r5 = android.graphics.Color.red(r12)
            float r5 = (float) r5
            float r5 = r5 * r13
            float r15 = r15 + r5
            int r5 = (int) r15
            int r15 = android.graphics.Color.green(r11)
            float r15 = (float) r15
            float r15 = r15 * r7
            r16 = r1
            int r1 = android.graphics.Color.green(r12)
            float r1 = (float) r1
            float r1 = r1 * r13
            float r15 = r15 + r1
            int r1 = (int) r15
            int r11 = android.graphics.Color.blue(r11)
            float r11 = (float) r11
            float r11 = r11 * r7
            int r7 = android.graphics.Color.blue(r12)
            float r7 = (float) r7
            float r7 = r7 * r13
            float r11 = r11 + r7
            int r7 = (int) r11
            int r1 = android.graphics.Color.argb(r14, r5, r1, r7)
            r10.setColor(r1)
            r1 = 0
            goto L_0x00fa
        L_0x00d6:
            r16 = r1
            r1 = 0
            int r5 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r5 >= 0) goto L_0x00e4
            float r5 = r0.e
            float r13 = r13 + r8
            float r5 = r5 * r13
        L_0x00e2:
            r9 = r5
            goto L_0x00f3
        L_0x00e4:
            float r5 = r9 - r13
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x00f0
            float r5 = r0.e
            float r9 = r9 - r8
            float r5 = r5 * r9
            goto L_0x00e2
        L_0x00f0:
            float r5 = r0.e
            goto L_0x00e2
        L_0x00f3:
            android.graphics.Paint r5 = r0.d
            int r7 = r0.j
            r5.setColor(r7)
        L_0x00fa:
            float r5 = (float) r4
            int r7 = r0.g
            float r7 = (float) r7
            float r8 = r8 * r7
            float r5 = r5 + r8
            float r7 = (float) r3
            android.graphics.Paint r8 = r0.d
            r10 = r18
            r10.drawCircle(r5, r7, r9, r8)
            goto L_0x010f
        L_0x010a:
            r10 = r18
            r16 = r1
            r1 = 0
        L_0x010f:
            int r6 = r6 + 1
            r1 = r16
            goto L_0x004c
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lpw.b(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView):void");
    }
}
