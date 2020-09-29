package defpackage;

import android.text.Layout.Alignment;
import android.text.SpannableStringBuilder;

/* renamed from: bat reason: default package */
public final class bat extends azi {
    public final long d;
    public final long e;

    /* renamed from: bat$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Alignment.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                android.text.Layout$Alignment[] r0 = android.text.Layout.Alignment.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.bat.AnonymousClass1.<clinit>():void");
        }
    }

    /* renamed from: bat$a */
    public static class a {
        long a;
        long b;
        SpannableStringBuilder c;
        Alignment d;
        float e;
        int f;
        int g;
        float h;
        int i;
        float j;

        public a() {
            a();
        }

        public final void a() {
            this.a = 0;
            this.b = 0;
            this.c = null;
            this.d = null;
            this.e = Float.MIN_VALUE;
            this.f = Integer.MIN_VALUE;
            this.g = Integer.MIN_VALUE;
            this.h = Float.MIN_VALUE;
            this.i = Integer.MIN_VALUE;
            this.j = Float.MIN_VALUE;
        }

        public final bat b() {
            if (this.h != Float.MIN_VALUE && this.i == Integer.MIN_VALUE) {
                c();
            }
            bat bat = new bat(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
            return bat;
        }

        private a c() {
            if (this.d == null) {
                this.i = Integer.MIN_VALUE;
            } else {
                int i2 = AnonymousClass1.a[this.d.ordinal()];
                if (i2 == 1) {
                    this.i = 0;
                } else if (i2 == 2) {
                    this.i = 1;
                } else if (i2 != 3) {
                    StringBuilder sb = new StringBuilder("Unrecognized alignment: ");
                    sb.append(this.d);
                    bdd.c("WebvttCueBuilder", sb.toString());
                    this.i = 0;
                } else {
                    this.i = 2;
                }
            }
            return this;
        }
    }

    public bat(CharSequence charSequence) {
        this(0, 0, charSequence);
    }

    private bat(long j, long j2, CharSequence charSequence) {
        this(0, 0, charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public bat(long j, long j2, CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3);
        this.d = j;
        this.e = j2;
    }
}
