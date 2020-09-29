package com.fasterxml.jackson.databind.jsontype.impl;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SubTypeValidator {
    protected static final Set<String> DEFAULT_NO_DESER_CLASS_NAMES;
    private static final SubTypeValidator instance = new SubTypeValidator();
    protected Set<String> _cfgIllegalClassNames = DEFAULT_NO_DESER_CLASS_NAMES;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("org.apache.commons.collections.functors.InvokerTransformer");
        hashSet.add("org.apache.commons.collections.functors.InstantiateTransformer");
        hashSet.add("org.apache.commons.collections4.functors.InvokerTransformer");
        hashSet.add("org.apache.commons.collections4.functors.InstantiateTransformer");
        hashSet.add("org.codehaus.groovy.runtime.ConvertedClosure");
        hashSet.add("org.codehaus.groovy.runtime.MethodClosure");
        hashSet.add("org.springframework.beans.factory.ObjectFactory");
        hashSet.add("com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl");
        hashSet.add("org.apache.xalan.xsltc.trax.TemplatesImpl");
        hashSet.add("com.sun.rowset.JdbcRowSetImpl");
        hashSet.add("java.util.logging.FileHandler");
        hashSet.add("java.rmi.server.UnicastRemoteObject");
        hashSet.add("org.springframework.beans.factory.config.PropertyPathFactoryBean");
        hashSet.add("org.apache.tomcat.dbcp.dbcp2.BasicDataSource");
        hashSet.add("com.sun.org.apache.bcel.internal.util.ClassLoader");
        hashSet.add("org.hibernate.jmx.StatisticsService");
        hashSet.add("org.apache.ibatis.datasource.jndi.JndiDataSourceFactory");
        hashSet.add("org.apache.ibatis.parsing.XPathParser");
        hashSet.add("jodd.db.connection.DataSourceConnectionProvider");
        hashSet.add("oracle.jdbc.connector.OracleManagedConnectionFactory");
        hashSet.add("oracle.jdbc.rowset.OracleJDBCRowSet");
        DEFAULT_NO_DESER_CLASS_NAMES = Collections.unmodifiableSet(hashSet);
    }

    protected SubTypeValidator() {
    }

    public static SubTypeValidator instance() {
        return instance;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        if (r0.endsWith("DataSource") != false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void validateSubType(com.fasterxml.jackson.databind.DeserializationContext r4, com.fasterxml.jackson.databind.JavaType r5, com.fasterxml.jackson.databind.BeanDescription r6) {
        /*
            r3 = this;
            java.lang.Class r5 = r5.getRawClass()
            java.lang.String r0 = r5.getName()
            java.util.Set<java.lang.String> r1 = r3._cfgIllegalClassNames
            boolean r1 = r1.contains(r0)
            if (r1 != 0) goto L_0x004f
            boolean r1 = r5.isInterface()
            if (r1 != 0) goto L_0x004e
            java.lang.String r1 = "org.springframework."
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L_0x003e
        L_0x001e:
            if (r5 == 0) goto L_0x003d
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            if (r5 == r1) goto L_0x003d
            java.lang.String r1 = r5.getSimpleName()
            java.lang.String r2 = "AbstractPointcutAdvisor"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L_0x004f
            java.lang.String r2 = "AbstractApplicationContext"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x004f
            java.lang.Class r5 = r5.getSuperclass()
            goto L_0x001e
        L_0x003d:
            return
        L_0x003e:
            java.lang.String r5 = "com.mchange.v2.c3p0."
            boolean r5 = r0.startsWith(r5)
            if (r5 == 0) goto L_0x004e
            java.lang.String r5 = "DataSource"
            boolean r5 = r0.endsWith(r5)
            if (r5 != 0) goto L_0x004f
        L_0x004e:
            return
        L_0x004f:
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r1 = 0
            r5[r1] = r0
            java.lang.String r0 = "Illegal type (%s) to deserialize: prevented for security reasons"
            r4.reportBadTypeDefinition(r6, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator.validateSubType(com.fasterxml.jackson.databind.DeserializationContext, com.fasterxml.jackson.databind.JavaType, com.fasterxml.jackson.databind.BeanDescription):void");
    }
}
