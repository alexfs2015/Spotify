package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: auk reason: default package */
public abstract class auk {
    public static final int A = ben.g("sidx");
    public static final int B = ben.g("moov");
    public static final int C = ben.g("mvhd");
    public static final int D = ben.g("trak");
    public static final int E = ben.g("mdia");
    public static final int F = ben.g("minf");
    public static final int G = ben.g("stbl");
    public static final int H = ben.g("avcC");
    public static final int I = ben.g("hvcC");
    public static final int J = ben.g("esds");
    public static final int K = ben.g("moof");
    public static final int L = ben.g("traf");
    public static final int M = ben.g("mvex");
    public static final int N = ben.g("mehd");
    public static final int O = ben.g("tkhd");
    public static final int P = ben.g("edts");
    public static final int Q = ben.g("elst");
    public static final int R = ben.g("mdhd");
    public static final int S = ben.g("hdlr");
    public static final int T = ben.g("stsd");
    public static final int U = ben.g("pssh");
    public static final int V = ben.g("sinf");
    public static final int W = ben.g("schm");
    public static final int X = ben.g("schi");
    public static final int Y = ben.g("tenc");
    public static final int Z = ben.g("encv");
    public static final int a = ben.g("ftyp");
    public static final int aA = ben.g("meta");
    public static final int aB = ben.g("ilst");
    public static final int aC = ben.g("mean");
    public static final int aD = ben.g("name");
    public static final int aE = ben.g("data");
    public static final int aF = ben.g("emsg");
    public static final int aG = ben.g("st3d");
    public static final int aH = ben.g("sv3d");
    public static final int aI = ben.g("proj");
    public static final int aJ = ben.g("vp08");
    public static final int aK = ben.g("vp09");
    public static final int aL = ben.g("vpcC");
    public static final int aM = ben.g("camm");
    public static final int aN = ben.g("alac");
    public static final int aO = ben.g("alaw");
    public static final int aP = ben.g("ulaw");
    public static final int aa = ben.g("enca");
    public static final int ab = ben.g("frma");
    public static final int ac = ben.g("saiz");
    public static final int ad = ben.g("saio");
    public static final int ae = ben.g("sbgp");
    public static final int af = ben.g("sgpd");
    public static final int ag = ben.g("uuid");
    public static final int ah = ben.g("senc");
    public static final int ai = ben.g("pasp");
    public static final int aj = ben.g("TTML");
    public static final int ak = ben.g("mp4v");
    public static final int al = ben.g("stts");
    public static final int am = ben.g("stss");
    public static final int an = ben.g("ctts");
    public static final int ao = ben.g("stsc");
    public static final int ap = ben.g("stsz");
    public static final int aq = ben.g("stz2");
    public static final int ar = ben.g("stco");
    public static final int as = ben.g("co64");
    public static final int at = ben.g("tx3g");
    public static final int au = ben.g("wvtt");
    public static final int av = ben.g("stpp");
    public static final int aw = ben.g("c608");
    public static final int ax = ben.g("samr");
    public static final int ay = ben.g("sawb");
    public static final int az = ben.g("udta");
    public static final int b = ben.g("avc1");
    public static final int c = ben.g("avc3");
    public static final int d = ben.g("hvc1");
    public static final int e = ben.g("hev1");
    public static final int f = ben.g("s263");
    public static final int g = ben.g("d263");
    public static final int h = ben.g("mdat");
    public static final int i = ben.g("mp4a");
    public static final int j = ben.g(".mp3");
    public static final int k = ben.g("wave");
    public static final int l = ben.g("lpcm");
    public static final int m = ben.g("sowt");
    public static final int n = ben.g("ac-3");
    public static final int o = ben.g("dac3");
    public static final int p = ben.g("ec-3");
    public static final int q = ben.g("dec3");
    public static final int r = ben.g("dtsc");
    public static final int s = ben.g("dtsh");
    public static final int t = ben.g("dtsl");
    public static final int u = ben.g("dtse");
    public static final int v = ben.g("ddts");
    public static final int w = ben.g("tfdt");
    public static final int x = ben.g("tfhd");
    public static final int y = ben.g("trex");
    public static final int z = ben.g("trun");
    public final int aQ;

    /* renamed from: auk$a */
    static final class a extends auk {
        public final long aR;
        public final List<b> aS = new ArrayList();
        public final List<a> aT = new ArrayList();

        public a(int i, long j) {
            super(i);
            this.aR = j;
        }

        public final void a(a aVar) {
            this.aT.add(aVar);
        }

        public final void a(b bVar) {
            this.aS.add(bVar);
        }

        public final b d(int i) {
            int size = this.aS.size();
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = (b) this.aS.get(i2);
                if (bVar.aQ == i) {
                    return bVar;
                }
            }
            return null;
        }

        public final a e(int i) {
            int size = this.aT.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar = (a) this.aT.get(i2);
                if (aVar.aQ == i) {
                    return aVar;
                }
            }
            return null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(c(this.aQ));
            sb.append(" leaves: ");
            sb.append(Arrays.toString(this.aS.toArray()));
            sb.append(" containers: ");
            sb.append(Arrays.toString(this.aT.toArray()));
            return sb.toString();
        }
    }

    /* renamed from: auk$b */
    static final class b extends auk {
        public final bea aR;

        public b(int i, bea bea) {
            super(i);
            this.aR = bea;
        }
    }

    static {
        ben.g("vmhd");
    }

    public auk(int i2) {
        this.aQ = i2;
    }

    public static int a(int i2) {
        return (i2 >> 24) & 255;
    }

    public static int b(int i2) {
        return i2 & 16777215;
    }

    public static String c(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) (i2 >>> 24));
        sb.append((char) ((i2 >> 16) & 255));
        sb.append((char) ((i2 >> 8) & 255));
        sb.append((char) (i2 & 255));
        return sb.toString();
    }

    public String toString() {
        return c(this.aQ);
    }
}
