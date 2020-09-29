package defpackage;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.charset.Charset;
import java.util.List;

/* renamed from: bbe reason: default package */
public final class bbe extends baa {
    private static final int c = ben.g("styl");
    private static final int d = ben.g("tbox");
    private final bea e = new bea();
    private boolean f;
    private int g;
    private int h;
    private String i;
    private float j;
    private int k;

    public bbe(List<byte[]> list) {
        super("Tx3gDecoder");
        String str = "sans-serif";
        boolean z = false;
        if (list != null && list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.g = bArr[24];
            this.h = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            if ("Serif".equals(ben.a(bArr, 43, bArr.length - 43))) {
                str = "serif";
            }
            this.i = str;
            this.k = bArr[25] * 20;
            if ((bArr[0] & 32) != 0) {
                z = true;
            }
            this.f = z;
            if (this.f) {
                this.j = ((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) this.k);
                this.j = ben.a(this.j, 0.0f, 0.95f);
            } else {
                this.j = 0.85f;
            }
        } else {
            this.g = 0;
            this.h = -1;
            this.i = str;
            this.f = false;
            this.j = 0.85f;
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            int i7 = i6 | 33;
            boolean z = true;
            boolean z2 = (i2 & 1) != 0;
            boolean z3 = (i2 & 2) != 0;
            if (z2) {
                if (z3) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i4, i5, i7);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i4, i5, i7);
                }
            } else if (z3) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i4, i5, i7);
            }
            if ((i2 & 4) == 0) {
                z = false;
            }
            if (z) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i4, i5, i7);
            }
            if (!z && !z2 && !z3) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i4, i5, i7);
            }
        }
    }

    private static void a(boolean z) {
        if (!z) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    private static void b(SpannableStringBuilder spannableStringBuilder, int i2, int i3, int i4, int i5, int i6) {
        if (i2 != i3) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i2 >>> 8) | ((i2 & 255) << 24)), i4, i5, i6 | 33);
        }
    }

    public final bac a(byte[] bArr, int i2, boolean z) {
        String str;
        this.e.a(bArr, i2);
        bea bea = this.e;
        a(bea.b() >= 2);
        int d2 = bea.d();
        if (d2 == 0) {
            str = "";
        } else {
            if (bea.b() >= 2) {
                char c2 = (char) (((bea.a[bea.b] & 255) << 8) | (bea.a[bea.b + 1] & 255));
                if (c2 == 65279 || c2 == 65534) {
                    str = bea.a(d2, Charset.forName("UTF-16"));
                }
            }
            str = bea.a(d2, Charset.forName("UTF-8"));
        }
        if (str.isEmpty()) {
            return bbf.a;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        a(spannableStringBuilder2, this.g, 0, 0, spannableStringBuilder.length(), 16711680);
        b(spannableStringBuilder2, this.h, -1, 0, spannableStringBuilder.length(), 16711680);
        String str2 = this.i;
        int length = spannableStringBuilder.length();
        if (str2 != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str2), 0, length, 16711713);
        }
        float f2 = this.j;
        while (this.e.b() >= 8) {
            int i3 = this.e.b;
            int i4 = this.e.i();
            int i5 = this.e.i();
            if (i5 == c) {
                a(this.e.b() >= 2);
                int d3 = this.e.d();
                int i6 = 0;
                while (i6 < d3) {
                    bea bea2 = this.e;
                    a(bea2.b() >= 12);
                    int d4 = bea2.d();
                    int d5 = bea2.d();
                    bea2.d(2);
                    int c3 = bea2.c();
                    bea2.d(1);
                    int i7 = bea2.i();
                    SpannableStringBuilder spannableStringBuilder3 = spannableStringBuilder;
                    int i8 = d4;
                    int i9 = d5;
                    int i10 = i6;
                    a(spannableStringBuilder3, c3, this.g, i8, i9, 0);
                    b(spannableStringBuilder3, i7, this.h, i8, i9, 0);
                    i6 = i10 + 1;
                }
            } else if (i5 == d && this.f) {
                a(this.e.b() >= 2);
                f2 = ben.a(((float) this.e.d()) / ((float) this.k), 0.0f, 0.95f);
            }
            this.e.c(i3 + i4);
        }
        azz azz = new azz(spannableStringBuilder, null, f2, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
        return new bbf(azz);
    }
}
