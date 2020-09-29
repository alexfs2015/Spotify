package okio;

import java.io.EOFException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class ByteString implements Serializable, Comparable<ByteString> {
    public static final ByteString a = a(new byte[0]);
    private static char[] c = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static final long serialVersionUID = 1;
    transient int b;
    private transient String d;
    final byte[] data;

    public ByteString(byte[] bArr) {
        this.data = bArr;
    }

    private static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - '0';
        }
        char c3 = 'a';
        if (c2 < 'a' || c2 > 'f') {
            c3 = 'A';
            if (c2 < 'A' || c2 > 'F') {
                StringBuilder sb = new StringBuilder("Unexpected hex digit: ");
                sb.append(c2);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return (c2 - c3) + 10;
    }

    public static ByteString a(String str) {
        if (str != null) {
            ByteString byteString = new ByteString(str.getBytes(xdi.a));
            byteString.d = str;
            return byteString;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static ByteString a(String str, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        } else if (charset != null) {
            return new ByteString(str.getBytes(charset));
        } else {
            throw new IllegalArgumentException("charset == null");
        }
    }

    public static ByteString a(byte... bArr) {
        if (bArr != null) {
            return new ByteString((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public static ByteString b(String str) {
        if (str != null) {
            byte[] a2 = xcp.a(str);
            if (a2 != null) {
                return new ByteString(a2);
            }
            return null;
        }
        throw new IllegalArgumentException("base64 == null");
    }

    public static ByteString c(String str) {
        if (str.length() % 2 == 0) {
            byte[] bArr = new byte[(str.length() / 2)];
            for (int i = 0; i < bArr.length; i++) {
                int i2 = i << 1;
                bArr[i] = (byte) ((a(str.charAt(i2)) << 4) + a(str.charAt(i2 + 1)));
            }
            return a(bArr);
        }
        StringBuilder sb = new StringBuilder("Unexpected hex string: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }

    private ByteString d(String str) {
        try {
            return a(MessageDigest.getInstance(str).digest(this.data));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int readInt = objectInputStream.readInt();
        if (objectInputStream == null) {
            throw new IllegalArgumentException("in == null");
        } else if (readInt >= 0) {
            byte[] bArr = new byte[readInt];
            int i = 0;
            while (i < readInt) {
                int read = objectInputStream.read(bArr, i, readInt - i);
                if (read != -1) {
                    i += read;
                } else {
                    throw new EOFException();
                }
            }
            ByteString byteString = new ByteString(bArr);
            try {
                Field declaredField = ByteString.class.getDeclaredField("data");
                declaredField.setAccessible(true);
                declaredField.set(this, byteString.data);
            } catch (NoSuchFieldException unused) {
                throw new AssertionError();
            } catch (IllegalAccessException unused2) {
                throw new AssertionError();
            }
        } else {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(readInt);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(this.data.length);
        objectOutputStream.write(this.data);
    }

    public byte a(int i) {
        return this.data[i];
    }

    public String a() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.data, xdi.a);
        this.d = str2;
        return str2;
    }

    public ByteString a(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.data;
            if (i2 <= bArr.length) {
                int i3 = i2 - i;
                if (i3 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i == 0 && i2 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i3];
                    System.arraycopy(this.data, i, bArr2, 0, i3);
                    return new ByteString(bArr2);
                }
            } else {
                StringBuilder sb = new StringBuilder("endIndex > length(");
                sb.append(this.data.length);
                sb.append(")");
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    public void a(xcq xcq) {
        byte[] bArr = this.data;
        xcq.c(bArr, 0, bArr.length);
    }

    public boolean a(int i, ByteString byteString, int i2, int i3) {
        return byteString.a(0, this.data, 0, i3);
    }

    public boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.data;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && xdi.a(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public String b() {
        return xcp.a(this.data);
    }

    public ByteString c() {
        return d("MD5");
    }

    public /* synthetic */ int compareTo(Object obj) {
        int i;
        ByteString byteString = (ByteString) obj;
        int h = h();
        int h2 = byteString.h();
        int min = Math.min(h, h2);
        int i2 = 0;
        while (true) {
            i = -1;
            if (i2 < min) {
                byte a2 = a(i2) & 255;
                byte a3 = byteString.a(i2) & 255;
                if (a2 == a3) {
                    i2++;
                } else if (a2 < a3) {
                    return i;
                } else {
                    return 1;
                }
            } else if (h == h2) {
                return 0;
            } else {
                if (h < h2) {
                    return -1;
                }
                i = 1;
            }
        }
        return i;
    }

    public ByteString d() {
        return d("SHA-1");
    }

    public ByteString e() {
        return d("SHA-256");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int h = byteString.h();
            byte[] bArr = this.data;
            return h == bArr.length && byteString.a(0, bArr, 0, bArr.length);
        }
    }

    public String f() {
        byte[] bArr = this.data;
        char[] cArr = new char[(bArr.length << 1)];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = c;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public ByteString g() {
        int i = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            if (b2 < 65 || b2 > 90) {
                i++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b3 = bArr2[i2];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr2[i2] = (byte) (b3 + 32);
                    }
                }
                return new ByteString(bArr2);
            }
        }
    }

    public int h() {
        return this.data.length;
    }

    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.data);
        this.b = hashCode;
        return hashCode;
    }

    public byte[] i() {
        return (byte[]) this.data.clone();
    }

    public String toString() {
        if (this.data.length == 0) {
            return "[size=0]";
        }
        String a2 = a();
        int length = a2.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                i = a2.length();
                break;
            } else if (i2 == 64) {
                break;
            } else {
                int codePointAt = a2.codePointAt(i);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i2++;
                    i += Character.charCount(codePointAt);
                }
            }
        }
        i = -1;
        String str = "…]";
        String str2 = "[size=";
        String str3 = "]";
        if (i != -1) {
            String replace = a2.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i < a2.length()) {
                StringBuilder sb = new StringBuilder(str2);
                sb.append(this.data.length);
                sb.append(" text=");
                sb.append(replace);
                sb.append(str);
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder("[text=");
            sb2.append(replace);
            sb2.append(str3);
            return sb2.toString();
        } else if (this.data.length <= 64) {
            StringBuilder sb3 = new StringBuilder("[hex=");
            sb3.append(f());
            sb3.append(str3);
            return sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder(str2);
            sb4.append(this.data.length);
            sb4.append(" hex=");
            sb4.append(a(0, 64).f());
            sb4.append(str);
            return sb4.toString();
        }
    }
}
