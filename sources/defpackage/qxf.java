package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.spotify.remoteconfig.AndroidFeatureUserProperties;
import com.spotify.remoteconfig.AndroidFeatureUserProperties.ProfileViewMoreLinkTextResource;
import defpackage.frt;
import java.util.Arrays;
import java.util.List;

@Deprecated
/* renamed from: qxf reason: default package */
abstract class qxf<T, RowType extends frt> extends BaseAdapter {
    protected final Context a;
    protected final jyx b;
    private List<T> c;
    private final Class<RowType> d;
    private boolean e;
    private final AndroidFeatureUserProperties f;

    /* renamed from: qxf$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[ProfileViewMoreLinkTextResource.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.remoteconfig.AndroidFeatureUserProperties$ProfileViewMoreLinkTextResource[] r0 = com.spotify.remoteconfig.AndroidFeatureUserProperties.ProfileViewMoreLinkTextResource.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.remoteconfig.AndroidFeatureUserProperties$ProfileViewMoreLinkTextResource r1 = com.spotify.remoteconfig.AndroidFeatureUserProperties.ProfileViewMoreLinkTextResource.PROFILE_VIEW_ALL_FOOTER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.remoteconfig.AndroidFeatureUserProperties$ProfileViewMoreLinkTextResource r1 = com.spotify.remoteconfig.AndroidFeatureUserProperties.ProfileViewMoreLinkTextResource.PROFILE_VIEW_MORE_FOOTER     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.remoteconfig.AndroidFeatureUserProperties$ProfileViewMoreLinkTextResource r1 = com.spotify.remoteconfig.AndroidFeatureUserProperties.ProfileViewMoreLinkTextResource.PROFILE_VIEW_MORE_ITEMS_FOOTER     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.qxf.AnonymousClass1.<clinit>():void");
        }
    }

    public qxf(Context context, Class<RowType> cls, boolean z, jyx jyx, AndroidFeatureUserProperties androidFeatureUserProperties) {
        this.a = (Context) fbp.a(context);
        this.d = (Class) fbp.a(cls);
        this.e = z;
        this.b = jyx;
        this.f = androidFeatureUserProperties;
    }

    /* access modifiers changed from: protected */
    public abstract RowType a(Context context, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    public abstract void a(RowType rowtype, T t);

    public void a(boolean z) {
        if (z != this.e) {
            this.e = z;
            notifyDataSetChanged();
        }
    }

    public final void a(T[] tArr) {
        this.c = Arrays.asList(tArr);
        notifyDataSetChanged();
    }

    public int getCount() {
        List<T> list = this.c;
        int size = list != null ? list.size() : 0;
        return this.e ? size + 1 : size;
    }

    public T getItem(int i) {
        if (i < this.c.size()) {
            return this.c.get(i);
        }
        return null;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        List<T> list = this.c;
        return (list == null || i >= list.size()) ? 1 : 0;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [frt] */
    /* JADX WARNING: type inference failed for: r2v4, types: [frx] */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r3v2, types: [frx] */
    /* JADX WARNING: type inference failed for: r2v18, types: [frx] */
    /* JADX WARNING: type inference failed for: r3v5, types: [frt] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r2v20 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r2, android.view.View r3, android.view.ViewGroup r4) {
        /*
            r1 = this;
            int r0 = r1.getItemViewType(r2)
            if (r0 != 0) goto L_0x001e
            java.lang.Class<RowType> r0 = r1.d
            fqy r3 = defpackage.fqv.b(r3, r0)
            frt r3 = (defpackage.frt) r3
            if (r3 != 0) goto L_0x0016
            android.content.Context r3 = r1.a
            frt r3 = r1.a(r3, r4)
        L_0x0016:
            java.lang.Object r2 = r1.getItem(r2)
            r1.a((RowType) r3, (T) r2)
            goto L_0x0070
        L_0x001e:
            java.lang.Class<frx> r2 = defpackage.frx.class
            fqy r2 = defpackage.fqv.b(r3, r2)
            frx r2 = (defpackage.frx) r2
            if (r2 != 0) goto L_0x0031
            defpackage.fqv.b()
            android.content.Context r2 = r1.a
            frx r2 = defpackage.fsk.c(r2, r4)
        L_0x0031:
            r3 = r2
            int[] r2 = defpackage.qxf.AnonymousClass1.a
            com.spotify.remoteconfig.AndroidFeatureUserProperties r4 = r1.f
            com.spotify.remoteconfig.AndroidFeatureUserProperties$ProfileViewMoreLinkTextResource r4 = r4.a()
            int r4 = r4.ordinal()
            r2 = r2[r4]
            r4 = 1
            r0 = 2131953427(0x7f130713, float:1.9543325E38)
            if (r2 == r4) goto L_0x0067
            r4 = 2
            if (r2 == r4) goto L_0x005d
            r4 = 3
            if (r2 == r4) goto L_0x0053
            android.content.Context r2 = r1.a
            java.lang.String r2 = r2.getString(r0)
            goto L_0x006d
        L_0x0053:
            android.content.Context r2 = r1.a
            r4 = 2131953429(0x7f130715, float:1.9543329E38)
            java.lang.String r2 = r2.getString(r4)
            goto L_0x006d
        L_0x005d:
            android.content.Context r2 = r1.a
            r4 = 2131953428(0x7f130714, float:1.9543327E38)
            java.lang.String r2 = r2.getString(r4)
            goto L_0x006d
        L_0x0067:
            android.content.Context r2 = r1.a
            java.lang.String r2 = r2.getString(r0)
        L_0x006d:
            r3.a(r2)
        L_0x0070:
            android.view.View r2 = r3.getView()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qxf.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return 2;
    }
}
