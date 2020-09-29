package defpackage;

import java.util.List;

/* renamed from: hao reason: default package */
public class hao extends han<gzz> implements gzz {
    protected hao(gzz gzz) {
        super(gzz);
    }

    public a toBuilder() {
        return hai.immutable(this).toBuilder();
    }

    public String id() {
        return ((gzz) this.a).id();
    }

    public String title() {
        return ((gzz) this.a).title();
    }

    public gzt header() {
        return ((gzz) this.a).header();
    }

    public List<? extends gzt> body() {
        return ((gzz) this.a).body();
    }

    public List<? extends gzt> overlays() {
        return ((gzz) this.a).overlays();
    }

    public String extension() {
        return ((gzz) this.a).extension();
    }

    public gzq custom() {
        return ((gzz) this.a).custom();
    }
}
