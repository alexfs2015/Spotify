package defpackage;

import java.util.ArrayList;

/* renamed from: wam reason: default package */
public final class wam extends wbq {
    /* access modifiers changed from: private */
    public static final int[] b;
    private final int c;
    private final int d;
    private final int e;

    /* renamed from: wam$a */
    final class a extends defpackage.wbq.a {
        private final int b;
        private final int c;
        private int d;
        private int e = wam.b[this.d];
        private boolean f;

        public a(int i, int i2, int i3) {
            super();
            this.b = i;
            this.c = i2;
            this.d = wam.c(i3);
        }

        public final int a() {
            return this.e;
        }

        public final void b() {
            int i = this.a;
            if (i > wam.b[Math.max(0, (this.d - 1) - 1)]) {
                if (i >= this.e) {
                    this.d = Math.min(this.d + 4, this.c);
                    this.e = wam.b[this.d];
                    this.f = false;
                }
            } else if (this.f) {
                this.d = Math.max(this.d - 1, this.b);
                this.e = wam.b[this.d];
                this.f = false;
            } else {
                this.f = true;
            }
        }
    }

    static {
        int i;
        ArrayList arrayList = new ArrayList();
        int i2 = 16;
        while (true) {
            if (i2 >= 512) {
                break;
            }
            arrayList.add(Integer.valueOf(i2));
            i2 += 16;
        }
        for (i = 512; i > 0; i <<= 1) {
            arrayList.add(Integer.valueOf(i));
        }
        b = new int[arrayList.size()];
        int i3 = 0;
        while (true) {
            int[] iArr = b;
            if (i3 < iArr.length) {
                iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
                i3++;
            } else {
                new wam();
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    public static int c(int i) {
        int length = b.length - 1;
        int i2 = 0;
        while (length >= i2) {
            if (length == i2) {
                return length;
            }
            int i3 = (i2 + length) >>> 1;
            int[] iArr = b;
            int i4 = iArr[i3];
            int i5 = i3 + 1;
            if (i > iArr[i5]) {
                i2 = i5;
            } else if (i >= i4) {
                return i == i4 ? i3 : i5;
            } else {
                length = i3 - 1;
            }
        }
        return i2;
    }

    public wam() {
        this(64, 1024, 65536);
    }

    private wam(int i, int i2, int i3) {
        int c2 = c(64);
        if (b[c2] < 64) {
            this.c = c2 + 1;
        } else {
            this.c = c2;
        }
        int c3 = c(65536);
        if (b[c3] > 65536) {
            this.d = c3 - 1;
        } else {
            this.d = c3;
        }
        this.e = 1024;
    }

    public final defpackage.wcb.a a() {
        return new a(this.c, this.d, this.e);
    }
}
