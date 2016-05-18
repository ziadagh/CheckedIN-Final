/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/google/apis-client-generator/
 * (build: 2016-05-04 15:59:39 UTC)
 * on 2016-05-15 at 13:56:31 UTC 
 * Modify at your own risk.
 */

package com.example.ibrahim.myapplication.backend.registration.model;

/**
 * Model definition for Connection.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the registration. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Connection extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autoCommit;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String catalog;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JsonMap clientInfo;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean closed;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer holdability;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DatabaseMetaData metaData;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer networkTimeout;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean readOnly;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String savepoint;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String schema;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer transactionIsolation;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JsonMap typeMap;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SQLWarning warnings;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutoCommit() {
    return autoCommit;
  }

  /**
   * @param autoCommit autoCommit or {@code null} for none
   */
  public Connection setAutoCommit(java.lang.Boolean autoCommit) {
    this.autoCommit = autoCommit;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCatalog() {
    return catalog;
  }

  /**
   * @param catalog catalog or {@code null} for none
   */
  public Connection setCatalog(java.lang.String catalog) {
    this.catalog = catalog;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public JsonMap getClientInfo() {
    return clientInfo;
  }

  /**
   * @param clientInfo clientInfo or {@code null} for none
   */
  public Connection setClientInfo(JsonMap clientInfo) {
    this.clientInfo = clientInfo;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getClosed() {
    return closed;
  }

  /**
   * @param closed closed or {@code null} for none
   */
  public Connection setClosed(java.lang.Boolean closed) {
    this.closed = closed;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getHoldability() {
    return holdability;
  }

  /**
   * @param holdability holdability or {@code null} for none
   */
  public Connection setHoldability(java.lang.Integer holdability) {
    this.holdability = holdability;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public DatabaseMetaData getMetaData() {
    return metaData;
  }

  /**
   * @param metaData metaData or {@code null} for none
   */
  public Connection setMetaData(DatabaseMetaData metaData) {
    this.metaData = metaData;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNetworkTimeout() {
    return networkTimeout;
  }

  /**
   * @param networkTimeout networkTimeout or {@code null} for none
   */
  public Connection setNetworkTimeout(java.lang.Integer networkTimeout) {
    this.networkTimeout = networkTimeout;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReadOnly() {
    return readOnly;
  }

  /**
   * @param readOnly readOnly or {@code null} for none
   */
  public Connection setReadOnly(java.lang.Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSavepoint() {
    return savepoint;
  }

  /**
   * @param savepoint savepoint or {@code null} for none
   */
  public Connection setSavepoint(java.lang.String savepoint) {
    this.savepoint = savepoint;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSchema() {
    return schema;
  }

  /**
   * @param schema schema or {@code null} for none
   */
  public Connection setSchema(java.lang.String schema) {
    this.schema = schema;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTransactionIsolation() {
    return transactionIsolation;
  }

  /**
   * @param transactionIsolation transactionIsolation or {@code null} for none
   */
  public Connection setTransactionIsolation(java.lang.Integer transactionIsolation) {
    this.transactionIsolation = transactionIsolation;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public JsonMap getTypeMap() {
    return typeMap;
  }

  /**
   * @param typeMap typeMap or {@code null} for none
   */
  public Connection setTypeMap(JsonMap typeMap) {
    this.typeMap = typeMap;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public SQLWarning getWarnings() {
    return warnings;
  }

  /**
   * @param warnings warnings or {@code null} for none
   */
  public Connection setWarnings(SQLWarning warnings) {
    this.warnings = warnings;
    return this;
  }

  @Override
  public Connection set(String fieldName, Object value) {
    return (Connection) super.set(fieldName, value);
  }

  @Override
  public Connection clone() {
    return (Connection) super.clone();
  }

}
