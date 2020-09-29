package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.FacebookException;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import com.facebook.share.model.ShareMessengerURLActionButton;
import java.util.List;
import java.util.Locale;

/* renamed from: aou reason: default package */
public final class aou {
    public static b a;
    private static b b;
    private static b c;

    /* renamed from: aou$a */
    public static class a extends b {
        private a() {
            super(0);
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public final void a(app app) {
            aou.a(app, (b) this);
        }
    }

    /* renamed from: aou$b */
    static class b {
        boolean a;

        private b() {
            this.a = false;
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public void a(ape ape) {
            List<ShareMedia> list = ape.a;
            if (list == null || list.isEmpty()) {
                throw new FacebookException("Must specify at least one medium in ShareMediaContent.");
            } else if (list.size() <= 6) {
                for (ShareMedia a2 : list) {
                    aou.a(a2, this);
                }
            } else {
                throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d media.", new Object[]{Integer.valueOf(6)}));
            }
        }

        public final void a(apk apk) {
            this.a = true;
            aou.a(apk, this);
        }

        public void a(apn apn) {
            aou.a(apn);
            Bitmap bitmap = apn.b;
            Uri uri = apn.c;
            if (bitmap == null && ank.b(uri) && !this.a) {
                throw new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
            } else if (apn.b != null || !ank.b(apn.c)) {
                anl.d(akq.g());
            }
        }

        public void a(app app) {
            aou.a(app, this);
        }

        public void a(apr apr) {
            aou.a(apr.d, this);
            apn apn = apr.c;
            if (apn != null) {
                a(apn);
            }
        }
    }

    /* renamed from: aou$c */
    static class c extends b {
        private c() {
            super(0);
        }

        /* synthetic */ c(byte b) {
            this();
        }

        public final void a(ape ape) {
            throw new FacebookException("Cannot share ShareMediaContent via web sharing dialogs");
        }

        public final void a(apn apn) {
            aou.a(apn);
        }

        public final void a(apr apr) {
            throw new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
        }
    }

    public static b a() {
        if (c == null) {
            c = new b(0);
        }
        return c;
    }

    static /* synthetic */ void a(apa apa, b bVar) {
        if (ank.a(apa.a)) {
            throw new FacebookException("Must specify a non-empty effectId");
        }
    }

    public static void a(apb apb) {
        if (b == null) {
            b = new c(0);
        }
        a(apb, b);
    }

    public static void a(apb apb, b bVar) {
        if (apb == null) {
            throw new FacebookException("Must provide non-null content to share");
        } else if (apb instanceof apd) {
            a((apd) apb, bVar);
        } else if (apb instanceof apo) {
            a((apo) apb, bVar);
        } else if (apb instanceof apr) {
            bVar.a((apr) apb);
        } else if (apb instanceof apk) {
            bVar.a((apk) apb);
        } else if (apb instanceof ape) {
            bVar.a((ape) apb);
        } else if (apb instanceof apa) {
            a((apa) apb, bVar);
        } else if (apb instanceof aph) {
            a((aph) apb);
        } else if (apb instanceof ShareMessengerMediaTemplateContent) {
            a((ShareMessengerMediaTemplateContent) apb);
        } else if (apb instanceof ShareMessengerGenericTemplateContent) {
            a((ShareMessengerGenericTemplateContent) apb);
        } else {
            if (apb instanceof app) {
                bVar.a((app) apb);
            }
        }
    }

    static /* synthetic */ void a(apd apd, b bVar) {
        Uri uri = apd.c;
        if (uri != null && !ank.b(uri)) {
            throw new FacebookException("Image Url must be an http:// or https:// url");
        }
    }

    private static void a(apf apf) {
        if (apf != null) {
            if (!ank.a(apf.a)) {
                if (apf instanceof ShareMessengerURLActionButton) {
                    a((ShareMessengerURLActionButton) apf);
                }
                return;
            }
            throw new FacebookException("Must specify title for ShareMessengerActionButton");
        }
    }

    static /* synthetic */ void a(aph aph) {
        if (ank.a(aph.k)) {
            throw new FacebookException("Must specify Page Id for ShareMessengerOpenGraphMusicTemplateContent");
        } else if (aph.a != null) {
            a(aph.b);
        } else {
            throw new FacebookException("Must specify url for ShareMessengerOpenGraphMusicTemplateContent");
        }
    }

    static /* synthetic */ void a(apk apk, b bVar) {
        apj apj = apk.a;
        if (apj == null) {
            throw new FacebookException("Must specify a non-null ShareOpenGraphAction");
        } else if (!ank.a(apj.b("og:type"))) {
            a(apj, bVar, false);
            String str = apk.b;
            if (ank.a(str)) {
                throw new FacebookException("Must specify a previewPropertyName.");
            } else if (apk.a.a(str) == null) {
                StringBuilder sb = new StringBuilder("Property \"");
                sb.append(str);
                sb.append("\" was not found on the action. The name of the preview property must match the name of an action property.");
                throw new FacebookException(sb.toString());
            }
        } else {
            throw new FacebookException("ShareOpenGraphAction must have a non-empty actionType");
        }
    }

    static /* synthetic */ void a(apl apl, b bVar) {
        if (apl != null) {
            a(apl, bVar, true);
            return;
        }
        throw new FacebookException("Cannot share a null ShareOpenGraphObject");
    }

    static /* synthetic */ void a(apm apm, b bVar, boolean z) {
        for (String str : apm.a.keySet()) {
            if (z) {
                String[] split = str.split(":");
                if (split.length >= 2) {
                    int length = split.length;
                    int i = 0;
                    while (i < length) {
                        if (!split[i].isEmpty()) {
                            i++;
                        } else {
                            throw new FacebookException("Invalid key found in Open Graph dictionary: %s", str);
                        }
                    }
                } else {
                    throw new FacebookException("Open Graph keys must be namespaced: %s", str);
                }
            }
            Object a2 = apm.a(str);
            if (a2 instanceof List) {
                for (Object next : (List) a2) {
                    if (next != null) {
                        a(next, bVar);
                    } else {
                        throw new FacebookException("Cannot put null objects in Lists in ShareOpenGraphObjects and ShareOpenGraphActions");
                    }
                }
                continue;
            } else {
                a(a2, bVar);
            }
        }
    }

    static void a(apn apn) {
        if (apn != null) {
            Bitmap bitmap = apn.b;
            Uri uri = apn.c;
            if (bitmap == null && uri == null) {
                throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
            }
            return;
        }
        throw new FacebookException("Cannot share a null SharePhoto");
    }

    static /* synthetic */ void a(apo apo, b bVar) {
        List<apn> list = apo.a;
        if (list == null || list.isEmpty()) {
            throw new FacebookException("Must specify at least one Photo in SharePhotoContent.");
        } else if (list.size() <= 6) {
            for (apn a2 : list) {
                bVar.a(a2);
            }
        } else {
            throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d photos.", new Object[]{Integer.valueOf(6)}));
        }
    }

    static /* synthetic */ void a(app app, b bVar) {
        if (app == null || (app.a == null && app.b == null)) {
            throw new FacebookException("Must pass the Facebook app a background asset, a sticker asset, or both");
        }
        if (app.a != null) {
            a(app.a, bVar);
        }
        if (app.b != null) {
            bVar.a(app.b);
        }
    }

    static /* synthetic */ void a(apq apq, b bVar) {
        if (apq != null) {
            Uri uri = apq.b;
            if (uri == null) {
                throw new FacebookException("ShareVideo does not have a LocalUrl specified");
            } else if (!ank.c(uri) && !ank.d(uri)) {
                throw new FacebookException("ShareVideo must reference a video that is on the device");
            }
        } else {
            throw new FacebookException("Cannot share a null ShareVideo");
        }
    }

    public static void a(ShareMedia shareMedia, b bVar) {
        if (shareMedia instanceof apn) {
            bVar.a((apn) shareMedia);
        } else if (shareMedia instanceof apq) {
            a((apq) shareMedia, bVar);
        } else {
            throw new FacebookException(String.format(Locale.ROOT, "Invalid media type: %s", new Object[]{shareMedia.getClass().getSimpleName()}));
        }
    }

    static /* synthetic */ void a(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) {
        if (ank.a(shareMessengerGenericTemplateContent.k)) {
            throw new FacebookException("Must specify Page Id for ShareMessengerGenericTemplateContent");
        } else if (shareMessengerGenericTemplateContent.c == null) {
            throw new FacebookException("Must specify element for ShareMessengerGenericTemplateContent");
        } else if (!ank.a(shareMessengerGenericTemplateContent.c.a)) {
            a(shareMessengerGenericTemplateContent.c.e);
        } else {
            throw new FacebookException("Must specify title for ShareMessengerGenericTemplateElement");
        }
    }

    static /* synthetic */ void a(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
        if (ank.a(shareMessengerMediaTemplateContent.k)) {
            throw new FacebookException("Must specify Page Id for ShareMessengerMediaTemplateContent");
        } else if (shareMessengerMediaTemplateContent.c != null || !ank.a(shareMessengerMediaTemplateContent.b)) {
            a(shareMessengerMediaTemplateContent.d);
        } else {
            throw new FacebookException("Must specify either attachmentId or mediaURL for ShareMessengerMediaTemplateContent");
        }
    }

    private static void a(ShareMessengerURLActionButton shareMessengerURLActionButton) {
        if (shareMessengerURLActionButton.b == null) {
            throw new FacebookException("Must specify url for ShareMessengerURLActionButton");
        }
    }

    private static void a(Object obj, b bVar) {
        if (obj instanceof apl) {
            a((apl) obj, bVar);
            return;
        }
        if (obj instanceof apn) {
            bVar.a((apn) obj);
        }
    }
}
