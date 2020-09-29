package defpackage;

import android.os.Bundle;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.util.ui.Lifecycle.a;
import com.spotify.mobile.android.util.ui.Lifecycle.c;
import java.util.ArrayList;

/* renamed from: mnm reason: default package */
public final class mnm {
    public final ArrayList<mnk> a = Lists.a();
    public final mnl b;
    public final uxh c;

    mnm(uxh uxh, mnl mnl, a aVar) {
        this.c = uxh;
        this.b = mnl;
        aVar.a(new c() {
            public final void a(Bundle bundle) {
                bundle.putParcelableArrayList("operations", mnm.this.a);
            }

            public final void b(Bundle bundle) {
                if (bundle != null) {
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("operations");
                    if (parcelableArrayList != null) {
                        mnm.this.a.clear();
                        mnm.this.a.addAll(parcelableArrayList);
                    }
                }
            }
        });
    }

    public final boolean a() {
        return !this.a.isEmpty();
    }
}
