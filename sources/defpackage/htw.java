package defpackage;

import android.net.Uri.Builder;
import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: htw reason: default package */
public final class htw {
    private final Map<String, Set<String>> a = new HashMap(1);

    public final Builder a(Builder builder) {
        for (Entry entry : this.a.entrySet()) {
            for (String appendQueryParameter : (Set) entry.getValue()) {
                builder.appendQueryParameter((String) entry.getKey(), appendQueryParameter);
            }
        }
        return builder;
    }

    public final void a(htw htw) {
        for (Entry entry : htw.a.entrySet()) {
            String str = (String) entry.getKey();
            Set set = (Set) entry.getValue();
            Set set2 = (Set) this.a.get(str);
            if (set2 != null) {
                HashSet hashSet = new HashSet(set2);
                hashSet.addAll(set);
                this.a.put(str, ImmutableSet.a((Collection<? extends E>) hashSet));
            } else {
                this.a.put(str, set);
            }
        }
    }

    public final void a(String str, String str2) {
        Set set = (Set) this.a.get(str);
        if (set != null) {
            HashSet hashSet = new HashSet(set);
            hashSet.add(str2);
            this.a.put(str, ImmutableSet.a((Collection<? extends E>) hashSet));
            return;
        }
        this.a.put(str, ImmutableSet.d(str2));
    }
}
