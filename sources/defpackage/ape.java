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

/* renamed from: ape reason: default package */
public final class ape extends ama<aon, defpackage.ant.a> implements ant {
    private static final int e = RequestCodeOffset.Message.a();
    private boolean f = false;

    /* renamed from: ape$a */
    class a extends defpackage.ama.a {
        private a() {
            super();
        }

        /* synthetic */ a(ape ape, byte b) {
            this();
        }

        public final /* synthetic */ alt a(Object obj) {
            final aon aon = (aon) obj;
            aog.a(aon, aog.a());
            final alt c = ape.this.c();
            ape.a(ape.this.a(), aon, c);
            alz.a(c, (defpackage.alz.a) new defpackage.alz.a(false) {
                public final Bundle a() {
                    return aod.a(c.a, aon, false);
                }

                public final Bundle b() {
                    return anw.a(c.a, aon, false);
                }
            }, ape.c(aon.getClass()));
            return c;
        }

        public final /* synthetic */ boolean a(Object obj, boolean z) {
            aon aon = (aon) obj;
            return aon != null && ape.a(aon.getClass());
        }
    }

    public static void a(Activity activity, aon aon) {
        new ape(activity).a(aon);
    }

    public static boolean a(Class<? extends aon> cls) {
        aly c = c(cls);
        return c != null && alz.a(c);
    }

    private ape(Activity activity) {
        super(activity, e);
        aoi.a(e);
    }

    public ape(Activity activity, int i) {
        super(activity, i);
        aoi.a(i);
    }

    public final alt c() {
        return new alt(this.d);
    }

    public final List<defpackage.ama.a> b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a(this, 0));
        return arrayList;
    }

    /* access modifiers changed from: private */
    public static aly c(Class<? extends aon> cls) {
        if (aop.class.isAssignableFrom(cls)) {
            return MessageDialogFeature.MESSAGE_DIALOG;
        }
        if (ShareMessengerGenericTemplateContent.class.isAssignableFrom(cls)) {
            return MessageDialogFeature.MESSENGER_GENERIC_TEMPLATE;
        }
        if (aot.class.isAssignableFrom(cls)) {
            return MessageDialogFeature.MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE;
        }
        if (ShareMessengerMediaTemplateContent.class.isAssignableFrom(cls)) {
            return MessageDialogFeature.MESSENGER_MEDIA_TEMPLATE;
        }
        return null;
    }

    static /* synthetic */ void a(Context context, aon aon, alt alt) {
        aly c = c(aon.getClass());
        String str = c == MessageDialogFeature.MESSAGE_DIALOG ? "status" : c == MessageDialogFeature.MESSENGER_GENERIC_TEMPLATE ? "GenericTemplate" : c == MessageDialogFeature.MESSENGER_MEDIA_TEMPLATE ? "MediaTemplate" : c == MessageDialogFeature.MESSENGER_OPEN_GRAPH_MUSIC_TEMPLATE ? "OpenGraphMusicTemplate" : "unknown";
        akw akw = new akw(context);
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_content_type", str);
        bundle.putString("fb_share_dialog_content_uuid", alt.a.toString());
        bundle.putString("fb_share_dialog_content_page_id", aon.k);
        akw.b("fb_messenger_share_dialog_show", bundle);
    }
}
