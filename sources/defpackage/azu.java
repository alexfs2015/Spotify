package defpackage;

import android.text.Layout.Alignment;

/* renamed from: azu reason: default package */
final class azu extends azi implements Comparable<azu> {
    private int d;

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i = ((azu) obj).d;
        int i2 = this.d;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public azu(CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
        super(charSequence, alignment, f, 0, i2, f2, i3, Float.MIN_VALUE, z, i4);
        this.d = i5;
    }
}
