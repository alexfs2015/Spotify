package defpackage;

import com.comscore.android.id.IdHelperAndroid;
import com.spotify.mobile.android.util.connectivity.ConnectionType;
import com.spotify.mobile.android.video.drm.EncryptionType;
import java.util.EnumMap;
import java.util.Map;

/* renamed from: jzw reason: default package */
public final class jzw {
    private long A;
    private long B;
    private String C;
    private boolean D;
    private String E;
    private String F;
    private int G;
    private long H;
    private String I;
    private String J;
    private boolean K;
    private long L;
    private long M;
    private long N;
    private long O;
    private long P;
    private long Q;
    private long R;
    private long S;
    private long T;
    private EncryptionType U;
    private long V;
    private final long W;
    private final long X;
    private final aqe Y;
    private final long Z;
    final boolean a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private long q;
    private long r;
    private long s;
    private int t;
    private long u;
    private int v;
    private long w;
    private long x;
    private long y;
    private boolean z;

    /* renamed from: jzw$a */
    public static class a {
        private static final Map<ConnectionType, String> U;
        /* access modifiers changed from: private */
        public String A;
        /* access modifiers changed from: private */
        public String B;
        /* access modifiers changed from: private */
        public String C;
        /* access modifiers changed from: private */
        public String D;
        /* access modifiers changed from: private */
        public String E;
        /* access modifiers changed from: private */
        public String F = IdHelperAndroid.NO_ID_AVAILABLE;
        /* access modifiers changed from: private */
        public String G;
        /* access modifiers changed from: private */
        public String H;
        /* access modifiers changed from: private */
        public String I;
        /* access modifiers changed from: private */
        public String J;
        /* access modifiers changed from: private */
        public String K;
        /* access modifiers changed from: private */
        public String L;
        /* access modifiers changed from: private */
        public String M;
        /* access modifiers changed from: private */
        public long N;
        /* access modifiers changed from: private */
        public long O;
        /* access modifiers changed from: private */
        public long P;
        /* access modifiers changed from: private */
        public String Q;
        /* access modifiers changed from: private */
        public String R;
        /* access modifiers changed from: private */
        public EncryptionType S;
        /* access modifiers changed from: private */
        public long T;
        private boolean V;
        private boolean W;
        private boolean X;
        private boolean Y;
        /* access modifiers changed from: 0000 */
        public String a;
        /* access modifiers changed from: 0000 */
        public boolean b;
        /* access modifiers changed from: 0000 */
        public String c;
        /* access modifiers changed from: 0000 */
        public String d;
        /* access modifiers changed from: 0000 */
        public long e;
        /* access modifiers changed from: 0000 */
        public long f;
        /* access modifiers changed from: 0000 */
        public int g;
        /* access modifiers changed from: 0000 */
        public long h;
        /* access modifiers changed from: 0000 */
        public int i;
        /* access modifiers changed from: 0000 */
        public long j;
        /* access modifiers changed from: 0000 */
        public boolean k;
        /* access modifiers changed from: 0000 */
        public long l;
        /* access modifiers changed from: 0000 */
        public long m;
        /* access modifiers changed from: 0000 */
        public int n;
        /* access modifiers changed from: 0000 */
        public long o;
        /* access modifiers changed from: 0000 */
        public long p;
        /* access modifiers changed from: 0000 */
        public long q;
        /* access modifiers changed from: 0000 */
        public long r;
        /* access modifiers changed from: 0000 */
        public long s;
        /* access modifiers changed from: 0000 */
        public long t;
        /* access modifiers changed from: 0000 */
        public long u;
        /* access modifiers changed from: 0000 */
        public long v;
        /* access modifiers changed from: 0000 */
        public long w;
        /* access modifiers changed from: 0000 */
        public long x;
        /* access modifiers changed from: private */
        public final String y;
        /* access modifiers changed from: private */
        public String z;

        static /* synthetic */ boolean G(a aVar) {
            return false;
        }

        static /* synthetic */ long H(a aVar) {
            return 0;
        }

        static /* synthetic */ long K(a aVar) {
            return 0;
        }

        static /* synthetic */ long N(a aVar) {
            return 0;
        }

        static /* synthetic */ aqe Y(a aVar) {
            return null;
        }

        static /* synthetic */ boolean a(a aVar) {
            return false;
        }

        static {
            EnumMap enumMap = new EnumMap(ConnectionType.class);
            U = enumMap;
            enumMap.put(ConnectionType.CONNECTION_TYPE_UNKNOWN, "unknown");
            U.put(ConnectionType.CONNECTION_TYPE_NONE, IdHelperAndroid.NO_ID_AVAILABLE);
            U.put(ConnectionType.CONNECTION_TYPE_GPRS, "gprs");
            U.put(ConnectionType.CONNECTION_TYPE_EDGE, "edge");
            U.put(ConnectionType.CONNECTION_TYPE_3G, "3g");
            U.put(ConnectionType.CONNECTION_TYPE_4G, "4g");
            U.put(ConnectionType.CONNECTION_TYPE_WLAN, "wlan");
            U.put(ConnectionType.CONNECTION_TYPE_ETHERNET, "ethernet");
        }

        public a(String str) {
            String str2 = "";
            this.z = str2;
            this.B = str2;
            this.C = str2;
            this.D = str2;
            this.E = str2;
            this.G = str2;
            this.H = str2;
            this.I = str2;
            this.J = str2;
            this.K = str2;
            this.L = "unknown";
            this.N = -1;
            this.O = -1;
            this.P = -1;
            this.Q = str2;
            this.R = str2;
            this.p = -1;
            fay.a(str);
            this.y = str;
        }

        public final a a(String str) {
            fay.a(str);
            this.z = str;
            return this;
        }

        public final a b(String str) {
            fay.a(str);
            this.A = str;
            return this;
        }

        public final a c(String str) {
            fay.a(str);
            this.B = str;
            return this;
        }

        public final a d(String str) {
            fay.a(str);
            this.C = str;
            return this;
        }

        public final a e(String str) {
            fay.a(str);
            this.D = str;
            return this;
        }

        public final a f(String str) {
            fay.a(str);
            this.E = str;
            return this;
        }

        public final a g(String str) {
            fay.a(str);
            this.F = str;
            return this;
        }

        public final a a(kab kab) {
            fay.a(kab);
            this.L = kab.a();
            return this;
        }

        public final a h(String str) {
            fay.a(str);
            this.M = str;
            return this;
        }

        public final a i(String str) {
            fay.a(str);
            this.H = str;
            return this;
        }

        public final a j(String str) {
            fay.a(str);
            this.I = str;
            return this;
        }

        public final a k(String str) {
            fay.a(str);
            this.J = str;
            return this;
        }

        public final a l(String str) {
            fay.a(str);
            this.K = str;
            return this;
        }

        public final a m(String str) {
            fay.a(str);
            this.G = str;
            return this;
        }

        public final a a(long j2) {
            this.Y = true;
            this.N = j2;
            return this;
        }

        public final a b(long j2) {
            this.O = j2;
            this.W = true;
            return this;
        }

        public final a c(long j2) {
            this.P = j2;
            this.V = true;
            return this;
        }

        public final a a(ConnectionType connectionType) {
            this.Q = (String) U.get(connectionType);
            if (this.Q == null) {
                this.Q = "unknown";
            }
            return this;
        }

        public final a b(ConnectionType connectionType) {
            this.R = (String) U.get(connectionType);
            if (this.R == null) {
                this.R = "unknown";
            }
            return this;
        }

        public final a a(EncryptionType encryptionType) {
            if (this.S == null) {
                this.S = encryptionType;
            }
            return this;
        }

        public final a d(long j2) {
            this.T = j2;
            this.X = true;
            return this;
        }

        public final jzw a() {
            return new jzw(this, 0);
        }
    }

    /* synthetic */ jzw(a aVar, byte b2) {
        this(aVar);
    }

    private jzw(a aVar) {
        this.a = a.a(aVar);
        this.b = aVar.z;
        this.c = aVar.y;
        this.d = aVar.A;
        this.e = aVar.B;
        this.f = aVar.C;
        this.h = aVar.D;
        this.g = aVar.E;
        this.i = aVar.F;
        this.j = aVar.G;
        this.k = aVar.H;
        this.l = aVar.I;
        this.m = aVar.J;
        this.n = aVar.K;
        this.o = aVar.L;
        this.p = aVar.M;
        this.q = aVar.e;
        this.r = aVar.f;
        this.s = aVar.N;
        this.t = aVar.g;
        this.u = aVar.h;
        this.v = aVar.i;
        this.w = aVar.j;
        this.x = aVar.O;
        this.y = aVar.P;
        this.z = aVar.k;
        this.A = aVar.l;
        this.B = aVar.m;
        this.G = aVar.n;
        this.H = aVar.o;
        this.I = aVar.Q;
        this.J = aVar.R;
        this.K = a.G(aVar);
        this.L = a.H(aVar);
        this.M = aVar.p;
        this.N = aVar.q;
        this.O = a.K(aVar);
        this.P = aVar.r;
        this.Q = aVar.s;
        this.R = a.N(aVar);
        this.D = aVar.b;
        this.C = aVar.a;
        this.E = aVar.c;
        this.F = aVar.d;
        this.S = aVar.t;
        this.T = aVar.u;
        this.U = aVar.S;
        this.V = aVar.T;
        this.W = aVar.v;
        this.X = aVar.w;
        this.Y = a.Y(aVar);
        this.Z = aVar.x;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackReport{mManifestId='");
        sb.append(this.b);
        sb.append('\'');
        sb.append(", mPlaybackId='");
        sb.append(this.c);
        sb.append('\'');
        sb.append(", mVideoSessionId='");
        sb.append(this.d);
        sb.append('\'');
        sb.append(", mFeatureIdentifier='");
        sb.append(this.e);
        sb.append('\'');
        sb.append(", mFeatureVersion='");
        sb.append(this.f);
        sb.append('\'');
        sb.append(", mContextUri='");
        sb.append(this.g);
        sb.append('\'');
        sb.append(", mViewUri='");
        sb.append(this.h);
        sb.append('\'');
        sb.append(", mGaiaDeviceId='");
        sb.append(this.i);
        sb.append('\'');
        sb.append(", mProvider='");
        sb.append(this.j);
        sb.append('\'');
        sb.append(", mReferrer='");
        sb.append(this.k);
        sb.append('\'');
        sb.append(", mReferrerVersion='");
        sb.append(this.l);
        sb.append('\'');
        sb.append(", mReferrerVendor='");
        sb.append(this.m);
        sb.append('\'');
        sb.append(", mStreamingRule='");
        sb.append(this.n);
        sb.append('\'');
        sb.append(", mReasonEnd='");
        sb.append(this.o);
        sb.append('\'');
        sb.append(", mReasonStart='");
        sb.append(this.p);
        sb.append('\'');
        sb.append(", mMsPlayed=");
        sb.append(this.q);
        sb.append(", mMsTotalEstimated=");
        sb.append(this.r);
        sb.append(", mMsManifestLatency=");
        sb.append(this.s);
        sb.append(", mNSeekBack=");
        sb.append(this.t);
        sb.append(", mMsSeekBack=");
        sb.append(this.u);
        sb.append(", mNSeekForward=");
        sb.append(this.v);
        sb.append(", mMsSeekForward=");
        sb.append(this.w);
        sb.append(", mMsLatency=");
        sb.append(this.x);
        sb.append(", mMsUiLatency=");
        sb.append(this.y);
        sb.append(", mShuffle=");
        sb.append(this.z);
        sb.append(", mMsMaxContinuous=");
        sb.append(this.A);
        sb.append(", mMsUnionPlayed=");
        sb.append(this.B);
        sb.append(", mPlayedTrack='");
        sb.append(this.C);
        sb.append('\'');
        sb.append(", mPrivateSession=");
        sb.append(this.D);
        sb.append(", mAudioCodec='");
        sb.append(this.E);
        sb.append('\'');
        sb.append(", mVideoCodec='");
        sb.append(this.F);
        sb.append('\'');
        sb.append(", mNStalls=");
        sb.append(this.G);
        sb.append(", mTimeWeightedBitrate=");
        sb.append(this.H);
        sb.append(", mStartConnectionType='");
        sb.append(this.I);
        sb.append('\'');
        sb.append(", mEndConnectionType='");
        sb.append(this.J);
        sb.append('\'');
        sb.append(", mIsTrackingOngoing=");
        sb.append(this.K);
        sb.append(", mMsStalled=");
        sb.append(this.L);
        sb.append(", mStartOffsetMs=");
        sb.append(this.M);
        sb.append(", mMsInitialBuffering=");
        sb.append(this.N);
        sb.append(", mMsSeekRebuffering=");
        sb.append(this.O);
        sb.append(", mMaxMsSeekRebuffering=");
        sb.append(this.P);
        sb.append(", mMaxMsStalled=");
        sb.append(this.Q);
        sb.append(", mPrefetchedBytesLoaded=");
        sb.append(this.R);
        sb.append(", mInitialBitrate=");
        sb.append(this.S);
        sb.append(", mMsFullscreen=");
        sb.append(this.T);
        sb.append(", mEncryptionType=");
        sb.append(this.U);
        sb.append(", mMsKeyLatency=");
        sb.append(this.V);
        sb.append(", mTotalBytesTransfered=");
        sb.append(this.W);
        sb.append(", mLocalTimeMs=");
        sb.append(this.X);
        sb.append(", mLastKnownVideoFormat=");
        sb.append(this.Y);
        sb.append(", mMsPlayedInBackground=");
        sb.append(this.Z);
        sb.append(", mMarkedEmpty=");
        sb.append(this.a);
        sb.append('}');
        return sb.toString();
    }

    public final y a(long j2, String str) {
        String str2;
        long j3;
        String str3 = this.d;
        byte[] a2 = juq.a(this.b);
        byte[] a3 = juq.a(this.c);
        String str4 = this.e;
        String str5 = this.f;
        String str6 = this.h;
        String str7 = this.p;
        String str8 = this.o;
        long j4 = this.q;
        long j5 = this.r;
        long j6 = j4;
        long j7 = this.s;
        long j8 = (long) this.t;
        long j9 = this.u;
        long j10 = (long) this.v;
        long j11 = this.w;
        long j12 = this.x;
        long j13 = this.y;
        long j14 = this.M;
        long j15 = this.N;
        long j16 = this.O;
        long j17 = this.L;
        long j18 = this.P;
        long j19 = this.Q;
        long j20 = (long) this.G;
        boolean z2 = this.z;
        long j21 = j20;
        long j22 = this.A;
        long j23 = this.B;
        String str9 = this.g;
        long j24 = j23;
        String str10 = this.E;
        String str11 = this.F;
        String str12 = str10;
        String str13 = this.C;
        boolean z3 = this.D;
        String str14 = this.j;
        String str15 = this.k;
        String str16 = this.l;
        String str17 = this.m;
        String str18 = this.n;
        String str19 = this.i;
        String str20 = str11;
        long j25 = this.S;
        long j26 = this.T;
        long j27 = this.H;
        long j28 = this.R;
        String str21 = str9;
        EncryptionType encryptionType = this.U;
        if (encryptionType == null) {
            str2 = IdHelperAndroid.NO_ID_AVAILABLE;
            j3 = j5;
        } else {
            j3 = j5;
            str2 = encryptionType == EncryptionType.WIDEVINE ? "widevine" : "";
        }
        long j29 = j28;
        long j30 = j27;
        long j31 = j26;
        long j32 = j25;
        String str22 = str18;
        String str23 = str19;
        String str24 = str15;
        String str25 = str17;
        String str26 = str14;
        String str27 = str20;
        String str28 = str16;
        long j33 = j24;
        long j34 = j22;
        long j35 = j6;
        long j36 = j3;
        boolean z4 = z2;
        String str29 = str21;
        y yVar = new y(j2, str, str3, a2, a3, str4, str5, str6, str7, str8, j35, j36, false, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, z4, j34, j33, str29, str12, str27, str13, z3, str26, str24, str28, str25, str22, str23, j32, j31, j30, -1, j29, str2, this.V, this.W, this.X, this.I, this.J, this.Z);
        return yVar;
    }

    public final boolean a() {
        return !kaa.a.b.equals(this.p) || this.q >= 100;
    }
}
