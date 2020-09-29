package defpackage;

import android.content.IntentFilter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: nh reason: default package */
public final class nh {
    public static final nh c = new nh(new Bundle(), null);
    public final Bundle a;
    List<String> b;

    /* renamed from: nh$a */
    public static final class a {
        private ArrayList<String> a;

        public a() {
        }

        public a(nh nhVar) {
            if (nhVar != null) {
                nhVar.b();
                if (!nhVar.b.isEmpty()) {
                    this.a = new ArrayList<>(nhVar.b);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("selector must not be null");
        }

        private a a(Collection<String> collection) {
            if (collection != null) {
                if (!collection.isEmpty()) {
                    for (String a2 : collection) {
                        a(a2);
                    }
                }
                return this;
            }
            throw new IllegalArgumentException("categories must not be null");
        }

        public final a a(String str) {
            if (str != null) {
                if (this.a == null) {
                    this.a = new ArrayList<>();
                }
                if (!this.a.contains(str)) {
                    this.a.add(str);
                }
                return this;
            }
            throw new IllegalArgumentException("category must not be null");
        }

        public final a a(nh nhVar) {
            if (nhVar != null) {
                a((Collection<String>) nhVar.a());
                return this;
            }
            throw new IllegalArgumentException("selector must not be null");
        }

        public final nh a() {
            if (this.a == null) {
                return nh.c;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", this.a);
            return new nh(bundle, this.a);
        }
    }

    nh(Bundle bundle, List<String> list) {
        this.a = bundle;
        this.b = list;
    }

    public static nh a(Bundle bundle) {
        if (bundle != null) {
            return new nh(bundle, null);
        }
        return null;
    }

    public final List<String> a() {
        b();
        return this.b;
    }

    public final boolean a(List<IntentFilter> list) {
        if (list != null) {
            b();
            int size = this.b.size();
            if (size != 0) {
                int size2 = list.size();
                for (int i = 0; i < size2; i++) {
                    IntentFilter intentFilter = (IntentFilter) list.get(i);
                    if (intentFilter != null) {
                        for (int i2 = 0; i2 < size; i2++) {
                            if (intentFilter.hasCategory((String) this.b.get(i2))) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return false;
    }

    public final boolean a(nh nhVar) {
        if (nhVar == null) {
            return false;
        }
        b();
        nhVar.b();
        return this.b.containsAll(nhVar.b);
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        if (this.b == null) {
            this.b = this.a.getStringArrayList("controlCategories");
            List<String> list = this.b;
            if (list == null || list.isEmpty()) {
                this.b = Collections.emptyList();
            }
        }
    }

    public final boolean c() {
        b();
        return this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nh)) {
            return false;
        }
        nh nhVar = (nh) obj;
        b();
        nhVar.b();
        return this.b.equals(nhVar.b);
    }

    public final int hashCode() {
        b();
        return this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MediaRouteSelector{ ");
        sb.append("controlCategories=");
        sb.append(Arrays.toString(a().toArray()));
        sb.append(" }");
        return sb.toString();
    }
}
