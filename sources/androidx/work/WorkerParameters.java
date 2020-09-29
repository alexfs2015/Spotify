package androidx.work;

import android.net.Network;
import android.net.Uri;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {
    UUID a;
    se b;
    Executor c;
    vb d;
    public sn e;
    private Set<String> f;
    private a g;
    private int h;

    public static class a {
        public List<String> a = Collections.emptyList();
        public List<Uri> b = Collections.emptyList();
        public Network c;
    }

    public WorkerParameters(UUID uuid, se seVar, Collection<String> collection, a aVar, int i, Executor executor, vb vbVar, sn snVar) {
        this.a = uuid;
        this.b = seVar;
        this.f = new HashSet(collection);
        this.g = aVar;
        this.h = i;
        this.c = executor;
        this.d = vbVar;
        this.e = snVar;
    }
}
