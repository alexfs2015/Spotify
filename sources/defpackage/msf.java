package defpackage;

import android.os.Bundle;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import java.util.ArrayList;

/* renamed from: msf reason: default package */
public final class msf {
    public final ArrayList<msd> a = Lists.a();
    public final mse b;
    public final vjj c;

    msf(vjj vjj, mse mse, a aVar) {
        this.c = vjj;
        this.b = mse;
        aVar.a(new c() {
            public final void a(Bundle bundle) {
                bundle.putParcelableArrayList("operations", msf.this.a);
            }

            public final void b(Bundle bundle) {
                if (bundle != null) {
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("operations");
                    if (parcelableArrayList != null) {
                        msf.this.a.clear();
                        msf.this.a.addAll(parcelableArrayList);
                    }
                }
            }
        });
    }

    public final boolean a() {
        return !this.a.isEmpty();
    }
}
