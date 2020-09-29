package defpackage;

import com.spotify.android.glue.patterns.contextmenu.model.ContextMenuViewModel;
import java.util.Map;

/* renamed from: mew reason: default package */
public final class mew implements ovn<tvw, who<jor<ovg>>> {
    private final mej a;
    private final a b;

    public mew(mej mej, a aVar) {
        this.a = mej;
        this.b = aVar;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ ContextMenuViewModel a(ovg ovg, ContextMenuViewModel contextMenuViewModel) {
        Map f = ovg.f();
        String str = "rank";
        if (!f.containsKey(str)) {
            return contextMenuViewModel;
        }
        contextMenuViewModel.d = this.a.a(Integer.parseInt((String) fbp.a(f.get(str))));
        return contextMenuViewModel;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jor a(who who) {
        return new $$Lambda$mew$dsZi31Ndr98p7XCTinQLYclXaUQ(this, who);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ jpe a(who who, ovg ovg) {
        jpe onCreateContextMenu = ((jor) who.get()).onCreateContextMenu(ovg);
        $$Lambda$mew$mRX0LtlS22cCJN_wi__yeVCn_w4 r0 = new $$Lambda$mew$mRX0LtlS22cCJN_wi__yeVCn_w4(this, ovg);
        onCreateContextMenu.c.c = (xiy) fbp.a(r0);
        return onCreateContextMenu;
    }

    public final /* bridge */ /* synthetic */ ovm a(Object obj, Object obj2) {
        return this.b.a((tvw) obj, new $$Lambda$mew$LWc0pgABs55oinMuVBL4sZnaQA(this, (who) obj2));
    }
}
