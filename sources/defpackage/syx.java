package defpackage;

import com.spotify.music.R;

/* renamed from: syx reason: default package */
public final class syx {
    public final boolean a;
    public final int b;
    private final int c;

    public syx(boolean z, int i, int i2) {
        this.a = z;
        if (i == 0 && i2 == 0) {
            this.b = R.anim.fade_in_hard;
            this.c = R.anim.fade_out_hard;
            return;
        }
        this.b = i;
        this.c = i2;
    }

    public static syx a() {
        return new syx(false, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syx)) {
            return false;
        }
        syx syx = (syx) obj;
        return this.a == syx.a && this.b == syx.b && this.c == syx.c;
    }

    public final int hashCode() {
        return ((((this.a ? 1 : 0) * true) + this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnimationSpec{crossfade=");
        sb.append(this.a);
        sb.append(", enterAnim=");
        sb.append(this.b);
        sb.append(", exitAnim=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
