package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: na reason: default package */
public final class na {
    final List<mx> a;
    final boolean b;

    /* renamed from: na$a */
    public static final class a {
        private List<mx> a;
        private boolean b = false;

        public final a a(mx mxVar) {
            if (mxVar != null) {
                List<mx> list = this.a;
                if (list == null) {
                    this.a = new ArrayList();
                } else if (list.contains(mxVar)) {
                    throw new IllegalArgumentException("route descriptor already added");
                }
                this.a.add(mxVar);
                return this;
            }
            throw new IllegalArgumentException("route must not be null");
        }

        public final na a() {
            return new na(this.a, false);
        }
    }

    na(List<mx> list, boolean z) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.a = list;
        this.b = z;
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

    public static na a(Bundle bundle) {
        List list = null;
        if (bundle == null) {
            return null;
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
            int size = parcelableArrayList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(mx.a((Bundle) parcelableArrayList.get(i)));
            }
            list = arrayList;
        }
        return new na(list, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public final boolean a() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            mx mxVar = (mx) this.a.get(i);
            if (mxVar == null || !mxVar.s()) {
                return false;
            }
        }
        return true;
    }
}
