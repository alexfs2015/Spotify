package defpackage;

import com.spotify.android.flags.Overridable;
import java.io.Serializable;

/* renamed from: fqu reason: default package */
public final class fqu extends fqm<String> {
    private final String g;

    public fqu(String str, fqt fqt, Overridable overridable) {
        this(str, fqt, overridable, "  ", "Enabled");
    }

    public fqu(String str, fqt fqt, Overridable overridable, String str2) {
        this(str, fqt, overridable, "", str2);
    }

    private fqu(String str, fqt fqt, Overridable overridable, String str2, String str3) {
        super(String.class, str, fqt, overridable, str2);
        this.g = str3;
    }

    public final /* synthetic */ boolean a(Serializable serializable) {
        return this.g.equalsIgnoreCase((String) serializable);
    }

    public final /* bridge */ /* synthetic */ Serializable b(String str) {
        return str;
    }
}
