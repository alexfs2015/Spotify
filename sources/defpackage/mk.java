package defpackage;

import android.media.VolumeProvider;
import android.os.Build.VERSION;

/* renamed from: mk reason: default package */
public abstract class mk {
    public final int a;
    public final int b;
    public int c;
    public a d;
    private VolumeProvider e;

    /* renamed from: mk$a */
    public static abstract class a {
        public abstract void a(mk mkVar);
    }

    public void b(int i) {
    }

    public void c(int i) {
    }

    public mk(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final void a(int i) {
        this.c = i;
        if (VERSION.SDK_INT >= 21) {
            ((VolumeProvider) a()).setCurrentVolume(i);
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public final Object a() {
        if (this.e == null && VERSION.SDK_INT >= 21) {
            this.e = new VolumeProvider(this.a, this.b, this.c) {
                public final void onSetVolumeTo(int i) {
                    mk.this.b(i);
                }

                public final void onAdjustVolume(int i) {
                    mk.this.c(i);
                }
            };
        }
        return this.e;
    }
}
