package defpackage;

/* renamed from: aud reason: default package */
public final class aud {
    public final boolean a;
    public final String b;
    public final a c;
    public final int d;
    public final byte[] e;

    public aud(boolean z, String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        int i4 = 1;
        bcu.a((i == 0) ^ (bArr2 == null));
        this.a = z;
        this.b = str;
        this.d = i;
        this.e = bArr2;
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case 3046605:
                    if (str.equals("cbc1")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 3049879:
                    if (str.equals("cenc")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 3049895:
                    if (str.equals("cens")) {
                        c2 = 1;
                        break;
                    }
                    break;
            }
            if (!(c2 == 0 || c2 == 1)) {
                if (c2 == 2 || c2 == 3) {
                    i4 = 2;
                } else {
                    StringBuilder sb = new StringBuilder("Unsupported protection scheme type '");
                    sb.append(str);
                    sb.append("'. Assuming AES-CTR crypto mode.");
                    bdd.c("TrackEncryptionBox", sb.toString());
                }
            }
        }
        this.c = new a(i4, bArr, i2, i3);
    }
}
