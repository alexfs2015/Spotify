package defpackage;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: bax reason: default package */
final class bax implements azl {
    private final List<bat> a;
    private final int b;
    private final long[] c = new long[(this.b * 2)];
    private final long[] d;

    public bax(List<bat> list) {
        this.a = list;
        this.b = list.size();
        for (int i = 0; i < this.b; i++) {
            bat bat = (bat) list.get(i);
            int i2 = i << 1;
            this.c[i2] = bat.d;
            this.c[i2 + 1] = bat.e;
        }
        long[] jArr = this.c;
        this.d = Arrays.copyOf(jArr, jArr.length);
        Arrays.sort(this.d);
    }

    public final int a(long j) {
        int b2 = bdw.b(this.d, j, false, false);
        if (b2 < this.d.length) {
            return b2;
        }
        return -1;
    }

    public final int b() {
        return this.d.length;
    }

    public final long b_(int i) {
        boolean z = true;
        bcu.a(i >= 0);
        if (i >= this.d.length) {
            z = false;
        }
        bcu.a(z);
        return this.d[i];
    }

    public final List<azi> b(long j) {
        SpannableStringBuilder spannableStringBuilder = null;
        bat bat = null;
        ArrayList arrayList = null;
        for (int i = 0; i < this.b; i++) {
            long[] jArr = this.c;
            int i2 = i << 1;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                bat bat2 = (bat) this.a.get(i);
                if (!(bat2.b == Float.MIN_VALUE && bat2.c == Float.MIN_VALUE)) {
                    arrayList.add(bat2);
                } else if (bat == null) {
                    bat = bat2;
                } else {
                    String str = "\n";
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append(bat.a).append(str).append(bat2.a);
                    } else {
                        spannableStringBuilder.append(str).append(bat2.a);
                    }
                }
            }
        }
        if (spannableStringBuilder != null) {
            arrayList.add(new bat(spannableStringBuilder));
        } else if (bat != null) {
            arrayList.add(bat);
        }
        if (arrayList != null) {
            return arrayList;
        }
        return Collections.emptyList();
    }
}
