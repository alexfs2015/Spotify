package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: att reason: default package */
public abstract class att {
    public static final int A = bdw.g("sidx");
    public static final int B = bdw.g("moov");
    public static final int C = bdw.g("mvhd");
    public static final int D = bdw.g("trak");
    public static final int E = bdw.g("mdia");
    public static final int F = bdw.g("minf");
    public static final int G = bdw.g("stbl");
    public static final int H = bdw.g("avcC");
    public static final int I = bdw.g("hvcC");
    public static final int J = bdw.g("esds");
    public static final int K = bdw.g("moof");
    public static final int L = bdw.g("traf");
    public static final int M = bdw.g("mvex");
    public static final int N = bdw.g("mehd");
    public static final int O = bdw.g("tkhd");
    public static final int P = bdw.g("edts");
    public static final int Q = bdw.g("elst");
    public static final int R = bdw.g("mdhd");
    public static final int S = bdw.g("hdlr");
    public static final int T = bdw.g("stsd");
    public static final int U = bdw.g("pssh");
    public static final int V = bdw.g("sinf");
    public static final int W = bdw.g("schm");
    public static final int X = bdw.g("schi");
    public static final int Y = bdw.g("tenc");
    public static final int Z = bdw.g("encv");
    public static final int a = bdw.g("ftyp");
    public static final int aA = bdw.g("meta");
    public static final int aB = bdw.g("ilst");
    public static final int aC = bdw.g("mean");
    public static final int aD = bdw.g("name");
    public static final int aE = bdw.g("data");
    public static final int aF = bdw.g("emsg");
    public static final int aG = bdw.g("st3d");
    public static final int aH = bdw.g("sv3d");
    public static final int aI = bdw.g("proj");
    public static final int aJ = bdw.g("vp08");
    public static final int aK = bdw.g("vp09");
    public static final int aL = bdw.g("vpcC");
    public static final int aM = bdw.g("camm");
    public static final int aN = bdw.g("alac");
    public static final int aO = bdw.g("alaw");
    public static final int aP = bdw.g("ulaw");
    public static final int aa = bdw.g("enca");
    public static final int ab = bdw.g("frma");
    public static final int ac = bdw.g("saiz");
    public static final int ad = bdw.g("saio");
    public static final int ae = bdw.g("sbgp");
    public static final int af = bdw.g("sgpd");
    public static final int ag = bdw.g("uuid");
    public static final int ah = bdw.g("senc");
    public static final int ai = bdw.g("pasp");
    public static final int aj = bdw.g("TTML");
    public static final int ak = bdw.g("mp4v");
    public static final int al = bdw.g("stts");
    public static final int am = bdw.g("stss");
    public static final int an = bdw.g("ctts");
    public static final int ao = bdw.g("stsc");
    public static final int ap = bdw.g("stsz");
    public static final int aq = bdw.g("stz2");
    public static final int ar = bdw.g("stco");
    public static final int as = bdw.g("co64");
    public static final int at = bdw.g("tx3g");
    public static final int au = bdw.g("wvtt");
    public static final int av = bdw.g("stpp");
    public static final int aw = bdw.g("c608");
    public static final int ax = bdw.g("samr");
    public static final int ay = bdw.g("sawb");
    public static final int az = bdw.g("udta");
    public static final int b = bdw.g("avc1");
    public static final int c = bdw.g("avc3");
    public static final int d = bdw.g("hvc1");
    public static final int e = bdw.g("hev1");
    public static final int f = bdw.g("s263");
    public static final int g = bdw.g("d263");
    public static final int h = bdw.g("mdat");
    public static final int i = bdw.g("mp4a");
    public static final int j = bdw.g(".mp3");
    public static final int k = bdw.g("wave");
    public static final int l = bdw.g("lpcm");
    public static final int m = bdw.g("sowt");
    public static final int n = bdw.g("ac-3");
    public static final int o = bdw.g("dac3");
    public static final int p = bdw.g("ec-3");
    public static final int q = bdw.g("dec3");
    public static final int r = bdw.g("dtsc");
    public static final int s = bdw.g("dtsh");
    public static final int t = bdw.g("dtsl");
    public static final int u = bdw.g("dtse");
    public static final int v = bdw.g("ddts");
    public static final int w = bdw.g("tfdt");
    public static final int x = bdw.g("tfhd");
    public static final int y = bdw.g("trex");
    public static final int z = bdw.g("trun");
    public final int aQ;

    /* renamed from: att$a */
    static final class a extends att {
        public final long aR;
        public final List<b> aS = new ArrayList();
        public final List<a> aT = new ArrayList();

        public a(int i, long j) {
            super(i);
            this.aR = j;
        }

        public final void a(b bVar) {
            this.aS.add(bVar);
        }

        public final void a(a aVar) {
            this.aT.add(aVar);
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

    /* renamed from: att$b */
    static final class b extends att {
        public final bdj aR;

        public b(int i, bdj bdj) {
            super(i);
            this.aR = bdj;
        }
    }

    public static int a(int i2) {
        return (i2 >> 24) & 255;
    }

    public static int b(int i2) {
        return i2 & 16777215;
    }

    static {
        bdw.g("vmhd");
    }

    public att(int i2) {
        this.aQ = i2;
    }

    public String toString() {
        return c(this.aQ);
    }

    public static String c(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) (i2 >>> 24));
        sb.append((char) ((i2 >> 16) & 255));
        sb.append((char) ((i2 >> 8) & 255));
        sb.append((char) (i2 & 255));
        return sb.toString();
    }
}
