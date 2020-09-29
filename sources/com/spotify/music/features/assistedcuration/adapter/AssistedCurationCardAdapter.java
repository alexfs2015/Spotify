package com.spotify.music.features.assistedcuration.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView.u;
import com.squareup.picasso.Picasso;
import java.util.Locale;

public final class AssistedCurationCardAdapter extends androidx.recyclerview.widget.RecyclerView.a<lub> implements gkv {
    public lux a;
    public boolean d;
    private final a e;
    private final ujc f;
    private final Picasso g;

    /* renamed from: com.spotify.music.features.assistedcuration.adapter.AssistedCurationCardAdapter$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Type.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.spotify.music.features.assistedcuration.adapter.AssistedCurationCardAdapter$Type[] r0 = com.spotify.music.features.assistedcuration.adapter.AssistedCurationCardAdapter.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.spotify.music.features.assistedcuration.adapter.AssistedCurationCardAdapter$Type r1 = com.spotify.music.features.assistedcuration.adapter.AssistedCurationCardAdapter.Type.SECTION_HEADER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.spotify.music.features.assistedcuration.adapter.AssistedCurationCardAdapter$Type r1 = com.spotify.music.features.assistedcuration.adapter.AssistedCurationCardAdapter.Type.SECTION_FOOTER     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.spotify.music.features.assistedcuration.adapter.AssistedCurationCardAdapter$Type r1 = com.spotify.music.features.assistedcuration.adapter.AssistedCurationCardAdapter.Type.TRACK_ITEM     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.spotify.music.features.assistedcuration.adapter.AssistedCurationCardAdapter.AnonymousClass1.<clinit>():void");
        }
    }

    enum Type {
        SECTION_HEADER,
        TRACK_ITEM,
        SECTION_FOOTER;
        
        /* access modifiers changed from: private */
        public static final Type[] d = null;

        static {
            d = values();
        }
    }

    public interface a extends defpackage.ltx.a, defpackage.ltz.a {
    }

    public AssistedCurationCardAdapter(a aVar, ujc ujc, Picasso picasso) {
        this.e = aVar;
        this.f = ujc;
        this.g = picasso;
        a(true);
    }

    private static Type f(int i) {
        if (i >= 0 && i < Type.d.length) {
            return Type.d[i];
        }
        throw new IllegalArgumentException("Unsupported view type");
    }

    public final int a(int i) {
        return i == 0 ? Type.SECTION_HEADER.ordinal() : i < this.a.d().size() + 1 ? Type.TRACK_ITEM.ordinal() : Type.SECTION_FOOTER.ordinal();
    }

    public final /* synthetic */ u a(ViewGroup viewGroup, int i) {
        int i2 = AnonymousClass1.a[f(i).ordinal()];
        if (i2 == 1) {
            return new lty(viewGroup);
        }
        if (i2 == 2) {
            return new ltx(viewGroup, this.e);
        }
        if (i2 == 3) {
            return new ltz(viewGroup, this.e, this.f, this.g);
        }
        throw new IllegalArgumentException("Unsupported view type");
    }

    public final /* synthetic */ void a(u uVar, int i) {
        lub lub = (lub) uVar;
        int i2 = AnonymousClass1.a[f(a(i)).ordinal()];
        int i3 = 0;
        if (i2 == 1) {
            lty lty = (lty) lub;
            defpackage.ltw.a aVar = (defpackage.ltw.a) fqz.a(lty.o, defpackage.ltw.a.class);
            aVar.a((CharSequence) this.a.a());
            aVar.c().setVisibility(8);
            aVar.a(false);
        } else if (i2 == 2) {
            ltx ltx = (ltx) lub;
            lux lux = this.a;
            View view = ltx.a;
            if (!lux.e()) {
                i3 = 8;
            }
            view.setVisibility(i3);
            ltx.o.setOnClickListener(new OnClickListener(lux) {
                private /* synthetic */ lux a;

                {
                    this.a = r2;
                }

                public final void onClick(View view) {
                    ltx.this.b.a(this.a);
                    ltx.this.o.setOnClickListener(null);
                }
            });
        } else if (i2 == 3) {
            ltz ltz = (ltz) lub;
            lux lux2 = this.a;
            int i4 = i - 1;
            ltz.a(lux2, (luu) lux2.d().get(i4), i4, this.d);
        } else {
            throw new IllegalArgumentException("Unsupported view type");
        }
    }

    public final int b() {
        lux lux = this.a;
        if (lux != null) {
            return lux.d().size() + 2;
        }
        return 0;
    }

    public final long b(int i) {
        int hashCode;
        String b = this.a.b();
        int i2 = AnonymousClass1.a[f(a(i)).ordinal()];
        if (i2 == 1) {
            StringBuilder sb = new StringBuilder("header");
            sb.append(b);
            hashCode = sb.toString().hashCode();
        } else if (i2 == 2) {
            StringBuilder sb2 = new StringBuilder("footer");
            sb2.append(b);
            hashCode = sb2.toString().hashCode();
        } else if (i2 == 3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(((luu) this.a.d().get(i - 1)).a());
            sb3.append(b);
            hashCode = sb3.toString().hashCode();
        } else {
            throw new IllegalArgumentException("Unsupported view type");
        }
        return (long) hashCode;
    }

    public final String c(int i) {
        return f(a(i)).name().toLowerCase(Locale.getDefault());
    }
}
