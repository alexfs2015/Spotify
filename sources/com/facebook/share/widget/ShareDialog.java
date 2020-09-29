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

public final class ShareDialog extends amo<apb, defpackage.aoh.a> implements aoh {
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

    class a extends defpackage.amo.a {
        private a() {
            super();
        }

        /* synthetic */ a(ShareDialog shareDialog, byte b) {
            this();
        }

        public final /* synthetic */ amh a(Object obj) {
            final apb apb = (apb) obj;
            aou.a(apb, aou.a());
            final amh c = ShareDialog.this.c();
            ShareDialog shareDialog = ShareDialog.this;
            amn.a(c, (defpackage.amn.a) new defpackage.amn.a(false) {
                public final Bundle a() {
                    return aor.a(c.a, apb, false);
                }

                public final Bundle b() {
                    return aok.a(c.a, apb, false);
                }
            }, ShareDialog.f(apb.getClass()));
            return c;
        }

        public final Object a() {
            return Mode.NATIVE;
        }

        public final /* synthetic */ boolean a(Object obj, boolean z) {
            apb apb = (apb) obj;
            return (apb instanceof apa) && ShareDialog.d(apb.getClass());
        }
    }

    class b extends defpackage.amo.a {
        private b() {
            super();
        }

        /* synthetic */ b(ShareDialog shareDialog, byte b) {
            this();
        }

        public final /* synthetic */ amh a(Object obj) {
            Bundle bundle;
            apb apb = (apb) obj;
            ShareDialog shareDialog = ShareDialog.this;
            ShareDialog.a(shareDialog, shareDialog.a(), apb, Mode.FEED);
            amh c = ShareDialog.this.c();
            String str = "description";
            String str2 = "name";
            String str3 = "picture";
            String str4 = "link";
            if (apb instanceof apd) {
                apd apd = (apd) apb;
                aou.a((apb) apd);
                bundle = new Bundle();
                ank.a(bundle, str2, apd.b);
                ank.a(bundle, str, apd.a);
                ank.a(bundle, str4, ank.a(apd.h));
                ank.a(bundle, str3, ank.a(apd.c));
                ank.a(bundle, "quote", apd.d);
                if (apd.m != null) {
                    ank.a(bundle, "hashtag", apd.m.a);
                }
            } else {
                aov aov = (aov) apb;
                bundle = new Bundle();
                ank.a(bundle, "to", aov.a);
                ank.a(bundle, str4, aov.b);
                ank.a(bundle, str3, aov.f);
                ank.a(bundle, "source", aov.g);
                ank.a(bundle, str2, aov.c);
                ank.a(bundle, "caption", aov.d);
                ank.a(bundle, str, aov.e);
            }
            amn.a(c, "feed", bundle);
            return c;
        }

        public final Object a() {
            return Mode.FEED;
        }

        public final /* bridge */ /* synthetic */ boolean a(Object obj, boolean z) {
            apb apb = (apb) obj;
            return (apb instanceof apd) || (apb instanceof aov);
        }
    }

    class c extends defpackage.amo.a {
        private c() {
            super();
        }

        /* synthetic */ c(ShareDialog shareDialog, byte b) {
            this();
        }

        public final /* synthetic */ amh a(Object obj) {
            final apb apb = (apb) obj;
            ShareDialog shareDialog = ShareDialog.this;
            ShareDialog.a(shareDialog, shareDialog.a(), apb, Mode.NATIVE);
            aou.a(apb, aou.a());
            final amh c = ShareDialog.this.c();
            ShareDialog shareDialog2 = ShareDialog.this;
            amn.a(c, (defpackage.amn.a) new defpackage.amn.a(false) {
                public final Bundle a() {
                    return aor.a(c.a, apb, false);
                }

                public final Bundle b() {
                    return aok.a(c.a, apb, false);
                }
            }, ShareDialog.f(apb.getClass()));
            return c;
        }

        public final Object a() {
            return Mode.NATIVE;
        }

        public final /* synthetic */ boolean a(Object obj, boolean z) {
            apb apb = (apb) obj;
            return apb != null && !(apb instanceof apa) && !(apb instanceof app) && ShareDialog.d(apb.getClass());
        }
    }

    class d extends defpackage.amo.a {
        private d() {
            super();
        }

        /* synthetic */ d(ShareDialog shareDialog, byte b) {
            this();
        }

        public final /* synthetic */ amh a(Object obj) {
            final apb apb = (apb) obj;
            if (aou.a == null) {
                aou.a = new defpackage.aou.a(0);
            }
            aou.a(apb, aou.a);
            final amh c = ShareDialog.this.c();
            ShareDialog shareDialog = ShareDialog.this;
            amn.a(c, (defpackage.amn.a) new defpackage.amn.a(false) {
                public final Bundle a() {
                    return aor.a(c.a, apb, false);
                }

                public final Bundle b() {
                    return aok.a(c.a, apb, false);
                }
            }, ShareDialog.f(apb.getClass()));
            return c;
        }

        public final Object a() {
            return Mode.NATIVE;
        }

        public final /* synthetic */ boolean a(Object obj, boolean z) {
            apb apb = (apb) obj;
            return (apb instanceof app) && ShareDialog.d(apb.getClass());
        }
    }

    class e extends defpackage.amo.a {
        private e() {
            super();
        }

        /* synthetic */ e(ShareDialog shareDialog, byte b) {
            this();
        }

        public final /* synthetic */ amh a(Object obj) {
            Bundle bundle;
            apb apb = (apb) obj;
            ShareDialog shareDialog = ShareDialog.this;
            ShareDialog.a(shareDialog, shareDialog.a(), apb, Mode.WEB);
            amh c = ShareDialog.this.c();
            aou.a(apb);
            boolean z = apb instanceof apd;
            String str = null;
            if (z) {
                bundle = aox.a((apd) apb);
            } else if (apb instanceof apo) {
                apo apo = (apo) apb;
                UUID uuid = c.a;
                defpackage.apo.a a2 = new defpackage.apo.a().a(apo);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < apo.a.size(); i++) {
                    apn apn = (apn) apo.a.get(i);
                    Bitmap bitmap = apn.b;
                    if (bitmap != null) {
                        defpackage.ane.a a3 = ane.a(uuid, bitmap);
                        defpackage.apn.a a4 = new defpackage.apn.a().a(apn);
                        a4.c = Uri.parse(a3.b);
                        a4.b = null;
                        apn = a4.a();
                        arrayList2.add(a3);
                    }
                    arrayList.add(apn);
                }
                a2.a((List<apn>) arrayList);
                ane.a((Collection<defpackage.ane.a>) arrayList2);
                apo apo2 = new apo(a2, 0);
                Bundle a5 = aox.a((apb) apo2);
                String[] strArr = new String[apo2.a.size()];
                ank.a(apo2.a, (defpackage.ank.b<T, K>) new defpackage.ank.b<apn, String>() {
                    public final /* synthetic */ Object a(Object obj) {
                        return ((apn) obj).c.toString();
                    }
                }).toArray(strArr);
                a5.putStringArray("media", strArr);
                bundle = a5;
            } else {
                bundle = aox.a((apk) apb);
            }
            if (z || (apb instanceof apo)) {
                str = "share";
            } else if (apb instanceof apk) {
                str = "share_open_graph";
            }
            amn.a(c, str, bundle);
            return c;
        }

        public final Object a() {
            return Mode.WEB;
        }

        public final /* bridge */ /* synthetic */ boolean a(Object obj, boolean z) {
            apb apb = (apb) obj;
            return apb != null && ShareDialog.b(apb);
        }
    }

    public ShareDialog(Activity activity) {
        super(activity, f);
        aow.a(f);
    }

    ShareDialog(Activity activity, int i) {
        super(activity, i);
        aow.a(i);
    }

    static /* synthetic */ void a(ShareDialog shareDialog, Context context, apb apb, Mode mode) {
        if (shareDialog.h) {
            mode = Mode.AUTOMATIC;
        }
        int i = AnonymousClass1.a[mode.ordinal()];
        String str = "unknown";
        String str2 = i != 1 ? i != 2 ? i != 3 ? str : "native" : "web" : "automatic";
        amm f2 = f(apb.getClass());
        if (f2 == ShareDialogFeature.SHARE_DIALOG) {
            str = "status";
        } else if (f2 == ShareDialogFeature.PHOTOS) {
            str = "photo";
        } else if (f2 == ShareDialogFeature.VIDEO) {
            str = "video";
        } else if (f2 == OpenGraphActionDialogFeature.OG_ACTION_DIALOG) {
            str = "open_graph";
        }
        alk alk = new alk(context);
        Bundle bundle = new Bundle();
        String str3 = "fb_share_dialog_show";
        bundle.putString(str3, str2);
        bundle.putString("fb_share_dialog_content_type", str);
        alk.b(str3, bundle);
    }

    public static boolean a(Class<? extends apb> cls) {
        return e(cls) || d(cls);
    }

    /* access modifiers changed from: private */
    public static boolean b(apb apb) {
        if (!e(apb.getClass())) {
            return false;
        }
        if (apb instanceof apk) {
            try {
                aow.a((apk) apb);
            } catch (Exception e2) {
                ank.a(e, "canShow returned false because the content of the Opem Graph object can't be shared via the web dialog", (Throwable) e2);
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public static boolean d(Class<? extends apb> cls) {
        amm f2 = f(cls);
        return f2 != null && amn.a(f2);
    }

    private static boolean e(Class<? extends apb> cls) {
        return apd.class.isAssignableFrom(cls) || apk.class.isAssignableFrom(cls) || (apo.class.isAssignableFrom(cls) && aki.b());
    }

    /* access modifiers changed from: private */
    public static amm f(Class<? extends apb> cls) {
        if (apd.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.SHARE_DIALOG;
        }
        if (apo.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.PHOTOS;
        }
        if (apr.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.VIDEO;
        }
        if (apk.class.isAssignableFrom(cls)) {
            return OpenGraphActionDialogFeature.OG_ACTION_DIALOG;
        }
        if (ape.class.isAssignableFrom(cls)) {
            return ShareDialogFeature.MULTIMEDIA;
        }
        if (apa.class.isAssignableFrom(cls)) {
            return CameraEffectFeature.SHARE_CAMERA_EFFECT;
        }
        if (app.class.isAssignableFrom(cls)) {
            return ShareStoryFeature.SHARE_STORY_ASSET;
        }
        return null;
    }

    public final List<defpackage.amo.a> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new c(this, 0));
        arrayList.add(new b(this, 0));
        arrayList.add(new e(this, 0));
        arrayList.add(new a(this, 0));
        arrayList.add(new d(this, 0));
        return arrayList;
    }

    public final amh c() {
        return new amh(this.d);
    }
}
