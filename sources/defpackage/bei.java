package defpackage;

import java.nio.ByteBuffer;

/* renamed from: bei reason: default package */
public final class bei extends apu {
    private final aqf h = new aqf();
    private final arv i = new arv(1);
    private final bdj j = new bdj();
    private long k;
    private beh l;
    private long m;

    public final boolean q() {
        return true;
    }

    public bei() {
        super(5);
    }

    public final int a(aqe aqe) {
        return "application/x-camera-motion".equals(aqe.f) ? 4 : 0;
    }

    public final void handleMessage(int i2, Object obj) {
        if (i2 == 7) {
            this.l = (beh) obj;
        } else {
            super.handleMessage(i2, obj);
        }
    }

    public final void a(aqe[] aqeArr, long j2) {
        this.k = j2;
    }

    public final void a(long j2, boolean z) {
        this.m = 0;
    }

    public final void p() {
        this.m = 0;
    }

    public final void a(long j2, long j3) {
        float[] fArr;
        while (!this.f && this.m < 100000 + j2) {
            this.i.a();
            if (a(this.h, this.i, false) == -4 && !this.i.c()) {
                this.i.f();
                this.m = this.i.d;
                if (this.l != null) {
                    ByteBuffer byteBuffer = this.i.c;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        this.j.a(byteBuffer.array(), byteBuffer.limit());
                        this.j.c(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i2 = 0; i2 < 3; i2++) {
                            fArr2[i2] = Float.intBitsToFloat(this.j.j());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        bdw.a(this.l);
                    }
                }
            } else {
                return;
            }
        }
    }

    public final boolean r() {
        return this.f;
    }
}
