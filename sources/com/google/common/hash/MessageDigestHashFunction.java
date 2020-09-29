package com.google.common.hash;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

final class MessageDigestHashFunction extends fdo implements Serializable {
    private final int bytes;
    private final MessageDigest prototype;
    private final boolean supportsClone;
    private final String toString;

    static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final String algorithmName;
        private final int bytes;
        private final String toString;

        /* synthetic */ SerializedForm(String str, int i, String str2, byte b) {
            this(str, i, str2);
        }

        private SerializedForm(String str, int i, String str2) {
            this.algorithmName = str;
            this.bytes = i;
            this.toString = str2;
        }

        private Object readResolve() {
            return new MessageDigestHashFunction(this.algorithmName, this.bytes, this.toString);
        }
    }

    static final class a extends fdm {
        private final MessageDigest a;
        private final int b;
        private boolean c;

        /* synthetic */ a(MessageDigest messageDigest, int i, byte b2) {
            this(messageDigest, i);
        }

        private a(MessageDigest messageDigest, int i) {
            this.a = messageDigest;
            this.b = i;
        }

        public final void a(byte b2) {
            b();
            this.a.update(b2);
        }

        public final void a(byte[] bArr, int i, int i2) {
            b();
            this.a.update(bArr, i, i2);
        }

        private void b() {
            fay.b(!this.c, "Cannot re-use a Hasher after calling hash() on it");
        }

        public final HashCode a() {
            b();
            this.c = true;
            if (this.b == this.a.getDigestLength()) {
                return HashCode.a(this.a.digest());
            }
            return HashCode.a(Arrays.copyOf(this.a.digest(), this.b));
        }
    }

    MessageDigestHashFunction(String str, String str2) {
        this.prototype = a(str);
        this.bytes = this.prototype.getDigestLength();
        this.toString = (String) fay.a(str2);
        this.supportsClone = a(this.prototype);
    }

    MessageDigestHashFunction(String str, int i, String str2) {
        this.toString = (String) fay.a(str2);
        this.prototype = a(str);
        int digestLength = this.prototype.getDigestLength();
        if (i >= 4 && i <= digestLength) {
            this.bytes = i;
            this.supportsClone = a(this.prototype);
            return;
        }
        throw new IllegalArgumentException(fbc.a("bytes (%s) must be >= 4 and < %s", Integer.valueOf(i), Integer.valueOf(digestLength)));
    }

    private static boolean a(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    public final int b() {
        return this.bytes << 3;
    }

    public final String toString() {
        return this.toString;
    }

    private static MessageDigest a(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    public final fds a() {
        if (this.supportsClone) {
            try {
                return new a((MessageDigest) this.prototype.clone(), this.bytes, 0);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new a(a(this.prototype.getAlgorithm()), this.bytes, 0);
    }

    /* access modifiers changed from: 0000 */
    public final Object writeReplace() {
        return new SerializedForm(this.prototype.getAlgorithm(), this.bytes, this.toString, 0);
    }
}
