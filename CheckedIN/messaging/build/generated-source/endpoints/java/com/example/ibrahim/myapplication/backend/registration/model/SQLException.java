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
 * Model definition for SQLException.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the registration. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SQLException extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Throwable cause;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer errorCode;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String localizedMessage;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String message;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SQLException nextException;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sqlstate;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<StackTraceElement> stackTrace;

  static {
    // hack to force ProGuard to consider StackTraceElement used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(StackTraceElement.class);
  }

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Throwable> suppressed;

  /**
   * @return value or {@code null} for none
   */
  public Throwable getCause() {
    return cause;
  }

  /**
   * @param cause cause or {@code null} for none
   */
  public SQLException setCause(Throwable cause) {
    this.cause = cause;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getErrorCode() {
    return errorCode;
  }

  /**
   * @param errorCode errorCode or {@code null} for none
   */
  public SQLException setErrorCode(java.lang.Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getLocalizedMessage() {
    return localizedMessage;
  }

  /**
   * @param localizedMessage localizedMessage or {@code null} for none
   */
  public SQLException setLocalizedMessage(java.lang.String localizedMessage) {
    this.localizedMessage = localizedMessage;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMessage() {
    return message;
  }

  /**
   * @param message message or {@code null} for none
   */
  public SQLException setMessage(java.lang.String message) {
    this.message = message;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public SQLException getNextException() {
    return nextException;
  }

  /**
   * @param nextException nextException or {@code null} for none
   */
  public SQLException setNextException(SQLException nextException) {
    this.nextException = nextException;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSqlstate() {
    return sqlstate;
  }

  /**
   * @param sqlstate sqlstate or {@code null} for none
   */
  public SQLException setSqlstate(java.lang.String sqlstate) {
    this.sqlstate = sqlstate;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<StackTraceElement> getStackTrace() {
    return stackTrace;
  }

  /**
   * @param stackTrace stackTrace or {@code null} for none
   */
  public SQLException setStackTrace(java.util.List<StackTraceElement> stackTrace) {
    this.stackTrace = stackTrace;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<Throwable> getSuppressed() {
    return suppressed;
  }

  /**
   * @param suppressed suppressed or {@code null} for none
   */
  public SQLException setSuppressed(java.util.List<Throwable> suppressed) {
    this.suppressed = suppressed;
    return this;
  }

  @Override
  public SQLException set(String fieldName, Object value) {
    return (SQLException) super.set(fieldName, value);
  }

  @Override
  public SQLException clone() {
    return (SQLException) super.clone();
  }

}
