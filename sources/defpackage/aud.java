package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import com.comscore.streaming.AdType;
import com.google.android.exoplayer2.ParserException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* renamed from: aud reason: default package */
public final class aud implements atk {
    private static final byte[] G = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] H = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    private static final byte[] I = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] J = {32, 32, 32, 32, 32, 32, 32, 32, 32, 32};
    /* access modifiers changed from: private */
    public static final UUID K = new UUID(72057594037932032L, -9223371306706625679L);
    static final byte[] a = ben.c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    int[] A;
    int B;
    int C;
    int D;
    boolean E;
    atm F;
    private final aub L;
    private final bea M;
    private final bea N;
    private final bea O;
    private final bea P;
    private final bea Q;
    private final bea R;
    private final bea S;
    private ByteBuffer T;
    private long U;
    private int V;
    private boolean W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private byte aa;
    private int ab;
    private int ac;
    private int ad;
    private boolean ae;
    final auf b;
    final SparseArray<b> c;
    final boolean d;
    final bea e;
    final bea f;
    long g;
    long h;
    long i;
    long j;
    long k;
    b l;
    boolean m;
    int n;
    long o;
    boolean p;
    long q;
    long r;
    bdv s;
    bdv t;
    boolean u;
    int v;
    long w;
    long x;
    int y;
    int z;

    /* renamed from: aud$a */
    final class a implements auc {
        private a() {
        }

        /* synthetic */ a(aud aud, byte b) {
            this();
        }

        public final int a(int i) {
            switch (i) {
                case 131:
                case 136:
                case 155:
                case 159:
                case 176:
                case 179:
                case 186:
                case 215:
                case AdType.BRANDED_ON_DEMAND_PRE_ROLL /*231*/:
                case 241:
                case 251:
                case 16980:
                case 17029:
                case 17143:
                case 18401:
                case 18408:
                case 20529:
                case 20530:
                case 21420:
                case 21432:
                case 21680:
                case 21682:
                case 21690:
                case 21930:
                case 21945:
                case 21946:
                case 21947:
                case 21948:
                case 21949:
                case 22186:
                case 22203:
                case 25188:
                case 2352003:
                case 2807729:
                    return 2;
                case 134:
                case 17026:
                case 2274716:
                    return 3;
                case 160:
                case 174:
                case 183:
                case 187:
                case 224:
                case 225:
                case 18407:
                case 19899:
                case 20532:
                case 20533:
                case 21936:
                case 21968:
                case 25152:
                case 28032:
                case 30320:
                case 290298740:
                case 357149030:
                case 374648427:
                case 408125543:
                case 440786851:
                case 475249515:
                case 524531317:
                    return 1;
                case 161:
                case 163:
                case 16981:
                case 18402:
                case 21419:
                case 25506:
                case 30322:
                    return 4;
                case 181:
                case 17545:
                case 21969:
                case 21970:
                case 21971:
                case 21972:
                case 21973:
                case 21974:
                case 21975:
                case 21976:
                case 21977:
                case 21978:
                    return 5;
                default:
                    return 0;
            }
        }

        public final void a(int i, double d) {
            aud aud = aud.this;
            if (i == 181) {
                aud.l.I = (int) d;
            } else if (i != 17545) {
                switch (i) {
                    case 21969:
                        aud.l.w = (float) d;
                        return;
                    case 21970:
                        aud.l.x = (float) d;
                        return;
                    case 21971:
                        aud.l.y = (float) d;
                        return;
                    case 21972:
                        aud.l.z = (float) d;
                        return;
                    case 21973:
                        aud.l.A = (float) d;
                        return;
                    case 21974:
                        aud.l.B = (float) d;
                        return;
                    case 21975:
                        aud.l.C = (float) d;
                        return;
                    case 21976:
                        aud.l.D = (float) d;
                        return;
                    case 21977:
                        aud.l.E = (float) d;
                        return;
                    case 21978:
                        aud.l.F = (float) d;
                        break;
                }
            } else {
                aud.j = (long) d;
            }
        }

        public final void a(int i, int i2, atl atl) {
            byte b;
            int i3 = i;
            int i4 = i2;
            atl atl2 = atl;
            aud aud = aud.this;
            int i5 = 4;
            int i6 = 0;
            int i7 = 1;
            if (i3 == 161 || i3 == 163) {
                if (aud.v == 0) {
                    aud.B = (int) aud.b.a(atl2, false, true, 8);
                    aud.C = aud.b.a;
                    aud.x = -9223372036854775807L;
                    aud.v = 1;
                    aud.e.a();
                }
                b bVar = (b) aud.c.get(aud.B);
                if (bVar == null) {
                    atl2.b(i4 - aud.C);
                    aud.v = 0;
                    return;
                }
                if (aud.v == 1) {
                    aud.a(atl2, 3);
                    int i8 = (aud.e.a[2] & 6) >> 1;
                    if (i8 == 0) {
                        aud.z = 1;
                        aud.A = aud.a(aud.A, 1);
                        aud.A[0] = (i4 - aud.C) - 3;
                    } else if (i3 == 163) {
                        aud.a(atl2, 4);
                        aud.z = (aud.e.a[3] & 255) + 1;
                        aud.A = aud.a(aud.A, aud.z);
                        if (i8 == 2) {
                            Arrays.fill(aud.A, 0, aud.z, ((i4 - aud.C) - 4) / aud.z);
                        } else if (i8 == 1) {
                            int i9 = 0;
                            for (int i10 = 0; i10 < aud.z - 1; i10++) {
                                aud.A[i10] = 0;
                                do {
                                    i5++;
                                    aud.a(atl2, i5);
                                    b = aud.e.a[i5 - 1] & 255;
                                    int[] iArr = aud.A;
                                    iArr[i10] = iArr[i10] + b;
                                } while (b == 255);
                                i9 += aud.A[i10];
                            }
                            aud.A[aud.z - 1] = ((i4 - aud.C) - i5) - i9;
                        } else if (i8 == 3) {
                            int i11 = 0;
                            int i12 = 0;
                            while (i11 < aud.z - i7) {
                                aud.A[i11] = i6;
                                int i13 = i5 + 1;
                                aud.a(atl2, i13);
                                int i14 = i13 - 1;
                                if (aud.e.a[i14] != 0) {
                                    long j = 0;
                                    int i15 = 0;
                                    while (true) {
                                        if (i15 >= 8) {
                                            break;
                                        }
                                        int i16 = i7 << (7 - i15);
                                        if ((aud.e.a[i14] & i16) != 0) {
                                            i13 += i15;
                                            aud.a(atl2, i13);
                                            j = (long) (aud.e.a[i14] & 255 & (i16 ^ -1));
                                            for (int i17 = i14 + 1; i17 < i13; i17++) {
                                                j = (j << 8) | ((long) (aud.e.a[i17] & 255));
                                            }
                                            if (i11 > 0) {
                                                j -= (1 << ((i15 * 7) + 6)) - 1;
                                            }
                                        } else {
                                            i15++;
                                            i7 = 1;
                                        }
                                    }
                                    int i18 = i13;
                                    long j2 = j;
                                    if (j2 < -2147483648L || j2 > 2147483647L) {
                                        throw new ParserException("EBML lacing sample size out of range.");
                                    }
                                    int i19 = (int) j2;
                                    int[] iArr2 = aud.A;
                                    if (i11 != 0) {
                                        i19 += aud.A[i11 - 1];
                                    }
                                    iArr2[i11] = i19;
                                    i12 += aud.A[i11];
                                    i11++;
                                    i5 = i18;
                                    i6 = 0;
                                    i7 = 1;
                                } else {
                                    throw new ParserException("No valid varint length mask found");
                                }
                            }
                            aud.A[aud.z - 1] = ((i4 - aud.C) - i5) - i12;
                        } else {
                            StringBuilder sb = new StringBuilder("Unexpected lacing value: ");
                            sb.append(i8);
                            throw new ParserException(sb.toString());
                        }
                    } else {
                        throw new ParserException("Lacing only supported in SimpleBlocks.");
                    }
                    aud.w = aud.r + aud.a((long) ((aud.e.a[0] << 8) | (aud.e.a[1] & 255)));
                    aud.D = ((bVar.c == 2 || (i3 == 163 && (aud.e.a[2] & 128) == 128)) ? 1 : 0) | ((aud.e.a[2] & 8) == 8 ? Integer.MIN_VALUE : 0);
                    aud.v = 2;
                    aud.y = 0;
                }
                if (i3 == 163) {
                    while (aud.y < aud.z) {
                        aud.a(atl2, bVar, aud.A[aud.y]);
                        aud.a(bVar, aud.w + ((long) ((aud.y * bVar.d) / 1000)));
                        aud.y++;
                    }
                    aud.v = 0;
                    return;
                }
                aud.a(atl2, bVar, aud.A[0]);
            } else if (i3 == 16981) {
                aud.l.f = new byte[i4];
                atl2.b(aud.l.f, 0, i4);
            } else if (i3 == 18402) {
                byte[] bArr = new byte[i4];
                atl2.b(bArr, 0, i4);
                aud.l.g = new defpackage.atu.a(1, bArr, 0, 0);
            } else if (i3 == 21419) {
                Arrays.fill(aud.f.a, 0);
                atl2.b(aud.f.a, 4 - i4, i4);
                aud.f.c(0);
                aud.n = (int) aud.f.g();
            } else if (i3 == 25506) {
                aud.l.h = new byte[i4];
                atl2.b(aud.l.h, 0, i4);
            } else if (i3 == 30322) {
                aud.l.o = new byte[i4];
                atl2.b(aud.l.o, 0, i4);
            } else {
                StringBuilder sb2 = new StringBuilder("Unexpected id: ");
                sb2.append(i3);
                throw new ParserException(sb2.toString());
            }
        }

        public final void a(int i, long j) {
            aud aud = aud.this;
            String str = " not supported";
            if (i != 20529) {
                if (i != 20530) {
                    boolean z = false;
                    switch (i) {
                        case 131:
                            aud.l.c = (int) j;
                            return;
                        case 136:
                            b bVar = aud.l;
                            if (j == 1) {
                                z = true;
                            }
                            bVar.N = z;
                            return;
                        case 155:
                            aud.x = aud.a(j);
                            return;
                        case 159:
                            aud.l.G = (int) j;
                            return;
                        case 176:
                            aud.l.j = (int) j;
                            return;
                        case 179:
                            aud.s.a(aud.a(j));
                            return;
                        case 186:
                            aud.l.k = (int) j;
                            return;
                        case 215:
                            aud.l.b = (int) j;
                            return;
                        case AdType.BRANDED_ON_DEMAND_PRE_ROLL /*231*/:
                            aud.r = aud.a(j);
                            return;
                        case 241:
                            if (!aud.u) {
                                aud.t.a(j);
                                aud.u = true;
                                return;
                            }
                            break;
                        case 251:
                            aud.E = true;
                            return;
                        case 16980:
                            if (j != 3) {
                                StringBuilder sb = new StringBuilder("ContentCompAlgo ");
                                sb.append(j);
                                sb.append(str);
                                throw new ParserException(sb.toString());
                            }
                            break;
                        case 17029:
                            if (j < 1 || j > 2) {
                                StringBuilder sb2 = new StringBuilder("DocTypeReadVersion ");
                                sb2.append(j);
                                sb2.append(str);
                                throw new ParserException(sb2.toString());
                            }
                        case 17143:
                            if (j != 1) {
                                StringBuilder sb3 = new StringBuilder("EBMLReadVersion ");
                                sb3.append(j);
                                sb3.append(str);
                                throw new ParserException(sb3.toString());
                            }
                            break;
                        case 18401:
                            if (j != 5) {
                                StringBuilder sb4 = new StringBuilder("ContentEncAlgo ");
                                sb4.append(j);
                                sb4.append(str);
                                throw new ParserException(sb4.toString());
                            }
                            break;
                        case 18408:
                            if (j != 1) {
                                StringBuilder sb5 = new StringBuilder("AESSettingsCipherMode ");
                                sb5.append(j);
                                sb5.append(str);
                                throw new ParserException(sb5.toString());
                            }
                            break;
                        case 21420:
                            aud.o = j + aud.h;
                            return;
                        case 21432:
                            int i2 = (int) j;
                            if (i2 == 0) {
                                aud.l.p = 0;
                                return;
                            } else if (i2 == 1) {
                                aud.l.p = 2;
                                return;
                            } else if (i2 == 3) {
                                aud.l.p = 1;
                                return;
                            } else if (i2 == 15) {
                                aud.l.p = 3;
                                return;
                            } else {
                                return;
                            }
                        case 21680:
                            aud.l.l = (int) j;
                            return;
                        case 21682:
                            aud.l.n = (int) j;
                            return;
                        case 21690:
                            aud.l.m = (int) j;
                            return;
                        case 21930:
                            b bVar2 = aud.l;
                            if (j == 1) {
                                z = true;
                            }
                            bVar2.M = z;
                            return;
                        case 22186:
                            aud.l.J = j;
                            return;
                        case 22203:
                            aud.l.K = j;
                            return;
                        case 25188:
                            aud.l.H = (int) j;
                            return;
                        case 2352003:
                            aud.l.d = (int) j;
                            return;
                        case 2807729:
                            aud.i = j;
                            return;
                        default:
                            switch (i) {
                                case 21945:
                                    int i3 = (int) j;
                                    if (i3 == 1) {
                                        aud.l.t = 2;
                                        return;
                                    } else if (i3 == 2) {
                                        aud.l.t = 1;
                                        return;
                                    } else {
                                        return;
                                    }
                                case 21946:
                                    int i4 = (int) j;
                                    if (i4 != 1) {
                                        if (i4 == 16) {
                                            aud.l.s = 6;
                                            return;
                                        } else if (i4 == 18) {
                                            aud.l.s = 7;
                                            return;
                                        } else if (!(i4 == 6 || i4 == 7)) {
                                            return;
                                        }
                                    }
                                    aud.l.s = 3;
                                    return;
                                case 21947:
                                    aud.l.q = true;
                                    int i5 = (int) j;
                                    if (i5 == 1) {
                                        aud.l.r = 1;
                                        return;
                                    } else if (i5 == 9) {
                                        aud.l.r = 6;
                                        return;
                                    } else if (i5 == 4 || i5 == 5 || i5 == 6 || i5 == 7) {
                                        aud.l.r = 2;
                                        return;
                                    } else {
                                        return;
                                    }
                                case 21948:
                                    aud.l.u = (int) j;
                                    return;
                                case 21949:
                                    aud.l.v = (int) j;
                                    break;
                            }
                    }
                } else if (j != 1) {
                    StringBuilder sb6 = new StringBuilder("ContentEncodingScope ");
                    sb6.append(j);
                    sb6.append(str);
                    throw new ParserException(sb6.toString());
                }
            } else if (j != 0) {
                StringBuilder sb7 = new StringBuilder("ContentEncodingOrder ");
                sb7.append(j);
                sb7.append(str);
                throw new ParserException(sb7.toString());
            }
        }

        public final void a(int i, long j, long j2) {
            aud aud = aud.this;
            if (i == 160) {
                aud.E = false;
            } else if (i == 174) {
                aud.l = new b(0);
            } else if (i == 187) {
                aud.u = false;
            } else if (i == 19899) {
                aud.n = -1;
                aud.o = -1;
            } else if (i != 20533) {
                if (i != 21968) {
                    if (i != 25152) {
                        if (i != 408125543) {
                            if (i == 475249515) {
                                aud.s = new bdv();
                                aud.t = new bdv();
                                return;
                            } else if (i == 524531317 && !aud.m) {
                                if (!aud.d || aud.q == -1) {
                                    aud.F.a(new defpackage.ats.b(aud.k));
                                    aud.m = true;
                                    return;
                                }
                                aud.p = true;
                                return;
                            }
                        } else if (aud.h == -1 || aud.h == j) {
                            aud.h = j;
                            aud.g = j2;
                        } else {
                            throw new ParserException("Multiple Segment elements not supported");
                        }
                    }
                    return;
                }
                aud.l.q = true;
            } else {
                aud.l.e = true;
            }
        }

        public final void a(int i, String str) {
            aud aud = aud.this;
            if (i != 134) {
                if (i != 17026) {
                    if (i == 2274716) {
                        aud.l.O = str;
                    }
                } else if (!"webm".equals(str) && !"matroska".equals(str)) {
                    StringBuilder sb = new StringBuilder("DocType ");
                    sb.append(str);
                    sb.append(" not supported");
                    throw new ParserException(sb.toString());
                }
                return;
            }
            aud.l.a = str;
        }

        public final boolean b(int i) {
            return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:239:0x0421, code lost:
            r20 = r3;
            r3 = null;
            r14 = r12;
            r17 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:255:0x049f, code lost:
            r3 = null;
            r14 = r12;
            r17 = 4096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:263:0x0543, code lost:
            r3 = r11;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:272:0x055c, code lost:
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:273:0x055d, code lost:
            r14 = r12;
            r17 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:274:0x0560, code lost:
            r20 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:275:0x0562, code lost:
            r11 = r1.N | false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:276:0x0567, code lost:
            if (r1.M == false) goto L_0x056b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:277:0x0569, code lost:
            r12 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:278:0x056b, code lost:
            r12 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:279:0x056c, code lost:
            r11 = r11 | r12;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:280:0x0571, code lost:
            if (defpackage.bdx.a(r14) == false) goto L_0x0595;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:281:0x0573, code lost:
            r3 = defpackage.aqv.a(java.lang.Integer.toString(r10), r14, (java.lang.String) null, -1, r17, r1.G, r1.I, r20, r3, r1.i, r11 ? 1 : 0, r1.O);
            r4 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:283:0x0599, code lost:
            if (defpackage.bdx.b(r14) == false) goto L_0x06ca;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:285:0x059d, code lost:
            if (r1.n != 0) goto L_0x05b5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:287:0x05a1, code lost:
            if (r1.l != -1) goto L_0x05a6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:288:0x05a3, code lost:
            r6 = r1.j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:289:0x05a6, code lost:
            r6 = r1.l;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:290:0x05a8, code lost:
            r1.l = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:291:0x05ac, code lost:
            if (r1.m != -1) goto L_0x05b1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:292:0x05ae, code lost:
            r6 = r1.k;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:293:0x05b1, code lost:
            r6 = r1.m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:294:0x05b3, code lost:
            r1.m = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:296:0x05b9, code lost:
            if (r1.l == -1) goto L_0x05d1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:298:0x05bd, code lost:
            if (r1.m == -1) goto L_0x05d1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:299:0x05bf, code lost:
            r23 = ((float) (r1.k * r1.l)) / ((float) (r1.j * r1.m));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:300:0x05d1, code lost:
            r23 = -1.0f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:302:0x05d5, code lost:
            if (r1.q == false) goto L_0x06a1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:304:0x05db, code lost:
            if (r1.w == -1.0f) goto L_0x0692;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:306:0x05e1, code lost:
            if (r1.x == -1.0f) goto L_0x0692;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:308:0x05e7, code lost:
            if (r1.y == -1.0f) goto L_0x0692;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:310:0x05ed, code lost:
            if (r1.z == -1.0f) goto L_0x0692;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:312:0x05f3, code lost:
            if (r1.A == -1.0f) goto L_0x0692;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:314:0x05f9, code lost:
            if (r1.B == -1.0f) goto L_0x0692;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:316:0x05ff, code lost:
            if (r1.C == -1.0f) goto L_0x0692;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:318:0x0605, code lost:
            if (r1.D == -1.0f) goto L_0x0692;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:320:0x060b, code lost:
            if (r1.E == -1.0f) goto L_0x0692;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:322:0x0611, code lost:
            if (r1.F != -1.0f) goto L_0x0615;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:323:0x0615, code lost:
            r6 = new byte[25];
            r8 = java.nio.ByteBuffer.wrap(r6);
            r8.put(0);
            r8.putShort((short) ((int) ((r1.w * 50000.0f) + 0.5f)));
            r8.putShort((short) ((int) ((r1.x * 50000.0f) + 0.5f)));
            r8.putShort((short) ((int) ((r1.y * 50000.0f) + 0.5f)));
            r8.putShort((short) ((int) ((r1.z * 50000.0f) + 0.5f)));
            r8.putShort((short) ((int) ((r1.A * 50000.0f) + 0.5f)));
            r8.putShort((short) ((int) ((r1.B * 50000.0f) + 0.5f)));
            r8.putShort((short) ((int) ((r1.C * 50000.0f) + 0.5f)));
            r8.putShort((short) ((int) ((r1.D * 50000.0f) + 0.5f)));
            r8.putShort((short) ((int) (r1.E + 0.5f)));
            r8.putShort((short) ((int) (r1.F + 0.5f)));
            r8.putShort((short) r1.u);
            r8.putShort((short) r1.v);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:324:0x0692, code lost:
            r6 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:325:0x0693, code lost:
            r26 = new defpackage.beq(r1.r, r1.t, r1.s, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:326:0x06a1, code lost:
            r26 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:327:0x06a3, code lost:
            r3 = defpackage.aqv.a(java.lang.Integer.toString(r10), r14, (java.lang.String) null, -1, r17, r1.j, r1.k, -1.0f, r3, -1, r23, r1.o, r1.p, r26, r1.i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:329:0x06d0, code lost:
            if ("application/x-subrip".equals(r14) == false) goto L_0x06e1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:330:0x06d2, code lost:
            r3 = defpackage.aqv.a(java.lang.Integer.toString(r10), r14, r11 ? 1 : 0, r1.O, r1.i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:331:0x06de, code lost:
            r4 = 3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:333:0x06e7, code lost:
            if ("text/x-ssa".equals(r14) == false) goto L_0x0717;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:334:0x06e9, code lost:
            r3 = new java.util.ArrayList(2);
            r3.add(defpackage.aud.a);
            r3.add(r1.h);
            r3 = defpackage.aqv.a(java.lang.Integer.toString(r10), r14, (java.lang.String) null, -1, r11 ? 1 : 0, r1.O, -1, r1.i, Long.MAX_VALUE, (java.util.List<byte[]>) r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:336:0x071d, code lost:
            if ("application/vobsub".equals(r14) != false) goto L_0x0738;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:338:0x0725, code lost:
            if ("application/pgs".equals(r14) != false) goto L_0x0738;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:340:0x072d, code lost:
            if ("application/dvbsubs".equals(r14) == false) goto L_0x0730;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:342:0x0737, code lost:
            throw new com.google.android.exoplayer2.ParserException("Unexpected MIME type.");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:343:0x0738, code lost:
            r3 = defpackage.aqv.a(java.lang.Integer.toString(r10), r14, (java.lang.String) null, -1, r11 ? 1 : 0, r3, r1.O, r1.i);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:344:0x0750, code lost:
            r1.P = r9.a(r1.b, r4);
            r1.P.a(r3);
            r2.c.put(r2.l.b, r2.l);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(int r29) {
            /*
                r28 = this;
                r0 = r28
                r1 = r29
                aud r2 = defpackage.aud.this
                r3 = 160(0xa0, float:2.24E-43)
                r4 = 2
                r5 = 0
                r6 = 1
                if (r1 == r3) goto L_0x076b
                r3 = 174(0xae, float:2.44E-43)
                r7 = 0
                r8 = -1
                if (r1 == r3) goto L_0x0160
                r3 = 19899(0x4dbb, float:2.7884E-41)
                r4 = 475249515(0x1c53bb6b, float:7.0056276E-22)
                if (r1 == r3) goto L_0x0143
                r3 = 25152(0x6240, float:3.5245E-41)
                if (r1 == r3) goto L_0x0112
                r3 = 28032(0x6d80, float:3.9281E-41)
                if (r1 == r3) goto L_0x00fc
                r3 = 357149030(0x1549a966, float:4.072526E-26)
                r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                if (r1 == r3) goto L_0x00e2
                r3 = 374648427(0x1654ae6b, float:1.718026E-25)
                if (r1 == r3) goto L_0x00cb
                if (r1 == r4) goto L_0x0035
                goto L_0x0789
            L_0x0035:
                boolean r1 = r2.m
                if (r1 != 0) goto L_0x0789
                atm r1 = r2.F
                long r3 = r2.h
                r10 = -1
                int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
                if (r12 == 0) goto L_0x00ba
                long r3 = r2.k
                int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
                if (r10 == 0) goto L_0x00ba
                bdv r3 = r2.s
                if (r3 == 0) goto L_0x00ba
                bdv r3 = r2.s
                int r3 = r3.a
                if (r3 == 0) goto L_0x00ba
                bdv r3 = r2.t
                if (r3 == 0) goto L_0x00ba
                bdv r3 = r2.t
                int r3 = r3.a
                bdv r4 = r2.s
                int r4 = r4.a
                if (r3 == r4) goto L_0x0062
                goto L_0x00ba
            L_0x0062:
                bdv r3 = r2.s
                int r3 = r3.a
                int[] r4 = new int[r3]
                long[] r8 = new long[r3]
                long[] r9 = new long[r3]
                long[] r10 = new long[r3]
                r11 = 0
            L_0x006f:
                if (r11 >= r3) goto L_0x0087
                bdv r12 = r2.s
                long r12 = r12.a(r11)
                r10[r11] = r12
                long r12 = r2.h
                bdv r14 = r2.t
                long r14 = r14.a(r11)
                long r12 = r12 + r14
                r8[r11] = r12
                int r11 = r11 + 1
                goto L_0x006f
            L_0x0087:
                int r11 = r3 + -1
                if (r5 >= r11) goto L_0x009e
                int r11 = r5 + 1
                r12 = r8[r11]
                r14 = r8[r5]
                long r12 = r12 - r14
                int r13 = (int) r12
                r4[r5] = r13
                r12 = r10[r11]
                r14 = r10[r5]
                long r12 = r12 - r14
                r9[r5] = r12
                r5 = r11
                goto L_0x0087
            L_0x009e:
                long r12 = r2.h
                long r14 = r2.g
                long r12 = r12 + r14
                r14 = r8[r11]
                long r12 = r12 - r14
                int r3 = (int) r12
                r4[r11] = r3
                long r12 = r2.k
                r14 = r10[r11]
                long r12 = r12 - r14
                r9[r11] = r12
                r2.s = r7
                r2.t = r7
                atf r3 = new atf
                r3.<init>(r4, r8, r9, r10)
                goto L_0x00c5
            L_0x00ba:
                r2.s = r7
                r2.t = r7
                ats$b r3 = new ats$b
                long r4 = r2.k
                r3.<init>(r4)
            L_0x00c5:
                r1.a(r3)
                r2.m = r6
                return
            L_0x00cb:
                android.util.SparseArray<aud$b> r1 = r2.c
                int r1 = r1.size()
                if (r1 == 0) goto L_0x00da
                atm r1 = r2.F
                r1.a()
                goto L_0x0789
            L_0x00da:
                com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
                java.lang.String r2 = "No valid tracks were found"
                r1.<init>(r2)
                throw r1
            L_0x00e2:
                long r3 = r2.i
                int r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
                if (r1 != 0) goto L_0x00ed
                r3 = 1000000(0xf4240, double:4.940656E-318)
                r2.i = r3
            L_0x00ed:
                long r3 = r2.j
                int r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
                if (r1 == 0) goto L_0x0789
                long r3 = r2.j
                long r3 = r2.a(r3)
                r2.k = r3
                return
            L_0x00fc:
                aud$b r1 = r2.l
                boolean r1 = r1.e
                if (r1 == 0) goto L_0x0789
                aud$b r1 = r2.l
                byte[] r1 = r1.f
                if (r1 != 0) goto L_0x010a
                goto L_0x0789
            L_0x010a:
                com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
                java.lang.String r2 = "Combining encryption and compression is not supported"
                r1.<init>(r2)
                throw r1
            L_0x0112:
                aud$b r1 = r2.l
                boolean r1 = r1.e
                if (r1 == 0) goto L_0x0789
                aud$b r1 = r2.l
                atu$a r1 = r1.g
                if (r1 == 0) goto L_0x013b
                aud$b r1 = r2.l
                ast r3 = new ast
                ast$a[] r4 = new defpackage.ast.a[r6]
                ast$a r6 = new ast$a
                java.util.UUID r7 = defpackage.aqm.a
                aud$b r2 = r2.l
                atu$a r2 = r2.g
                byte[] r2 = r2.b
                java.lang.String r8 = "video/webm"
                r6.<init>(r7, r8, r2)
                r4[r5] = r6
                r3.<init>(r4)
                r1.i = r3
                return
            L_0x013b:
                com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
                java.lang.String r2 = "Encrypted Track found but ContentEncKeyID was not found"
                r1.<init>(r2)
                throw r1
            L_0x0143:
                int r1 = r2.n
                if (r1 == r8) goto L_0x0158
                long r5 = r2.o
                r7 = -1
                int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r1 == 0) goto L_0x0158
                int r1 = r2.n
                if (r1 != r4) goto L_0x0789
                long r3 = r2.o
                r2.q = r3
                return
            L_0x0158:
                com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
                java.lang.String r2 = "Mandatory element SeekID or SeekPosition not found"
                r1.<init>(r2)
                throw r1
            L_0x0160:
                aud$b r1 = r2.l
                java.lang.String r1 = r1.a
                java.lang.String r3 = "V_VP8"
                boolean r9 = r3.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "V_VP9"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "V_MPEG2"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "V_MPEG4/ISO/SP"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "V_MPEG4/ISO/ASP"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "V_MPEG4/ISO/AP"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "V_MPEG4/ISO/AVC"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "V_MPEGH/ISO/HEVC"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "V_MS/VFW/FOURCC"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "V_THEORA"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "A_OPUS"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "A_VORBIS"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "A_AAC"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "A_MPEG/L2"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "A_MPEG/L3"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "A_AC3"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "A_EAC3"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "A_TRUEHD"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "A_DTS"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "A_DTS/EXPRESS"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "A_DTS/LOSSLESS"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "A_FLAC"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "A_MS/ACM"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "A_PCM/INT/LIT"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "S_TEXT/UTF8"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "S_TEXT/ASS"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "S_VOBSUB"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "S_HDMV/PGS"
                boolean r9 = r9.equals(r1)
                if (r9 != 0) goto L_0x024f
                java.lang.String r9 = "S_DVBSUB"
                boolean r1 = r9.equals(r1)
                if (r1 == 0) goto L_0x024d
                goto L_0x024f
            L_0x024d:
                r1 = 0
                goto L_0x0250
            L_0x024f:
                r1 = 1
            L_0x0250:
                if (r1 == 0) goto L_0x0768
                aud$b r1 = r2.l
                atm r9 = r2.F
                aud$b r10 = r2.l
                int r10 = r10.b
                java.lang.String r11 = r1.a
                int r12 = r11.hashCode()
                r13 = 8
                r14 = 3
                switch(r12) {
                    case -2095576542: goto L_0x03a7;
                    case -2095575984: goto L_0x039d;
                    case -1985379776: goto L_0x0392;
                    case -1784763192: goto L_0x0387;
                    case -1730367663: goto L_0x037c;
                    case -1482641358: goto L_0x0371;
                    case -1482641357: goto L_0x0366;
                    case -1373388978: goto L_0x035b;
                    case -933872740: goto L_0x0350;
                    case -538363189: goto L_0x0345;
                    case -538363109: goto L_0x033a;
                    case -425012669: goto L_0x032e;
                    case -356037306: goto L_0x0322;
                    case 62923557: goto L_0x0316;
                    case 62923603: goto L_0x030a;
                    case 62927045: goto L_0x02fe;
                    case 82338133: goto L_0x02f5;
                    case 82338134: goto L_0x02ea;
                    case 99146302: goto L_0x02de;
                    case 444813526: goto L_0x02d2;
                    case 542569478: goto L_0x02c6;
                    case 725957860: goto L_0x02ba;
                    case 738597099: goto L_0x02ae;
                    case 855502857: goto L_0x02a3;
                    case 1422270023: goto L_0x0297;
                    case 1809237540: goto L_0x028c;
                    case 1950749482: goto L_0x0280;
                    case 1950789798: goto L_0x0274;
                    case 1951062397: goto L_0x0268;
                    default: goto L_0x0266;
                }
            L_0x0266:
                goto L_0x03b1
            L_0x0268:
                java.lang.String r3 = "A_OPUS"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 11
                goto L_0x03b2
            L_0x0274:
                java.lang.String r3 = "A_FLAC"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 21
                goto L_0x03b2
            L_0x0280:
                java.lang.String r3 = "A_EAC3"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 16
                goto L_0x03b2
            L_0x028c:
                java.lang.String r3 = "V_MPEG2"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 2
                goto L_0x03b2
            L_0x0297:
                java.lang.String r3 = "S_TEXT/UTF8"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 24
                goto L_0x03b2
            L_0x02a3:
                java.lang.String r3 = "V_MPEGH/ISO/HEVC"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 7
                goto L_0x03b2
            L_0x02ae:
                java.lang.String r3 = "S_TEXT/ASS"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 25
                goto L_0x03b2
            L_0x02ba:
                java.lang.String r3 = "A_PCM/INT/LIT"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 23
                goto L_0x03b2
            L_0x02c6:
                java.lang.String r3 = "A_DTS/EXPRESS"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 19
                goto L_0x03b2
            L_0x02d2:
                java.lang.String r3 = "V_THEORA"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 9
                goto L_0x03b2
            L_0x02de:
                java.lang.String r3 = "S_HDMV/PGS"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 27
                goto L_0x03b2
            L_0x02ea:
                java.lang.String r3 = "V_VP9"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 1
                goto L_0x03b2
            L_0x02f5:
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 0
                goto L_0x03b2
            L_0x02fe:
                java.lang.String r3 = "A_DTS"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 18
                goto L_0x03b2
            L_0x030a:
                java.lang.String r3 = "A_AC3"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 15
                goto L_0x03b2
            L_0x0316:
                java.lang.String r3 = "A_AAC"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 12
                goto L_0x03b2
            L_0x0322:
                java.lang.String r3 = "A_DTS/LOSSLESS"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 20
                goto L_0x03b2
            L_0x032e:
                java.lang.String r3 = "S_VOBSUB"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 26
                goto L_0x03b2
            L_0x033a:
                java.lang.String r3 = "V_MPEG4/ISO/AVC"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 6
                goto L_0x03b2
            L_0x0345:
                java.lang.String r3 = "V_MPEG4/ISO/ASP"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 4
                goto L_0x03b2
            L_0x0350:
                java.lang.String r3 = "S_DVBSUB"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 28
                goto L_0x03b2
            L_0x035b:
                java.lang.String r3 = "V_MS/VFW/FOURCC"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 8
                goto L_0x03b2
            L_0x0366:
                java.lang.String r3 = "A_MPEG/L3"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 14
                goto L_0x03b2
            L_0x0371:
                java.lang.String r3 = "A_MPEG/L2"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 13
                goto L_0x03b2
            L_0x037c:
                java.lang.String r3 = "A_VORBIS"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 10
                goto L_0x03b2
            L_0x0387:
                java.lang.String r3 = "A_TRUEHD"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 17
                goto L_0x03b2
            L_0x0392:
                java.lang.String r3 = "A_MS/ACM"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 22
                goto L_0x03b2
            L_0x039d:
                java.lang.String r3 = "V_MPEG4/ISO/SP"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 3
                goto L_0x03b2
            L_0x03a7:
                java.lang.String r3 = "V_MPEG4/ISO/AP"
                boolean r3 = r11.equals(r3)
                if (r3 == 0) goto L_0x03b1
                r3 = 5
                goto L_0x03b2
            L_0x03b1:
                r3 = -1
            L_0x03b2:
                java.lang.String r11 = "MatroskaExtractor"
                java.lang.String r12 = "audio/x-unknown"
                switch(r3) {
                    case 0: goto L_0x055a;
                    case 1: goto L_0x0557;
                    case 2: goto L_0x0554;
                    case 3: goto L_0x0545;
                    case 4: goto L_0x0545;
                    case 5: goto L_0x0545;
                    case 6: goto L_0x0530;
                    case 7: goto L_0x051c;
                    case 8: goto L_0x0507;
                    case 9: goto L_0x0504;
                    case 10: goto L_0x04f5;
                    case 11: goto L_0x04af;
                    case 12: goto L_0x04a5;
                    case 13: goto L_0x049b;
                    case 14: goto L_0x0496;
                    case 15: goto L_0x0492;
                    case 16: goto L_0x048e;
                    case 17: goto L_0x0483;
                    case 18: goto L_0x047f;
                    case 19: goto L_0x047f;
                    case 20: goto L_0x047b;
                    case 21: goto L_0x0471;
                    case 22: goto L_0x0429;
                    case 23: goto L_0x03fa;
                    case 24: goto L_0x03f6;
                    case 25: goto L_0x03f2;
                    case 26: goto L_0x03e8;
                    case 27: goto L_0x03e4;
                    case 28: goto L_0x03c1;
                    default: goto L_0x03b9;
                }
            L_0x03b9:
                com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
                java.lang.String r2 = "Unrecognized codec identifier."
                r1.<init>(r2)
                throw r1
            L_0x03c1:
                r3 = 4
                byte[] r3 = new byte[r3]
                byte[] r11 = r1.h
                byte r11 = r11[r5]
                r3[r5] = r11
                byte[] r11 = r1.h
                byte r11 = r11[r6]
                r3[r6] = r11
                byte[] r11 = r1.h
                byte r11 = r11[r4]
                r3[r4] = r11
                byte[] r11 = r1.h
                byte r11 = r11[r14]
                r3[r14] = r11
                java.util.List r3 = java.util.Collections.singletonList(r3)
                java.lang.String r12 = "application/dvbsubs"
                goto L_0x055d
            L_0x03e4:
                java.lang.String r12 = "application/pgs"
                goto L_0x055c
            L_0x03e8:
                byte[] r3 = r1.h
                java.util.List r3 = java.util.Collections.singletonList(r3)
                java.lang.String r12 = "application/vobsub"
                goto L_0x055d
            L_0x03f2:
                java.lang.String r12 = "text/x-ssa"
                goto L_0x055c
            L_0x03f6:
                java.lang.String r12 = "application/x-subrip"
                goto L_0x055c
            L_0x03fa:
                int r3 = r1.H
                int r3 = defpackage.ben.b(r3)
                if (r3 != 0) goto L_0x041f
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r13 = "Unsupported PCM bit depth: "
                r3.<init>(r13)
                int r13 = r1.H
                r3.append(r13)
                java.lang.String r13 = ". Setting mimeType to "
                r3.append(r13)
                r3.append(r12)
                java.lang.String r3 = r3.toString()
                defpackage.bdu.c(r11, r3)
                goto L_0x055c
            L_0x041f:
                java.lang.String r12 = "audio/raw"
            L_0x0421:
                r20 = r3
                r3 = r7
                r14 = r12
                r17 = -1
                goto L_0x0562
            L_0x0429:
                bea r3 = new bea
                byte[] r13 = r1.h
                r3.<init>(r13)
                boolean r3 = defpackage.aud.b.b(r3)
                if (r3 == 0) goto L_0x045e
                int r3 = r1.H
                int r3 = defpackage.ben.b(r3)
                if (r3 != 0) goto L_0x045b
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r13 = "Unsupported PCM bit depth: "
                r3.<init>(r13)
                int r13 = r1.H
                r3.append(r13)
                java.lang.String r13 = ". Setting mimeType to "
                r3.append(r13)
                r3.append(r12)
                java.lang.String r3 = r3.toString()
                defpackage.bdu.c(r11, r3)
                goto L_0x055c
            L_0x045b:
                java.lang.String r12 = "audio/raw"
                goto L_0x0421
            L_0x045e:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r13 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
                r3.<init>(r13)
                r3.append(r12)
                java.lang.String r3 = r3.toString()
                defpackage.bdu.c(r11, r3)
                goto L_0x055c
            L_0x0471:
                byte[] r3 = r1.h
                java.util.List r3 = java.util.Collections.singletonList(r3)
                java.lang.String r12 = "audio/flac"
                goto L_0x055d
            L_0x047b:
                java.lang.String r12 = "audio/vnd.dts.hd"
                goto L_0x055c
            L_0x047f:
                java.lang.String r12 = "audio/vnd.dts"
                goto L_0x055c
            L_0x0483:
                aud$c r3 = new aud$c
                r3.<init>()
                r1.L = r3
                java.lang.String r12 = "audio/true-hd"
                goto L_0x055c
            L_0x048e:
                java.lang.String r12 = "audio/eac3"
                goto L_0x055c
            L_0x0492:
                java.lang.String r12 = "audio/ac3"
                goto L_0x055c
            L_0x0496:
                r3 = 4096(0x1000, float:5.74E-42)
                java.lang.String r12 = "audio/mpeg"
                goto L_0x049f
            L_0x049b:
                r3 = 4096(0x1000, float:5.74E-42)
                java.lang.String r12 = "audio/mpeg-L2"
            L_0x049f:
                r3 = r7
                r14 = r12
                r17 = 4096(0x1000, float:5.74E-42)
                goto L_0x0560
            L_0x04a5:
                byte[] r3 = r1.h
                java.util.List r3 = java.util.Collections.singletonList(r3)
                java.lang.String r12 = "audio/mp4a-latm"
                goto L_0x055d
            L_0x04af:
                r3 = 5760(0x1680, float:8.071E-42)
                java.util.ArrayList r11 = new java.util.ArrayList
                r11.<init>(r14)
                byte[] r12 = r1.h
                r11.add(r12)
                java.nio.ByteBuffer r12 = java.nio.ByteBuffer.allocate(r13)
                java.nio.ByteOrder r15 = java.nio.ByteOrder.nativeOrder()
                java.nio.ByteBuffer r12 = r12.order(r15)
                long r14 = r1.J
                java.nio.ByteBuffer r12 = r12.putLong(r14)
                byte[] r12 = r12.array()
                r11.add(r12)
                java.nio.ByteBuffer r12 = java.nio.ByteBuffer.allocate(r13)
                java.nio.ByteOrder r13 = java.nio.ByteOrder.nativeOrder()
                java.nio.ByteBuffer r12 = r12.order(r13)
                long r13 = r1.K
                java.nio.ByteBuffer r12 = r12.putLong(r13)
                byte[] r12 = r12.array()
                r11.add(r12)
                java.lang.String r12 = "audio/opus"
                r3 = r11
                r14 = r12
                r17 = 5760(0x1680, float:8.071E-42)
                goto L_0x0560
            L_0x04f5:
                r3 = 8192(0x2000, float:1.14794E-41)
                byte[] r11 = r1.h
                java.util.List r11 = defpackage.aud.b.a(r11)
                java.lang.String r12 = "audio/vorbis"
                r3 = r11
                r14 = r12
                r17 = 8192(0x2000, float:1.14794E-41)
                goto L_0x0560
            L_0x0504:
                java.lang.String r12 = "video/x-unknown"
                goto L_0x055c
            L_0x0507:
                bea r3 = new bea
                byte[] r11 = r1.h
                r3.<init>(r11)
                android.util.Pair r3 = defpackage.aud.b.a(r3)
                java.lang.Object r11 = r3.first
                r12 = r11
                java.lang.String r12 = (java.lang.String) r12
                java.lang.Object r3 = r3.second
                java.util.List r3 = (java.util.List) r3
                goto L_0x055d
            L_0x051c:
                bea r3 = new bea
                byte[] r11 = r1.h
                r3.<init>(r11)
                bes r3 = defpackage.bes.a(r3)
                java.util.List<byte[]> r11 = r3.a
                int r3 = r3.b
                r1.Q = r3
                java.lang.String r12 = "video/hevc"
                goto L_0x0543
            L_0x0530:
                bea r3 = new bea
                byte[] r11 = r1.h
                r3.<init>(r11)
                bep r3 = defpackage.bep.a(r3)
                java.util.List<byte[]> r11 = r3.a
                int r3 = r3.b
                r1.Q = r3
                java.lang.String r12 = "video/avc"
            L_0x0543:
                r3 = r11
                goto L_0x055d
            L_0x0545:
                byte[] r3 = r1.h
                if (r3 != 0) goto L_0x054b
                r3 = r7
                goto L_0x0551
            L_0x054b:
                byte[] r3 = r1.h
                java.util.List r3 = java.util.Collections.singletonList(r3)
            L_0x0551:
                java.lang.String r12 = "video/mp4v-es"
                goto L_0x055d
            L_0x0554:
                java.lang.String r12 = "video/mpeg2"
                goto L_0x055c
            L_0x0557:
                java.lang.String r12 = "video/x-vnd.on2.vp9"
                goto L_0x055c
            L_0x055a:
                java.lang.String r12 = "video/x-vnd.on2.vp8"
            L_0x055c:
                r3 = r7
            L_0x055d:
                r14 = r12
                r17 = -1
            L_0x0560:
                r20 = -1
            L_0x0562:
                boolean r11 = r1.N
                r11 = r11 | r5
                boolean r12 = r1.M
                if (r12 == 0) goto L_0x056b
                r12 = 2
                goto L_0x056c
            L_0x056b:
                r12 = 0
            L_0x056c:
                r11 = r11 | r12
                boolean r12 = defpackage.bdx.a(r14)
                if (r12 == 0) goto L_0x0595
                java.lang.String r13 = java.lang.Integer.toString(r10)
                r15 = 0
                r16 = -1
                int r4 = r1.G
                int r5 = r1.I
                ast r8 = r1.i
                java.lang.String r10 = r1.O
                r18 = r4
                r19 = r5
                r21 = r3
                r22 = r8
                r23 = r11
                r24 = r10
                aqv r3 = defpackage.aqv.a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                r4 = 1
                goto L_0x0750
            L_0x0595:
                boolean r6 = defpackage.bdx.b(r14)
                if (r6 == 0) goto L_0x06ca
                int r6 = r1.n
                if (r6 != 0) goto L_0x05b5
                int r6 = r1.l
                if (r6 != r8) goto L_0x05a6
                int r6 = r1.j
                goto L_0x05a8
            L_0x05a6:
                int r6 = r1.l
            L_0x05a8:
                r1.l = r6
                int r6 = r1.m
                if (r6 != r8) goto L_0x05b1
                int r6 = r1.k
                goto L_0x05b3
            L_0x05b1:
                int r6 = r1.m
            L_0x05b3:
                r1.m = r6
            L_0x05b5:
                int r6 = r1.l
                r11 = -1082130432(0xffffffffbf800000, float:-1.0)
                if (r6 == r8) goto L_0x05d1
                int r6 = r1.m
                if (r6 == r8) goto L_0x05d1
                int r6 = r1.k
                int r8 = r1.l
                int r6 = r6 * r8
                float r6 = (float) r6
                int r8 = r1.j
                int r12 = r1.m
                int r8 = r8 * r12
                float r8 = (float) r8
                float r6 = r6 / r8
                r23 = r6
                goto L_0x05d3
            L_0x05d1:
                r23 = -1082130432(0xffffffffbf800000, float:-1.0)
            L_0x05d3:
                boolean r6 = r1.q
                if (r6 == 0) goto L_0x06a1
                float r6 = r1.w
                int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r6 == 0) goto L_0x0692
                float r6 = r1.x
                int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r6 == 0) goto L_0x0692
                float r6 = r1.y
                int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r6 == 0) goto L_0x0692
                float r6 = r1.z
                int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r6 == 0) goto L_0x0692
                float r6 = r1.A
                int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r6 == 0) goto L_0x0692
                float r6 = r1.B
                int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r6 == 0) goto L_0x0692
                float r6 = r1.C
                int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r6 == 0) goto L_0x0692
                float r6 = r1.D
                int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r6 == 0) goto L_0x0692
                float r6 = r1.E
                int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r6 == 0) goto L_0x0692
                float r6 = r1.F
                int r6 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r6 != 0) goto L_0x0615
                goto L_0x0692
            L_0x0615:
                r6 = 25
                byte[] r6 = new byte[r6]
                java.nio.ByteBuffer r8 = java.nio.ByteBuffer.wrap(r6)
                r8.put(r5)
                float r5 = r1.w
                r11 = 1195593728(0x47435000, float:50000.0)
                float r5 = r5 * r11
                r12 = 1056964608(0x3f000000, float:0.5)
                float r5 = r5 + r12
                int r5 = (int) r5
                short r5 = (short) r5
                r8.putShort(r5)
                float r5 = r1.x
                float r5 = r5 * r11
                float r5 = r5 + r12
                int r5 = (int) r5
                short r5 = (short) r5
                r8.putShort(r5)
                float r5 = r1.y
                float r5 = r5 * r11
                float r5 = r5 + r12
                int r5 = (int) r5
                short r5 = (short) r5
                r8.putShort(r5)
                float r5 = r1.z
                float r5 = r5 * r11
                float r5 = r5 + r12
                int r5 = (int) r5
                short r5 = (short) r5
                r8.putShort(r5)
                float r5 = r1.A
                float r5 = r5 * r11
                float r5 = r5 + r12
                int r5 = (int) r5
                short r5 = (short) r5
                r8.putShort(r5)
                float r5 = r1.B
                float r5 = r5 * r11
                float r5 = r5 + r12
                int r5 = (int) r5
                short r5 = (short) r5
                r8.putShort(r5)
                float r5 = r1.C
                float r5 = r5 * r11
                float r5 = r5 + r12
                int r5 = (int) r5
                short r5 = (short) r5
                r8.putShort(r5)
                float r5 = r1.D
                float r5 = r5 * r11
                float r5 = r5 + r12
                int r5 = (int) r5
                short r5 = (short) r5
                r8.putShort(r5)
                float r5 = r1.E
                float r5 = r5 + r12
                int r5 = (int) r5
                short r5 = (short) r5
                r8.putShort(r5)
                float r5 = r1.F
                float r5 = r5 + r12
                int r5 = (int) r5
                short r5 = (short) r5
                r8.putShort(r5)
                int r5 = r1.u
                short r5 = (short) r5
                r8.putShort(r5)
                int r5 = r1.v
                short r5 = (short) r5
                r8.putShort(r5)
                goto L_0x0693
            L_0x0692:
                r6 = r7
            L_0x0693:
                beq r5 = new beq
                int r8 = r1.r
                int r11 = r1.t
                int r12 = r1.s
                r5.<init>(r8, r11, r12, r6)
                r26 = r5
                goto L_0x06a3
            L_0x06a1:
                r26 = r7
            L_0x06a3:
                java.lang.String r13 = java.lang.Integer.toString(r10)
                r15 = 0
                r16 = -1
                int r5 = r1.j
                int r6 = r1.k
                r20 = -1082130432(0xffffffffbf800000, float:-1.0)
                r22 = -1
                byte[] r8 = r1.o
                int r10 = r1.p
                ast r11 = r1.i
                r18 = r5
                r19 = r6
                r21 = r3
                r24 = r8
                r25 = r10
                r27 = r11
                aqv r3 = defpackage.aqv.a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
                goto L_0x0750
            L_0x06ca:
                java.lang.String r5 = "application/x-subrip"
                boolean r5 = r5.equals(r14)
                if (r5 == 0) goto L_0x06e1
                java.lang.String r3 = java.lang.Integer.toString(r10)
                java.lang.String r4 = r1.O
                ast r5 = r1.i
                aqv r3 = defpackage.aqv.a(r3, r14, r11, r4, r5)
            L_0x06de:
                r4 = 3
                goto L_0x0750
            L_0x06e1:
                java.lang.String r5 = "text/x-ssa"
                boolean r5 = r5.equals(r14)
                if (r5 == 0) goto L_0x0717
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>(r4)
                byte[] r4 = defpackage.aud.a
                r3.add(r4)
                byte[] r4 = r1.h
                r3.add(r4)
                java.lang.String r13 = java.lang.Integer.toString(r10)
                r15 = 0
                r16 = -1
                java.lang.String r4 = r1.O
                r19 = -1
                ast r5 = r1.i
                r21 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r17 = r11
                r18 = r4
                r20 = r5
                r23 = r3
                aqv r3 = defpackage.aqv.a(r13, r14, r15, r16, r17, r18, r19, r20, r21, r23)
                goto L_0x06de
            L_0x0717:
                java.lang.String r4 = "application/vobsub"
                boolean r4 = r4.equals(r14)
                if (r4 != 0) goto L_0x0738
                java.lang.String r4 = "application/pgs"
                boolean r4 = r4.equals(r14)
                if (r4 != 0) goto L_0x0738
                java.lang.String r4 = "application/dvbsubs"
                boolean r4 = r4.equals(r14)
                if (r4 == 0) goto L_0x0730
                goto L_0x0738
            L_0x0730:
                com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
                java.lang.String r2 = "Unexpected MIME type."
                r1.<init>(r2)
                throw r1
            L_0x0738:
                java.lang.String r13 = java.lang.Integer.toString(r10)
                r15 = 0
                r16 = -1
                java.lang.String r4 = r1.O
                ast r5 = r1.i
                r17 = r11
                r18 = r3
                r19 = r4
                r20 = r5
                aqv r3 = defpackage.aqv.a(r13, r14, r15, r16, r17, r18, r19, r20)
                goto L_0x06de
            L_0x0750:
                int r5 = r1.b
                atu r4 = r9.a(r5, r4)
                r1.P = r4
                atu r1 = r1.P
                r1.a(r3)
                android.util.SparseArray<aud$b> r1 = r2.c
                aud$b r3 = r2.l
                int r3 = r3.b
                aud$b r4 = r2.l
                r1.put(r3, r4)
            L_0x0768:
                r2.l = r7
                return
            L_0x076b:
                int r1 = r2.v
                if (r1 != r4) goto L_0x0789
                boolean r1 = r2.E
                if (r1 != 0) goto L_0x0778
                int r1 = r2.D
                r1 = r1 | r6
                r2.D = r1
            L_0x0778:
                android.util.SparseArray<aud$b> r1 = r2.c
                int r3 = r2.B
                java.lang.Object r1 = r1.get(r3)
                aud$b r1 = (defpackage.aud.b) r1
                long r3 = r2.w
                r2.a(r1, r3)
                r2.v = r5
            L_0x0789:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.aud.a.c(int):void");
        }
    }

    /* renamed from: aud$b */
    static final class b {
        public float A;
        public float B;
        public float C;
        public float D;
        public float E;
        public float F;
        public int G;
        public int H;
        public int I;
        public long J;
        public long K;
        public c L;
        public boolean M;
        public boolean N;
        String O;
        public atu P;
        public int Q;
        public String a;
        public int b;
        public int c;
        public int d;
        public boolean e;
        public byte[] f;
        public defpackage.atu.a g;
        public byte[] h;
        public ast i;
        public int j;
        public int k;
        public int l;
        public int m;
        public int n;
        public byte[] o;
        public int p;
        public boolean q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        public float w;
        public float x;
        public float y;
        public float z;

        private b() {
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = 0;
            this.o = null;
            this.p = -1;
            this.q = false;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = 1000;
            this.v = 200;
            this.w = -1.0f;
            this.x = -1.0f;
            this.y = -1.0f;
            this.z = -1.0f;
            this.A = -1.0f;
            this.B = -1.0f;
            this.C = -1.0f;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = 1;
            this.H = -1;
            this.I = 8000;
            this.J = 0;
            this.K = 0;
            this.N = true;
            this.O = "eng";
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        static Pair<String, List<byte[]>> a(bea bea) {
            try {
                bea.d(16);
                long h2 = bea.h();
                if (h2 == 1482049860) {
                    return new Pair<>("video/3gpp", null);
                }
                if (h2 == 826496599) {
                    byte[] bArr = bea.a;
                    for (int i2 = bea.b + 20; i2 < bArr.length - 4; i2++) {
                        if (bArr[i2] == 0 && bArr[i2 + 1] == 0 && bArr[i2 + 2] == 1 && bArr[i2 + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr, i2, bArr.length)));
                        }
                    }
                    throw new ParserException("Failed to find FourCC VC1 initialization data");
                }
                bdu.c("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing FourCC private data");
            }
        }

        static List<byte[]> a(byte[] bArr) {
            String str = "Error parsing vorbis codec private";
            try {
                if (bArr[0] == 2) {
                    int i2 = 1;
                    int i3 = 0;
                    while (bArr[i2] == -1) {
                        i3 += 255;
                        i2++;
                    }
                    int i4 = i2 + 1;
                    int i5 = i3 + bArr[i2];
                    int i6 = 0;
                    while (bArr[i4] == -1) {
                        i6 += 255;
                        i4++;
                    }
                    int i7 = i4 + 1;
                    int i8 = i6 + bArr[i4];
                    if (bArr[i7] == 1) {
                        byte[] bArr2 = new byte[i5];
                        System.arraycopy(bArr, i7, bArr2, 0, i5);
                        int i9 = i7 + i5;
                        if (bArr[i9] == 3) {
                            int i10 = i9 + i8;
                            if (bArr[i10] == 5) {
                                byte[] bArr3 = new byte[(bArr.length - i10)];
                                System.arraycopy(bArr, i10, bArr3, 0, bArr.length - i10);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw new ParserException(str);
                        }
                        throw new ParserException(str);
                    }
                    throw new ParserException(str);
                }
                throw new ParserException(str);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException(str);
            }
        }

        static boolean b(bea bea) {
            try {
                int e2 = bea.e();
                if (e2 == 1) {
                    return true;
                }
                if (e2 == 65534) {
                    bea.c(24);
                    return bea.k() == aud.K.getMostSignificantBits() && bea.k() == aud.K.getLeastSignificantBits();
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing MS/ACM codec private");
            }
        }
    }

    /* renamed from: aud$c */
    static final class c {
        final byte[] a = new byte[10];
        boolean b;
        int c;
        int d;
        long e;
        int f;

        public final void a(b bVar, long j) {
            if (this.b) {
                int i = this.c;
                this.c = i + 1;
                if (i == 0) {
                    this.e = j;
                }
                if (this.c >= 16) {
                    bVar.P.a(this.e, this.f, this.d, 0, bVar.g);
                    this.c = 0;
                }
            }
        }
    }

    static {
        $$Lambda$aud$fLVPGHAdXym8Uk9m5abeRWdypHE r0 = $$Lambda$aud$fLVPGHAdXym8Uk9m5abeRWdypHE.INSTANCE;
    }

    public aud() {
        this(0);
    }

    public aud(int i2) {
        this(new aua(), i2);
    }

    private aud(aub aub, int i2) {
        this.h = -1;
        this.i = -9223372036854775807L;
        this.j = -9223372036854775807L;
        this.k = -9223372036854775807L;
        this.q = -1;
        this.U = -1;
        this.r = -9223372036854775807L;
        this.L = aub;
        this.L.a((auc) new a(this, 0));
        boolean z2 = true;
        if ((i2 & 1) != 0) {
            z2 = false;
        }
        this.d = z2;
        this.b = new auf();
        this.c = new SparseArray<>();
        this.e = new bea(4);
        this.O = new bea(ByteBuffer.allocate(4).putInt(-1).array());
        this.f = new bea(4);
        this.M = new bea(bdy.a);
        this.N = new bea(4);
        this.P = new bea();
        this.Q = new bea();
        this.R = new bea(8);
        this.S = new bea();
    }

    private int a(atl atl, atu atu, int i2) {
        int i3;
        int b2 = this.P.b();
        if (b2 > 0) {
            i3 = Math.min(i2, b2);
            atu.a(this.P, i3);
        } else {
            i3 = atu.a(atl, i2, false);
        }
        this.V += i3;
        this.ad += i3;
        return i3;
    }

    private void a(atl atl, byte[] bArr, int i2) {
        int length = bArr.length + i2;
        if (this.Q.a.length < length) {
            this.Q.a = Arrays.copyOf(bArr, length + i2);
        } else {
            System.arraycopy(bArr, 0, this.Q.a, 0, bArr.length);
        }
        atl.b(this.Q.a, bArr.length, i2);
        this.Q.a(length);
    }

    private void a(b bVar, String str, int i2, long j2, byte[] bArr) {
        a(this.Q.a, this.x, str, i2, j2, bArr);
        atu atu = bVar.P;
        bea bea = this.Q;
        atu.a(bea, bea.c);
        this.ad += this.Q.c;
    }

    private static void a(byte[] bArr, long j2, String str, int i2, long j3, byte[] bArr2) {
        byte[] bArr3;
        byte[] bArr4;
        if (j2 == -9223372036854775807L) {
            bArr4 = bArr2;
            bArr3 = bArr4;
        } else {
            int i3 = (int) (j2 / 3600000000L);
            long j4 = j2 - (((long) (i3 * 3600)) * 1000000);
            int i4 = (int) (j4 / 60000000);
            long j5 = j4 - (((long) (i4 * 60)) * 1000000);
            int i5 = (int) (j5 / 1000000);
            int i6 = (int) ((j5 - (((long) i5) * 1000000)) / j3);
            Object[] objArr = {Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
            String str2 = str;
            bArr3 = ben.c(String.format(Locale.US, str, objArr));
            bArr4 = bArr2;
        }
        byte[] bArr5 = bArr;
        int i7 = i2;
        System.arraycopy(bArr3, 0, bArr, i2, bArr4.length);
    }

    static int[] a(int[] iArr, int i2) {
        return iArr == null ? new int[i2] : iArr.length >= i2 ? iArr : new int[Math.max(iArr.length << 1, i2)];
    }

    private void b() {
        this.V = 0;
        this.ad = 0;
        this.ac = 0;
        this.W = false;
        this.X = false;
        this.Z = false;
        this.ab = 0;
        this.aa = 0;
        this.Y = false;
        this.P.a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ atk[] c() {
        return new atk[]{new aud()};
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0039 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0005 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(defpackage.atl r11, defpackage.atr r12) {
        /*
            r10 = this;
            r0 = 0
            r10.ae = r0
            r1 = 1
            r2 = 1
        L_0x0005:
            if (r2 == 0) goto L_0x003a
            boolean r3 = r10.ae
            if (r3 != 0) goto L_0x003a
            aub r2 = r10.L
            boolean r2 = r2.a(r11)
            if (r2 == 0) goto L_0x0005
            long r3 = r11.c()
            boolean r5 = r10.p
            if (r5 == 0) goto L_0x0025
            r10.U = r3
            long r3 = r10.q
            r12.a = r3
            r10.p = r0
        L_0x0023:
            r3 = 1
            goto L_0x0037
        L_0x0025:
            boolean r3 = r10.m
            if (r3 == 0) goto L_0x0036
            long r3 = r10.U
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0036
            r12.a = r3
            r10.U = r5
            goto L_0x0023
        L_0x0036:
            r3 = 0
        L_0x0037:
            if (r3 == 0) goto L_0x0005
            return r1
        L_0x003a:
            if (r2 != 0) goto L_0x0070
            r11 = 0
        L_0x003d:
            android.util.SparseArray<aud$b> r12 = r10.c
            int r12 = r12.size()
            if (r11 >= r12) goto L_0x006e
            android.util.SparseArray<aud$b> r12 = r10.c
            java.lang.Object r12 = r12.valueAt(r11)
            aud$b r12 = (defpackage.aud.b) r12
            aud$c r1 = r12.L
            if (r1 == 0) goto L_0x006b
            aud$c r1 = r12.L
            boolean r2 = r1.b
            if (r2 == 0) goto L_0x006b
            int r2 = r1.c
            if (r2 <= 0) goto L_0x006b
            atu r3 = r12.P
            long r4 = r1.e
            int r6 = r1.f
            int r7 = r1.d
            r8 = 0
            atu$a r9 = r12.g
            r3.a(r4, r6, r7, r8, r9)
            r1.c = r0
        L_0x006b:
            int r11 = r11 + 1
            goto L_0x003d
        L_0x006e:
            r11 = -1
            return r11
        L_0x0070:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aud.a(atl, atr):int");
    }

    /* access modifiers changed from: 0000 */
    public long a(long j2) {
        long j3 = this.i;
        if (j3 != -9223372036854775807L) {
            return ben.b(j2, j3, 1000);
        }
        throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
    }

    public final void a(long j2, long j3) {
        this.r = -9223372036854775807L;
        this.v = 0;
        this.L.a();
        this.b.a();
        b();
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            b bVar = (b) this.c.valueAt(i2);
            if (bVar.L != null) {
                bVar.L.b = false;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(atl atl, int i2) {
        if (this.e.c < i2) {
            if (this.e.a.length < i2) {
                bea bea = this.e;
                bea.a(Arrays.copyOf(bea.a, Math.max(this.e.a.length << 1, i2)), this.e.c);
            }
            atl.b(this.e.a, this.e.c, i2 - this.e.c);
            this.e.b(i2);
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0238  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(defpackage.atl r10, defpackage.aud.b r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = r11.a
            java.lang.String r1 = "S_TEXT/UTF8"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0010
            byte[] r11 = G
            r9.a(r10, r11, r12)
            return
        L_0x0010:
            java.lang.String r0 = r11.a
            java.lang.String r1 = "S_TEXT/ASS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            byte[] r11 = I
            r9.a(r10, r11, r12)
            return
        L_0x0020:
            atu r0 = r11.P
            boolean r1 = r9.W
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 != 0) goto L_0x0174
            boolean r1 = r11.e
            if (r1 == 0) goto L_0x0164
            int r1 = r9.D
            r5 = -1073741825(0xffffffffbfffffff, float:-1.9999999)
            r1 = r1 & r5
            r9.D = r1
            boolean r1 = r9.X
            r5 = 128(0x80, float:1.794E-43)
            if (r1 != 0) goto L_0x0063
            bea r1 = r9.e
            byte[] r1 = r1.a
            r10.b(r1, r4, r3)
            int r1 = r9.V
            int r1 = r1 + r3
            r9.V = r1
            bea r1 = r9.e
            byte[] r1 = r1.a
            byte r1 = r1[r4]
            r1 = r1 & r5
            if (r1 == r5) goto L_0x005b
            bea r1 = r9.e
            byte[] r1 = r1.a
            byte r1 = r1[r4]
            r9.aa = r1
            r9.X = r3
            goto L_0x0063
        L_0x005b:
            com.google.android.exoplayer2.ParserException r10 = new com.google.android.exoplayer2.ParserException
            java.lang.String r11 = "Extension bit is set in signal byte"
            r10.<init>(r11)
            throw r10
        L_0x0063:
            byte r1 = r9.aa
            r1 = r1 & r3
            if (r1 != r3) goto L_0x006a
            r1 = 1
            goto L_0x006b
        L_0x006a:
            r1 = 0
        L_0x006b:
            if (r1 == 0) goto L_0x0172
            byte r1 = r9.aa
            r1 = r1 & r2
            if (r1 != r2) goto L_0x0074
            r1 = 1
            goto L_0x0075
        L_0x0074:
            r1 = 0
        L_0x0075:
            int r6 = r9.D
            r7 = 1073741824(0x40000000, float:2.0)
            r6 = r6 | r7
            r9.D = r6
            boolean r6 = r9.Y
            if (r6 != 0) goto L_0x00ba
            bea r6 = r9.R
            byte[] r6 = r6.a
            r7 = 8
            r10.b(r6, r4, r7)
            int r6 = r9.V
            int r6 = r6 + r7
            r9.V = r6
            r9.Y = r3
            bea r6 = r9.e
            byte[] r6 = r6.a
            if (r1 == 0) goto L_0x0097
            goto L_0x0098
        L_0x0097:
            r5 = 0
        L_0x0098:
            r5 = r5 | r7
            byte r5 = (byte) r5
            r6[r4] = r5
            bea r5 = r9.e
            r5.c(r4)
            bea r5 = r9.e
            r0.a(r5, r3)
            int r5 = r9.ad
            int r5 = r5 + r3
            r9.ad = r5
            bea r5 = r9.R
            r5.c(r4)
            bea r5 = r9.R
            r0.a(r5, r7)
            int r5 = r9.ad
            int r5 = r5 + r7
            r9.ad = r5
        L_0x00ba:
            if (r1 == 0) goto L_0x0172
            boolean r1 = r9.Z
            if (r1 != 0) goto L_0x00db
            bea r1 = r9.e
            byte[] r1 = r1.a
            r10.b(r1, r4, r3)
            int r1 = r9.V
            int r1 = r1 + r3
            r9.V = r1
            bea r1 = r9.e
            r1.c(r4)
            bea r1 = r9.e
            int r1 = r1.c()
            r9.ab = r1
            r9.Z = r3
        L_0x00db:
            int r1 = r9.ab
            int r1 = r1 << r2
            bea r5 = r9.e
            r5.a(r1)
            bea r5 = r9.e
            byte[] r5 = r5.a
            r10.b(r5, r4, r1)
            int r5 = r9.V
            int r5 = r5 + r1
            r9.V = r5
            int r1 = r9.ab
            int r1 = r1 / r2
            int r1 = r1 + r3
            short r1 = (short) r1
            int r5 = r1 * 6
            int r5 = r5 + r2
            java.nio.ByteBuffer r6 = r9.T
            if (r6 == 0) goto L_0x0101
            int r6 = r6.capacity()
            if (r6 >= r5) goto L_0x0107
        L_0x0101:
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r5)
            r9.T = r6
        L_0x0107:
            java.nio.ByteBuffer r6 = r9.T
            r6.position(r4)
            java.nio.ByteBuffer r6 = r9.T
            r6.putShort(r1)
            r1 = 0
            r6 = 0
        L_0x0113:
            int r7 = r9.ab
            if (r1 >= r7) goto L_0x0135
            bea r7 = r9.e
            int r7 = r7.n()
            int r8 = r1 % 2
            if (r8 != 0) goto L_0x012a
            java.nio.ByteBuffer r8 = r9.T
            int r6 = r7 - r6
            short r6 = (short) r6
            r8.putShort(r6)
            goto L_0x0131
        L_0x012a:
            java.nio.ByteBuffer r8 = r9.T
            int r6 = r7 - r6
            r8.putInt(r6)
        L_0x0131:
            int r1 = r1 + 1
            r6 = r7
            goto L_0x0113
        L_0x0135:
            int r1 = r9.V
            int r1 = r12 - r1
            int r1 = r1 - r6
            int r7 = r7 % r2
            if (r7 != r3) goto L_0x0143
            java.nio.ByteBuffer r6 = r9.T
            r6.putInt(r1)
            goto L_0x014e
        L_0x0143:
            java.nio.ByteBuffer r6 = r9.T
            short r1 = (short) r1
            r6.putShort(r1)
            java.nio.ByteBuffer r1 = r9.T
            r1.putInt(r4)
        L_0x014e:
            bea r1 = r9.S
            java.nio.ByteBuffer r6 = r9.T
            byte[] r6 = r6.array()
            r1.a(r6, r5)
            bea r1 = r9.S
            r0.a(r1, r5)
            int r1 = r9.ad
            int r1 = r1 + r5
            r9.ad = r1
            goto L_0x0172
        L_0x0164:
            byte[] r1 = r11.f
            if (r1 == 0) goto L_0x0172
            bea r1 = r9.P
            byte[] r5 = r11.f
            byte[] r6 = r11.f
            int r6 = r6.length
            r1.a(r5, r6)
        L_0x0172:
            r9.W = r3
        L_0x0174:
            bea r1 = r9.P
            int r1 = r1.c
            int r12 = r12 + r1
            java.lang.String r1 = r11.a
            java.lang.String r5 = "V_MPEG4/ISO/AVC"
            boolean r1 = r5.equals(r1)
            r5 = 4
            if (r1 != 0) goto L_0x01d4
            java.lang.String r1 = r11.a
            java.lang.String r6 = "V_MPEGH/ISO/HEVC"
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L_0x018f
            goto L_0x01d4
        L_0x018f:
            aud$c r1 = r11.L
            if (r1 == 0) goto L_0x01ca
            bea r1 = r9.P
            int r1 = r1.c
            if (r1 != 0) goto L_0x019b
            r1 = 1
            goto L_0x019c
        L_0x019b:
            r1 = 0
        L_0x019c:
            defpackage.bdl.b(r1)
            aud$c r1 = r11.L
            int r2 = r9.D
            boolean r6 = r1.b
            if (r6 != 0) goto L_0x01bd
            byte[] r6 = r1.a
            r7 = 10
            r10.c(r6, r4, r7)
            r10.a()
            byte[] r6 = r1.a
            int r6 = defpackage.aro.b(r6)
            if (r6 == 0) goto L_0x01ca
            r1.b = r3
            r1.c = r4
        L_0x01bd:
            int r3 = r1.c
            if (r3 != 0) goto L_0x01c5
            r1.f = r2
            r1.d = r4
        L_0x01c5:
            int r2 = r1.d
            int r2 = r2 + r12
            r1.d = r2
        L_0x01ca:
            int r1 = r9.V
            if (r1 >= r12) goto L_0x022e
            int r1 = r12 - r1
            r9.a(r10, r0, r1)
            goto L_0x01ca
        L_0x01d4:
            bea r1 = r9.N
            byte[] r1 = r1.a
            r1[r4] = r4
            r1[r3] = r4
            r1[r2] = r4
            int r2 = r11.Q
            int r3 = r11.Q
            int r3 = 4 - r3
        L_0x01e4:
            int r6 = r9.V
            if (r6 >= r12) goto L_0x022e
            int r6 = r9.ac
            if (r6 != 0) goto L_0x0226
            bea r6 = r9.P
            int r6 = r6.b()
            int r6 = java.lang.Math.min(r2, r6)
            int r7 = r3 + r6
            int r8 = r2 - r6
            r10.b(r1, r7, r8)
            if (r6 <= 0) goto L_0x0204
            bea r7 = r9.P
            r7.a(r1, r3, r6)
        L_0x0204:
            int r6 = r9.V
            int r6 = r6 + r2
            r9.V = r6
            bea r6 = r9.N
            r6.c(r4)
            bea r6 = r9.N
            int r6 = r6.n()
            r9.ac = r6
            bea r6 = r9.M
            r6.c(r4)
            bea r6 = r9.M
            r0.a(r6, r5)
            int r6 = r9.ad
            int r6 = r6 + r5
            r9.ad = r6
            goto L_0x01e4
        L_0x0226:
            int r7 = r9.a(r10, r0, r6)
            int r6 = r6 - r7
            r9.ac = r6
            goto L_0x01e4
        L_0x022e:
            java.lang.String r10 = r11.a
            java.lang.String r11 = "A_VORBIS"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x0247
            bea r10 = r9.O
            r10.c(r4)
            bea r10 = r9.O
            r0.a(r10, r5)
            int r10 = r9.ad
            int r10 = r10 + r5
            r9.ad = r10
        L_0x0247:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aud.a(atl, aud$b, int):void");
    }

    public final void a(atm atm) {
        this.F = atm;
    }

    /* access modifiers changed from: 0000 */
    public void a(b bVar, long j2) {
        b bVar2 = bVar;
        if (bVar2.L != null) {
            bVar2.L.a(bVar2, j2);
        } else {
            long j3 = j2;
            if ("S_TEXT/UTF8".equals(bVar2.a)) {
                b bVar3 = bVar;
                a(bVar3, "%02d:%02d:%02d,%03d", 19, 1000, H);
            } else {
                if ("S_TEXT/ASS".equals(bVar2.a)) {
                    b bVar4 = bVar;
                    a(bVar4, "%01d:%02d:%02d:%02d", 21, 10000, J);
                }
            }
            bVar2.P.a(j2, this.D, this.ad, 0, bVar2.g);
        }
        this.ae = true;
        b();
    }

    public final boolean a(atl atl) {
        atl atl2 = atl;
        aue aue = new aue();
        long d2 = atl.d();
        long j2 = 1024;
        if (d2 != -1 && d2 <= 1024) {
            j2 = d2;
        }
        int i2 = (int) j2;
        atl2.c(aue.a.a, 0, 4);
        long g2 = aue.a.g();
        aue.b = 4;
        while (true) {
            if (g2 != 440786851) {
                int i3 = aue.b + 1;
                aue.b = i3;
                if (i3 == i2) {
                    break;
                }
                atl2.c(aue.a.a, 0, 1);
                g2 = ((g2 << 8) & -256) | ((long) (aue.a.a[0] & 255));
            } else {
                long a2 = aue.a(atl2);
                long j3 = (long) aue.b;
                if (a2 != Long.MIN_VALUE && (d2 == -1 || j3 + a2 < d2)) {
                    while (true) {
                        long j4 = j3 + a2;
                        if (((long) aue.b) < j4) {
                            if (aue.a(atl2) == Long.MIN_VALUE) {
                                break;
                            }
                            long a3 = aue.a(atl2);
                            if (a3 < 0 || a3 > 2147483647L) {
                                return false;
                            }
                            if (a3 != 0) {
                                int i4 = (int) a3;
                                atl2.c(i4);
                                aue.b += i4;
                            }
                        } else if (((long) aue.b) == j4) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
