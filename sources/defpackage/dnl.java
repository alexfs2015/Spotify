package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@cey
/* renamed from: dnl reason: default package */
public final class dnl {
    dkb a;
    boolean b;

    public dnl() {
    }

    public final dnm a(byte[] bArr) {
        return new dnm(this, bArr, 0);
    }

    public dnl(Context context, String str) {
        dsp.a(context);
        try {
            this.a = dkc.a(DynamiteModule.a(context, DynamiteModule.a, ModuleDescriptor.MODULE_ID).a("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
            cas.a(context);
            this.a.b(cas.a(context), str);
            this.b = true;
        } catch (RemoteException | LoadingException | NullPointerException unused) {
            cow.a(3);
        }
    }

    public dnl(Context context) {
        dsp.a(context);
        if (((Boolean) dpn.f().a(dsp.cZ)).booleanValue()) {
            try {
                this.a = dkc.a(DynamiteModule.a(context, DynamiteModule.a, ModuleDescriptor.MODULE_ID).a("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
                cas.a(context);
                this.a.a(cas.a(context), "GMA_SDK");
                this.b = true;
            } catch (RemoteException | LoadingException | NullPointerException unused) {
                cow.a(3);
            }
        }
    }
}
