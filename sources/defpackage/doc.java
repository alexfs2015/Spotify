package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

@cfp
/* renamed from: doc reason: default package */
public final class doc {
    dks a;
    boolean b;

    public doc() {
    }

    public doc(Context context) {
        dtg.a(context);
        if (((Boolean) dqe.f().a(dtg.cZ)).booleanValue()) {
            try {
                this.a = dkt.a(DynamiteModule.a(context, DynamiteModule.a, ModuleDescriptor.MODULE_ID).a("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
                cbj.a(context);
                this.a.a(cbj.a(context), "GMA_SDK");
                this.b = true;
            } catch (RemoteException | LoadingException | NullPointerException unused) {
                cpn.a(3);
            }
        }
    }

    public doc(Context context, String str) {
        dtg.a(context);
        try {
            this.a = dkt.a(DynamiteModule.a(context, DynamiteModule.a, ModuleDescriptor.MODULE_ID).a("com.google.android.gms.ads.clearcut.DynamiteClearcutLogger"));
            cbj.a(context);
            this.a.b(cbj.a(context), str);
            this.b = true;
        } catch (RemoteException | LoadingException | NullPointerException unused) {
            cpn.a(3);
        }
    }

    public final dod a(byte[] bArr) {
        return new dod(this, bArr, 0);
    }
}
