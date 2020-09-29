package defpackage;

import android.provider.Settings.SettingNotFoundException;
import java.lang.reflect.InvocationTargetException;

/* renamed from: diz reason: default package */
public final class diz extends djw {
    public diz(dil dil, String str, String str2, dbr dbr, int i) {
        super(dil, str, str2, dbr, i, 49);
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.b.F = Integer.valueOf(2);
        try {
            int i = 1;
            boolean booleanValue = ((Boolean) this.c.invoke(null, new Object[]{this.a.a()})).booleanValue();
            dbr dbr = this.b;
            if (!booleanValue) {
                i = 0;
            }
            dbr.F = Integer.valueOf(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
