package defpackage;

/* renamed from: ays reason: default package */
public final class ays implements b {
    final ayj[] a;
    private final int[] b;

    public ays(int[] iArr, ayj[] ayjArr) {
        this.b = iArr;
        this.a = ayjArr;
    }

    public final atu a(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.b;
            if (i2 >= iArr.length) {
                StringBuilder sb = new StringBuilder("Unmatched track of type: ");
                sb.append(i);
                bdu.d("BaseMediaChunkOutput", sb.toString());
                return new atj();
            } else if (i == iArr[i2]) {
                return this.a[i2];
            } else {
                i2++;
            }
        }
    }

    public final void a(long j) {
        ayj[] ayjArr;
        for (ayj ayj : this.a) {
            if (ayj != null) {
                ayj.a(j);
            }
        }
    }
}
