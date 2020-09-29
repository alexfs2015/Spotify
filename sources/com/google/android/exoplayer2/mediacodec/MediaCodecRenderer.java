package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CodecException;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil.DecoderQueryException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public abstract class MediaCodecRenderer extends aql {
    private static final byte[] k = ben.h("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private float A;
    private float B;
    private boolean C;
    private ArrayDeque<awo> D;
    private DecoderInitializationException E;
    private int F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private ByteBuffer[] P;
    private ByteBuffer[] Q;
    private long R;
    private int S;
    private int T;
    private ByteBuffer U;
    private boolean V;
    private boolean W;
    private int X;
    private int Y;
    private boolean Z;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private boolean ae;
    protected MediaCodec h;
    protected awo i;
    protected asl j;
    private final awp l;
    private final asu<asy> m;
    private final boolean n;
    private final float o;
    private final asm p;
    private final asm q;
    private final aqw r;
    private final bej<aqv> s;
    private final List<Long> t;
    private final BufferInfo u;
    private aqv v;
    private aqv w;
    private aqv x;
    private DrmSession<asy> y;
    private DrmSession<asy> z;

    public static class DecoderInitializationException extends Exception {
        public final String decoderName;
        public final String diagnosticInfo;
        public final DecoderInitializationException fallbackDecoderInitializationException;
        public final String mimeType;
        public final boolean secureDecoderRequired;

        public DecoderInitializationException(aqv aqv, Throwable th, boolean z, int i) {
            StringBuilder sb = new StringBuilder("Decoder init failed: [");
            sb.append(i);
            sb.append("], ");
            sb.append(aqv);
            String sb2 = sb.toString();
            String str = aqv.f;
            String str2 = i < 0 ? "neg_" : "";
            StringBuilder sb3 = new StringBuilder("com.google.android.exoplayer.MediaCodecTrackRenderer_");
            sb3.append(str2);
            sb3.append(Math.abs(i));
            this(sb2, th, str, z, null, sb3.toString(), null);
        }

        public DecoderInitializationException(aqv aqv, Throwable th, boolean z, String str) {
            StringBuilder sb = new StringBuilder("Decoder init failed: ");
            sb.append(str);
            sb.append(", ");
            sb.append(aqv);
            this(sb.toString(), th, aqv.f, z, str, (ben.a < 21 || !(th instanceof CodecException)) ? null : ((CodecException) th).getDiagnosticInfo(), null);
        }

        private DecoderInitializationException(String str, Throwable th, String str2, boolean z, String str3, String str4, DecoderInitializationException decoderInitializationException) {
            super(str, th);
            this.mimeType = str2;
            this.secureDecoderRequired = z;
            this.decoderName = str3;
            this.diagnosticInfo = str4;
            this.fallbackDecoderInitializationException = decoderInitializationException;
        }

        static /* synthetic */ DecoderInitializationException a(DecoderInitializationException decoderInitializationException, DecoderInitializationException decoderInitializationException2) {
            DecoderInitializationException decoderInitializationException3 = new DecoderInitializationException(decoderInitializationException.getMessage(), decoderInitializationException.getCause(), decoderInitializationException.mimeType, decoderInitializationException.secureDecoderRequired, decoderInitializationException.decoderName, decoderInitializationException.diagnosticInfo, decoderInitializationException2);
            return decoderInitializationException3;
        }
    }

    public MediaCodecRenderer(int i2, awp awp, asu<asy> asu, boolean z2, float f) {
        super(i2);
        bdl.b(ben.a >= 16);
        this.l = (awp) bdl.a(awp);
        this.m = asu;
        this.n = z2;
        this.o = f;
        this.p = new asm(0);
        this.q = new asm(0);
        this.r = new aqw();
        this.s = new bej<>();
        this.t = new ArrayList();
        this.u = new BufferInfo();
        this.X = 0;
        this.Y = 0;
        this.B = -1.0f;
        this.A = 1.0f;
    }

    private void A() {
        this.T = -1;
        this.U = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:88:0x015b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x015c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean B() {
        /*
            r13 = this;
            android.media.MediaCodec r0 = r13.h
            r1 = 0
            if (r0 == 0) goto L_0x01ef
            int r2 = r13.Y
            r3 = 2
            if (r2 == r3) goto L_0x01ef
            boolean r2 = r13.ab
            if (r2 == 0) goto L_0x0010
            goto L_0x01ef
        L_0x0010:
            int r2 = r13.S
            if (r2 >= 0) goto L_0x003b
            r4 = 0
            int r0 = r0.dequeueInputBuffer(r4)
            r13.S = r0
            int r0 = r13.S
            if (r0 >= 0) goto L_0x0021
            return r1
        L_0x0021:
            asm r2 = r13.p
            int r4 = defpackage.ben.a
            r5 = 21
            if (r4 < r5) goto L_0x0030
            android.media.MediaCodec r4 = r13.h
            java.nio.ByteBuffer r0 = r4.getInputBuffer(r0)
            goto L_0x0034
        L_0x0030:
            java.nio.ByteBuffer[] r4 = r13.P
            r0 = r4[r0]
        L_0x0034:
            r2.c = r0
            asm r0 = r13.p
            r0.a()
        L_0x003b:
            int r0 = r13.Y
            r2 = 1
            if (r0 != r2) goto L_0x0058
            boolean r0 = r13.O
            if (r0 != 0) goto L_0x0055
            r13.aa = r2
            android.media.MediaCodec r4 = r13.h
            int r5 = r13.S
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 4
            r4.queueInputBuffer(r5, r6, r7, r8, r10)
            r13.z()
        L_0x0055:
            r13.Y = r3
            return r1
        L_0x0058:
            boolean r0 = r13.M
            if (r0 == 0) goto L_0x007b
            r13.M = r1
            asm r0 = r13.p
            java.nio.ByteBuffer r0 = r0.c
            byte[] r1 = k
            r0.put(r1)
            android.media.MediaCodec r3 = r13.h
            int r4 = r13.S
            r5 = 0
            byte[] r0 = k
            int r6 = r0.length
            r7 = 0
            r9 = 0
            r3.queueInputBuffer(r4, r5, r6, r7, r9)
            r13.z()
            r13.Z = r2
            return r2
        L_0x007b:
            boolean r0 = r13.ad
            if (r0 == 0) goto L_0x0082
            r0 = -4
            r4 = 0
            goto L_0x00ba
        L_0x0082:
            int r0 = r13.X
            if (r0 != r2) goto L_0x00a7
            r0 = 0
        L_0x0087:
            aqv r4 = r13.v
            java.util.List<byte[]> r4 = r4.h
            int r4 = r4.size()
            if (r0 >= r4) goto L_0x00a5
            aqv r4 = r13.v
            java.util.List<byte[]> r4 = r4.h
            java.lang.Object r4 = r4.get(r0)
            byte[] r4 = (byte[]) r4
            asm r5 = r13.p
            java.nio.ByteBuffer r5 = r5.c
            r5.put(r4)
            int r0 = r0 + 1
            goto L_0x0087
        L_0x00a5:
            r13.X = r3
        L_0x00a7:
            asm r0 = r13.p
            java.nio.ByteBuffer r0 = r0.c
            int r0 = r0.position()
            aqw r4 = r13.r
            asm r5 = r13.p
            int r4 = r13.a(r4, r5, r1)
            r12 = r4
            r4 = r0
            r0 = r12
        L_0x00ba:
            r5 = -3
            if (r0 != r5) goto L_0x00be
            return r1
        L_0x00be:
            r5 = -5
            if (r0 != r5) goto L_0x00d4
            int r0 = r13.X
            if (r0 != r3) goto L_0x00cc
            asm r0 = r13.p
            r0.a()
            r13.X = r2
        L_0x00cc:
            aqw r0 = r13.r
            aqv r0 = r0.a
            r13.b(r0)
            return r2
        L_0x00d4:
            asm r0 = r13.p
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x010f
            int r0 = r13.X
            if (r0 != r3) goto L_0x00e7
            asm r0 = r13.p
            r0.a()
            r13.X = r2
        L_0x00e7:
            r13.ab = r2
            boolean r0 = r13.Z
            if (r0 != 0) goto L_0x00f1
            r13.E()
            return r1
        L_0x00f1:
            boolean r0 = r13.O     // Catch:{ CryptoException -> 0x0107 }
            if (r0 != 0) goto L_0x0106
            r13.aa = r2     // Catch:{ CryptoException -> 0x0107 }
            android.media.MediaCodec r3 = r13.h     // Catch:{ CryptoException -> 0x0107 }
            int r4 = r13.S     // Catch:{ CryptoException -> 0x0107 }
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 4
            r3.queueInputBuffer(r4, r5, r6, r7, r9)     // Catch:{ CryptoException -> 0x0107 }
            r13.z()     // Catch:{ CryptoException -> 0x0107 }
        L_0x0106:
            return r1
        L_0x0107:
            r0 = move-exception
            int r1 = r13.b
            com.google.android.exoplayer2.ExoPlaybackException r0 = com.google.android.exoplayer2.ExoPlaybackException.a(r0, r1)
            throw r0
        L_0x010f:
            boolean r0 = r13.ae
            if (r0 == 0) goto L_0x0127
            asm r0 = r13.p
            boolean r0 = r0.d()
            if (r0 != 0) goto L_0x0127
            asm r0 = r13.p
            r0.a()
            int r0 = r13.X
            if (r0 != r3) goto L_0x0126
            r13.X = r2
        L_0x0126:
            return r2
        L_0x0127:
            r13.ae = r1
            asm r0 = r13.p
            boolean r0 = r0.e()
            com.google.android.exoplayer2.drm.DrmSession<asy> r3 = r13.y
            if (r3 == 0) goto L_0x0154
            if (r0 != 0) goto L_0x013a
            boolean r3 = r13.n
            if (r3 == 0) goto L_0x013a
            goto L_0x0154
        L_0x013a:
            com.google.android.exoplayer2.drm.DrmSession<asy> r3 = r13.y
            int r3 = r3.e()
            if (r3 == r2) goto L_0x0147
            r5 = 4
            if (r3 == r5) goto L_0x0154
            r3 = 1
            goto L_0x0155
        L_0x0147:
            com.google.android.exoplayer2.drm.DrmSession<asy> r0 = r13.y
            com.google.android.exoplayer2.drm.DrmSession$DrmSessionException r0 = r0.f()
            int r1 = r13.b
            com.google.android.exoplayer2.ExoPlaybackException r0 = com.google.android.exoplayer2.ExoPlaybackException.a(r0, r1)
            throw r0
        L_0x0154:
            r3 = 0
        L_0x0155:
            r13.ad = r3
            boolean r3 = r13.ad
            if (r3 == 0) goto L_0x015c
            return r1
        L_0x015c:
            boolean r3 = r13.H
            if (r3 == 0) goto L_0x0176
            if (r0 != 0) goto L_0x0176
            asm r3 = r13.p
            java.nio.ByteBuffer r3 = r3.c
            defpackage.bdy.a(r3)
            asm r3 = r13.p
            java.nio.ByteBuffer r3 = r3.c
            int r3 = r3.position()
            if (r3 != 0) goto L_0x0174
            return r2
        L_0x0174:
            r13.H = r1
        L_0x0176:
            asm r3 = r13.p     // Catch:{ CryptoException -> 0x01e7 }
            long r9 = r3.d     // Catch:{ CryptoException -> 0x01e7 }
            asm r3 = r13.p     // Catch:{ CryptoException -> 0x01e7 }
            boolean r3 = r3.n_()     // Catch:{ CryptoException -> 0x01e7 }
            if (r3 == 0) goto L_0x018b
            java.util.List<java.lang.Long> r3 = r13.t     // Catch:{ CryptoException -> 0x01e7 }
            java.lang.Long r5 = java.lang.Long.valueOf(r9)     // Catch:{ CryptoException -> 0x01e7 }
            r3.add(r5)     // Catch:{ CryptoException -> 0x01e7 }
        L_0x018b:
            aqv r3 = r13.w     // Catch:{ CryptoException -> 0x01e7 }
            if (r3 == 0) goto L_0x0199
            bej<aqv> r3 = r13.s     // Catch:{ CryptoException -> 0x01e7 }
            aqv r5 = r13.w     // Catch:{ CryptoException -> 0x01e7 }
            r3.a(r9, r5)     // Catch:{ CryptoException -> 0x01e7 }
            r3 = 0
            r13.w = r3     // Catch:{ CryptoException -> 0x01e7 }
        L_0x0199:
            asm r3 = r13.p     // Catch:{ CryptoException -> 0x01e7 }
            r3.f()     // Catch:{ CryptoException -> 0x01e7 }
            asm r3 = r13.p     // Catch:{ CryptoException -> 0x01e7 }
            r13.a(r3)     // Catch:{ CryptoException -> 0x01e7 }
            if (r0 == 0) goto L_0x01c7
            asm r0 = r13.p     // Catch:{ CryptoException -> 0x01e7 }
            asj r0 = r0.b     // Catch:{ CryptoException -> 0x01e7 }
            android.media.MediaCodec$CryptoInfo r8 = r0.d     // Catch:{ CryptoException -> 0x01e7 }
            if (r4 != 0) goto L_0x01ae
            goto L_0x01bd
        L_0x01ae:
            int[] r0 = r8.numBytesOfClearData     // Catch:{ CryptoException -> 0x01e7 }
            if (r0 != 0) goto L_0x01b6
            int[] r0 = new int[r2]     // Catch:{ CryptoException -> 0x01e7 }
            r8.numBytesOfClearData = r0     // Catch:{ CryptoException -> 0x01e7 }
        L_0x01b6:
            int[] r0 = r8.numBytesOfClearData     // Catch:{ CryptoException -> 0x01e7 }
            r3 = r0[r1]     // Catch:{ CryptoException -> 0x01e7 }
            int r3 = r3 + r4
            r0[r1] = r3     // Catch:{ CryptoException -> 0x01e7 }
        L_0x01bd:
            android.media.MediaCodec r5 = r13.h     // Catch:{ CryptoException -> 0x01e7 }
            int r6 = r13.S     // Catch:{ CryptoException -> 0x01e7 }
            r7 = 0
            r11 = 0
            r5.queueSecureInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ CryptoException -> 0x01e7 }
            goto L_0x01d8
        L_0x01c7:
            android.media.MediaCodec r5 = r13.h     // Catch:{ CryptoException -> 0x01e7 }
            int r6 = r13.S     // Catch:{ CryptoException -> 0x01e7 }
            r7 = 0
            asm r0 = r13.p     // Catch:{ CryptoException -> 0x01e7 }
            java.nio.ByteBuffer r0 = r0.c     // Catch:{ CryptoException -> 0x01e7 }
            int r8 = r0.limit()     // Catch:{ CryptoException -> 0x01e7 }
            r11 = 0
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ CryptoException -> 0x01e7 }
        L_0x01d8:
            r13.z()     // Catch:{ CryptoException -> 0x01e7 }
            r13.Z = r2     // Catch:{ CryptoException -> 0x01e7 }
            r13.X = r1     // Catch:{ CryptoException -> 0x01e7 }
            asl r0 = r13.j     // Catch:{ CryptoException -> 0x01e7 }
            int r1 = r0.c     // Catch:{ CryptoException -> 0x01e7 }
            int r1 = r1 + r2
            r0.c = r1     // Catch:{ CryptoException -> 0x01e7 }
            return r2
        L_0x01e7:
            r0 = move-exception
            int r1 = r13.b
            com.google.android.exoplayer2.ExoPlaybackException r0 = com.google.android.exoplayer2.ExoPlaybackException.a(r0, r1)
            throw r0
        L_0x01ef:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.B():boolean");
    }

    private void C() {
        if (this.v != null && ben.a >= 23) {
            float a = a(this.A, this.e);
            if (this.B != a) {
                this.B = a;
                if (this.h != null && this.Y == 0) {
                    if (a == -1.0f && this.C) {
                        D();
                    } else if (a != -1.0f && (this.C || a > this.o)) {
                        Bundle bundle = new Bundle();
                        bundle.putFloat("operating-rate", a);
                        this.h.setParameters(bundle);
                        this.C = true;
                    }
                }
            }
        }
    }

    private void D() {
        this.D = null;
        if (this.Z) {
            this.Y = 1;
            return;
        }
        v();
        t();
    }

    private void E() {
        if (this.Y == 2) {
            v();
            t();
            return;
        }
        this.ac = true;
        s();
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0106 A[Catch:{ Exception -> 0x010d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(android.media.MediaCrypto r20, boolean r21) {
        /*
            r19 = this;
            r7 = r19
            r8 = r21
            java.util.ArrayDeque<awo> r0 = r7.D
            java.lang.String r9 = "MediaCodecRenderer"
            r10 = 0
            r11 = 0
            if (r0 != 0) goto L_0x0062
            java.util.ArrayDeque r0 = new java.util.ArrayDeque     // Catch:{ DecoderQueryException -> 0x0056 }
            awp r1 = r7.l     // Catch:{ DecoderQueryException -> 0x0056 }
            aqv r2 = r7.v     // Catch:{ DecoderQueryException -> 0x0056 }
            java.util.List r1 = r7.a(r1, r2, r8)     // Catch:{ DecoderQueryException -> 0x0056 }
            boolean r2 = r1.isEmpty()     // Catch:{ DecoderQueryException -> 0x0056 }
            if (r2 == 0) goto L_0x004e
            if (r8 == 0) goto L_0x004e
            awp r1 = r7.l     // Catch:{ DecoderQueryException -> 0x0056 }
            aqv r2 = r7.v     // Catch:{ DecoderQueryException -> 0x0056 }
            java.util.List r1 = r7.a(r1, r2, r10)     // Catch:{ DecoderQueryException -> 0x0056 }
            boolean r2 = r1.isEmpty()     // Catch:{ DecoderQueryException -> 0x0056 }
            if (r2 != 0) goto L_0x004e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ DecoderQueryException -> 0x0056 }
            java.lang.String r3 = "Drm session requires secure decoder for "
            r2.<init>(r3)     // Catch:{ DecoderQueryException -> 0x0056 }
            aqv r3 = r7.v     // Catch:{ DecoderQueryException -> 0x0056 }
            java.lang.String r3 = r3.f     // Catch:{ DecoderQueryException -> 0x0056 }
            r2.append(r3)     // Catch:{ DecoderQueryException -> 0x0056 }
            java.lang.String r3 = ", but no secure decoder available. Trying to proceed with "
            r2.append(r3)     // Catch:{ DecoderQueryException -> 0x0056 }
            r2.append(r1)     // Catch:{ DecoderQueryException -> 0x0056 }
            java.lang.String r3 = "."
            r2.append(r3)     // Catch:{ DecoderQueryException -> 0x0056 }
            java.lang.String r2 = r2.toString()     // Catch:{ DecoderQueryException -> 0x0056 }
            defpackage.bdu.c(r9, r2)     // Catch:{ DecoderQueryException -> 0x0056 }
        L_0x004e:
            r0.<init>(r1)     // Catch:{ DecoderQueryException -> 0x0056 }
            r7.D = r0     // Catch:{ DecoderQueryException -> 0x0056 }
            r7.E = r11     // Catch:{ DecoderQueryException -> 0x0056 }
            goto L_0x0062
        L_0x0056:
            r0 = move-exception
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r1 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            aqv r2 = r7.v
            r3 = -49998(0xffffffffffff3cb2, float:NaN)
            r1.<init>(r2, r0, r8, r3)
            throw r1
        L_0x0062:
            java.util.ArrayDeque<awo> r0 = r7.D
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0147
        L_0x006a:
            java.util.ArrayDeque<awo> r0 = r7.D
            java.lang.Object r0 = r0.peekFirst()
            r12 = r0
            awo r12 = (defpackage.awo) r12
            boolean r0 = r7.a(r12)
            if (r0 != 0) goto L_0x007a
            return r10
        L_0x007a:
            java.lang.String r0 = r12.a     // Catch:{ Exception -> 0x010d }
            r19.C()     // Catch:{ Exception -> 0x010d }
            float r1 = r7.B     // Catch:{ Exception -> 0x010d }
            float r2 = r7.o     // Catch:{ Exception -> 0x010d }
            r13 = 1
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x008a
            r14 = 1
            goto L_0x008b
        L_0x008a:
            r14 = 0
        L_0x008b:
            long r15 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0102 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0102 }
            java.lang.String r2 = "createCodec:"
            r1.<init>(r2)     // Catch:{ Exception -> 0x0102 }
            r1.append(r0)     // Catch:{ Exception -> 0x0102 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0102 }
            defpackage.bel.a(r1)     // Catch:{ Exception -> 0x0102 }
            android.media.MediaCodec r6 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x0102 }
            defpackage.bel.a()     // Catch:{ Exception -> 0x00ff }
            java.lang.String r1 = "configureCodec"
            defpackage.bel.a(r1)     // Catch:{ Exception -> 0x00ff }
            aqv r4 = r7.v     // Catch:{ Exception -> 0x00ff }
            if (r14 == 0) goto L_0x00b5
            float r1 = r7.B     // Catch:{ Exception -> 0x00ff }
            r17 = r1
            goto L_0x00b9
        L_0x00b5:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r17 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x00b9:
            r1 = r19
            r2 = r12
            r3 = r6
            r5 = r20
            r18 = r6
            r6 = r17
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x00fb }
            r7.C = r14     // Catch:{ Exception -> 0x00fb }
            defpackage.bel.a()     // Catch:{ Exception -> 0x00fb }
            java.lang.String r1 = "startCodec"
            defpackage.bel.a(r1)     // Catch:{ Exception -> 0x00fb }
            r18.start()     // Catch:{ Exception -> 0x00fb }
            defpackage.bel.a()     // Catch:{ Exception -> 0x00fb }
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x00fb }
            int r1 = defpackage.ben.a     // Catch:{ Exception -> 0x00fb }
            r2 = 21
            if (r1 >= r2) goto L_0x00ec
            java.nio.ByteBuffer[] r1 = r18.getInputBuffers()     // Catch:{ Exception -> 0x00fb }
            r7.P = r1     // Catch:{ Exception -> 0x00fb }
            java.nio.ByteBuffer[] r1 = r18.getOutputBuffers()     // Catch:{ Exception -> 0x00fb }
            r7.Q = r1     // Catch:{ Exception -> 0x00fb }
        L_0x00ec:
            r1 = r18
            r7.h = r1     // Catch:{ Exception -> 0x010d }
            r7.i = r12     // Catch:{ Exception -> 0x010d }
            long r5 = r3 - r15
            r1 = r19
            r2 = r0
            r1.a(r2, r3, r5)     // Catch:{ Exception -> 0x010d }
            return r13
        L_0x00fb:
            r0 = move-exception
            r1 = r18
            goto L_0x0104
        L_0x00ff:
            r0 = move-exception
            r1 = r6
            goto L_0x0104
        L_0x0102:
            r0 = move-exception
            r1 = r11
        L_0x0104:
            if (r1 == 0) goto L_0x010c
            r19.x()     // Catch:{ Exception -> 0x010d }
            r1.release()     // Catch:{ Exception -> 0x010d }
        L_0x010c:
            throw r0     // Catch:{ Exception -> 0x010d }
        L_0x010d:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to initialize decoder: "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            defpackage.bdu.a(r9, r1, r0)
            java.util.ArrayDeque<awo> r1 = r7.D
            r1.removeFirst()
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r1 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            aqv r2 = r7.v
            java.lang.String r3 = r12.a
            r1.<init>(r2, r0, r8, r3)
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r0 = r7.E
            if (r0 != 0) goto L_0x0134
            r7.E = r1
            goto L_0x013a
        L_0x0134:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r0 = com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.DecoderInitializationException.a(r0, r1)
            r7.E = r0
        L_0x013a:
            java.util.ArrayDeque<awo> r0 = r7.D
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0144
            goto L_0x006a
        L_0x0144:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r0 = r7.E
            throw r0
        L_0x0147:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r0 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            aqv r1 = r7.v
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            r0.<init>(r1, r11, r8, r2)
            goto L_0x0153
        L_0x0152:
            throw r0
        L_0x0153:
            goto L_0x0152
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.a(android.media.MediaCrypto, boolean):boolean");
    }

    private boolean b(long j2, long j3) {
        boolean z2;
        int i2;
        boolean z3;
        if (!y()) {
            if (!this.K || !this.aa) {
                i2 = this.h.dequeueOutputBuffer(this.u, 0);
            } else {
                try {
                    i2 = this.h.dequeueOutputBuffer(this.u, 0);
                } catch (IllegalStateException unused) {
                    E();
                    if (this.ac) {
                        v();
                    }
                    return false;
                }
            }
            if (i2 < 0) {
                if (i2 == -2) {
                    MediaFormat outputFormat = this.h.getOutputFormat();
                    if (this.F != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                        this.N = true;
                    } else {
                        if (this.L) {
                            outputFormat.setInteger("channel-count", 1);
                        }
                        a(this.h, outputFormat);
                    }
                    return true;
                } else if (i2 == -3) {
                    if (ben.a < 21) {
                        this.Q = this.h.getOutputBuffers();
                    }
                    return true;
                } else {
                    if (this.O && (this.ab || this.Y == 2)) {
                        E();
                    }
                    return false;
                }
            } else if (this.N) {
                this.N = false;
                this.h.releaseOutputBuffer(i2, false);
                return true;
            } else if (this.u.size != 0 || (this.u.flags & 4) == 0) {
                this.T = i2;
                this.U = ben.a >= 21 ? this.h.getOutputBuffer(i2) : this.Q[i2];
                ByteBuffer byteBuffer = this.U;
                if (byteBuffer != null) {
                    byteBuffer.position(this.u.offset);
                    this.U.limit(this.u.offset + this.u.size);
                }
                long j4 = this.u.presentationTimeUs;
                int size = this.t.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size) {
                        z3 = false;
                        break;
                    } else if (((Long) this.t.get(i3)).longValue() == j4) {
                        this.t.remove(i3);
                        z3 = true;
                        break;
                    } else {
                        i3++;
                    }
                }
                this.V = z3;
                d(this.u.presentationTimeUs);
            } else {
                E();
                return false;
            }
        }
        if (!this.K || !this.aa) {
            z2 = a(j2, j3, this.h, this.U, this.T, this.u.flags, this.u.presentationTimeUs, this.V, this.x);
        } else {
            try {
                z2 = a(j2, j3, this.h, this.U, this.T, this.u.flags, this.u.presentationTimeUs, this.V, this.x);
            } catch (IllegalStateException unused2) {
                E();
                if (this.ac) {
                    v();
                }
                return false;
            }
        }
        if (z2) {
            c(this.u.presentationTimeUs);
            boolean z4 = (this.u.flags & 4) != 0;
            A();
            if (!z4) {
                return true;
            }
            E();
        }
        return false;
    }

    private void x() {
        if (ben.a < 21) {
            this.P = null;
            this.Q = null;
        }
    }

    private boolean y() {
        return this.T >= 0;
    }

    private void z() {
        this.S = -1;
        this.p.c = null;
    }

    /* access modifiers changed from: protected */
    public float a(float f, aqv[] aqvArr) {
        return -1.0f;
    }

    public final int a(aqv aqv) {
        try {
            return a(this.l, this.m, aqv);
        } catch (DecoderQueryException e) {
            throw ExoPlaybackException.a(e, this.b);
        }
    }

    /* access modifiers changed from: protected */
    public int a(awo awo, aqv aqv, aqv aqv2) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public abstract int a(awp awp, asu<asy> asu, aqv aqv);

    /* access modifiers changed from: protected */
    public List<awo> a(awp awp, aqv aqv, boolean z2) {
        return awp.a(aqv.f, z2);
    }

    public final void a(float f) {
        this.A = f;
        C();
    }

    public void a(long j2, long j3) {
        if (this.ac) {
            s();
            return;
        }
        if (this.v == null) {
            this.q.a();
            int a = a(this.r, this.q, true);
            if (a == -5) {
                b(this.r.a);
            } else {
                if (a == -4) {
                    bdl.b(this.q.c());
                    this.ab = true;
                    E();
                }
                return;
            }
        }
        t();
        if (this.h != null) {
            bel.a("drainAndFeed");
            do {
            } while (b(j2, j3));
            do {
            } while (B());
            bel.a();
            return;
        }
        this.j.d += b(j2);
        this.q.a();
        int a2 = a(this.r, this.q, false);
        if (a2 == -5) {
            b(this.r.a);
            return;
        }
        if (a2 == -4) {
            bdl.b(this.q.c());
            this.ab = true;
            E();
        }
    }

    public void a(long j2, boolean z2) {
        this.ab = false;
        this.ac = false;
        if (this.h != null) {
            w();
        }
        this.s.a();
    }

    /* access modifiers changed from: protected */
    public void a(MediaCodec mediaCodec, MediaFormat mediaFormat) {
    }

    /* access modifiers changed from: protected */
    public void a(asm asm) {
    }

    /* access modifiers changed from: protected */
    public abstract void a(awo awo, MediaCodec mediaCodec, aqv aqv, MediaCrypto mediaCrypto, float f);

    /* access modifiers changed from: protected */
    public void a(String str, long j2, long j3) {
    }

    public void a(boolean z2) {
        this.j = new asl();
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(long j2, long j3, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i2, int i3, long j4, boolean z2, aqv aqv);

    /* access modifiers changed from: protected */
    public boolean a(awo awo) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(defpackage.aqv r5) {
        /*
            r4 = this;
            aqv r0 = r4.v
            r4.v = r5
            r4.w = r5
            aqv r5 = r4.v
            ast r5 = r5.i
            r1 = 0
            if (r0 != 0) goto L_0x000f
            r2 = r1
            goto L_0x0011
        L_0x000f:
            ast r2 = r0.i
        L_0x0011:
            boolean r5 = defpackage.ben.a(r5, r2)
            r2 = 1
            r5 = r5 ^ r2
            if (r5 == 0) goto L_0x004d
            aqv r5 = r4.v
            ast r5 = r5.i
            if (r5 == 0) goto L_0x004b
            asu<asy> r5 = r4.m
            if (r5 == 0) goto L_0x003d
            android.os.Looper r1 = android.os.Looper.myLooper()
            aqv r3 = r4.v
            ast r3 = r3.i
            com.google.android.exoplayer2.drm.DrmSession r5 = r5.a(r1, r3)
            r4.z = r5
            com.google.android.exoplayer2.drm.DrmSession<asy> r5 = r4.z
            com.google.android.exoplayer2.drm.DrmSession<asy> r1 = r4.y
            if (r5 != r1) goto L_0x004d
            asu<asy> r1 = r4.m
            r1.a(r5)
            goto L_0x004d
        L_0x003d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r5.<init>(r0)
            int r0 = r4.b
            com.google.android.exoplayer2.ExoPlaybackException r5 = com.google.android.exoplayer2.ExoPlaybackException.a(r5, r0)
            throw r5
        L_0x004b:
            r4.z = r1
        L_0x004d:
            com.google.android.exoplayer2.drm.DrmSession<asy> r5 = r4.z
            com.google.android.exoplayer2.drm.DrmSession<asy> r1 = r4.y
            r3 = 0
            if (r5 != r1) goto L_0x0090
            android.media.MediaCodec r5 = r4.h
            if (r5 == 0) goto L_0x0090
            awo r5 = r4.i
            aqv r1 = r4.v
            int r5 = r4.a(r5, r0, r1)
            if (r5 == 0) goto L_0x0090
            if (r5 == r2) goto L_0x0091
            r1 = 3
            if (r5 != r1) goto L_0x008a
            boolean r5 = r4.G
            if (r5 != 0) goto L_0x0090
            r4.W = r2
            r4.X = r2
            int r5 = r4.F
            r1 = 2
            if (r5 == r1) goto L_0x0086
            if (r5 != r2) goto L_0x0087
            aqv r5 = r4.v
            int r5 = r5.k
            int r1 = r0.k
            if (r5 != r1) goto L_0x0087
            aqv r5 = r4.v
            int r5 = r5.l
            int r0 = r0.l
            if (r5 != r0) goto L_0x0087
        L_0x0086:
            r3 = 1
        L_0x0087:
            r4.M = r3
            goto L_0x0091
        L_0x008a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
        L_0x0090:
            r2 = 0
        L_0x0091:
            if (r2 != 0) goto L_0x0097
            r4.D()
            return
        L_0x0097:
            r4.C()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.b(aqv):void");
    }

    /* access modifiers changed from: protected */
    public void c(long j2) {
    }

    /* access modifiers changed from: protected */
    public final aqv d(long j2) {
        aqv aqv = (aqv) this.s.a(j2);
        if (aqv != null) {
            this.x = aqv;
        }
        return aqv;
    }

    public final int m() {
        return 8;
    }

    public void n() {
    }

    public void o() {
    }

    public void p() {
        this.v = null;
        this.D = null;
        try {
            v();
            try {
                if (this.y != null) {
                    this.m.a(this.y);
                }
                try {
                    if (!(this.z == null || this.z == this.y)) {
                        this.m.a(this.z);
                    }
                } finally {
                    this.y = null;
                    this.z = null;
                }
            } catch (Throwable th) {
                if (!(this.z == null || this.z == this.y)) {
                    this.m.a(this.z);
                }
                throw th;
            } finally {
                this.y = null;
                this.z = null;
            }
        } catch (Throwable th2) {
            try {
                if (!(this.z == null || this.z == this.y)) {
                    this.m.a(this.z);
                }
                throw th2;
            } finally {
                this.y = null;
                this.z = null;
            }
        } finally {
            this.y = null;
            this.z = null;
        }
    }

    public boolean q() {
        if (this.v != null && !this.ad) {
            if ((this.f ? this.g : this.d.a()) || y() || (this.R != -9223372036854775807L && SystemClock.elapsedRealtime() < this.R)) {
                return true;
            }
        }
        return false;
    }

    public boolean r() {
        return this.ac;
    }

    /* access modifiers changed from: protected */
    public void s() {
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0199, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r0) != false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x01f6, code lost:
        if (r0.e != false) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        if ("AFTB".equals(defpackage.ben.d) != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f6, code lost:
        if ("tilapia".equals(defpackage.ben.b) != false) goto L_0x00f8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x01ea  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t() {
        /*
            r11 = this;
            android.media.MediaCodec r0 = r11.h
            if (r0 != 0) goto L_0x0231
            aqv r0 = r11.v
            if (r0 != 0) goto L_0x000a
            goto L_0x0231
        L_0x000a:
            com.google.android.exoplayer2.drm.DrmSession<asy> r1 = r11.z
            r11.y = r1
            java.lang.String r0 = r0.f
            r1 = 0
            com.google.android.exoplayer2.drm.DrmSession<asy> r2 = r11.y
            java.lang.String r3 = "Amazon"
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0075
            asw r2 = r2.g()
            asy r2 = (defpackage.asy) r2
            if (r2 != 0) goto L_0x002c
            com.google.android.exoplayer2.drm.DrmSession<asy> r0 = r11.y
            com.google.android.exoplayer2.drm.DrmSession$DrmSessionException r0 = r0.f()
            if (r0 != 0) goto L_0x002a
            return
        L_0x002a:
            r0 = 0
            goto L_0x003b
        L_0x002c:
            android.media.MediaCrypto r1 = r2.a
            boolean r6 = r2.b
            if (r6 != 0) goto L_0x002a
            android.media.MediaCrypto r2 = r2.a
            boolean r0 = r2.requiresSecureDecoderComponent(r0)
            if (r0 == 0) goto L_0x002a
            r0 = 1
        L_0x003b:
            java.lang.String r2 = defpackage.ben.c
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0059
            java.lang.String r2 = defpackage.ben.d
            java.lang.String r6 = "AFTM"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L_0x0057
            java.lang.String r2 = defpackage.ben.d
            java.lang.String r6 = "AFTB"
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0059
        L_0x0057:
            r2 = 1
            goto L_0x005a
        L_0x0059:
            r2 = 0
        L_0x005a:
            if (r2 == 0) goto L_0x0076
            com.google.android.exoplayer2.drm.DrmSession<asy> r2 = r11.y
            int r2 = r2.e()
            if (r2 == r5) goto L_0x0068
            r6 = 4
            if (r2 == r6) goto L_0x0076
            return
        L_0x0068:
            com.google.android.exoplayer2.drm.DrmSession<asy> r0 = r11.y
            com.google.android.exoplayer2.drm.DrmSession$DrmSessionException r0 = r0.f()
            int r1 = r11.b
            com.google.android.exoplayer2.ExoPlaybackException r0 = com.google.android.exoplayer2.ExoPlaybackException.a(r0, r1)
            throw r0
        L_0x0075:
            r0 = 0
        L_0x0076:
            boolean r0 = r11.a(r1, r0)     // Catch:{ DecoderInitializationException -> 0x0229 }
            if (r0 != 0) goto L_0x007d
            return
        L_0x007d:
            awo r0 = r11.i
            java.lang.String r0 = r0.a
            int r1 = defpackage.ben.a
            r2 = 25
            r6 = 2
            java.lang.String r7 = "OMX.Exynos.avc.dec.secure"
            if (r1 > r2) goto L_0x00ba
            boolean r1 = r7.equals(r0)
            if (r1 == 0) goto L_0x00ba
            java.lang.String r1 = defpackage.ben.d
            java.lang.String r2 = "SM-T585"
            boolean r1 = r1.startsWith(r2)
            if (r1 != 0) goto L_0x00b8
            java.lang.String r1 = defpackage.ben.d
            java.lang.String r2 = "SM-A510"
            boolean r1 = r1.startsWith(r2)
            if (r1 != 0) goto L_0x00b8
            java.lang.String r1 = defpackage.ben.d
            java.lang.String r2 = "SM-A520"
            boolean r1 = r1.startsWith(r2)
            if (r1 != 0) goto L_0x00b8
            java.lang.String r1 = defpackage.ben.d
            java.lang.String r2 = "SM-J700"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L_0x00ba
        L_0x00b8:
            r1 = 2
            goto L_0x00fb
        L_0x00ba:
            int r1 = defpackage.ben.a
            r2 = 24
            if (r1 >= r2) goto L_0x00fa
            java.lang.String r1 = "OMX.Nvidia.h264.decode"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x00d0
            java.lang.String r1 = "OMX.Nvidia.h264.decode.secure"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x00fa
        L_0x00d0:
            java.lang.String r1 = defpackage.ben.b
            java.lang.String r2 = "flounder"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x00f8
            java.lang.String r1 = defpackage.ben.b
            java.lang.String r2 = "flounder_lte"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x00f8
            java.lang.String r1 = defpackage.ben.b
            java.lang.String r2 = "grouper"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x00f8
            java.lang.String r1 = defpackage.ben.b
            java.lang.String r2 = "tilapia"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x00fa
        L_0x00f8:
            r1 = 1
            goto L_0x00fb
        L_0x00fa:
            r1 = 0
        L_0x00fb:
            r11.F = r1
            java.lang.String r1 = defpackage.ben.d
            java.lang.String r2 = "SM-T230"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L_0x0111
            java.lang.String r1 = "OMX.MARVELL.VIDEO.HW.CODA7542DECODER"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0111
            r1 = 1
            goto L_0x0112
        L_0x0111:
            r1 = 0
        L_0x0112:
            r11.G = r1
            aqv r1 = r11.v
            int r2 = defpackage.ben.a
            r8 = 21
            if (r2 >= r8) goto L_0x012e
            java.util.List<byte[]> r1 = r1.h
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x012e
            java.lang.String r1 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x012e
            r1 = 1
            goto L_0x012f
        L_0x012e:
            r1 = 0
        L_0x012f:
            r11.H = r1
            int r1 = defpackage.ben.a
            r2 = 19
            r9 = 18
            if (r1 < r9) goto L_0x016c
            int r1 = defpackage.ben.a
            if (r1 != r9) goto L_0x014d
            java.lang.String r1 = "OMX.SEC.avc.dec"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x016c
            java.lang.String r1 = "OMX.SEC.avc.dec.secure"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x016c
        L_0x014d:
            int r1 = defpackage.ben.a
            if (r1 != r2) goto L_0x016a
            java.lang.String r1 = defpackage.ben.d
            java.lang.String r10 = "SM-G800"
            boolean r1 = r1.startsWith(r10)
            if (r1 == 0) goto L_0x016a
            java.lang.String r1 = "OMX.Exynos.avc.dec"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x016c
            boolean r1 = r7.equals(r0)
            if (r1 == 0) goto L_0x016a
            goto L_0x016c
        L_0x016a:
            r1 = 0
            goto L_0x016d
        L_0x016c:
            r1 = 1
        L_0x016d:
            r11.I = r1
            int r1 = defpackage.ben.a
            r7 = 23
            if (r1 > r7) goto L_0x017d
            java.lang.String r1 = "OMX.google.vorbis.decoder"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x019b
        L_0x017d:
            int r1 = defpackage.ben.a
            if (r1 > r2) goto L_0x019d
            java.lang.String r1 = defpackage.ben.b
            java.lang.String r2 = "hb2000"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x019d
            java.lang.String r1 = "OMX.amlogic.avc.decoder.awesome"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L_0x019b
            java.lang.String r1 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x019d
        L_0x019b:
            r1 = 1
            goto L_0x019e
        L_0x019d:
            r1 = 0
        L_0x019e:
            r11.J = r1
            int r1 = defpackage.ben.a
            if (r1 != r8) goto L_0x01ae
            java.lang.String r1 = "OMX.google.aac.decoder"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x01ae
            r1 = 1
            goto L_0x01af
        L_0x01ae:
            r1 = 0
        L_0x01af:
            r11.K = r1
            aqv r1 = r11.v
            int r2 = defpackage.ben.a
            if (r2 > r9) goto L_0x01c5
            int r1 = r1.q
            if (r1 != r5) goto L_0x01c5
            java.lang.String r1 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x01c5
            r0 = 1
            goto L_0x01c6
        L_0x01c5:
            r0 = 0
        L_0x01c6:
            r11.L = r0
            awo r0 = r11.i
            java.lang.String r1 = r0.a
            int r2 = defpackage.ben.a
            r7 = 17
            if (r2 > r7) goto L_0x01e2
            java.lang.String r2 = "OMX.rk.video_decoder.avc"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x01f8
            java.lang.String r2 = "OMX.allwinner.video.decoder.avc"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x01f8
        L_0x01e2:
            java.lang.String r1 = defpackage.ben.c
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x01fa
            java.lang.String r1 = defpackage.ben.d
            java.lang.String r2 = "AFTS"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01fa
            boolean r0 = r0.e
            if (r0 == 0) goto L_0x01fa
        L_0x01f8:
            r0 = 1
            goto L_0x01fb
        L_0x01fa:
            r0 = 0
        L_0x01fb:
            if (r0 != 0) goto L_0x0203
            boolean r0 = r11.u()
            if (r0 == 0) goto L_0x0204
        L_0x0203:
            r4 = 1
        L_0x0204:
            r11.O = r4
            int r0 = r11.c
            if (r0 != r6) goto L_0x0212
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 + r2
            goto L_0x0217
        L_0x0212:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0217:
            r11.R = r0
            r11.z()
            r11.A()
            r11.ae = r5
            asl r0 = r11.j
            int r1 = r0.a
            int r1 = r1 + r5
            r0.a = r1
            return
        L_0x0229:
            r0 = move-exception
            int r1 = r11.b
            com.google.android.exoplayer2.ExoPlaybackException r0 = com.google.android.exoplayer2.ExoPlaybackException.a(r0, r1)
            throw r0
        L_0x0231:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.MediaCodecRenderer.t():void");
    }

    /* access modifiers changed from: protected */
    public boolean u() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void v() {
        this.R = -9223372036854775807L;
        z();
        A();
        this.ad = false;
        this.V = false;
        this.t.clear();
        x();
        this.i = null;
        this.W = false;
        this.Z = false;
        this.H = false;
        this.I = false;
        this.F = 0;
        this.G = false;
        this.J = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.aa = false;
        this.X = 0;
        this.Y = 0;
        this.C = false;
        if (this.h != null) {
            this.j.b++;
            try {
                this.h.stop();
                try {
                    this.h.release();
                    this.h = null;
                    DrmSession<asy> drmSession = this.y;
                    if (!(drmSession == null || this.z == drmSession)) {
                        try {
                            this.m.a(drmSession);
                        } finally {
                            this.y = null;
                        }
                    }
                } catch (Throwable th) {
                    this.h = null;
                    DrmSession<asy> drmSession2 = this.y;
                    if (!(drmSession2 == null || this.z == drmSession2)) {
                        this.m.a(drmSession2);
                    }
                    throw th;
                } finally {
                    this.y = null;
                }
            } catch (Throwable th2) {
                this.h = null;
                DrmSession<asy> drmSession3 = this.y;
                if (!(drmSession3 == null || this.z == drmSession3)) {
                    try {
                        this.m.a(drmSession3);
                    } finally {
                        this.y = null;
                    }
                }
                throw th2;
            } finally {
                this.y = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void w() {
        this.R = -9223372036854775807L;
        z();
        A();
        this.ae = true;
        this.ad = false;
        this.V = false;
        this.t.clear();
        this.M = false;
        this.N = false;
        if (this.I || (this.J && this.aa)) {
            v();
            t();
        } else if (this.Y != 0) {
            v();
            t();
        } else {
            this.h.flush();
            this.Z = false;
        }
        if (this.W && this.v != null) {
            this.X = 1;
        }
    }
}
