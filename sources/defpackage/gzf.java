package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIconV2;
import com.spotify.mobile.android.glue.GlueLayoutTraits.Trait;
import com.spotify.mobile.android.hubframework.defaults.HubsGlueImageDelegate;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueImageConfig;
import com.spotify.mobile.android.hubframework.defaults.components.glue.HubsGlueRow.a.C0012a;
import defpackage.frt;
import java.util.EnumSet;

/* renamed from: gzf reason: default package */
public abstract class gzf<T extends frt> extends gyo<T> {
    private final HubsGlueImageDelegate a;
    private final jtz b;

    /* renamed from: gzf$a */
    public static class a extends b {

        /* renamed from: gzf$a$a reason: collision with other inner class name */
        public static final class C0039a extends a {
            public C0039a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                super(hubsGlueImageDelegate);
            }

            /* access modifiers changed from: protected */
            public final void a(frx frx, hcm hcm) {
                ((frv) frx).a(hcm.custom().intValue("hubs:linecap", 2));
                super.a(frx, hcm);
            }

            /* access modifiers changed from: protected */
            public final /* synthetic */ frt b(Context context, ViewGroup viewGroup) {
                return super.b(context, viewGroup);
            }
        }

        public a(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate);
        }

        /* access modifiers changed from: protected */
        public void a(frx frx, hcm hcm) {
            CharSequence a = gzk.a(hcm);
            CharSequence c = gzk.c(hcm);
            if (!TextUtils.isEmpty(a)) {
                frx.a(a);
                return;
            }
            if (!TextUtils.isEmpty(c)) {
                frx.a(c);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final frx b(Context context, ViewGroup viewGroup) {
            fqv.b();
            return fsk.a(context, viewGroup, Integer.MAX_VALUE);
        }
    }

    /* renamed from: gzf$b */
    public static class b extends gzf<frx> {

        /* renamed from: gzf$b$a */
        public static class a extends b {

            /* renamed from: gzf$b$a$a reason: collision with other inner class name */
            public static final class C0040a extends a {
                public C0040a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    super(hubsGlueImageDelegate);
                }

                /* access modifiers changed from: protected */
                public final /* bridge */ /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
                    return super.a(context, viewGroup);
                }

                /* access modifiers changed from: protected */
                public final /* bridge */ /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
                    super.a((frx) fqy, hcm, gwm);
                }

                /* access modifiers changed from: protected */
                public final /* bridge */ /* synthetic */ void a(frt frt, hcm hcm) {
                    super.a((frx) frt, hcm);
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public final frx b(Context context, ViewGroup viewGroup) {
                    fqv.b();
                    return fsk.d(context, viewGroup);
                }
            }

            public a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                super(hubsGlueImageDelegate);
            }

            /* access modifiers changed from: protected */
            public /* bridge */ /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
                return super.a(context, viewGroup);
            }

            /* access modifiers changed from: protected */
            public /* bridge */ /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
                super.a((frx) fqy, hcm, gwm);
            }

            /* access modifiers changed from: protected */
            public /* bridge */ /* synthetic */ void a(frt frt, hcm hcm) {
                super.a((frx) frt, hcm);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public frx b(Context context, ViewGroup viewGroup) {
                fqv.b();
                return fsk.c(context, viewGroup);
            }
        }

        /* renamed from: gzf$b$b reason: collision with other inner class name */
        public static final class C0041b extends b {
            public C0041b(HubsGlueImageDelegate hubsGlueImageDelegate) {
                super(hubsGlueImageDelegate);
            }

            /* access modifiers changed from: protected */
            public final /* bridge */ /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
                return super.a(context, viewGroup);
            }

            /* access modifiers changed from: protected */
            public final /* bridge */ /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
                super.a((frx) fqy, hcm, gwm);
            }

            /* access modifiers changed from: protected */
            public final /* bridge */ /* synthetic */ void a(frt frt, hcm hcm) {
                super.a((frx) frt, hcm);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public final frx b(Context context, ViewGroup viewGroup) {
                fqv.b();
                return fsk.b(context, viewGroup);
            }
        }

        public b(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, frx.class, 0);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            return gzf.super.a(context, viewGroup);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            gzf.super.a((frx) fqy, hcm, gwm);
        }

        /* access modifiers changed from: protected */
        public void a(frx frx, hcm hcm) {
            frx.a(gzk.a(hcm));
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public frx b(Context context, ViewGroup viewGroup) {
            fqv.b();
            return fsk.a(context, viewGroup);
        }
    }

    /* renamed from: gzf$c */
    public static class c extends gzf<fsb> {
        final boolean a;

        /* renamed from: gzf$c$a */
        public static class a extends c {

            /* renamed from: gzf$c$a$a reason: collision with other inner class name */
            public static final class C0042a extends a {
                public C0042a(HubsGlueImageDelegate hubsGlueImageDelegate, boolean z) {
                    super(hubsGlueImageDelegate, false);
                }

                /* access modifiers changed from: protected */
                public final /* bridge */ /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
                    return super.a(context, viewGroup);
                }

                /* access modifiers changed from: protected */
                public final /* bridge */ /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
                    super.a((fsb) fqy, hcm, gwm);
                }

                /* access modifiers changed from: protected */
                public final void a(fsb fsb, hcm hcm) {
                    super.a(fsb, hcm);
                    CharSequence a = gzk.a(hcm.text().accessory(), hcm.custom().boolValue("glue:accessoryAsHtml", false));
                    if (!TextUtils.isEmpty(a)) {
                        ((fsf) fsb).d(a);
                    }
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public final fsb b(Context context, ViewGroup viewGroup) {
                    fqv.b();
                    return fsk.e(context, viewGroup);
                }
            }

            public a(HubsGlueImageDelegate hubsGlueImageDelegate, boolean z) {
                super(hubsGlueImageDelegate, z);
            }

            /* access modifiers changed from: protected */
            public /* bridge */ /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
                return super.a(context, viewGroup);
            }

            /* access modifiers changed from: protected */
            public /* bridge */ /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
                super.a((fsb) fqy, hcm, gwm);
            }

            /* access modifiers changed from: protected */
            public /* bridge */ /* synthetic */ void a(frt frt, hcm hcm) {
                super.a((fsb) frt, hcm);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public fsb b(Context context, ViewGroup viewGroup) {
                fqv.b();
                return fsk.b(context, viewGroup, this.a);
            }
        }

        /* renamed from: gzf$c$b */
        public static final class b extends c {
            public b(HubsGlueImageDelegate hubsGlueImageDelegate, boolean z) {
                super(hubsGlueImageDelegate, z);
            }

            /* access modifiers changed from: protected */
            public final /* bridge */ /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
                return super.a(context, viewGroup);
            }

            /* access modifiers changed from: protected */
            public final /* bridge */ /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
                super.a((fsb) fqy, hcm, gwm);
            }

            /* access modifiers changed from: protected */
            public final void a(fsb fsb, hcm hcm) {
                super.a(fsb, hcm);
                ((fsh) fsb).a(hcm.custom().intValue("row_number", 0));
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public final fsb b(Context context, ViewGroup viewGroup) {
                fqv.b();
                return fsk.c(context, viewGroup, this.a);
            }
        }

        public c(HubsGlueImageDelegate hubsGlueImageDelegate, boolean z) {
            super(hubsGlueImageDelegate, fsb.class, 0);
            this.a = z;
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
            return gzf.super.a(context, viewGroup);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
            gzf.super.a((fsb) fqy, hcm, gwm);
        }

        /* access modifiers changed from: protected */
        public void a(fsb fsb, hcm hcm) {
            fsb.a(gzk.a(hcm));
            CharSequence b2 = gzk.b(hcm);
            if (!TextUtils.isEmpty(b2)) {
                if (gzk.d(hcm)) {
                    fsb.c(b2);
                } else {
                    fsb.b(b2);
                }
                TextView d = fsb.d();
                String string = hcm.custom().string("label");
                Context context = d.getContext();
                if (string == null) {
                    string = "";
                }
                jzb.a(context, d, string);
                return;
            }
            fsb.b(null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public fsb b(Context context, ViewGroup viewGroup) {
            fqv.b();
            return fsk.a(context, viewGroup, this.a);
        }
    }

    private gzf(HubsGlueImageDelegate hubsGlueImageDelegate, Class<T> cls) {
        super(EnumSet.of(Trait.STACKABLE), cls);
        this.a = (HubsGlueImageDelegate) fbp.a(hubsGlueImageDelegate);
        this.b = jtp.a;
    }

    /* synthetic */ gzf(HubsGlueImageDelegate hubsGlueImageDelegate, Class cls, byte b2) {
        this(hubsGlueImageDelegate, cls);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ fqy a(Context context, ViewGroup viewGroup, gwm gwm) {
        return b(context, viewGroup);
    }

    /* access modifiers changed from: protected */
    public final T a(Context context, ViewGroup viewGroup) {
        return b(context, viewGroup);
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ void a(fqy fqy, hcm hcm, gwm gwm, defpackage.gwi.b bVar) {
        a((T) (frt) fqy, hcm, gwm);
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t, hcm hcm);

    /* access modifiers changed from: protected */
    public final void a(T t, hcm hcm, gwm gwm) {
        a(t, hcm);
        hdl.a(t.getView());
        gwj.a(gwm, t.getView(), hcm);
        String str = "longClick";
        if (hcm.events().containsKey(str)) {
            hdl.a(gwm.c).a(str).a(hcm).a(t.getView()).b();
        }
        if (t instanceof fsj) {
            fsj fsj = (fsj) t;
            HubsGlueImageDelegate hubsGlueImageDelegate = this.a;
            jtz jtz = this.b;
            if (gzd.a(hcm)) {
                jqv a2 = jqv.a(fsj.c(), jtz);
                hcj bundle = hcm.custom().bundle("calendar");
                if (bundle != null) {
                    a2.a(bundle.string("month", "APR"), bundle.intValue("day_of_month", 1));
                }
            } else {
                gzd.a(hubsGlueImageDelegate, fsj.c(), hcm.images().main(), hcm.images().icon(), HubsGlueImageConfig.THUMBNAIL);
            }
        }
        Object obj = hcm.custom().get("secondary_icon");
        gce a3 = C0012a.a;
        Class<T> cls = a3.a;
        Enum enumR = cls.isInstance(obj) ? (Enum) cls.cast(obj) : obj instanceof String ? (Enum) a3.a((String) obj).d() : null;
        SpotifyIconV2 spotifyIconV2 = (SpotifyIconV2) enumR;
        String str2 = "rightAccessoryClick";
        if (spotifyIconV2 == null && hcm.events().containsKey(str2)) {
            spotifyIconV2 = SpotifyIconV2.MORE_ANDROID;
        }
        if (spotifyIconV2 != null) {
            View a4 = jyz.a(t.getView().getContext(), spotifyIconV2);
            if (hcm.events().containsKey(str2)) {
                hdl.a(gwm.c).a(str2).a(hcm).a(a4).a();
            }
            t.a(a4);
        } else {
            t.a(null);
        }
        t.c(gzg.a(hcm));
    }

    /* access modifiers changed from: protected */
    public abstract T b(Context context, ViewGroup viewGroup);
}
