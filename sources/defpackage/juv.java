package defpackage;

import com.spotify.android.flags.Overridable;

/* renamed from: juv reason: default package */
public final class juv extends hmm {
    public static final fqu a;
    public static final fqu b;

    static {
        String str = "Enabled";
        a = hmh.a("record-sensor-data-for-training", Overridable.ALWAYS, str);
        b = hmh.a("record-sensor-data-for-classification", Overridable.ALWAYS, str);
    }
}
