package defpackage;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: bbo reason: default package */
final class bbo implements bac {
    private final List<bbk> a;
    private final int b;
    private final long[] c = new long[(this.b * 2)];
    private final long[] d;

    public bbo(List<bbk> list) {
        this.a = list;
        this.b = list.size();
        for (int i = 0; i < this.b; i++) {
            bbk bbk = (bbk) list.get(i);
            int i2 = i << 1;
            this.c[i2] = bbk.d;
            this.c[i2 + 1] = bbk.e;
        }
        long[] jArr = this.c;
        this.d = Arrays.copyOf(jArr, jArr.length);
        Arrays.sort(this.d);
    }

    public final int a(long j) {
        int b2 = ben.b(this.d, j, false, false);
        if (b2 < this.d.length) {
            return b2;
        }
        return -1;
    }

    public final int b() {
        return this.d.length;
    }

    public final List<azz> b(long j) {
        SpannableStringBuilder spannableStringBuilder = null;
        bbk bbk = null;
        ArrayList arrayList = null;
        for (int i = 0; i < this.b; i++) {
            long[] jArr = this.c;
            int i2 = i << 1;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                bbk bbk2 = (bbk) this.a.get(i);
                if (!(bbk2.b == Float.MIN_VALUE && bbk2.c == Float.MIN_VALUE)) {
                    arrayList.add(bbk2);
                } else if (bbk == null) {
                    bbk = bbk2;
                } else {
                    String str = "\n";
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append(bbk.a).append(str).append(bbk2.a);
                    } else {
                        spannableStringBuilder.append(str).append(bbk2.a);
                    }
                }
            }
        }
        if (spannableStringBuilder != null) {
            arrayList.add(new bbk(spannableStringBuilder));
        } else if (bbk != null) {
            arrayList.add(bbk);
        }
        return arrayList != null ? arrayList : Collections.emptyList();
    }

    public final long b_(int i) {
        boolean z = true;
        bdl.a(i >= 0);
        if (i >= this.d.length) {
            z = false;
        }
        bdl.a(z);
        return this.d[i];
    }
}
