package defpackage;

import android.content.Context;

/* renamed from: ber reason: default package */
public final class ber {
    public static final ber a = new ber(320, 50, "320x50_mb");
    public static final ber b = new ber(468, 60, "468x60_as");
    public static final ber c = new ber(320, 100, "320x100_as");
    public static final ber d = new ber(728, 90, "728x90_as");
    public static final ber e = new ber(300, 250, "300x250_as");
    public static final ber f = new ber(160, 600, "160x600_as");
    public static final ber g = new ber(-1, -2, "smart_banner");
    public static final ber h = new ber(-3, -4, "fluid");
    public static final ber i = new ber(50, 50, "50x50_mb");
    public final int j;
    public final int k;
    private final String l;

    static {
        new ber(-3, 0, "search_v2");
    }

    public ber(int i2, int i3) {
        String valueOf = i2 == -1 ? "FULL" : String.valueOf(i2);
        String valueOf2 = i3 == -2 ? "AUTO" : String.valueOf(i3);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 4 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("x");
        sb.append(valueOf2);
        sb.append("_as");
        this(i2, i3, sb.toString());
    }

    ber(int i2, int i3, String str) {
        if (i2 < 0 && i2 != -1 && i2 != -3) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Invalid width for AdSize: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        } else if (i3 >= 0 || i3 == -2 || i3 == -4) {
            this.j = i2;
            this.k = i3;
            this.l = str;
        } else {
            StringBuilder sb2 = new StringBuilder(38);
            sb2.append("Invalid height for AdSize: ");
            sb2.append(i3);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final int a(Context context) {
        int i2 = this.k;
        if (i2 == -4 || i2 == -3) {
            return -1;
        }
        if (i2 == -2) {
            return dpc.b(context.getResources().getDisplayMetrics());
        }
        dpn.a();
        return col.a(context, this.k);
    }

    public final int b(Context context) {
        int i2 = this.j;
        if (i2 == -4 || i2 == -3) {
            return -1;
        }
        if (i2 == -1) {
            return dpc.a(context.getResources().getDisplayMetrics());
        }
        dpn.a();
        return col.a(context, this.j);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ber)) {
            return false;
        }
        ber ber = (ber) obj;
        return this.j == ber.j && this.k == ber.k && this.l.equals(ber.l);
    }

    public final int hashCode() {
        return this.l.hashCode();
    }

    public final String toString() {
        return this.l;
    }
}
