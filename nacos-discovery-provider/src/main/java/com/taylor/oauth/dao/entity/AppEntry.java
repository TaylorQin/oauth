package com.taylor.oauth.dao.entity;

public class AppEntry {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column openapi_auth.id
     *
     * @mbg.generated Sun Jan 31 16:29:55 CST 2021
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column openapi_auth.app_key
     *
     * @mbg.generated Sun Jan 31 16:29:55 CST 2021
     */
    private String appKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column openapi_auth.app_secret
     *
     * @mbg.generated Sun Jan 31 16:29:55 CST 2021
     */
    private String appSecret;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column openapi_auth.app_name
     *
     * @mbg.generated Sun Jan 31 16:29:55 CST 2021
     */
    private String appName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column openapi_auth.access_token
     *
     * @mbg.generated Sun Jan 31 16:29:55 CST 2021
     */
    private String accessToken;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column openapi_auth.disabled
     *
     * @mbg.generated Sun Jan 31 16:29:55 CST 2021
     */
    private String disabled;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column openapi_auth.id
     *
     * @return the value of openapi_auth.id
     *
     * @mbg.generated Sun Jan 31 16:29:55 CST 2021
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column openapi_auth.id
     *
     * @param id the value for openapi_auth.id
     *
     * @mbg.generated Sun Jan 31 16:29:55 CST 2021
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column openapi_auth.app_key
     *
     * @return the value of openapi_auth.app_key
     *
     * @mbg.generated Sun Jan 31 16:29:55 CST 2021
     */
    public String getAppKey() {
        return appKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column openapi_auth.app_key
     *
     * @param appKey the value for openapi_auth.app_key
     *
     * @mbg.generated Sun Jan 31 16:29:55 CST 2021
     */
    public void setAppKey(String appKey) {
        this.appKey = appKey == null ? null : appKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column openapi_auth.app_secret
     *
     * @return the value of openapi_auth.app_secret
     *
     * @mbg.generated Sun Jan 31 16:29:55 CST 2021
     */
    public String getAppSecret() {
        return appSecret;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column openapi_auth.app_secret
     *
     * @param appSecret the value for openapi_auth.app_secret
     *
     * @mbg.generated Sun Jan 31 16:29:55 CST 2021
     */
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret == null ? null : appSecret.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column openapi_auth.app_name
     *
     * @return the value of openapi_auth.app_name
     *
     * @mbg.generated Sun Jan 31 16:29:55 CST 2021
     */
    public String getAppName() {
        return appName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column openapi_auth.app_name
     *
     * @param appName the value for openapi_auth.app_name
     *
     * @mbg.generated Sun Jan 31 16:29:55 CST 2021
     */
    public void setAppName(String appName) {
        this.appName = appName == null ? null : appName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column openapi_auth.access_token
     *
     * @return the value of openapi_auth.access_token
     *
     * @mbg.generated Sun Jan 31 16:29:55 CST 2021
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column openapi_auth.access_token
     *
     * @param accessToken the value for openapi_auth.access_token
     *
     * @mbg.generated Sun Jan 31 16:29:55 CST 2021
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken == null ? null : accessToken.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column openapi_auth.disabled
     *
     * @return the value of openapi_auth.disabled
     *
     * @mbg.generated Sun Jan 31 16:29:55 CST 2021
     */
    public String getDisabled() {
        return disabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column openapi_auth.disabled
     *
     * @param disabled the value for openapi_auth.disabled
     *
     * @mbg.generated Sun Jan 31 16:29:55 CST 2021
     */
    public void setDisabled(String disabled) {
        this.disabled = disabled == null ? null : disabled.trim();
    }
}