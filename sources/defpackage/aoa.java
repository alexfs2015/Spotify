package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.share.internal.LikeDialogFeature;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* renamed from: aoa reason: default package */
public final class aoa extends ama<anz, Object> {
    private static final int e = RequestCodeOffset.Like.a();

    /* renamed from: aoa$a */
    class a extends defpackage.ama.a {
        public final /* bridge */ /* synthetic */ boolean a(Object obj, boolean z) {
            return false;
        }

        private a() {
            super();
        }

        /* synthetic */ a(aoa aoa, byte b) {
            this();
        }

        public final /* synthetic */ alt a(Object obj) {
            final anz anz = (anz) obj;
            alt c = aoa.this.c();
            alz.a(c, (defpackage.alz.a) new defpackage.alz.a() {
                public final Bundle a() {
                    return aoa.a(anz);
                }

                public final Bundle b() {
                    Log.e("LikeDialog", "Attempting to present the Like Dialog with an outdated Facebook app on the device");
                    return new Bundle();
                }
            }, LikeDialogFeature.LIKE_DIALOG);
            return c;
        }
    }

    /* renamed from: aoa$b */
    class b extends defpackage.ama.a {
        public final /* bridge */ /* synthetic */ boolean a(Object obj, boolean z) {
            return false;
        }

        private b() {
            super();
        }

        /* synthetic */ b(aoa aoa, byte b) {
            this();
        }

        public final /* synthetic */ alt a(Object obj) {
            Uri uri;
            Uri uri2;
            anz anz = (anz) obj;
            alt c = aoa.this.c();
            Bundle a2 = aoa.a(anz);
            aly f = LikeDialogFeature.LIKE_DIALOG;
            amx.b(akc.g());
            amx.a(akc.g());
            String name = f.name();
            String name2 = f.name();
            defpackage.amg.a a3 = amg.a(akc.k(), f.a(), name2);
            if (a3 != null) {
                uri = a3.c;
            } else {
                uri = null;
            }
            if (uri != null) {
                Bundle a4 = amu.a(c.a.toString(), amr.a(), a2);
                if (a4 != null) {
                    if (uri.isRelative()) {
                        uri2 = amw.a(amu.a(), uri.toString(), a4);
                    } else {
                        uri2 = amw.a(uri.getAuthority(), uri.getPath(), a4);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("url", uri2.toString());
                    bundle.putBoolean("is_fallback", true);
                    Intent intent = new Intent();
                    amr.a(intent, c.a.toString(), f.a(), amr.a(), bundle);
                    intent.setClass(akc.g(), FacebookActivity.class);
                    intent.setAction("FacebookDialogFragment");
                    c.b = intent;
                    return c;
                }
                throw new FacebookException("Unable to fetch the app's key-hash");
            }
            StringBuilder sb = new StringBuilder("Unable to fetch the Url for the DialogFeature : '");
            sb.append(name);
            sb.append("'");
            throw new FacebookException(sb.toString());
        }
    }

    @Deprecated
    public static boolean d() {
        return false;
    }

    @Deprecated
    public static boolean e() {
        return false;
    }

    @Deprecated
    public final /* bridge */ /* synthetic */ void a(Object obj) {
    }

    public final alt c() {
        return new alt(this.d);
    }

    public final List<defpackage.ama.a> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a(this, 0));
        arrayList.add(new b(this, 0));
        return arrayList;
    }

    static /* synthetic */ Bundle a(anz anz) {
        Bundle bundle = new Bundle();
        bundle.putString("object_id", anz.a);
        bundle.putString("object_type", anz.b);
        return bundle;
    }
}
