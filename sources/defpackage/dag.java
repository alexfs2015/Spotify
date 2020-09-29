package defpackage;

import com.google.android.gms.internal.ads.zzayw;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: dag reason: default package */
public final class dag implements cvy {
    private static final byte[] a = new byte[0];
    private final dai b;
    private final String c;
    private final byte[] d;
    private final zzayw e;
    private final dae f;

    public dag(ECPublicKey eCPublicKey, byte[] bArr, String str, zzayw zzayw, dae dae) {
        dak.a(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.b = new dai(eCPublicKey);
        this.d = bArr;
        this.c = str;
        this.e = zzayw;
        this.f = dae;
    }

    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        dai dai = this.b;
        String str = this.c;
        byte[] bArr4 = this.d;
        int a2 = this.f.a();
        zzayw zzayw = this.e;
        KeyPair a3 = dak.a(dai.a.getParams());
        ECPublicKey eCPublicKey = (ECPublicKey) a3.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) a3.getPrivate();
        ECPublicKey eCPublicKey2 = dai.a;
        ECParameterSpec params = eCPublicKey2.getParams();
        ECParameterSpec params2 = eCPrivateKey.getParams();
        if (!params.getCurve().equals(params2.getCurve()) || !params.getGenerator().equals(params2.getGenerator()) || !params.getOrder().equals(params2.getOrder()) || params.getCofactor() != params2.getCofactor()) {
            throw new GeneralSecurityException("invalid public key spec");
        }
        byte[] a4 = dak.a(eCPrivateKey, eCPublicKey2.getW());
        EllipticCurve curve = eCPublicKey.getParams().getCurve();
        ECPoint w = eCPublicKey.getW();
        dak.a(w, curve);
        int bitLength = (dak.a(curve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
        int i = dal.a[zzayw.ordinal()];
        int i2 = 1;
        if (i == 1) {
            int i3 = (bitLength * 2) + 1;
            byte[] bArr5 = new byte[i3];
            byte[] byteArray = w.getAffineX().toByteArray();
            byte[] byteArray2 = w.getAffineY().toByteArray();
            System.arraycopy(byteArray2, 0, bArr5, i3 - byteArray2.length, byteArray2.length);
            System.arraycopy(byteArray, 0, bArr5, (bitLength + 1) - byteArray.length, byteArray.length);
            bArr5[0] = 4;
            bArr3 = bArr5;
        } else if (i == 2) {
            int i4 = bitLength + 1;
            bArr3 = new byte[i4];
            byte[] byteArray3 = w.getAffineX().toByteArray();
            System.arraycopy(byteArray3, 0, bArr3, i4 - byteArray3.length, byteArray3.length);
            bArr3[0] = (byte) (w.getAffineY().testBit(0) ? 3 : 2);
        } else {
            String valueOf = String.valueOf(zzayw);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
            sb.append("invalid format:");
            sb.append(valueOf);
            throw new GeneralSecurityException(sb.toString());
        }
        byte[] a5 = dab.a(bArr3, a4);
        Mac mac = (Mac) dan.b.a(str);
        if (a2 <= mac.getMacLength() * 255) {
            if (bArr4 == null || bArr4.length == 0) {
                mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
            } else {
                mac.init(new SecretKeySpec(bArr4, str));
            }
            byte[] bArr6 = new byte[a2];
            mac.init(new SecretKeySpec(mac.doFinal(a5), str));
            byte[] bArr7 = new byte[0];
            int i5 = 0;
            while (true) {
                mac.update(bArr7);
                mac.update(bArr2);
                mac.update((byte) i2);
                bArr7 = mac.doFinal();
                if (bArr7.length + i5 >= a2) {
                    break;
                }
                System.arraycopy(bArr7, 0, bArr6, i5, bArr7.length);
                i5 += bArr7.length;
                i2++;
            }
            System.arraycopy(bArr7, 0, bArr6, i5, a2 - i5);
            daj daj = new daj(bArr3, bArr6);
            byte[] bArr8 = null;
            byte[] a6 = this.f.a(daj.b == null ? null : daj.b.a()).a(bArr, a);
            if (daj.a != null) {
                bArr8 = daj.a.a();
            }
            return ByteBuffer.allocate(bArr8.length + a6.length).put(bArr8).put(a6).array();
        }
        throw new GeneralSecurityException("size too large");
    }
}
