package defpackage;

/* renamed from: vi reason: default package */
public final class vi {
    public vp a;
    private Boolean b = null;
    private boolean c = false;

    /* access modifiers changed from: 0000 */
    public boolean a(String str) {
        if (this.a != null) {
            return true;
        }
        if (str != null) {
            vh.a().d("Adjust not initialized, but %s saved for launch", str);
        } else {
            vh.a().f("Adjust not initialized correctly", new Object[0]);
        }
        return false;
    }
}
