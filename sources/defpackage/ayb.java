package defpackage;

/* renamed from: ayb reason: default package */
public final class ayb implements b {
    final axs[] a;
    private final int[] b;

    public ayb(int[] iArr, axs[] axsArr) {
        this.b = iArr;
        this.a = axsArr;
    }

    public final atd a(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.b;
            if (i2 >= iArr.length) {
                StringBuilder sb = new StringBuilder("Unmatched track of type: ");
                sb.append(i);
                bdd.d("BaseMediaChunkOutput", sb.toString());
                return new ass();
            } else if (i == iArr[i2]) {
                return this.a[i2];
            } else {
                i2++;
            }
        }
    }

    public final void a(long j) {
        axs[] axsArr;
        for (axs axs : this.a) {
            if (axs != null) {
                axs.a(j);
            }
        }
    }
}
