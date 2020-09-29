package defpackage;

/* renamed from: pa reason: default package */
public final class pa {
    public static String a(String str) {
        StringBuilder sb = new StringBuilder("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '");
        sb.append(str);
        sb.append("')");
        return sb.toString();
    }
}
