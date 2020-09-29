package defpackage;

import java.util.Arrays;

/* renamed from: wiy reason: default package */
public final class wiy implements Appendable, CharSequence {
    public char[] a;
    public int b;

    public wiy(int i) {
        if (i > 0) {
            this.a = new char[i];
            return;
        }
        StringBuilder sb = new StringBuilder("length: ");
        sb.append(i);
        sb.append(" (length: >= 1)");
        throw new IllegalArgumentException(sb.toString());
    }

    private wiy(char[] cArr) {
        if (cArr.length > 0) {
            this.a = cArr;
            this.b = cArr.length;
            return;
        }
        StringBuilder sb = new StringBuilder("length: ");
        sb.append(cArr.length);
        sb.append(" (length: >= 1)");
        throw new IllegalArgumentException(sb.toString());
    }

    public final int length() {
        return this.b;
    }

    public final char charAt(int i) {
        if (i <= this.b) {
            return this.a[i];
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: a */
    public final wiy append(char c) {
        try {
            char[] cArr = this.a;
            int i = this.b;
            this.b = i + 1;
            cArr[i] = c;
        } catch (IndexOutOfBoundsException unused) {
            char[] cArr2 = this.a;
            int length = cArr2.length << 1;
            if (length >= 0) {
                this.a = new char[length];
                System.arraycopy(cArr2, 0, this.a, 0, cArr2.length);
                this.a[this.b - 1] = c;
            } else {
                throw new IllegalStateException();
            }
        }
        return this;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public wiy append(CharSequence charSequence, int i, int i2) {
        if (charSequence.length() >= i2) {
            int i3 = i2 - i;
            char[] cArr = this.a;
            int length = cArr.length;
            int i4 = this.b;
            if (i3 > length - i4) {
                this.a = a(cArr, i4 + i3, i4);
            }
            if (charSequence instanceof wiy) {
                System.arraycopy(((wiy) charSequence).a, i, this.a, this.b, i3);
                this.b += i3;
                return this;
            }
            while (i < i2) {
                char[] cArr2 = this.a;
                int i5 = this.b;
                this.b = i5 + 1;
                cArr2[i5] = charSequence.charAt(i);
                i++;
            }
            return this;
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        return new String(this.a, 0, this.b);
    }

    public final String a(int i, int i2) {
        return new String(this.a, i, i2 - i);
    }

    private static char[] a(char[] cArr, int i, int i2) {
        int length = cArr.length;
        do {
            length <<= 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
        } while (i > length);
        char[] cArr2 = new char[length];
        System.arraycopy(cArr, 0, cArr2, 0, i2);
        return cArr2;
    }

    public final /* synthetic */ CharSequence subSequence(int i, int i2) {
        return new wiy(Arrays.copyOfRange(this.a, i, i2));
    }

    public final /* synthetic */ Appendable append(CharSequence charSequence) {
        return append(charSequence, 0, charSequence.length());
    }
}
