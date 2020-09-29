package com.fasterxml.jackson.core;

import java.io.Serializable;

public class JsonLocation implements Serializable {
    public static final JsonLocation NA;
    private static final long serialVersionUID = 1;
    protected final int _columnNr;
    protected final int _lineNr;
    final transient Object _sourceRef;
    protected final long _totalBytes;
    protected final long _totalChars;

    static {
        JsonLocation jsonLocation = new JsonLocation(null, -1, -1, -1, -1);
        NA = jsonLocation;
    }

    public JsonLocation(Object obj, long j, int i, int i2) {
        this(obj, -1, j, i, i2);
    }

    public JsonLocation(Object obj, long j, long j2, int i, int i2) {
        this._sourceRef = obj;
        this._totalBytes = j;
        this._totalChars = j2;
        this._lineNr = i;
        this._columnNr = i2;
    }

    private int _append(StringBuilder sb, String str) {
        sb.append('\"');
        sb.append(str);
        sb.append('\"');
        return str.length();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.StringBuilder _appendSourceDesc(java.lang.StringBuilder r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6._sourceRef
            if (r0 != 0) goto L_0x000a
            java.lang.String r0 = "UNKNOWN"
            r7.append(r0)
            return r7
        L_0x000a:
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 == 0) goto L_0x0012
            r1 = r0
            java.lang.Class r1 = (java.lang.Class) r1
            goto L_0x0016
        L_0x0012:
            java.lang.Class r1 = r0.getClass()
        L_0x0016:
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = "java."
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L_0x0027
            java.lang.String r2 = r1.getSimpleName()
            goto L_0x0034
        L_0x0027:
            boolean r1 = r0 instanceof byte[]
            if (r1 == 0) goto L_0x002e
            java.lang.String r2 = "byte[]"
            goto L_0x0034
        L_0x002e:
            boolean r1 = r0 instanceof char[]
            if (r1 == 0) goto L_0x0034
            java.lang.String r2 = "char[]"
        L_0x0034:
            r1 = 40
            r7.append(r1)
            r7.append(r2)
            r1 = 41
            r7.append(r1)
            boolean r1 = r0 instanceof java.lang.CharSequence
            r2 = 500(0x1f4, float:7.0E-43)
            r3 = 0
            java.lang.String r4 = " chars"
            if (r1 == 0) goto L_0x0063
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r1 = r0.length()
            int r2 = java.lang.Math.min(r1, r2)
            java.lang.CharSequence r0 = r0.subSequence(r3, r2)
            java.lang.String r0 = r0.toString()
            int r0 = r6._append(r7, r0)
        L_0x0060:
            int r3 = r1 - r0
            goto L_0x0096
        L_0x0063:
            boolean r1 = r0 instanceof char[]
            if (r1 == 0) goto L_0x0078
            char[] r0 = (char[]) r0
            int r1 = r0.length
            java.lang.String r5 = new java.lang.String
            int r2 = java.lang.Math.min(r1, r2)
            r5.<init>(r0, r3, r2)
            int r0 = r6._append(r7, r5)
            goto L_0x0060
        L_0x0078:
            boolean r1 = r0 instanceof byte[]
            if (r1 == 0) goto L_0x0096
            byte[] r0 = (byte[]) r0
            int r1 = r0.length
            int r1 = java.lang.Math.min(r1, r2)
            java.lang.String r2 = new java.lang.String
            java.lang.String r4 = "UTF-8"
            java.nio.charset.Charset r4 = java.nio.charset.Charset.forName(r4)
            r2.<init>(r0, r3, r1, r4)
            r6._append(r7, r2)
            int r0 = r0.length
            int r3 = r0 - r1
            java.lang.String r4 = " bytes"
        L_0x0096:
            if (r3 <= 0) goto L_0x00a8
            java.lang.String r0 = "[truncated "
            r7.append(r0)
            r7.append(r3)
            r7.append(r4)
            r0 = 93
            r7.append(r0)
        L_0x00a8:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.JsonLocation._appendSourceDesc(java.lang.StringBuilder):java.lang.StringBuilder");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof JsonLocation)) {
            return false;
        }
        JsonLocation jsonLocation = (JsonLocation) obj;
        Object obj2 = this._sourceRef;
        if (obj2 == null) {
            if (jsonLocation._sourceRef != null) {
                return false;
            }
        } else if (!obj2.equals(jsonLocation._sourceRef)) {
            return false;
        }
        return this._lineNr == jsonLocation._lineNr && this._columnNr == jsonLocation._columnNr && this._totalChars == jsonLocation._totalChars && getByteOffset() == jsonLocation.getByteOffset();
    }

    public long getByteOffset() {
        return this._totalBytes;
    }

    public int hashCode() {
        Object obj = this._sourceRef;
        return ((((obj == null ? 1 : obj.hashCode()) ^ this._lineNr) + this._columnNr) ^ ((int) this._totalChars)) + ((int) this._totalBytes);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(80);
        sb.append("[Source: ");
        _appendSourceDesc(sb);
        sb.append("; line: ");
        sb.append(this._lineNr);
        sb.append(", column: ");
        sb.append(this._columnNr);
        sb.append(']');
        return sb.toString();
    }
}
