package defpackage;

import com.spotify.android.flags.Overridable;
import java.io.Serializable;

/* renamed from: fqa reason: default package */
public final class fqa extends fps<String> {
    private final String g;

    public final /* bridge */ /* synthetic */ Serializable b(String str) {
        return str;
    }

    public final /* synthetic */ boolean a(Serializable serializable) {
        return this.g.equalsIgnoreCase((String) serializable);
    }

    public fqa(String str, fpz fpz, Overridable overridable) {
        this(str, fpz, overridable, "", "Enabled");
    }

    public fqa(String str, fpz fpz, Overridable overridable, String str2) {
        this(str, fpz, overridable, "", str2);
    }

    private fqa(String str, fpz fpz, Overridable overridable, String str2, String str3) {
        super(String.class, str, fpz, overridable, str2);
        this.g = str3;
    }
}
