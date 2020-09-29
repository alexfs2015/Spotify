package com.google.protobuf;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class ByteString implements Serializable, Iterable<Byte> {
    public static final ByteString a = new LiteralByteString(fki.b);
    private static final b b;
    int hash = 0;

    static final class BoundedByteString extends LiteralByteString {
        private static final long serialVersionUID = 1;
        private final int bytesLength;
        private final int bytesOffset;

        BoundedByteString(byte[] bArr, int i, int i2) {
            super(bArr);
            b(i, i + i2, bArr.length);
            this.bytesOffset = i;
            this.bytesLength = i2;
        }

        public final int b() {
            return this.bytesLength;
        }

        /* access modifiers changed from: protected */
        public final int e() {
            return this.bytesOffset;
        }

        /* access modifiers changed from: protected */
        public final void a(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, this.bytesOffset, bArr, 0, i3);
        }

        /* access modifiers changed from: 0000 */
        public final Object writeReplace() {
            return ByteString.b(d());
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        public final byte a(int i) {
            int i2 = this.bytesLength;
            if (((i2 - (i + 1)) | i) >= 0) {
                return this.bytes[this.bytesOffset + i];
            }
            if (i < 0) {
                StringBuilder sb = new StringBuilder("Index < 0: ");
                sb.append(i);
                throw new ArrayIndexOutOfBoundsException(sb.toString());
            }
            StringBuilder sb2 = new StringBuilder("Index > length: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
    }

    static abstract class LeafByteString extends ByteString {
        LeafByteString() {
        }

        public /* synthetic */ Iterator iterator() {
            return ByteString.super.iterator();
        }
    }

    public static class LiteralByteString extends LeafByteString {
        private static final long serialVersionUID = 1;
        protected final byte[] bytes;

        /* access modifiers changed from: protected */
        public int e() {
            return 0;
        }

        public LiteralByteString(byte[] bArr) {
            this.bytes = bArr;
        }

        public byte a(int i) {
            return this.bytes[i];
        }

        public int b() {
            return this.bytes.length;
        }

        public final ByteString a(int i, int i2) {
            int b = b(i, i2, b());
            if (b == 0) {
                return ByteString.a;
            }
            return new BoundedByteString(this.bytes, e() + i, b);
        }

        /* access modifiers changed from: protected */
        public void a(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.bytes, 0, bArr, 0, i3);
        }

        /* access modifiers changed from: 0000 */
        public final void a(fkb fkb) {
            fkb.a(this.bytes, e(), b());
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ByteString) || b() != ((ByteString) obj).b()) {
                return false;
            }
            if (b() == 0) {
                return true;
            }
            if (!(obj instanceof LiteralByteString)) {
                return obj.equals(this);
            }
            LiteralByteString literalByteString = (LiteralByteString) obj;
            int i = this.hash;
            int i2 = literalByteString.hash;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            int b = b();
            if (b <= literalByteString.b()) {
                int i3 = b + 0;
                if (i3 > literalByteString.b()) {
                    StringBuilder sb = new StringBuilder("Ran off end of other: ");
                    sb.append(0);
                    String str = ", ";
                    sb.append(str);
                    sb.append(b);
                    sb.append(str);
                    sb.append(literalByteString.b());
                    throw new IllegalArgumentException(sb.toString());
                } else if (!(literalByteString instanceof LiteralByteString)) {
                    return literalByteString.a(0, i3).equals(a(0, b));
                } else {
                    LiteralByteString literalByteString2 = literalByteString;
                    byte[] bArr = this.bytes;
                    byte[] bArr2 = literalByteString2.bytes;
                    int e = e() + b;
                    int e2 = e();
                    int e3 = literalByteString2.e();
                    while (e2 < e) {
                        if (bArr[e2] != bArr2[e3]) {
                            return false;
                        }
                        e2++;
                        e3++;
                    }
                    return true;
                }
            } else {
                StringBuilder sb2 = new StringBuilder("Length too large: ");
                sb2.append(b);
                sb2.append(b());
                throw new IllegalArgumentException(sb2.toString());
            }
        }

        /* access modifiers changed from: protected */
        public final int a(int i, int i2, int i3) {
            return fki.a(i, this.bytes, e(), i3);
        }
    }

    static final class a implements b {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final byte[] a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    interface b {
        byte[] a(byte[] bArr, int i, int i2);
    }

    public interface c extends Iterator<Byte> {
    }

    public static final class d {
        public final CodedOutputStream a;
        public final byte[] b;

        /* synthetic */ d(int i, byte b2) {
            this(i);
        }

        private d(int i) {
            this.b = new byte[i];
            this.a = CodedOutputStream.a(this.b);
        }
    }

    static final class e implements b {
        private e() {
        }

        /* synthetic */ e(byte b) {
            this();
        }

        public final byte[] a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    public abstract byte a(int i);

    /* access modifiers changed from: protected */
    public abstract int a(int i, int i2, int i3);

    public abstract ByteString a(int i, int i2);

    /* access modifiers changed from: 0000 */
    public abstract void a(fkb fkb);

    /* access modifiers changed from: protected */
    public abstract void a(byte[] bArr, int i, int i2, int i3);

    public abstract int b();

    public abstract boolean equals(Object obj);

    static {
        boolean z;
        ByteString.class.desiredAssertionStatus();
        try {
            Class.forName("android.content.Context");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        b = z ? new e(0) : new a(0);
    }

    ByteString() {
    }

    /* renamed from: a */
    public final c iterator() {
        return new c() {
            private int a = 0;
            private final int b = ByteString.this.b();

            public final boolean hasNext() {
                return this.a < this.b;
            }

            private byte a() {
                try {
                    ByteString byteString = ByteString.this;
                    int i = this.a;
                    this.a = i + 1;
                    return byteString.a(i);
                } catch (IndexOutOfBoundsException e) {
                    throw new NoSuchElementException(e.getMessage());
                }
            }

            public final void remove() {
                throw new UnsupportedOperationException();
            }

            public final /* synthetic */ Object next() {
                return Byte.valueOf(a());
            }
        };
    }

    public final boolean c() {
        return b() == 0;
    }

    public static ByteString a(byte[] bArr, int i, int i2) {
        return new LiteralByteString(b.a(bArr, i, i2));
    }

    public static ByteString a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static ByteString b(byte[] bArr) {
        return new LiteralByteString(bArr);
    }

    public static ByteString a(String str) {
        return new LiteralByteString(str.getBytes(fki.a));
    }

    public final byte[] d() {
        int b2 = b();
        if (b2 == 0) {
            return fki.b;
        }
        byte[] bArr = new byte[b2];
        a(bArr, 0, 0, b2);
        return bArr;
    }

    public final int hashCode() {
        int i = this.hash;
        if (i == 0) {
            int b2 = b();
            i = a(b2, 0, b2);
            if (i == 0) {
                i = 1;
            }
            this.hash = i;
        }
        return i;
    }

    public static d b(int i) {
        return new d(i, 0);
    }

    static int b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(b())});
    }
}
