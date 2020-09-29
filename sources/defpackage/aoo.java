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
/* renamed from: aoo reason: default package */
public final class aoo extends amo<aon, Object> {
    private static final int e = RequestCodeOffset.Like.a();

    /* renamed from: aoo$a */
    class a extends defpackage.amo.a {
        private a() {
            super();
        }

        /* synthetic */ a(aoo aoo, byte b) {
            this();
        }

        public final /* synthetic */ amh a(Object obj) {
            final aon aon = (aon) obj;
            amh c = aoo.this.c();
            amn.a(c, (defpackage.amn.a) new defpackage.amn.a() {
                public final Bundle a() {
                    return aoo.a(aon);
                }

                public final Bundle b() {
                    Log.e("LikeDialog", "Attempting to present the Like Dialog with an outdated Facebook app on the device");
                    return new Bundle();
                }
            }, LikeDialogFeature.LIKE_DIALOG);
            return c;
        }

        public final /* bridge */ /* synthetic */ boolean a(Object obj, boolean z) {
            return false;
        }
    }

    /* renamed from: aoo$b */
    class b extends defpackage.amo.a {
        private b() {
            super();
        }

        /* synthetic */ b(aoo aoo, byte b) {
            this();
        }

        public final /* synthetic */ amh a(Object obj) {
            aon aon = (aon) obj;
            amh c = aoo.this.c();
            Bundle a2 = aoo.a(aon);
            amm f = LikeDialogFeature.LIKE_DIALOG;
            anl.b(akq.g());
            anl.a(akq.g());
            String name = f.name();
            defpackage.amu.a a3 = amu.a(akq.k(), f.a(), f.name());
            Uri uri = a3 != null ? a3.c : null;
            if (uri != null) {
                Bundle a4 = ani.a(c.a.toString(), anf.a(), a2);
                if (a4 != null) {
                    Uri a5 = uri.isRelative() ? ank.a(ani.a(), uri.toString(), a4) : ank.a(uri.getAuthority(), uri.getPath(), a4);
                    Bundle bundle = new Bundle();
                    bundle.putString("url", a5.toString());
                    bundle.putBoolean("is_fallback", true);
                    Intent intent = new Intent();
                    anf.a(intent, c.a.toString(), f.a(), anf.a(), bundle);
                    intent.setClass(akq.g(), FacebookActivity.class);
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

        public final /* bridge */ /* synthetic */ boolean a(Object obj, boolean z) {
            return false;
        }
    }

    static /* synthetic */ Bundle a(aon aon) {
        Bundle bundle = new Bundle();
        bundle.putString("object_id", aon.a);
        bundle.putString("object_type", aon.b);
        return bundle;
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

    public final List<defpackage.amo.a> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a(this, 0));
        arrayList.add(new b(this, 0));
        return arrayList;
    }

    public final amh c() {
        return new amh(this.d);
    }
}
