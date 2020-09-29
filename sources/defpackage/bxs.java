package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException;

/* renamed from: bxs reason: default package */
public final class bxs extends RemoteCreator<bxl> {
    private static final bxs a = new bxs();

    private bxs() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View a(Context context, int i, int i2) {
        return a.b(context, i, i2);
    }

    private final View b(Context context, int i, int i2) {
        try {
            bxr bxr = new bxr(i, i2);
            return (View) cbj.a(((bxl) a(context)).a(cbj.a(context), bxr));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder(64);
            sb.append("Could not get button with size ");
            sb.append(i);
            sb.append(" and color ");
            sb.append(i2);
            throw new RemoteCreatorException(sb.toString(), e);
        }
    }

    public final /* synthetic */ Object a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof bxl ? (bxl) queryLocalInterface : new byr(iBinder);
    }
}
