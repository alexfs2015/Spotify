package defpackage;

import java.util.Map.Entry;

/* renamed from: dcq reason: default package */
final class dcq extends dcp<Object> {
    dcq() {
    }

    /* access modifiers changed from: 0000 */
    public final int a(Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    public final dcs<Object> a(Object obj) {
        return ((c) obj).zzdtz;
    }

    /* access modifiers changed from: 0000 */
    public final <UT, UB> UB a() {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    public final void a(Object obj, dcs<Object> dcs) {
        ((c) obj).zzdtz = dcs;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(ddz ddz) {
        return ddz instanceof c;
    }

    /* access modifiers changed from: 0000 */
    public final void b() {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    public final void b(Entry<?, ?> entry) {
        entry.getKey();
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    public final void c() {
        throw new NoSuchMethodError();
    }

    /* access modifiers changed from: 0000 */
    public final void c(Object obj) {
        a(obj).b();
    }

    /* access modifiers changed from: 0000 */
    public final dcs<Object> b(Object obj) {
        dcs<Object> a = a(obj);
        if (!a.b) {
            return a;
        }
        dcs<Object> dcs = (dcs) a.clone();
        a(obj, dcs);
        return dcs;
    }

    /* access modifiers changed from: 0000 */
    public final Object a(dcn dcn, ddz ddz, int i) {
        return (d) dcn.b.get(new dco(ddz, i));
    }
}
