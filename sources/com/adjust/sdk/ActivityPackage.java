package com.adjust.sdk;

import java.io.ObjectInputStream;
import java.io.ObjectInputStream.GetField;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class ActivityPackage implements Serializable {
    private static final ObjectStreamField[] serialPersistentFields = {new ObjectStreamField("path", String.class), new ObjectStreamField("clientSdk", String.class), new ObjectStreamField("parameters", Map.class), new ObjectStreamField("activityKind", ActivityKind.class), new ObjectStreamField("suffix", String.class), new ObjectStreamField("callbackParameters", Map.class), new ObjectStreamField("partnerParameters", Map.class)};
    private static final long serialVersionUID = -35935556512024097L;
    private transient int a;
    public ActivityKind activityKind = ActivityKind.UNKNOWN;
    public Map<String, String> callbackParameters;
    public long clickTimeInMilliseconds;
    public long clickTimeInSeconds;
    public String clientSdk;
    public long installBeginTimeInSeconds;
    public Map<String, String> parameters;
    public Map<String, String> partnerParameters;
    public String path;
    public int retries;
    public String suffix;

    public final int a() {
        this.retries++;
        return this.retries;
    }

    public ActivityPackage(ActivityKind activityKind2) {
        this.activityKind = activityKind2;
    }

    public String toString() {
        return wm.a("%s%s", this.activityKind.toString(), this.suffix);
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        sb.append(wm.a("Path:      %s\n", this.path));
        sb.append(wm.a("ClientSdk: %s\n", this.clientSdk));
        if (this.parameters != null) {
            sb.append("Parameters:");
            TreeMap treeMap = new TreeMap(this.parameters);
            List asList = Arrays.asList(new String[]{"app_secret", "secret_id", "event_callback_id"});
            for (Entry entry : treeMap.entrySet()) {
                String str = (String) entry.getKey();
                if (!asList.contains(str)) {
                    sb.append(wm.a("\n\t%-16s %s", str, entry.getValue()));
                }
            }
        }
        return sb.toString();
    }

    public final String c() {
        return wm.a("Failed to track %s%s", this.activityKind.toString(), this.suffix);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
    }

    private void readObject(ObjectInputStream objectInputStream) {
        GetField readFields = objectInputStream.readFields();
        this.path = wm.a(readFields, "path", (String) null);
        this.clientSdk = wm.a(readFields, "clientSdk", (String) null);
        this.parameters = (Map) wm.a(readFields, "parameters", null);
        this.activityKind = (ActivityKind) wm.a(readFields, "activityKind", ActivityKind.UNKNOWN);
        this.suffix = wm.a(readFields, "suffix", (String) null);
        this.callbackParameters = (Map) wm.a(readFields, "callbackParameters", null);
        this.partnerParameters = (Map) wm.a(readFields, "partnerParameters", null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActivityPackage activityPackage = (ActivityPackage) obj;
        return wm.a(this.path, activityPackage.path) && wm.a(this.clientSdk, activityPackage.clientSdk) && wm.a((Object) this.parameters, (Object) activityPackage.parameters) && wm.a((Enum) this.activityKind, (Enum) activityPackage.activityKind) && wm.a(this.suffix, activityPackage.suffix) && wm.a((Object) this.callbackParameters, (Object) activityPackage.callbackParameters) && wm.a((Object) this.partnerParameters, (Object) activityPackage.partnerParameters);
    }

    public int hashCode() {
        if (this.a == 0) {
            this.a = 17;
            this.a = (this.a * 37) + wm.a(this.path);
            this.a = (this.a * 37) + wm.a(this.clientSdk);
            this.a = (this.a * 37) + wm.a((Object) this.parameters);
            this.a = (this.a * 37) + wm.a((Enum) this.activityKind);
            this.a = (this.a * 37) + wm.a(this.suffix);
            this.a = (this.a * 37) + wm.a((Object) this.callbackParameters);
            this.a = (this.a * 37) + wm.a((Object) this.partnerParameters);
        }
        return this.a;
    }
}
