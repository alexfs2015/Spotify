package defpackage;

import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import java.util.Map;

/* renamed from: mat reason: default package */
public final class mat implements ooh<tke, vti<jmf<ooa>>> {
    private final mag a;
    private final a b;

    public final /* bridge */ /* synthetic */ oog a(Object obj, Object obj2) {
        return this.b.a((tke) obj, new $$Lambda$mat$gy_jI9q85LOjV50WLvzoNh6tysA(this, (vti) obj2));
    }

    public mat(mag mag, a aVar) {
        this.a = mag;
        this.b = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jmf a(vti vti) {
        return new $$Lambda$mat$c7zZMDZZ_jx_QR9DhnUsqtJqCw(this, vti);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jms a(vti vti, ooa ooa) {
        jms onCreateContextMenu = ((jmf) vti.get()).onCreateContextMenu(ooa);
        $$Lambda$mat$_8w8MuGdDkVMubg30Md8ewmAri0 r0 = new $$Lambda$mat$_8w8MuGdDkVMubg30Md8ewmAri0(this, ooa);
        onCreateContextMenu.c.c = (wut) fay.a(r0);
        return onCreateContextMenu;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ContextMenuViewModel a(ooa ooa, ContextMenuViewModel contextMenuViewModel) {
        Map f = ooa.f();
        String str = "rank";
        if (!f.containsKey(str)) {
            return contextMenuViewModel;
        }
        contextMenuViewModel.d = this.a.a(Integer.parseInt((String) fay.a(f.get(str))));
        return contextMenuViewModel;
    }
}
