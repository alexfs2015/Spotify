package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: dha reason: default package */
final class dha {
    static CountDownLatch a = new CountDownLatch(1);
    private static boolean b = false;
    /* access modifiers changed from: private */
    public static MessageDigest c;
    private static final Object d = new Object();
    private static final Object e = new Object();

    static String a(dbr dbr, String str) {
        byte[] bArr;
        byte[] a2 = dgf.a((dgf) dbr);
        if (((Boolean) dpn.f().a(dsp.bJ)).booleanValue()) {
            Vector b2 = b(a2);
            if (b2 == null || b2.size() == 0) {
                bArr = a(dgf.a((dgf) c()), str, true);
            } else {
                dgw dgw = new dgw();
                dgw.a = new byte[b2.size()][];
                Iterator it = b2.iterator();
                int i = 0;
                while (it.hasNext()) {
                    int i2 = i + 1;
                    dgw.a[i] = a((byte[]) it.next(), str, false);
                    i = i2;
                }
                dgw.b = a(a2);
                bArr = dgf.a((dgf) dgw);
            }
        } else if (dir.a != null) {
            byte[] a3 = dir.a.a(a2, str != null ? str.getBytes() : new byte[0]);
            dgw dgw2 = new dgw();
            dgw2.a = new byte[][]{a3};
            dgw2.c = Integer.valueOf(2);
            bArr = dgf.a((dgf) dgw2);
        } else {
            throw new GeneralSecurityException();
        }
        return dgy.a(bArr, true);
    }

    static void a() {
        synchronized (e) {
            if (!b) {
                b = true;
                new Thread(new dhb(0)).start();
            }
        }
    }

    public static byte[] a(byte[] bArr) {
        byte[] digest;
        synchronized (d) {
            MessageDigest b2 = b();
            if (b2 != null) {
                b2.reset();
                b2.update(bArr);
                digest = c.digest();
            } else {
                throw new NoSuchAlgorithmException("Cannot compute hash");
            }
        }
        return digest;
    }

    private static byte[] a(byte[] bArr, String str, boolean z) {
        ByteBuffer byteBuffer;
        int i = z ? 239 : 255;
        if (bArr.length > i) {
            bArr = dgf.a((dgf) c());
        }
        if (bArr.length < i) {
            byte[] bArr2 = new byte[(i - bArr.length)];
            new SecureRandom().nextBytes(bArr2);
            byteBuffer = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr).put(bArr2);
        } else {
            byteBuffer = ByteBuffer.allocate(i + 1).put((byte) bArr.length).put(bArr);
        }
        byte[] array = byteBuffer.array();
        if (z) {
            array = ByteBuffer.allocate(256).put(a(array)).put(array).array();
        }
        byte[] bArr3 = new byte[256];
        for (dhd a2 : new dhc().cN) {
            a2.a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new dbn(str.getBytes("UTF-8")).a(bArr3);
        }
        return bArr3;
    }

    private static MessageDigest b() {
        boolean z;
        a();
        try {
            z = a.await(2, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            z = false;
        }
        if (!z) {
            return null;
        }
        MessageDigest messageDigest = c;
        if (messageDigest == null) {
            return null;
        }
        return messageDigest;
    }

    private static Vector<byte[]> b(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        int length = ((bArr.length + 255) - 1) / 255;
        Vector<byte[]> vector = new Vector<>();
        int i = 0;
        while (i < length) {
            int i2 = i * 255;
            try {
                vector.add(Arrays.copyOfRange(bArr, i2, bArr.length - i2 > 255 ? i2 + 255 : bArr.length));
                i++;
            } catch (IndexOutOfBoundsException unused) {
                return null;
            }
        }
        return vector;
    }

    private static dbr c() {
        dbr dbr = new dbr();
        dbr.k = Long.valueOf(4096);
        return dbr;
    }
}
