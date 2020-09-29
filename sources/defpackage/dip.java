package defpackage;

import com.google.android.gms.internal.ads.zzcl;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: dip reason: default package */
public final class dip {
    private static Cipher b;
    private static final Object c = new Object();
    private static final Object d = new Object();
    private final SecureRandom a = null;

    private static Cipher a() {
        Cipher cipher;
        synchronized (d) {
            if (b == null) {
                b = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = b;
        }
        return cipher;
    }

    public final String a(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv;
        if (bArr.length == 16) {
            try {
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (c) {
                    a().init(1, secretKeySpec, null);
                    doFinal = a().doFinal(bArr2);
                    iv = a().getIV();
                }
                int length = doFinal.length + iv.length;
                ByteBuffer allocate = ByteBuffer.allocate(length);
                allocate.put(iv).put(doFinal);
                allocate.flip();
                byte[] bArr3 = new byte[length];
                allocate.get(bArr3);
                return dhp.a(bArr3, false);
            } catch (NoSuchAlgorithmException e) {
                throw new zzcl(e);
            } catch (InvalidKeyException e2) {
                throw new zzcl(e2);
            } catch (IllegalBlockSizeException e3) {
                throw new zzcl(e3);
            } catch (NoSuchPaddingException e4) {
                throw new zzcl(e4);
            } catch (BadPaddingException e5) {
                throw new zzcl(e5);
            }
        } else {
            throw new zzcl();
        }
    }

    public final byte[] a(String str) {
        try {
            byte[] a2 = dhp.a(str, false);
            if (a2.length == 32) {
                byte[] bArr = new byte[16];
                ByteBuffer.wrap(a2, 4, 16).get(bArr);
                for (int i = 0; i < 16; i++) {
                    bArr[i] = (byte) (bArr[i] ^ 68);
                }
                return bArr;
            }
            throw new zzcl();
        } catch (IllegalArgumentException e) {
            throw new zzcl(e);
        }
    }

    public final byte[] a(byte[] bArr, String str) {
        byte[] doFinal;
        if (bArr.length == 16) {
            try {
                byte[] a2 = dhp.a(str, false);
                if (a2.length > 16) {
                    ByteBuffer allocate = ByteBuffer.allocate(a2.length);
                    allocate.put(a2);
                    allocate.flip();
                    byte[] bArr2 = new byte[16];
                    byte[] bArr3 = new byte[(a2.length - 16)];
                    allocate.get(bArr2);
                    allocate.get(bArr3);
                    SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                    synchronized (c) {
                        a().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                        doFinal = a().doFinal(bArr3);
                    }
                    return doFinal;
                }
                throw new zzcl();
            } catch (NoSuchAlgorithmException e) {
                throw new zzcl(e);
            } catch (InvalidKeyException e2) {
                throw new zzcl(e2);
            } catch (IllegalBlockSizeException e3) {
                throw new zzcl(e3);
            } catch (NoSuchPaddingException e4) {
                throw new zzcl(e4);
            } catch (BadPaddingException e5) {
                throw new zzcl(e5);
            } catch (InvalidAlgorithmParameterException e6) {
                throw new zzcl(e6);
            } catch (IllegalArgumentException e7) {
                throw new zzcl(e7);
            }
        } else {
            throw new zzcl();
        }
    }
}
