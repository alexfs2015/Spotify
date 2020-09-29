package defpackage;

import com.spotify.android.flags.Overridable;
import com.spotify.android.flags.UnmappableValueException;
import java.io.Serializable;

/* renamed from: fqp reason: default package */
public final class fqp extends fqm<Integer> {
    public fqp(String str, fqt fqt, Overridable overridable) {
        this(str, fqt, overridable, 0);
    }

    public fqp(String str, fqt fqt, Overridable overridable, int i) {
        super(Integer.class, str, fqt, overridable, Integer.toString(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Integer b(String str) {
        if ("control".equalsIgnoreCase(str)) {
            return Integer.valueOf(this.f);
        }
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException e) {
            throw new UnmappableValueException(this, str, e);
        }
    }

    public final /* synthetic */ boolean a(Serializable serializable) {
        return ((Integer) serializable).intValue() != 0;
    }
}
