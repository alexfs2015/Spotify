package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: hdf reason: default package */
public class hdf extends hdg<hcm> implements hcm {
    public hdf(hcm hcm) {
        super(hcm);
    }

    public List<? extends hcm> childGroup(String str) {
        return hcn.b((Iterable<M>) children(), str);
    }

    public List<? extends hcm> children() {
        return ((hcm) this.a).children();
    }

    public hck componentId() {
        return ((hcm) this.a).componentId();
    }

    public hcj custom() {
        return ((hcm) this.a).custom();
    }

    public Map<String, ? extends hci> events() {
        return ((hcm) this.a).events();
    }

    public String group() {
        return ((hcm) this.a).group();
    }

    public String id() {
        return ((hcm) this.a).id();
    }

    public hcl images() {
        return ((hcm) this.a).images();
    }

    public hcj logging() {
        return ((hcm) this.a).logging();
    }

    public hcj metadata() {
        return ((hcm) this.a).metadata();
    }

    public hcr target() {
        return ((hcm) this.a).target();
    }

    public hco text() {
        return ((hcm) this.a).text();
    }

    public a toBuilder() {
        return hcx.immutable(this).toBuilder();
    }
}
