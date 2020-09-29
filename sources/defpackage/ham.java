package defpackage;

import java.util.List;
import java.util.Map;

/* renamed from: ham reason: default package */
public class ham extends han<gzt> implements gzt {
    public ham(gzt gzt) {
        super(gzt);
    }

    public List<? extends gzt> childGroup(String str) {
        return gzu.b((Iterable<M>) children(), str);
    }

    public a toBuilder() {
        return hae.immutable(this).toBuilder();
    }

    public gzr componentId() {
        return ((gzt) this.a).componentId();
    }

    public gzv text() {
        return ((gzt) this.a).text();
    }

    public gzs images() {
        return ((gzt) this.a).images();
    }

    public gzq metadata() {
        return ((gzt) this.a).metadata();
    }

    public gzq logging() {
        return ((gzt) this.a).logging();
    }

    public gzq custom() {
        return ((gzt) this.a).custom();
    }

    public gzy target() {
        return ((gzt) this.a).target();
    }

    public String id() {
        return ((gzt) this.a).id();
    }

    public String group() {
        return ((gzt) this.a).group();
    }

    public Map<String, ? extends gzp> events() {
        return ((gzt) this.a).events();
    }

    public List<? extends gzt> children() {
        return ((gzt) this.a).children();
    }
}
