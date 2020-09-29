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
import defpackage.fqz;
import java.util.EnumSet;

/* renamed from: gwv reason: default package */
public abstract class gwv<T extends fqz> extends gwm<T> {
    private final HubsGlueImageDelegate a;
    private final jrp b;

    /* renamed from: gwv$a */
    public static class a extends b {

        /* renamed from: gwv$a$a reason: collision with other inner class name */
        public static final class C0038a extends a {
            /* access modifiers changed from: protected */
            public final /* synthetic */ fqz b(Context context, ViewGroup viewGroup) {
                return super.b(context, viewGroup);
            }

            public C0038a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                super(hubsGlueImageDelegate);
            }

            /* access modifiers changed from: protected */
            public final void a(frd frd, gzt gzt) {
                ((frb) frd).a(gzt.custom().intValue("hubs:linecap", 2));
                super.a(frd, gzt);
            }
        }

        public a(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public final frd b(Context context, ViewGroup viewGroup) {
            fqb.b();
            return frq.a(context, viewGroup, Integer.MAX_VALUE);
        }

        /* access modifiers changed from: protected */
        public void a(frd frd, gzt gzt) {
            CharSequence a = gwz.a(gzt);
            CharSequence c = gwz.c(gzt);
            if (!TextUtils.isEmpty(a)) {
                frd.a(a);
                return;
            }
            if (!TextUtils.isEmpty(c)) {
                frd.a(c);
            }
        }
    }

    /* renamed from: gwv$b */
    public static class b extends gwv<frd> {

        /* renamed from: gwv$b$a */
        public static class a extends b {

            /* renamed from: gwv$b$a$a reason: collision with other inner class name */
            public static final class C0039a extends a {
                /* access modifiers changed from: protected */
                public final /* bridge */ /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
                    return super.a(context, viewGroup);
                }

                /* access modifiers changed from: protected */
                public final /* bridge */ /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, defpackage.gui.b bVar) {
                    super.a((frd) fqe, gzt, gum);
                }

                /* access modifiers changed from: protected */
                public final /* bridge */ /* synthetic */ void a(fqz fqz, gzt gzt) {
                    super.a((frd) fqz, gzt);
                }

                public C0039a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                    super(hubsGlueImageDelegate);
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public final frd b(Context context, ViewGroup viewGroup) {
                    fqb.b();
                    return frq.d(context, viewGroup);
                }
            }

            /* access modifiers changed from: protected */
            public /* bridge */ /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
                return super.a(context, viewGroup);
            }

            /* access modifiers changed from: protected */
            public /* bridge */ /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, defpackage.gui.b bVar) {
                super.a((frd) fqe, gzt, gum);
            }

            /* access modifiers changed from: protected */
            public /* bridge */ /* synthetic */ void a(fqz fqz, gzt gzt) {
                super.a((frd) fqz, gzt);
            }

            public a(HubsGlueImageDelegate hubsGlueImageDelegate) {
                super(hubsGlueImageDelegate);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public frd b(Context context, ViewGroup viewGroup) {
                fqb.b();
                return frq.c(context, viewGroup);
            }
        }

        /* renamed from: gwv$b$b reason: collision with other inner class name */
        public static final class C0040b extends b {
            /* access modifiers changed from: protected */
            public final /* bridge */ /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
                return super.a(context, viewGroup);
            }

            /* access modifiers changed from: protected */
            public final /* bridge */ /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, defpackage.gui.b bVar) {
                super.a((frd) fqe, gzt, gum);
            }

            /* access modifiers changed from: protected */
            public final /* bridge */ /* synthetic */ void a(fqz fqz, gzt gzt) {
                super.a((frd) fqz, gzt);
            }

            public C0040b(HubsGlueImageDelegate hubsGlueImageDelegate) {
                super(hubsGlueImageDelegate);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public final frd b(Context context, ViewGroup viewGroup) {
                fqb.b();
                return frq.b(context, viewGroup);
            }
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            return gwv.super.a(context, viewGroup);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gwv.super.a((frd) fqe, gzt, gum);
        }

        public b(HubsGlueImageDelegate hubsGlueImageDelegate) {
            super(hubsGlueImageDelegate, frd.class, 0);
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public frd b(Context context, ViewGroup viewGroup) {
            fqb.b();
            return frq.a(context, viewGroup);
        }

        /* access modifiers changed from: protected */
        public void a(frd frd, gzt gzt) {
            frd.a(gwz.a(gzt));
        }
    }

    /* renamed from: gwv$c */
    public static class c extends gwv<frh> {
        final boolean a;

        /* renamed from: gwv$c$a */
        public static class a extends c {

            /* renamed from: gwv$c$a$a reason: collision with other inner class name */
            public static final class C0041a extends a {
                /* access modifiers changed from: protected */
                public final /* bridge */ /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
                    return super.a(context, viewGroup);
                }

                /* access modifiers changed from: protected */
                public final /* bridge */ /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, defpackage.gui.b bVar) {
                    super.a((frh) fqe, gzt, gum);
                }

                public C0041a(HubsGlueImageDelegate hubsGlueImageDelegate, boolean z) {
                    super(hubsGlueImageDelegate, false);
                }

                /* access modifiers changed from: protected */
                /* renamed from: c */
                public final frh b(Context context, ViewGroup viewGroup) {
                    fqb.b();
                    return frq.e(context, viewGroup);
                }

                /* access modifiers changed from: protected */
                public final void a(frh frh, gzt gzt) {
                    super.a(frh, gzt);
                    CharSequence a = gwz.a(gzt.text().accessory(), gzt.custom().boolValue("glue:accessoryAsHtml", false));
                    if (!TextUtils.isEmpty(a)) {
                        ((frl) frh).d(a);
                    }
                }
            }

            /* access modifiers changed from: protected */
            public /* bridge */ /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
                return super.a(context, viewGroup);
            }

            /* access modifiers changed from: protected */
            public /* bridge */ /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, defpackage.gui.b bVar) {
                super.a((frh) fqe, gzt, gum);
            }

            /* access modifiers changed from: protected */
            public /* bridge */ /* synthetic */ void a(fqz fqz, gzt gzt) {
                super.a((frh) fqz, gzt);
            }

            public a(HubsGlueImageDelegate hubsGlueImageDelegate, boolean z) {
                super(hubsGlueImageDelegate, z);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public frh b(Context context, ViewGroup viewGroup) {
                fqb.b();
                return frq.b(context, viewGroup, this.a);
            }
        }

        /* renamed from: gwv$c$b */
        public static final class b extends c {
            /* access modifiers changed from: protected */
            public final /* bridge */ /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
                return super.a(context, viewGroup);
            }

            /* access modifiers changed from: protected */
            public final /* bridge */ /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, defpackage.gui.b bVar) {
                super.a((frh) fqe, gzt, gum);
            }

            public b(HubsGlueImageDelegate hubsGlueImageDelegate, boolean z) {
                super(hubsGlueImageDelegate, z);
            }

            /* access modifiers changed from: protected */
            /* renamed from: c */
            public final frh b(Context context, ViewGroup viewGroup) {
                fqb.b();
                return frq.c(context, viewGroup, this.a);
            }

            /* access modifiers changed from: protected */
            public final void a(frh frh, gzt gzt) {
                super.a(frh, gzt);
                ((frn) frh).a(gzt.custom().intValue("row_number", 0));
            }
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
            return gwv.super.a(context, viewGroup);
        }

        /* access modifiers changed from: protected */
        public /* bridge */ /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, defpackage.gui.b bVar) {
            gwv.super.a((frh) fqe, gzt, gum);
        }

        public c(HubsGlueImageDelegate hubsGlueImageDelegate, boolean z) {
            super(hubsGlueImageDelegate, frh.class, 0);
            this.a = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public frh b(Context context, ViewGroup viewGroup) {
            fqb.b();
            return frq.a(context, viewGroup, this.a);
        }

        /* access modifiers changed from: protected */
        public void a(frh frh, gzt gzt) {
            frh.a(gwz.a(gzt));
            CharSequence b2 = gwz.b(gzt);
            if (!TextUtils.isEmpty(b2)) {
                if (gwz.d(gzt)) {
                    frh.c(b2);
                } else {
                    frh.b(b2);
                }
                TextView d = frh.d();
                String string = gzt.custom().string("label");
                Context context = d.getContext();
                if (string == null) {
                    string = "";
                }
                jxb.a(context, d, string);
                return;
            }
            frh.b(null);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t, gzt gzt);

    /* access modifiers changed from: protected */
    public abstract T b(Context context, ViewGroup viewGroup);

    /* synthetic */ gwv(HubsGlueImageDelegate hubsGlueImageDelegate, Class cls, byte b2) {
        this(hubsGlueImageDelegate, cls);
    }

    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ void a(fqe fqe, gzt gzt, gum gum, defpackage.gui.b bVar) {
        a((T) (fqz) fqe, gzt, gum);
    }

    private gwv(HubsGlueImageDelegate hubsGlueImageDelegate, Class<T> cls) {
        super(EnumSet.of(Trait.STACKABLE), cls);
        this.a = (HubsGlueImageDelegate) fay.a(hubsGlueImageDelegate);
        this.b = jrf.a;
    }

    /* access modifiers changed from: protected */
    public final void a(T t, gzt gzt, gum gum) {
        a(t, gzt);
        has.a(t.getView());
        guj.a(gum, t.getView(), gzt);
        String str = "longClick";
        if (gzt.events().containsKey(str)) {
            has.a(gum.c).a(str).a(gzt).a(t.getView()).b();
        }
        if (t instanceof frp) {
            frp frp = (frp) t;
            HubsGlueImageDelegate hubsGlueImageDelegate = this.a;
            jrp jrp = this.b;
            if (gwt.a(gzt)) {
                joj a2 = joj.a(frp.c(), jrp);
                gzq bundle = gzt.custom().bundle("calendar");
                if (bundle != null) {
                    a2.a(bundle.string("month", "APR"), bundle.intValue("day_of_month", 1));
                }
            } else {
                gwt.a(hubsGlueImageDelegate, frp.c(), gzt.images().main(), gzt.images().icon(), HubsGlueImageConfig.THUMBNAIL);
            }
        }
        Object obj = gzt.custom().get("secondary_icon");
        gbg a3 = C0012a.a;
        Class<T> cls = a3.a;
        Enum enumR = cls.isInstance(obj) ? (Enum) cls.cast(obj) : obj instanceof String ? (Enum) a3.a((String) obj).d() : null;
        SpotifyIconV2 spotifyIconV2 = (SpotifyIconV2) enumR;
        String str2 = "rightAccessoryClick";
        if (spotifyIconV2 == null && gzt.events().containsKey(str2)) {
            spotifyIconV2 = SpotifyIconV2.MORE_ANDROID;
        }
        if (spotifyIconV2 != null) {
            View a4 = jwz.a(t.getView().getContext(), spotifyIconV2);
            if (gzt.events().containsKey(str2)) {
                has.a(gum.c).a(str2).a(gzt).a(a4).a();
            }
            t.a(a4);
        } else {
            t.a(null);
        }
        t.c(gww.a(gzt));
    }

    /* access modifiers changed from: protected */
    public final T a(Context context, ViewGroup viewGroup) {
        return b(context, viewGroup);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ fqe a(Context context, ViewGroup viewGroup, gum gum) {
        return b(context, viewGroup);
    }
}
