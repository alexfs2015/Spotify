package defpackage;

/* renamed from: pf reason: default package */
public final class pf {
    public static String a(String str) {
        StringBuilder sb = new StringBuilder("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
        sb.append(str);
        sb.append("')");
        return sb.toString();
    }
}
