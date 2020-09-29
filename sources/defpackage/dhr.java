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

/* renamed from: dhr reason: default package */
final class dhr {
    static CountDownLatch a = new CountDownLatch(1);
    private static boolean b;
    /* access modifiers changed from: private */
    public static MessageDigest c;
    private static final Object d = new Object();
    private static final Object e = new Object();

    static String a(dci dci, String str) {
        byte[] bArr;
        byte[] a2 = dgw.a((dgw) dci);
        if (((Boolean) dqe.f().a(dtg.bJ)).booleanValue()) {
            Vector b2 = b(a2);
            if (b2 == null || b2.size() == 0) {
                bArr = a(dgw.a((dgw) c()), str, true);
            } else {
                dhn dhn = new dhn();
                dhn.a = new byte[b2.size()][];
                Iterator it = b2.iterator();
                int i = 0;
                while (it.hasNext()) {
                    int i2 = i + 1;
                    dhn.a[i] = a((byte[]) it.next(), str, false);
                    i = i2;
                }
                dhn.b = a(a2);
                bArr = dgw.a((dgw) dhn);
            }
        } else if (dji.a != null) {
            byte[] a3 = dji.a.a(a2, str != null ? str.getBytes() : new byte[0]);
            dhn dhn2 = new dhn();
            dhn2.a = new byte[][]{a3};
            dhn2.c = Integer.valueOf(2);
            bArr = dgw.a((dgw) dhn2);
        } else {
            throw new GeneralSecurityException();
        }
        return dhp.a(bArr, true);
    }

    static void a() {
        synchronized (e) {
            if (!b) {
                b = true;
                new Thread(new dhs(0)).start();
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
            bArr = dgw.a((dgw) c());
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
        for (dhu a2 : new dht().cN) {
            a2.a(array, bArr3);
        }
        if (str != null && str.length() > 0) {
            if (str.length() > 32) {
                str = str.substring(0, 32);
            }
            new dce(str.getBytes("UTF-8")).a(bArr3);
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

    private static dci c() {
        dci dci = new dci();
        dci.k = Long.valueOf(4096);
        return dci;
    }
}
