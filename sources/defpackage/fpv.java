package defpackage;

import com.spotify.android.flags.Overridable;
import com.spotify.android.flags.UnmappableValueException;
import java.io.Serializable;

/* renamed from: fpv reason: default package */
public final class fpv extends fps<Integer> {
    public final /* synthetic */ boolean a(Serializable serializable) {
        return ((Integer) serializable).intValue() != 0;
    }

    public fpv(String str, fpz fpz, Overridable overridable) {
        this(str, fpz, overridable, 0);
    }

    public fpv(String str, fpz fpz, Overridable overridable, int i) {
        super(Integer.class, str, fpz, overridable, Integer.toString(i));
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
}
