package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

@cfp
/* renamed from: dud reason: default package */
public final class dud extends dvo {
    private static final int h = Color.rgb(12, 174, 206);
    private static final int i = Color.rgb(204, 204, 204);
    private static final int j = h;
    final List<duh> a = new ArrayList();
    final int b;
    final int c;
    final int d;
    final int e;
    final int f;
    final boolean g;
    private final String k;
    private final List<dvr> l = new ArrayList();

    public dud(String str, List<duh> list, Integer num, Integer num2, Integer num3, int i2, int i3, boolean z) {
        this.k = str;
        if (list != null) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                duh duh = (duh) list.get(i4);
                this.a.add(duh);
                this.l.add(duh);
            }
        }
        this.b = num != null ? num.intValue() : i;
        this.c = num2 != null ? num2.intValue() : j;
        this.d = num3 != null ? num3.intValue() : 12;
        this.e = i2;
        this.f = i3;
        this.g = z;
    }

    public final String a() {
        return this.k;
    }

    public final List<dvr> b() {
        return this.l;
    }
}
