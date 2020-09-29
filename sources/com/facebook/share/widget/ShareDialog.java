package com.facebook.share.widget;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.share.internal.CameraEffectFeature;
import com.facebook.share.internal.OpenGraphActionDialogFeature;
import com.facebook.share.internal.ShareDialogFeature;
import com.facebook.share.internal.ShareStoryFeature;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

public final class ShareDialog extends ama<aon, defpackage.ant.a> implements ant {
    private static final String e = ShareDialog.class.getSimpleName();
    private static final int f = RequestCodeOffset.Share.a();
    private boolean g = false;
    private boolean h = true;

    /* renamed from: com.facebook.share.widget.ShareDialog$1 reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[Mode.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.facebook.share.widget.ShareDialog$Mode[] r0 = com.facebook.share.widget.ShareDialog.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.facebook.share.widget.ShareDialog$Mode r1 = com.facebook.share.widget.ShareDialog.Mode.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001f }
                com.facebook.share.widget.ShareDialog$Mode r1 = com.facebook.share.widget.ShareDialog.Mode.WEB     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x002a }
                com.facebook.share.widget.ShareDialog$Mode r1 = com.facebook.share.widget.ShareDialog.Mode.NATIVE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.widget.ShareDialog.AnonymousClass1.<clinit>():void");
        }
    }

    public enum Mode {
        AUTOMATIC,
        NATIVE,
        WEB,
        FEED
    }

    class a extends defpackage.ama.a {
        private a() {
            super();
        }

        /* synthetic */ a(ShareDialog shareDialog, byte b) {
            this();
        }

        public final /* synthetic */ alt a(Object obj) {
            final aon aon = (aon) obj;
            aog.a(aon, aog.a());
            final alt c = ShareDialog.this.c();
            ShareDialog shareDialog = ShareDialog.this;
            alz.a(c, (defpackage.alz.a) new defpackage.alz.a(false) {
                public final Bundle a() {
                    return aod.a(c.a, aon, false);
                }

                public final Bundle b() {
                    return anw.a(c.a, aon, false);
                }
            }, ShareDialog.f(aon.getClass()));
            return c;
        }

        public final /* synthetic */ boolean a(Object obj, boolean z) {
            aon aon = (aon) obj;
            return (aon instanceof aom) && ShareDialog.d(aon.getClass());
        }

        public final Object a() {
            return Mode.NATIVE;
        }
    }

    class b extends defpackage.ama.a {
        private b() {
            super();
        }

        /* synthetic */ b(ShareDialog shareDialog, byte b) {
            this();
        }

        public final /* synthetic */ alt a(Object obj) {
            Bundle bundle;
            aon aon = (aon) obj;
            ShareDialog shareDialog = ShareDialog.this;
            ShareDialog.a(shareDialog, shareDialog.a(), aon, Mode.FEED);
            alt c = ShareDialog.this.c();
            String str = "description";
            String str2 = "name";
            String str3 = "picture";
            String str4 = "link";
            if (aon instanceof aop) {
                aop aop = (aop) aon;
                aog.a((aon) aop);
                bundle = new Bundle();
                amw.a(bundle, str2, aop.b);
                amw.a(bundle, str, aop.a);
                amw.a(bundle, str4, amw.a(aop.h));
                amw.a(bundle, str3, amw.a(aop.c));
                amw.a(bundle, "quote", aop.d);
                if (aop.m != null) {
                    amw.a(bundle, "hashtag", aop.m.a);
                }
            } else {
                aoh aoh = (aoh) aon;
                bundle = new Bundle();
                amw.a(bundle, "to", aoh.a);
                amw.a(bundle, str4, aoh.b);
                amw.a(bundle, str3, aoh.f);
                amw.a(bundle, "source", aoh.g);
                amw.a(bundle, str2, aoh.c);
                amw.a(bundle, "caption", aoh.d);
                amw.a(bundle, str, aoh.e);
            }
            alz.a(c, "feed", bundle);
            return c;
        }

        public final /* bridge */ /* synthetic */ boolean a(Object obj, boolean z) {
            aon aon = (aon) obj;
            return (aon instanceof aop) || (aon instanceof aoh);
        }

        public final Object a() {
            return Mode.FEED;
        }
    }

    class c extends defpackage.ama.a {
        private c() {
            super();
        }

        /* synthetic */ c(ShareDialog shareDialog, byte b) {
            this();
        }

        public final /* synthetic */ alt a(Object obj) {
            final aon aon = (aon) obj;
            ShareDialog shareDialog = ShareDialog.this;
            ShareDialog.a(shareDialog, shareDialog.a(), aon, Mode.NATIVE);
            aog.a(aon, aog.a());
            final alt c = ShareDialog.this.c();
            ShareDialog shareDialog2 = ShareDialog.this;
            alz.a(c, (defpackage.alz.a) new defpackage.alz.a(false) {
                public final Bundle a() {
                    return aod.a(c.a, aon, false);
                }

                public final Bundle b() {
                    return anw.a(c.a, aon, false);
                }
            }, ShareDialog.f(aon.getClass()));
            return c;
        }

        public final /* synthetic */ boolean a(Object obj, boolean z) {
            aon aon = (aon) obj;
            if (aon == null || (aon instanceof aom) || (aon instanceof apb) || !ShareDialog.d(aon.getClass())) {
                return false;
            }
            return true;
        }

        public final Object a() {
            return Mode.NATIVE;
        }
    }

    class d extends defpackage.ama.a {
        private d() {
            super();
        }

        /* synthetic */ d(ShareDialog shareDialog, byte b) {
            this();
        }

        public final /* synthetic */ alt a(Object obj) {
            final aon aon = (aon) obj;
            if (aog.a == null) {
                aog.a = new defpackage.aog.a(0);
            }
            aog.a(aon, aog.a);
            final alt c = ShareDialog.this.c();
            ShareDialog shareDialog = ShareDialog.this;
            alz.a(c, (defpackage.alz.a) new defpackage.alz.a(false) {
                public final Bundle a() {
                    return aod.a(c.a, aon, false);
                }

                public final Bundle b() {
                    return anw.a(c.a, aon, false);
                }
            }, ShareDialog.f(aon.getClass()));
            return c;
        }

        public final /* synthetic */ boolean a(Object obj, boolean z) {
            aon aon = (aon) obj;
            return (aon instanceof apb) && ShareDialog.d(aon.getClass());
        }

        public final Object a() {
            return Mode.NATIVE;
        }
    }

    class e extends defpackage.ama.a {
        private e() {
            super();
        }

        /* synthetic */ e(ShareDialog shareDialog, byte b) {
            this();
        }

        public final /* synthetic */ alt a(Object obj) {
            Bundle bundle;
            aon aon = (aon) obj;
            ShareDialog shareDialog = ShareDialog.this;
            ShareDialog.a(shareDialog, shareDialog.a(), aon, Mode.WEB);
            alt c = ShareDialog.this.c();
            aog.a(aon);
            boolean z = aon instanceof aop;
            String str = null;
            if (z) {
                bundle = aoj.a((aop) aon);
            } else if (aon instanceof apa) {
                apa apa = (apa) aon;
                UUID uuid = c.a;
                defpackage.apa.a a2 = new defpackage.apa.a().a(apa);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < apa.a.size(); i++) {
                    aoz aoz = (aoz) apa.a.get(i);
                    Bitmap bitmap = aoz.b;
                    if (bitmap != null) {
                        defpackage.amq.a a3 = amq.a(uuid, bitmap);
                        defpackage.aoz.a a4 = new defpackage.aoz.a().a(aoz);
                        a4.c = Uri.parse(a3.b);
                        a4.b = null;
                        aoz = a4.a();
                        arrayList2.add(a3);
                    }
                    arrayList.add(aoz);
                }
                a2.a((List<aoz>) arrayList);
                amq.a((Collection<defpackage.amq.a>) arrayList2);
                apa apa2 = new apa(a2, 0);
                Bundle a5 = aoj.a((aon) apa2);
                String[] strArr = new String[apa2.a.size()];
                amw.a(apa2.a, (defpackage.amw.b<T, K>) new defpackage.amw.b<aoz, String>() {
                    public final /* synthetic */ Object a(Object obj) {
                        return ((aoz) obj).c.toString();
                    }
                }).toArray(strArr);
                a5.putStringArray("media", strArr);
                bundle = a5;
            } else {
                bundle = aoj.a((aow) aon);
            }
            if (z || (aon instanceof apa)) {
                str = "share";
            } else if (aon instanceof aow) {
                str = "share_open_graph";
            }
            alz.a(c, str, bundle);
            return c;
        }

        public final /* bridge */ /* synthetic */ boolean a(Object obj, boolean z) {
            aon aon = (aon) obj;
            return aon != null && ShareDialog.b(aon);
        }

        public final Object a() {
            return Mode.WEB;
        }
    }

    public static boolean a(Class<? extends aon> cls) {
        return e(cls) || d(cls);
    }

    /* access modifiers changed from: private */
    public static boolean d(Class<? extends aon> cls) {
        aly f2 = f(cls);
        return f2 != null && alz.a(f2);
    }

    private static boolean e(Class<? extends aon> cls) {
        return aop.class.isAssignableFrom(cls) || aow.class.isAssignableFrom(cls) || (apa.class.isAssignableFrom(cls) && aju.b());
    }

    /* access modifiers changed from: private */
    public static boolean b(aon aon) {
        if (!e(aon.getClass())) {
            return false;
        }
        if (aon instanceof aow) {
            try {
                aoi.a((aow) aon);
            } catch (Exception e2) {
                amw.a(e, "canShow returned false because the content of the Opem Graph object can't be shared via the web dialog", (Throwable) e2);
                return false;
            }
        }
        return true;
    }

    public ShareDialog(Activity activity) {
        super(activity, f);
        aoi.a(f);
    }

    ShareDialog(Activity activity, int i) {
        super(activity, i);
        aoi.a(i);
    }

    public final alt c() {
        return new alt(this.d);
    }

    public final List<defpackage.ama.a> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c(this, 0));
        arrayList.add(new b(this, 0));
        arrayList.add(new e(this, 0));
        arrayList.add(new a(this, 0));
        arrayList.add(new d(this, 0));
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static aly f(Class<? extends aon> cls) {
        if (aop.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.SHARE_DIALOG;
        }
        if (apa.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.PHOTOS;
        }
        if (apd.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.VIDEO;
        }
        if (aow.class.isAssignableFrom(cls)) {
            return OpenGraphActionDialogFeature.OG_ACTION_DIALOG;
        }
        if (aoq.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.MULTIMEDIA;
        }
        if (aom.class.isAssignableFrom(cls)) {
            return CameraEffectFeature.SHARE_CAMERA_EFFECT;
        }
        if (apb.class.isAssignableFrom(cls)) {
            return ShareStoryFeature.SHARE_STORY_ASSET;
        }
        return null;
    }

    static /* synthetic */ void a(ShareDialog shareDialog, Context context, aon aon, Mode mode) {
        if (shareDialog.h) {
            mode = Mode.AUTOMATIC;
        }
        int i = AnonymousClass1.a[mode.ordinal()];
        String str = "unknown";
        String str2 = i != 1 ? i != 2 ? i != 3 ? str : "native" : "web" : "automatic";
        aly f2 = f(aon.getClass());
        if (f2 == ShareDialogFeature.SHARE_DIALOG) {
            str = "status";
        } else if (f2 == ShareDialogFeature.PHOTOS) {
            str = "photo";
        } else if (f2 == ShareDialogFeature.VIDEO) {
            str = "video";
        } else if (f2 == OpenGraphActionDialogFeature.OG_ACTION_DIALOG) {
            str = "open_graph";
        }
        akw akw = new akw(context);
        Bundle bundle = new Bundle();
        String str3 = "fb_share_dialog_show";
        bundle.putString(str3, str2);
        bundle.putString("fb_share_dialog_content_type", str);
        akw.b(str3, bundle);
    }
}
