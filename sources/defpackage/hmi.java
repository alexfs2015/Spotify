package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

/* renamed from: hmi reason: default package */
public interface hmi {
    Collection<fqm<?>> a();

    List<fqm<?>> b();

    List<fqm<? extends Serializable>> c();
}
