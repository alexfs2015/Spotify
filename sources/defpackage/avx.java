package defpackage;

import android.media.MediaCodecInfo.AudioCapabilities;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import android.util.Pair;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil;

/* renamed from: avx reason: default package */
public final class avx {
    public final String a;
    public final String b;
    public final CodecCapabilities c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    private boolean g;
    private final boolean h;

    public static avx a(String str, String str2, CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        avx avx = new avx(str, str2, codecCapabilities, false, z, z2);
        return avx;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005c, code lost:
        if ((defpackage.bdw.a >= 21 && r4.isFeatureSupported("secure-playback")) != false) goto L_0x0060;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public avx(java.lang.String r2, java.lang.String r3, android.media.MediaCodecInfo.CodecCapabilities r4, boolean r5, boolean r6, boolean r7) {
        /*
            r1 = this;
            r1.<init>()
            java.lang.Object r2 = defpackage.bcu.a(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.f = r5
            r2 = 1
            r5 = 0
            if (r6 != 0) goto L_0x002c
            if (r4 == 0) goto L_0x002c
            int r6 = defpackage.bdw.a
            r0 = 19
            if (r6 < r0) goto L_0x0027
            java.lang.String r6 = "adaptive-playback"
            boolean r6 = r4.isFeatureSupported(r6)
            if (r6 == 0) goto L_0x0027
            r6 = 1
            goto L_0x0028
        L_0x0027:
            r6 = 0
        L_0x0028:
            if (r6 == 0) goto L_0x002c
            r6 = 1
            goto L_0x002d
        L_0x002c:
            r6 = 0
        L_0x002d:
            r1.g = r6
            r6 = 21
            if (r4 == 0) goto L_0x0046
            int r0 = defpackage.bdw.a
            if (r0 < r6) goto L_0x0041
            java.lang.String r0 = "tunneled-playback"
            boolean r0 = r4.isFeatureSupported(r0)
            if (r0 == 0) goto L_0x0041
            r0 = 1
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            if (r0 == 0) goto L_0x0046
            r0 = 1
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            r1.d = r0
            if (r7 != 0) goto L_0x0060
            if (r4 == 0) goto L_0x005f
            int r7 = defpackage.bdw.a
            if (r7 < r6) goto L_0x005b
            java.lang.String r6 = "secure-playback"
            boolean r4 = r4.isFeatureSupported(r6)
            if (r4 == 0) goto L_0x005b
            r4 = 1
            goto L_0x005c
        L_0x005b:
            r4 = 0
        L_0x005c:
            if (r4 == 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r2 = 0
        L_0x0060:
            r1.e = r2
            boolean r2 = defpackage.bdg.b(r3)
            r1.h = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avx.<init>(java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean):void");
    }

    public final String toString() {
        return this.a;
    }

    public final CodecProfileLevel[] a() {
        CodecCapabilities codecCapabilities = this.c;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new CodecProfileLevel[0] : this.c.profileLevels;
    }

    public final boolean a(aqe aqe) {
        boolean z = false;
        if (!b(aqe.d)) {
            return false;
        }
        if (this.h) {
            if (aqe.k <= 0 || aqe.l <= 0) {
                return true;
            }
            if (bdw.a >= 21) {
                return a(aqe.k, aqe.l, (double) aqe.m);
            }
            if (aqe.k * aqe.l <= MediaCodecUtil.b()) {
                z = true;
            }
            if (!z) {
                StringBuilder sb = new StringBuilder("legacyFrameSize, ");
                sb.append(aqe.k);
                sb.append("x");
                sb.append(aqe.l);
                a(sb.toString());
            }
            return z;
        } else if (bdw.a < 21 || ((aqe.r == -1 || a(aqe.r)) && (aqe.q == -1 || b(aqe.q)))) {
            return true;
        } else {
            return false;
        }
    }

    private boolean b(String str) {
        CodecProfileLevel[] a2;
        if (str == null || this.b == null) {
            return true;
        }
        String f2 = bdg.f(str);
        if (f2 == null) {
            return true;
        }
        String str2 = ", ";
        if (!this.b.equals(f2)) {
            StringBuilder sb = new StringBuilder("codec.mime ");
            sb.append(str);
            sb.append(str2);
            sb.append(f2);
            a(sb.toString());
            return false;
        }
        Pair a3 = MediaCodecUtil.a(str);
        if (a3 == null) {
            return true;
        }
        for (CodecProfileLevel codecProfileLevel : a()) {
            if (codecProfileLevel.profile == ((Integer) a3.first).intValue() && codecProfileLevel.level >= ((Integer) a3.second).intValue()) {
                return true;
            }
        }
        StringBuilder sb2 = new StringBuilder("codec.profileLevel, ");
        sb2.append(str);
        sb2.append(str2);
        sb2.append(f2);
        a(sb2.toString());
        return false;
    }

    public final boolean b(aqe aqe) {
        if (this.h) {
            return this.g;
        }
        Pair a2 = MediaCodecUtil.a(aqe.d);
        return a2 != null && ((Integer) a2.first).intValue() == 42;
    }

    public final boolean a(aqe aqe, aqe aqe2, boolean z) {
        if (this.h) {
            return aqe.f.equals(aqe2.f) && aqe.n == aqe2.n && (this.g || (aqe.k == aqe2.k && aqe.l == aqe2.l)) && ((!z && aqe2.p == null) || bdw.a((Object) aqe.p, (Object) aqe2.p));
        }
        if ("audio/mp4a-latm".equals(this.b) && aqe.f.equals(aqe2.f) && aqe.q == aqe2.q && aqe.r == aqe2.r) {
            Pair a2 = MediaCodecUtil.a(aqe.d);
            Pair a3 = MediaCodecUtil.a(aqe2.d);
            if (!(a2 == null || a3 == null)) {
                return ((Integer) a2.first).intValue() == 42 && ((Integer) a3.first).intValue() == 42;
            }
        }
    }

    public final boolean a(int i, int i2, double d2) {
        CodecCapabilities codecCapabilities = this.c;
        if (codecCapabilities == null) {
            a("sizeAndRate.caps");
            return false;
        }
        VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            a("sizeAndRate.vCaps");
            return false;
        }
        if (!a(videoCapabilities, i, i2, d2)) {
            String str = "x";
            if (i >= i2 || !a(videoCapabilities, i2, i, d2)) {
                StringBuilder sb = new StringBuilder("sizeAndRate.support, ");
                sb.append(i);
                sb.append(str);
                sb.append(i2);
                sb.append(str);
                sb.append(d2);
                a(sb.toString());
                return false;
            }
            StringBuilder sb2 = new StringBuilder("sizeAndRate.rotated, ");
            sb2.append(i);
            sb2.append(str);
            sb2.append(i2);
            sb2.append(str);
            sb2.append(d2);
            c(sb2.toString());
        }
        return true;
    }

    private boolean a(int i) {
        CodecCapabilities codecCapabilities = this.c;
        if (codecCapabilities == null) {
            a("sampleRate.caps");
            return false;
        }
        AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            a("sampleRate.aCaps");
            return false;
        } else if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder("sampleRate.support, ");
            sb.append(i);
            a(sb.toString());
            return false;
        }
    }

    private boolean b(int i) {
        CodecCapabilities codecCapabilities = this.c;
        if (codecCapabilities == null) {
            a("channelCount.caps");
            return false;
        }
        AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            a("channelCount.aCaps");
            return false;
        } else if (a(this.a, this.b, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder("channelCount.support, ");
            sb.append(i);
            a(sb.toString());
            return false;
        }
    }

    public void a(String str) {
        StringBuilder sb = new StringBuilder("NoSupport [");
        sb.append(str);
        String str2 = "] [";
        sb.append(str2);
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(str2);
        sb.append(bdw.e);
        sb.append("]");
        bdd.a("MediaCodecInfo", sb.toString());
    }

    private void c(String str) {
        StringBuilder sb = new StringBuilder("AssumedSupport [");
        sb.append(str);
        String str2 = "] [";
        sb.append(str2);
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(str2);
        sb.append(bdw.e);
        sb.append("]");
        bdd.a("MediaCodecInfo", sb.toString());
    }

    private static int a(String str, String str2, int i) {
        if (i > 1 || ((bdw.a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        int i2 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        StringBuilder sb = new StringBuilder("AssumedMaxChannelAdjustment: ");
        sb.append(str);
        sb.append(", [");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        sb.append("]");
        bdd.c("MediaCodecInfo", sb.toString());
        return i2;
    }

    private static boolean a(VideoCapabilities videoCapabilities, int i, int i2, double d2) {
        if (d2 == -1.0d || d2 <= 0.0d) {
            return videoCapabilities.isSizeSupported(i, i2);
        }
        return videoCapabilities.areSizeAndRateSupported(i, i2, d2);
    }
}
