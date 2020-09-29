package defpackage;

import android.provider.Settings.SettingNotFoundException;
import java.lang.reflect.InvocationTargetException;

/* renamed from: djq reason: default package */
public final class djq extends dkn {
    public djq(djc djc, String str, String str2, dci dci, int i) {
        super(djc, str, str2, dci, i, 49);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.b.F = Integer.valueOf(2);
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.c.invoke(null, new Object[]{this.a.a()})).booleanValue();
            dci dci = this.b;
            if (!booleanValue) {
                i = 0;
            }
            dci.F = Integer.valueOf(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
