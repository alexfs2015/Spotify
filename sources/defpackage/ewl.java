package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.RemoteCreator;

/* renamed from: ewl reason: default package */
public final class ewl extends RemoteCreator<ewj> {
    private static final ewl a = new ewl();

    private ewl() {
        super("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl");
    }

    public static View a(Context context, int i, int i2, String str, int i3) {
        if (str != null) {
            try {
                return (View) cas.a(((ewj) a.a(context)).a(cas.a(context), i, i2, str, i3));
            } catch (Exception unused) {
                return new ewi(context, i);
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
        return queryLocalInterface instanceof ewj ? (ewj) queryLocalInterface : new ewk(iBinder);
    }
}
