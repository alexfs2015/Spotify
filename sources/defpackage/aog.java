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

/* renamed from: aog reason: default package */
public final class aog {
    public static b a;
    private static b b;
    private static b c;

    /* renamed from: aog$a */
    public static class a extends b {
        private a() {
            super(0);
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public final void a(apb apb) {
            aog.a(apb, (b) this);
        }
    }

    /* renamed from: aog$b */
    static class b {
        boolean a;

        private b() {
            this.a = false;
        }

        /* synthetic */ b(byte b) {
            this();
        }

        public final void a(aow aow) {
            this.a = true;
            aog.a(aow, this);
        }

        public void a(apb apb) {
            aog.a(apb, this);
        }

        public void a(apd apd) {
            aog.a(apd.d, this);
            aoz aoz = apd.c;
            if (aoz != null) {
                a(aoz);
            }
        }

        public void a(aoq aoq) {
            List<ShareMedia> list = aoq.a;
            if (list == null || list.isEmpty()) {
                throw new FacebookException("Must specify at least one medium in ShareMediaContent.");
            } else if (list.size() <= 6) {
                for (ShareMedia a2 : list) {
                    aog.a(a2, this);
                }
            } else {
                throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d media.", new Object[]{Integer.valueOf(6)}));
            }
        }

        public void a(aoz aoz) {
            aog.a(aoz);
            Bitmap bitmap = aoz.b;
            Uri uri = aoz.c;
            if (bitmap == null && amw.b(uri) && !this.a) {
                throw new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
            } else if (aoz.b != null || !amw.b(aoz.c)) {
                amx.d(akc.g());
            }
        }
    }

    /* renamed from: aog$c */
    static class c extends b {
        private c() {
            super(0);
        }

        /* synthetic */ c(byte b) {
            this();
        }

        public final void a(apd apd) {
            throw new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
        }

        public final void a(aoq aoq) {
            throw new FacebookException("Cannot share ShareMediaContent via web sharing dialogs");
        }

        public final void a(aoz aoz) {
            aog.a(aoz);
        }
    }

    public static b a() {
        if (c == null) {
            c = new b(0);
        }
        return c;
    }

    public static void a(aon aon, b bVar) {
        if (aon == null) {
            throw new FacebookException("Must provide non-null content to share");
        } else if (aon instanceof aop) {
            a((aop) aon, bVar);
        } else if (aon instanceof apa) {
            a((apa) aon, bVar);
        } else if (aon instanceof apd) {
            bVar.a((apd) aon);
        } else if (aon instanceof aow) {
            bVar.a((aow) aon);
        } else if (aon instanceof aoq) {
            bVar.a((aoq) aon);
        } else if (aon instanceof aom) {
            a((aom) aon, bVar);
        } else if (aon instanceof aot) {
            a((aot) aon);
        } else if (aon instanceof ShareMessengerMediaTemplateContent) {
            a((ShareMessengerMediaTemplateContent) aon);
        } else if (aon instanceof ShareMessengerGenericTemplateContent) {
            a((ShareMessengerGenericTemplateContent) aon);
        } else {
            if (aon instanceof apb) {
                bVar.a((apb) aon);
            }
        }
    }

    public static void a(ShareMedia shareMedia, b bVar) {
        if (shareMedia instanceof aoz) {
            bVar.a((aoz) shareMedia);
        } else if (shareMedia instanceof apc) {
            a((apc) shareMedia, bVar);
        } else {
            throw new FacebookException(String.format(Locale.ROOT, "Invalid media type: %s", new Object[]{shareMedia.getClass().getSimpleName()}));
        }
    }

    private static void a(Object obj, b bVar) {
        if (obj instanceof aox) {
            a((aox) obj, bVar);
            return;
        }
        if (obj instanceof aoz) {
            bVar.a((aoz) obj);
        }
    }

    public static void a(aon aon) {
        if (b == null) {
            b = new c(0);
        }
        a(aon, b);
    }

    static void a(aoz aoz) {
        if (aoz != null) {
            Bitmap bitmap = aoz.b;
            Uri uri = aoz.c;
            if (bitmap == null && uri == null) {
                throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
            }
            return;
        }
        throw new FacebookException("Cannot share a null SharePhoto");
    }

    private static void a(aor aor) {
        if (aor != null) {
            if (!amw.a(aor.a)) {
                if (aor instanceof ShareMessengerURLActionButton) {
                    a((ShareMessengerURLActionButton) aor);
                }
                return;
            }
            throw new FacebookException("Must specify title for ShareMessengerActionButton");
        }
    }

    private static void a(ShareMessengerURLActionButton shareMessengerURLActionButton) {
        if (shareMessengerURLActionButton.b == null) {
            throw new FacebookException("Must specify url for ShareMessengerURLActionButton");
        }
    }

    static /* synthetic */ void a(apb apb, b bVar) {
        if (apb == null || (apb.a == null && apb.b == null)) {
            throw new FacebookException("Must pass the Facebook app a background asset, a sticker asset, or both");
        }
        if (apb.a != null) {
            a(apb.a, bVar);
        }
        if (apb.b != null) {
            bVar.a(apb.b);
        }
    }

    static /* synthetic */ void a(aop aop, b bVar) {
        Uri uri = aop.c;
        if (uri != null && !amw.b(uri)) {
            throw new FacebookException("Image Url must be an http:// or https:// url");
        }
    }

    static /* synthetic */ void a(apa apa, b bVar) {
        List<aoz> list = apa.a;
        if (list == null || list.isEmpty()) {
            throw new FacebookException("Must specify at least one Photo in SharePhotoContent.");
        } else if (list.size() <= 6) {
            for (aoz a2 : list) {
                bVar.a(a2);
            }
        } else {
            throw new FacebookException(String.format(Locale.ROOT, "Cannot add more than %d photos.", new Object[]{Integer.valueOf(6)}));
        }
    }

    static /* synthetic */ void a(aom aom, b bVar) {
        if (amw.a(aom.a)) {
            throw new FacebookException("Must specify a non-empty effectId");
        }
    }

    static /* synthetic */ void a(aow aow, b bVar) {
        aov aov = aow.a;
        if (aov == null) {
            throw new FacebookException("Must specify a non-null ShareOpenGraphAction");
        } else if (!amw.a(aov.b("og:type"))) {
            a(aov, bVar, false);
            String str = aow.b;
            if (amw.a(str)) {
                throw new FacebookException("Must specify a previewPropertyName.");
            } else if (aow.a.a(str) == null) {
                StringBuilder sb = new StringBuilder("Property \"");
                sb.append(str);
                sb.append("\" was not found on the action. The name of the preview property must match the name of an action property.");
                throw new FacebookException(sb.toString());
            }
        } else {
            throw new FacebookException("ShareOpenGraphAction must have a non-empty actionType");
        }
    }

    static /* synthetic */ void a(aox aox, b bVar) {
        if (aox != null) {
            a(aox, bVar, true);
            return;
        }
        throw new FacebookException("Cannot share a null ShareOpenGraphObject");
    }

    static /* synthetic */ void a(aoy aoy, b bVar, boolean z) {
        for (String str : aoy.a.keySet()) {
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
            Object a2 = aoy.a(str);
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

    static /* synthetic */ void a(apc apc, b bVar) {
        if (apc != null) {
            Uri uri = apc.b;
            if (uri == null) {
                throw new FacebookException("ShareVideo does not have a LocalUrl specified");
            } else if (!amw.c(uri) && !amw.d(uri)) {
                throw new FacebookException("ShareVideo must reference a video that is on the device");
            }
        } else {
            throw new FacebookException("Cannot share a null ShareVideo");
        }
    }

    static /* synthetic */ void a(aot aot) {
        if (amw.a(aot.k)) {
            throw new FacebookException("Must specify Page Id for ShareMessengerOpenGraphMusicTemplateContent");
        } else if (aot.a != null) {
            a(aot.b);
        } else {
            throw new FacebookException("Must specify url for ShareMessengerOpenGraphMusicTemplateContent");
        }
    }

    static /* synthetic */ void a(ShareMessengerGenericTemplateContent shareMessengerGenericTemplateContent) {
        if (amw.a(shareMessengerGenericTemplateContent.k)) {
            throw new FacebookException("Must specify Page Id for ShareMessengerGenericTemplateContent");
        } else if (shareMessengerGenericTemplateContent.c == null) {
            throw new FacebookException("Must specify element for ShareMessengerGenericTemplateContent");
        } else if (!amw.a(shareMessengerGenericTemplateContent.c.a)) {
            a(shareMessengerGenericTemplateContent.c.e);
        } else {
            throw new FacebookException("Must specify title for ShareMessengerGenericTemplateElement");
        }
    }

    static /* synthetic */ void a(ShareMessengerMediaTemplateContent shareMessengerMediaTemplateContent) {
        if (amw.a(shareMessengerMediaTemplateContent.k)) {
            throw new FacebookException("Must specify Page Id for ShareMessengerMediaTemplateContent");
        } else if (shareMessengerMediaTemplateContent.c != null || !amw.a(shareMessengerMediaTemplateContent.b)) {
            a(shareMessengerMediaTemplateContent.d);
        } else {
            throw new FacebookException("Must specify either attachmentId or mediaURL for ShareMessengerMediaTemplateContent");
        }
    }
}
