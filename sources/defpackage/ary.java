package defpackage;

import android.media.AudioAttributes;
import android.media.AudioAttributes.Builder;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.AudioSink.InitializationException;
import com.google.android.exoplayer2.audio.AudioSink.WriteException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: ary reason: default package */
public final class ary implements AudioSink {
    public static boolean a;
    private static boolean b;
    private arc A;
    private long B;
    private long C;
    private ByteBuffer D;
    private int E;
    private int F;
    private long G;
    private long H;
    private int I;
    private long J;
    private long K;
    private int L;
    private int M;
    private long N;
    private float O;
    private AudioProcessor[] P;
    private ByteBuffer[] Q;
    private ByteBuffer R;
    private ByteBuffer S;
    private byte[] T;
    private int U;
    private int V;
    private boolean W;
    private boolean X;
    private int Y;
    private arw Z;
    private boolean aa;
    /* access modifiers changed from: private */
    public long ab;
    private final arq c;
    private final a d;
    private final boolean e;
    private final arx f;
    private final asg g;
    private final AudioProcessor[] h;
    private final AudioProcessor[] i;
    /* access modifiers changed from: private */
    public final ConditionVariable j;
    private final arv k;
    private final ArrayDeque<c> l;
    /* access modifiers changed from: private */
    public com.google.android.exoplayer2.audio.AudioSink.a m;
    private AudioTrack n;
    private AudioTrack o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private arp v;
    private boolean w;
    private boolean x;
    private int y;
    private arc z;

    /* renamed from: ary$a */
    public interface a {
        long a(long j);

        arc a(arc arc);

        AudioProcessor[] a();

        long b();
    }

    /* renamed from: ary$b */
    public static class b implements a {
        private final AudioProcessor[] a;
        private final asd b = new asd();
        private final asf c = new asf();

        public b(AudioProcessor... audioProcessorArr) {
            this.a = (AudioProcessor[]) Arrays.copyOf(audioProcessorArr, audioProcessorArr.length + 2);
            AudioProcessor[] audioProcessorArr2 = this.a;
            audioProcessorArr2[audioProcessorArr.length] = this.b;
            audioProcessorArr2[audioProcessorArr.length + 1] = this.c;
        }

        public final long a(long j) {
            long j2;
            asf asf = this.c;
            if (asf.h < 1024) {
                double d = (double) asf.c;
                double d2 = (double) j;
                Double.isNaN(d);
                Double.isNaN(d2);
                j2 = (long) (d * d2);
            } else if (asf.e == asf.b) {
                j2 = ben.b(j, asf.g, asf.h);
            } else {
                return ben.b(j, asf.g * ((long) asf.e), asf.h * ((long) asf.b));
            }
            return j2;
        }

        public final arc a(arc arc) {
            asd asd = this.b;
            asd.b = arc.d;
            asd.h();
            asf asf = this.c;
            float a2 = ben.a(arc.b, 0.1f, 8.0f);
            if (asf.c != a2) {
                asf.c = a2;
                asf.f = null;
            }
            asf.h();
            asf asf2 = this.c;
            float a3 = ben.a(arc.c, 0.1f, 8.0f);
            if (asf2.d != a3) {
                asf2.d = a3;
                asf2.f = null;
            }
            asf2.h();
            return new arc(a2, a3, arc.d);
        }

        public final AudioProcessor[] a() {
            return this.a;
        }

        public final long b() {
            return this.b.c;
        }
    }

    /* renamed from: ary$c */
    static final class c {
        final arc a;
        final long b;
        final long c;

        private c(arc arc, long j, long j2) {
            this.a = arc;
            this.b = j;
            this.c = j2;
        }

        /* synthetic */ c(arc arc, long j, long j2, byte b2) {
            this(arc, j, j2);
        }
    }

    /* renamed from: ary$d */
    final class d implements defpackage.arv.a {
        private d() {
        }

        /* synthetic */ d(ary ary, byte b) {
            this();
        }

        public final void a(int i, long j) {
            if (ary.this.m != null) {
                ary.this.m.a(i, j, SystemClock.elapsedRealtime() - ary.this.ab);
            }
        }

        public final void a(long j) {
            StringBuilder sb = new StringBuilder("Ignoring impossibly large audio latency: ");
            sb.append(j);
            bdu.c("AudioTrack", sb.toString());
        }

        public final void a(long j, long j2, long j3, long j4) {
            StringBuilder sb = new StringBuilder("Spurious audio timestamp (frame position mismatch): ");
            sb.append(j);
            String str = ", ";
            sb.append(str);
            sb.append(j2);
            sb.append(str);
            sb.append(j3);
            sb.append(str);
            sb.append(j4);
            sb.append(str);
            sb.append(ary.this.p());
            sb.append(str);
            sb.append(ary.this.q());
            String sb2 = sb.toString();
            boolean z = ary.a;
            bdu.c("AudioTrack", sb2);
        }

        public final void b(long j, long j2, long j3, long j4) {
            StringBuilder sb = new StringBuilder("Spurious audio timestamp (system clock mismatch): ");
            sb.append(j);
            String str = ", ";
            sb.append(str);
            sb.append(j2);
            sb.append(str);
            sb.append(j3);
            sb.append(str);
            sb.append(j4);
            sb.append(str);
            sb.append(ary.this.p());
            sb.append(str);
            sb.append(ary.this.q());
            String sb2 = sb.toString();
            boolean z = ary.a;
            bdu.c("AudioTrack", sb2);
        }
    }

    private ary(arq arq, a aVar, boolean z2) {
        this.c = arq;
        this.d = (a) bdl.a(aVar);
        this.e = z2;
        this.j = new ConditionVariable(true);
        this.k = new arv(new d(this, 0));
        this.f = new arx();
        this.g = new asg();
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new AudioProcessor[]{new asc(), this.f, this.g});
        Collections.addAll(arrayList, aVar.a());
        this.h = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[arrayList.size()]);
        this.i = new AudioProcessor[]{new asa()};
        this.O = 1.0f;
        this.M = 0;
        this.v = arp.a;
        this.Y = 0;
        this.Z = new arw(0, 0.0f);
        this.A = arc.a;
        this.V = -1;
        this.P = new AudioProcessor[0];
        this.Q = new ByteBuffer[0];
        this.l = new ArrayDeque<>();
    }

    public ary(arq arq, AudioProcessor[] audioProcessorArr) {
        this(arq, audioProcessorArr, false);
    }

    private ary(arq arq, AudioProcessor[] audioProcessorArr, boolean z2) {
        this(arq, (a) new b(audioProcessorArr), false);
    }

    private int a(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2, long j2) {
        if (this.D == null) {
            this.D = ByteBuffer.allocate(16);
            this.D.order(ByteOrder.BIG_ENDIAN);
            this.D.putInt(1431633921);
        }
        if (this.E == 0) {
            this.D.putInt(4, i2);
            this.D.putLong(8, j2 * 1000);
            this.D.position(0);
            this.E = i2;
        }
        int remaining = this.D.remaining();
        if (remaining > 0) {
            int write = audioTrack.write(this.D, remaining, 1);
            if (write < 0) {
                this.E = 0;
                return write;
            } else if (write < remaining) {
                return 0;
            }
        }
        int write2 = audioTrack.write(byteBuffer, i2, 1);
        if (write2 < 0) {
            this.E = 0;
            return write2;
        }
        this.E -= write2;
        return write2;
    }

    private void a(long j2) {
        ByteBuffer byteBuffer;
        int length = this.P.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.Q[i2 - 1];
            } else {
                byteBuffer = this.R;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.a;
                }
            }
            if (i2 == length) {
                b(byteBuffer, j2);
            } else {
                AudioProcessor audioProcessor = this.P[i2];
                audioProcessor.a(byteBuffer);
                ByteBuffer f2 = audioProcessor.f();
                this.Q[i2] = f2;
                if (f2.hasRemaining()) {
                    i2++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i2--;
            } else {
                return;
            }
        }
    }

    private long b(long j2) {
        return (j2 * 1000000) / ((long) this.s);
    }

    private void b(ByteBuffer byteBuffer, long j2) {
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.S;
            boolean z2 = true;
            int i2 = 0;
            if (byteBuffer2 != null) {
                bdl.a(byteBuffer2 == byteBuffer);
            } else {
                this.S = byteBuffer;
                if (ben.a < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.T;
                    if (bArr == null || bArr.length < remaining) {
                        this.T = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.T, 0, remaining);
                    byteBuffer.position(position);
                    this.U = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (ben.a < 21) {
                int a2 = this.k.a(this.J);
                if (a2 > 0) {
                    i2 = this.o.write(this.T, this.U, Math.min(remaining2, a2));
                    if (i2 > 0) {
                        this.U += i2;
                        byteBuffer.position(byteBuffer.position() + i2);
                    }
                }
            } else if (this.aa) {
                if (j2 == -9223372036854775807L) {
                    z2 = false;
                }
                bdl.b(z2);
                i2 = a(this.o, byteBuffer, remaining2, j2);
            } else {
                i2 = this.o.write(byteBuffer, remaining2, 1);
            }
            this.ab = SystemClock.elapsedRealtime();
            if (i2 >= 0) {
                if (this.p) {
                    this.J += (long) i2;
                }
                if (i2 == remaining2) {
                    if (!this.p) {
                        this.K += (long) this.L;
                    }
                    this.S = null;
                }
                return;
            }
            throw new WriteException(i2);
        }
    }

    private long c(long j2) {
        return (j2 * ((long) this.s)) / 1000000;
    }

    private void k() {
        AudioProcessor[] s2;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : s()) {
            if (audioProcessor.a()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.h();
            }
        }
        int size = arrayList.size();
        this.P = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.Q = new ByteBuffer[size];
        l();
    }

    private void l() {
        int i2 = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.P;
            if (i2 < audioProcessorArr.length) {
                AudioProcessor audioProcessor = audioProcessorArr[i2];
                audioProcessor.h();
                this.Q[i2] = audioProcessor.f();
                i2++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m() {
        /*
            r9 = this;
            int r0 = r9.V
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x0014
            boolean r0 = r9.w
            if (r0 == 0) goto L_0x000d
            r0 = 0
            goto L_0x0010
        L_0x000d:
            com.google.android.exoplayer2.audio.AudioProcessor[] r0 = r9.P
            int r0 = r0.length
        L_0x0010:
            r9.V = r0
        L_0x0012:
            r0 = 1
            goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            int r4 = r9.V
            com.google.android.exoplayer2.audio.AudioProcessor[] r5 = r9.P
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x0038
            r4 = r5[r4]
            if (r0 == 0) goto L_0x0028
            r4.e()
        L_0x0028:
            r9.a(r7)
            boolean r0 = r4.g()
            if (r0 != 0) goto L_0x0032
            return r3
        L_0x0032:
            int r0 = r9.V
            int r0 = r0 + r2
            r9.V = r0
            goto L_0x0012
        L_0x0038:
            java.nio.ByteBuffer r0 = r9.S
            if (r0 == 0) goto L_0x0044
            r9.b(r0, r7)
            java.nio.ByteBuffer r0 = r9.S
            if (r0 == 0) goto L_0x0044
            return r3
        L_0x0044:
            r9.V = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ary.m():boolean");
    }

    private void n() {
        if (o()) {
            if (ben.a >= 21) {
                this.o.setVolume(this.O);
                return;
            }
            AudioTrack audioTrack = this.o;
            float f2 = this.O;
            audioTrack.setStereoVolume(f2, f2);
        }
    }

    private boolean o() {
        return this.o != null;
    }

    /* access modifiers changed from: private */
    public long p() {
        return this.p ? this.G / ((long) this.F) : this.H;
    }

    /* access modifiers changed from: private */
    public long q() {
        return this.p ? this.J / ((long) this.I) : this.K;
    }

    private AudioTrack r() {
        AudioTrack audioTrack;
        if (ben.a >= 21) {
            AudioAttributes build = this.aa ? new Builder().setContentType(3).setFlags(16).setUsage(1).build() : this.v.a();
            AudioFormat build2 = new AudioFormat.Builder().setChannelMask(this.t).setEncoding(this.u).setSampleRate(this.s).build();
            int i2 = this.Y;
            audioTrack = new AudioTrack(build, build2, this.y, 1, i2 != 0 ? i2 : 0);
        } else {
            int f2 = ben.f(this.v.c);
            int i3 = this.Y;
            audioTrack = i3 == 0 ? new AudioTrack(f2, this.s, this.t, this.u, this.y, 1) : new AudioTrack(f2, this.s, this.t, this.u, this.y, 1, i3);
        }
        int state = audioTrack.getState();
        if (state == 1) {
            return audioTrack;
        }
        try {
            audioTrack.release();
        } catch (Exception unused) {
        }
        throw new InitializationException(state, this.s, this.t, this.y);
    }

    private AudioProcessor[] s() {
        return this.q ? this.i : this.h;
    }

    public final long a(boolean z2) {
        long j2;
        long j3;
        long j4;
        if (!o() || this.M == 0) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.k.a(z2), b(q()));
        long j5 = this.N;
        c cVar = null;
        while (!this.l.isEmpty() && min >= ((c) this.l.getFirst()).c) {
            cVar = (c) this.l.remove();
        }
        if (cVar != null) {
            this.A = cVar.a;
            this.C = cVar.c;
            this.B = cVar.b - this.N;
        }
        if (this.A.b == 1.0f) {
            j2 = (min + this.B) - this.C;
        } else {
            if (this.l.isEmpty()) {
                j3 = this.B;
                j4 = this.d.a(min - this.C);
            } else {
                j3 = this.B;
                j4 = ben.a(min - this.C, this.A.b);
            }
            j2 = j4 + j3;
        }
        return j5 + j2 + b(this.d.b());
    }

    public final arc a(arc arc) {
        if (!o() || this.x) {
            arc arc2 = this.z;
            if (arc2 == null) {
                arc2 = !this.l.isEmpty() ? ((c) this.l.getLast()).a : this.A;
            }
            if (!arc.equals(arc2)) {
                if (o()) {
                    this.z = arc;
                } else {
                    this.A = this.d.a(arc);
                }
            }
            return this.A;
        }
        this.A = arc.a;
        return this.A;
    }

    public final void a() {
        this.X = true;
        if (o()) {
            ((aru) bdl.a(this.k.e)).a();
            this.o.play();
        }
    }

    public final void a(float f2) {
        if (this.O != f2) {
            this.O = f2;
            n();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00cc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r9, int r10, int r11, int r12, int[] r13, int r14, int r15) {
        /*
            r8 = this;
            r8.r = r11
            boolean r12 = defpackage.ben.c(r9)
            r8.p = r12
            boolean r12 = r8.e
            r0 = 1
            r1 = 0
            if (r12 == 0) goto L_0x001e
            r12 = 1073741824(0x40000000, float:2.0)
            boolean r12 = r8.a(r12)
            if (r12 == 0) goto L_0x001e
            boolean r12 = defpackage.ben.d(r9)
            if (r12 == 0) goto L_0x001e
            r12 = 1
            goto L_0x001f
        L_0x001e:
            r12 = 0
        L_0x001f:
            r8.q = r12
            boolean r12 = r8.p
            if (r12 == 0) goto L_0x002b
            int r12 = defpackage.ben.b(r9, r10)
            r8.F = r12
        L_0x002b:
            boolean r12 = r8.p
            r2 = 4
            if (r12 == 0) goto L_0x0034
            if (r9 == r2) goto L_0x0034
            r12 = 1
            goto L_0x0035
        L_0x0034:
            r12 = 0
        L_0x0035:
            if (r12 == 0) goto L_0x003d
            boolean r3 = r8.q
            if (r3 != 0) goto L_0x003d
            r3 = 1
            goto L_0x003e
        L_0x003d:
            r3 = 0
        L_0x003e:
            r8.x = r3
            int r3 = defpackage.ben.a
            r4 = 21
            r5 = 8
            r6 = 6
            if (r3 >= r4) goto L_0x0057
            if (r10 != r5) goto L_0x0057
            if (r13 != 0) goto L_0x0057
            int[] r13 = new int[r6]
            r3 = 0
        L_0x0050:
            if (r3 >= r6) goto L_0x0057
            r13[r3] = r3
            int r3 = r3 + 1
            goto L_0x0050
        L_0x0057:
            if (r12 == 0) goto L_0x0095
            asg r3 = r8.g
            r3.b = r14
            r3.c = r15
            arx r14 = r8.f
            r14.b = r13
            com.google.android.exoplayer2.audio.AudioProcessor[] r13 = r8.s()
            int r14 = r13.length
            r3 = r9
            r15 = r11
            r9 = 0
            r11 = 0
        L_0x006c:
            if (r9 >= r14) goto L_0x0091
            r4 = r13[r9]
            boolean r7 = r4.a(r15, r10, r3)     // Catch:{ UnhandledFormatException -> 0x008a }
            r11 = r11 | r7
            boolean r7 = r4.a()
            if (r7 == 0) goto L_0x0087
            int r10 = r4.b()
            int r15 = r4.d()
            int r3 = r4.c()
        L_0x0087:
            int r9 = r9 + 1
            goto L_0x006c
        L_0x008a:
            r9 = move-exception
            com.google.android.exoplayer2.audio.AudioSink$ConfigurationException r10 = new com.google.android.exoplayer2.audio.AudioSink$ConfigurationException
            r10.<init>(r9)
            throw r10
        L_0x0091:
            r13 = r11
            r11 = r15
            r9 = r3
            goto L_0x0096
        L_0x0095:
            r13 = 0
        L_0x0096:
            boolean r14 = r8.p
            int r15 = defpackage.ben.a
            r3 = 28
            r4 = 5
            r7 = 7
            if (r15 > r3) goto L_0x00b0
            if (r14 != 0) goto L_0x00b0
            if (r10 != r7) goto L_0x00a7
            r15 = 8
            goto L_0x00b1
        L_0x00a7:
            r15 = 3
            if (r10 == r15) goto L_0x00ae
            if (r10 == r2) goto L_0x00ae
            if (r10 != r4) goto L_0x00b0
        L_0x00ae:
            r15 = 6
            goto L_0x00b1
        L_0x00b0:
            r15 = r10
        L_0x00b1:
            int r2 = defpackage.ben.a
            r3 = 26
            if (r2 > r3) goto L_0x00c6
            java.lang.String r2 = defpackage.ben.b
            java.lang.String r3 = "fugu"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00c6
            if (r14 != 0) goto L_0x00c6
            if (r15 != r0) goto L_0x00c6
            r15 = 2
        L_0x00c6:
            int r14 = defpackage.ben.e(r15)
            if (r14 == 0) goto L_0x0167
            if (r13 != 0) goto L_0x00e1
            boolean r13 = r8.o()
            if (r13 == 0) goto L_0x00e1
            int r13 = r8.u
            if (r13 != r9) goto L_0x00e1
            int r13 = r8.s
            if (r13 != r11) goto L_0x00e1
            int r13 = r8.t
            if (r13 != r14) goto L_0x00e1
            return
        L_0x00e1:
            r8.i()
            r8.w = r12
            r8.s = r11
            r8.t = r14
            r8.u = r9
            boolean r9 = r8.p
            if (r9 == 0) goto L_0x00f7
            int r9 = r8.u
            int r9 = defpackage.ben.b(r9, r10)
            goto L_0x00f8
        L_0x00f7:
            r9 = -1
        L_0x00f8:
            r8.I = r9
            boolean r9 = r8.p
            r10 = 250000(0x3d090, double:1.235164E-318)
            if (r9 == 0) goto L_0x0135
            int r9 = r8.s
            int r12 = r8.t
            int r13 = r8.u
            int r9 = android.media.AudioTrack.getMinBufferSize(r9, r12, r13)
            r12 = -2
            if (r9 == r12) goto L_0x010f
            goto L_0x0110
        L_0x010f:
            r0 = 0
        L_0x0110:
            defpackage.bdl.b(r0)
            int r12 = r9 << 2
            long r10 = r8.c(r10)
            int r11 = (int) r10
            int r10 = r8.I
            int r11 = r11 * r10
            long r9 = (long) r9
            r13 = 750000(0xb71b0, double:3.70549E-318)
            long r13 = r8.c(r13)
            int r15 = r8.I
            long r0 = (long) r15
            long r13 = r13 * r0
            long r9 = java.lang.Math.max(r9, r13)
            int r10 = (int) r9
            int r9 = defpackage.ben.a(r12, r11, r10)
            goto L_0x0164
        L_0x0135:
            int r9 = r8.u
            if (r9 == r4) goto L_0x0159
            if (r9 == r6) goto L_0x0155
            if (r9 == r7) goto L_0x0151
            if (r9 == r5) goto L_0x014d
            r12 = 14
            if (r9 != r12) goto L_0x0147
            r9 = 3062500(0x2ebae4, float:4.291477E-39)
            goto L_0x015c
        L_0x0147:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>()
            throw r9
        L_0x014d:
            r9 = 2250000(0x225510, float:3.152922E-39)
            goto L_0x015c
        L_0x0151:
            r9 = 192000(0x2ee00, float:2.6905E-40)
            goto L_0x015c
        L_0x0155:
            r9 = 768000(0xbb800, float:1.076197E-39)
            goto L_0x015c
        L_0x0159:
            r9 = 80000(0x13880, float:1.12104E-40)
        L_0x015c:
            long r12 = (long) r9
            long r12 = r12 * r10
            r9 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r12 / r9
            int r9 = (int) r12
        L_0x0164:
            r8.y = r9
            return
        L_0x0167:
            com.google.android.exoplayer2.audio.AudioSink$ConfigurationException r9 = new com.google.android.exoplayer2.audio.AudioSink$ConfigurationException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Unsupported channel count: "
            r11.<init>(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            goto L_0x017c
        L_0x017b:
            throw r9
        L_0x017c:
            goto L_0x017b
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ary.a(int, int, int, int, int[], int, int):void");
    }

    public final void a(arp arp) {
        if (!this.v.equals(arp)) {
            this.v = arp;
            if (!this.aa) {
                i();
                this.Y = 0;
            }
        }
    }

    public final void a(arw arw) {
        if (!this.Z.equals(arw)) {
            int i2 = arw.a;
            float f2 = arw.b;
            if (this.o != null) {
                if (this.Z.a != i2) {
                    this.o.attachAuxEffect(i2);
                }
                if (i2 != 0) {
                    this.o.setAuxEffectSendLevel(f2);
                }
            }
            this.Z = arw;
        }
    }

    public final void a(com.google.android.exoplayer2.audio.AudioSink.a aVar) {
        this.m = aVar;
    }

    public final boolean a(int i2) {
        if (ben.c(i2)) {
            return i2 != 4 || ben.a >= 21;
        }
        arq arq = this.c;
        if (arq != null) {
            if (Arrays.binarySearch(arq.a, i2) >= 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ef, code lost:
        if (r4.d() == 0) goto L_0x00e4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0117 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.nio.ByteBuffer r24, long r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            java.nio.ByteBuffer r4 = r0.R
            r5 = 0
            if (r4 == 0) goto L_0x0010
            if (r1 != r4) goto L_0x000e
            goto L_0x0010
        L_0x000e:
            r4 = 0
            goto L_0x0011
        L_0x0010:
            r4 = 1
        L_0x0011:
            defpackage.bdl.a(r4)
            boolean r4 = r23.o()
            r7 = 6
            r8 = 5
            r11 = 0
            if (r4 != 0) goto L_0x00c9
            android.os.ConditionVariable r4 = r0.j
            r4.block()
            android.media.AudioTrack r4 = r23.r()
            r0.o = r4
            android.media.AudioTrack r4 = r0.o
            int r4 = r4.getAudioSessionId()
            int r13 = r0.Y
            if (r13 == r4) goto L_0x003c
            r0.Y = r4
            com.google.android.exoplayer2.audio.AudioSink$a r13 = r0.m
            if (r13 == 0) goto L_0x003c
            r13.a(r4)
        L_0x003c:
            boolean r4 = r0.x
            if (r4 == 0) goto L_0x0049
            ary$a r4 = r0.d
            arc r13 = r0.A
            arc r4 = r4.a(r13)
            goto L_0x004b
        L_0x0049:
            arc r4 = defpackage.arc.a
        L_0x004b:
            r0.A = r4
            r23.k()
            arv r4 = r0.k
            android.media.AudioTrack r13 = r0.o
            int r14 = r0.u
            int r15 = r0.I
            int r6 = r0.y
            r4.b = r13
            r4.c = r15
            r4.d = r6
            aru r9 = new aru
            r9.<init>(r13)
            r4.e = r9
            int r9 = r13.getSampleRate()
            r4.f = r9
            int r9 = defpackage.ben.a
            r10 = 23
            if (r9 >= r10) goto L_0x0079
            if (r14 == r8) goto L_0x0077
            if (r14 != r7) goto L_0x0079
        L_0x0077:
            r9 = 1
            goto L_0x007a
        L_0x0079:
            r9 = 0
        L_0x007a:
            r4.g = r9
            boolean r9 = defpackage.ben.c(r14)
            r4.k = r9
            boolean r9 = r4.k
            if (r9 == 0) goto L_0x008d
            int r6 = r6 / r15
            long r9 = (long) r6
            long r9 = r4.c(r9)
            goto L_0x0092
        L_0x008d:
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0092:
            r4.h = r9
            r4.l = r11
            r4.m = r11
            r4.n = r11
            r4.j = r5
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.o = r9
            r4.p = r9
            r4.i = r11
            r23.n()
            arw r4 = r0.Z
            int r4 = r4.a
            if (r4 == 0) goto L_0x00c2
            android.media.AudioTrack r4 = r0.o
            arw r6 = r0.Z
            int r6 = r6.a
            r4.attachAuxEffect(r6)
            android.media.AudioTrack r4 = r0.o
            arw r6 = r0.Z
            float r6 = r6.b
            r4.setAuxEffectSendLevel(r6)
        L_0x00c2:
            boolean r4 = r0.X
            if (r4 == 0) goto L_0x00c9
            r23.a()
        L_0x00c9:
            arv r4 = r0.k
            long r9 = r23.q()
            android.media.AudioTrack r6 = r4.b
            java.lang.Object r6 = defpackage.bdl.a(r6)
            android.media.AudioTrack r6 = (android.media.AudioTrack) r6
            int r6 = r6.getPlayState()
            boolean r13 = r4.g
            r14 = 2
            if (r13 == 0) goto L_0x00f2
            if (r6 != r14) goto L_0x00e6
            r4.j = r5
        L_0x00e4:
            r4 = 0
            goto L_0x0115
        L_0x00e6:
            r13 = 1
            if (r6 != r13) goto L_0x00f2
            long r16 = r4.d()
            int r13 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x00f2
            goto L_0x00e4
        L_0x00f2:
            boolean r13 = r4.j
            boolean r9 = r4.b(r9)
            r4.j = r9
            if (r13 == 0) goto L_0x0114
            boolean r9 = r4.j
            if (r9 != 0) goto L_0x0114
            r9 = 1
            if (r6 == r9) goto L_0x0114
            arv$a r6 = r4.a
            if (r6 == 0) goto L_0x0114
            arv$a r6 = r4.a
            int r9 = r4.d
            long r14 = r4.h
            long r13 = defpackage.aqm.a(r14)
            r6.a(r9, r13)
        L_0x0114:
            r4 = 1
        L_0x0115:
            if (r4 != 0) goto L_0x0118
            return r5
        L_0x0118:
            java.nio.ByteBuffer r4 = r0.R
            java.lang.String r6 = "AudioTrack"
            r9 = 0
            if (r4 != 0) goto L_0x0237
            boolean r4 = r24.hasRemaining()
            if (r4 != 0) goto L_0x0127
            r4 = 1
            return r4
        L_0x0127:
            boolean r4 = r0.p
            if (r4 != 0) goto L_0x017b
            int r4 = r0.L
            if (r4 != 0) goto L_0x017b
            int r4 = r0.u
            r13 = 7
            if (r4 == r13) goto L_0x016f
            r13 = 8
            if (r4 != r13) goto L_0x0139
            goto L_0x016f
        L_0x0139:
            if (r4 != r8) goto L_0x0140
            int r4 = defpackage.aro.a()
            goto L_0x0173
        L_0x0140:
            if (r4 != r7) goto L_0x0147
            int r4 = defpackage.aro.a(r24)
            goto L_0x0173
        L_0x0147:
            r7 = 14
            if (r4 != r7) goto L_0x015b
            int r4 = defpackage.aro.b(r24)
            r7 = -1
            if (r4 != r7) goto L_0x0154
            r4 = 0
            goto L_0x0173
        L_0x0154:
            int r4 = defpackage.aro.a(r1, r4)
            int r4 = r4 << 4
            goto L_0x0173
        L_0x015b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unexpected audio encoding: "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x016f:
            int r4 = defpackage.arz.a(r24)
        L_0x0173:
            r0.L = r4
            int r4 = r0.L
            if (r4 != 0) goto L_0x017b
            r4 = 1
            return r4
        L_0x017b:
            arc r4 = r0.z
            if (r4 == 0) goto L_0x01ad
            boolean r4 = r23.m()
            if (r4 != 0) goto L_0x0186
            return r5
        L_0x0186:
            arc r4 = r0.z
            r0.z = r9
            ary$a r7 = r0.d
            arc r17 = r7.a(r4)
            java.util.ArrayDeque<ary$c> r4 = r0.l
            ary$c r7 = new ary$c
            long r18 = java.lang.Math.max(r11, r2)
            long r13 = r23.q()
            long r20 = r0.b(r13)
            r22 = 0
            r16 = r7
            r16.<init>(r17, r18, r20, r22)
            r4.add(r7)
            r23.k()
        L_0x01ad:
            int r4 = r0.M
            if (r4 != 0) goto L_0x01bb
            long r7 = java.lang.Math.max(r11, r2)
            r0.N = r7
            r4 = 1
            r0.M = r4
            goto L_0x021e
        L_0x01bb:
            long r7 = r0.N
            long r13 = r23.p()
            asg r4 = r0.g
            long r9 = r4.d
            long r13 = r13 - r9
            r9 = 1000000(0xf4240, double:4.940656E-318)
            long r13 = r13 * r9
            int r4 = r0.r
            long r9 = (long) r4
            long r13 = r13 / r9
            long r7 = r7 + r13
            int r4 = r0.M
            r9 = 1
            if (r4 != r9) goto L_0x0204
            long r9 = r7 - r2
            long r9 = java.lang.Math.abs(r9)
            r13 = 200000(0x30d40, double:9.8813E-319)
            int r4 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r4 <= 0) goto L_0x0204
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r9 = "Discontinuity detected [expected "
            r4.<init>(r9)
            r4.append(r7)
            java.lang.String r9 = ", got "
            r4.append(r9)
            r4.append(r2)
            java.lang.String r9 = "]"
            r4.append(r9)
            java.lang.String r4 = r4.toString()
            defpackage.bdu.d(r6, r4)
            r4 = 2
            r0.M = r4
            goto L_0x0205
        L_0x0204:
            r4 = 2
        L_0x0205:
            int r9 = r0.M
            if (r9 != r4) goto L_0x021e
            long r7 = r2 - r7
            long r9 = r0.N
            long r9 = r9 + r7
            r0.N = r9
            r4 = 1
            r0.M = r4
            com.google.android.exoplayer2.audio.AudioSink$a r4 = r0.m
            if (r4 == 0) goto L_0x021e
            int r9 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x021e
            r4.a()
        L_0x021e:
            boolean r4 = r0.p
            if (r4 == 0) goto L_0x022d
            long r7 = r0.G
            int r4 = r24.remaining()
            long r9 = (long) r4
            long r7 = r7 + r9
            r0.G = r7
            goto L_0x0235
        L_0x022d:
            long r7 = r0.H
            int r4 = r0.L
            long r9 = (long) r4
            long r7 = r7 + r9
            r0.H = r7
        L_0x0235:
            r0.R = r1
        L_0x0237:
            boolean r1 = r0.w
            if (r1 == 0) goto L_0x023f
            r0.a(r2)
            goto L_0x0244
        L_0x023f:
            java.nio.ByteBuffer r1 = r0.R
            r0.b(r1, r2)
        L_0x0244:
            java.nio.ByteBuffer r1 = r0.R
            boolean r1 = r1.hasRemaining()
            if (r1 != 0) goto L_0x0251
            r1 = 0
            r0.R = r1
        L_0x024f:
            r1 = 1
            return r1
        L_0x0251:
            arv r1 = r0.k
            long r2 = r23.q()
            long r7 = r1.p
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x0275
            int r4 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x0275
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r7 = r1.p
            long r2 = r2 - r7
            r7 = 200(0xc8, double:9.9E-322)
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r1 < 0) goto L_0x0275
            r1 = 1
            goto L_0x0276
        L_0x0275:
            r1 = 0
        L_0x0276:
            if (r1 == 0) goto L_0x0281
            java.lang.String r1 = "Resetting stalled audio track"
            defpackage.bdu.c(r6, r1)
            r23.i()
            goto L_0x024f
        L_0x0281:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ary.a(java.nio.ByteBuffer, long):boolean");
    }

    public final void b() {
        if (this.M == 1) {
            this.M = 2;
        }
    }

    public final void b(int i2) {
        bdl.b(ben.a >= 21);
        if (!this.aa || this.Y != i2) {
            this.aa = true;
            this.Y = i2;
            i();
        }
    }

    public final void c() {
        if (!this.W && o() && m()) {
            arv arv = this.k;
            long q2 = q();
            arv.q = arv.d();
            arv.o = SystemClock.elapsedRealtime() * 1000;
            arv.r = q2;
            this.o.stop();
            this.E = 0;
            this.W = true;
        }
    }

    public final boolean d() {
        return !o() || (this.W && !e());
    }

    public final boolean e() {
        return o() && this.k.b(q());
    }

    public final arc f() {
        return this.A;
    }

    public final void g() {
        if (this.aa) {
            this.aa = false;
            this.Y = 0;
            i();
        }
    }

    public final void h() {
        boolean z2 = false;
        this.X = false;
        if (o()) {
            arv arv = this.k;
            arv.c();
            if (arv.o == -9223372036854775807L) {
                ((aru) bdl.a(arv.e)).a();
                z2 = true;
            }
            if (z2) {
                this.o.pause();
            }
        }
    }

    public final void i() {
        if (o()) {
            this.G = 0;
            this.H = 0;
            this.J = 0;
            this.K = 0;
            this.L = 0;
            arc arc = this.z;
            if (arc != null) {
                this.A = arc;
                this.z = null;
            } else if (!this.l.isEmpty()) {
                this.A = ((c) this.l.getLast()).a;
            }
            this.l.clear();
            this.B = 0;
            this.C = 0;
            this.g.d = 0;
            this.R = null;
            this.S = null;
            l();
            this.W = false;
            this.V = -1;
            this.D = null;
            this.E = 0;
            this.M = 0;
            if (this.k.a()) {
                this.o.pause();
            }
            final AudioTrack audioTrack = this.o;
            this.o = null;
            this.k.b();
            this.j.close();
            new Thread() {
                public final void run() {
                    try {
                        audioTrack.flush();
                        audioTrack.release();
                    } finally {
                        ary.this.j.open();
                    }
                }
            }.start();
        }
    }

    public final void j() {
        i();
        final AudioTrack audioTrack = this.n;
        if (audioTrack != null) {
            this.n = null;
            new Thread() {
                public final void run() {
                    audioTrack.release();
                }
            }.start();
        }
        for (AudioProcessor i2 : this.h) {
            i2.i();
        }
        AudioProcessor[] audioProcessorArr = this.i;
        for (int i3 = 0; i3 <= 0; i3++) {
            audioProcessorArr[i3].i();
        }
        this.Y = 0;
        this.X = false;
    }
}
