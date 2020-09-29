package defpackage;

import com.spotify.android.flags.Overridable;

/* renamed from: jso reason: default package */
public final class jso extends hju {
    public static final fqa a;
    public static final fqa b;

    static {
        String str = "Enabled";
        a = hjp.a("record-sensor-data-for-training", Overridable.ALWAYS, str);
        b = hjp.a("record-sensor-data-for-classification", Overridable.ALWAYS, str);
    }
}
