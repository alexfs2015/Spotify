package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.CallbackManagerImpl.RequestCodeOffset;
import com.facebook.share.internal.MessageDialogFeature;
import com.facebook.share.model.ShareMessengerGenericTemplateContent;
import com.facebook.share.model.ShareMessengerMediaTemplateContent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aps reason: default package */
public final class aps extends amo<apb, defpackage.aoh.a> implements aoh {
    private static final int e = RequestCodeOffset.Message.a();
    private boolean f = false;

    /* renamed from: aps$a */
    class a extends defpackage.amo.a {
        private a() {
            super();
        }

        /* synthetic */ a(aps aps, byte b) {
            this();
        }

        public final /* synthetic */ amh a(Object obj) {
            final apb apb = (apb) obj;
            aou.a(apb, aou.a());
            final amh c = aps.this.c();
            aps.a(aps.this.a(), apb, c);
            amn.a(c, (defpackage.amn.a) new defpackage.amn.a(false) {
                public final Bundle a() {
                    return aor.a(c.a, apb, false);
                }

                public final Bundle b() {
                    return aok.a(c.a, apb, false);
                }
            }, aps.c(apb.getClass()));
            return c;
        }

        public final /* synthetic */ boolean a(Object obj, boolean z) {
            apb apb = (apb) obj;
            return apb != null && aps.a(apb.getClass());
        }
    }

    private aps(Activity activity) {
        super(activity, e);
        aow.a(e);
    }

    public aps(Activity activity, int i) {
        super(activity, i);
        aow.a(i);
    }

    public static void a(Activity activity, apb apb) {
        new aps(activity).a(apb);
    }

    static /* synthetic */ void a(Context context, apb apb, amh amh) {
        amm c = c(apb.getClass());
        String str = c == MessageDialogFeature.MESSAGE_DIALOG ? "status" : c == MessageDialogFeature.MESSENGER_GENERIC_TEMPLATE ? "GenericTemplate" : c == MessageDialogFeature.MESSENGER_MEDIA_TEMPLATE ? "MediaTemplate" : c == MessageDialogFeature.MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE ? "OpenGraphMusicTemplate" : "unknown";
        alk alk = new alk(context);
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_content_type", str);
        bundle.putString("fb_share_dialog_content_uuid", amh.a.toString());
        bundle.putString("fb_share_dialog_content_page_id", apb.k);
        alk.b("fb_messenger_share_dialog_show", bundle);
    }

    public static boolean a(Class<? extends apb> cls) {
        amm c = c(cls);
        return c != null && amn.a(c);
    }

    /* access modifiers changed from: private */
    public static amm c(Class<? extends apb> cls) {
        if (apd.class.isAssignableFrom(cls)) {
            return MessageDialogFeature.MESSAGE_DIALOG;
        }
        if (ShareMessengerGenericTemplateContent.class.isAssignableFrom(cls)) {
            return MessageDialogFeature.MESSENGER_GENERIC_TEMPLATE;
        }
        if (aph.class.isAssignableFrom(cls)) {
            return MessageDialogFeature.MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE;
        }
        if (ShareMessengerMediaTemplateContent.class.isAssignableFrom(cls)) {
            return MessageDialogFeature.MESSENGER_MEDIA_TEMPLATE;
        }
        return null;
    }

    public final List<defpackage.amo.a> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a(this, 0));
        return arrayList;
    }

    public final amh c() {
        return new amh(this.d);
    }
}
