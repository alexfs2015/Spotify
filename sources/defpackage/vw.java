package defpackage;

/* renamed from: vw reason: default package */
public final class vw {
    public wd a;
    private Boolean b = null;
    private boolean c = false;

    /* access modifiers changed from: 0000 */
    public boolean a(String str) {
        if (this.a != null) {
            return true;
        }
        if (str != null) {
            vv.a().d("Adjust not initialized, but %s saved for launch", str);
        } else {
            vv.a().f("Adjust not initialized correctly", new Object[0]);
        }
        return false;
    }
}
