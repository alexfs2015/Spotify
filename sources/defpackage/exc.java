package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.RemoteCreator;

/* renamed from: exc reason: default package */
public final class exc extends RemoteCreator<exa> {
    private static final exc a = new exc();

    private exc() {
        super("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl");
    }

    public static View a(Context context, int i, int i2, String str, int i3) {
        if (str != null) {
            try {
                return (View) cbj.a(((exa) a.a(context)).a(cbj.a(context), i, i2, str, i3));
            } catch (Exception unused) {
                return new ewz(context, i);
            }
        } else {
            throw new NullPointerException();
        }
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
        return queryLocalInterface instanceof exa ? (exa) queryLocalInterface : new exb(iBinder);
    }
}
