package defpackage;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSet.a;

/* renamed from: rlf reason: default package */
public final class rlf {
    public static final ImmutableSet<String> a = new a().b("product").b("raw_platform").b("version").b("revision").b("device_id").b("uuid").b("hardware_model").b("hardware_vendor").b("os").b("architecture").b("signature").a();
    public static final ImmutableSet<String> b = new a().b("username").a();
    final ImmutableMap<String, String> c;

    static {
        new a().b("crash_timestamp").b("uptime").b("free_memory").b("state").b("lifecycle").a();
    }

    rlf(ImmutableMap<String, String> immutableMap) {
        this.c = immutableMap;
    }

    static rlf a(ImmutableMap<String, String> immutableMap) {
        return new rlf(immutableMap);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseCrashInfoMap{mInfoMap=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
