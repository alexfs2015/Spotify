package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: nf reason: default package */
public final class nf {
    final List<nc> a;
    final boolean b;

    /* renamed from: nf$a */
    public static final class a {
        private List<nc> a;
        private boolean b = false;

        public final a a(nc ncVar) {
            if (ncVar != null) {
                List<nc> list = this.a;
                if (list == null) {
                    this.a = new ArrayList();
                } else if (list.contains(ncVar)) {
                    throw new IllegalArgumentException("route descriptor already added");
                }
                this.a.add(ncVar);
                return this;
            }
            throw new IllegalArgumentException("route must not be null");
        }

        public final nf a() {
            return new nf(this.a, false);
        }
    }

    nf(List<nc> list, boolean z) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.a = list;
        this.b = z;
    }

    public static nf a(Bundle bundle) {
        List list = null;
        if (bundle == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(nc.a((Bundle) parcelableArrayList.get(i)));
            }
            list = arrayList;
        }
        return new nf(list, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public final boolean a() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            nc ncVar = (nc) this.a.get(i);
            if (ncVar == null || !ncVar.s()) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaRouteProviderDescriptor{ ");
        sb.append("routes=");
        sb.append(Arrays.toString(this.a.toArray()));
        sb.append(", isValid=");
        sb.append(a());
        sb.append(" }");
        return sb.toString();
    }
}
