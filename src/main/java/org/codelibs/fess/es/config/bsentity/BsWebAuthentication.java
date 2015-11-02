/*
 * Copyright 2012-2015 CodeLibs Project and the Others.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.codelibs.fess.es.config.bsentity;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.codelibs.fess.es.config.allcommon.EsAbstractEntity;
import org.codelibs.fess.es.config.bsentity.dbmeta.WebAuthenticationDbm;

/**
 * ${table.comment}
 * @author ESFlute (using FreeGen)
 */
public class BsWebAuthentication extends EsAbstractEntity {

    private static final long serialVersionUID = 1L;
    protected static final Class<?> suppressUnusedImportLocalDateTime = LocalDateTime.class;

    @Override
    public WebAuthenticationDbm asDBMeta() {
        return WebAuthenticationDbm.getInstance();
    }

    @Override
    public String asTableDbName() {
        return "web_authentication";
    }

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** authRealm */
    protected String authRealm;

    /** createdBy */
    protected String createdBy;

    /** createdTime */
    protected Long createdTime;

    /** hostname */
    protected String hostname;

    /** parameters */
    protected String parameters;

    /** password */
    protected String password;

    /** port */
    protected Integer port;

    /** protocolScheme */
    protected String protocolScheme;

    /** updatedBy */
    protected String updatedBy;

    /** updatedTime */
    protected Long updatedTime;

    /** username */
    protected String username;

    /** webConfigId */
    protected String webConfigId;

    // [Referrers] *comment only

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public String getAuthRealm() {
        checkSpecifiedProperty("authRealm");
        return authRealm;
    }

    public void setAuthRealm(String value) {
        registerModifiedProperty("authRealm");
        this.authRealm = value;
    }

    public String getCreatedBy() {
        checkSpecifiedProperty("createdBy");
        return createdBy;
    }

    public void setCreatedBy(String value) {
        registerModifiedProperty("createdBy");
        this.createdBy = value;
    }

    public Long getCreatedTime() {
        checkSpecifiedProperty("createdTime");
        return createdTime;
    }

    public void setCreatedTime(Long value) {
        registerModifiedProperty("createdTime");
        this.createdTime = value;
    }

    public String getHostname() {
        checkSpecifiedProperty("hostname");
        return hostname;
    }

    public void setHostname(String value) {
        registerModifiedProperty("hostname");
        this.hostname = value;
    }

    public String getId() {
        checkSpecifiedProperty("id");
        return asDocMeta().id();
    }

    public void setId(String value) {
        registerModifiedProperty("id");
        asDocMeta().id(value);
    }

    public String getParameters() {
        checkSpecifiedProperty("parameters");
        return parameters;
    }

    public void setParameters(String value) {
        registerModifiedProperty("parameters");
        this.parameters = value;
    }

    public String getPassword() {
        checkSpecifiedProperty("password");
        return password;
    }

    public void setPassword(String value) {
        registerModifiedProperty("password");
        this.password = value;
    }

    public Integer getPort() {
        checkSpecifiedProperty("port");
        return port;
    }

    public void setPort(Integer value) {
        registerModifiedProperty("port");
        this.port = value;
    }

    public String getProtocolScheme() {
        checkSpecifiedProperty("protocolScheme");
        return protocolScheme;
    }

    public void setProtocolScheme(String value) {
        registerModifiedProperty("protocolScheme");
        this.protocolScheme = value;
    }

    public String getUpdatedBy() {
        checkSpecifiedProperty("updatedBy");
        return updatedBy;
    }

    public void setUpdatedBy(String value) {
        registerModifiedProperty("updatedBy");
        this.updatedBy = value;
    }

    public Long getUpdatedTime() {
        checkSpecifiedProperty("updatedTime");
        return updatedTime;
    }

    public void setUpdatedTime(Long value) {
        registerModifiedProperty("updatedTime");
        this.updatedTime = value;
    }

    public String getUsername() {
        checkSpecifiedProperty("username");
        return username;
    }

    public void setUsername(String value) {
        registerModifiedProperty("username");
        this.username = value;
    }

    public String getWebConfigId() {
        checkSpecifiedProperty("webConfigId");
        return webConfigId;
    }

    public void setWebConfigId(String value) {
        registerModifiedProperty("webConfigId");
        this.webConfigId = value;
    }

    @Override
    public Map<String, Object> toSource() {
        Map<String, Object> sourceMap = new HashMap<>();
        if (authRealm != null) {
            sourceMap.put("authRealm", authRealm);
        }
        if (createdBy != null) {
            sourceMap.put("createdBy", createdBy);
        }
        if (createdTime != null) {
            sourceMap.put("createdTime", createdTime);
        }
        if (hostname != null) {
            sourceMap.put("hostname", hostname);
        }
        if (asDocMeta().id() != null) {
            sourceMap.put("id", asDocMeta().id());
        }
        if (parameters != null) {
            sourceMap.put("parameters", parameters);
        }
        if (password != null) {
            sourceMap.put("password", password);
        }
        if (port != null) {
            sourceMap.put("port", port);
        }
        if (protocolScheme != null) {
            sourceMap.put("protocolScheme", protocolScheme);
        }
        if (updatedBy != null) {
            sourceMap.put("updatedBy", updatedBy);
        }
        if (updatedTime != null) {
            sourceMap.put("updatedTime", updatedTime);
        }
        if (username != null) {
            sourceMap.put("username", username);
        }
        if (webConfigId != null) {
            sourceMap.put("webConfigId", webConfigId);
        }
        return sourceMap;
    }
}