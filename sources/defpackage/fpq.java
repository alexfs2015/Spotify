package defpackage;

import com.spotify.android.flags.Overridable;
import com.spotify.android.flags.UnmappableValueException;
import java.io.Serializable;

/* renamed from: fpq reason: default package */
public class fpq extends fps<Boolean> {
    public boolean a(int i) {
        return i != 0;
    }

    public final /* synthetic */ boolean a(Serializable serializable) {
        return ((Boolean) serializable).booleanValue();
    }

    public fpq(String str, fpz fpz, Overridable overridable) {
        super(Boolean.class, str, fpz, overridable, "false");
    }

    /* renamed from: a */
    public Boolean b(String str) {
        if (fax.a(str)) {
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
}
