package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.upstream.cache.Cache.CacheException;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: bdd reason: default package */
final class bdd {
    final HashMap<String, bdc> a;
    final SparseArray<String> b;
    final bdm c;
    boolean d;
    private final Cipher e;
    private final SecretKeySpec f;
    private final boolean g;
    private bee h;

    public bdd(File file, byte[] bArr, boolean z) {
        this.g = z;
        boolean z2 = true;
        if (bArr != null) {
            if (bArr.length != 16) {
                z2 = false;
            }
            bdl.a(z2);
            try {
                this.e = d();
                this.f = new SecretKeySpec(bArr, "AES");
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
                throw new IllegalStateException(e2);
            }
        } else {
            bdl.b(!z);
            this.e = null;
            this.f = null;
        }
        this.a = new HashMap<>();
        this.b = new SparseArray<>();
        this.c = new bdm(new File(file, "cached_content_index.exi"));
    }

    private void a(bdc bdc) {
        this.a.put(bdc.b, bdc);
        this.b.put(bdc.a, bdc.b);
    }

    private static Cipher d() {
        String str = "AES/CBC/PKCS5PADDING";
        if (ben.a == 18) {
            try {
                return Cipher.getInstance(str, "BC");
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance(str);
    }

    public final bdc a(String str) {
        bdc bdc = (bdc) this.a.get(str);
        if (bdc != null) {
            return bdc;
        }
        SparseArray<String> sparseArray = this.b;
        int size = sparseArray.size();
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            int i = 0;
            while (keyAt < size && keyAt == sparseArray.keyAt(keyAt)) {
                i = keyAt + 1;
            }
        }
        bdc bdc2 = new bdc(keyAt, str);
        a(bdc2);
        this.d = true;
        return bdc2;
    }

    public final void a() {
        DataOutputStream dataOutputStream;
        Throwable e2;
        if (this.d) {
            try {
                OutputStream a2 = this.c.a();
                if (this.h == null) {
                    this.h = new bee(a2);
                } else {
                    this.h.a(a2);
                }
                dataOutputStream = new DataOutputStream(this.h);
                try {
                    dataOutputStream.writeInt(2);
                    dataOutputStream.writeInt(this.g ? 1 : 0);
                    if (this.g) {
                        byte[] bArr = new byte[16];
                        new Random().nextBytes(bArr);
                        dataOutputStream.write(bArr);
                        try {
                            this.e.init(1, this.f, new IvParameterSpec(bArr));
                            dataOutputStream.flush();
                            dataOutputStream = new DataOutputStream(new CipherOutputStream(this.h, this.e));
                        } catch (InvalidKeyException e3) {
                            e = e3;
                            throw new IllegalStateException(e);
                        } catch (InvalidAlgorithmParameterException e4) {
                            e = e4;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream.writeInt(this.a.size());
                    int i = 0;
                    for (bdc bdc : this.a.values()) {
                        bdc.a(dataOutputStream);
                        i += bdc.a(2);
                    }
                    dataOutputStream.writeInt(i);
                    bdm bdm = this.c;
                    dataOutputStream.close();
                    bdm.b.delete();
                    ben.a((Closeable) null);
                    this.d = false;
                } catch (IOException e5) {
                    e2 = e5;
                    try {
                        throw new CacheException(e2);
                    } catch (Throwable th) {
                        th = th;
                        ben.a((Closeable) dataOutputStream);
                        throw th;
                    }
                }
            } catch (IOException e6) {
                Throwable th2 = e6;
                dataOutputStream = null;
                e2 = th2;
                throw new CacheException(e2);
            } catch (Throwable th3) {
                Throwable th4 = th3;
                dataOutputStream = null;
                th = th4;
                ben.a((Closeable) dataOutputStream);
                throw th;
            }
        }
    }

    public final bdc b(String str) {
        return (bdc) this.a.get(str);
    }

    public final void b() {
        String[] strArr = new String[this.a.size()];
        this.a.keySet().toArray(strArr);
        for (String c2 : strArr) {
            c(c2);
        }
    }

    public final void c(String str) {
        bdc bdc = (bdc) this.a.get(str);
        if (bdc != null && bdc.c.isEmpty() && !bdc.e) {
            this.a.remove(str);
            this.b.remove(bdc.a);
            this.d = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c() {
        /*
            r12 = this;
            r0 = 0
            r1 = 0
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x00d7, all -> 0x00cf }
            bdm r3 = r12.c     // Catch:{ IOException -> 0x00d7, all -> 0x00cf }
            java.io.File r4 = r3.b     // Catch:{ IOException -> 0x00d7, all -> 0x00cf }
            boolean r4 = r4.exists()     // Catch:{ IOException -> 0x00d7, all -> 0x00cf }
            if (r4 == 0) goto L_0x001a
            java.io.File r4 = r3.a     // Catch:{ IOException -> 0x00d7, all -> 0x00cf }
            r4.delete()     // Catch:{ IOException -> 0x00d7, all -> 0x00cf }
            java.io.File r4 = r3.b     // Catch:{ IOException -> 0x00d7, all -> 0x00cf }
            java.io.File r5 = r3.a     // Catch:{ IOException -> 0x00d7, all -> 0x00cf }
            r4.renameTo(r5)     // Catch:{ IOException -> 0x00d7, all -> 0x00cf }
        L_0x001a:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00d7, all -> 0x00cf }
            java.io.File r3 = r3.a     // Catch:{ IOException -> 0x00d7, all -> 0x00cf }
            r4.<init>(r3)     // Catch:{ IOException -> 0x00d7, all -> 0x00cf }
            r2.<init>(r4)     // Catch:{ IOException -> 0x00d7, all -> 0x00cf }
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch:{ IOException -> 0x00d7, all -> 0x00cf }
            r3.<init>(r2)     // Catch:{ IOException -> 0x00d7, all -> 0x00cf }
            int r1 = r3.readInt()     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            if (r1 < 0) goto L_0x00c9
            r4 = 2
            if (r1 <= r4) goto L_0x0034
            goto L_0x00c9
        L_0x0034:
            int r5 = r3.readInt()     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            r6 = 1
            r5 = r5 & r6
            if (r5 == 0) goto L_0x006e
            javax.crypto.Cipher r5 = r12.e     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            if (r5 != 0) goto L_0x0044
            defpackage.ben.a(r3)
            return r0
        L_0x0044:
            r5 = 16
            byte[] r5 = new byte[r5]     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            r3.readFully(r5)     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            javax.crypto.spec.IvParameterSpec r7 = new javax.crypto.spec.IvParameterSpec     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            r7.<init>(r5)     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            javax.crypto.Cipher r5 = r12.e     // Catch:{ InvalidKeyException -> 0x0067, InvalidAlgorithmParameterException -> 0x0065 }
            javax.crypto.spec.SecretKeySpec r8 = r12.f     // Catch:{ InvalidKeyException -> 0x0067, InvalidAlgorithmParameterException -> 0x0065 }
            r5.init(r4, r8, r7)     // Catch:{ InvalidKeyException -> 0x0067, InvalidAlgorithmParameterException -> 0x0065 }
            java.io.DataInputStream r5 = new java.io.DataInputStream     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            javax.crypto.CipherInputStream r7 = new javax.crypto.CipherInputStream     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            javax.crypto.Cipher r8 = r12.e     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            r7.<init>(r2, r8)     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            r5.<init>(r7)     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            r3 = r5
            goto L_0x0074
        L_0x0065:
            r1 = move-exception
            goto L_0x0068
        L_0x0067:
            r1 = move-exception
        L_0x0068:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            r2.<init>(r1)     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            throw r2     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
        L_0x006e:
            boolean r2 = r12.g     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            if (r2 == 0) goto L_0x0074
            r12.d = r6     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
        L_0x0074:
            int r2 = r3.readInt()     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            r5 = 0
            r7 = 0
        L_0x007a:
            if (r5 >= r2) goto L_0x00ac
            int r8 = r3.readInt()     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            java.lang.String r9 = r3.readUTF()     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            bdc r10 = new bdc     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            r10.<init>(r8, r9)     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            if (r1 >= r4) goto L_0x009b
            long r8 = r3.readLong()     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            bdg r11 = new bdg     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            r11.<init>()     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            defpackage.bdf.a(r11, r8)     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            r10.a(r11)     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            goto L_0x00a1
        L_0x009b:
            bdh r8 = defpackage.bdh.a(r3)     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            r10.d = r8     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
        L_0x00a1:
            r12.a(r10)     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            int r8 = r10.a(r1)     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            int r7 = r7 + r8
            int r5 = r5 + 1
            goto L_0x007a
        L_0x00ac:
            int r1 = r3.readInt()     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            int r2 = r3.read()     // Catch:{ IOException -> 0x00c7, all -> 0x00cd }
            r4 = -1
            if (r2 != r4) goto L_0x00b9
            r2 = 1
            goto L_0x00ba
        L_0x00b9:
            r2 = 0
        L_0x00ba:
            if (r1 != r7) goto L_0x00c3
            if (r2 != 0) goto L_0x00bf
            goto L_0x00c3
        L_0x00bf:
            defpackage.ben.a(r3)
            return r6
        L_0x00c3:
            defpackage.ben.a(r3)
            return r0
        L_0x00c7:
            goto L_0x00d8
        L_0x00c9:
            defpackage.ben.a(r3)
            return r0
        L_0x00cd:
            r0 = move-exception
            goto L_0x00d1
        L_0x00cf:
            r0 = move-exception
            r3 = r1
        L_0x00d1:
            if (r3 == 0) goto L_0x00d6
            defpackage.ben.a(r3)
        L_0x00d6:
            throw r0
        L_0x00d7:
            r3 = r1
        L_0x00d8:
            if (r3 == 0) goto L_0x00dd
            defpackage.ben.a(r3)
        L_0x00dd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdd.c():boolean");
    }
}
