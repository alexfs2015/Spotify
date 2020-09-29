package defpackage;

import java.util.List;

/* renamed from: hdh reason: default package */
public class hdh extends hdg<hcs> implements hcs {
    protected hdh(hcs hcs) {
        super(hcs);
    }

    public List<? extends hcm> body() {
        return ((hcs) this.a).body();
    }

    public hcj custom() {
        return ((hcs) this.a).custom();
    }

    public String extension() {
        return ((hcs) this.a).extension();
    }

    public hcm header() {
        return ((hcs) this.a).header();
    }

    public String id() {
        return ((hcs) this.a).id();
    }

    public List<? extends hcm> overlays() {
        return ((hcs) this.a).overlays();
    }

    public String title() {
        return ((hcs) this.a).title();
    }

    public a toBuilder() {
        return hdb.immutable(this).toBuilder();
    }
}
