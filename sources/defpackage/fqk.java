package defpackage;

import com.spotify.android.flags.Overridable;
import com.spotify.android.flags.UnmappableValueException;
import java.io.Serializable;

/* renamed from: fqk reason: default package */
public class fqk extends fqm<Boolean> {
    public fqk(String str, fqt fqt, Overridable overridable) {
        super(Boolean.class, str, fqt, overridable, "false");
    }

    /* renamed from: a */
    public Boolean b(String str) {
        if (fbo.a(str)) {
            return Boolean.FALSE;
        }
        if ("true".equals(str)) {
            return Boolean.TRUE;
        }
        if ("false".equals(str)) {
            return Boolean.FALSE;
        }
        if (str.equalsIgnoreCase("control")) {
            return Boolean.FALSE;
        }
        if (str.equalsIgnoreCase("enabled")) {
            return Boolean.TRUE;
        }
        try {
            return Boolean.valueOf(a(Integer.parseInt(str)));
        } catch (NumberFormatException e) {
            throw new UnmappableValueException(this, str, e);
        }
    }

    public boolean a(int i) {
        return i != 0 ? true : true;
    }

    public final /* synthetic */ boolean a(Serializable serializable) {
        boolean booleanValue = ((Boolean) serializable).booleanValue();
        return true;
    }
}
